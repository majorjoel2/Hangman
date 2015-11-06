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
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		updateUI("c", 0, 1, "cat");
		updateUI("a", 1, 1, "cat");
		updateUI("t", 2, 1, "cat");
	}

}
