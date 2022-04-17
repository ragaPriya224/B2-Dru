package demo.rbi.start.initialDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DruBatch2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DruBatch2Application.class, args);

		Home h = context.getBean(Home.class);
		//	Home h = new Home(); //not recommended
		h.connect();
//		Home h2 = context.getBean(Home.class);
//		//	Home h = new Home(); //not recommended
//		h2.connect();
//		Home h3 = context.getBean(Home.class);
//		//	Home h = new Home(); //not recommended
//		h3.connect();
	}

}
