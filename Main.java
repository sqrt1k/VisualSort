import java.util.Random;
import java.util.Scanner;

interface ISort {
    void sort(int[] massiv);
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите нужную сортировку: ");
        System.out.println("1 - Сортировка пузырьком");
        int choise = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите количество элементов в массиве: ");
        int count = scanner.nextInt();
        scanner.close();
        Sort sort = new Sort(count);
        switch (choise) {
            case 1:
                System.out.println("Сортировка пузырьком");
                BublleSort bublleSort = new BublleSort();
                bublleSort.sort(sort.getMassiv());
        }
    }
}

class Sort {
    private int count;
    private final int[] massiv;

    //В конструкторе создаём массив и заполняем случайными элементами
    Sort(int count) {

        massiv = new int[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            massiv[i] = (int) (random.nextInt(1000));
        }
        display(massiv);
    }


    public int[] getMassiv() {
        return massiv;
    }

    public static void display(int[] massiv) {
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i] + " ");
        }
        System.out.println(" ");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
        }
    }
}