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

    public Agence(String nomAgance, Vehicule[] flotteVehicule, Client[] repertoryClient, Location[] agandaLocation) {
        this.nomAgance = nomAgance;
        this.flotteVehicule = flotteVehicule;
        this.repertoryClient = repertoryClient;
        this.agandaLocation = agandaLocation;

    }

    public void ajouter() {
        

        Client client = new Client(emailClient, permisdate, birthdate);

        int tab_length_0;
        tab_length_0 = repertoryClient.length;
        Client[] tabtemp = new Client[tab_length_0 + 1]; // creation d'une liste de taille n+1

        for (int i = 0; i < tab_length_0; i++) {
            tabtemp[i] = repertoryClient[i]; // transfert des valeurs vers le nouveau tableau
        }
        tabtemp[tab_length_0] = client; // ajoue de la nouvelle valeur dans la tab n+1 du tableau 

        tab_length_0 = tabtemp.length;
        System.out.println(tab_length_0);
        
        
        if (tab_length_0 > 2) {
       int c=tab_length_0-1;   
       Client clientemp;
       while(c-1>0 && !tabtemp[c].placerApres(tabtemp[c-1].emailclient)){
           System.out.println(c);
           clientemp = tabtemp[c];
           tabtemp[c]=tabtemp[c-1];
           tabtemp[c-1]=clientemp;
           c--;
       }
       for(int i = 0; i<tab_length_0;i++)
           System.out.println(tabtemp[i].emailclient);
       
       repertoryClient = tabtemp;
       
              for(int i = 0; i<tab_length_0;i++)
           System.out.println(repertoryClient[i].emailclient);
       
    }
    }


    

    public Location[] ajouter(Location[] agandaLocation) {

        System.out.println("voulez vous ajouter une date de location ? oui/non");
        Scanner cs1 = new Scanner(System.in);
        boolean information = true;
        while (information) {
            String choice = cs1.nextLine();
            if (choice.equals("oui")) {
                break;
            }
            if (choice.equals("non")) {
                System.out.println("aucun changement, 'non");
                return agandaLocation;
            }
        }

        System.out.println("mettez la date de location");

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        System.out.println("le jour");
        int jour = sc1.nextInt();
        System.out.println("le mois");
        int mois = sc2.nextInt();
        System.out.println("l'annee");
        int an = sc3.nextInt();

        LocalDate locationDate = LocalDate.of(jour, mois, an);

        //not finished 
        return agandaLocation;
    }

    public Vehicule[] ajouter(Vehicule[] flotteVehicule) {

        System.out.println("que voulez vous faire?");
        System.out.println("1/ ajouter vehicule sans moteur");
        System.out.println("2/ ajouter une vehicule");
        System.out.println("3/ ajouter un utilitaire");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1) {

            Scanner sc1 = new Scanner(System.in);
            System.out.println("identifiant");
            String id = sc1.nextLine();

            Scanner sc2 = new Scanner(System.in);
            System.out.println("gamme: A, B, C ou D?");
            String gam = sc2.nextLine();

            Scanner sc3 = new Scanner(System.in);
            System.out.println("1 - VTT");
            System.out.println("2 - Tandem");
            System.out.println("3 - Tricycle");
            System.out.println("4 - Berline");
            System.out.println("5 - Monospace");
            System.out.println("6 - Cabriolet");
            System.out.println("7 - Camionnette");
            System.out.println("8 - Fourgonnette");
            System.out.println("9 - Pickup");
            int gen = sc3.nextInt();

            Scanner sc4 = new Scanner(System.in);
            System.out.println("nombre de places");
            int nbPl = sc4.nextInt();

            Scanner sc5 = new Scanner(System.in);
            System.out.println("nombre de roues");
            int nbR = sc5.nextInt();

        }
        if (choice == 2) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("identifiant");
            String id = sc1.nextLine();

            Scanner sc2 = new Scanner(System.in);
            System.out.println("gamme: A, B, C ou D?");
            String gam = sc2.nextLine();

            Scanner sc3 = new Scanner(System.in);
            System.out.println("1 - VTT");
            System.out.println("2 - Tandem");
            System.out.println("3 - Tricycle");
            System.out.println("4 - Berline");
            System.out.println("5 - Monospace");
            System.out.println("6 - Cabriolet");
            System.out.println("7 - Camionnette");
            System.out.println("8 - Fourgonnette");
            System.out.println("9 - Pickup");
            int gen = sc3.nextInt();

            Scanner sc4 = new Scanner(System.in);
            System.out.println("nombre de places");
            int nbPl = sc4.nextInt();

            Scanner sc5 = new Scanner(System.in);
            System.out.println("nombre de portes");
            int nbPort = sc5.nextInt();

            Scanner sc6 = new Scanner(System.in);
            System.out.println("modele");
            String mod = sc6.nextLine();

            Scanner sc7 = new Scanner(System.in);
            System.out.println("voulez vous ajouter plus d'informations? oui/non");
            String answer = sc7.nextLine();

            if (answer == "oui") {
                Scanner sc8 = new Scanner(System.in);
                System.out.println("age minimum");
                int agemin = sc8.nextInt();

                Scanner sc9 = new Scanner(System.in);
                System.out.println("nombre d'annees de permis requis");
                int nbAn = sc9.nextInt();
            }

        }
        
        if (choice == 3) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("identifiant");
            String id = sc1.nextLine();

            Scanner sc2 = new Scanner(System.in);
            System.out.println("gamme: A, B, C ou D?");
            String gam = sc2.nextLine();

            Scanner sc3 = new Scanner(System.in);
            System.out.println("1 - VTT");
            System.out.println("2 - Tandem");
            System.out.println("3 - Tricycle");
            System.out.println("4 - Berline");
            System.out.println("5 - Monospace");
            System.out.println("6 - Cabriolet");
            System.out.println("7 - Camionnette");
            System.out.println("8 - Fourgonnette");
            System.out.println("9 - Pickup");
            int gen = sc3.nextInt();

            Scanner sc4 = new Scanner(System.in);
            System.out.println("nombre de places");
            int nbPl = sc4.nextInt();         
            
            Scanner sc5 = new Scanner(System.in);
            System.out.println("modele");
            String mod = sc5.nextLine();            
            
            Scanner sc6 = new Scanner(System.in);
            System.out.println("nombre de portes");
            int nbPort = sc6.nextInt();
        }

    // a finir 
    return flotteVehicule;
}
}
