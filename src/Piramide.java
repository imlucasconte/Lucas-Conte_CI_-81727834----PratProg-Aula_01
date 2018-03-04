
public class Piramide extends Tridimenssional implements Volume{
		//V�rivaveis
	private double base, altura;
		//M�todo construtor
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
	//M�todo toString
	@Override
	public String toString() {
		return "Volume: "+CalcVolume();
	}
}
