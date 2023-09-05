package a23.climoilou.mono2.formatifs.controller;

import a23.climoilou.mono2.formatifs.controller.controleurFX.SpringFXController;
import a23.climoilou.mono2.formatifs.controller.controleurFX.SpringFXController2;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import net.rgielen.fxweaver.core.FxControllerAndView;
import net.rgielen.fxweaver.core.FxWeaver;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;


public class ApplicationFX extends Application {

    private ConfigurableApplicationContext context;
    @Override
    public void init(){
        String[] args = getParameters().getRaw().toArray(new String[0]);  //Les paramètres reçus dans le main
        //Création du contexte explicite de l'application
        this.context = new SpringApplicationBuilder().sources(ApplicationSpring.class).run(args);
    }

    @Override
    public void stop(){
        //Destruction explicite du contexte
        this.context.close();

        //Fermeture javaFX
        Platform.exit();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("JavaFX initialisé");

        FxWeaver fxWeaver = context.getBean(FxWeaver.class);

        //Première fenetre
        FxControllerAndView<SpringFXController, AnchorPane> controllerAndView = fxWeaver.load(SpringFXController.class);
        Parent root = controllerAndView.getView().get();

        SpringFXController springFXController = controllerAndView.getController();
        springFXController.setMessage("PrimarySatge");

        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        //seconde fenetre
        FxControllerAndView<SpringFXController2, AnchorPane> controllerAndView2 = fxWeaver.load(SpringFXController2.class);
        Parent root2 = controllerAndView2.getView().get();

        Stage secondSatge = new Stage();
        secondSatge.setScene(new Scene(root2));
        secondSatge.show();

        //troisieme fenetre
//        FxControllerAndView<SpringFXController2, AnchorPane> controllerAndView2 = fxWeaver.load(SpringFXController2.class);
//        Parent root2 = controllerAndView2.getView().get();
//
//        Stage secondSatge = new Stage();
//        secondSatge.setScene(new Scene(root2));
//        secondSatge.show();
    }
}
