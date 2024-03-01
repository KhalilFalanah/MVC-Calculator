package view;

import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.CalculadoraControlador;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Font;


public class TelaCalculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPanel1;
	private JTextField txtPrimeiro;
	private JTextField txtSegundo;
	private JButton btnLimpar;
	private JButton btnDividir;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalculadora frame = new TelaCalculadora();
					CalculadoraControlador controller = new CalculadoraControlador(frame);
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
	public TelaCalculadora() {
		setTitle("Atividade Prática I - Khalil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 250);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		///////////////////////Painel 1//////////////////////////
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel1);
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
		
		txtPanel1 = new JTextField();
		txtPanel1.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtPanel1.setPreferredSize(new Dimension(600,70));
		panel1.add(txtPanel1);
	
		
		///////////////////////Painel 2//////////////////////////
		
		JPanel panel2 = new JPanel();
		panel2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel2.setBackground(Color.pink); /* Definindo a cor Rosa*/
		FlowLayout flowLayout_1 = (FlowLayout) panel2.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel2);
		
		panel2.add(Box.createVerticalStrut(90));
		
		JLabel lblPrimeiroN = new JLabel("Primeiro Número");
		lblPrimeiroN.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel2.add(lblPrimeiroN);
		
		txtPrimeiro = new JTextField();
		txtPrimeiro.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel2.add(txtPrimeiro);
		txtPrimeiro.setColumns(10);
		
		JLabel lblSegundoN = new JLabel("Segundo Número");
		lblSegundoN.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel2.add(lblSegundoN);
		
		txtSegundo = new JTextField();
		txtSegundo.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel2.add(txtSegundo);
		txtSegundo.setColumns(10);
		
		///////////////////////Painel 3//////////////////////////
		
		JPanel panel3 = new JPanel();
		panel3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel3.setBackground(Color.pink);/* Definindo a cor Rosa*/
		FlowLayout flowLayout = (FlowLayout) panel3.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel3);
		
		btnDividir = new JButton("Dividir");
		btnDividir.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		panel3.add(btnDividir);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel3.add(btnLimpar);
		
		
	}
	

	public JTextField getTxtPanel1() {
		return txtPanel1;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}	
	public JButton getBtnDividir() {
		return btnDividir;
	}

	public JTextField getTxtPrimeiro() {
		return txtPrimeiro;
	}

	public JTextField getTxtSegundo() {
		return txtSegundo;
	}

	public void limpaTela() {
		txtPanel1.setText("");
		txtPrimeiro.setText("");
		txtSegundo.setText("");
	}

	


}
