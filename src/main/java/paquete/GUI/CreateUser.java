package paquete.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateUser {

	private JFrame frmJardineria;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldDoc;
	private JComboBox comboBoxDoc;
	private JRadioButton rdbtnHombre;
	private JRadioButton rdbtnMujer;
	private ButtonGroup grupoGenero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateUser window = new CreateUser();
					window.frmJardineria.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CreateUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJardineria = new JFrame();
		frmJardineria.setTitle("Jardineria");
		frmJardineria.setResizable(false);
		frmJardineria.setFont(new Font("Verdana", Font.PLAIN, 14));
		frmJardineria.setBounds(400, 300, 460, 309);
		frmJardineria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJardineria.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNombre.setBounds(36, 24, 78, 14);
		frmJardineria.getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Verdana", Font.BOLD, 14));
		lblApellido.setBounds(36, 64, 88, 14);
		frmJardineria.getContentPane().add(lblApellido);
		
		JLabel lblTipoDoc = new JLabel("Tipo Documento");
		lblTipoDoc.setFont(new Font("Verdana", Font.BOLD, 14));
		lblTipoDoc.setBounds(36, 106, 165, 14);
		frmJardineria.getContentPane().add(lblTipoDoc);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Verdana", Font.BOLD, 14));
		lblSexo.setBounds(36, 202, 46, 14);
		frmJardineria.getContentPane().add(lblSexo);
		
		final JLabel lblErrorApellido = new JLabel("*ERROR: Campo vacío");
		lblErrorApellido.setVisible(false);
		lblErrorApellido.setForeground(Color.RED);
		lblErrorApellido.setBounds(142, 82, 241, 23);
		frmJardineria.getContentPane().add(lblErrorApellido);
		
		final JLabel lblErrorNombre = new JLabel("*ERROR: Campo vacío");
		lblErrorNombre.setVisible(false);
		lblErrorNombre.setForeground(Color.RED);
		lblErrorNombre.setBounds(142, 40, 241, 23);
		frmJardineria.getContentPane().add(lblErrorNombre);
		
		final JLabel lblErrorSeleccionDoc = new JLabel("*ERROR: Seleccione opción");
		lblErrorSeleccionDoc.setVisible(false);
		lblErrorSeleccionDoc.setForeground(Color.RED);
		lblErrorSeleccionDoc.setBounds(198, 132, 227, 14);
		frmJardineria.getContentPane().add(lblErrorSeleccionDoc);
		
		final JLabel lblErrorNDoc = new JLabel("*ERROR: Campo vacío");
		lblErrorNDoc.setVisible(false);
		lblErrorNDoc.setForeground(Color.RED);
		lblErrorNDoc.setBounds(196, 178, 209, 14);
		frmJardineria.getContentPane().add(lblErrorNDoc);
		
		final JLabel lblErrorOpcionS = new JLabel("*ERROR: Seleccione opción");
		lblErrorOpcionS.setVisible(false);
		lblErrorOpcionS.setForeground(Color.RED);
		lblErrorOpcionS.setBounds(142, 221, 263, 14);
		frmJardineria.getContentPane().add(lblErrorOpcionS);
		
		
		rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setFont(new Font("Verdana", Font.PLAIN, 12));
		rdbtnHombre.setBounds(132, 199, 78, 23);
		frmJardineria.getContentPane().add(rdbtnHombre);
		
		rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setFont(new Font("Verdana", Font.PLAIN, 12));
		rdbtnMujer.setBounds(221, 200, 109, 23);
		frmJardineria.getContentPane().add(rdbtnMujer);
		
		final ButtonGroup grupoGenero = new ButtonGroup();
		grupoGenero.add(rdbtnMujer);
		grupoGenero.add(rdbtnHombre);		
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Verdana", Font.PLAIN, 12));
		textFieldNombre.setBounds(142, 23, 116, 20);
		frmJardineria.getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setFont(new Font("Verdana", Font.PLAIN, 12));
		textFieldApellido.setBounds(142, 63, 116, 20);
		frmJardineria.getContentPane().add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		
		
		comboBoxDoc = new JComboBox();
		comboBoxDoc.setBackground(Color.WHITE);
		comboBoxDoc.setModel(new DefaultComboBoxModel(new String[] {"", "DNI", "NIE"}));
		comboBoxDoc.setFont(new Font("Verdana", Font.PLAIN, 12));
		comboBoxDoc.setMaximumRowCount(3);
		comboBoxDoc.setBounds(198, 106, 72, 20);
		frmJardineria.getContentPane().add(comboBoxDoc);

		JButton btnReset = new JButton("Reset");
		btnReset.addMouseListener (new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				textFieldApellido.setText(null);
				textFieldNombre.setText(null);
				textFieldDoc.setText(null);
				comboBoxDoc.setSelectedItem(null);
			//	grupoGenero.setSelectedItem(null);
				
				
			}
		});
		btnReset.setForeground(Color.RED);
		btnReset.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnReset.setBounds(247, 246, 89, 23);
		frmJardineria.getContentPane().add(btnReset);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAceptar.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("static-access")
			@Override
			public void mouseClicked(MouseEvent e) {
			
				if (textFieldApellido.getText().equals("")) {
					lblErrorApellido.setVisible(true);
				} else {
					lblErrorApellido.setVisible(false);
				}
				if (textFieldNombre.getText().equals("")) {
					lblErrorNombre.setVisible(true);
				} else {
					lblErrorNombre.setVisible(false);
				}
				if (textFieldDoc.getText().equals("")) {
					lblErrorNDoc.setVisible(true);
				} else {
					lblErrorNDoc.setVisible(false);
				}
				if (comboBoxDoc.getSelectedIndex() == 0) {
					lblErrorSeleccionDoc.setVisible(true);
				} else {
					lblErrorSeleccionDoc.setVisible(false);
				}
				if ((grupoGenero.getSelection() == null)) {
					lblErrorOpcionS.setVisible(true);
				} else {
					lblErrorOpcionS.setVisible(false);
				}
				if  (textFieldApellido.getText().equals("") ||
						textFieldNombre.getText().equals("") ||
						textFieldDoc.getText().equals("") ||
						comboBoxDoc.getSelectedIndex() == 0 ||
						grupoGenero.getSelection() == null 				
						)
					
				{
					
				}else 
				{
					UserCreatedSuccesfully nw = new UserCreatedSuccesfully();
					nw.UserCreatedSuccesfully();
				}
			}
			
		});
		btnAceptar.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnAceptar.setBounds(351, 246, 93, 23);
		frmJardineria.getContentPane().add(btnAceptar);	
		
		JLabel lblTipoDoc_1 = new JLabel("Numero documento");
		lblTipoDoc_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblTipoDoc_1.setBounds(36, 158, 165, 14);
		frmJardineria.getContentPane().add(lblTipoDoc_1);
		
		textFieldDoc = new JTextField();
		textFieldDoc.setFont(new Font("Verdana", Font.PLAIN, 12));
		textFieldDoc.setColumns(10);
		textFieldDoc.setBounds(198, 158, 116, 20);
		frmJardineria.getContentPane().add(textFieldDoc);
		

	}

	public ButtonGroup getGrupoGenero() {
		return grupoGenero;
	}

	public void setGrupoGenero(ButtonGroup grupoGenero) {
		this.grupoGenero = grupoGenero;
	}
}
