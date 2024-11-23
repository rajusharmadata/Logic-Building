public class majorityElement {
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
      
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2,3,3,3,3,3};
        int element = Majorityelement(arr);
        System.out.println(element);
    }
}
