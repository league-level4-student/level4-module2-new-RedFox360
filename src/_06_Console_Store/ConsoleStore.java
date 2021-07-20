package _06_Console_Store;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import _02_Generics_Store.*;

public class ConsoleStore {

    /*
     * Write a program that simulates shopping in a store using the Scanner and
     * the classes in Generics_Store.
     * 
     * Note: You may need to modify existing code in Generics Store and/or add
     * additional items and pictures to fulfill all the requirements. You are
     * also free to add any additional methods or classes in Console Store that
     * might be helpful to you.
     * 
     * Requirements:
     * 
     * -Use Ternary operators in place of simple if/else statements and do-while
     * loops instead of while loops where appropriate.
     * 
     * - There should be at least four unique items the user can buy. These can
     * be food items, nonfood items or both.
     * 
     * - The user should have a stipend of money to spend and each item should
     * have its own price.
     * 
     * -The user should have the ability to add items to their cart, remove
     * items, view items or check out.
     * 
     * -The program should continue until the user chooses to check out.
     * 
     * -When the user checks out you should let them know if they do not have
     * enough money to purchase all their items and offer to put items back.
     * 
     * -If the user successfully purchases the items you should remove the
     * amount from their stipend, show them the pictures of what they bought and
     * print out a receipt showing their name, the individual prices of the
     * items and their total.
     */

    public static void main(String[] args) {
    	Cart cart = new Cart();
    	ArrayList<String> cartItems = new ArrayList<String>();
    	ArrayList<Integer> costs = new ArrayList<Integer>();
    	Scanner scan = new Scanner(System.in);
    	String response;
    	int money = new Random().nextInt(25-10) + 10;
    	do {
        	System.out.println("You have $" + money);
    		System.out.println("Add something to your cart: candy: $1, cereal: $5, clothing: $10, toy: $5, type \"check out\" to exit the game, or type \"view cart\".");
    		response = scan.nextLine();
    		if (response.equals("candy")) {
    			Candy candy = new Candy();
    			money -= candy.cost;
    			cartItems.add("Candy");
    			costs.add(candy.cost);
    			cart.add(candy);;
    		} else if (response.equals("cereal")) {
    			Cereal cereal = new Cereal();
    			money -= cereal.cost;
    			cartItems.add("Cereal");
    			costs.add(cereal.cost);
    			cart.add(cereal);
    		} else if (response.equals("clothing")) {
    			Clothing clothing = new Clothing();
    			money -= clothing.cost;
    			cartItems.add("Clothing");
    			costs.add(clothing.cost);
    			cart.add(clothing);
    		} else if (response.equals("toy")) {
    			Toy toy = new Toy();
    			money -= toy.cost;
    			cartItems.add("Toy");
    			costs.add(toy.cost);
    			cart.add(toy);
    		} else if (response.equals("view cart")) {
    			cart.showCart();
    		}
    	} while(!response.equals("check out"));
    	
    	if (money < 0) {
    		System.out.println("You didn't have enough money!");
    		System.exit(0);
    	}
    	String receipt = "Receipt:\n";
    	int total = 0;
    	for (int i = 0; i < cartItems.size(); i++) {
    		receipt += cartItems.get(i) + ": $" + costs.get(i) + "\n";
    		total += costs.get(i);
    	}
    	receipt += "\nTotal: $" + total + "\n"; 
    	System.out.println(receipt);
    	scan.close();
    }

}
