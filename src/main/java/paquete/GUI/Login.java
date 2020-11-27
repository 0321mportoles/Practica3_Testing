package paquete.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

//import com.jgoodies.forms.layout.FormSpecs;
//
//import java.awt.BorderLayout;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
//import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login {

	private JFrame frame;
	private JTextField txtUsuario;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Verdana", Font.PLAIN, 11));
		frame.setBounds(100, 100, 525, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setBounds(48, 32, 74, 18);
		lblUsuario.setFont(new Font("Verdana", Font.BOLD, 14));
		frame.getContentPane().add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(149, 33, 167, 20);
		frame.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(8);
		
		JLabel lblContrasena = new JLabel("CONTRASEÑA");
		lblContrasena.setBounds(31, 84, 108, 18);
		lblContrasena.setFont(new Font("Verdana", Font.BOLD, 14));
		frame.getContentPane().add(lblContrasena);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(149, 85, 167, 20);
		frame.getContentPane().add(passwordField);
		
		final JCheckBox chckbxMostrarContrasena = new JCheckBox("Mostrar contraseña");
		chckbxMostrarContrasena.setBounds(322, 84, 167, 23);
		chckbxMostrarContrasena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxMostrarContrasena.isSelected()) 
				{
					
					passwordField.setEchoChar((char)0);
				}else 
				{
					passwordField.setEchoChar('*');
				}
			}
		});
		frame.getContentPane().add(chckbxMostrarContrasena);
		
		JLabel lblCambiarContraseña = new JLabel("He olvidado mi contraseña");
		lblCambiarContraseña.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ForgottenPassword nw = new ForgottenPassword();
				nw.ForgottenPassword();
			}
		});
		lblCambiarContraseña.setForeground(Color.BLUE);
		lblCambiarContraseña.setBackground(Color.LIGHT_GRAY);
		lblCambiarContraseña.setBounds(159, 114, 167, 15);
		lblCambiarContraseña.setFont(new Font("Verdana", Font.PLAIN, 11));
		frame.getContentPane().add(lblCambiarContraseña);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBounds(170, 183, 167, 27);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoggedUser nw = new LoggedUser();
				nw.LoggedUser();
			}
		});
		btnLogin.setBackground(Color.GRAY);
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setFont(new Font("Verdana", Font.BOLD, 14));
		frame.getContentPane().add(btnLogin);
	}

}