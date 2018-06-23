package javaFX_GPR2015.controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javaFX_GPR2015.model.Traffic;
import javaFX_GPR2015.repositoryMySQL.RepositoryMySQL;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.cell.PropertyValueFactory;


public class TrafficController {
    private RepositoryMySQL repositoryMySQL = new RepositoryMySQL();

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
    private TableView<Traffic> tableMainGPR2015;

    @FXML
    private TableColumn<Traffic, String> colGPR2015SegmentName;

    @FXML
    private TableColumn<Traffic, Double> colGPR2015Length;

    @FXML
    private TableColumn<Traffic, Integer> colGPR2015Cars;

    @FXML
    private TableColumn<Traffic, Integer> colGPR2015Buses;

    @FXML
    private TableColumn<Traffic, Integer> colGPR2015DeliveryTrucks;

    @FXML
    private TableColumn<Traffic, Integer> colGPR2015TrucksNoTrailers;

    @FXML
    private TableColumn<Traffic, Integer> colGPR2015TrucksWithTrailers;

    @FXML
    private TableColumn<Traffic, Integer> colGPR2015Tractors;

    @FXML
    private TableColumn<Traffic, Integer> colGPR2015Motrobikes;

    @FXML
    private TableColumn<Traffic, Integer> colGPR2015Sum;

    @FXML
    void initialize() {
        populaTetableMainGPR2015();

    }

    private void populaTetableMainGPR2015() {
        ObservableList<Traffic> trafficMainView;
        Connection con = repositoryMySQL.getCon();
        List<Traffic> trafficList = new ArrayList<>();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select segmentName, segmentLength, carsTraffic, busesTraffic, deliveryTrucksTraffic, trucksNoTrailersTraffic, trucksWithTrailersTraffic, tractorsTraffic, motorbikesTraffic, (carsTraffic + busesTraffic + deliveryTrucksTraffic + trucksNoTrailersTraffic + trucksWithTrailersTraffic + tractorsTraffic + motorbikesTraffic) as sumTraffic from segmenttraffic;");
            while (rs.next()){
                Traffic traffic = new Traffic();
                String segmentName = rs.getString("segmentName");
                Double length = rs.getDouble("segmentLength");
                int cars = rs.getInt("carsTraffic");
                int buses = rs.getInt("busesTraffic");
                int deliveryTrucks = rs.getInt("deliveryTrucksTraffic");
                int trucksNoTrailers = rs.getInt("trucksNoTrailersTraffic");
                int trucksWithTrailers = rs.getInt("trucksWithTrailersTraffic");
                int tractors = rs.getInt("motorbikesTraffic");
                int motorbikes = rs.getInt("tractorsTraffic");
                int sum = rs.getInt("sumTraffic");
                traffic.setSegmentName(segmentName);
                traffic.setSegmentLength(length);
                traffic.setCarsTraffic(cars);
                traffic.setBusesTraffic(buses);
                traffic.setDeliveryTrucksTraffic(deliveryTrucks);
                traffic.setTrucksNoTrailersTraffic(trucksNoTrailers);
                traffic.setTrucksWithTrailersTraffic(trucksWithTrailers);
                traffic.setTractorsTraffic(tractors);
                traffic.setMotorbikesTraffic(motorbikes);
                traffic.setSumTraffic(sum);
                trafficList.add(traffic);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        tableMainGPR2015.getItems().clear();
        trafficMainView= FXCollections.observableArrayList(trafficList);
        colGPR2015SegmentName.setCellValueFactory(new PropertyValueFactory<Traffic, String>("segmentName"));
        colGPR2015Length.setCellValueFactory(new PropertyValueFactory<Traffic, Double>("segmentLength"));
        colGPR2015Cars.setCellValueFactory(new PropertyValueFactory<Traffic, Integer>("carsTraffic"));
        colGPR2015Buses.setCellValueFactory(new PropertyValueFactory<Traffic, Integer>("busesTraffic"));
        colGPR2015DeliveryTrucks.setCellValueFactory(new PropertyValueFactory<Traffic, Integer>("deliveryTrucksTraffic"));
        colGPR2015TrucksNoTrailers.setCellValueFactory(new PropertyValueFactory<Traffic, Integer>("trucksNoTrailersTraffic"));
        colGPR2015TrucksWithTrailers.setCellValueFactory(new PropertyValueFactory<Traffic, Integer>("trucksWithTrailersTraffic"));
        colGPR2015Tractors.setCellValueFactory(new PropertyValueFactory<Traffic, Integer>("tractorsTraffic"));
        colGPR2015Motrobikes.setCellValueFactory(new PropertyValueFactory<Traffic, Integer>("motorbikesTraffic"));
        colGPR2015Sum.setCellValueFactory(new PropertyValueFactory<Traffic, Integer>("sumTraffic"));
        tableMainGPR2015.getItems().addAll(trafficMainView);
    }
}
