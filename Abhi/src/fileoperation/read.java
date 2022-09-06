package fileoperation;

import java.io.File;
import java.util.Scanner;


public class read {

	public static void main(String[] args) {
		try {
            File fileObj = new File("example.txt");

            Scanner myReader = new Scanner(fileObj);

            
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine(); 
                System.out.println(data); 
            }
        } catch (Exception e) {
            System.out.println(e);
	}
	
		

}
}
