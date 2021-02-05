
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * Name:Anupama Chandran
 * Student Id:991589328
 */
public class CardTrick {
    public static void main(String[] args)
    {
       //Creating Object c1
       Card c1 = new Card();
       
       //Setting values to Suit and Value in Object c1
       c1.setSuit("Spades");
       c1.setValue(1);
       
       //Creating Object c2
       Card c2 = new Card();
       
       //Setting values to Suit and Value in Object c2
       c2.setSuit("Diamonds");
       c2.setValue(2);
       
       //Printing Object c1 Suit and Value
        System.out.println("Suit is "+ c1.getSuit());
         System.out.println("Suit is "+ c1.getValue());
    }
    
}
