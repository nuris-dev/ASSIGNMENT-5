import java.util.Scanner;
public class H {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for(int i = 0 ; i < n - 1;i+=2) {
            int t = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = t;
        }
        for( int i = 0; i< n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}