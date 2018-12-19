import java.nio.charset.Charset;
import java.text.Normalizer;

public class Utf81 {


    public static void main(String[] args) {
        String s = "Tĥïŝ ==> ĩš â \\\\ fůňķŷ Šťŕĭńġ&&& Partn   er�sç::©☆❤ name-> ^^^~!@#$%^&*()-+?><{}::;':TEST1020  .....space : - . MRN#TEST1020" +
                " Man is one. Now there are two spaces   Y%&^*&YIYUI: *&(^&*%^&%^()>> > ->:>:<";
        System.out.println("Input "+s);

        System.out.println();

        s =  Normalizer.normalize(s, Normalizer.Form.NFD);
//        String r = s.replaceAll("[^\\x00-\\x7F]", "").replaceAll("\\W","");
        String r = s.replaceAll("[^\\x00-\\x7F]", "").replaceAll("[^a-zA-Z0-9:\\-  \\.]+","");

        System.out.println(r);


 String m = "-> a^^^^^^^^^^^--__ : b -< -->&*&(*&*^&%^%%$##!#!$%*()__++:::<>>?";
//        System.out.println(m.replaceAll("[><^]",""));
        System.out.println(m.replaceAll("[^\\p{ASCII}]", "").replaceAll("[><^]",""));

        String outboundMsg ="Partner�sç©☆❤ name->TEST1020   MRN#TEST1020";
//        System.out.println(outboundMsg.replaceAll("[^\\p{ASCII}]", ""));

    }

}
