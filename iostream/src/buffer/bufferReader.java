package buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bufferReader {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("G://mphasis//basith.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		int count = 0;
		while((s=br.readLine())!=null)
		{
			StringTokenizer st = new StringTokenizer(s);
			while(st.hasMoreTokens())
			{
				st.nextToken();
				count++;
			}
		}
		System.out.println("count of word in the file = " + count);
	}
}
