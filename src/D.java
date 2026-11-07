import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                count = count+1;
            }
        }
        System.out.print(count);
    }
}

