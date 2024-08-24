//2 WAP TO SORT ARRAY IN ASCENDING(LOW TO HIGH) ORDER IN JAVA.

import java.util.Scanner;

public class Qu2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = scanner.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements :");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("Ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
