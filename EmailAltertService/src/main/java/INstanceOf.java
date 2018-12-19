public class INstanceOf {
    public static void main(String[] args) {

        String error="could not execute statement; SQL [n/a]; constraint [ACCESSION_ID_UNIQUE]; nested exception is org.hibernate.exception.ConstraintViolationException: could not execute statement LPORDERID : AC1477140\n" +
                "\n";

        if(error.contains("ACCESSION_ID_UNIQUE]")){
            System.out.println("HOLAAAAAAAAAAAAAAAAAAAAAAAA");
        }else {
            System.out.println("nahi");
        }


    }
}
