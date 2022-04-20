class Main {
    
    public static void main(String[] args) {
        int[][] matrix1 = {
            {0, 0, 0, 0},
            {1, 1, 1, 1},
            {2, 2, 2, 2},
            {3, 3, 3, 3}
        };
        printMatrix(rotateMatrix(matrix1));
    };

    static int[][] rotateMatrix(int[][] matrix){
        int size = matrix[0].length;
        int[][] newMatrix = new int[size][size];
        for(int row = 0; row < size; row++){
            for(int column = 0; column < size; column++){
                newMatrix[column][size - (row + 1)] = matrix[row][column];
            };
        };
        return newMatrix;
    }

    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            };
            System.out.println();
        };
    };

    static int[][] rotate(int[][] matrix){
        int n = matrix.length;
        for(int layer = 0; layer < n / 2; layer++){
            int first = layer;
            int last = n - 1 - layer;
            for(int i = first; i < last; i++){
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            };
        };
        return matrix;
    };

};