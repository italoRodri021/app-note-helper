/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Config {

    // -> Config de data e hora atual
    public static String getDateHour() {

        Date date = new Date();
        SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return SDF.format(date);
    }
    
    // -> Config data e hora atual para o nome do arquivo
    public static String getDateHourName(){
        
        Date date = new Date();
        SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yy HH-mm-ss");
        return SDF.format(date);
    }

    // -> Abrir links
    public static void initBrowserLink(String url) {

        if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desk = java.awt.Desktop.getDesktop();

            if (desk.isSupported(Desktop.Action.BROWSE)) {
                try {

                    java.net.URI minhaUrl = new java.net.URI(url);
                    desk.browse(minhaUrl);

                } catch (URISyntaxException | IOException e) {
                }

            }

        }

    }

}
