package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	// write your code here
        //Generate random number 1 to 50
        //ask user to guess number
        // if number too high tell them its too high
        // if number too low tell them its too low
        // if right tell them got the number right
        // 5 tries to get number right
        // when game ends given the option to end game or start new game

        boolean play = true;
        int guesses = 5;
        int random = (int)Math.ceil(Math.random()*50);

        do{
            Scanner input = new Scanner(System.in);

            System.out.println("start");
            try{

                System.out.println("Guess a number between 1 and 50 ");
                int guess = input.nextInt();

                if(guess == random){
                    System.out.println("You guessed right");
                    random = (int)Math.ceil(Math.random()*50);

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
                        if(play){
                            System.out.println("Thank you for playing");
                        }

                        else{
                            play = false;
                        }

                    }catch (Exception e){
                        System.out.println("invalid response game over");
                        play = true;
                    }

                }else{
                    guesses--;
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



 }


}

