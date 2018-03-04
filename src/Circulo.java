
public class Circulo extends FiguraCirculo {
		//Variaveis
	private double pi, raio;
		//Método construtor
	public Circulo(double raio) {
		this.pi 		= 3.14;
		this.raio 		= raio;
	}
		// Get e Set da váriavel PI
	public double getPi() {
		return pi;
	}
	public void setPi(float pi) {
		this.pi 		  = pi;
	}
		// Get e Set de Raio
	public double getRaio() {
		return raio;
	}
	public void setRaio(float raio) {
		this.raio 		   = raio;
	}
//*********************************************************\\
		//Calcula area de circulo
	@Override
	public double area() {	
		double area 	   = pi * (raio*raio);
		return area;
	}
		//Calculo da diagonal
	/*@Override
	public double diagonal() {
		return 0;
	}	*/
		//Calcula perimetro de circulo
	@Override
	public double perimetro() {
		double perimetro = (2 * pi) * raio;
		return perimetro;
	}
	@Override
		//Método toString
	public String toString() {
		return "Area: "+area()+"\nPerimetro: "+perimetro();
	}
}
