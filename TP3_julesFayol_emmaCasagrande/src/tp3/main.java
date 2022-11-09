/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

/**
 *
 * @author jules
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nbplace = 5, nbporte= 4, agemin=19, permismin =2, chargecap=500;
        String gamme = "A", identifiant ="AX", modele = "renault kengou", genre = "vehiculeAvecMoteur";
        VehiculeAvecMoteurUtilitaire cars = new VehiculeAvecMoteurUtilitaire(gamme,identifiant, genre,nbplace, nbporte, agemin,  permismin, modele, chargecap);
        
        System.out.println( cars.getroue());
        
    }
    
}
