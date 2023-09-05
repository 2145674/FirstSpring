package a23.climoilou.mono2.formatifs.controller;

import a23.climoilou.mono2.formatifs.model.artistesSupplementaires.Acrobate;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"a23.climoilou.mono2.formatifs.controller", "a23.climoilou.mono2.formatifs.model","a23.climoilou.mono2.formatifs.model.artistesSupplementaires",
								"net.rgielen.fxweaver.spring.boot.autoconfigure"})
public class ApplicationSpring {

	public static void main(String[] args) {

		//SpringApplication.run(ApplicationSpring.class, args);
		Application.launch(ApplicationFX.class);
	}
	@Bean(name = "acrobate")
	Acrobate fabriqueAcrobate(){
		return new Acrobate();
	}

}
