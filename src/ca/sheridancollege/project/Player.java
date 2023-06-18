/**
 * This is the abstract class of the game which will contain the abstract methods and the non abstract methods.
 * Look this class will not be changed to an interface as it will have non abstract methods.
 * @author Pankaj yadav
 * @author Jasmeet kaur
 * @author Lovepreet Kaur
 * @author Harmanpreet Kaur
 */
package ca.sheridancollege.project;

/**
 * This class will model the other player of the game.
 * As only two players are allowed to play this game as per the rules.
 * This class will contain the non abstract methods for setters.
 */
public abstract class Player {

    private String name; //the unique name for this player

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
    public abstract void play();

}
