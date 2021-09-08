package game;

import java.awt.*;
import javax.swing.*;

import gen.My;


public class Deck {

	Card deckOfCards[];
	private int cardsUsed;
	
	//constructor
	public Deck()
	{
		//array of every card
		deckOfCards = new Card[54];
		cardsUsed = 0;
		
		ImageIcon c2 = new ImageIcon("Clubs2.jpg");
		deckOfCards[0] = new Card("2", "Clubs", 2, c2);
		
		ImageIcon c3 = new ImageIcon("Clubs3.jpg");
		deckOfCards[1] = new Card("3", "Clubs", 3, c3);

		ImageIcon c4 = new ImageIcon("Clubs4.jpg");
		deckOfCards[2] = new Card("4", "Clubs", 4, c4);
		
		ImageIcon c5 = new ImageIcon("Clubs5.jpg");
		deckOfCards[3] = new Card("5", "Clubs", 5, c5);

		ImageIcon c6 = new ImageIcon("Clubs6.jpg");
		deckOfCards[4] = new Card("6", "Clubs", 6, c6);

		ImageIcon c7 = new ImageIcon("Clubs7.jpg");
		deckOfCards[5] = new Card("7", "Clubs", 7, c7);

		ImageIcon c8 = new ImageIcon("Clubs8.jpg");
		deckOfCards[6] = new Card("8", "Clubs", 8, c8);

		ImageIcon c9 = new ImageIcon("Clubs9.jpg");
		deckOfCards[7] = new Card("9", "Clubs", 9, c9);

		ImageIcon c10 = new ImageIcon("Clubs10.jpg");
		deckOfCards[8] = new Card("10", "Clubs", 10, c10);

		ImageIcon cj = new ImageIcon("JackofClubs.jpg");
		deckOfCards[9] = new Card("J", "Clubs", 10, cj);
		
		ImageIcon cq = new ImageIcon("QueenofClubs.jpg");
		deckOfCards[10] = new Card("Q", "Clubs", 10, cq);
		
		ImageIcon ck = new ImageIcon("KingofClubs.jpg");
		deckOfCards[11] = new Card("K", "Clubs", 10, ck);
		
		ImageIcon ca = new ImageIcon("ClubsAce.jpg");
		deckOfCards[12] = new Card("A", "Clubs", 11, ca);
		
		
		
		ImageIcon d2 = new ImageIcon("Dim2.jpg");
		deckOfCards[13] = new Card("2", "Dim", 2, d2);
		
		ImageIcon d3 = new ImageIcon("Dim3.jpg");
		deckOfCards[14] = new Card("3", "Dim", 3, d3);

		ImageIcon d4 = new ImageIcon("Dim4.jpg");
		deckOfCards[15] = new Card("4", "Dim", 4, d4);

		ImageIcon d5 = new ImageIcon("Dim5.jpg");
		deckOfCards[16] = new Card("5", "Dim", 5, d5);

		ImageIcon d6 = new ImageIcon("Dim6.jpg");
		deckOfCards[17] = new Card("6", "Dim", 6, d6);

		ImageIcon d7 = new ImageIcon("Dim7.jpg");
		deckOfCards[18] = new Card("7", "Dim", 7, d7);

		ImageIcon d8 = new ImageIcon("Dim8.jpg");
		deckOfCards[19] = new Card("8", "Dim", 8, d8);

		ImageIcon d9 = new ImageIcon("Dim9.jpg");
		deckOfCards[20] = new Card("9", "Dim", 9, d9);

		ImageIcon d10 = new ImageIcon("Dim10.jpg");
		deckOfCards[21] = new Card("10", "Dim", 10, d10);

		ImageIcon dj = new ImageIcon("JackofDim.jpg");
		deckOfCards[22] = new Card("10", "Dim", 10, dj);

		ImageIcon dq = new ImageIcon("QueenofDim.jpg");
		deckOfCards[23] = new Card("10", "Dim", 10, dq);

		ImageIcon dk = new ImageIcon("KingofDim.jpg");
		deckOfCards[24] = new Card("10", "Dim", 10, dk);

		ImageIcon da = new ImageIcon("DimAce.jpg");
		deckOfCards[25] = new Card("11", "Dim", 11, da);

		
		
		ImageIcon h2 = new ImageIcon("Hearts2.jpg");
		deckOfCards[26] = new Card("2", "Hearts", 2, h2);

		ImageIcon h3 = new ImageIcon("Hearts3.jpg");
		deckOfCards[27] = new Card("3", "Hearts", 3, h3);

		ImageIcon h4 = new ImageIcon("Hearts4.jpg");
		deckOfCards[28] = new Card("4", "Hearts", 4, h4);

		ImageIcon h5 = new ImageIcon("Hearts5.jpg");
		deckOfCards[29] = new Card("5", "Hearts", 5, h5);

		ImageIcon h6 = new ImageIcon("Hearts6.jpg");
		deckOfCards[30] = new Card("6", "Hearts", 6, h6);

		ImageIcon h7 = new ImageIcon("Hearts7.jpg");
		deckOfCards[31] = new Card("7", "Hearts", 7, h7);

		ImageIcon h8 = new ImageIcon("Hearts8.jpg");
		deckOfCards[32] = new Card("8", "Hearts", 8, h8);

		ImageIcon h9 = new ImageIcon("Hearts9.jpg");
		deckOfCards[33] = new Card("9", "Hearts", 9, h9);

		ImageIcon h10 = new ImageIcon("Hearts10.jpg");
		deckOfCards[34] = new Card("10", "Hearts", 10, h10);

		ImageIcon hj = new ImageIcon("JackofHearts.jpg");
		deckOfCards[35] = new Card("J", "Hearts", 10, hj);

		ImageIcon hq = new ImageIcon("QueenofHearts.jpg");
		deckOfCards[36] = new Card("Q", "Hearts", 10, hq);

		ImageIcon hk = new ImageIcon("KingofHearts.jpg");
		deckOfCards[37] = new Card("K", "Hearts", 10, hk);

		ImageIcon ha = new ImageIcon("HeartsAce.jpg");
		deckOfCards[38] = new Card("A", "Hearts", 11, ha);

		
		
		ImageIcon s2 = new ImageIcon("Spaeds2.jpg");
		deckOfCards[39] = new Card("2", "Spaeds", 2, s2);

		ImageIcon s3 = new ImageIcon("Spaeds3.jpg");
		deckOfCards[40] = new Card("3", "Spaeds", 3, s3);

		ImageIcon s4 = new ImageIcon("Spaeds4.jpg");
		deckOfCards[41] = new Card("4", "Spaeds", 4, s4);

		ImageIcon s5 = new ImageIcon("Spaeds5.jpg");
		deckOfCards[42] = new Card("5", "Spaeds", 5, s5);

		ImageIcon s6 = new ImageIcon("Spaeds6.jpg");
		deckOfCards[43] = new Card("6", "Spaeds", 6, s6);

		ImageIcon s7 = new ImageIcon("Spaeds7.jpg");
		deckOfCards[44] = new Card("7", "Spaeds", 7, s7);

		ImageIcon s8 = new ImageIcon("Spaeds8.jpg");
		deckOfCards[45] = new Card("8", "Spaeds", 8, s8);

		ImageIcon s9 = new ImageIcon("Spaeds9.jpg");
		deckOfCards[46] = new Card("9", "Spaeds", 9, s9);

		ImageIcon s10 = new ImageIcon("Spaeds10.jpg");
		deckOfCards[47] = new Card("10", "Spaeds", 10, s10);

		ImageIcon sj = new ImageIcon("JackofSpaeds.jpg");
		deckOfCards[48] = new Card("J", "Spaeds", 10, sj);

		ImageIcon sq = new ImageIcon("QueenofSpaeds.jpg");
		deckOfCards[49] = new Card("Q", "Spaeds", 10, sq);

		ImageIcon sk = new ImageIcon("KingofSpaeds.jpg");
		deckOfCards[50] = new Card("K", "Spaeds", 10, sk);

		ImageIcon sa = new ImageIcon("SpaedsAce.jpg");
		deckOfCards[51] = new Card("A", "Spaeds", 11, sa);
		
		//used for the beginning of the game
		ImageIcon fDown = new ImageIcon("FaceDown.jpg");
		deckOfCards[52] = new Card("?", "Face Down", 0, fDown);
		
		//used to fill in blank space
		ImageIcon blanck = new ImageIcon("EmptySpace.jpg");
		deckOfCards[53] = new Card("Nothing", "Blanck Space", 0, blanck);

	}
	
	//picks a random number, then stores 
	public void pickRandindex()
	{
		int index;
		storInt[0] = index = My.randI(0, 51);
	}
	
	//this only stores one var from the randomly selected number to be sheared in all methods
	int storInt[] = new int[1];
	
	//getting card method: 1
	public Card getCard(int index)
	{
		Card selection = new Card();
		selection = deckOfCards[index];
		return selection;
	}
	
	//getting card method: 2
	public Card getCard2()
	{
		cardsUsed++;
		return deckOfCards[cardsUsed - 1];
	}

	//randomise card selection
	public void shuffle()
	{
		for (int i = 51; i > 0; i--)
		{
			int rand = My.randI(0, i);
			Card temp = deckOfCards[i];
			deckOfCards[i] = deckOfCards[rand];
			deckOfCards[rand] = temp;
		}
		cardsUsed = 0;
	}
	
	//displays card image
	public ImageIcon diplayCard()
	{
		ImageIcon index  = new ImageIcon();
		Card selecet = new Card();
		selecet = getCard(storInt[0]);
		index = selecet.getCardImage();
		return index;
		
	}
	
	//displays specific images
	public ImageIcon displayOtherImages(int space)
	{
		ImageIcon index  = new ImageIcon();
		Card selecet = new Card();
		selecet = getCard(space);
		index = selecet.getCardImage();
		return index;
	}
	
	//gets card value
	public int getVaule()
	{
		int i = 0;
		Card selecet = new Card();
		selecet = getCard(storInt[0]);
		i = selecet.getValue();
		return i;
	}
}
