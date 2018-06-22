package javaFX_GPR2015;

import javaFX_GPR2015.repositoryMySQL.RepositoryMySQL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/mainStage.fxml"));
        primaryStage.setTitle("GPR2015");
        primaryStage.setScene(new Scene(root));
        primaryStage.setMaximized(true);
        primaryStage.show();
    }


    public static void main(String[] args) {
        RepositoryMySQL repositoryMySQL = new RepositoryMySQL();
        repositoryMySQL.getCon();
        launch(args);
    }
}
