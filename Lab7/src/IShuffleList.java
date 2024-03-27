import java.util.List;
import java.util.Random;

/**
 * DESCRIPTION
 */
public interface IShuffleList extends List {

    /**
     * Randomly picks two positions in the list and swaps them the designated amount of times.
     *
     * @param swaps the desired amount of times that two random positions will be swapped.
     *
     * 
     */
    default void shuffle(int swaps) {
        Random rand = new Random();
        int rand_num = rand.nextInt(myList.size());
    }

    /**
     *
     * @param i
     * @param j
     */
    default void swap(int i, int j) {
    }

}
