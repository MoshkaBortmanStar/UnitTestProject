import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public  Integer[] ackAfterForArr(Integer[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        boolean firstHit = false;

        for (int value : arr) {
            if (value == 4) {
                firstHit = true;
                arrayList.clear();
            } else if (firstHit) {
                arrayList.add(value);
            }
        }
        if (arrayList.isEmpty()) {
            throw new RuntimeException("SWR");
        } else {
            Integer[] returnArr = new Integer[arrayList.size()];
            return arrayList.toArray(returnArr);
        }
    }

    public boolean checkOneAndFourInArr(Integer[] arr){
        boolean oneBoloolean = false;
        boolean fourBoolean = false;
        for (int value : arr){
            if (value == 1){
                oneBoloolean = true;
            } else if (value == 4){
                fourBoolean = true;
            }
        }
        return fourBoolean && oneBoloolean;
    }




}
