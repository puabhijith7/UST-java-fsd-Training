package fileoperation;

import java.io.File;

public class delete {
	public static void main(String[] args) {
		File fp=new File("example.txt");
		fp.delete();
	}
}
