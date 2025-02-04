package com.java.advance.io;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {


		File file = new File(FilePaths.SAMPLE_FILE_PATH);
		
		if(file.exists()) {
			System.out.println("Exits ");
			System.out.println("File ? "+file.isFile());
			System.out.println("Folder ? "+file.isDirectory());
			
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.canExecute());

		}else {
			System.out.println("Not Exits ");

		}

	}

}
