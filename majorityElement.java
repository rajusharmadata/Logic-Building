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
         int freq =1;
         int ans = arr[0];

         for(int i = 1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                freq++;
            }else{
                freq =1;
                ans = arr[i];
            }
            if(freq>(arr.length/2)){
                return ans;
            }
         }
         
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,8,1,1};
        int element = Majorityelement(arr);
        System.out.println(element);
    }
}
