package fileoperation;

import java.io.File;

public class create {

	public static void main(String[] args)
	{
        File fileObj = new File("example.txt");

        try {
            
            boolean success = fileObj.createNewFile();
            if (success) {
                System.out.println("File got created");
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
	}
}