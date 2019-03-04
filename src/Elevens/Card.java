package Elevens;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
        
        String suit;
        int face;

        public Card(String suit,int face)
        {
            this.face=face;
            this.suit=suit;
        }

	public void setSuit(String suit){
            this.suit=suit;
        }
        public void setFace(int face){
            this.face=face;
        }

        public String getSuit(){
            return suit;
        }
        public int getFace(){
            return face;
        }

        public String toString(){
            return FACES[face]+" of "+suit;
        } 

 }