import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args){
        int[][] matrix = {
            {1, 1, 1, 1, 1, 1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 0, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };
        printMatrix(zeroMatrix(matrix));
    };

    static int[][] zeroMatrix(int[][] matrix){
        int rows = matrix[0].length;
        int columns = matrix.length;
        List<Integer> rowsToZero = new ArrayList<Integer>();
        List<Integer> columnsToZero = new ArrayList<Integer>();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(matrix[i][j] == 0){
                    if(!rowsToZero.contains(i)){
                        rowsToZero.add(i);
                    };
                    if(!columnsToZero.contains(j)){
                        columnsToZero.add(j);
                    };
                };
            };
        };
        replaceRows(rowsToZero, matrix);
        replaceColumns(columnsToZero, matrix);
        return matrix;
    };

    static void replaceRows(List<Integer> rowsToZero, int[][] matrix){
        int rowSize = matrix[0].length;
        int[] zeroRow = new int[rowSize];
        Arrays.fill(zeroRow, 0);
        for(int i = 0; i < rowsToZero.size(); i++){
            matrix[rowsToZero.get(i)] = zeroRow;
        };
    };

    static void replaceColumns(List<Integer> columnsToZero, int[][] matrix){
        int colummnSize = matrix.length;
        for(int i = 0; i < columnsToZero.size(); i++){
            for(int j = 0; j < colummnSize; j++){
                matrix[j][columnsToZero.get(i)] = 0;
            };
        };
    };

    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            };
            System.out.println();
        };
    };

};
