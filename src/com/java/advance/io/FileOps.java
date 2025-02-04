package com.java.advance.io;

import java.io.File;
import java.io.IOException;

public class FileOps {

	public static void main(String[] args) {


		File file = new File(FilePaths.NEW_FILE_PATH);
		
		if(file.exists()) {
			System.out.println("Exits ");
			System.out.println("File ? "+file.isFile());
			System.out.println("Folder ? "+file.isDirectory());
			
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.canExecute());
			file.delete();

		}else {
			System.out.println("Not Exits ");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
