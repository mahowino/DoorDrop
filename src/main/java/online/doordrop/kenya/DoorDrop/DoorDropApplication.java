package online.doordrop.kenya.DoorDrop;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
public class DoorDropApplication {

	public static void main(String[] args)throws IOException {

		//initializes firebase
		InputStream serviceAccount = DoorDropApplication.class.getClassLoader().getResourceAsStream("ServiceAccountKey.json");
		FirebaseOptions options = new FirebaseOptions.Builder()
				.setCredentials(GoogleCredentials.fromStream(serviceAccount))
				.build();
		FirebaseApp.initializeApp(options);

		SpringApplication.run(DoorDropApplication.class, args);
	}

}
