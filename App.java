package sio.leo.artizan;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.AnchorPane;
import sio.leo.model.ArticlePosteDAO;
import sio.leo.model.Client;
import sio.leo.model.DAO_Client;
import sio.leo.model.Poste;

/**
 * JavaFX App
 */
public class App extends Application {

    private ObservableList<Client> client = FXCollections.observableArrayList();
    private ObservableList<Poste> tabledata = FXCollections.observableArrayList();
    private Stage primaryStage;

    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage = stage;
        this.primaryStage.setTitle("Client");
        showClient();
//        this.primaryStage.setTitle("Article");
//        showPoste();
    }

    public App() throws SQLException {
        DAO_Client pdao = new DAO_Client();
        ResultSet rs = pdao.getClient();
        while (rs.next()) {
            client.add(new Client(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
        }
//        ArticlePosteDAO apdao = new ArticlePosteDAO();
//        ResultSet rs2 = apdao.getArticle();
//        while (rs2.next()) {
//            tabledata.add(new Poste(rs2.getInt(1), rs2.getString(2), rs2.getInt(3), rs2.getInt(4)));
//        }
    }

    public ObservableList<Client> getPersonData() {
        return client;
    }

    public void showClient() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("client.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            ClientController controller = loader.getController();
            controller.setApp(this);
            Scene scene = new Scene(personOverview);
            primaryStage.setTitle("Client");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ObservableList<Poste> getTabledata() {
        return tabledata;
    }

    public void showPoste() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("ArticlePost.fxml"));
            AnchorPane anchorpane = (AnchorPane) loader.load();
            ArticleController controller = loader.getController();
            controller.setApp(this);
            Scene scene = new Scene(anchorpane);
            primaryStage.setTitle("Article");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        launch();
    }
}
