
public class Esfera extends Tridimenssional implements Volume {
		//Variav�is
	private double raio, pi;
		//M�todos construtor
	public Esfera(Circulo circulo){
		this.raio 			= circulo.getRaio();
		this.pi			    = circulo.getPi();
	}
	//*********************************************************\
		//Calcula volume de Esfera
	@Override
	public double CalcVolume() {
		double volume 		= (4*pi*(Math.pow(raio,3))/3);
		return volume;
	}
		//M�todo toString
	@Override
	public String toString() {
		return "Volume: "+CalcVolume();
	}
}
