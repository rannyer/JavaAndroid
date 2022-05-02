
public class FormaGeometrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calcular a área do quadrado
		
		//area , lado
		
		double area;
		double lado;
		
		lado = 4;
		
		area =  lado*lado; //-> lado² -> Math.pow(lado,2)
		
	
		
		System.out.println(area);
		
		//Area de um círculo
		
		double raio = 5;
		
		double areaCirculo = Math.PI * Math.pow(raio, 2);
		
		//Area de um triangulo
		
		double baseT = 5;
		double alturaT = 5;
		double areaT = (baseT*alturaT)/2;
		System.out.println(areaT);
		
	
		
		
	}

}
