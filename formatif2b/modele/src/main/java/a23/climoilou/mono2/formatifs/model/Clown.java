package a23.climoilou.mono2.formatifs.model;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Component
@Profile("amuseur")
@Primary
public class Clown implements ArtisteI {

    public String performe(LocalDateTime Time){
        return "Je fais le clown à " + Time.toString();
    }

    @Override
    public String toString() {
        return "Clown";
    }
}
