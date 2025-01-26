import DataAccess.DAO.*;
import DataAccess.DTO.*;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            CatalogoTipoDAO cDao = new  CatalogoTipoDAO();

            cDao.update(new CatalogoTipoDTO(1, "Soda", "", "", null));
            
            for (CatalogoTipoDTO s : cDao.readAll()) {
                System.out.println(s.toString());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        
    }
}
