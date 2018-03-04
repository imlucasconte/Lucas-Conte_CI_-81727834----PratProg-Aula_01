
public class Losango extends Poligono {

	public Losango(double base, double altura) {
		super(base, altura);
	}
	//Variavéis
	double base		 	 = super.getBase();
	double altura 	     = super.getAltura();
	//*********************************************************\
	//Calculo da area
	@Override
	public double area() {
		double area 	  = (base*altura);
		return area;
	}
	/*Calculo da diagonal
	@Override
	public double CalcDiagonal() {
		double base = super.getBase();
		double altura = super.getAltura();
		double CalcDiagonal = Math.sqrt((base*base)+(altura*altura));
		return CalcDiagonal;
	}*/
	//Calculo de perimetro
	@Override
	public double perimetro() {
		double perimetro    = (4*altura);
		return perimetro;
	}
	//Método toSting
	@Override
	public String toString() {
		return "Area: "+area()+"\nPerimetro: "+perimetro();
	}	
}

