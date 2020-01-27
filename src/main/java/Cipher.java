public class Cipher {
    public String encrypt(String text, int key) {

        String letters = "abcdefghijklmnopqrstuvwxyz";
        String cipheredText = "";

        for(int i = 0; i < text.length(); i++){
            int indexOfChar = letters.indexOf(text.charAt(i));
            int position = (key + indexOfChar) % 26;
            char shiftCharacter = letters.charAt(position);
            cipheredText += shiftCharacter;
        }
        return cipheredText;
    }
}