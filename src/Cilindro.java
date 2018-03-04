
public class Cilindro extends Tridimenssional implements Volume {
		//V�rivaveis
	private double altura, raio, pi;
		// M�todo construtor
	public Cilindro(Circulo circulo, double altura) {
		this.raio 			= circulo.getRaio();
		this.pi			    = circulo.getPi();
		this.altura 		= altura;
	}
		//Calcula volume de cilindro
	@Override
	public double CalcVolume(){
		double volume 		= pi*(Math.pow(raio, 3)*altura);
		return volume;
	}
		//M�todo toString
	@Override
	public String toString() {
		return "Volume: "+CalcVolume();
	}
}
