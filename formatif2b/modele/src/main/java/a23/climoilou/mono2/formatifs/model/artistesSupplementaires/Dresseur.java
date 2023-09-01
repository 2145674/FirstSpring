package a23.climoilou.mono2.formatifs.model.artistesSupplementaires;

import a23.climoilou.mono2.formatifs.model.ArtisteI;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Dresseur implements ArtisteI {
    @Override
    public String performe(LocalDateTime time) {
        return " Je dresse le gros lion à " + time.toString();
    }
}
