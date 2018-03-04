
public class Trapezio extends Poligono{
	//Variavéis
	private double baseMaior;
	private double lA;
	private double lB;
		//Construtor
	public Trapezio(double base, double altura, double baseMaior, double ladoA, double lB, double lA){
		super(base, altura);
		this.baseMaior 		= baseMaior;
		this.lA 	   		= lA;
		this.lB       	    = lB;
	}
		// Get e Set LadoA
	public double getLA() {
		return 		     	  lA;
	}
	public void setLadoA(double lA) {
		this.lA 	   		= lA;
	}
		// Get e Set LadoB
	public double getLB() {
		return 		 	 	  lB;
	}
	public void setLB(double lB) {
		this.lB 			= lB;
	}
		// Get e Set BaseMaior
	public double getBaseMaior() {
		return           baseMaior;
	}
	public void setBaseMaior(double baseMaior) {
		this.baseMaior  	= baseMaior;
	}
	//*********************************************************\\
		//Calcula area de Trapezio
	@Override
	public double area() {	
		double area		 	= ((super.getBase()+ baseMaior ) * super.getAltura())/2;
		return area;
	}
		//Calcula perimetro de trapezio
	@Override
	public double perimetro() {
		double perimetro	= super.getBase() + baseMaior + lA + lB;
		return perimetro;
	}
		//Método toSting	
	@Override
	public String toString() {
		return 			"Area: "+area()+"\nPerimetro: "+perimetro();	
	}

}
