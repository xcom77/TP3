/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author jules
 */
public class VehiculeSansMoteur extends Vehicule {
    private int Nbroue;
    
    
    public VehiculeSansMoteur(String gamme, String identifiant, String genre, int nbplace, int Nbroue){
        super(gamme,identifiant,genre,nbplace);
        this.Nbroue=Nbroue;
    }
    
    public String toString(){
        
        return ( super.toString() + " le vehicule possède : " + Nbroue + " roues");
    }
    
   
}
