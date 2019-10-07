package com.company;

//import af scanner til koden
import java.util.Scanner;
//import af tidstageren
import java.util.concurrent.TimeUnit;

    public class Regnemaskine {

        public static void main(String[] args) throws InterruptedException {
            // intro
            System.out.println("Velkommen til den vanvittige Regnemaskine!");
            System.out.println("Du vil blive bedt om at indtaste hver kommando for sig - sindssygt !");
            System.out.println("Først! Indtast det første tal i dit vanvittige regnestykke:");

            //scanner tilføjes
            Scanner input = new Scanner(System.in);

            double a = input.nextDouble(); //skaber objektet "a" af typen double (kan indeholde decimaler) og giver tal-værdi fra input
            System.out.println("Hvad vil du gøre med " + a + " ? Vælg mellem: + , - , *  eller  /");

            char operator; //skaber "operator" af typen char da denne kan indeholde et tegn.
            operator = input.next().charAt(0); //tildeler værdi fra input til "operator"

            // Giver bestemt besked til spilleren afhængig af operator
            if (operator == '*') {
                System.out.println("Hvad vil du gange " + a + " med? Jeg håber det er vanvittigt!");
            }
            else if (operator == '/') {
                System.out.println("Hvad vil du dividere " + a + " med? Jeg håber det er vanvittigt!");
            }
            else if (operator == '+') {
                System.out.println("Hvad vil du lægge til " + a + " ? Jeg håber det er vanvittigt!");
            }
            else if (operator == '-') {
                System.out.println("Hvad vil du trække fra " + a + " ? Jeg håber det er vanvittigt!");
            }


            double b = input.nextDouble();// tilføjer "b" og giver talværdi fra input
            System.out.println("Åh nej.... ");
            TimeUnit.MILLISECONDS.sleep(1000);// læsning pauses (sleep) timeout her på 1000 millisec
            System.out.println("Tænker...");
            TimeUnit.MILLISECONDS.sleep(1500);
            System.out.println("FUuUUuUuUCK mIn HjErnE!");
            TimeUnit.MILLISECONDS.sleep(1000);
            System.out.println("JEG HAR DEN !");
            TimeUnit.MILLISECONDS.sleep(1000);

            double answer; //skaber objekt answer

            // if else forgrening for at beregne og vise svar baseret på operator
            if (operator == '*') {
                answer = a * b;
                System.out.println(a + " * " + b + " = " + answer);
            }
            else if (operator == '/') {
                answer = a / b;
                System.out.println(a + " / " + b + " = " + answer);
            }
            else if (operator == '+') {
                answer = a * b;
                System.out.println(a + " + " + b + " = " + answer);
            }
            else if (operator == '-') {
                answer = a - b;
                System.out.println(a + " - " + b + " = " + answer);
            }
        }
    }


