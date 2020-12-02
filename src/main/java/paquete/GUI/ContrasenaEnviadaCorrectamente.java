package paquete.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class ContrasenaEnviadaCorrectamente {

	private JFrame frmContraseaEnviada;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContrasenaEnviadaCorrectamente window = new ContrasenaEnviadaCorrectamente();
					window.frmContraseaEnviada.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ContrasenaEnviadaCorrectamente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmContraseaEnviada = new JFrame();
		frmContraseaEnviada.setTitle("Contraseña enviada");
		frmContraseaEnviada.setBounds(400, 300, 360, 161);
		frmContraseaEnviada.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmContraseaEnviada.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Su nueva contraseña se ha enviado correctamente");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel.setBounds(28, 46, 297, 14);
		frmContraseaEnviada.getContentPane().add(lblNewLabel);
	}

}
