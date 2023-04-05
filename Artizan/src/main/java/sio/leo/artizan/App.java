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
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
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
    private DAO_Client pdao = new DAO_Client();
    private ArticlePosteDAO apdao = new ArticlePosteDAO();

    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage = stage;
        showAccueil();
    }

    public App() {
    }

    public ObservableList<Client> getPersonData() {
        return client;
    }

    public void showClient() throws SQLException {
        try {
            ResultSet rs = pdao.getClient();
            while (rs.next()) {
                client.add(new Client(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
            }
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
 public void showAccueil()throws IOException {
    FXMLLoader loader = new FXMLLoader();
        loader.setLocation(App.class.getResource("Accueil.fxml"));
        SplitPane split = (SplitPane) loader.load();
        AccueilController controller = loader.getController();
        controller.setApp(this);
        Scene scene = new Scene(split);
        primaryStage.setTitle("Accueil");
        primaryStage.setScene(scene);
        primaryStage.show();
 }
    public ObservableList<Poste> getTabledata() {
        return tabledata;
    }

    public void showPoste() throws SQLException, IOException {
        try {
            ResultSet rs2 = apdao.getArticle();
            while (rs2.next()) {
                tabledata.add(new Poste(rs2.getInt(1), rs2.getString(2), rs2.getInt(3), rs2.getInt(4)));
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(App.class.getResource("ArticlePost.fxml"));
                AnchorPane anchorpane = (AnchorPane) loader.load();
                ArticleController controller = loader.getController();
                controller.setApp(this);
                Scene scene = new Scene(anchorpane);
                primaryStage.setTitle("Article");
                primaryStage.setScene(scene);
                primaryStage.show();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showChantier() throws SQLException, IOException {
        try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(App.class.getResource("Chantier.fxml"));
                AnchorPane anchorpane = (AnchorPane) loader.load();
                ChantierController controller = loader.getController();
                controller.setApp(this);
                Scene scene = new Scene(anchorpane);
                primaryStage.setTitle("Chantier");
                primaryStage.setScene(scene);
                primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public boolean showPersonEditDialog(Client client) {
        try {
            // Charge le fichier fxml et crée un nouveau stage pour la boîte de dialogue*
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("newclient.fxml"));
            AnchorPane rootEditDialog = (AnchorPane) loader.load();

            // Crée le Stage.
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Ajout du contact");
            //MODAL --> fenêtre indépendante
            dialogStage.initModality(Modality.WINDOW_MODAL);

            Scene scene = new Scene(rootEditDialog);
            //initOwner() installe (set the owner), le propriétaire de l'application
            dialogStage.initOwner(primaryStage);
            dialogStage.setScene(scene);

//            // Passe la personne sélectionnée dans l'ObservableList au controller d'édition.
            NewclientController controller = loader.getController();
//            controller.setDialogStage(dialogStage);
//            controller.setPerson(person);

            // Affiche personEditDialog jusqu'à ce que l'utilisateur la ferme
            dialogStage.showAndWait();

            return true;
        } catch (IOException e) {
            e.getMessage();
            return false;
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
