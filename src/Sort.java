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
    public void showResult(ArrayList<Integer> list){
        for(int elem : list){
            System.out.print(elem + " ");
        }
    }
    public void callSorts(){
        System.out.println("Bubble sort:");                                     //Call bubble sort
        BubbleSort bubbleSort= new BubbleSort(this.list, this.size);
        showResult(bubbleSort.sort());
        System.out.println("\nInsertion sort:");
        InsertionSort insertionSort = new InsertionSort(this.list, this.size);  //Call insertion sort
        showResult(insertionSort.sort());

    }
}
