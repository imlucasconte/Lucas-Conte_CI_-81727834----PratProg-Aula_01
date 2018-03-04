
public class Triangulo extends Poligono {
	public Triangulo(double base, double altura) {
		super(base, altura);
	}
		//Calculo da area
	@Override
		public double area() {
		double area 		= (super.getBase()*super.getAltura())/2;	
		return area;
		}
		/*Calculo da diagonal
	@Override
		return null;
	}*/
		//Calculo do perimetro
	@Override
	public double perimetro() {
		double perimetro 	= (2 * (super.getBase() + super.getAltura()));
		return perimetro ;
	}
	@Override
	public String toString() {
		return "Area: "+area()+"\nPerimetro: "+perimetro();
	}
}

	
