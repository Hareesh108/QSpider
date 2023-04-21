package com.filehandling.basic;

import java.io.File;

public class createFileDemo {
	public static void main(String[] args) {
		File file = new File("Hareesh.txt");
		
		try {
			if (file.exists()) {
				System.out.println("File Already Exits");
			}
			else {
				file.createNewFile();
				System.out.println("File has been created");
			}
		} catch (Exception e) {
			System.out.println("File is not created");
			e.printStackTrace();
		}
	}

}
