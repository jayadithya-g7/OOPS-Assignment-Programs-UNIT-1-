public class MatrixMultiplication {
    public static void main(String[] args) {
      int[][] matrixA = {{1, 2, 3}, {4, 5, 6}};
      int[][] matrixB = {{7, 8}, {9, 10}, {11, 12}};
  
      int[][] result = multiplyMatrices(matrixA, matrixB);
  
      System.out.println("Matrix A:");
      printMatrix(matrixA);
      System.out.println("Matrix B:");
      printMatrix(matrixB);
      System.out.println("Result:");
      printMatrix(result);
    }
  
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
      int rowsA = matrixA.length;
      int colsA = matrixA[0].length;
      int rowsB = matrixB.length;
      int colsB = matrixB[0].length;
  
      if (colsA!= rowsB) {
        System.out.println("Matrices cannot be multiplied!");
        return null;
      }
  
      int[][] result = new int[rowsA][colsB];
  
      for (int i = 0; i < rowsA; i++) {
        for (int j = 0; j < colsB; j++) {
          for (int k = 0; k < colsA; k++) {
            result[i][j] += matrixA[i][k] * matrixB[k][j];
          }
        }
      }
  
      return result;
    }
  
    public static void printMatrix(int[][] matrix) {
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
          System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
      }
    }
  }
