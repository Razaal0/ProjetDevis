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
import javafx.stage.Modality;
import sio.leo.Artizan.Modele.ArticlePosteDAO;
import sio.leo.Artizan.Modele.DAO;
import sio.leo.Artizan.Modele.Poste;

/**
 * JavaFX App
 */
public class App extends Application {

    private Stage primaryStage;
    private ObservableList<Poste> tabledata = FXCollections.observableArrayList();
    
    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage = stage;
        this.primaryStage.setTitle("Article/Poste");
        showPersonOverview();
    }
    
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

    public void showPersonOverview() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("ArticlePost.fxml"));
            AnchorPane anchorpane = (AnchorPane) loader.load();
            ArticleController controller = loader.getController();
            controller.setApp(this);
            Scene scene = new Scene(anchorpane);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public boolean showPersonEditDialog(Poste laposte) {
        try {
            // Charge le fichier fxml et crée un nouveau stage pour la boîte de dialogue*
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("personEditDialog.fxml"));
            AnchorPane rootEditDialog = (AnchorPane) loader.load();

            // Crée le Stage.
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Modification du contact");
            //MODAL --> fenêtre indépendante
            dialogStage.initModality(Modality.WINDOW_MODAL);

            Scene scene = new Scene(rootEditDialog);
            //initOwner() installe (set the owner), le propriétaire de l'application
            dialogStage.initOwner(primaryStage);
            dialogStage.setScene(scene);

            // Passe la personne sélectionnée dans l'ObservableList au controller d'édition.
            PersonEditDialogController controller = loader.getController();
            controller.setDialogStage(dialogStage);
            controller.setPerson(laposte);

            // Affiche personEditDialog jusqu'à ce que l'utilisateur la ferme
            dialogStage.showAndWait();

            return controller.isOkClicked();
        } catch (IOException e) {
            e.getMessage();
            return false;
        }
    }
    public static void main(String[] args) {
        launch();
    }

}
