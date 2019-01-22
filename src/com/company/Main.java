package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    Scanner reader = new Scanner(System.in);
    boolean playAgain;

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        boolean playAgain = true;

        Main choiceToPlay;
        choiceToPlay = new Main();
        String answer;


        do {
            System.out.println("Story");

            System.out.println("Choose your next step by entering number 1-4" +
                    " 1. You decide to scream, hoping someone will rescue you" +
                    " 2. You decide to explore because you have nothing to lose" +
                    " 3. You try finding a way to climb out" +
                    " 4. Nothing ");

            String inputFromUser = reader.next();
            if (inputFromUser.equals("1")) {
                System.out.println("Option 1 or Option 1a");
            }
            else if (inputFromUser.equals ("2")) {
                System.out.println("Option 2 or Option 2a");
            }
            else if (inputFromUser.equals ("3")) {
                System.out.println("Option 3 or Option 3a");
            }else if (inputFromUser.equals ("4")) {
                System.out.println("Option 4 or Option 4a");
            }else{
                System.out.println ("Make sure to choose one of the options");
            }

            inputFromUser = reader.next();
            if (inputFromUser.equals("Option1")) {
                System.out.println("End 1");
                System.out.println("\n");
                System.out.println("Would you like to play again?");
            }
            answer = reader.next();
            if (answer.equals("Y")) {
                    System.out.println("Make better choices next time.");
                    playAgain = true;
            } else {
                System.out.println("Game Over");
                playAgain = false;
            }


            if (inputFromUser.equals("Option1a")) {
                System.out.println("End 1a");
                System.out.println("Would you like to play again?");
                answer = reader.next();
                if (answer.equals("Y")) {
                    System.out.println("Make better choices next time.");
                    playAgain = true;
                }
            } else {
                    System.out.println("Game Over");
                    playAgain = false;
            }


//            if (inputFromUser.equals("Option2")) {
//                System.out.println("End 2");
//                System.out.println("\n");
//                System.out.println("Would you like to play again?");
//                answer = reader.next();
//                if (answer.equals("Y")) {
//                    System.out.println("Make better choices next time.");
//                    playAgain = true;
//                } else {
//                    System.out.println("Game Over");
//                    playAgain = false;
//                }
//            }
//
//            inputFromUser = reader.next();
//            if (inputFromUser.equals("Option2a")) {
//                System.out.println("End 2a");
//                System.out.println("\n");
//                System.out.println("Would you like to play again?");
//                answer = reader.next();
//                if (answer.equals("Y")) {
//                    System.out.println("Make better choices next time.");
//                    playAgain = true;
//                }
//            } else {
//                System.out.println("Game Over");
//                playAgain = false;
//            }

        } while (playAgain);

//            String inputFromUser2a = reader.next();
//            if (inputFromUser2a.equals("2")) {
//                System.out.println("Option 2 or Option 2a");
//
//                String inputFromUser2b = reader.next();
//                if (inputFromUser2a.equals("Option2")) {
//                    System.out.println("End 2a");
//                    playAgain = true;
//                } else if (inputFromUser2b.equals("Option2a")) {
//                    System.out.println("End 2");
//                    System.out.println("Would you like to play again?");
//                    String answer = reader.next();
//                    if (answer.equals("Y")) {
//                        playAgain = true;
//                    } else {
//                        System.out.println("Game Over");
//                        playAgain = false;
//                    }
//                } else {
//                    System.out.println("Try Again");
//                    playAgain = false;
//                }

        }
        }
    




//    public void answer() {
//        System.out.println("Would you like to play again? (Y) for Yes (N) for No ");
//
//        String answer = reader.next();
//        if (answer.equals("Y")) {
//            System.out.println("Make better choices this time.");
//            playAgain = true;
//        } else {
//            playAgain = false;
//        }
//
//    }






