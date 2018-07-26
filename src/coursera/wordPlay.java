package coursera;

public class wordPlay {
	
	public static boolean isVowel(char ch){
        return "AEIOUaeiou".indexOf(ch) != -1;
    }    
    
	public static String replaceVowels(String phrase, char ch){
        StringBuilder newString = new StringBuilder(phrase);
		for(int i = 0; i < phrase.length(); i++){
            if(isVowel(phrase.charAt(i))){
                newString.setCharAt(i, ch);
            }
        }
        return newString.toString();
    }
	
	public static String emphasize(String phrase, char ch) {
		StringBuilder newString = new StringBuilder(phrase);
		for(int i = 0; i < phrase.length(); i++){
            if(Character.toLowerCase(phrase.charAt(i)) == Character.toLowerCase(ch)){
                if(i % 2 == 0) {
                	newString.setCharAt(i, '*');
                }
                else
                	newString.setCharAt(i, '+');
            }
        }
		return newString.toString();
	}
    
    public static void main(String[] args) {
    	System.out.println(replaceVowels("Hello world",'*'));
    	System.out.println(emphasize("Mary Bella Abracadabra",'A'));
    }
}
