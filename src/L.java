import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int po = in.nextInt();
        int c = 0;
        for( int i = 0; i < n; i ++) {
            if (arr[i] >= po){
                c++;
            }
        }
        System.out.println(c + 1);
    }
}