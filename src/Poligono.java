
public abstract class Poligono extends Figura{
		//Variav�is
	private double base;
	private double altura;
	public abstract double area();
	public abstract double perimetro();
		//M�todo construtor
	public Poligono(double base, double altura) {
		super();
		this.base	  = base;
		this.altura	  = altura;
	}
		//Get e Set Base*
	public double getBase() {
		return		    base;
	}
	public void setBase(double base) {
		this.base     = base;
	}
		//Get e Set Altura*
	public double getAltura() { 
		return           altura;
	}
	public void setAltura(double altura) {
		this.altura    = altura;
	}
//*********************************************************\\
		//M�todo toSting	
	@Override
	public String toString() {
		return "Area: "+area()+"\nPerimetro: "+perimetro();
	}

}
