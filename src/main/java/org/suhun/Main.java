package org.suhun;

public class Main {
    public static void main(String[] args) {
        int[] nums = {8, 2, 6, 10, 4, 80, 20};
        SelectionSortImplement selectionSortImplement = new SelectionSortImplement();
        int[] result = selectionSortImplement.selection_sort(nums);
        for(int num:result){
            System.out.println(num);
        }
    }
}