public class Decipher {
    public String decrypt(String text, int key) {

        String letters = "abcdefghijklmnopqrstuvwxyz";
        String decipheredText = "";

        for(int i = 0; i < text.length(); i++){

            if (Character.isLetter(text.charAt(i))) {

                int indexOfChar = letters.indexOf(text.charAt(i));
                int position = (indexOfChar - key) % 26;

                if (position < 0) {
                    position = letters.charAt(i);
                }
                char shiftCharacter = letters.charAt(position);
                decipheredText += shiftCharacter;

            }else {
                decipheredText+= text.charAt(i);
            }
        }
        return decipheredText;
    }
}
