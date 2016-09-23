package a.transportadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class JanelaCalculoDiasTransporte extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblCargaTransporte;
	private JLabel lblCapacidadeTransportepor;
	private JTextField txtCapacidade;
	private JTextField txtCargaTransporte;
	private JButton btnCalcular;
	private JLabel lblResultado;
	private JLabel lblResultado2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCalculoDiasTransporte frame = new JanelaCalculoDiasTransporte();
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
	public JanelaCalculoDiasTransporte() {
		setTitle("Quantidade Dias Transporte - Teste de Software");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 198);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblCargaTransporte = new JLabel("Quantidade do produto");
		
		lblCapacidadeTransportepor = new JLabel("Capacidade Carga (toneladas)");
		
		txtCapacidade = new JTextField();
		txtCapacidade.setColumns(10);
		
		txtCargaTransporte = new JTextField();
		txtCargaTransporte.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(this);
		
		lblResultado = new JLabel("New label");
		
		lblResultado2 = new JLabel("New label");
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCapacidadeTransportepor)
								.addComponent(lblCargaTransporte))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtCapacidade, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
								.addComponent(txtCargaTransporte, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGap(207)
							.addComponent(btnCalcular, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addContainerGap(297, Short.MAX_VALUE)
							.addComponent(lblResultado))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addContainerGap(297, Short.MAX_VALUE)
							.addComponent(lblResultado2)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCargaTransporte)
						.addComponent(txtCargaTransporte, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCapacidadeTransportepor)
						.addComponent(txtCapacidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnCalcular)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblResultado)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblResultado2)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void actionPerformed(ActionEvent ev) {
		Object botao = ev.getSource();
		
		if (botao.equals(btnCalcular)) {
			
			int carga;
			int capacidade;
			
			
			try{
				
				
				carga = Integer.parseInt(txtCargaTransporte.getText());
				Empresa cooperativaAgricola = new Empresa();
				cooperativaAgricola.arroz.setKilos(carga);
				
				capacidade = Integer.parseInt(txtCapacidade.getText());
				Transportadora transp = new Transportadora();
				transp.setCapacidadeDiariaTransporte(capacidade);

				lblResultado.setText("São necessarios " + transp.calculoDiasTransporte(carga) + " dias para transporta essa carga");
				lblResultado2.setText("Será necessario " + transp.calculo2DiasTransporte(carga) + " dias para transporta essa carga");
				
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, e);
			}

			
		}
		
	}
}
