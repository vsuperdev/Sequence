Sequence
========
note: use boolean to avoid creation of buttons every time. Activate buttons when appropriate. 

Player with sequence of four consecutive numbers wins. This is coded in Java. Eventually it will become a card game. 
http://rummy.com/indianrummy.html

#**************** Defects ***************************************
# Resolved - Defect 1 : cards are persisting for both players in the first draw and chains to other -12/22/2014
# Resolved - Defect 2 : if no one wins needs a graceful end to program -12/27/2014
	# Resolved - 2a: fix draw to start from 1 and end including 52 -12/27/2014
	# Resolved - 2b: calculate iteration ends through end of cards to draw -12/27/2014
	# Resolved - 2c: Extra fall back after certain draws based on the deck -12/27/2014
					if ((cardsLeft4Drawing==0))
					if (winner == false)
# Resolved - Defect 3 : When clicking on DrawCard, card buttons are not responding, paintAll keeps throwing null pointer exception - 01/12/2015
# Resolved - Defect 7 : if players wait for entering name, it times out then player 2 is null after initial set up of player1 - 02/24/2015

?????? Code for drawing on client side	?????? 
Defect 4 : 14 cards for player 1
Defect 5 : Player 2 Pick button small
Defect 6 : cardsLeft4Drawing decreases when picked from discard pile


#**************** Improvement ******************************
# Completed - Feature 1 : add window to middle -12/22/2014
# Completed - Feature 4 : Add the current player holding cards in the frame -12/22/2014
# Completed - Feature 5 : Add buttons and messages vertically in the window -12/22/2014
# Completed - Feature 9 : Provide initial cards - 12/30/2014
# Completed - Feature10 : Feature to pick last card from the discard pile - 1/13/2015
# Completed - Feature15 : Manage Discarding a card - 1/14/2015
# Completed - Feature16 : Let player choose which card to discard - 1/14/2015
# Completed - Feature 8 : Message for winner in a frame - 1/15/2015
# Completed - Feature13 : Accept player names from the GUI windows - 2/24/2015
# Completed - Feature12 : Create a class to convert Card Numbers to String and Integer for user Experience - 2/25/2015

Feature 2 : add playerHoldings and refresh window for updates

Feature 3 : Update the CheckWinning to defect winner for multiple sequence
	   3a : Check for valid sequences for all cards in hand
	   3b : Check for 3/4 cards of the same number
	   
Feature 7 : Test the application - create JUnits

Feature17 : check for winner after first distribution
Feature19 : cover for winning in initial set up	
			change CheckWinning to return string

Feature 6 : Add multiple players - up to 10
Feature14 : Make the code independent of number of players
Feature20 : Need to handle multiple Deck for distribution

Feature11 : Integrate with Server Client  

Feature18 : Accommodate Use of Jokers	

Feature21 : Message for non winners

Feature22 : Manage multiple decks in winning checks

Feature23 : Manage each player in its own thread

Feature24 : Add String names of the cards to buttons

Feature25 : Sort Cards by suites

Feature26 : Reserved for future features
