import java.util.*;
public class majorityElement {
    // when also Mejority Element is exits ....
    
    public static int Majorityelement(int arr[]) {
        /*
        // Brutforce ()

         *   for (int i = 0; i < arr.length; i++) {
            int el = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == el) {
                    count++;
                }
            }

            if (count > (arr.length / 2)) {
                return el;
            }

        }
         */
      

         // optimal Aproach 
         Arrays.sort(arr);
        //  for(int i = 0;i<arr.length;i++){
        //     System.out.print(arr[i] + " ");
        //  }
         int frequence =1;

         for(int i = 0;i<arr.length;i++){
            if(arr[i] == arr[i+1]){
                frequence++;
            }else{
                frequence =1;
            }
            if(frequence>(arr.length/2)){
                return arr[i];
            }
         }
         
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1,2};
        int element = Majorityelement(arr);
        System.out.println(element);
    }
}
