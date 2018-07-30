
/**
 * Write a description of wordLengths here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import edu.duke.*;


public class wordLengths {
    
	void countWordLengths(FileResource resource, int[] counts){
       for(String s : resource.words()){
           s = s.toLowerCase();
    	   int wordLength = s.length();
           if(Character.isLetter(s.charAt(0)) == false & Character.isLetter(s.charAt(s.length() - 1)) == false){
               wordLength = wordLength - 2;
               counts[wordLength] +=1;
            }
           else if (Character.isLetter(s.charAt(0)) == false || Character.isLetter(s.charAt(s.length() - 1)) == false){
               wordLength = wordLength - 1;
               counts[wordLength] +=1;

            }
           else{
               wordLength = s.length();
               counts[wordLength] +=1;
            }
           
           if(wordLength >= counts.length) {
        	   counts[counts.length] +=1;
           }
       }
       
       for(int k=1; k<counts.length; k++){
           System.out.println("No of words with length "+k+" are "+counts[k]);
       }
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
    
    public static void main(String[] args){
        wordLengths wl = new wordLengths();
    	int[] counts = new int[25];
        FileResource fr = new FileResource("C:\\textfiles\\Hello.txt");
        wl.countWordLengths(fr, counts);
        System.out.println("\nwordLength with most occurences is "+wl.indexOfMax(counts));
    }
}
