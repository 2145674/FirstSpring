package a23.climoilou.mono2.formatifs.controller;

import a23.climoilou.mono2.formatifs.model.Cirque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Component //indique que c'est un bean et donc qu'on peut lui mettre des annotations de Bean
public class Bootstrap implements CommandLineRunner {
    private ApplicationContext context;

    @Autowired  //Annotation de Bean
    public void setContext(ApplicationContext context) {  //L'injection se fait par un setter
        this.context = context;
    }

    @Override
    public void run(String... args) throws Exception {
//        Clown clown = (Clown) context.getBean("clown");
//        System.out.println(clown.performe(LocalDateTime.now()));
//
//        Jongleur jongleur = (Jongleur) context.getBean(Jongleur.class);
//        System.out.println(jongleur.performe(LocalDateTime.now()));
//
//        ArtisteI artisteI = context.getBean(ArtisteI.class);
//        System.out.println(artisteI.performe(LocalDateTime.now()));

        Cirque cirque= context.getBean(Cirque.class);
        System.out.println(cirque.performeAll());
    }
}
