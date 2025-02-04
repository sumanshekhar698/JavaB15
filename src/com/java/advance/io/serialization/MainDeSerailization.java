package com.java.advance.io.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.java.advance.io.FilePaths;

public class MainDeSerailization {

	public static void main(String[] args) throws IOException {

		File file = new File(FilePaths.NEW_FILE_PATH);

		if (file.exists()) {
			System.out.println("Exits ");

			try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis);) {

				try {
					Student st1 = (Student) ois.readObject();
					System.out.println(st1);
				} catch (ClassNotFoundException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		} else {
			System.out.println("Not Exits ");

		}
	}

}
