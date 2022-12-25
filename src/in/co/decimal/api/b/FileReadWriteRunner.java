package in.co.decimal.api.b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteRunner {

	public static void main(String[] args) throws IOException {

		/**
		 * For reading the file and modification into the file:
		 */

		// First we need to set the path of the file:
		Path path = Paths.get("./resources/sample.txt");

		// For reading the file:
		String readFileContent = Files.readString(path);
		System.out.println(readFileContent);

		// For modification into files:
		String newFileContent = readFileContent.replace("line", "NowthisLine");
		System.out.println(newFileContent);

		/**
		 * For writing into the new file:
		 **/

		// Path of the file where written content must be save:
		Path pathForWriting = Paths.get("./resources/write.txt");
		// After run this program then go to resources folder then refresh the folder:
		Files.writeString(pathForWriting, newFileContent);

	}
}
