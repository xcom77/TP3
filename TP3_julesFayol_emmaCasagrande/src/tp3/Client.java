/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

import java.time.LocalDate;

/**
 *
 * @author jules
 */
public class Client {
    
    String emailclient;
    LocalDate permisdate; 
    LocalDate agedate;
    
    public Client(String emailclient, LocalDate permisdate, LocalDate agedate){
     this.emailclient=emailclient;
     this.permisdate=permisdate;
     this.agedate = agedate;
    }
}
