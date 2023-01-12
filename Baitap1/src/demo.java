import java.util.ArrayList;
import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        String str = "abcabcabc";
        String[] arr;
        int count  = 0;
        arr= str.split(" ");
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[count]=arr[j];
                    count++;
                }
            }
        }
        if (count>0){
            System.out.println(arr);
        }
    }
}
