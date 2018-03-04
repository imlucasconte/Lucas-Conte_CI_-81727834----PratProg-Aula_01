
public class Quadrado extends Poligono implements Diagonal{

	public Quadrado(double base, double altura) {
		super(base, altura);
	}
	//Variaveis
	double base 	 = super.getBase();
	double altura	 = super.getAltura();
	//*********************************************************\
		//Calculo da area
	@Override
	public double area() {
		double area 	 = base*altura;
		return area;
	}
		//Calculo da diagonal
	@Override
	public double CalcDiagonal() {
		double diagonal  = Math.sqrt((base*base)+(altura*altura));
		return diagonal;
	}
		//Calculo do perimetro
	@Override
	public double perimetro() {
		double calcPeri	  = Math.pow(base,2);
		return calcPeri;
	}
		//Método toSting
	@Override
	public String toString() {
		return "Area: "+area()+"\nPerimetro: "+perimetro()+"\nDiagonal: "+CalcDiagonal();
	}	
}
