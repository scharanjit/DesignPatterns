import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collections;

public class ListCompare {

    public static void main(String[] args) {

        String abc = "";


        System.out.println(  StringUtils.isNotEmpty(abc));

        ArrayList<Integer> sortedTestDiseaseList = new ArrayList<>();
        ArrayList<Integer> sortedMdDiseaseMdTestList = new ArrayList<>();


        for(int i =0 ; i<=12;i++){
            sortedTestDiseaseList.add(i);
        }
//
//        for(int j=11; j>=0; j--){
//            sortedMdDiseaseMdTestList.add(j);
//        }

        Collections.sort(sortedTestDiseaseList);
         Collections.sort(sortedMdDiseaseMdTestList);
//
//        System.out.println(sortedTestDiseaseList.equals(sortedMdDiseaseMdTestList));
    }
}


