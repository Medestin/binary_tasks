public class BinarySearch {

    public static int findFirstPlacementOfValue(int[] arrayGiven, int keyValue) {
        int lowIndex = 0;
        int highIndex = arrayGiven.length - 1;

        int middle;
        while(lowIndex < highIndex){
            middle = (lowIndex + highIndex)/2;
            if(arrayGiven[middle] >= keyValue){
                highIndex = middle;
            } else {
                lowIndex = middle+1;
            }

        }

        if(arrayGiven[lowIndex] != keyValue){
            return -1;
        }

        else return lowIndex;
    }

    public static int findLastPlacementOfValue(int[] arrayGiven, int keyValue) {

        int lowIndex = 0;
        int hightIndex = arrayGiven.length-1;

        int middle;
        while(lowIndex < hightIndex){
            middle = (lowIndex + hightIndex)/2;
            if(arrayGiven[middle] <= keyValue){
                lowIndex = middle;
            } else {
                hightIndex = middle -1;
            }
        }

        if(arrayGiven[hightIndex] != keyValue){
            return -1;
        }
        else return hightIndex;

    }


}



