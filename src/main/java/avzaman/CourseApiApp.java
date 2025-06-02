package avzaman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {
    public static void main(String[] args) {
        // sets default config, starts spring app context, class path scan, starts Tomcat server
        SpringApplication.run(CourseApiApp.class, args);

    }
}
