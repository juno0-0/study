package fileEx;

import java.io.File;
import java.net.URI;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class FileEx {
	public static void main(String[] args) throws Exception {
		File dir = new File("C:\\Users\\방준호\\Desktop\\Study\\test\\dir");
		File file1 = new File("C:\\Users\\방준호\\Desktop\\Study\\test\\file1.txt");
		File file2 = new File("C:\\Users\\방준호\\Desktop\\Study\\test\\file2.txt");
		File file3 = new File(new URI("C:\\Users\\방준호\\Desktop\\Study\\test\\file3.txt"));
		
		if(dir.exists()==false) {dir.mkdirs();}
		if(file1.exists()==false) {file1.createNewFile();}
		if(file2.exists()==false) {file1.createNewFile();}
		if(file3.exists()==false) {file1.createNewFile();}
		
		File temp = new File("c:/temp");
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd a HH:mm:ss");
		File[] contents = temp.listFiles();
		for(File file : contents) {
			System.out.println(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.print("\t <DIR> \t\t\t"+file.getName());
			}else {
				System.out.println("\t\t\t"+file.length()+"\t"+file.getName());
			}
			System.out.println();
		}
	}
}
