/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import ru.itmo.generated.Loyalty;
import ru.itmo.generated.LoyaltyService;

/**
 *
 * @author rozov
 */
public class Client {
     public static void main(String[] args) throws MalformedURLException {
        //URL url = new URL("http://localhost:8080/LoyaltyService?wsdl"); //standalone
        URL url = new URL("http://localhost:8080/TWS/LoyaltyService?wsdl"); //j2ee
        LoyaltyService loyaltyService = new LoyaltyService(url);
        List<Loyalty> loyalties =
                loyaltyService.getLoyaltyServicePort().getAll();
        for (Loyalty loyalty : loyalties) {
            System.out.println("Loyalty {" + "spbsoId=" + loyalty.getSpbso() +
                ", fullName=" + loyalty.getName() +
                ", brigade=" + loyalty.getBrigade() +
                ", event=" + loyalty.getEvent() +
                ", cash=" + loyalty.getCash() + '}');
        }
        System.out.println("Total persons: " + loyalties.size());
    }
}
