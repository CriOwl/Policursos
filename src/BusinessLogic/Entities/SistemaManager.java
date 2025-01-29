package BusinessLogic.Entities;

import DataAccess.IDAO;
import java.util.List;
import java.util.function.Supplier;

import BusinessLogic.BLFactory;

public class SistemaManager {
    private static SistemaManager instance;
    
    private SistemaManager() {}
    
    public static SistemaManager getInstance() {
        if (instance == null) {
            instance = new SistemaManager();
        }
        return instance;
    }
    
    private <T> BLFactory<T> getBLFactory(Supplier<IDAO<T>> supplier) {
        return new BLFactory<>(supplier);
    }
    
    public <T> List<T> getAll(Supplier<IDAO<T>> supplier) throws Exception {
        return getBLFactory(supplier).getAll();
    }
    
    public <T> T getBy(Supplier<IDAO<T>> supplier, int id) throws Exception {
        return getBLFactory(supplier).getBy(id);
    }
    
    public <T> boolean add(Supplier<IDAO<T>> supplier, T entity) throws Exception {
        return getBLFactory(supplier).add(entity);
    }
    
    public <T> boolean update(Supplier<IDAO<T>> supplier, T entity) throws Exception {
        return getBLFactory(supplier).upd(entity);
    }
    
    public <T> boolean delete(Supplier<IDAO<T>> supplier, int id) throws Exception {
        return getBLFactory(supplier).del(id);
    }
}
