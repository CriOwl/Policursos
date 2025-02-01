package UserInterface.Form;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

import DataAccess.DTO.PersonaDTO;
import UserInterface.CustomerControl.*;
import BusinessLogic.Entities.PersonaBL;


import javax.swing.JOptionPane;


public class PersonaDialog extends JDialog {
    private PersonaBL persona = new PersonaBL();
    private JTextField txtCedula, txtNombre, txtApellido, txtCorreo, txtDescripcion, txtClave, txtFechaNacimiento;
    private JComboBox<String> cmbRol, cmbSexo, cmbPais;
    private JButton btnGuardar, btnCancelar;
    private PersonaPanel personaPanel;

    public PersonaDialog(JFrame parent, PersonaPanel personaPanel) {
        super(parent, "Agregar Persona", true);
        this.personaPanel = personaPanel;
        setSize(700, 700);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new PoliLabel("Cédula (Obligatorio):"));
        txtCedula = new PoliTextBox();
        add(txtCedula);

        add(new PoliLabel("Nombre (Obligatorio):"));
        txtNombre = new PoliTextBox();
        add(txtNombre);

        add(new PoliLabel("Apellido (Obligatorio): "));
        txtApellido = new PoliTextBox();
        add(txtApellido);

        add(new PoliLabel("Correo:"));
        txtCorreo = new PoliTextBox();
        add(txtCorreo);

        add(new PoliLabel("Descripción:"));
        txtDescripcion = new PoliTextBox();
        add(txtDescripcion);

        add(new PoliLabel("Clave (Obligatorio):"));
        txtClave = new PoliTextBox();
        add(txtClave);

        add(new PoliLabel("Fecha Nacimiento (YYYY-MM-DD):"));
        txtFechaNacimiento = new PoliTextBox();
        add(txtFechaNacimiento);

        add(new PoliLabel("Rol:"));
        cmbRol = new JComboBox<>(new String[] { "Administrador", "Estudiante", "Tutor", "Docente", "Investigaror" });
        add(cmbRol);

        add(new PoliLabel("Sexo:"));
        cmbSexo = new JComboBox<>(new String[] { "Masculino", "Femenino", "Otro" });
        add(cmbSexo);

        add(new PoliLabel("País:"));
        cmbPais = new JComboBox<>(new String[] { "Ecuador", "Estados Unidos", "Colombia", "Argentina" });
        add(cmbPais);

        // Botones
        btnGuardar = new PoliButton("Guardar");
        btnCancelar = new PoliButton("Cancelar");
        add(btnGuardar);
        add(btnCancelar);

        btnGuardar.addActionListener(e -> guardarPersona());

        btnCancelar.addActionListener(e -> dispose());

        setLocationRelativeTo(parent);
    }

    public void guardarPersona() {
        try {

            String cedula = txtCedula.getText().trim().isEmpty() ? null : txtCedula.getText();
            String nombre = txtNombre.getText().trim().isEmpty() ? null : txtNombre.getText();
            String apellido = txtApellido.getText().trim().isEmpty() ? null : txtApellido.getText();
            String correo = txtCorreo.getText().trim().isEmpty() ? null : txtCorreo.getText();
            String descripcion = txtDescripcion.getText().trim().isEmpty() ? null : txtDescripcion.getText();
            String clave = txtClave.getText().trim().isEmpty() ? null : txtClave.getText();
            String fechaNacimiento = txtFechaNacimiento.getText().trim().isEmpty() ? null
                    : txtFechaNacimiento.getText();

            if (cedula == null || nombre == null || apellido == null || clave == null) {
                JOptionPane.showMessageDialog(this, "❌ Todos los campos obligatorios deben ser llenados.");
                return;
            }

            int Id_rol = cmbRol.getSelectedIndex() + 1;
            int Id_sexo = cmbSexo.getSelectedIndex() + 1;
            int Id_catalogo_pais = cmbPais.getSelectedIndex() + 1;
            PersonaDTO nuevaPersona = new PersonaDTO(Id_rol, Id_sexo, cedula, nombre,
                    apellido, correo, descripcion, clave, Id_catalogo_pais, fechaNacimiento);

            boolean resultado = persona.create(nuevaPersona);

            if (resultado) {
                JOptionPane.showMessageDialog(this, "✅ Persona agregada correctamente.");
                personaPanel.updateTable(); // Llama al nuevo método
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "❌ Error al agregar la persona.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "❌ Error: " + e.getMessage()); // Add exception handling
        }

    }

}