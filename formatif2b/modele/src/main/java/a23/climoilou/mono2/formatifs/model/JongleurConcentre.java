package a23.climoilou.mono2.formatifs.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

//@Component
public class JongleurConcentre extends Jongleur implements ArtisteI{
    private ClownPertubateur clownPertubateur;
    //@Autowired
    public void setClownPertubateur(ClownPertubateur clownPertubateur) {
        this.clownPertubateur = clownPertubateur;
    }
    @Override
    public String performe(LocalDateTime time){

        return "Je ne m'occupe pas de " + clownPertubateur.toString() + " et "
        + super.performe(time);
    }

}
