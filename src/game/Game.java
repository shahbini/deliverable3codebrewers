/*
 * Group Name: CodeBrewers
 * Group Members: Binita | Kirandeep | Amandeep | Rahul
 * Project: Deliverable 3
 * Description: 
 */
package game;

import java.util.ArrayList;
import java.util.Scanner;


public class Game {

   public static void main(String[] args){
        System.out.println("Welcome to BlackJack!");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please type in your name?");
        String name = "";
        try{
            name = input.nextLine();
        }
        catch (java.util.InputMismatchException e){
            System.out.println("Please, give me your real name...\n");
            main(args);
            return;
        }
        System.out.println("Welcome to BlackJack, " + name + "!");
        Scanner input2 = new Scanner(System.in);
        System.out.println("How much money would you like to start with?");
        double bank = input2.nextDouble();
        while (bank <= 0){
            System.out.println("Cannot start with this amount of money.");
        }
        
        Player player = new Player(bank);
        Dealer dealer = new Dealer(player);
        
        dealer.start();
    }
}
