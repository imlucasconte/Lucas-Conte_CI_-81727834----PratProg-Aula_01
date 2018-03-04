
public class Esfera extends Tridimenssional implements Volume {
		//Variavéis
	private double raio, pi;
		//Métodos construtor
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
		//Método toString
	@Override
	public String toString() {
		return "Volume: "+CalcVolume();
	}
}
