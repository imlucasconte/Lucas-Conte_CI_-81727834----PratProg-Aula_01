
public class Piramide extends Tridimenssional implements Volume{
		//Várivaveis
	private double base, altura;
		//Método construtor
	public Piramide(Triangulo triangulo) {
		this.base 		= triangulo.getBase();
		this.altura 	= triangulo.getAltura();
	}
	//*********************************************************\
	//Calcula volume de Piramede
	@Override
	public double CalcVolume() {
		double volume 	= ((base*base)*altura)/3;
		return volume;
	}
	//Método toString
	@Override
	public String toString() {
		return "Volume: "+CalcVolume();
	}
}
