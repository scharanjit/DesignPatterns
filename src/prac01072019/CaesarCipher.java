package prac01072019;

public class CaesarCipher {

    public static String encryption(String input, int key){
        StringBuilder encrypted = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabet2 = alphabet.toLowerCase();
        String keyedalphabet = alphabet.substring(key) + alphabet.substring(0, key);
        for (int q = 0; q < encrypted.length(); q++) {
            char currChar = encrypted.charAt(q);
            int index = alphabet.indexOf(currChar);
            if (index != -1) {
                char newChar = keyedalphabet.charAt(index);
                encrypted.setCharAt(q, newChar);
            }
            index = alphabet2.indexOf(currChar);
            if (index != -1) {
                String keyedalphabet2 = keyedalphabet.toLowerCase();
                char newChar = keyedalphabet2.charAt(index);
                encrypted.setCharAt(q, newChar);
            }
        }
        return encrypted.toString();
    }


    public static void main(String[] args) {
        String inputString="I am a good boy";
        int key= 7;
        System.out.println(encryption(inputString,key));

    }
}
