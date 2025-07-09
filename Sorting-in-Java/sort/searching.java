package Dsa;

public class searching {
    public static void main(String[] args) {
        int[] searchingArray = {5, 6, 7, 8, 99, 202, 2050};
        int target = 99;


        long startTime = System.nanoTime();
        int linearSearchResult = linearSearch(searchingArray, target);
        long endTime = System.nanoTime();

        if (linearSearchResult == -1) {
            System.out.println("The value is not present.");
        } else {
            System.out.println("The index at which value is present is " + linearSearchResult);
        }
        System.out.println("Time taken by linear search: " + (endTime - startTime) + " nanoseconds");


        startTime = System.nanoTime();
        int binarySearchResult = binarySearch(searchingArray, target);
        endTime = System.nanoTime();

        if (binarySearchResult == -1) {
            System.out.println("The value is not present.");
        } else {
            System.out.println("The index at which value is present is " + binarySearchResult);
        }
        System.out.println("Time taken by binary search: " + (endTime - startTime) + " nanoseconds");
    }

    public static int linearSearch(int[] searchArray, int target) {
        int steps = 0;
        for (int i = 0; i < searchArray.length; i++) {
            steps++;
            if (searchArray[i] == target) {
                System.out.println("Linear search steps taken: " + steps);
                return i;
            }
        }
        System.out.println("Linear search steps taken: " + steps);
        return -1;
    }

    public static int binarySearch(int[] searchArray, int target) {
        int left = 0;
        int right = searchArray.length - 1;
        int steps = 0;
        while (left <= right) {
            steps++;
            int midIndex = (left + right) / 2;
            if (target == searchArray[midIndex]) {
                System.out.println("Binary search steps taken: " + steps);
                return midIndex;
            } else if (target > searchArray[midIndex]) {
                left = midIndex + 1;
            } else {
                right = midIndex - 1;
            }
        }
        System.out.println("Binary search steps taken: " + steps);
        return -1;
    }
}

