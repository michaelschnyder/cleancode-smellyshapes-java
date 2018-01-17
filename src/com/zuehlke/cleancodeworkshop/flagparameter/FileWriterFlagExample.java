package com.zuehlke.cleancodeworkshop.flagparameter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterFlagExample {

	public static void main(String[] args) throws IOException {

		final File file = new File("C:\\temp\\example.txt");
		
		// hard to understand ???
		final FileWriter fileWriter = new FileWriter(file, true);
		final FileWriter fileWriter2 = new FileWriter(file, false);
		
		// define readable constants
		final boolean APPEND_MODE = true;
		final boolean OVERWRITE_MODE = false;
		final FileWriter appendingfileWriter = new FileWriter(file, APPEND_MODE);
		final FileWriter overwritingfileWriter = new FileWriter(file, OVERWRITE_MODE);
	}
}
