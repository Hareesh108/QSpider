package com.MusicPlayer;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		System.out.println("Hello");
		
		Album album = new Album("AC", "Zyan");
		album.addSong("Trampoline", 3.20);
		album.addSong("Kesariya", 3.5);
		
		System.out.println();

		boolean next = true;

		while (next) {
			System.out.println(" 1. Play a Song\n 2. Add a song \n 3. Reamove a song ");
			Scanner choise = new Scanner(System.in);
			System.out.println("Enter your choise: ");
			
		
			int key = choise.nextInt();
			switch (key) {
			case 1: {
				
				while (next) {
					
					System.out.println(" 1. Song\n 2. song \n 3. song ");
//					for(int i=0;i<album.)
					Scanner song = new Scanner(System.in);
					System.out.println("Enter your choise: ");
					int Number = song.nextInt();
					switch (Number){
					case 1: {
						
						System.out.println("1 Playing");
						break;
					
					}
					case 2:{
						
						break;
					}
					default:
						System.out.println("Enter your choise again: ");
//						int Number = song.nextInt();
						next = false;
					}
				}

			}
			case 2 : {
				System.out.println("Enter a name");
				
				
			}
			default:
				next = false;
			}

		}

	}

}
