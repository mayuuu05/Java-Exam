// 4 WAP TO FIND THE SUM OF EVEN NUMBERS FROM 1 TO N USING RECURSION.

import java.util.Scanner;

public class Qu4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = scanner.nextInt();
        int sum = 0;


        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                sum += i;
                System.out.print(i + " ");
            }

        }
        System.out.println("Sum of even numbers is: " + sum);
    }

}

