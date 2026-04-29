package TryWithResources;

import java.io.FileReader;

public class FileOpenEx {

	public static void main(String[] args) {
		try(FileReader fr=new FileReader("student.txt")) {
			System.out.println("file opened successfully");
		}catch(Exception e) {
			System.out.println("Error!");
		}

	}

}
