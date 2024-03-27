package cpsc2150.listDec;

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
public interface IShuffleList<T> extends List<T> {

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
        for (int i = 0; i < swaps; i++) {
            int first_num = rand.nextInt(size());
            int second_num = rand.nextInt(size());
            swap(first_num,second_num);
        }
    }

    /**
     * Switches positions of items at the two given indexes
     *
     * @param i the position of the first item that will be swapped
     * @param j the position of the second item that will be swapped
     *
     * @pre 0 <= i < [size of self] AND 0 <= j < [size of self]
     *
     * @post self = [self with the items at position i and j swapped]
     */
    default void swap(int i, int j) {
        T itemi = get(i);
        T itemj = get(j);

        set(i, itemj);
        set(j, itemi);
    }

}
