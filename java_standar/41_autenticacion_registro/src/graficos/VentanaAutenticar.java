package graficos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import service.ClientesService;
import service.ClientesServiceFactory;
import java.awt.Color;
import java.awt.Font;

public class VentanaAutenticar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtfUsuario;
	private JTextField jtfPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAutenticar frame = new VentanaAutenticar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaAutenticar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(177, 243, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 20));
		lblNewLabel.setBounds(66, 81, 116, 21);
		contentPane.add(lblNewLabel);
		
		jtfUsuario = new JTextField();
		jtfUsuario.setBounds(205, 85, 149, 20);
		contentPane.add(jtfUsuario);
		jtfUsuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setFont(new Font("Monospaced", Font.BOLD, 20));
		lblNewLabel_1.setBounds(66, 113, 116, 21);
		contentPane.add(lblNewLabel_1);
		
		jtfPassword = new JTextField();
		jtfPassword.setColumns(10);
		jtfPassword.setBounds(205, 117, 149, 20);
		contentPane.add(jtfPassword);
		
		JButton jbtAutenticar = new JButton("AUTENTICAR");
		jbtAutenticar.setBackground(new Color(255, 128, 192));
		jbtAutenticar.setForeground(new Color(255, 255, 255));
		jbtAutenticar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje;
				String usuario=jtfUsuario.getText();
				String password=jtfPassword.getText();
				ClientesService service=ClientesServiceFactory.getClientesService();
				if(service.autenticar(usuario, password)) {
					mensaje="Autenticado!";
				}else {
					mensaje="Usuario o contraseña no válidos!";
				}
				JOptionPane.showMessageDialog(VentanaAutenticar.this, mensaje);
			}
		});
		jbtAutenticar.setBounds(154, 163, 129, 40);
		contentPane.add(jbtAutenticar);
		
		JButton btnNewButton = new JButton("REGISTRAR");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(255, 128, 192));
		btnNewButton.setBounds(53, 214, 129, 36);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("INICIE SESIÓN!");
		lblNewLabel_2.setForeground(new Color(255, 128, 192));
		lblNewLabel_2.setFont(new Font("Monospaced", Font.BOLD, 27));
		lblNewLabel_2.setBounds(108, 11, 316, 45);
		contentPane.add(lblNewLabel_2);
	}

}