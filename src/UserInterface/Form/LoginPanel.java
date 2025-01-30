package UserInterface.Form;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import UserInterface.CustomerControl.PoliLabel;
import UserInterface.CustomerControl.PoliLabelText;
import UserInterface.CustomerControl.PoliTextBox;

public class LoginPanel extends JPanel {
    private PoliLabel lblUserName;
    private PoliLabel lblPassword;
    private PoliTextBox txtUserName;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private PoliLabelText pltDireccion;

    public LoginPanel(){
        initializeComponents();
        btnLogin.addActionListener(e -> btnLoginClick());

    }

    private void btnLoginClick(){
        String username = txtUserName.getText();
        char[] password = txtPassword.getPassword();

        JOptionPane.showMessageDialog(LoginPanel.this, "Usuario: " + username + "\nContraseña: " + new String(password), "Login Exitoso", JOptionPane.INFORMATION_MESSAGE);

        txtUserName.setText("");
        txtPassword.setText("");
    }


    private void initializeComponents(){
        lblUserName = new PoliLabel("Username:");
        lblPassword = new PoliLabel("Password:");
        txtUserName = new PoliTextBox();
        txtPassword = new JPasswordField();
        btnLogin    = new JButton("Login");
        pltDireccion = new PoliLabelText("Dirección:");

        //txtUserName.setBorder(txtUserName.createBorderLine());
        txtUserName.setBorderLine();

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Márgenes entre componentes

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        add(lblUserName, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(txtUserName, gbc);

        // Etiqueta y campo de texto para la contraseña
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        add(lblPassword, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        add(txtPassword, gbc);

        // Botón de login en la fila 2
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(btnLogin, gbc);


        // Botón de login en la fila 2
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        add(pltDireccion, gbc);
    }
    
}
