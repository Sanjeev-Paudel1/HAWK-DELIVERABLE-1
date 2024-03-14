/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author Kshitij Ale 12 Feb 2024
   @author Sanjeev Paudel 13 Feb 2024
   @author Sheshmani Bhandari 12 Feb 2024
   @author Sahil Sharma 13 Feb 2024
 */
public abstract class Card {
    //default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card.  Could be an UNO card, a regular playing card etc.
     */
    @Override
    public abstract String toString();

}
