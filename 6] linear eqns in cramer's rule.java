import java.util.Scanner;
public class CramersRule {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter the number of variables: ");
 int n = scanner.nextInt();
 int[][] matrix = new int[n][n];
 int[] constants = new int[n];
 System.out.println("Enter the coefficients of the matrix: ");
 for (int i = 0; i < n; i++) {
 for (int j = 0; j < n; j++) {
 matrix[i][j] = scanner.nextInt();
 }
 }
 System.out.println("Enter the constants: ");
 for (int i = 0; i < n; i++) {
 constants[i] = scanner.nextInt();
 }
 int determinant = findDeterminant(matrix, n);
 if (determinant == 0) {
 System.out.println("The system has no unique solution.");
 return;
 }
 int[] solutions = new int[n];
 for (int i = 0; i < n; i++) {
 int[][] modifiedMatrix = new int[n][n];
 for (int j = 0; j < n; j++) {
 for (int k = 0; k < n; k++) {
 if (k == i) {
 modifiedMatrix[j][k] = constants[j];
 } else {
 modifiedMatrix[j][k] = matrix[j][k];
 }
 }
 }
 solutions[i] = findDeterminant(modifiedMatrix, n) / determinant;
 }
 System.out.println("The solutions are: ");
 for (int i = 0; i < n; i++) {
 System.out.println("x" + (i + 1) + " = " + solutions[i]);
 }
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
