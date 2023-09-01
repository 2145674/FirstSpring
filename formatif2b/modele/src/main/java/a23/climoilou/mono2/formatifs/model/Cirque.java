package a23.climoilou.mono2.formatifs.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class Cirque {

    private ArtisteI artiste;
    private List<ArtisteI> artisteIList;

    @Autowired
    public Cirque(ArtisteI artiste, List<ArtisteI> artisteIList) {
        this.artiste = artiste;
        this.artisteIList = artisteIList;
    }

    public void performe(){
        System.out.println("Le cirque est en ville");
        System.out.println(artiste.performe(LocalDateTime.now()));;
    }

    public String performeAll(){
        String retString = "Le cirque est en ville\n";
        retString += "Les artistes performent: \n";
        for (ArtisteI artiste: artisteIList) {
            retString += artiste.performe(LocalDateTime.now()) + "\n";
        }
        return retString;
    }
}
