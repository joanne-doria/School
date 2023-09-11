package cs157a;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class SelectOrder {
	public static void main(String[] args) throws IOException {
		System.out.println(args[0]);
		Path path = Paths.get(args[0]);
		File file = new File("" + path);
		String line;
		ArrayList<String> table = new ArrayList<String>();
		
		ArrayList<String> select = new ArrayList<String>();
		for (int i = 2; i < args.length; i++) {
			if (args[i].equals("ORDER_BY")) break;
			select.add(args[i]);
		}
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader bf = new BufferedReader(fr);
			
			while ((line = bf.readLine()) != null) {
				table.add(line);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error!");
		}
		
		
		
		
		
		for(String s : select) {
			System.out.println(s);
		}
	}
}
