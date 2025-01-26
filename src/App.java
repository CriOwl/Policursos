import DataAccess.DAO.*;
import DataAccess.DTO.*;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            FacturaDAO cDao = new  FacturaDAO();

            cDao.create(new FacturaDTO(2, 145.99, 1));
            
            for (FacturaDTO s : cDao.readAll()) {
                System.out.println(s.toString());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        
    }
}
