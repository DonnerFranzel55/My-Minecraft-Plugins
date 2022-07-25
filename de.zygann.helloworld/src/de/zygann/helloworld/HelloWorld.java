package de.zygann.helloworld;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		String s = "";
		
		System.out.println("Devin ist der beste coder der Welt.");
		System.out.println("Devin ist der beste Minecrafter der Welt.");
		System.out.println("Devin ist der beste ___________ der Welt.");
		
		Scanner in = new Scanner(System.in);
		s = in.nextLine();
		
		System.out.println("Eingabe: " + s);
		System.out.println("Devin ist der beste " + s + " der Welt.");
	}

}
