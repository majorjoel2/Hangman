import java.util.Arrays;
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
	
	public static int prepareHangman(String word) {
		//do some stuff to prepare for the game
		return word.length();
	}
	
	public static byte askLetter(String word) {
		return 1;
	}
	
	static String[] missed = new String[] {"", "", "", "", "", ""};
	public static boolean missedLetter(String letter){
		for(int i = 0; i < 6; i++) {
			if(missed[i].equals(letter)) {
				return true;
			}
		}
		for(int j = 0; j < 6; j++) {
			if(missed[j].equals("")) {
				missed[j] = letter;
				return false;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(missedLetter(""));
	}
}




