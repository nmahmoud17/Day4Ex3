package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println ("You're walking to Detroit Labs, and you decided to be productive, you go extra early and nobody is out in the street" +
                "Going along your merry way, and you suddenly fall into a storm drain. Don't worry though you magically didn't break any bones. You're panicking now though, what do you do next?");
        //code for clicking space for the next prompt

        Scanner reader = new Scanner(System.in);
        System.out.println("Choose your next step by entering number 1-4"
        +"1. You decide to scream, hoping someone will rescue you" +
                " 2. You decide to explore because you have nothing to lose" +
                "3. You try finding a way to climb out" +
                " 4. Nothing ");

        String input = reader.next();

        do () {
            String input = in.nextLine();
            if (input.equals("1")) {


            } else if (input.equals("2")) {

            } else if (input.equals("3")) {

            }else if (input.equals ("4"))  {

            } else {

            }

        }while ()


    }

    public static void choiceOne (int num) {
        if (num==1){
            System.out.println("Nobody ever finds you. Sorry.");
        }else {

        }
    }
    public static void choiceTwo (int num) {
        if (num==2){
            System.out.println("You run into the Teenage Mutant Ninja Turtles. You become the newest member, Rembrandt");
        }else {

        }
    }

    public static void choiceThree (int num) {
        if (num==3){
            System.out.println("As your climbing, you slip and pull a lever. It floods the whole place");
        }else {

        }
    }

    public static void choiceFour (int num) {
        if (num==3){
            System.out.println("Surprise! Someone dropped a quarter and saw your body a few months later. You somehow managed to stay alive. ");
        }else {

        }
    }
}
