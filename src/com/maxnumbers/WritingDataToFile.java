package com.maxnumbers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingDataToFile {

	public static void main(String[] args) throws Exception {
		File file=new File("E://abc.txt");
		FileWriter fr=new FileWriter(file, true);
		fr.write("data");
		fr.close();

	}

}
