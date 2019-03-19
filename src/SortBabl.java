import java.util.Arrays;

public class SortBabl {
    public static void main(String[] args){
       int[] list = {3,5,10,2,33,30,1};
       for (int i = 0; i < list.length; i++){
           for (int j = list.length-1; j > i; j--){
               if (list[j] < list[j-1]){
                   int x = list[j];
                   list[j] = list[j-1];
                   list[j-1] = x;
               }
           }
       }
       for (int number : list){
           System.out.println(number);
       }
       }
}
