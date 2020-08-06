package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class Regexsasa {
    public static void main(String[] args) throws IOException {
//        String cbxn = "Ye" +
//                "snjn\n"+"line 2\n"+"lin3\n\n"+"line4\n\n"+"line5";
//        System.out.println(cbxn);


        String var = "MSH|^~\\&|ABC5LPLUS|ABC5LPLUS|MEDGIS|MSMC|20180806104655||ORM^O01|40|P|2.5.1\n" +
                "PID|1|41|HO9942|1|Beka^Swartz^Middle||19900111|F|||||9618606047^^^charan@charan.com^1~|||||S4Accession#\n" +
                "NK1|1|Last Name^First Name|Brother||||||||||||M|19900101|||||||||||||||||2\n" +
                "NK1|2|DSd^First|Foster child||||||||||||F|19980101|||||||||||||||||3\n" +
                "PV1|1||BIMFM||||1790976819^Baron^Elisabeth^^^^^^^^^^^^^^^^^^MD||1669869871^Su^Tina\n" +
                "DG1|1||G91.2\n" +
                "GT1|1|10||||||||DOCT\n" +
                "IN1|1|1||Ameri Health|P.O box 211184^^Saint Paul^MN^55121|||12321312||||||||Swartz Beka|Self|19900111||||||||||||||||||31232312|||||||F\n" +
                "\n" +
                "IN2|1||^EmployerName\n" +
                "ORC|NW|243245454|1001-1|BIOAAUR|||201808060616||20180806|polaiah.chowdagani||4101^Elisabeth^Baron|||20180806\n" +
                "\n" +
                "OBR|1|243245454|1001-1|BIOAAUR|com.ABC5.lis.TestProtocol@404,com.ABC5.lis.TestProtocol@410|201808060616|201808060616|||||||||4101^Elisabeth^Baron\n" +
                "SPM|1|10011||CVS^chorionic villi||||admin||chorionic villi||||||||||||||1|201808060615\n" +
                "OBX|1|CE|PAT.SPECIAL|SPECIAL|GROU";
//        System.out.println(cbxn.replaceAll("(?m)^[\\s&&[^n]]+|[\\s+&&[^n]]+$",""));
//        System.out.println(cbxn.replaceAll("(\\r\\n|\\r|\\n)([^A-Z]|[A-Z][^A-Z]|[A-Z]{2}[^A-Z\\d])[^\\r\\n]*/ig","").replaceAll("/^\\s+/",""));
//        System.out.println(cbxn.replaceAll("[\\r\\n]",""));
        System.out.println(stringFormatter(var));
    }


    public static String stringFormatter(String textContent) throws IOException {
        BufferedReader bufReader = new BufferedReader(new StringReader(textContent));
        String line;
        String result = "";
        while ((line = bufReader.readLine()) != null) {
            if (!line.isEmpty()) {
                result = result + line + "\r";
            }
        }
        return result;
    }
}
