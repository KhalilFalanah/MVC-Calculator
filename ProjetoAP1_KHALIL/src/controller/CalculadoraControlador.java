package controller;
	
import view.TelaCalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Calculadora;
	
public class CalculadoraControlador  implements ActionListener {
		
	private TelaCalculadora view;
	private Calculadora model;
	

	public CalculadoraControlador(TelaCalculadora view) {
		this.view = view;
		this.model = new Calculadora();
		view.getBtnLimpar().addActionListener(this);
		view.getBtnDividir().addActionListener(this);
	}
			
			
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == view.getBtnLimpar()) {		
			view.limpaTela();

		        }
				else if (e.getSource() == view.getBtnDividir()) {
	
					try {
		                double num = Double.parseDouble(view.getTxtPrimeiro().getText());
		                double den = Double.parseDouble(view.getTxtSegundo().getText());
		                
		                model.setNum(num);
		                model.setDen(den);
		                model.setResultado();
		           

		                double resultado = model.getResultado();
		                

		                view.getTxtPanel1().setText(String.valueOf(resultado));

					}
					catch (NumberFormatException ex) {
						System.out.println("Valor invalido!");
					}
		        }
			}
			
			
		
		}
