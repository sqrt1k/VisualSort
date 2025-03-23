import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите нужную сортировку: ");
        System.out.println("1 - Сортировка пузырьком");

        int choise = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите количество элементов в массиве: ");
        int count = scanner.nextInt();
        switch (choise){
            case 1:
                System.out.println("Сортировка пузырьком");
                Sort sort = new Sort(count);
                sort.bubllesort();
        }
    }
}

class Sort {
    private int count;
    private int[] massiv;

    //В конструкторе создаём массив и заполняем случайными элементами
    Sort(int count) {
        this.count = count;
        massiv = new int[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            massiv[i] = (int)(random.nextInt(1000));
        }
        display(massiv);
    }

    public void bubllesort() {
        int temp = 0;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - 1; j++) {
                if (massiv[j] > massiv[j + 1]) {
                    temp = massiv[j];
                    massiv[j] = massiv[j + 1];
                    massiv[j + 1] = temp;
                    display(massiv);
                }
            }
        }
    }

    private void display(int[] massiv) {
        for (int i = 0; i < count; i++) {
            System.out.print(massiv[i] + " ");
        }
        System.out.println(" ");
        try {
            // Приостановка выполнения на 3 секунды (3000 миллисекунд)
            Thread.sleep(200);
        } catch (InterruptedException e) {
        }
    }

/*    void clear() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }*/
}