package projetjava;


import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cla=new Scanner (System.in);
		 int choix =0;
		 do
		 {
		 System.out.println("---------------------------");
		 System.out.println("|     WELCOME            |");
		 System.out.println("|     TO THE MENU        |"); 
		 System.out.println("---------------------------");
		 System.out.println(" 1.     Gestion Groupe        :"); 
		 System.out.println("| 2.    Gestion Etudiant      :");
		 System.out.println("| 3.    Gestion Professeurs   :");
		 System.out.println("| 4.    Gestion Groupe-Professeurs     :");
		 System.out.println("| 5.    Quitter------                    |");
		 System.out.println("-----------------------");
		 System.out.println(" Entrer Votre choix :");
		 System.out.println("-----------------------");
	        choix=cla.nextInt();
	       
	        switch(choix){
	         case 1:
	            System.out.println(" Option 1 selectionné");
	            break;
	         case 2:
	             System.out.println("Option 2 selectionné");
	             System.out.println("----------------------"); 
	         break;
	         case 3: 
	           System.out.println("Option 3 selectionné");
	            
	           break;
	         case 4: 
		           System.out.println("Option 4 selectionné");
		             break;
	         case 5: 
		           System.out.println("Vous voulez quitter");
		           
		             break;
	         default:
	              System.out.println("ERREUR");	
	        }
	} while (true);
		 }
}

