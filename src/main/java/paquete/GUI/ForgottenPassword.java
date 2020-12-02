package paquete.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ForgottenPassword {

	private JFrame frmRecuperacionDeContrasea;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void ForgottenPassword() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgottenPassword window = new ForgottenPassword();
					window.frmRecuperacionDeContrasea.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ForgottenPassword() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRecuperacionDeContrasea = new JFrame();
		frmRecuperacionDeContrasea.setTitle("Recuperacion de contraseña");
		frmRecuperacionDeContrasea.getContentPane().setFont(new Font("Verdana", Font.PLAIN, 11));
		frmRecuperacionDeContrasea.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(400, 300, 183, 20);
		frmRecuperacionDeContrasea.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Escriba su correo para enviarle su nueva contraseña:");
		lblNewLabel.setBounds(41, 53, 323, 14);
		frmRecuperacionDeContrasea.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContrasenaEnviadaCorrectamente nw = new ContrasenaEnviadaCorrectamente();
				nw.NewScreen();
			}
		});
		btnNewButton.setBounds(275, 137, 89, 23);
		frmRecuperacionDeContrasea.getContentPane().add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(41, 80, 265, 20);
		frmRecuperacionDeContrasea.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		frmRecuperacionDeContrasea.setBounds(100, 100, 403, 221);
		frmRecuperacionDeContrasea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
