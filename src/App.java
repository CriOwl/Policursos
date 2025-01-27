import DataAccess.DAO.*;
import DataAccess.DTO.*;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            NotaDAO cDao = new  NotaDAO();

            cDao.update(new NotaDTO(22, 2, 0, "", "", ""));
            
            for (NotaDTO s : cDao.readAll()) {
                System.out.println(s.toString());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        
    }
}
