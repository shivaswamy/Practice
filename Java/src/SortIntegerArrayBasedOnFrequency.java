import com.sun.tools.javac.util.ArrayUtils;

import java.util.*;

/**
 * Created by swamys01 on 30/10/2015.
 */
public class SortIntegerArrayBasedOnFrequency {

    private List sortArray(int[] original) {
        //List secondaryList = new LinkedList<Integer>();
        Map<Integer, Integer> intMap = new TreeMap<Integer, Integer>();
        //secondaryList.addAll(Arrays.asList(original));

        for(int i=0; i<original.length; i++) {
            Integer originalValue = Integer.parseInt(""+original[i]);
            Integer value = intMap.get(originalValue);
            if(value == null){
                value=0;
            }
            intMap.put(original[i], (value + 1));
        }

        for(int key : intMap.keySet()) {
            System.out.println("Key - " + key + " # Value " + intMap.get(key));
        }

        return null;
    }

    public static void main(String[] args) {
        SortIntegerArrayBasedOnFrequency sortInt = new SortIntegerArrayBasedOnFrequency();

        int[] intArray = new int[]{7,7,2,2,2,30,0,9,5,5,1,3,4,5,7,2};

        sortInt.sortArray(intArray);
        //System.out.println("Sorted Array :: " + sortInt.sortArray(intArray));
    }
}
