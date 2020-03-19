import java.util.ArrayList;

public class MergeSort {
    private ArrayList<Integer> list;
    private int size;

    public MergeSort(ArrayList<Integer> list, int size) {
        this.list = new ArrayList<Integer>(list);
        this.size = size;
    }

    public ArrayList<Integer> sort() {
        return mergeSort(this.list);
    }

    public ArrayList<Integer> mergeSort(ArrayList<Integer> list) {
        if (list.size() < 2) {
            return list;
        }

        ArrayList<Integer> leftList = new ArrayList<Integer>(list.subList(0, list.size() / 2));
        ArrayList<Integer> rightList = new ArrayList<Integer>(list.subList(list.size() / 2, list.size()));
        leftList = mergeSort(leftList);
        rightList = mergeSort(rightList);
        return merge(leftList, rightList);
    }

    public ArrayList<Integer> merge(ArrayList<Integer> leftList, ArrayList<Integer> rightList) {
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = 0; i < leftList.size() + rightList.size(); i++) {
            if (leftIndex == leftList.size()) {
                resultList.add(rightList.get(rightIndex));
                rightIndex++;
            } else if (rightIndex == rightList.size()) {
                resultList.add(leftList.get(leftIndex));
                leftIndex++;
            } else if (leftList.get(leftIndex) < rightList.get(rightIndex)) {
                resultList.add(leftList.get(leftIndex));
                leftIndex++;
            } else {
                resultList.add(rightList.get(rightIndex));
                rightIndex++;
            }
        }
        return resultList;
    }
}
