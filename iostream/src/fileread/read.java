package fileread;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class read {
	
	public static void main(String[] args) throws IOException {
		File fil = new File("G://mphasis//basith.txt");
		FileInputStream fis = new FileInputStream(fil);
		System.out.println("file is opened");
		int i;
		while((i = fis.read())!=-1)    // when it retrun end of of the it return -1 so we using it.
		{
			System.out.print((char)i);
		}
		
	}

}
