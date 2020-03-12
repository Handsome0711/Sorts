import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BubbleSort{
    private ArrayList<Integer> list = new ArrayList<Integer>();
    private int size;
    public void sort(){
        for(int i=0; i<this.size;i++){
            for(int j=0; j<size-i-1; j++){
                if(list.get(j)>list.get(j+1)){
                    Collections.swap(list, j, j+1);
                }
            }
        }
    }
    public void setElements(){
        System.out.println("Please, enter size of array");
        Scanner in = new Scanner(System.in);
        this.size = in.nextInt();
        System.out.println("Please, enter elements of array");
        for(int i=0; i<size; i++){
            this.list.add(in.nextInt());
        }
    }
    public void showResult(){
        System.out.println("Sorted array:");
        for(int elem : list){
            System.out.print(elem + " ");
        }
    }
}
