package a23.climoilou.mono2.formatifs.controller.controleurFX;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
@FxmlView("springfx.fxml")
public class SpringFXController {


    private  SpringFXController2 springFXController2;

    @Autowired
    public SpringFXController (SpringFXController2 springFXController2){
        this.springFXController2 = springFXController2;
    }
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @FXML
    private TextField messageTextField;

    @FXML
    void afficheMessage(ActionEvent event) {

        messageTextField.setText("allo spring FX !");
        springFXController2.setReponse("Unanime");
    }

    @FXML
    public void initialize() {
        System.out.println("fxml primary initialize");
    }
}
