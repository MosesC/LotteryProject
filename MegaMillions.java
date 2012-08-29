/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package megamillions;
import java.util.Scanner;
/**
 *
 * @author SirCharles
 */
public class MegaMillions {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //A for loop to make sure the user enters a number 1-5
        for (int i=0; i!=1; i++){
            
            //A scanner to take in input
            System.out.println("How many tickets would you like to purchase? [1-5]: ");
            Scanner ticketAmount = new Scanner(System.in); 
            String userInput = ticketAmount.next();
            
            //A switch statement to check if the user entered acceptable data
            String message1;
            switch (userInput){
                case "1": message1="Thank you. Please wait while your ticket is printed...";
                          getTicket();
                          System.out.println(ticket[][]);
                          break;
                case "2": message1="Thank you. Please wait while your tickets are printed...";
                          break;
                case "3": message1="Thank you. Please wait while your tickets are printed...";
                          break;
                case "4": message1="Thank you. Please wait while your tickets are printed...";
                          break;
                case "5": message1="Thank you. Please wait while your tickets are printed...";
                          break;
                default:  System.out.println("\nPlease enter a number 1-5.");
                          i--; 
                          break;
            }     
        }
    }
    public static int[][] getTicket(){
           int[][] ticket = new int[5][1];
           ticket[][] = {{1,2,3,4,5}{1}};
           return ticket;
       }
}

