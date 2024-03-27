import java.util.List;

/**
 * DESCRIPTION
 */
public interface IShuffleList extends List {

    /**
     * @param swaps
     */
    default void shuffle(int swaps) {

    }

    /**
     *
     * @param i
     * @param j
     */
    default void swap(int i, int j) {
    }

}
