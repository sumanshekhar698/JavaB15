package com.java.advance.io.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.java.advance.io.FilePaths;

public class MainSerailization {

	public static void main(String[] args) throws IOException {
		Student st1 = new Student("John", 30);
		System.out.println(st1);

		File file = new File(FilePaths.NEW_FILE_PATH);

		if (file.exists()) {
			System.out.println("Exits ");

			try (FileOutputStream fos = new FileOutputStream(file);
					ObjectOutputStream oos = new ObjectOutputStream(fos);) {
				
				oos.writeObject(st1);

			}

		} else {
			System.out.println("Not Exits ");

		}
	}

}
