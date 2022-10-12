package fr.diginamic.maison;

public abstract class Maison {
	
	private static Piece[] arrPieces = null;
	
	public static void ajouterPiece(Piece piece) {
		
		if(arrPieces == null) {
			arrPieces = new Piece[1];
			arrPieces[0] = piece;
		}
		else {
			Piece[] arrNewPiece = new Piece[arrPieces.length + 1];
			int i = 0;
			for(Piece unePiece : arrPieces) {
				arrNewPiece[i] = unePiece;
				i++;
			}
			
			arrNewPiece[i] = piece;
			arrPieces = arrNewPiece;
		}
	}
	
	public static double getSuperficieTotal() {
		double sum = 0;
		
		for(Piece i : arrPieces) {
			sum += i.getSuperficie();
		}
		
		return sum; 
	}
	
	public static double getSuperficieEtage(int etage) {
		double sum = 0;
		
		for(Piece i : arrPieces) {
			if(etage == i.getNumEtage()) {
				sum += i.getSuperficie();
			}
		}
		
		return sum; 
	}
}
