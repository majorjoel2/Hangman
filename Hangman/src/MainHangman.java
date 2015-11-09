import java.util.Random;
import java.util.Scanner;

public class MainHangman {
	
	public static String randomWord() {
		//select a word at random
		String[] wordList = new String[] {"cat", "egypt", "ten", "python", "pokemon", "blue", "train", "zone", "lost", "network"};
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
	
	public static String askLetter() {
		Scanner keybrd = new Scanner(System.in);
 		String question = "Letter? ";
 		System.out.println(question);
 		String letter = keybrd.nextLine();
		return letter.toLowerCase();
	}
	
	public static byte letterPOS(String[] word, String letter) {
		byte POS = 100;
		for(byte i = 0; i < word.length; i++) {
			if(word[i].equals(letter)) {
				POS = i;
			}
		}
		return POS;
	}
	
	static String l1 = " ";
	static String l2 = " ";
	static String l3 = " ";
	static String l4 = " ";
	static String l5 = " ";
	static String l6 = " ";
	static String l7 = " ";
	static String l8 = " ";
	static int stage = 0;
	public static void updateUI(String letter, int position, int update, String word) {
	
		String stage0 = "         *------*	\n	|	|	\n		|	\n	        |	\n	        |	\n             =======\n";
		String stage1 =             "         *------*    \n	|	|	\n	0	|	\n		|	\n          	|	\n	        |	\n             =======\n";
		String stage2 =            "         *------*    \n 	|	|	\n	0	|	\n      	|	|\n          	|	\n	        |	\n             =======\n";
		String stage3 =          "         *------*	\n	|	|	\n	0	|	\n      /	|	|	\n	        |	\n          	|	\n             =======\n";
		String stage4 =            "         *------*	\n	|	|	\n	0	|	\n      / | \\	|	\n	        |	\n	        |	\n             =======\n";
		String stage5 =			"         *------*    \n 	|	|	\n	0	|	\n      / | \\     |	\n       /        |	\n	        |	\n             =======\n";
		String stage6 =		    "         *------*    \n	|	|	\n	0	|	\n      / | \\	|	\n       / \\	|	\n		| 	\n             =======\n";
		
		if(position == 0 && update == 1) {
			l1 = letter;
		}
		if(position == 1 && update == 1) {
			l2 = letter;
		}
		if(position == 2 && update == 1) {
			l3 = letter;
		}
		if(position == 3 && update == 1) {
			l4 = letter;
		}
		if(position == 4 && update == 1) {
			l5 = letter;
		}
		if(position == 5 && update == 1) {
			l6 = letter;
		}
		if(position == 6 && update == 1) {
			l7 = letter;
		}
		
		int lengthofword = word.length();
		
		if(update == 0) {
			stage++;
		}
		
		if(stage == 0) {
			System.out.println(stage0);
		}
		if(stage == 1) {
			System.out.println(stage1);
		}
		if(stage == 2) {
			System.out.println(stage2);
		}
		if(stage == 3) {
			System.out.println(stage3);
		}
		if(stage == 4) {
			System.out.println(stage4);
		}
		if(stage == 5) {
			System.out.println(stage5);
		}
		if(stage == 6) {
			System.out.println(stage6);
		}
		
		if(lengthofword == 3) {
			System.out.println(l1 + " " + l2 + " " + l3);
			System.out.println("_ _ _");
		}
		if(lengthofword == 4) {
			System.out.println(l1 + " " + l2 + " " + l3 + " " + l4);
			System.out.println("_ _ _ _");
		}
		if(lengthofword == 5) {
			System.out.println(l1 + " " + l2 + " " + l3 + " " + l4 + " " + l5);
			System.out.println("_ _ _ _ _");
		}
		if(lengthofword == 6) {
			System.out.println(l1 + " " + l2 + " " + l3 + " " + l4 + " " + l5 + " " + l6);
			System.out.println("_ _ _ _ _ _");
		}
		if(lengthofword == 7) {
			System.out.println(l1 + " " + l2 + " " + l3 + " " + l4 + " " + l5 + " " + l6 + " " + l7);
			System.out.println("_ _ _ _ _ _ _");
		}
		if(lengthofword == 8) {
			System.out.println(l1 + " " + l2 + " " + l3 + " " + l4 + " " + l5 + " " + l6 + " " + l7 + " " + l8);
			System.out.println("_ _ _ _ _ _ _ _");
		}
		
		System.out.println("");
		System.out.println("");
	}
	
	public static byte hasWon(String word) {
		int WordLenth = word.length();
		if(WordLenth == 3 && l1 != " " && l2 != " " && l3 != " ") {
			return 2;
		}
		if(WordLenth == 4 && l1 != " " && l2 != " " && l3 != " " && l4 != " ") {
			return 2;
		}
		if(WordLenth == 5 && l1 != " " && l2 != " " && l3 != " " && l4 != " " && l5 != " ") {
			return 2;
		}
		if(WordLenth == 6 && l1 != " " && l2 != " " && l3 != " " && l4 != " " && l5 != " " && l6 != " ") {
			return 2;
		}
		if(WordLenth == 7 && l1 != " " && l2 != " " && l3 != " " && l4 != " " && l5 != " " && l6 != " " && l7 != " ") {
			return 2;
		}
		if(WordLenth == 8 && l1 != " " && l2 != " " && l3 != " " && l4 != " " && l5 != " " && l6 != " " && l7 != " " && l8 != " ") {
			return 2;
		}
		return 0;
	}
		
	public static void main(String[] args) {
		System.out.println("Welcome to Hangman/nCreated by the first (and best) APCS class.");
		String randomWord = randomWord();
		String[] word = prepareHangman(randomWord);
		byte winCondition = 0; //0=nothing 1=lost 2=won
		byte letterPOS;
		boolean correctLetter;
		boolean repeatLetter;
		String letter = "";
		
		while(winCondition == 0) {
			letter = askLetter();
			correctLetter = true;//correctLetter = grant'sTask(word, letter);
			if(correctLetter == true) {
				letterPOS = letterPOS(word, letter);
				updateUI(letter, letterPOS, 1, randomWord);
			} else {
				repeatLetter = false;//repeatLetter = david'sTask(word, letter);
				if(repeatLetter == false) {
					updateUI("", 100, 0, randomWord);
				}
			}
			if(stage == 6) {
				winCondition = 1;
			} else {
				winCondition = hasWon(randomWord);
			}
		}
		
		if(winCondition == 1) {
			System.out.println("*********\n YOU LOST\n*********");
		}
		if(winCondition == 2) {
			System.out.println("********\n YOU WON\n********\n\n");
		}
		System.out.println("Thank you for playing Hangman");
	}
}