import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {100, 2, 12, 54, -90, 45};
        int min = array[0];
        int max = array[0];
        for (
                int i = 0;
                i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальный элемент = " + min);
        System.out.println("Максимальный элемент = " + max);
    }

    //    Дан массив nums = [3,2,2,3] и число val = 3.
//    Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//    Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
    public static void main(String[] args) {
        int[] some_arr = {3, 2, 2, 3};
        int val = 3;
        int temp = 0;
        for (int i = 0; i < some_arr.length - 2; i++) {
            if (some_arr[i] == val && some_arr[i] != some_arr[some_arr.length - 1]) {
                temp = some_arr[some_arr.length - 1];
                some_arr[some_arr.length - 1] = some_arr[i];
                some_arr[i] = temp;
            } else if (some_arr[i] == val && some_arr[i] == some_arr[some_arr.length - 1]) {
                temp = some_arr[some_arr.length - 2];
                some_arr[some_arr.length - 2] = some_arr[i];
                some_arr[i] = temp;
            }
        }
        for (int i = 0; i < some_arr.length; i++) {
            System.out.println(some_arr[i]);
        }
    }
}

