import java.util.ArrayList;
import java.util.Collections;

public class QuickSort {
    private ArrayList<Integer> list;
    private int size;

    public QuickSort(ArrayList<Integer> list, int size) {
        this.list = new ArrayList<Integer>(list);
        this.size = size;
    }

    public ArrayList<Integer> sort() {
        return quickSort(this.list, 0, size - 1);
    }

    public ArrayList<Integer> quickSort(ArrayList<Integer> list, int low, int high) {
        int pivot = list.get(high - (high - low) / 2);
        int i = low;
        int j = high;

        while (i <= j) {
            while (list.get(i) < pivot) {
                i++;
            }
            while (list.get(j) > pivot) {
                j--;
            }
            if (i <= j) {
                Collections.swap(list, i, j);
                i++;
                j--;
            }
            System.out.println("");
            for(int elem : list){
                System.out.print(elem + " ");
            }
            if (low < j) {
                quickSort(list, low, j);
            }
            if (high > i) {
                quickSort(list, i, high);
            }
        }
        return list;
    }
}
