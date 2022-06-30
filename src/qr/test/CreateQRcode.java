package qr.test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class CreateQRcode {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\CENTROXY\\Desktop\\java_qrcode.jpg");
			String content = "Hello World";
			ByteArrayOutputStream out = QRCode.from(content).to(ImageType.JPG).stream();
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(out.toByteArray());
			fos.close();
			System.out.println("Success");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
