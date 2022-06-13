package ru.itmo;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;
import com.sun.xml.ws.fault.SOAPFaultBuilder;

@WebService(serviceName = "LoyaltyService")
public class LoyaltyService {
    SOAPFaultBuilder soapFaultBuilder;

        public LoyaltyService(){
            soapFaultBuilder.captureStackTrace = false;
        }

    @WebMethod(operationName = "getAll")
    public List<Loyalty> getAll() {
        PostgreSQLDAO dao = new PostgreSQLDAO();
        return dao.getAll();
    }
}
