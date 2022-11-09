/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

import java.util.Scanner;
import java.time.*;  

/**
 *
 * @author jules
 */
public class Agence {

    private String nomAgance;
    private Vehicule[] flotteVehicule;
    private Client[] repertoryClient;
    private Location[] agandaLocation;
    
    
    public Agence(String nomAgance,Vehicule[] flotteVehicule,Client[] repertoryClient, Location[] agandaLocation){
      this.nomAgance=nomAgance;
      this.flotteVehicule=flotteVehicule;
      this.repertoryClient=repertoryClient;
      this.agandaLocation=agandaLocation;
        
    }
    
    public Client[] ajouter(Client[] repertoryClient){
        System.out.println("voulez vous ajouter un client ? oui/non");
        Scanner cs1 = new Scanner(System.in);
        boolean information = true;
       while(information){
           String choice=cs1.nextLine();
           if (choice.equals("oui")){
               break;
           }
           if (choice.equals("non")){
               System.out.println("aucun changement, 'non");
               return repertoryClient;
           }
       }
       
       Scanner cs2 = new Scanner(System.in);
       Scanner cs3 = new Scanner(System.in);
       Scanner cs4 = new Scanner(System.in);
       
       while (true){
        System.out.println("entrez votre email :");
        
        String emailClient = cs2.nextLine();
        
        System.out.println("date d'obtention du permis :");
        System.out.println("entrez le jour jj/");
        int JP = cs2.nextInt();
        System.out.println("entrez le mois mm/");
        int MP = cs3.nextInt();
        System.out.println("entrez le jour aaaa/"); 
        int AP = cs4.nextInt();
        
        LocalDate permisdate = LocalDate.of(AP,MP,JP);
        
        System.out.println(" ");
        System.out.println("date de naissance :");
        System.out.println("entrez le jour jj/");
        int JN = cs2.nextInt();
        System.out.println("entrez le mois mm/");
        int MN = cs3.nextInt();
        System.out.println("entrez le jour aaaa/"); 
        int AN = cs4.nextInt();
       
        LocalDate birthdate = LocalDate.of(JN,MN,AN);
        
             System.out.println("");
             System.out.println("verification des information :");
             System.out.println( "la date de naissance du client est le :" + birthdate);
             System.out.println( "la date du permis du client est le :" + permisdate);
             System.out.println( "l'email du client est:" + emailClient);
        
             while (true){
                 System.out.println( "confirmer vous les informations? oui/non");
                 String choice=cs2.nextLine();
                 if (choice.equals("oui")){
                     information = false;
                     break;
                 }
                 if (choice.equals("non")){
                     break;
                 }
             }
       }
        
       return repertoryClient;
    }
}
