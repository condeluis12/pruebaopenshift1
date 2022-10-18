package mx.gob.imss.fepac.autorizacion;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutorizacionApplication {

	public static void main(String[] args) {
		 System.out.println("Working Directory = " + System.getProperty("user.dir"));
		SpringApplication.run(AutorizacionApplication.class, args);
		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();
		System.out.println("Current absolute path is: " + s);
		
	}

}
