package Geometrie;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		// 
		ObjetGeometrique[] arrGeom = new ObjetGeometrique[2];
		arrGeom[0] = new Cercle(23);
		arrGeom[1] = new Rectangle(12, 24);
		
		for(ObjetGeometrique i : arrGeom) {
			System.out.println("Perimetre= " + i.perimetre() +" Surface="+ i.surface());
		}

	}

}
