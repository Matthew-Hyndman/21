package game;

import javax.swing.JOptionPane;

public class BlackJack {
	

	private Hand dealer;
	private Hand player;
	private Deck newDeck;
	
	//constructors
	public BlackJack(Hand dealer, Hand player)
	{
		this.dealer = dealer;
		this.player = player;
		newDeck = new Deck();
	}
	
	//getters and setters
	public Hand getDealer() {
		return dealer;
	}

	public void setDealer(Hand dealer) {
		this.dealer = dealer;
	}

	public Hand getPlayer() {
		return player;
	}

	public void setPlayer(Hand player) {
		this.player = player;
	}

	//to start the game with new cards
	public void kickStart()
	{
		//shuffles deck and picks a random existing card
		newDeck.shuffle();
		
		//picks a new card
		dealer.newCard(newDeck);
		player.newCard(newDeck);
		player.newCard(newDeck);
	}
	
	//gives player a new card
	public void hitme(Hand player) 
	{
		player.newCard(newDeck);
	}
	
	//dealers AI
	public Hand dealersTrun()
	{
		Hand result = dealer;
		
		while(dealer.reHandValue() < 21 && dealer.reHandValue() <= player.reHandValue())
		{
				dealer.newCard(newDeck);
				dealer.aceInHand();
		}
		return result;
	}
	
	//this is checking if the player or dealer has gone bust Pt1
	public boolean bust (Hand whoBusted)
	{
		boolean result = false;
		//checks if the is an ace first and if there is any point to reducing the total
		whoBusted.aceInHand();
		if(whoBusted.reHandValue() > 21)
		{
			result = true;
		}
		return result;
	}
	
	//this is checking if the player or dealer has gone bust Pt2
	public boolean blackJ (Hand whoBusted)
	{
		boolean result = false;
		if(whoBusted.reHandValue() == 21)
		{
			result = true;
		}
		return result;
	}
	
	//concluding the game
	public String endGame()
	{
		String result = "";
		if((player.reHandValue() < dealer.reHandValue()) && dealer.reHandValue() <= 21)
		{
			result = "The Dealer Wins";
		}	
		
		else if((player.reHandValue() == dealer.reHandValue()) && (dealer.reHandValue() == 21) && (player.reHandValue() == 21))
		{
			result = "Draw";
		}	
			
		else
		{
			result = "You Win";
		}	
		return result;
	}
	
}
