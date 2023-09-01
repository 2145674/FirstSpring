package a23.climoilou.mono2.formatifs.formatif2b;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Component
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
