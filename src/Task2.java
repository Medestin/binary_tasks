public class Task2 {

    public static void executeTask2() {
        int[] testArray = ArrayCreator.createNonDiminishingArray(100, 0, 10);

        int searchedNum = 4;

        int searchedIndex = BinarySearch.findLastPlacementOfValue(testArray, searchedNum);
        System.out.println("Last placement search:");

        if (testArray[searchedIndex] == searchedNum) {
            System.out.println("Last placement of " + searchedNum + " in the array is at the index of: " + searchedIndex);
        } else {
            System.out.println("There is no such number in the array, returning the first two elements...");
        }
        if (searchedIndex > 2) {
            System.out.println(testArray[searchedIndex - 2]);
            System.out.println(testArray[searchedIndex - 1]);
        }
        System.out.println("!" + testArray[searchedIndex]);
        System.out.println(testArray[searchedIndex + 1]);

    }

}
