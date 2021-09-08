package game;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

import gen.My;

public class GUI2 extends JPanel implements ActionListener{
	
	int toAdd = 0, toAddAI = 0;

	private JLabel lAIcard1, lAIcard2, lAIcard3, lAIcard4, lAIcard5, AIname, lAITotleName;
	private JLabel lcard1, lcard2, lcard3, lcard4, lcard5, lname, lTotleName, lNoOfWinsName, lNoOfLossName;
	private JLabel totlePoints, totlePointsAI, lNoOfWins, lNoOfLoss;
	private JButton bhitme, bstay, bAgain, bHelp;
	
	Hand dealer = new Hand();
	Hand player = new Hand();
	BlackJack game = new BlackJack(dealer, player);

	int noOfWins[] = new int[1];
	int noOfLoss[] = new int[1];
	
	JPanel pNorth = new JPanel();
	JPanel pSouth = new JPanel();
	JPanel pCenter = new JPanel();
	JPanel pEast = new JPanel();

	JLabel playerCard1=new JLabel();
	Card aCard ;
	Deck newDeck;

	//Graphic User Interface
	public GUI2()
	{
		//Win and Loss Counter
		noOfWins[0] = 0;
		noOfLoss[0] = 0;
		//Win and loss counter formating/////////////////////////////
		lNoOfWins = new JLabel(String.valueOf(noOfWins[0]));
		lNoOfWins.setFont(new Font("Arial", Font.BOLD, 20));

		lNoOfWinsName = new JLabel("No of wins");
		lNoOfWinsName.setFont(new Font("Arial", Font.BOLD, 20));

		lNoOfLoss = new JLabel(String.valueOf(noOfLoss[0]));
		lNoOfLoss.setFont(new Font("Arial", Font.BOLD, 20));

		lNoOfLossName = new JLabel("No of Loses");
		lNoOfLossName.setFont(new Font("Arial", Font.BOLD, 20));
		
		//Declaring "aCard" and "newDeck" as Objects
		aCard = new Card();
		newDeck = new Deck();
		
		/********************************
		 * This is Declaring a random int for the index, adding it to position(basically JLabel)
		 * and adding it to the total
		 **********************************/
		newDeck.pickRandindex();
		lcard1 = new JLabel (newDeck.diplayCard());
		toAdd += newDeck.getVaule();
		
		lcard1 = new JLabel();
		lcard2 = new JLabel();
		
		//setting other positions to a blank space 
		ImageIcon blancks = newDeck.displayOtherImages(53);
		lcard3 = new JLabel (blancks);
		lcard4 = new JLabel (blancks);
		lcard5 = new JLabel (blancks);

		//formating and displaying the total
		totlePoints = new JLabel(String.valueOf(toAdd));
		totlePoints.setFont(new Font("Arial", Font.BOLD, 20));
						
		//adding labels
		setLayout(new BorderLayout());
		pCenter.add(lcard1);
		pCenter.add(lcard2);
		pCenter.add(lcard3);
		pCenter.add(lcard4);
		pCenter.add(lcard5);
		
		//setting up and formating the Dealer
		newDeck.pickRandindex();
		lAIcard1 = new JLabel (newDeck.diplayCard());
		toAddAI += newDeck.getVaule();

		//setting the second card as a face down
		ImageIcon fDown = newDeck.displayOtherImages(52);
		lAIcard2 = new JLabel (fDown);
		
		lAIcard3 = new JLabel (blancks);
		lAIcard4 = new JLabel (blancks);
		lAIcard5 = new JLabel (blancks);

		totlePointsAI = new JLabel(String.valueOf(toAddAI));
		totlePointsAI.setFont(new Font("Arial", Font.BOLD, 20));

	
		
		setLayout(new BorderLayout());
		pCenter.add(lAIcard1);
		pCenter.add(lAIcard2);
		pCenter.add(lAIcard3);
		pCenter.add(lAIcard4);
		pCenter.add(lAIcard5);
			
		//getting values
		game.kickStart();
		
		//outputting values
		totlePointsAI.setText(String.valueOf(dealer.handValue));
		totlePoints.setText(String.valueOf(player.handValue));
		
		//DEALERS HAND DISPLAYED

		ImageIcon card1 = dealer.reIndexInHand(0).getCardImage();
		lAIcard1.setIcon(card1);
		lAIcard2.setIcon(fDown);
		
		//PLAYERS HAND DISPLAYED
				
		displayPlayersHand();

		//formatting buttons and labels
		lname = new JLabel("You, the Player");
		lname.setBackground(Color.decode("#008080"));
		lname.setFont(new Font("Arial", Font.BOLD, 20));
		
		AIname = new JLabel("Dealer (AI)");
		AIname.setBackground(Color.decode("#008080"));
		AIname.setFont(new Font("Arial", Font.BOLD, 20));
		
		lTotleName = new JLabel(" You ");
		lTotleName.setFont(new Font("Arial", Font.BOLD, 20));
		
		lAITotleName = new JLabel("Dealer");
		lAITotleName.setFont(new Font("Arial", Font.BOLD, 20));
		
		bhitme = new JButton("Hit Me");
		bhitme.setBackground(Color.decode("#008080"));
		bhitme.setFont(new Font("Arial", Font.BOLD, 20));
		bhitme.addActionListener(this);
		
		bstay = new JButton(" Stay ");
		bstay.setBackground(Color.decode("#008080"));
		bstay.setFont(new Font("Arial", Font.BOLD, 20));
		bstay.setSize(20, 20);
		bstay.addActionListener(this);
				
		bAgain = new JButton("Play Again");
		bAgain.setBackground(Color.decode("#696969"));
		bAgain.setFont(new Font("Arial", Font.BOLD, 20));
		bAgain.setSize(20, 20);
		bAgain.addActionListener(this);
		
		bHelp = new JButton("Help");
		bHelp.setBackground(Color.decode("#008080"));
		bHelp.setFont(new Font("Arial", Font.BOLD, 20));
		bHelp.addActionListener(this);
				
		pEast.setLayout(new GridLayout(7, 2));
		pCenter.setLayout(new GridLayout(2, 5));
		pEast.add(bhitme);
		pEast.add(bstay);
		pEast.add(lTotleName);
		pEast.add(totlePoints);
		pEast.add(lAITotleName);
		pEast.add(totlePointsAI);
		pEast.add(bAgain);
		pEast.add(bHelp);
		pEast.add(lNoOfLossName);
		pEast.add(lNoOfLoss);
		pEast.add(lNoOfWinsName);
		pEast.add(lNoOfWins);
		pNorth.add(lname);
		pSouth.add(AIname);
		
		//Declaring Panels
		add(pCenter, BorderLayout.CENTER);
		add(pSouth, BorderLayout.SOUTH);
		add(pEast, BorderLayout.EAST);
		add(pNorth, BorderLayout.NORTH);

		//colouring total
		if(player.reHandValue() <= 10)
		{
			totlePoints.setForeground(Color.decode("#FF0000"));
		}
			
		else if(player.reHandValue() <= 15)
		{
			totlePoints.setForeground(Color.decode("#FF8C00"));
		}
			
		else if(player.reHandValue() <= 20)
		{
			totlePoints.setForeground(Color.decode("#32CD32"));
		}
			
		else if(player.reHandValue() == 21)
		{
			totlePoints.setForeground(Color.decode("#FFD700"));
		}
		
		bAgain.setEnabled(false);
		
	}
	
	//displaying the main game
	public void displayGame()
	{
		JFrame gameFrame = new JFrame("21");
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setContentPane(this);
		gameFrame.setPreferredSize(new Dimension(1025, 600));
		gameFrame.setResizable(false);
		gameFrame.pack();
		gameFrame.setVisible(true);
	}

	
	
	
	private JTextArea rul1;
	private JPanel pCenter2;
	private JFrame gameHelp;
	
	public void actionPerformed(ActionEvent e) 
	{
		//display the help window
		if(e.getSource() == bHelp)
		{
			gameHelp = new JFrame("Rules");
			gameHelp.setResizable(false);
			pCenter2 = new JPanel(); 
			gameHelp.setPreferredSize(new Dimension(800, 270));
			gameHelp.setLocation(100, 590);
			gameHelp.pack();
			gameHelp.setVisible(true);
				
			//opening txt file
			try
			{
			String text = "";
			rul1 = new JTextArea();
				BufferedReader file = new BufferedReader(new FileReader("Rules1.txt"));
				boolean end = false;
				while(end != true)
				{
					text = file.readLine();
					if(text != null)
					{
						rul1.append(text +" " + "\n");
					}
					else
						end = true;
				}
			}
				
		catch(FileNotFoundException noFile)
		{
			System.out.print("File Rules1.txt is not found");
		}
		catch(IOException noFile)
		{
			System.out.print("File Rules1.txt has is a problem");
		}
			//formating text area
			rul1.setBackground(Color.decode("#008000"));
			rul1.setForeground(Color.decode("#000000"));
			rul1.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 22));
			rul1.setEditable(false);
			
			pCenter2.add(rul1);
			gameHelp.add(pCenter2, BorderLayout.CENTER);

		}
		
		//when the "Hit me" button 
		if (e.getSource() == bhitme)
		{
			//getting new value
			game.hitme(player);
			
			//displaying new card
			displayPlayersHand();
			
			//displaying new total
			totlePoints.setText(String.valueOf(player.handValue));
			
			//if total passes 21
			if (game.bust(player))
			{
				noOfLoss[0]++;
				lNoOfLoss.setText(String.valueOf(noOfLoss[0]));
				JOptionPane.showMessageDialog(null, "You have gone Bust");
				bhitme.setEnabled(false);
				bstay.setEnabled(false);
				bAgain.setEnabled(true);
				bAgain.setBackground(Color.decode("#008080"));	
			}
			
			totlePoints.setText(String.valueOf(player.handValue));
			
			//printing the for log
			for(int i = 0; i<player.noOfCards; i++)
			System.out.print("\n\n\t PLayer Card: " + player.inHand[i] + "\t Index: " + i);

			//colouring the total 
			if(player.reHandValue() <= 10)
			{
				totlePoints.setForeground(Color.decode("#FF0000"));
			}
				
			else if(player.reHandValue() <= 15)
			{
				totlePoints.setForeground(Color.decode("#FF8C00"));
			}
				
			else if(player.reHandValue() <= 20)
			{
				totlePoints.setForeground(Color.decode("#32CD32"));
			}
				
			else if(player.reHandValue() == 21)
			{
				totlePoints.setForeground(Color.decode("#FFD700"));
			}
			
		}
		
		//if the "Stay" button was clicked 
		if (e.getSource() == bstay)
		{
			//runs Dealers AI
			dealer = game.dealersTrun();
						
			//display Dealr's Cards
			displayDealerHand();
			
			//display total
			totlePointsAI.setText(String.valueOf(dealer.handValue));
						
			//concluding game
			JOptionPane.showMessageDialog(null, game.endGame());
			
			if(game.endGame() == "The Dealer Wins")
			{
				noOfLoss[0]++;
				lNoOfLoss.setText(String.valueOf(noOfLoss[0]));
			}
			
			else if(game.endGame() == "You Win")
			{
				noOfWins[0]++;
				lNoOfWins.setText(String.valueOf(noOfWins[0]));
			}
			
			bhitme.setEnabled(false);
			bstay.setEnabled(false);			
			bAgain.setEnabled(true);
			bAgain.setBackground(Color.decode("#008080"));

		}
		
		//restarting game
		if(e.getSource() == bAgain)
		{
			dealer = new Hand();
			player = new Hand();
			game = new BlackJack(dealer, player);
			
			//resting all spaces
			lcard1.setIcon(newDeck.displayOtherImages(53));
			lcard2.setIcon(newDeck.displayOtherImages(53));
			lcard3.setIcon(newDeck.displayOtherImages(53));
			lcard4.setIcon(newDeck.displayOtherImages(53));
			lcard5.setIcon(newDeck.displayOtherImages(53));
			
			lAIcard1.setIcon(newDeck.displayOtherImages(53));
			lAIcard2.setIcon(newDeck.displayOtherImages(52));
			lAIcard3.setIcon(newDeck.displayOtherImages(53));
			lAIcard4.setIcon(newDeck.displayOtherImages(53));
			lAIcard5.setIcon(newDeck.displayOtherImages(53));
			
			//getting values
			game.kickStart();
			
			//displaying cards
			displayPlayersHand();
			displayDealerHand();
			
			//displaying totals
			totlePoints.setText(String.valueOf(player.reHandValue()));
			totlePointsAI.setText(String.valueOf(dealer.reHandValue()));

			bhitme.setEnabled(true);
			bstay.setEnabled(true);
			bAgain.setEnabled(false);
			
			//colouring total
			if(player.reHandValue() <= 10)
			{
				totlePoints.setForeground(Color.decode("#FF0000"));
			}
				
			else if(player.reHandValue() <= 15)
			{
				totlePoints.setForeground(Color.decode("#FF8C00"));
			}
				
			else if(player.reHandValue() <= 20)
			{
				totlePoints.setForeground(Color.decode("#32CD32"));
			}
				
			else if(player.reHandValue() == 21)
			{
				totlePoints.setForeground(Color.decode("#FFD700"));
			}
			
		}
		
	}

	//displaying all player cards
	public void displayPlayersHand()
	{
		//looping for all taken spaces
		for(int i=0;i<player.noOfCards;i++) {
			
			
			switch (i) {
			
			case 0:
				ImageIcon plcard1 = player.reIndexInHand(0).getCardImage();
				lcard1.setIcon(plcard1);
				break;
				
			case 1:
				ImageIcon plcard2 = player.reIndexInHand(1).getCardImage();
				lcard2.setIcon(plcard2);
				break;
				
			case 2:
				ImageIcon plcard3 = player.reIndexInHand(2).getCardImage();
				lcard3.setIcon(plcard3);
				break;
				
			case 3:
				ImageIcon plcard4 = player.reIndexInHand(3).getCardImage();
				lcard4.setIcon(plcard4);
				break;
				
			case 4:
				ImageIcon plcard5 = player.reIndexInHand(4).getCardImage();
				lcard5.setIcon(plcard5);
				break;
			}			
					
		}

	}
	
	//displaying all player cards
	public void displayDealerHand()
	{
		for(int i=0;i<dealer.noOfCards;i++) {
			
			
			switch (i) {
			
			case 0:
				ImageIcon dlcard1 = dealer.reIndexInHand(0).getCardImage();
				lAIcard1.setIcon(dlcard1);
				break;
				
			case 1:
				ImageIcon dlcard2 = dealer.reIndexInHand(1).getCardImage();
				lAIcard2.setIcon(dlcard2);
				break;
				
			case 2:
				ImageIcon dlcard3 = dealer.reIndexInHand(2).getCardImage();
				lAIcard3.setIcon(dlcard3);
				break;
				
			case 3:
				ImageIcon dlcard4 = dealer.reIndexInHand(3).getCardImage();
				lAIcard4.setIcon(dlcard4);
				break;
				
			case 4:
				ImageIcon dlcard5 = dealer.reIndexInHand(4).getCardImage();
				lAIcard5.setIcon(dlcard5);
				break;
			
			
			}			
		}
	}
	
}
