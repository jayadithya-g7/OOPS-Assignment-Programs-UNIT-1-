import java.util.Scanner;

public class Eigenvalues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matrix = new double[2][2];

        System.out.println("Enter the elements of the 2x2 matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        double a = 1;
        double b = -(matrix[0][0] + matrix[1][1]);
        double c = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("The matrix has complex eigenvalues.");
            return;
        }

        double eigenvalue1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double eigenvalue2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        double determinant = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        double productOfEigenvalues = eigenvalue1 * eigenvalue2;

        System.out.println("Eigenvalue 1: " + eigenvalue1);
        System.out.println("Eigenvalue 2: " + eigenvalue2);
        System.out.println("Determinant: " + determinant);
        System.out.println("Product of Eigenvalues: " + productOfEigenvalues);

        if (Math.abs(determinant - productOfEigenvalues) < 1e-9) {
            System.out.println("The determinant is verified to be the product of the eigenvalues.");
        } else {
            System.out.println("The determinant does not match the product of the eigenvalues.");
        }
    }
}
