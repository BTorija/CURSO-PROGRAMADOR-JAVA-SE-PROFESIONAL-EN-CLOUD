package graficos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;

public class VentanaRegistro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistro frame = new VentanaRegistro();
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
	public VentanaRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 128, 255));
		contentPane.setBackground(new Color(174, 225, 215));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegister = new JLabel("REGÍSTRATE AHORA!!");
		lblRegister.setForeground(new Color(255, 102, 179));
		lblRegister.setFont(new Font("Monospaced", Font.BOLD, 25));
		lblRegister.setBounds(80, 11, 281, 43);
		contentPane.add(lblRegister);
		
		JLabel lblUsuario = new JLabel("Usuario :");
		lblUsuario.setFont(new Font("Monospaced", Font.BOLD, 20));
		lblUsuario.setBounds(29, 51, 133, 43);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contraseña :");
		lblContrasea.setFont(new Font("Monospaced", Font.BOLD, 20));
		lblContrasea.setBounds(29, 91, 150, 43);
		contentPane.add(lblContrasea);
		
		JLabel lblTelfono = new JLabel("Teléfono :");
		lblTelfono.setFont(new Font("Monospaced", Font.BOLD, 20));
		lblTelfono.setBounds(29, 166, 133, 43);
		contentPane.add(lblTelfono);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Monospaced", Font.BOLD, 20));
		lblEmail.setBounds(29, 128, 133, 43);
		contentPane.add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(210, 66, 164, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(210, 106, 164, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(210, 143, 164, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(210, 181, 164, 20);
		contentPane.add(textField_3);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setForeground(new Color(255, 255, 255));
		btnRegistrar.setBackground(new Color(255, 128, 192));
		btnRegistrar.setBounds(164, 212, 106, 38);
		contentPane.add(btnRegistrar);
	}
}
