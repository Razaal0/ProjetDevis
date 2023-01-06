/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.leo.artizan;

import java.time.LocalDate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;

/**
 * FXML Controller class
 *
 * @author ghezelani
 */
public class DateController {
    @FXML
    private DatePicker DEV_DATE;
    
    public void getDate(ActionEvent event) {
        
        LocalDate DEV_DATE = DEV_DATEPicker.getValue();
        System.out.println(DEV_DATE.toString());
        
          }    
    }
          
        
//       DatePicker datePicker = new DatePicker();
//       datePicker . setOnAction ( event -> { LocalDate date = datePicker . getValue (); System . out . println ( " Date sélectionnée : " + date ); }); 
  
