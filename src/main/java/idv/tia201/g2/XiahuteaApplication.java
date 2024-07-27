package idv.tia201.g2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
	public class XiahuteaApplication {


	public static void main(String[] args) {
		SpringApplication.run(XiahuteaApplication.class, args);
	}

}
