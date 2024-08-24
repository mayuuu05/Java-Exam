// 1 WAP TO FIND THE LARGEST ELEMENT FROM THE ARRAY IN JAVA.

public class Qu1 {

    public static void main(String[] args) {

        int[] numbers = {3, 9, 5, 7, 8, 12, 6, 10, 55};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The largest element is: " + max);
    }
}
