/**
 * This is the game class in which we will create methods for the Group of cards.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * @author Pankaj Yadav,Jasmeet Kaur,Lovepreet kaur,harmanpreet kaur.
 * This array will create an Arraylist of players.
 * All the Uml case diagram will be shown for the deliveralbe 1.
 */
public abstract class Game {

    private final String name;//the title of the game
    private ArrayList<Player> players;// the players of the game

    public Game(String name) {
        this.name = name;
        players = new ArrayList();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    public abstract void play();

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public abstract void declareWinner();

}//end class
