
public class Cubo extends Tridimenssional implements Volume{
		//V�rivaveis
	private double base;
		//M�todo construtor
	public Cubo(Quadrado quadrado) {
		this.base 			 = quadrado.getBase();
	}
		//Calcula area de volume
	@Override
	public double CalcVolume() {
		double volume		 = base * 3;
		return volume;
	}
		//M�todo toString
	@Override
	public String toString() {
		return "Volume: "+CalcVolume();
	}

}
