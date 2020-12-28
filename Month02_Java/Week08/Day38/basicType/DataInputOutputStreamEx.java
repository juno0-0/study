package basicType;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamEx {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\text2.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("ȫ�浿");
		dos.writeDouble(3.14);
		dos.writeInt(7);
		dos.writeBoolean(true);
		dos.writeChar('a');
		
		dos.writeUTF("ȫ�浿");
		dos.writeDouble(3.14);
		dos.writeInt(7);
		dos.writeBoolean(true);
		dos.writeChar('a');
		
		dos.flush();
		dos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("D:\\Temp\\text2.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i=0;i<2;i++) {
			String name = dis.readUTF();
			double d = dis.readDouble();
			int value = dis.readInt();
			boolean check = dis.readBoolean();
			char c = dis.readChar();
			System.out.println(name+" "+d+" "+value+" "+check+" "+c);
		}
		
		dis.close();
		fis.close();
		
		
		
		
	}
}
