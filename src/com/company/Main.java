package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        boolean playAgain = true;

        do {
            System.out.println ("Story");
            //code for clicking space for the next prompt

            Scanner reader = new Scanner(System.in);
            System.out.println("Choose your next step by entering number 1-4" +
                    " 1. You decide to scream, hoping someone will rescue you" +
                    " 2. You decide to explore because you have nothing to lose" +
                    " 3. You try finding a way to climb out" +
                    " 4. Nothing ");
            String inputFromUser = reader.next();
            if (inputFromUser.equals("1")) {
                System.out.println("Option 1 or Option 1a");

                String inputFromUser2 = reader.next();
                if (inputFromUser2.equals ("Option1")){
                        System.out.println ("End 1");
                        playAgain = true;
                }
                else if (inputFromUser2.equals ("Option1a")){
                    System.out.println ("End 2");
                        System.out.println ("Would you like to play again?");
                        String answer = reader.next();
                            if (answer.equals ("Y")) {
                                playAgain = true;
                            }
                            else {
                                System.out.println ("Game Over");
                                playAgain = false;
                            }
                }

                else {
                        System.out.println ("Try Again");
                        playAgain = false;
                    }

            }

            if (inputFromUser.equals("2")) {
                System.out.println("Option 2a or Option 2b");

                String inputFromUser2 = reader.next();
                if (inputFromUser2.equals("Option2a")) {
                    System.out.println("End 2a");
                    System.out.println("Would you like to play again?");
                    String answer = reader.next();
                    if (answer.equals("Y")) {
                        playAgain = true;
                    } else if (inputFromUser2.equals("Option2b")) {
                        System.out.println("End 2b");
                        System.out.println("Would you like to play again?");
                        String answer2 = reader.next();
                        if (answer2.equals("Y")) {
                            playAgain = true;
                        } else {
                            System.out.println("Game Over");
                            playAgain = false;
                        }

                    }
                }
            }

            if (inputFromUser.equals("3")) {
                System.out.println("Option 3a or Option 3b");

                String inputFromUser3 = reader.next();
                if (inputFromUser3.equals("Option3a")) {
                    System.out.println("End 3a");
                    System.out.println("Would you like to play again?");
                    String answer3 = reader.next();
                    if (answer3.equals("Y")) {
                        playAgain = true;
                    } else {
                            System.out.println("Game Over");
                            playAgain = false;
                        }

                    }

                } else if (inputFromUser.equals("Option3b")) {
                    System.out.println("End 3b");
                    System.out.println("Would you like to play again?");
                    String answer4 = reader.next();
                        if (answer4.equals("Y")) {
                            playAgain = true;
                        }else {
                            System.out.println("Game Over");
                             playAgain = false;
                }
            }

    } while (playAgain == true);


        }

//    public static int answer (Scanner reader) {
//        System.out.println ("Would you like to play again? (1) for Yes (2) for No ");
//        int answer = reader.nextInt();
//        if (Objects.equals(answer, "1")) {
//            return answer;
//        }

//    }
//    public static void choiceTwo (int num) {
//        if (num==2){
//            System.out.println("You run into the Teenage Mutant Ninja Turtles. You become the newest member, Rembrandt");
//        }else {
//
//        }
//    }
//
//    public static void choiceThree (int num) {
//        if (num==3){
//            System.out.println("As your climbing, you slip and pull a lever. It floods the whole place");
//        }else {
//
//        }
//    }
//
//    public static void choiceFour (int num) {
//        if (num==3){
//            System.out.println("Surprise! Someone dropped a quarter and saw your body a few months later. You somehow managed to stay alive. ");
//        }else {

        }


