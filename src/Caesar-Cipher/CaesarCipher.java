
/**
 * Write a description of CaesarCipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaesarCipher {
    public static String encrypt(String input, int key){
        StringBuilder encrypted = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0,key);
        
        for (int i = 0; i < encrypted.length(); i++){
            char currChar = encrypted.charAt(i);
            int index = alphabet.indexOf(currChar);
            
            if(index != -1){
                char newChar = shiftedAlphabet.charAt(index);
                encrypted.setCharAt(i, newChar);
            }
        }
        return encrypted.toString();
    }
    
    public static void main(String[] args){
        System.out.println(encrypt("FIRST LEGION ATTACK EAST FLANK!",23));
    }
}
