import java.util.ArrayList;

public class InsertionSort {
    private ArrayList<Integer> list;
    private int size;
    public InsertionSort(ArrayList<Integer> insSort, int size){
        this.list = insSort;
        this.size = size;
    }

    public ArrayList<Integer> sort(){
        for(int i=1; i<size; i++){
            int j=i-1;
            int key = list.get(i);
            while (j>=0 && list.get(j)>key){
                list.set(j+1, list.get(j));
                j--;
            }
            list.set(j+1, key);
        }
        return list;
    }
}
