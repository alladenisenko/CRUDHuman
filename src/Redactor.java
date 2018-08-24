import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Алла on 24.08.2018.
 */
public class Redactor {
    public String[]create (String[] arr, String value){
        for (int i = 0; i <arr.length ; i++) {
         if (arr[i] == null){
             arr[i]=value;
             break;
         }
        }
        return arr;
    }
    private boolean checkIndex (String[] arr, int index){
        boolean cheker = index< arr.length-1 &&index>=0;
        if (!cheker) System.out.println("Incorrect index: "+index);
        return cheker;

    }
    public String[] update (String[] arr, int index, String value){
        if (checkIndex(arr, index)){
            arr[index]=value;
        }
        return arr;
    }

    public void read(String[] arr){
        System.out.println(Arrays.asList(arr));
    }

    public  String[] delete(String[] arr, int index){
        if (checkIndex(arr, index)){
            arr[index]=null;

        }
        return arr;
    }
}
