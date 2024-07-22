import java.util.Scanner;

public class MatrixMultiplication {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of rows for Matrix A:");
    int rowsA = scanner.nextInt();
    System.out.println("Enter the number of columns for Matrix A:");
    int colsA = scanner.nextInt();

    int[][] matrixA = new int[rowsA][colsA];
    System.out.println("Enter the elements of Matrix A:");
    for (int i = 0; i < rowsA; i++) {
      for (int j = 0; j < colsA; j++) {
        System.out.print("Enter element [" + i + "][" + j + "]: ");
        matrixA[i][j] = scanner.nextInt();
      }
    }

    System.out.println("Enter the number of rows for Matrix B:");
    int rowsB = scanner.nextInt();
    System.out.println("Enter the number of columns for Matrix B:");
    int colsB = scanner.nextInt();

    int[][] matrixB = new int[rowsB][colsB];
    System.out.println("Enter the elements of Matrix B:");
    for (int i = 0; i < rowsB; i++) {
      for (int j = 0; j < colsB; j++) {
        System.out.print("Enter element [" + i + "][" + j + "]: ");
        matrixB[i][j] = scanner.nextInt();
      }
    }

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

    if (colsA != rowsB) {
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
