/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sio.leo.applidevis.util;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dateUtil {
    private static final String DATE_PATTERN="yyyyMMdd";
    private static final DateTimeFormatter LOCALDATE_FORMATER = DateTimeFormatter.ofPattern(DATE_PATTERN);
    
    public static String dateToString(Date ladate) {
        if (ladate == null){return null;}
        DateFormat dateFormat = new SimpleDateFormat(DATE_PATTERN);
        String dateToStr = dateFormat.format(ladate);
        return dateToStr;
    }
    
    public static String localDateToString(LocalDate ladate) {
        if (ladate == null){return null;}
        return LOCALDATE_FORMATER.format(ladate);
    }
    
    public static LocalDate stringToLocalDate(String dateString) {
        if (dateString == null){return null;}
        return LOCALDATE_FORMATER.parse(dateString, LocalDate::from);
    }
    
    public static Date stringToDate(String dateString){
        if(dateString != null) {
            DateFormat dateFormat = new SimpleDateFormat(DATE_PATTERN);
            try {
                return dateFormat.parse(dateString);
            } catch (ParseException ex) {
                Logger.getLogger(dateUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       return null; 
    }
//    public static Date stringToDate(String dateString) {
//        try {
//            if(dateString == null) {return null;}
//            DateFormat dateFormat = new SimpleDateFormat(DATE_PATTERN);
//            return dateFormat.parse(dateString);
//        }
//        catch(ParseException ex){
//            Logger.getLogger(DateUtil.class.getName()).log(Level.SEVERE,null, ex);
//        }
//        return null;
//    }
}