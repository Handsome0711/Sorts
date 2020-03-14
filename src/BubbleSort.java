import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort extends Sort{
    private ArrayList<Integer> list;
    private int size;
    public BubbleSort(ArrayList<Integer> list, int size){
        this.list = new ArrayList<Integer>(list);
        this.size = size;
    }
    public void sort(){
        for(int i=0; i<this.size;i++){
            for(int j=0; j<this.size-i-1; j++){
                if(this.list.get(j)>this.list.get(j+1)){
                    Collections.swap(this.list, j, j+1);
                }
            }
        }
    }
    public void showResult(){
        System.out.println("Sorted array:");
        for(int elem : this.list){
            System.out.print(elem + " ");
        }
    }
}
