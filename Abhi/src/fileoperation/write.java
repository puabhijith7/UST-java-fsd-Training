package fileoperation;

import java.io.FileWriter;

public class write {

	public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("example.txt");
            myWriter.write("Hello!!!!");
            myWriter.close();
        } catch (Exception e) {
            System.out.println(e);
        }

	}

}
