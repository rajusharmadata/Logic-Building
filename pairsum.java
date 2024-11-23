public class pairsum {
     public static int [] Parisum(int arr[] ,int target){
        /*
         * //  1. brute force 
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] + arr[j]  == target){
                    return new int[]{i,j};// return the index 
                }
            }
        }
        return new int[] {-1,-1};
         */

         // Two pointer aproach 
        int i = 0;
        int j = arr.length-1;
        int sum ;
        while(i<j){
            sum = arr[i] + arr[j];
            if(sum>target){
                j--;
            }else if(sum<target){
                i++;
            }else{
                return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};

     }
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 26;
        int index [] = Parisum(arr, target);
        for(int i = 0; i<index.length;i++){
            System.out.print(index[i]+" ");
        }
        System.out.println();
    }
}
