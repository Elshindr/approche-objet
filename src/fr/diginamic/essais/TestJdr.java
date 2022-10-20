package fr.diginamic.essais;
import java.util.Scanner;

import fr.diginamic.jdr.Creature;
import fr.diginamic.jdr.Personnage;

public class TestJdr {

	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in) ;
		Personnage perso = null;
		Creature crea = null;
		
		int menu_J = -1;
		int vie = 0;
		int score = 0;
		
		System.out.println("Bonjour! =)");
		
		do{
			System.out.println("Menu:\n1-Création Personnage\n2-Combat!\n3-Score\n0-Quitter");
			menu_J = scanner.nextInt();
			
			switch(menu_J) {
				case 1:
							perso = creationPersonnage(); 
							vie = perso.getPointVie();
							break;
					
							
				case 2:
					
					if(vie <= 0) {
						System.out.println("Votre personnage est décédé. Il a obtenu un score de "+ score + " points. Veuillez créer un nouveau personnage");
					}
					else {
						crea = creationCreature();
						combat(perso, crea);
						score = perso.getScore();
					}
					break;
					
					
				case 3: 
					System.out.println("Votre score est de "+ score + " points.");
					break;
					
					
				case 0:
					System.out.println("A plus pour de nouvelles aventures! o/");
					break;
				
				
				default:
					System.out.println("Saisie non valide");
					break;
			}
			
		
		}while(menu_J != 0);
		
	
		
		scanner.close();
	}
	
	public static void combat(Personnage perso, Creature crea)  {
		int force_P = perso.getForce();
		int vie_P = perso.getPointVie();
		int score = perso.getScore();
		
		int force_C = crea.getForce();
		int vie_C = crea.getPointVie();
		
		
		// Gestion des combats
		do {
			int attaque_P =  force_P +  (int)((Math.random() * (10 - 1)) + 1);
			int attaque_C =  force_C +  (int)((Math.random() * (10 - 1)) + 1);
			System.out.println("Attaque PERSO="+ attaque_P+"   Attaque CREATURE="+ attaque_C);
			
			if(attaque_P > attaque_C) {
				int test = (attaque_C - attaque_P);
				vie_C += test;
				System.out.println("PERSO:: Gagne cette manche! o/ "+test);
				
			}
			else if(attaque_P < attaque_C){
				int test = (attaque_C - attaque_P);
				vie_P += test;
				System.out.println("PERSO:: Perd cette manche! o/" + test);
				
			}
			else {
				System.out.println("Egalite! Incroyable!!  \\o/");
			}
			
		} while(vie_C> 0 && vie_P > 0);
		
		perso.setPointVie(vie_P);
		
		
		// Distribution des scores
		if(vie_P > 0) {
			switch(crea.getType()) {
			case "loup":
				score += 1; break;
			case "gobelin":
				score += 2; break;
			case "troll":
				score += 5; break;
			default: 
				System.out.println("Erreur score! Type non trouvé"); break;
			}
			
			perso.setScore(score);
			System.out.println("Gagné!! Votre score est de :"+ score +" o/");
		}
		else if(vie_C > 0) {
			System.out.println("Perdu!! Votre score est de :"+ score +" o/");
		}
		
	}
	
	/**
	 * Methode de creation de personnage
	 * @return Personnage
	 */
 	public static Personnage creationPersonnage() {
		Personnage perso = new Personnage();

		System.out.println("PERSO:: Vie: "+ perso.getPointVie() +"  Force: "+ perso.getForce()+"  Score: "+ perso.getScore());

		return perso;
	}
	
	/**
	 * Methode de creation de creature
	 * @return Creature
	 */
	public static Creature creationCreature() {
		Scanner scanner = new Scanner(System.in) ;
		String typeCreature = "";
		
		System.out.println("Quelle créature veux tu combattre?\n1-Loup\n2-Gobelin!\n3-Troll\n0-Rien ...");
		int menu_C = scanner.nextInt();
		
		System.out.println(menu_C);
		
		
		
		switch(menu_C) {
			case 1: 
				typeCreature = "loup"; 		 
				break;
				
			case 2: 
				typeCreature = "gobelin";
				break;
				
			case 3: 
				typeCreature = "troll"; 
				break;
				
			case 0: 
				return null;
				
			default: break;
		}
		
		
		Creature creature = new Creature(typeCreature);
		System.out.println(creature.getType().toUpperCase() +":: Vie: "+ creature.getPointVie() +"  Force: "+ creature.getForce());
		
		return creature;
	}
		
}
