package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		// 
		Operation[] arrOperation =  new Operation[8];
		double montantTotal = 0;
		
		arrOperation[0] = (Operation)(new Credit("12-12-2001", 144.34));
		arrOperation[1] = (Operation)(new Credit("01-11-2022", 9873.10));
		arrOperation[2] = (Operation)(new Credit("30-04-2004", 43123.33));
		arrOperation[3] = (Operation)(new Credit("17-02-2009", 53478.01));
		
		arrOperation[4] = (Operation)(new Debit("23-12-1201", 14434.00));
		arrOperation[5] = (Operation)(new Debit("16-10-5601", 7644.01));
		arrOperation[6] = (Operation)(new Debit("12-01-2301", 653.65));
		arrOperation[7] = (Operation)(new Debit("12-02-2091", 144.23));

		for(Operation i : arrOperation) {
			System.out.println(i.getType() +" Date: " + i.getDate() + " montant: " + i.getMontant());
			
			if(i.getClass().getName().contains("Debit")) {
				montantTotal-=i.getMontant();
			}
			else if(i.getClass().getName().contains("Credit")) {
				montantTotal+=i.getMontant();
			}
		}
		
		System.out.println(montantTotal);
	}

}
