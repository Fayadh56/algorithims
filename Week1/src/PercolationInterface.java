
public interface PercolationInterface {

    /**
     * Open Site if it isn't opened already, 2d mapping..
     * @param row row to open
     * @param col column to open
     */
    void open(int row, int col);

    /**
     * Checks if the site (row, col) is open.
     * @param row position
     * @param col position
     * @return true if the sites open, false otherwise
     */
    boolean isOpen(int row, int col);

    /**
     * Checks to see if the site (row, col) is full.
     * @param row position
     * @param col position
     * @return true if its full, false otherwise
     */
    boolean isFull(int row, int col);

    /**
     * Keeps track of the number of open sites
     * @return Number of open sites
     */
    int numberOfOpenSites();

    /**
     * Checks to see if the system percolates.
     * @return true if it percolates
     */
    boolean percolates();

}
