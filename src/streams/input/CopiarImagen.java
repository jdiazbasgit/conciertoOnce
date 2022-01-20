package streams.input;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopiarImagen {

	public static void main(String[] args) {
		try(
				FileInputStream fileInputStream= new FileInputStream("descarga.jpg");
				FileOutputStream fileOutputStream= new FileOutputStream("camion.jpg");
				){
			
			byte[] b= new byte[fileInputStream.available()];
			fileInputStream.read(b);
			for(int i=0;i<b.length;i++) {
				System.out.println(b[i]);
				fileOutputStream.write(b[i]);
			}
			//fileOutputStream.write(b);
			fileOutputStream.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
