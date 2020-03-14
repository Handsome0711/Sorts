import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort{
    private ArrayList<Integer> list;
    private int size;
    public BubbleSort(ArrayList<Integer> list, int size){
        this.list = new ArrayList<Integer>(list);
        this.size = size;
    }
    public ArrayList<Integer> sort(){
        for(int i=0; i<this.size;i++){
            for(int j=0; j<this.size-i-1; j++){
                if(this.list.get(j)>this.list.get(j+1)){
                    Collections.swap(this.list, j, j+1);
                }
            }
        }
        return this.list;
    }

}
