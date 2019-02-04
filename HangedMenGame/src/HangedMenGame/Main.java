package HangedMenGame;

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {

        Guess guess = new Guess();
        // numbers of attempts can be tried.
        int numAttempts = 5;
        
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter your secret word: ");
        String storeWord = scanner.nextLine().toLowerCase();

        int nLen = storeWord.length();
        
        char[] wordShow = storeWord.toCharArray();
        // store input word as symbol '*'.
        char [] wordShowSymbol = storeWord.toCharArray();
        
        for (int i = 0; i < nLen; i++) {
        	
            wordShowSymbol[i] = '*';
            
        }
        
        System.out.println("Word to guess:");
    	// print out current word the users guess.
    	System.out.println(wordShowSymbol);
        
        System.out.println("Ready to guess?");
        System.out.println("+---------------------------------------------------------------------------+");
        System.out.println("+ Please choose a level to start the game(h or b):                          +");
        System.out.println("+ (h) High level: guess the whole word to win(if it is wrong, game is over) +");
        System.out.println("+ (b) basic level: guess the letter one by one to win(you have 5 attempts)  +");
        System.out.println("+---------------------------------------------------------------------------+");
        
        String option = scanner.nextLine().toLowerCase();
        String h = "h";
        String b = "b";

        if(h.equals(option)) {
        	
        	// print out current word the users guess
        	System.out.println(wordShowSymbol);
        	
            System.out.println("Guess the word: ");
            Scanner scanner1 = new Scanner(System.in);
            String guessing = scanner1.nextLine().toLowerCase();
            
        	if(guessing.equals(storeWord)) {
        		
        		System.out.println("You guessed the word " + storeWord.toUpperCase() + "!");

        	}else {
        		
        		System.out.println("You guess is wrong. Game is over!");
        		
        	}
        }
        else if(b.equals(option)) {
        	
        	while(numAttempts > 0 && guess.isContaisChar(wordShowSymbol,'*'))
            {
            	boolean correctGuess = false;
            	// print out current word the users guess.
            	System.out.println(wordShowSymbol);
            		
                System.out.println("Pick a letter to guess: ");
                String guessing2 = scanner.nextLine().toLowerCase().substring(0, 1);
                char guessingChar2 = guessing2.charAt(0);
     
                    // check if guessing letter equals to secret word.
                    for(int i = 0; i < wordShowSymbol.length; i++)
                    {
                        if(wordShow[i] == guessingChar2)
                        {
                            wordShowSymbol[i] = guessingChar2;
                            correctGuess = true;
                        }
                    }

                    if(!correctGuess)
                    {
                    	System.out.println("Your guess is wrong!");
                    	System.out.println("Try again");
                        numAttempts--;
                        System.out.println("You have " + numAttempts + " attempt(s) left!");
                    }
                    else if(correctGuess){
                    	System.out.println("The guessing letter is correct! Now the secret word is: ");
                    }
                }
                
                if(numAttempts > 0) {
                	
                	System.out.println("You guessed the word " + storeWord.toUpperCase() + "!");
                	
                }else {
                	
                	System.out.println("Out of attempts. Game is over!");
                	
                }
            }else {
            	
            	System.out.println("Invalid option");
            	
            }
        

    }
}