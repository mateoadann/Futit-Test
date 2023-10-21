package exercise2;

import java.util.Scanner;

public class MagicSquare {

    public static void generateMagicSquare(int n) {
        int[][] magicSquare = new int[n][n];

        int i = n / 2;
        int j = n - 1;

        for (int num = 1; num <= n * n; ) {
            if (i == -1 && j == n) {
                j = n - 2;
                i = 0;
            } else {
                if (j == n)
                    j = 0;

                if (i < 0)
                    i = n - 1;
            }

            if (magicSquare[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            } else
                magicSquare[i][j] = num++;

            j++;
            i--;
        }

        // print the magic square
        System.out.println("The Magic Square for " + n + ":");
        for (int[] row : magicSquare) {
            for (int num : row)
                System.out.print(num + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the order of magic square (odd number): ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number.");
            return;
        }

        generateMagicSquare(n);
        sc.close();

    }
}

