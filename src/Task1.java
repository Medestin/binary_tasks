public class Task1 {

    public static void executeTask1() {
        int[] testArray = ArrayCreator.createNonDiminishingArray(100, 1, 10);

        int searchedNum = 5;

        // Iterative search:
        int searchedIndexIteratively = BinarySearch.findFirstPlacementOfValueIterative(testArray, searchedNum);
        System.out.println("Iterative search:");

        if (testArray[searchedIndexIteratively] == searchedNum) {
            System.out.println("First placement of " + searchedNum + " in the array is at the index of: " + searchedIndexIteratively);
        } else {
            System.out.println("There is no such number in the array, returning the first two elements...");
        }
        if (searchedIndexIteratively > 2) {
            System.out.println(testArray[searchedIndexIteratively - 2]);
            System.out.println(testArray[searchedIndexIteratively - 1]);
        }
        System.out.println("!" + testArray[searchedIndexIteratively]);
        System.out.println(testArray[searchedIndexIteratively + 1]);

        //Recursive search:
        int searchedIndexRecursively =
                BinarySearch.findFirstPlacementOfValueRecursive(testArray, searchedNum, 0, testArray.length - 1);

        System.out.println("Recursive search:");

        if (testArray[searchedIndexRecursively] == searchedNum) {
            System.out.println("First placement of " + searchedNum + " in the array is at the index of: " + searchedIndexRecursively);
        } else {
            System.out.println("There is no such number in the array, returning the first two elements...");
        }
        if (searchedIndexRecursively > 2) {
            System.out.println(testArray[searchedIndexRecursively - 2]);
            System.out.println(testArray[searchedIndexRecursively - 1]);
        }
        System.out.println("!" + testArray[searchedIndexRecursively]);
        System.out.println(testArray[searchedIndexRecursively + 1]);
    }

}
