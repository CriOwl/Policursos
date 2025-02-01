package UserInterface.Form;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;

import BusinessLogic.Entities.PersonaBL;
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
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PersonaPanel extends JPanel implements ActionListener {
    private Integer idPersona = 0, idMaxPersona = 0;
    private int inicioPagina = 1, totalPaginas = 1, registrosPorPagina = 10;
    private PersonaBL personaBL = null;
    private PersonaDTO persona = null;

    public PersonaPanel() {
        try {
            customizeComponent();
            //recargar la tabla actualizada
            updateTable();

            //botones para moverse el los registros
            btnRowIni.addActionListener(this);
            btnRowAnt.addActionListener(this);
            btnRowSig.addActionListener(this);
            btnRowFin.addActionListener(this);

            //botones para moerve de pagina 
            btnPageIni.addActionListener(e -> primeraPagina());
            btnPageAnt.addActionListener(e -> paginaAnterior());
            btnPageSig.addActionListener(e -> paginaSiguiente());
            btnPageFin.addActionListener(e -> ultimaPagina());

            //botones del CRUD
            btnAgregar.addActionListener(e -> btnAgregarClick());
            btnEliminar.addActionListener(e -> btnEliminarClick());
            

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void updateTable() throws Exception {
        loadRow();
        showRow();
        showTabla();
    }

    private void loadRow() throws Exception {
        idPersona = 1;
        personaBL = new PersonaBL();
        persona = personaBL.getByIdPersona(idPersona);
        idMaxPersona = personaBL.getMaxRow(); //umero de registros totales
        totalPaginas = (int) Math.ceil((double) idMaxPersona / registrosPorPagina);
    }

    private void showRow() throws Exception {
        boolean personaNull = (persona == null);
        txtIdPersona.setText((personaNull) ? " " : persona.getId_persona().toString());
        txtNombre.setText((personaNull) ? " " : persona.getNombre());
        lblRegistroTotal.setText(idPersona.toString() + " de " + idMaxPersona.toString());
    }

    private void showTabla() throws Exception {
        String[] header = {
                "Cedula", "Nombre", "Apellido",
                "Correo", "Clave"
        };
        int start = (inicioPagina - 1) * registrosPorPagina;
        int end = Math.min(start + registrosPorPagina, personaBL.getAll().size());
        Object[][] data = new Object[end - start][5];
        int index = 0;
        for (int i = start; i < end; i++) {
            PersonaDTO pDTO = personaBL.getAll().get(i);
            data[index][0] = pDTO.getCedula();
            data[index][1] = pDTO.getNombre();
            data[index][2] = pDTO.getApellido();
            data[index][3] = pDTO.getCorreo();
            data[index][4] = pDTO.getClave();
            index++;
        }

        // Crear la tabla
        JTable tabla = new JTable(data, header) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // hace que la tabla no interactue con el mouse
            }
        };

        tabla.setShowHorizontalLines(true);
        tabla.setGridColor(Color.DARK_GRAY);
        tabla.setRowSelectionAllowed(false); 
        tabla.setColumnSelectionAllowed(false);
        tabla.setFillsViewportHeight(true);

        // agregar la tabla al JScrollPane
        JScrollPane scrollPane = new JScrollPane(tabla);

        // Añade el scrollPane al Panel
        pnlTabla.removeAll();
        pnlTabla.add(scrollPane, BorderLayout.CENTER);
        pnlTabla.revalidate(); // actualiza la tabla
        pnlTabla.repaint(); //vuelve a poner la tabla
    }


    //metodos para poder moverse en páginas
    private void primeraPagina() {
        inicioPagina = 1;
        try {
            showTabla();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void paginaAnterior() {
        if (inicioPagina > 1) {
            inicioPagina--;
            try {
                showTabla();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private void paginaSiguiente() {
        if (inicioPagina < totalPaginas) {
            inicioPagina++;
            try {
                showTabla();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private void ultimaPagina() {
        inicioPagina = totalPaginas;
        try {
            showTabla();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    // metodos de accion para los botones
    private void btnAgregarClick() {
        PersonaDialog dialog = new PersonaDialog((JFrame) SwingUtilities.getWindowAncestor(this), this);
        dialog.setVisible(true);
    }

    private void btnEliminarClick() {
        try {
            if (PoliCursoStyle.showConfirmYesNo("¿Desea eliminarlo ?")) {
                if (!personaBL.delete(persona.getId_persona()))
                    throw new Exception(" Inconvenientes al eliminar!!");

                updateTable();
            }
        } catch (Exception e) {
            PoliCursoStyle.showMsgError(e.getMessage());
        }
    }

    
    //
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
            persona = personaBL.getByIdPersona(idPersona);
            showRow();
        } catch (Exception ex) {
        }
    }

    // Diseños
    private PoliLabel lblTitulo = new PoliLabel(" Persona"),
            lblIdPersona = new PoliLabel(" Código:"),
            lblNombre = new PoliLabel(" Desripción:"),
            lblRegistroTotal = new PoliLabel(" 0 de 0");

    private PoliTextBox txtIdPersona = new PoliTextBox(),
            txtNombre = new PoliTextBox();

    private PoliButton 
            btnPageIni = new PoliButton(" |< "),
            btnPageAnt = new PoliButton(" << "),
            btnPageSig = new PoliButton(" >> "),
            btnPageFin = new PoliButton(" >| "),
            btnRowIni = new PoliButton(" |< "),
            btnRowAnt = new PoliButton(" << "),
            btnRowSig = new PoliButton(" >> "),
            btnRowFin = new PoliButton(" >| "),
            btnAgregar = new PoliButton("Agregar"),
            btnEliminar = new PoliButton("Eliminar");

    private JPanel pnlTabla = new JPanel(),
            pnlBtnRow = new JPanel(new FlowLayout()),
            pnlBtnPage = new JPanel(new FlowLayout()),
            pnlBtnCRUD = new JPanel(new FlowLayout());

    public void customizeComponent() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.CENTER;

        txtIdPersona.setEnabled(false);
        txtNombre.setBorderLine();

        pnlBtnPage.add(btnPageIni);
        pnlBtnPage.add(btnPageAnt);
        pnlBtnPage.add(new PoliLabel(" Pagina:( "));
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
        pnlBtnCRUD.add(btnEliminar);

        pnlBtnCRUD.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.GRAY),
                "Acciones",
                TitledBorder.CENTER,
                TitledBorder.TOP,
                new Font("Comic Sans MS", Font.BOLD, 12),
                Color.DARK_GRAY));

        gbc.insets = new Insets(5, 5, 5, 5);

        // posicioanar Persona Titulo
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        add(lblTitulo, gbc);

        // posicionar seccion
        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        add(new PoliLabel("-> Sección de datos: "), gbc);
        gbc.gridy = 1;
        gbc.gridx = 1;
        add(pnlBtnPage, gbc);

        // pagina
        gbc.gridy = 3;
        gbc.gridx = 8;
        gbc.gridwidth = 3;
        gbc.insets = new Insets(25, 0, 0, 0); // cambian la posicion de todo
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(Box.createRigidArea(new Dimension(12, 20)), gbc);

        gbc.insets = new Insets(10, 0, 0, 0);

        // ajustar la tabla
        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.gridwidth = 5;
        gbc.ipady = 200;
        gbc.ipadx = 750;
        gbc.fill = GridBagConstraints.BOTH; // Asegurarse de que el componente se expanda en ambas direcciones
        pnlTabla.setLayout(new BorderLayout()); // Asegurarse de que el panel tenga un BorderLayout
        add(pnlTabla, gbc);

        gbc.ipady = 1;
        gbc.ipadx = 1;

        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.gridwidth = 5;
        gbc.insets = new Insets(25, 0, 0, 0); // Ajusta el valor superior a 50
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(Box.createRigidArea(new Dimension(5, 5)), gbc);

        gbc.insets = new Insets(2, 0, 3, 0);

        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        add(new PoliLabel("-> Sección de registro: "), gbc);
        gbc.gridy = 4;
        gbc.gridx = 1;
        gbc.gridwidth = 1; // Asegurarse de que el panel de botones de fila se alinee con el título
        add(pnlBtnRow, gbc);

        // Id Persona == codigo
        gbc.gridy = 5;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        add(lblIdPersona, gbc);
        gbc.gridy = 5;
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = GridBagConstraints.REMAINDER; // Indica que este componente ocupa toda la fila
        add(txtIdPersona, gbc);

        // descripcion
        gbc.gridy = 6;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        add(lblNombre, gbc);
        gbc.gridy = 6;
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = GridBagConstraints.REMAINDER; // Indica que este componente ocupa toda la fila
        add(txtNombre, gbc);

        gbc.gridy = 7;
        gbc.gridx = 0;
        gbc.gridwidth = 5;
        gbc.insets = new Insets(30, 0, 0, 0);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(pnlBtnCRUD, gbc);
    }
}

