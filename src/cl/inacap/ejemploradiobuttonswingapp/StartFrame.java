package cl.inacap.ejemploradiobuttonswingapp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartFrame extends JFrame {
	private JPanel contentPane;
	private JRadioButton rdbtnHombre;
	private JRadioButton rdbtnMujer;
	private JRadioButton rdbtnOtro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartFrame frame = new StartFrame();
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
	public StartFrame() {
		this.setTitle("EjemploJRadioButtonSwingApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnHombre.isSelected()) {
					rdbtnMujer.setSelected(false);
					rdbtnOtro.setSelected(false);
				}
				else { //Esta condición evita que se pueda deseleccionar el RadioButton.
					rdbtnHombre.setSelected(true);
				}
			}
		});
		rdbtnHombre.setBounds(6, 41, 109, 23);
		contentPane.add(rdbtnHombre);
		
		rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnMujer.isSelected()) {
					rdbtnHombre.setSelected(false);
					rdbtnOtro.setSelected(false);
				}
				else { //Esta condición evita que se pueda deseleccionar el RadioButton.
					rdbtnMujer.setSelected(true);
				}
			}
		});
		rdbtnMujer.setBounds(6, 67, 109, 23);
		contentPane.add(rdbtnMujer);
		
		rdbtnOtro = new JRadioButton("Otro");
		rdbtnOtro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnOtro.isSelected()) {
					rdbtnHombre.setSelected(false);
					rdbtnMujer.setSelected(false);
				}
				else { //Esta condición evita que se pueda deseleccionar el RadioButton.
					rdbtnOtro.setSelected(true);
				}
			}
		});
		rdbtnOtro.setBounds(6, 93, 109, 23);
		contentPane.add(rdbtnOtro);
		
		JButton btnBoton = new JButton("Boton");
		btnBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seleccion = null;
				if (rdbtnHombre.isSelected()) {
					seleccion = rdbtnHombre.getText();
				}
				if (rdbtnMujer.isSelected()) {
					seleccion = rdbtnMujer.getText();
				}
				if (rdbtnOtro.isSelected()) {
					seleccion = rdbtnOtro.getText();
				}		
				System.out.println(seleccion);
			}
		});
		btnBoton.setBounds(6, 227, 89, 23);
		contentPane.add(btnBoton);
	}
}
