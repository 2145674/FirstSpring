package a23.climoilou.mono2.formatifs.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Component
@Profile("performeur")
public class Jongleur implements ArtisteI{

    public String performe(LocalDateTime time){
        return "Je jongle à " + time.toString();
    }

    @Override
    public String toString() {
        return "Jongleur";
    }
}
