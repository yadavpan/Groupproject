/**
 * THIS CODE IS CREATED BY PANKAJ YADAV,Jasmeet kaur,Lovepreet kaur,Harmandeep kaur
 * DATE OF CREATION 16-06-2023
 * Basic code for deliverable 1
 * Our code will be designed on the principles of the war game. 
 */
package ca.sheridancollege.project;

/**
 * This war game will have 52 cards.It will not contain any jokers.
 * The cards are ranked from high to low in the order Ace,King,Queen,Jack,10,9,8,7,6,5,4,3,2.
 * The objective of the game is to collect all the cards from the opposing team.
 * This is a two player game but the second player will be the computer.
 * @author Pankaj Yadav
 * 
 */
public abstract class Card {
    //default modifier for child classes

    /**
     * code will be available on other deliverables as specified on the group
     */
    @Override
    public abstract String toString();

}
