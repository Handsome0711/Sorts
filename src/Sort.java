import java.util.ArrayList;
import java.util.Scanner;

public class Sort {
    protected ArrayList<Integer> list = new ArrayList<Integer>();
    protected int size;

    public void setElements(){
        System.out.println("Please, enter size of array");
        Scanner in = new Scanner(System.in);
        this.size = in.nextInt();
        System.out.println("Please, enter elements of array");
        for(int i=0; i<this.size; i++){
            this.list.add(in.nextInt());
        }
    }
    public void callSorts(){
        BubbleSort bubbleSort= new BubbleSort(this.list, this.size);
        bubbleSort.sort();
        bubbleSort.showResult();
    }
}
