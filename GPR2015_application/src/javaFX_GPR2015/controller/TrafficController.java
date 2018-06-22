package javaFX_GPR2015.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class TrafficController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuBar menuMain;

    @FXML
    private Menu menuMainFile;

    @FXML
    private MenuItem menuMainFileClose;

    @FXML
    private Menu menuMainEdit;

    @FXML
    private MenuItem menuMainEditViewSettings;

    @FXML
    private Menu menuMainHelp;

    @FXML
    private MenuItem menuMainHelpInfo;

    @FXML
    private CheckBox checkBoxNational;

    @FXML
    private CheckBox checkBoxVoivodeship;

    @FXML
    private TextField textFieldRoadNumber;

    @FXML
    private TextField textFieldRoadName;

    @FXML
    private ComboBox<?> comboBoxListOfSegmentsFromDB;

    @FXML
    private Button buttonEraseOneSegment;

    @FXML
    private Button buttonEraseAllSegments;

    @FXML
    private Button buttonForcest;

    @FXML
    private TableView<?> tableMainGPR2015;

    @FXML
    private TableColumn<?, ?> colGPR2015SegmentName;

    @FXML
    private TableColumn<?, ?> colGPR2015Length;

    @FXML
    private TableColumn<?, ?> colGPR2015Cars;

    @FXML
    private TableColumn<?, ?> colGPR2015Buses;

    @FXML
    private TableColumn<?, ?> colGPR2015DeliveryTrucks;

    @FXML
    private TableColumn<?, ?> colGPR2015TrucksNoTrailers;

    @FXML
    private TableColumn<?, ?> colGPR2015TrucksWithTrailers;

    @FXML
    private TableColumn<?, ?> colGPR2015Tractors;

    @FXML
    private TableColumn<?, ?> colGPR2015Motrobikes;

    @FXML
    private TableColumn<?, ?> colGPR2015Sum;

    @FXML
    void initialize() {
        assert menuMain != null : "fx:id=\"menuMain\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert menuMainFile != null : "fx:id=\"menuMainFile\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert menuMainFileClose != null : "fx:id=\"menuMainFileClose\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert menuMainEdit != null : "fx:id=\"menuMainEdit\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert menuMainEditViewSettings != null : "fx:id=\"menuMainEditViewSettings\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert menuMainHelp != null : "fx:id=\"menuMainHelp\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert menuMainHelpInfo != null : "fx:id=\"menuMainHelpInfo\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert checkBoxNational != null : "fx:id=\"checkBoxNational\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert checkBoxVoivodeship != null : "fx:id=\"checkBoxVoivodeship\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert textFieldRoadNumber != null : "fx:id=\"textFieldRoadNumber\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert textFieldRoadName != null : "fx:id=\"textFieldRoadName\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert comboBoxListOfSegmentsFromDB != null : "fx:id=\"comboBoxListOfSegmentsFromDB\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert buttonEraseOneSegment != null : "fx:id=\"buttonEraseOneSegment\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert buttonEraseAllSegments != null : "fx:id=\"buttonEraseAllSegments\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert buttonForcest != null : "fx:id=\"buttonForcest\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert tableMainGPR2015 != null : "fx:id=\"tableMainGPR2015\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert colGPR2015SegmentName != null : "fx:id=\"colGPR2015SegmentName\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert colGPR2015Length != null : "fx:id=\"colGPR2015Length\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert colGPR2015Cars != null : "fx:id=\"colGPR2015Cars\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert colGPR2015Buses != null : "fx:id=\"colGPR2015Buses\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert colGPR2015DeliveryTrucks != null : "fx:id=\"colGPR2015DeliveryTrucks\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert colGPR2015TrucksNoTrailers != null : "fx:id=\"colGPR2015TrucksNoTrailers\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert colGPR2015TrucksWithTrailers != null : "fx:id=\"colGPR2015TrucksWithTrailers\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert colGPR2015Tractors != null : "fx:id=\"colGPR2015Tractors\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert colGPR2015Motrobikes != null : "fx:id=\"colGPR2015Motrobikes\" was not injected: check your FXML file 'mainStage.fxml'.";
        assert colGPR2015Sum != null : "fx:id=\"colGPR2015Sum\" was not injected: check your FXML file 'mainStage.fxml'.";

    }
}
