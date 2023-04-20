package ClaseLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Contraseña extends JFrame implements ActionListener {
	//Ejecutable
	public static void main(String[] args) {
        Contraseña frame = new Contraseña();
        frame.setVisible(true);
    }
	   
	//constantes
    private JTextField usuario;
    private JPasswordField contraseña;
    private JButton botonEntrar;

    //contructor
    public Contraseña() {
        // Configuración de la ventana
        setTitle("Entrar");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Creación de los componentes de la interfaz
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));
        JLabel usernameLabel = new JLabel("Usuario");
        JLabel passwordLabel = new JLabel("Contraseña");
        usuario = new JTextField();
        contraseña = new JPasswordField();
        botonEntrar = new JButton("Verificar");

        // Adición de los componentes al panel
        panel.add(usernameLabel);
        panel.add(usuario);
        panel.add(passwordLabel);
        panel.add(contraseña);
        panel.add(new JLabel(""));
        panel.add(botonEntrar);

        // Adición del panel a la ventana
        add(panel);

        // Asociación del botón con el método actionPerformed
        botonEntrar.addActionListener(this);
    }

    // Método actionPerformed para manejar la acción del botón
    public void actionPerformed(ActionEvent e) {
    	
        if (e.getSource() == botonEntrar) {
            String nombre = usuario.getText();
            char[] password = contraseña.getPassword();
            
            // Aquí se puede validar el nombre de usuario y la contraseña
            // Por ejemplo, se puede comparar con valores predeterminados
            if (nombre.equals("admin") && String.valueOf(password).equals("admin")) {
                JOptionPane.showMessageDialog(this, "Accion existosa!");
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecto.");
            }
        }
    }

 
}
