package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperation {
	public static void main(String[] args) {
		System.out.println(Operations.calcul(12,23,'+'));
		System.out.println(Operations.calcul(12,23,'-'));
		System.out.println(Operations.calcul(12,23,'/'));
		System.out.println(Operations.calcul(12,23,'*'));
		System.out.println(Operations.calcul(12,23,'µ'));
	}
}
