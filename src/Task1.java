public class Task1 {

    public static void executeTask1() {
        int[] testArray = ArrayCreator.createNonDiminishingArray(100, 0, 10);

        int searchedNum = 5;

        int searchedIndex = BinarySearch.findFirstPlacementOfValue(testArray, searchedNum);
        System.out.println("First placement search:");

        if (testArray[searchedIndex] == searchedNum) {
            System.out.println("First placement of " + searchedNum + " in the array is at the index of: " + searchedIndex);
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
