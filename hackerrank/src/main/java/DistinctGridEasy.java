public class DistinctGridEasy {

    public String checkGrid(int n, int k, int[] grid) {
        int[] row, col;
        for (int i = 0; i < n; i++) {
            row = new int[k];
            col = new int[k];
            for (int j = 0; j < n; j++) {
                row[grid[j*n+i]] = 1;
                col[grid[i*n+j]] = 1;
            }
            int rc = 0, cc = 0;
            for (int r = 0; r < col.length; r++) {
                rc += row[r];
                cc += col[r];
            }
            if (rc != k || cc != k) return "Bad";
        }
        return "Good";
    }

}
