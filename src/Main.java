import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));

        //вариант с for
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.printf("Сумма трат в месяц составила %s рублей.\n",sum);

        //вариант с foreach
        int total = 0;
        for (int element : arr) {
            total += element;
        }
        System.out.printf("Сумма трат в месяц составила %s рублей.\n",total);

        int max = arr[0];
        int min = arr [0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }else if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.printf("Максимальная сумма трат за день составила %s рублей.\n"+"Минимальная сумма трат за день составила %s рублей.\n",max,min);

        float average = (float) sum/arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %s рублей.\n",average);

        char[] reverseFullName = new char[]{'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}