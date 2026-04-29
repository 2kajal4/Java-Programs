package TryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReading {

	public static void main(String[] args) {
		try(BufferedReader bf=new BufferedReader(new FileReader("student1.txt"))){
			
			String line;
			while((line=bf.readLine())!=null) {
				System.out.println(line);
			}
		}catch(Exception e) {
			System.out.println("Error"+e.getMessage());
				
		}
		

	}

}
