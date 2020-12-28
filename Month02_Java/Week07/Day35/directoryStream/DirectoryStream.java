package directoryStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DirectoryStream {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("D:\\java install\\eclipse-jee-2020-06-R-win32-x86_64\\eclipse\\Java\\jdk-14.0.2");
		Stream<Path> stream;
		
		stream = Files.list(path);
		stream.forEach(p->System.out.println(p.getParent()));
	}
}
