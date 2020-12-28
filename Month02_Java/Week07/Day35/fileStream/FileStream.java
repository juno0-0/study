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
		//Charset : 문자셋(UTF-8, EUC-KR 등등)
		//Path path = Paths.get("src/fileStream/FileStream.java");
		Path path = Paths.get("C:/Windows/Temp/input.txt");//대소문자 구분 안함
		//uri : 경로(UR의 웹주소, 프로그램 경로 등등 포괄적임)
		Stream<String> stream = Files.lines(path);
		//defaultCharset : 기본적인 문자셋 (기본은 UTF-8로 맞춰져있다.)
		stream.forEach(System.out::println);
		stream.close();//file이라서 닫아준다.
		
		//BufferedReader.lines()을 이용해서 파일 스트림으로 얻기
		File file = path.toFile();
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		Stream<String> s = br.lines();
		s.forEach(System.out::println);
		s.close();
		
	}
}
