package game;

import java.awt.*;
import javax.swing.*;

public class Card {

	private String face; // Jack, Queen or, King Nos. 0-10
	private String suit; // Dims, Hearts, Clubs, Spades
	private int value; // from 1-11
	private ImageIcon cardImage;
	
	//constructors
	public Card()
	{
		this.face = null;
		this.suit = null;
		this.value = 0;
		this.cardImage = null;
	}
	
	public Card(String face, String suit, int value, ImageIcon cardImage)
	{
		this.face = face;
		this.suit = suit;
		this.value = value;
		this.cardImage = cardImage;
	}

	//getters and setters
	public String getFace() {
		return face;
	}

	public String getSuit() {
		return suit;
	}

	public int getValue() {
		return value;
	}

	public ImageIcon getCardImage() {
		return cardImage;
	}
	
	public void setFace(String face) {
		this.face = face;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setCardImage(ImageIcon cardImage) {
		this.cardImage = cardImage;
	}	
	
	//to print card to log
	public String toString()
	{
		return "Face " + this.face + " Suit " + this.suit + " Value " + this.value;
	}
	
}
