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

    public Client[] ajouter(Client[] repertoryClient) {
        System.out.println("voulez vous ajouter un client ? oui/non");
        Scanner cs1 = new Scanner(System.in);
        boolean information = true;
        while (information) {
            String choice = cs1.nextLine();
            if (choice.equals("oui")) {
                break;
            }
            if (choice.equals("non")) {
                System.out.println("aucun changement, 'non");
                return repertoryClient;
            }
        }

        Scanner cs2 = new Scanner(System.in);
        Scanner cs3 = new Scanner(System.in);
        Scanner cs4 = new Scanner(System.in);

        while (true) {
            System.out.println("entrez votre email :");

            String emailClient = cs2.nextLine();

            System.out.println("date d'obtention du permis :");
            System.out.println("entrez le jour jj/");
            int JP = cs2.nextInt();
            System.out.println("entrez le mois mm/");
            int MP = cs3.nextInt();
            System.out.println("entrez le jour aaaa/");
            int AP = cs4.nextInt();

            LocalDate permisdate = LocalDate.of(AP, MP, JP);

            System.out.println(" ");
            System.out.println("date de naissance :");
            System.out.println("entrez le jour jj/");
            int JN = cs2.nextInt();
            System.out.println("entrez le mois mm/");
            int MN = cs3.nextInt();
            System.out.println("entrez le jour aaaa/");
            int AN = cs4.nextInt();

            LocalDate birthdate = LocalDate.of(JN, MN, AN);

            System.out.println("");
            System.out.println("verification des information :");
            System.out.println("la date de naissance du client est le :" + birthdate);
            System.out.println("la date du permis du client est le :" + permisdate);
            System.out.println("l'email du client est:" + emailClient);

            while (true) {
                System.out.println("confirmer vous les informations? oui/non");
                String choice = cs2.nextLine();
                if (choice.equals("oui")) {
                    information = false;
                    break;
                }
                if (choice.equals("non")) {
                    break;
                }
            }
        }

        //on doit le mettre en string puis convertir en int
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

    }

}
