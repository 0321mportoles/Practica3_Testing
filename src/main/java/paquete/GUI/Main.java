package paquete.GUI;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import model.Cliente.Documento;
import javax.swing.JMenuBar;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.awt.Component;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.table.DefaultTableModel;

public class Main {

	private JFrame frmJardineria;
	private JTable tablaClientes;
	private JTable tablaPedidos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("serial")
	private void initialize() {
		frmJardineria = new JFrame();
		frmJardineria.setTitle("Jardineria");
		frmJardineria.setBounds(400, 300, 800, 600);
		frmJardineria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJardineria.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel (new FlowLayout(FlowLayout.RIGHT));
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 784, 39);
		frmJardineria.getContentPane().add(panel);
		
		JButton btnNewButton = new JButton(" ");
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton.setHorizontalAlignment(SwingConstants.TRAILING);
		panel.add(btnNewButton);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("static-access")
			@Override
			public void mouseClicked(MouseEvent e) {
				Object[] options = {"Salir", "Cancelar"};
				int m = JOptionPane.showOptionDialog(frmJardineria, "¿Está seguro que quiere salir de la aplicación?", "Salir del programa", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
				if (m == 0) {
					System.exit(0);
				}
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\MARTA\\Downloads\\power-off-solid.png"));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 39, 97, 21);
		frmJardineria.getContentPane().add(menuBar);
		
		JMenu mnClientes = new JMenu("Clientes");
		mnClientes.setAlignmentX(Component.RIGHT_ALIGNMENT);
		menuBar.add(mnClientes);
					
				mnClientes.setBorder(new LineBorder(new Color(0, 0, 0)));
				mnClientes.setForeground(Color.BLACK);
				mnClientes.setFont(new Font("Verdana", Font.BOLD, 14));
				mnClientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
				JMenuItem mntmCrear = new JMenuItem("Crear");
				mntmCrear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						CreateUser.main(null);
					}
				});
				mntmCrear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
				mntmCrear.setBorder(new LineBorder(new Color(0, 0, 0), 0));
				mntmCrear.setFont(new Font("Verdana", Font.PLAIN, 12));
				mnClientes.add(mntmCrear);
				
				JMenuItem mntmModificar = new JMenuItem("Modificar");
				mntmModificar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						tablaClientes.setEnabled(true);
						tablaPedidos.setEnabled(true);
					}
				});
				mntmModificar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mntmModificar.setBorder(new LineBorder(new Color(0, 0, 0), 0));
				mntmModificar.setFont(new Font("Verdana", Font.PLAIN, 12));
				mnClientes.add(mntmModificar);
				
				JMenuItem mntmBorrar = new JMenuItem("Borrar");
				mntmBorrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						tablaClientes.setEnabled(true);
						tablaPedidos.setEnabled(true);
					}
				});
				mntmBorrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mntmBorrar.setBorder(new LineBorder(new Color(0, 0, 0), 0));
				mntmBorrar.setFont(new Font("Verdana", Font.PLAIN, 12));
				mnClientes.add(mntmBorrar);
				
				JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
				tabbedPane.setFont(new Font("Verdana", Font.PLAIN, 12));
				tabbedPane.setBackground(SystemColor.info);
				tabbedPane.setBounds(98, 94, 623, 404);
				frmJardineria.getContentPane().add(tabbedPane);
				
				
				
				String [] [] data = {};
				
				String[] columnNames = { "ID", "Nombre cliente","Apellido contacto","Tipo documento"," Numero Dni/Nie"," Email", "Password" }; 
				
				tablaClientes = new JTable(data, columnNames);
				tablaClientes.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 14));
				tablaClientes.setEnabled(false);
				tablaClientes.getTableHeader().setReorderingAllowed(false);
				tablaClientes.setModel(new DefaultTableModel(
					new Object[][] {
						{new Integer(1), "Marta", "Portoles", Documento.DNI, "72999034W", "asdad@ads.com", "asdasdd"},
						{new Integer(2), "Maria", "Garcia", Documento.DNI, "72859034W", "asdad@ads.com", "asdasdd"},
						{new Integer(3), "Carlos", "Perez", Documento.NIE, "P2999034W", "asdad@ads.com", "asdasdd"},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
					},
					new String[] {
						"ID", "Nombre cliente", "Apellido contacto", "Tipo documento", " Numero Dni/Nie", " Email", "Password"
					}
				) 
//				{public boolean isCellEditable(int row, int column){return false;}}
				);
				
				tablaClientes.setFont(new Font("Verdana", Font.PLAIN, 12));
				JScrollPane scrollPane = new JScrollPane(tablaClientes);
				scrollPane.setFont(new Font("Verdana", Font.PLAIN, 12));
				tabbedPane.addTab("Clientes", null, scrollPane, null);
				
				String [] [] dataP = {};
				
				String[] columnNamesP = { "Codigo pedido",  "Fecha pedido", "Fecha entrega" ,"Codigo cliente" }; 
				
				tablaPedidos = new JTable(dataP, columnNamesP);
				tablaPedidos.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 14));
				tablaClientes.setEnabled(false);
				tablaPedidos.getTableHeader().setReorderingAllowed(false);
				tablaPedidos.setModel(new DefaultTableModel(
					new Object[][] {
						{new Integer(1), LocalDate.of(2020, 12, 02), LocalDate.of(2020, 12, 10), new Integer(1)},
						{new Integer(2), LocalDate.of(2020, 12, 01), LocalDate.of(2020, 12, 9), new Integer(1)},
						{new Integer(3), LocalDate.of(2020, 12, 01), LocalDate.of(2020, 12, 12), new Integer(3)},
						{new Integer(4), LocalDate.of(2020, 12, 03), LocalDate.of(2020, 12, 13), new Integer(2)},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
					},
					new String[] {
						"Codigo pedido", "Fecha pedido", "Fecha entrega", "Codigo cliente"
					}
				)
//				{public boolean isCellEditable(int row, int column){return false;}}
				);
						
				
				tablaPedidos.setFont(new Font("Verdana", Font.PLAIN, 12));
				JScrollPane scrollPane_1 = new JScrollPane(tablaPedidos);
				scrollPane_1.setFont(new Font("Verdana", Font.PLAIN, 12));
				tabbedPane.addTab("Pedidos", null, scrollPane_1, null);
	}
}
