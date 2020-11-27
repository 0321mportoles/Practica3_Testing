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

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void ForgottenPassword() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgottenPassword window = new ForgottenPassword();
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
	public ForgottenPassword() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Verdana", Font.PLAIN, 11));
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(41, 87, 183, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Escriba su correo para enviarle su nueva contraseña:");
		lblNewLabel.setBounds(41, 53, 285, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContrasenaEnviadaCorrectamente nw = new ContrasenaEnviadaCorrectamente();
				nw.NewScreen();
			}
		});
		btnNewButton.setBounds(275, 137, 89, 23);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 403, 221);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
