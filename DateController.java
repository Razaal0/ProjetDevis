/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sio.leo.applidevi;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateController {
    @FXML
    private Label DateDevis;

    public void initialize() {
        //Obtenir la date actuelle
        LocalDate date = LocalDate.now();

        //Formater la date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = date.format(formatter);

        //Afficher la date dans l'étiquette
        DateDevis.setText("Date: " + formattedDate);
    }
}
