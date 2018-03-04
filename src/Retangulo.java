
public class Retangulo extends Poligono implements Diagonal{
	//M�todo construtor
	public Retangulo(double base, double altura) {
		super(base, altura);
	}
		//Variav�is
	double base 		= super.getBase();
	double altura 		= super.getAltura();
	//*********************************************************\
		//Calculo da area*
	@Override
	public double area() {
		double area	    = base*altura;
		return area;
		}
		//Calculo da diagonal
	@Override
	public double CalcDiagonal() {
		double diagonal = Math.sqrt((base*base)+(altura*altura));	
		return diagonal;
	}
		//Calculo da perimetro
	@Override
	public double perimetro() {
		//double perimetro = (2 * (super.getBase() + super.getAltura()));
		double perimetro = (2*(altura+base));	
		return perimetro ;
	}
	//M�todo toString
	@Override
	public String toString() {
		return "Area: "+area()+"\nPerimetro: "+perimetro()+"\nDiagonal: "+CalcDiagonal();
	}
	
}


