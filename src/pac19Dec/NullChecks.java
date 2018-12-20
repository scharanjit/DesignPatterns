package pac19Dec;


import java.util.Objects;

public class NullChecks {



    public static void main(String[] args) {

        System.out.println(getLock(null,""));

    }


    public static boolean getLock(String name, String value){
        Objects.requireNonNull(name,"name");
        Objects.requireNonNull(value,"value");

        return mockGetLock(name,value);
    }

    private static boolean mockGetLock(String name, String value) {
        return name != null && value != null;

    }

}
