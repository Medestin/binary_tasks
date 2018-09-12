public class BinarySearch {

    public static int findFirstPlacementOfValueIterative(int[] arrayGiven, int keyValue) {

        int highIndex = arrayGiven.length - 1;
        int lowIndex = 0;

        int middleIndex = (highIndex + lowIndex) / 2;

        while (highIndex != lowIndex && highIndex-lowIndex != 1) {
            if (arrayGiven[middleIndex] < keyValue) {
                lowIndex = middleIndex + 1;
                middleIndex = (highIndex + lowIndex) / 2;
            } else if (arrayGiven[middleIndex] > keyValue) {
                highIndex = middleIndex - 1;
                middleIndex = (highIndex + lowIndex) / 2;
            } else if (arrayGiven[middleIndex] == keyValue) {
                highIndex = middleIndex;
                middleIndex = (highIndex + lowIndex) / 2;
            }
        }

        if (arrayGiven[middleIndex] != keyValue) {
            return 0;
        }
        return middleIndex;
    }

    public static int findFirstPlacementOfValueRecursive(int[] arrayGiven, int keyValue, int lowIndex, int highIndex) {

        int middleIndex = (highIndex + lowIndex) / 2;

        if ((highIndex == lowIndex || highIndex - lowIndex == 1) && arrayGiven[middleIndex] == keyValue) {
            return lowIndex;
        } else if ((highIndex == lowIndex || highIndex - lowIndex == 1) && arrayGiven[middleIndex] != keyValue) {
            return 0;
        } else if (arrayGiven[middleIndex] < keyValue) {
            return findFirstPlacementOfValueRecursive(arrayGiven, keyValue, middleIndex + 1, highIndex);
        } else if (arrayGiven[middleIndex] > keyValue) {
            return findFirstPlacementOfValueRecursive(arrayGiven, keyValue, lowIndex, middleIndex - 1);
        } else if (arrayGiven[middleIndex] == keyValue) {
            return findFirstPlacementOfValueRecursive(arrayGiven, keyValue, lowIndex, middleIndex);
        } else {
            return 0;
        }

    }

}



