public class product {
    public static void main(String[] args) {
        int p=1;
        int[] arr={1,2,3,4,9};
        for (int i = 0; i < arr.length; i++) {
            p=p*arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=p/arr[i];
            System.out.print(arr[i]+" ");
        }
    }
}

