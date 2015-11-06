import java.util.Random;
import java.util.Scanner;

public class MainHangman {
	
	public static String randomWord() {
		//select a word at random
		String[] wordList = new String[] {"", "1", "2"};
		int min = 0;
		int max = 9;
		Random Random = new Random();
		int randomWord = Random.nextInt(max - min + 1) + min;
		String output = wordList[randomWord];
		return output;
	}
	
	public static String[] prepareHangman(String word) {
		//do some stuff to prepare for the game
		String[] letters = new String[word.length()];
		for( int i=0; i < letters.length; i++){
			letters[i] = word.substring ( i, i+1);
		}
		return letters; 
	}
	
	public static byte askLetter(String word) {
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
