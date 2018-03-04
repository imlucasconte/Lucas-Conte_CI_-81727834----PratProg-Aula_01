import java.util.ArrayList;
public class Geometria {

	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<>();
		//Array figuras 		
		Circulo circulo 	= new Circulo(10);
		Losango losango 	= new Losango(15,5);
		Quadrado quadrado 	= new Quadrado(10,5);
		Retangulo retangulo = new Retangulo(15,10);
		Triangulo triangulo = new Triangulo(4,4);
		Trapezio trapezio 	= new Trapezio(10,2,15,9,4,1);
		Esfera esfera 		= new Esfera(circulo);
		Cilindro cilindro 	= new Cilindro(circulo,10);
		Piramide piramide 	= new Piramide(triangulo);
		Cubo cubo 			= new Cubo(quadrado);
		//Adiciona figuras
		figuras.add(circulo);
		figuras.add(losango);
		figuras.add(quadrado);
		figuras.add(retangulo);
		figuras.add(triangulo);
		figuras.add(trapezio);
		//Adciona figuras 3D
		figuras.add(esfera);
		figuras.add(cilindro);
		figuras.add(piramide);
		figuras.add(cubo);
		for(Figura fig:figuras) {
			String nomeClasse1 = fig.getClass().getName();
			System.out.println("Figura " + nomeClasse1+": \n"+fig+"\n");		
		}
	}
}
