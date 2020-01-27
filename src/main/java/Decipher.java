public class Decipher {
    public String decrypt(String text, int key) {

        String letters = "abcdefghijklmnopqrstuvwxyz";
        String decipheredText = "";

        for(int i = 0; i < text.length(); i++){
            int indexOfChar = letters.indexOf(text.charAt(i));
            int position = (indexOfChar - key) % 26;
            char shiftCharacter = letters.charAt(position);
            decipheredText += shiftCharacter;
        }
        return decipheredText;
    }
}
