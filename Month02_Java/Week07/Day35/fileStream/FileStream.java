package fileStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;//nio : Network Input Output
import java.util.stream.Stream;

public class FileStream {
	public static void main(String[] args) throws IOException{
		//Charset : ���ڼ�(UTF-8, EUC-KR ���)
		//Path path = Paths.get("src/fileStream/FileStream.java");
		Path path = Paths.get("C:/Windows/Temp/input.txt");//��ҹ��� ���� ����
		//uri : ���(UR�� ���ּ�, ���α׷� ��� ��� ��������)
		Stream<String> stream = Files.lines(path);
		//defaultCharset : �⺻���� ���ڼ� (�⺻�� UTF-8�� �������ִ�.)
		stream.forEach(System.out::println);
		stream.close();//file�̶� �ݾ��ش�.
		
		//BufferedReader.lines()�� �̿��ؼ� ���� ��Ʈ������ ���
		File file = path.toFile();
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		Stream<String> s = br.lines();
		s.forEach(System.out::println);
		s.close();
		
	}
}
