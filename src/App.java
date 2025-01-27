import DataAccess.DAO.*;
import DataAccess.DTO.*;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Estudiante_cursoDAO cDao = new  Estudiante_cursoDAO();

            cDao.update(new Estudiante_cursoDTO(21, 5, 1, 2, "", "", ""));
            
            for (Estudiante_cursoDTO s : cDao.readAll()) {
                System.out.println(s.toString());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        
    }
}
