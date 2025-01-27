import DataAccess.DAO.*;
import DataAccess.DTO.*;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            PersonaDAO cDao = new  PersonaDAO();

            cDao.create(new PersonaDTO(2, 3, "123231", "Drake", "West", "123papa", 2));
            
            for (PersonaDTO s : cDao.readAll()) {
                System.out.println(s.toString());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        
    }
}
