import java.lang.reflect.Array;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Sort sort = new Sort();
        sort.bubllesort(sort.massiv);
    }
}

class Sort {
    int count = 30;
    int[] massiv = new int[count];

    Sort() {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            massiv[i] = (int) (random.nextInt(1000));
        }
        display(massiv);
    }

    void bubllesort(int[] array) {
        int temp = 0;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    display(array);
                }
            }
        }
    }

    void display(int[] massiv) {
        for (int i = 0; i < count; i++) {
            System.out.print(massiv[i] + " ");
        }
        System.out.println(" ");
        try {
            // Приостановка выполнения на 3 секунды (3000 миллисекунд)
            Thread.sleep(250);
        } catch (InterruptedException e) {
        }
    }

/*    void clear() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }*/
}