package Spring.Boot;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit // Para iniciar a conexão com o rabbitMQ
@SpringBootApplication
public class DemoBackendApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBackendApiApplication.class, args);
		System.out.println("Rodando API");
	}

}
