package game;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Hand {
	
	Card inHand[];
	
	int handValue, noOfCards;
	
	public Hand()
	{
		inHand = new Card[5];
		handValue = 0;
		noOfCards = 0;
	}

	//if new card is ask for the player and dealer
	public Card newCard(Deck newDeck)
	{
		//if the card limit is reached
		if(noOfCards == 5)
		{
			JOptionPane.showMessageDialog(null,"You have reached the limit.\n you must press stay");
			return inHand[noOfCards-1];
		}
		
		//getting card
		inHand[noOfCards] = newDeck.getCard2();
		
		//getting value
		handValue += inHand[noOfCards].getValue();

		//printing to log
			System.out.print("\n inserted new:  " + inHand[noOfCards].getFace() + "  " + inHand[noOfCards].getSuit());

		//raising for next position
		noOfCards++;
		return inHand[noOfCards-1];
	}
	
	//checking if there is an ace in hand
	public void aceInHand()
	{
		for(int i = 0; i < noOfCards; i++)
		{
			if(inHand[i].getValue() == 11)
			{
				//if true then lowers value be -10
				if(handValue > 21)
				{
					inHand[i].setValue(1);
					handValue -= 10;
				}
			}
			System.out.print("\n\t Handval: " + handValue);
		}
		
	}
	//returns card position/index	
	public Card reIndexInHand(int index)
	{
		System.out.print("\n" + inHand[index] );
		return inHand[index];
	}
	
	//returns number of cards
	public int reNoOfCards()
	{
		return noOfCards;	
	}
	
	//returns total value in hand
	public int reHandValue()
	{
		return handValue;
	}
	
	//changes total value
	public int setHandValue(int i)
	{
		return this.handValue = i;
	}

	
}
