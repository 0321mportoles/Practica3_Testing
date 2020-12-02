package paquete.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class UserCreatedSuccesfully {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void UserCreatedSuccesfully() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserCreatedSuccesfully window = new UserCreatedSuccesfully();
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
	public UserCreatedSuccesfully() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(400, 300, 450, 202);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("El cliente se ha creado correctamente");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel.setBounds(74, 73, 296, 14);
		frame.getContentPane().add(lblNewLabel);
	}

}
