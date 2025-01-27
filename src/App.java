import DataAccess.DAO.*;
import DataAccess.DTO.*;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            CursoDAO cDao = new  CursoDAO();

            cDao.update(new CursoDTO(24, 3, "Fundamentos de Mate", "Pepa", 3, 1, 2, "", "", ""));
            
            for (CursoDTO s : cDao.readAll()) {
                System.out.println(s.toString());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        
    }
}
