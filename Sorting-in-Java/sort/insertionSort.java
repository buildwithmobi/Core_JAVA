package Dsa;

public class insertionSort {
    public static void main(String[] args) {

        int[] numbers = {3, 6, 2, 1, 5};
        int size = numbers.length;

        for (int forward = 1; forward < size; forward++) {

            int key = numbers[forward];
            int backward = forward - 1;
            int countMovement = 0;

            while (backward >= 0 && numbers[backward] > key) {
                numbers[backward + 1] = numbers[backward];
                backward--;
                countMovement++;
            }
            numbers[backward + 1] = key;

            System.out.print("Step " + forward + ": ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println(" Movements recorded: " + countMovement);
        }


        System.out.print("\nSorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
