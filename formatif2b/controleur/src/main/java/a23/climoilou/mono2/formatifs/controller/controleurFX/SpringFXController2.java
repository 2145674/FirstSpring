package a23.climoilou.mono2.formatifs.controller.controleurFX;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@FxmlView("springfx2.fxml")
public class SpringFXController2 {



    @FXML
    private TextField reponseTextField;

    public void setReponse(String reponse) {
        reponseTextField.setText(reponse);
    }

}
