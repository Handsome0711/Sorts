import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {
    private ArrayList<Integer> list;
    private int size;

    public SelectionSort(ArrayList<Integer> list, int size) {
        this.list = new ArrayList<Integer>(list);
        this.size = size;
    }

    public ArrayList<Integer> sort() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            Collections.swap(list, minIndex, i);
        }
        return list;
    }

}
