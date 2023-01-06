package sio.leo.Artizan;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import sio.leo.Artizan.Controller.ArticleController;
import sio.leo.Artizan.Modele.ArticlePosteDAO;
import sio.leo.Artizan.Modele.DAO;
import sio.leo.Artizan.Modele.Poste;

/**
 * JavaFX App
 */
public class App extends Application {

    private Stage primaryStage;
    private AnchorPane anchorpane;
    private ObservableList<Poste> tabledata = FXCollections.observableArrayList();

    private static Scene scene;
    
    public App()throws SQLException{
        ArticlePosteDAO apdao = new ArticlePosteDAO();
        ResultSet rs = apdao.getArticle();
        while (rs.next()){
            tabledata.add(new Poste(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4)));
        }
    }
        public ObservableList<Poste> getTabledata(){
        return tabledata;
    }
    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Application ");
        Scene scene = new Scene(loadFXML("ArticlePost"), 640, 480);
        primaryStage.setScene(scene);
//        showPersonOverview();
        primaryStage.show();
    }
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

//    public void showPersonOverview() {
//        try {
//            FXMLLoader loader = new FXMLLoader();
//            loader.setLocation(App.class.getResource("ArticlePost.fxml"));
//            AnchorPane anchorpane = (AnchorPane) loader.load();
//            ArticleController controller = loader.getController();
//            controller.setApp(this);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        launch();
    }

}
