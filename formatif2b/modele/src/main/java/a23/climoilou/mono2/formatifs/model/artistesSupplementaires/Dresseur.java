package a23.climoilou.mono2.formatifs.model.artistesSupplementaires;

import a23.climoilou.mono2.formatifs.model.ArtisteI;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Dresseur implements ArtisteI {

    private ApplicationEventPublisher publisher;  //pour recevoir unnevent

    public void setPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String performe(LocalDateTime time) {
        return " Je dresse le gros lion à " + time.toString();
    }

    @EventListener
    public void receiveStringEvent(String event){
        System.out.println("J'ai reçu l'évènement " + event);
    }

    @EventListener
    public void receiveStringEvent(Integer event){
        System.out.println("J'ai reçu l'évènement " + event);
    }
}
