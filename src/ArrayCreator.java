import java.util.Arrays;
import java.util.Random;

public class ArrayCreator {

    //Creates non-diminishing array, that means the values can repeat(a few times even) but are ordered ascending
    public static int[] createNonDiminishingArray(int length, int minNum,  int maxNum){
        Random r = new Random(0);
        int[] nonDimArray = new int[length];
        for(int i = 0; i < nonDimArray.length; i++){
        nonDimArray[i] = r.nextInt(maxNum - minNum + 1) + minNum;
        }
        Arrays.sort(nonDimArray);
        return nonDimArray;
    }

}
