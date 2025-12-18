import java.util.*;

public class Third {

    static Scanner sc = new Scanner(System.in);

    // Input matrix
    static int[][] inputMatrix(int rows, int cols) {
        int[][] mat = new int[rows][cols];
        System.out.println("Enter elements of matrix (" + rows + "x" + cols + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        return mat;
    }

    // Display matrix
    static void display(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Addition
    static void add(int[][] A, int[][] B) {
        if (A.length != B.length || A[0].length != B[0].length) {
            System.out.println("Addition not possible! Different dimensions.");
            return;
        }
        int[][] C = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Result of Addition:");
        display(C);
    }

    // Subtraction
    static void subtract(int[][] A, int[][] B) {
        if (A.length != B.length || A[0].length != B[0].length) {
            System.out.println("Subtraction not possible! Different dimensions.");
            return;
        }
        int[][] C = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        System.out.println("Result of Subtraction:");
        display(C);
    }

    // Multiplication
    static void multiply(int[][] A, int[][] B) {
        if (A[0].length != B.length) {
            System.out.println("Multiplication not possible! Column of A != Row of B.");
            return;
        }
        int[][] C = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Result of Multiplication:");
        display(C);
    }

    // Transpose
    static void transpose(int[][] A) {
        int[][] T = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                T[j][i] = A[i][j];
            }
        }
        System.out.println("Transpose of Matrix:");
        display(T);
    }

    // Check Square Matrix
    static void checkSquare(int[][] A) {
        if (A.length == A[0].length) {
            System.out.println("Matrix is Square.");
        } else {
            System.out.println("Matrix is NOT Square.");
        }
    }

    // Check Diagonal Matrix
    static void checkDiagonal(int[][] A) {
        if (A.length != A[0].length) {
            System.out.println("Matrix is NOT Diagonal (not square).");
            return;
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (i != j && A[i][j] != 0) {
                    System.out.println("Matrix is NOT Diagonal.");
                    return;
                }
            }
        }
        System.out.println("Matrix is Diagonal.");
    }

    // Check Identity Matrix
    static void checkIdentity(int[][] A) {
        if (A.length != A[0].length) {
            System.out.println("Matrix is NOT Identity (not square).");
            return;
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if ((i == j && A[i][j] != 1) || (i != j && A[i][j] != 0)) {
                    System.out.println("Matrix is NOT Identity.");
                    return;
                }
            }
        }
        System.out.println("Matrix is Identity.");
    }

    public static void main(String[] args) {
        System.out.println("Enter rows and cols for Matrix A:");
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        int[][] A = inputMatrix(r1, c1);

        System.out.println("Enter rows and cols for Matrix B:");
        int r2 = sc.nextInt(), c2 = sc.nextInt();
        int[][] B = inputMatrix(r2, c2);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Transpose (Matrix A)");
            System.out.println("5. Check Square (Matrix A)");
            System.out.println("6. Check Diagonal (Matrix A)");
            System.out.println("7. Check Identity (Matrix A)");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: add(A, B); break;
                case 2: subtract(A, B); break;
                case 3: multiply(A, B); break;
                case 4: transpose(A); break;
                case 5: checkSquare(A); break;
                case 6: checkDiagonal(A); break;
                case 7: checkIdentity(A); break;
                case 8: System.out.println("Exiting..."); return;
                default: System.out.println("Invalid choice!");
            }
        }
    }
}
