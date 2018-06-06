package Java8;

import java.util.ArrayList;
import java.util.List;

public class PreventCollectionFrmWastingMemory {

    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int element =1;

        addToList(element);
    }

    private static void addToList(Object element) {

        if(list == null){
            list.add((Integer)element);
        }else if(element instanceof Integer){

        }else{

        }


    }
}
