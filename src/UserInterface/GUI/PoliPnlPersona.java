package UserInterface.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import BusinessLogic.PersonaBL;
import DataAccess.DTO.PersonaDTO;
import UserInterface.CustomerControl.PoliButton;
import UserInterface.CustomerControl.PoliLabel;
import UserInterface.CustomerControl.PoliTextBox;

public class PoliPnlPersona extends JPanel implements ActionListener {
    private Integer idPersona, idMaxPersona;
    private PersonaBL personaBL = null;
    private PersonaDTO persona = null;

    public PoliPnlPersona()throws Exception {
        setGridBagLayot();
        loadData();
        showData();
        showTabla();

        btnInicio.addActionListener(this);
        btnAnterior.addActionListener(this);
        btnSiguiente.addActionListener(this);
        btnFinal.addActionListener(this);
        btnGuardar.addActionListener(this);        
    }


    private void loadData() throws Exception{
        idPersona = 1;
        personaBL = new PersonaBL();
        persona = personaBL.getByidPersona(idPersona);
    }

    private void showData() throws Exception {
        boolean personaNull = (persona == null);
        txtIdPersona.setText((personaNull)? "" : persona.getId_persona().toString());
        txtNombre.setText((personaNull)? "" : persona.getNombre());
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
        
        tabla.setShowHorizontalLines(true);
        tabla.setGridColor(Color.BLACK);
        tabla.setRowSelectionAllowed(true);
        tabla.setColumnSelectionAllowed(false);
        tabla.setPreferredScrollableViewportSize(new Dimension(450, 500));
        tabla.setFillsViewportHeight(true);

        pnlTabla.removeAll();
        pnlTabla.add(tabla);
        JScrollPane scrollPane = new JScrollPane(tabla);
        pnlTabla.add(scrollPane);

        tabla.getSelectionModel().addListSelectionListener(new ListSelectionListener(){ 
            @Override
            public void valueChanged(ListSelectionEvent e) {
          
                int col = 0;
                int row = tabla.getSelectedRow();
                String strIdPersona = tabla.getModel().getValueAt(row, col).toString();

                idPersona = Integer.parseInt(strIdPersona);
                try {
                    persona = personaBL.getByidPersona(idPersona);
                    showData(); 
                } catch (Exception e1) { }  
                System.out.println("Tabla.Selected: " + strIdPersona);
            }
        });
    }


    private void btnEliminarClick(ActionEvent e) throws Exception {
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea Eliminar?", "Eliminar...",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
               
            if(!personaBL.delete(persona.getId_persona()))
                JOptionPane.showMessageDialog(this, "Error al eliminar...!", "ERROR", JOptionPane.OK_OPTION);

            loadData();
            showData();
            showTabla();
        }
    }
    private void btnGuardarClick(ActionEvent e) throws Exception {
        boolean sexoNull = (persona == null);
        if (JOptionPane.showConfirmDialog(this, "¿Seguro que desea guardar?", (sexoNull)?"Agregar...": "Actualizar...", 
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            
            JOptionPane.showMessageDialog(this, "Error al guardar...!", "ERROR", JOptionPane.OK_OPTION);
            
            loadData();
            showData();
            showTabla();
        }
    } 

    @Override
    public void actionPerformed (ActionEvent e) {
        if(e.getSource() == btnInicio)
            idPersona  = 1;
        if(e.getSource() == btnAnterior  &&  (idPersona>1) )
            idPersona--;
        if(e.getSource() == btnSiguiente  &&  (idPersona<idMaxPersona))
            idPersona++;
        if(e.getSource() == btnFinal)
            idPersona = idMaxPersona;
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
        btnInicio       = new PoliButton(" |< "),
        btnAnterior     = new PoliButton(" << "),
        btnSiguiente    = new PoliButton(" >> "),
        btnFinal        = new PoliButton(" >| ");

    private PoliButton
        btnAgregar      = new PoliButton("Agregar"),
        btnGuardar      = new PoliButton("Guardar"),
        btnEliminar     = new PoliButton("Eliminar"),
        btnCancelar     = new PoliButton("Cancelar");

    private JPanel
        pnlTabla        = new JPanel(),
        pnlBtnCRUD      = new JPanel(new FlowLayout()),
        pnlBtnPagina    = new JPanel(new FlowLayout());

    private Border
        line = new LineBorder(Color.BLACK),
        margin = new EmptyBorder(5,5,5,5),
        border = new CompoundBorder(line, margin);



    public void setGridBagLayot(){
        GridBagConstraints gbc = new GridBagConstraints();
        txtIdPersona.setEnabled(false);

        pnlBtnPagina.add(btnAgregar);
        pnlBtnPagina.add(btnAnterior);
        pnlBtnPagina.add(new PoliLabel(" Page: [ "));      
        pnlBtnPagina.add(lblRegistroTotal);        
        pnlBtnPagina.add(new PoliLabel(" ] "));      
        pnlBtnPagina.add(btnSiguiente);
        pnlBtnPagina.add(btnFinal);

        pnlBtnCRUD.add(btnAgregar);
        pnlBtnCRUD.add(btnGuardar);
        pnlBtnCRUD.add(btnCancelar);
        pnlBtnCRUD.add(btnEliminar);
        pnlBtnCRUD.setBorder(border);

        // GridBagConstraints.Separación entre componentes
        gbc.insets=new Insets(5,5,5,5);    
        
        // GridBagConstraints.ponerComponentes
        gbc.gridy = 0;       gbc.gridx=0;  //| fila,  columna
        gbc.gridwidth=3;                   //| celdas a unir
        add(lblTitulo, gbc);               //| agrega el control

        gbc.gridy = 1;       gbc.gridx=0;   
        gbc.gridwidth=1;                     
        add(new JLabel("■ Sección de datos: "), gbc);                 

        gbc.gridy = 2;       gbc.gridx=0;
        gbc.gridwidth=3;                   //| celdas a unir
        gbc.ipady = 150;                   //| tamaño alto
        gbc.ipadx = 450;                   //| tamaño ancho ... luego se debe restablecer a 1 o 0
        pnlTabla.add(new Label("Cargando datos..."));
        //pnlTabla.setBorder(border);
        add(pnlTabla, gbc);
        
        gbc.ipady = 1;                    //| Restablecer el tamaño de fila y columna
        gbc.ipadx = 1;
        
        gbc.gridy = 3;       gbc.gridx=0;   
        gbc.gridwidth=3;  
        add(pnlBtnPagina, gbc);  

        gbc.gridy = 4;       gbc.gridx=0; 
        gbc.gridwidth=1;    
        add(new JLabel("■ Sección de registro: "), gbc);  

        gbc.gridy = 5;       gbc.gridx=0;     add(lblIdPersona,  gbc);   
        gbc.gridy = 5;       gbc.gridx=1;     add(txtIdPersona,  gbc);   

        gbc.gridy = 6;       gbc.gridx=0;     add(lblNombre, gbc);        
        gbc.gridy = 6;       gbc.gridx=1;     add(txtNombre, gbc);
        gbc.gridy = 6;       gbc.gridx=2;     add(new JLabel("*"), gbc);  

        gbc.gridy = 7;       gbc.gridx=0;
        gbc.gridwidth=3;
        gbc.insets    = new Insets(30,0,0,0); 
        gbc.fill=GridBagConstraints.HORIZONTAL;
        add(pnlBtnCRUD, gbc);

    }
    
}
