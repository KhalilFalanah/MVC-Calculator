package model;

public class Calculadora {

    private double num;
    private double den;
    private double resultado;
    
    

	public void setNum(double num) {
		this.num = num;
	}

	public void setDen(double den) {
		this.den = den;
	}
	public double getResultado() {
		return resultado;
	}
	
	public void setResultado() {
		if (den != 0) {
            this.resultado = this.num / this.den;
        } else {
            System.out.println("Não é possivel dividir por 0");
        }
    
	}
}
    
    