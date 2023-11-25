package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.Dependencia;
import logica.Expediente;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantaExpteDependencia extends JFrame {

	private JPanel contentPane;
	private JTextField tfNumero;
	private JTextField tfAnio;
	private JTextField tfCaratulaExpediente;
	private JLabel lblCodigo;
	private JTextField tfCodigo;
	private JLabel lblDescripcionDpcia;
	private JTextField tfDescripcionDpcia;
	private String mostrar;
	private JButton btnCargar;
	private JLabel lblmostrarDescripDepcia;

	
	public PantaExpteDependencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(30, 40, 55, 15);
		contentPane.add(lblNumero);

		tfNumero = new JTextField();
		tfNumero.setBounds(190, 40, 86, 20);
		contentPane.add(tfNumero);
		tfNumero.setColumns(10);

		JLabel lblAnio = new JLabel("Anio:");
		lblAnio.setBounds(30, 65, 45, 15);
		contentPane.add(lblAnio);

		tfAnio = new JTextField();
		tfAnio.setBounds(190, 65, 86, 20);
		contentPane.add(tfAnio);
		tfAnio.setColumns(10);

		JLabel lblCaratulaExpte = new JLabel("Caratula expediente:");
		lblCaratulaExpte.setBounds(30, 90, 120, 15);
		contentPane.add(lblCaratulaExpte);

		tfCaratulaExpediente = new JTextField();
		tfCaratulaExpediente.setBounds(190, 90, 86, 20);
		contentPane.add(tfCaratulaExpediente);
		tfCaratulaExpediente.setColumns(10);

		lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(30, 115, 45, 15);
		contentPane.add(lblCodigo);

		tfCodigo = new JTextField();
		tfCodigo.setBounds(190, 115, 86, 20);
		contentPane.add(tfCodigo);
		tfCodigo.setColumns(10);

		lblDescripcionDpcia = new JLabel("Descripcion dependencia:");
		lblDescripcionDpcia.setBounds(30, 140, 150, 15);
		contentPane.add(lblDescripcionDpcia);

		tfDescripcionDpcia = new JTextField();
		tfDescripcionDpcia.setBounds(190, 140, 86, 20);
		contentPane.add(tfDescripcionDpcia);
		tfDescripcionDpcia.setColumns(10);

		lblmostrarDescripDepcia = new JLabel("");
		lblmostrarDescripDepcia.setText(null);
		lblmostrarDescripDepcia.setBounds(65, 200, 176, 14);
		contentPane.add(lblmostrarDescripDepcia);

		btnCargar = new JButton("Cargar");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Expediente ex = new Expediente();
				Dependencia de = new Dependencia();

				int anio = Integer.parseInt(tfAnio.getText());
				ex.setAnio(anio);
				
				int numero = Integer.parseInt(tfNumero.getText());
				ex.setNumero(numero);
				
				long codigo = Long.parseLong(tfCodigo.getText());
				de.setCodigo(codigo);

				
				String dependencia = tfDescripcionDpcia.getText();
				de.setDescripcion(dependencia);

				mostrar = de.mostrarDependencia(dependencia);
				lblmostrarDescripDepcia.setText(mostrar);
				
			}
		});
		
		btnCargar.setBounds(301, 200, 89, 23);
		contentPane.add(btnCargar);
		
	}

}
