package white.Utils;

public class utils {
    public static int[] swap(int[] arr ,int a,int b){
        int temp  = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
}
