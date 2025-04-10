public class BublleSort implements ISort {
    @Override
    public void sort(int[] massiv) {
        int temp = 0;
        int count = massiv.length;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - 1; j++) {
                if (massiv[j] > massiv[j + 1]) {
                    temp = massiv[j];
                    massiv[j] = massiv[j + 1];
                    massiv[j + 1] = temp;
                    Sort.display(massiv);
                }
            }
        }
    }
}
