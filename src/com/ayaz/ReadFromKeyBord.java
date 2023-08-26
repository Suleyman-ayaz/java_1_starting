package com.ayaz;

import java.util.Scanner;

public class ReadFromKeyBord {

	public void readFromKeybord() {

		System.out.println("test");

		Scanner sc = new Scanner(System.in);

		System.out.print("Please type your name :");
		String ad = sc.next();

		System.out.print("Please type your last name :");
		String soyad = sc.next();

		System.out.print("Ms/Mrs " + ad + " " + soyad + " Welcome");

	}


	


}
