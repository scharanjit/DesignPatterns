package design.patterns.factory;

public class NormalWay {
    public static void main(String[] args) {
        OS os = new Windows();
        os.spec();

        OS os1 = new Linux();
        os1.spec();

        OS os2 = new iOS();
        os2.spec();

    }
}
