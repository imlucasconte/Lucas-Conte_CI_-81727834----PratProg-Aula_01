
public class Cubo extends Tridimenssional implements Volume{
		//Várivaveis
	private double base;
		//Método construtor
	public Cubo(Quadrado quadrado) {
		this.base 			 = quadrado.getBase();
	}
		//Calcula area de volume
	@Override
	public double CalcVolume() {
		double volume		 = base * 3;
		return volume;
	}
		//Método toString
	@Override
	public String toString() {
		return "Volume: "+CalcVolume();
	}

}
