import java.util.List;
import java.util.Random;

/**
 * DESCRIPTION
 */
public interface IShuffleList extends List {

    /**
     * Randomly picks two positions in the list and swaps them. It repeats this task the designated amount of times.
     *
     * @param swaps the desired amount of times that two random positions will be swapped.
     *
     * @post self = [self with items randomized to a varying degree]
     */
    default void shuffle(int swaps) {
        Random rand = new Random();
        int rand_num = rand.nextInt(myList.size());
    }

    /**
     * Switches positions of items at the two given indexes
     *
     * @param i the position of the first item that will be swapped
     * @param j the position of the second item that will be swapped
     */
    default void swap(int i, int j) {
    }

}
