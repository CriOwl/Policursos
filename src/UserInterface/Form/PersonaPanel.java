package UserInterface.Form;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;

import BusinessLogic.PersonaBL;
import DataAccess.DTO.PersonaDTO;
import UserInterface.PoliCursoStyle;
import UserInterface.CustomerControl.PoliButton;
import UserInterface.CustomerControl.PoliLabel;
import UserInterface.CustomerControl.PoliTextBox;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonaPanel extends JPanel implements ActionListener {
    private Integer idPersona = 0, idMaxPersona = 0;
    private PersonaBL personaBL = null;
    private PersonaDTO persona = null;

    public PersonaPanel() {
        try {
            customizeComponent();
            //metodos para cargar y mostrar datos de la tabla
            loadRow();
            showRow();
            showTabla();
            

            btnRowIni.addActionListener(this);
            btnRowAnt.addActionListener(this);
            btnRowSig.addActionListener(this);
            btnRowFin.addActionListener(this);


            btnAgregar.addActionListener(       e -> btnAgregarClick());
            btnEliminar.addActionListener(      e -> btnEliminarClick());
            btnCancelar.addActionListener( e ->btnCancelarClick());
            btnGuardar.addActionListener(       e -> btnGuardarClick());
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
    }


    private void btnAgregarClick(){}
    private void btnGuardarClick(){}
    private void btnEliminarClick(){}
    private void btnCancelarClick(){}
   
    private void loadRow() throws Exception{
        idPersona       = 1;
        personaBL       = new PersonaBL();
        persona         = personaBL.getByidPersona(idPersona);
        idMaxPersona    = personaBL.getMaxRow();
    }

    private void showRow() throws Exception {
        boolean personaNull = (persona == null);
        txtIdPersona.setText((personaNull)? "" : persona.getId_persona().toString());
        txtNombre.setText((personaNull)? "" : persona.getNombre());
        lblRegistroTotal.setText(idPersona.toString()+ " de " + idMaxPersona.toString());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRowIni)
            idPersona = 1;
        if (e.getSource() == btnRowAnt && (idPersona > 1))
            idPersona--;
        if (e.getSource() == btnRowSig && (idPersona < idMaxPersona))
            idPersona++;
        if (e.getSource() == btnRowFin)
            idPersona = idMaxPersona;
        try {
            persona    = personaBL.getByidPersona(idPersona);
            showRow(); 
        } catch (Exception ex) {}
    }

    private void showTabla() throws Exception {
        String[] header =   {   "Id", "Rol", "Sexo", 
                                "Cedula", "Nombre", "Apellido", 
                                "Correo", "Descripcion", "Clave",
                                "Catálogo", "Fecha Nacimiento", "Estado", 
                                "Fecha Creacion", "Fecha Actualización"
                            };
        Object[][] data = new Object[personaBL.getAll().size()][14];
        int inicio = 0;
        for(PersonaDTO pDTO : personaBL.getAll()){
            data[inicio][0]     = pDTO.getId_persona();
            data[inicio][1]     = pDTO.getId_rol();
            data[inicio][2]     = pDTO.getId_sexo();
            data[inicio][3]     = pDTO.getCedula();
            data[inicio][4]     = pDTO.getNombre();
            data[inicio][5]     = pDTO.getApellido();
            data[inicio][6]     = pDTO.getCorreo();
            data[inicio][7]     = pDTO.getDescripcion();
            data[inicio][8]     = pDTO.getClave();
            data[inicio][9]     = pDTO.getId_catalogo_pais();
            data[inicio][10]    = pDTO.getFecha_nacimiento();
            data[inicio][11]    = pDTO.getEstado();
            data[inicio][12]    = pDTO.getFecha_creacion();
            data[inicio][13]    = pDTO.getFecha_modificacion();
            inicio++;
        }

        JTable tabla = new JTable(data, header);
        
        // Ajustar alineación de celdas
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        render.setHorizontalAlignment(SwingConstants.LEFT);
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(render);
        }
        
        tabla.setShowHorizontalLines(true);
        tabla.setGridColor(Color.BLACK);
        tabla.setRowSelectionAllowed(true);
        tabla.setColumnSelectionAllowed(false);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Desactivar el ajuste automático de tamaño
        tabla.setPreferredScrollableViewportSize(new Dimension(2000, 300)); // Ajustar el tamaño preferido

        pnlTabla.setLayout(new BorderLayout());

       // Agregar la tabla al panel
        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        pnlTabla.setLayout(new BorderLayout());
        pnlTabla.removeAll();
        pnlTabla.add(scrollPane, BorderLayout.CENTER); // Asegurarse de que el scrollPane se agregue al centro
    
        pnlTabla.revalidate();
        pnlTabla.repaint();

        tabla.getSelectionModel().addListSelectionListener(new ListSelectionListener(){ 
            @Override
            public void valueChanged(ListSelectionEvent e) {
          
                int col = 0;
                int row = tabla.getSelectedRow();
                String strIdPersona = tabla.getModel().getValueAt(row, col).toString();

                idPersona = Integer.parseInt(strIdPersona);
                try {
                    persona = personaBL.getByidPersona(idPersona);
                    showRow(); 
                } catch (Exception e1) { }  
                System.out.println("Tabla.Selected: " + strIdPersona);
            }
        });
        
    }


    //Diseños

    private PoliLabel
        lblTitulo           = new PoliLabel(" Persona"),
        lblIdPersona        = new PoliLabel(" Código:"),
        lblNombre           = new PoliLabel(" Desripción:"),
        lblRegistroTotal    = new PoliLabel(" 0 de 0");
        
    private PoliTextBox
        txtIdPersona        = new PoliTextBox(),
        txtNombre           = new PoliTextBox();

    private PoliButton
        btnPageIni      = new PoliButton(" |< "),
        btnPageAnt      = new PoliButton(" << "),
        btnPageSig      = new PoliButton(" >> "),
        btnPageFin      = new PoliButton(" >| "),

        btnRowIni       = new PoliButton(" |< "),
        btnRowAnt       = new PoliButton(" << "),
        btnRowSig       = new PoliButton(" >> "),
        btnRowFin       = new PoliButton(" >| "),

        btnAgregar      = new PoliButton("Agregar"),
        btnGuardar      = new PoliButton("Guardar"),
        btnEliminar     = new PoliButton("Eliminar"),
        btnCancelar     = new PoliButton("Cancelar");

    private JPanel
        pnlTabla    = new JPanel(),
        pnlBtnRow   = new JPanel(new FlowLayout()),
        pnlBtnPage  = new JPanel(new FlowLayout()),
        pnlBtnCRUD  = new JPanel(new FlowLayout());
        
    
    public void customizeComponent(){
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.CENTER;

        txtIdPersona.setEnabled(true);
        txtNombre.setBorderLine();

        pnlBtnPage.add(btnPageIni);
        pnlBtnPage.add(btnPageAnt);
        pnlBtnPage.add(new PoliLabel(" Page:( "));
        pnlBtnPage.add(lblRegistroTotal); 
        pnlBtnPage.add(new PoliLabel(" ) "));
        pnlBtnPage.add(btnPageSig);
        pnlBtnPage.add(btnPageFin);

        pnlBtnRow.add(btnRowIni);
        pnlBtnRow.add(btnRowAnt);
        pnlBtnRow.add(lblRegistroTotal);
        pnlBtnRow.add(btnRowSig);
        pnlBtnRow.add(btnRowFin);

        pnlBtnCRUD.add(btnAgregar);
        pnlBtnCRUD.add(btnGuardar);
        pnlBtnCRUD.add(btnEliminar);
        pnlBtnCRUD.add(btnCancelar);
        pnlBtnCRUD.setLayout(new GridLayout(1, 4, 10, 10));  //agrega espacios entre botones

        pnlBtnCRUD.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.GRAY), // Borde de color gris
            "Acciones", // Título del borde
            TitledBorder.CENTER, // Alineación del título
            TitledBorder.TOP, // Posición del título
            new Font("Comic Sans MS", Font.BOLD, 12), // Fuente del título
            Color.DARK_GRAY // Color del texto del título
            )   
        );


        gbc.insets = new Insets(15, 15, 15, 15);

        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.gridwidth = 5;
        add(lblTitulo, gbc);

        gbc.gridy = 1;
        gbc.gridx = -1;
        gbc.gridwidth = 1;
        add(new PoliLabel("■ Sección de datos: "), gbc);
        gbc.gridy = 1;
        gbc.gridx = 1;
        add(pnlBtnPage, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.gridwidth = 3;
        gbc.ipady = 150;
        gbc.ipadx = 450;
        pnlTabla.add(new PoliLabel(" Cargando información..."));
        add(pnlTabla, gbc);

        gbc.ipady = 1;
        gbc.ipadx = 1;

        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.gridwidth = 3;
        gbc.insets = new Insets(25, 0, 0, 0);  // Ajusta el valor superior a 50
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(Box.createRigidArea(new Dimension(5, 5)), gbc);

        gbc.insets = new Insets(2, 0, 3, 0);  

        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        add(new PoliLabel("■ Sección de registro: "), gbc);
        gbc.gridy = 4;
        gbc.gridx = 1;
        add(pnlBtnRow, gbc);

        gbc.gridy = 5;
        gbc.gridx = 0;
        add(lblIdPersona, gbc);
        gbc.gridy = 5;
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = GridBagConstraints.REMAINDER; // Indica que este componente ocupa toda la fila
        add(txtIdPersona, gbc);

        gbc.gridy = 6;
        gbc.gridx = 0;
        add(lblNombre, gbc);
        gbc.gridy = 6;
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = GridBagConstraints.REMAINDER; // Indica que este componente ocupa toda la fila
        add(txtNombre, gbc);

       
        gbc.gridy = 7;
        gbc.gridx = 0;
        gbc.gridwidth = 3;
        gbc.insets = new Insets(30, 0, 0, 0);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(pnlBtnCRUD, gbc);
    }
}
