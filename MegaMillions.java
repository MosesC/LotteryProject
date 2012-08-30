/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package megamillions;
/*The util package contains the Scanner and Random clasees i need so i just 
 * imported the whole thing
 */
import java.util.*;
/**
 *
 * @author SirCharles
 */
public class MegaMillions {    
    public static int[] ticketGen(){
        //My generator to make the random numbers to go in the array
        Random generator = new Random();
        /*Since the numbers i need are 1-56 i put +1 since the .nextInt method 
        *returns numbers up to n-1, n being the parameter of the method. If I had
        * put 57 in the box it wouldnt work because it could still choose 0.
        */
        int randomNumber1 = generator.nextInt(56) + 1;      //Group 1 has numbers 1-56
        int randomNumber2 = generator.nextInt(46) + 1;      //Group 2 has numbers 1-46
        int ticket[] = new int[6];                          //The array for groups 1 and 2
        for(int i=0; i<5; i++){                             //A loop to put a random number in each 
            ticket[i] = randomNumber1;
        }
        ticket[5] = randomNumber2;
        for (int i=0; i<ticket.length; i++){
            System.out.print(ticket[i]+" ");
        }
        
        return ticket;
    }
    
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
                    ticketGen();
                    break;
                case "2": message1="Thank you. Please wait while your tickets are printed...";
                    ticketGen();
                    System.out.println("");
                    ticketGen();
                    break;
                case "3": message1="Thank you. Please wait while your tickets are printed...";
                    ticketGen();
                    System.out.println("");
                    ticketGen();
                    System.out.println("");
                    ticketGen();               
                    break;
                case "4": message1="Thank you. Please wait while your tickets are printed...";
                    ticketGen();
                    System.out.println("");
                    ticketGen();
                    System.out.println("");
                    ticketGen();
                    System.out.println("");
                    ticketGen();
                    break;
                case "5": message1="Thank you. Please wait while your tickets are printed...";
                    ticketGen();
                    System.out.println("");
                    ticketGen();
                    System.out.println("");
                    ticketGen();
                    System.out.println("");
                    ticketGen();
                    System.out.println("");
                    ticketGen();
                    break;
                default:  System.out.println("\nPlease enter a number 1-5.");
                    i--; 
                    break;
            }     
        }
    }
}

