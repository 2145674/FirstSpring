package a23.climoilou.mono2.formatifs.model;

import jdk.jfr.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ClownPertubateur extends Clown{
    private  JongleurConcentre jongleurConcentre;
    @Autowired
    public void setJongleurConcentre(@Lazy JongleurConcentre jongleurConcentre) {
        this.jongleurConcentre = jongleurConcentre;
    }

    public String performe(LocalDateTime time){
        return "Je dérange " + jongleurConcentre.toString() +
                " parce que " +  super.performe(time);
    }



}
