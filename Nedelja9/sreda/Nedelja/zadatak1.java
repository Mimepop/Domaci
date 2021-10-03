package Nedelja9.nedelja;

import java.util.ArrayList;
import java.util.List;

public class zadatak1 {
    public static List<Integer> sortArray(int[] niz){
        List<Integer> arr=new ArrayList<>();
        int counter=0;
        for (int i = 0; i < niz.length; i++) {
            if(niz[i]!=0){
                arr.add(niz[i]);
            }
            else{
                counter++;
            }

        }
        for (int i = 0; i < counter; i++) {
            arr.add(0);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,6,9,0,5,4,0,1,0};
        System.out.println(sortArray(a));
    }
}
