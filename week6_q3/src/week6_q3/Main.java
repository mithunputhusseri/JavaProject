package week6_q3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Files.list(Paths.get(".")).forEach(System.out::println);
	}

}
