import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Stub {
	
	
	
	public static void main(String args[]) throws IOException{
		Scanner sc = null;
		int j = 0;
		try {
			 sc = new Scanner(new File("number.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileWriter fiw = new FileWriter("result.txt");
		BufferedWriter bw = new BufferedWriter(fiw);
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		while(j<c.length){
			if(c[j]!=','){
				int a = (int)c[j];
				if(a%2==0)
				{
				bw.write(a);
				bw.newLine();
				}
			}
			j++;
		}
		bw.close();
		fiw.close();
		sc.close();
	}
}
