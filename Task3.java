package Internpe.Task1;

public class Task3 {
    public static void main(String[] args) {
                outerLoop: for (int i = 1; i <= 3; i++) {
                    innerLoop: for (int j = 1; j <= 3; j++) {
                        System.out.println("i = " + i + ", j = " + j);
                        if (i == 2 && j == 2) {
                            break outerLoop; // Breaks out of the outer loop
                        }
                    }
                }
                System.out.println("Loop ends");
    }
}
