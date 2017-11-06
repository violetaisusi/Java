package Introduction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 FileInputStream in = null;
	      FileOutputStream out = null;

	      try {
	         in = new FileInputStream("./files/input.txt");
	         out = new FileOutputStream("./files/output.txt");
	         
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	      } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }

	}

}
