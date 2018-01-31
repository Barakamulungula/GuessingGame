package com.company;

import javax.swing.plaf.synth.SynthTextAreaUI;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Generate random number 1 to 50
        //ask user to guess number
        // if number too high tell them its too high
        // if number too low tell them its too low
        // if right tell them got the number right
        // 5 trys to get number right
        // when game ends given the option to end game or start new game
        boolean play = true;
        int guesses = 5;

        do{
            Scanner input = new Scanner(System.in);
            int random = (int)Math.ceil(Math.random()*50);
            try{
                System.out.println("Guess a number: ");
                int guess = input.nextInt();

                if(guess == random){
                    System.out.println("You guessed right");
                    try{
                        System.out.println("Do you wish to continue ('Y', 'N') ");
                        input.nextLine();
                        play = input.nextLine().toUpperCase().equals("Y");

                    }catch (Exception e){
                        System.out.println("invalid response game over");
                        play = false;
                    }

                }else if(guesses == 1){
                    System.out.println("You ran out of guesses. The correct number is "+random);
                    try{
                        System.out.println("Do you wish to continue ('Y', 'N') ");
                        input.nextLine();
                        play = input.nextLine().toUpperCase().equals("Y");

                    }catch (Exception e){
                        System.out.println("invalid response game over");
                        play = false;
                    }

                }else{
                    guesses -= 1;
                    System.out.println("Guess left:"+guesses);
                    if(guess > random){
                        System.out.println("Your number was too high");

                    } else{
                        System.out.println("Your number was too low");
                    }
                }

            }catch (Exception e){
                System.out.println("Error enter a number");
            }

        }while(play);

        System.out.println("Thank you");

    }


}
