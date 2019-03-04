package Elevens;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck{

    public static final int NUMCARDS = 52;
    public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
    public static String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
                    "FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
    private List<Card> cards;
    //private int top;

    public Deck(){
    cards=new ArrayList<Card>(52);
    for(int suit=0; suit < SUITS.length; suit++){
        for(int face = 1; face < FACES.length; face++){
            cards.add( new Card(SUITS[suit],face));
            }
        }
    }

    public String dealCard(){
        String ans = cards.get(0).toString();
        cards.add(cards.get(0));
        cards.remove(0);
        return ans;
    }
}
//make a Deck constructor
   	//refer cards to new ArrayList
   	//set top to the top of the deck 51
   	
   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck

   //make a dealCard() method that returns the top card
   
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 
