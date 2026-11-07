import java.util.Scanner;

public class O {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int count = 0;
        int i = 0;

        while (i < n) {
            int j = i;

            while (j < n && arr[i] == arr[j]) {
                j++;
            }

            int len = j - i;

            if (len >= 3) {
                count += len;

                for (int k = j; k < n; k++) {
                    arr[k - len] = arr[k];
                }

                n -= len;
                i = 0;
            } else {
                i = j;
            }
        }

        System.out.println(count);
    }
}