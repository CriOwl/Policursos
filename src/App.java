import DataAccess.DAO.*;
import DataAccess.DTO.*;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            SexoDAO cDao = new  SexoDAO();

            cDao.update(new SexoDTO(4, "compañere", "", "", ""));
            
            for (SexoDTO s : cDao.readAll()) {
                System.out.println(s.toString());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        
    }
}
