import java.util.Scanner;
public class MatrixDeterminant {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter the dimension of the matrix (N): ");
 int n = scanner.nextInt();
 int[][] matrix = new int[n][n];
 System.out.println("Enter the elements of the matrix: ");
 for (int i = 0; i < n; i++) {
 for (int j = 0; j < n; j++) {
 matrix[i][j] = scanner.nextInt();
 }
 }
 int determinant = findDeterminant(matrix, n);
 System.out.println("The determinant of the matrix is: " + determinant);
 }
 public static int findDeterminant(int[][] matrix, int n) {
 if (n == 1) {
 return matrix[0][0];
 }
 if (n == 2) {
 return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
 }
 int determinant = 0;
 for (int i = 0; i < n; i++) {
 int[][] subMatrix = new int[n - 1][n - 1];
 for (int j = 1; j < n; j++) {
 for (int k = 0, col = 0; k < n; k++) {
 if (k != i) {
 subMatrix[j - 1][col++] = matrix[j][k];
 }
 }
 }
 determinant += Math.pow(-1, i) * matrix[0][i] * findDeterminant(subMatrix, n - 1);
 }
 return determinant;
 }
}
