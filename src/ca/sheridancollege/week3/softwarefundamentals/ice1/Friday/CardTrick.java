
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * Name:Anupama Chandran
 * Student Id:991589328
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card c1 = new Card();
       c1.setSuit("Spades");
       c1.setValue(1);
        
       Card c2 = new Card();
       c2.setSuit("Diamonds");
       c2.setValue(2);
       
        System.out.println("Suit is "+ c1.getSuit());
         System.out.println("Suit is "+ c1.getValue());
    }
    
}
