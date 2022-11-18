/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

/**
 *
 * @author jules
 */
import java.io.*;
import java.time.LocalDate;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String mail = "juju";
        String mail2 = "alex";
        LocalDate age = LocalDate.of(2003, 07, 07);
        Client client = new Client (mail, age,age);
        Client client2 = new Client (mail2, age,age);
        
        String nomAgance = "lest";
        Vehicule[] flotteVehicule = new Vehicule[0];
        Client[] repertoryClient = new Client[]{client2,client,client};
        Location[] agandaLocation = new Location[0];
        Agence test = new Agence(nomAgance, flotteVehicule,repertoryClient,agandaLocation);
        
        test.ajouter();
        
        for (int i = 0; i < repertoryClient.length; i++){
            System.out.println(test);
        }
       
        
        
    }
    
}
