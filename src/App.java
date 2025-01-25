import DataAccess.DAO.*;
import DataAccess.DTO.*;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            CatalogoDAO cDao = new  CatalogoDAO();

            System.out.println(cDao.readBy(2));
            System.out.println("----------");
            
            for (CatalogoDTO s : cDao.readAll()) {
                System.out.println(s.toString());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        
    }
}
