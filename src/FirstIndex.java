public class FirstIndex {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int x = 5;
        int l = 0;
        int h = arr.length-1;

        while(l <= h){ // = is bcz if element is on l index
            int m = (l +h) / 2;

            if(arr[m]  < x){
                l = m+1;
            }
            else if(arr[m] > x){
                h = m-1;
            }
            else{
                if(m !=0 && arr[m-1] == arr[m]){
                    h = m-1;
                }
                else{
                    System.out.println("element is found at "+m);
                    return;
                }
            }


        }
        System.out.println("element is not present  in the array");
    }
}
