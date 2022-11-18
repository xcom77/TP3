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

    public void ajouter(String emailClient, LocalDate permisdate, LocalDate birthdate) {
        

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


    

    public void ajouter(Location[] agandaLocation) {

     
    }

    public void ajouter(Vehicule[] flotteVehicule) {

        

    // a finir 
}
}
