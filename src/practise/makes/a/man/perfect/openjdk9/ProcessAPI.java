package practise.makes.a.man.perfect.openjdk9;

import java.io.IOException;

public class ProcessAPI {


    public static void main(String[] args) throws IOException {
        Process process = new ProcessBuilder("gedit.exe").start();

//        System.out.println(process.pid());
    }
}
