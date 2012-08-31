
package megamillions;
/*The util package contains the Scanner and Random clasees i need so i just 
 * imported the whole thing
 */
import java.util.*;

/**
 * The megaMillions class handles all operations to be performed on the lottery
 * tickets such a generating, sorting, and printing
 * @author SirCharles
 */
public class MegaMillions{
    
    /**
     * The ticketGen() function takes no arguments and generates random numbers
     * into the array for the lottery tickets using a for loop. It also returns 
     * the lottery ticket for use outside of the function. The completed ticket 
     * is printed from here.
     * @return ticket
     */
    public static int[] ticketGen(){
        //My generator to make the random numbers to go in the array
        Random generator = new Random();
        /*Since the numbers i need are 1-56 i put +1 since the .nextInt method 
        *returns numbers up to n-1, n being the parameter of the method. If I had
        * put 57 in the box it wouldnt work because it could still choose 0.
        */
        
        int ticket[] = new int[6];                          //The array for groups 1 and 2
        for(int i=0; i<5; i++){                             //A loop to put a random number in each array index
            ticket[i] = generator.nextInt(56) + 1;
            //if(ticket[i] >= 1 && ticket[i].equals(ticket[i-1]){   //was trying to get it not to repeat random
            //    ticket[i] = generator.nextInt(56)+1;              //numbers inside of a group...
            //}
        }
        ticket[5] = generator.nextInt(46) + 1;              //And putting a number in group 2
        for (int i=0; i<ticket.length; i++){                //Finally a loop to print the completed ticket
            System.out.print(ticket[i]+" ");
        }
        
        return ticket;
    }
    
    /**
     * A method to sort the tickets into ascending order
     * @return 
     */
    //public static int[] ticketSort(){
    //   int[] ticket;
    //   return ticket; 
    //}
    
    /**
     * The main method handles user input and calls the functions for sorting and
     * generating the lottery tickets.
     * @param args none
     */
    public static void main(String[] args) {
        //A for loop to make sure the user enters a number 1-5
        for (int i=0; i!=1; i++){
            
            //A scanner to take in input
            System.out.println("How many tickets would you like to purchase? [1-5]: ");
            Scanner ticketAmount = new Scanner(System.in); 
            String userInput = ticketAmount.next();
            
            //An if-else statement to check if the user entered acceptable data
            if(userInput.equals("1")){              //one ticket is printed
                ticketGen();
            }
            else if(userInput.equals("2")){         //two tickets are printed
                ticketGen();
                System.out.println("");
                ticketGen();
            }
            else if(userInput.equals("3")){         //three tickets are printed
                ticketGen();
                System.out.println("");
                ticketGen();
                System.out.println("");
                ticketGen(); 
            }
            else if(userInput.equals("4")){         //four tickets are printed
                ticketGen();
                System.out.println("");
                ticketGen();
                System.out.println("");
                ticketGen();
                System.out.println("");
                ticketGen();
            }
            else if(userInput.equals("5")){        //five tickets are printed
                ticketGen();
                System.out.println("");
                ticketGen();
                System.out.println("");
                ticketGen();
                System.out.println("");
                ticketGen();
                System.out.println("");
                ticketGen();
            }
            else{                                   //Error message if wrong input
                System.out.println("\nPlease enter a number 1-5.");
                i--; 
            }
        }
    }
}

