package model;

public class mehehe {

    public static void main(String[] args) {
        String date = "2018-08-29T07:2";
//        String date = "2018-08-29";


        String parsedDate = date.replaceAll("-","").replaceAll("T","").replaceAll(" ","").replaceAll(":","");

        if(parsedDate.length()>13){
            System.out.println(parsedDate.substring(0,14));
        }else{
            System.out.println(parsedDate.substring(0,8)+"000000");
        }


    }
}
