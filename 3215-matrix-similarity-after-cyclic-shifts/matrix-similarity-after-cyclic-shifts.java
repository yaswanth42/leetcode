class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] original = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                original[i][j] = mat[i][j];
            }
        }

        for (int step = 0; step < k; step++) {
            for (int i = 0; i < m; i++) {
                if (i % 2 == 0) {
                    shiftLeft(mat[i]);
                } else {
                    shiftRight(mat[i]);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != original[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    private void shiftLeft(int[] row) {
        int temp = row[0];
        for (int i = 1; i < row.length; i++) {
            row[i - 1] = row[i];
        }
        row[row.length - 1] = temp;
    }

    private void shiftRight(int[] row) {
        int temp = row[row.length - 1];
        for (int i = row.length - 2; i >= 0; i--) {
            row[i + 1] = row[i];
        }
        row[0] = temp;
    }
}
