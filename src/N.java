import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Считываем размер массива
        int n = scanner.nextInt();

        // 2. Создаем массив и заполняем его числами
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 3. Считываем сдвиг K
        int k = scanner.nextInt();

        // 4. Магия математики: упрощаем K
        // Массив из 5 элементов, сдвинутый на 5, возвращается на место.
        // Поэтому берем остаток от деления.
        k = k % n;

        // Если K отрицательное (сдвиг влево),
        // превращаем его в эквивалентный сдвиг вправо.
        // Например, сдвиг влево на 1 при длине 5 — это то же самое, что сдвиг вправо на 4.
        if (k < 0) {
            k = k + n;
        }

        // 5. Тот самый трюк с тремя разворотами "на месте"
        if (k != 0) {
            // Разворачиваем весь массив
            reverse(arr, 0, n - 1);
            // Разворачиваем первую часть (длиной K)
            reverse(arr, 0, k - 1);
            // Разворачиваем оставшуюся часть
            reverse(arr, k, n - 1);
        }

        // 6. Выводим результат на экран через пробел
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Простая функция, которая меняет элементы местами (разворачивает кусок массива)
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
