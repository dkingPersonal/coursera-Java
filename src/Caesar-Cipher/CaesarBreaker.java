
public class CaesarBreaker {
	
	int[] countLetters(String message) {
		String alph = "abcdefghijklmnopqrstuvwxyz";
		int[] counts = new int[26];
		
		for(int k=0; k<message.length(); k++) {
			char ch = Character.toLowerCase(message.charAt(k));
			int index = alph.indexOf(ch);
			if(index != -1) {
				counts[index] += 1;
			}
		}
		return counts;
	}
	
	int indexOfMax(int[] values) {
    	int base = 0;
    	for (int k=0; k<values.length; k++) {
    		if(values[k] > values[base]) {
    			base = k;
    		}
    	}
    	return base;
    }
	
	String decrypt(String encrypted) {
		CaesarCipher cc = new CaesarCipher();
		int[] freqs = countLetters(encrypted);
		int maxIndex = indexOfMax(freqs);
		int dkey = maxIndex - 4;
		if(maxIndex < 4) {
			dkey = 26 - (4 - maxIndex);
		}
		return cc.encrypt(encrypted, 26 - dkey);
	}
	
	String halfOfString(String message, int start) {
		StringBuilder sb = new StringBuilder(message);
		for(int k=start; k<message.length()-1; k+=2) {
			sb.deleteCharAt(k);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		CaesarBreaker cb = new CaesarBreaker();
		//System.out.println(cb.decrypt("LIPPS XLIVI"));
		System.out.println(cb.halfOfString("Qbkm Zgis", 0));
	}

}
