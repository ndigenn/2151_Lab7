import java.util.List;
import java.util.Random;

/**
 * Interface contract for ShuffleList-1-1.java that defines 2 default methods.
 *
 * @defines self: the shuffle list
 *
 * @constraints self != null
 *
 * @Initialization_ensures the shuffle list is not empty
 */
public interface IShuffleList extends List {

    /**
     * Randomly picks two positions in the list and swaps them. It repeats this task the designated amount of times.
     *
     * @param swaps the desired amount of times that two random positions will be swapped.
     *
     * @pre swaps >= 0
     * @post self = [self with items randomized to a varying degree]
     */
    default void shuffle(int swaps) {
        Random rand = new Random();
        int rand_num = rand.nextInt(myList.size());
    }
    //this is a test

    /**
     * Switches positions of items at the two given indexes
     *
     * @param i the position of the first item that will be swapped
     * @param j the position of the second item that will be swapped
     */
    default void swap(int i, int j) {
    }

}
