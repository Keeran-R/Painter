import java.io.*;

public class FileCompare {

	public static void main(String[] args) throws IOException {
	
		BufferedReader reader1 = new BufferedReader(new FileReader("/Users/Keeran/Desktop/file1.txt"));
		BufferedReader reader2 = new BufferedReader(new FileReader("/Users/Keeran/Desktop/file2.txt"));
		
		boolean Equal = true;
		int line = 1;
		
		String line1 = reader1.readLine();
		String line2 = reader2.readLine();
		
		while (line1 != null || line2 != null) {
			
			if(!line1.contentEquals(line2)) {
				
				Equal = false;
				
				System.out.println("Both files are different. Check Lines " + line);
				
				System.out.println("File1 has " + line1 + " and File2 has " + line2 + " at line " + line);
				
				line1 = reader1.readLine();
				line2 = reader2.readLine();
				line++;
			}
			if (Equal) {
			System.out.println("File1 and File2 are same");
			
			}
			
			reader1.close();
			reader2.close();
			}
			
			
				
		}
		

}
