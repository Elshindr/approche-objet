package fr.diginamic.operations;

public class CalculMoyenne {
	
	private double[] arrNbs = new double[0];
	
	public CalculMoyenne() {
		super();
	}

	public void ajout(double nvNb) {
		int i = 0;
		
		if(arrNbs.length >= 1 ) {
			
			double[] arrNew = new double[arrNbs.length + 1];
			
			while(i < arrNbs.length){
				arrNew[i] = arrNbs[i];
				i++;
			};
					
			arrNew[i] = nvNb;
			arrNbs = arrNew;
		}
		else {
			arrNbs = new double[arrNbs.length+1];
			arrNbs[i] = nvNb;
		}
	}

	
	public double calcul() {
		double sum = 0;
		
		for(double i : arrNbs) {
			sum += i;
		}
		
		return sum/arrNbs.length;
	}	
}
