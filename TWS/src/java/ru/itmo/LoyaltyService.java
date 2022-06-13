/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ru.itmo;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author rozov
 */
@WebService(serviceName = "LoyaltyService")
public class LoyaltyService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getAll")
    public List<Loyalty> getAll() {
        PostgreSQLDAO dao = new PostgreSQLDAO();
        return dao.getAll();
    }
}
