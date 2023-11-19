package repositorys;

import domainmodels.ChiTietSP;
import java.util.List;

public abstract class GiayRepository<EntityType, KeyType> {

    public abstract void insert(EntityType entity);

    public abstract void update(EntityType entity);

    public abstract void delete(EntityType entity);

    public abstract List<EntityType> getAll();

    public abstract EntityType selectById(KeyType id);

    public abstract List<EntityType> selectBySQL(String sql, Object... args);



    public Object add(ChiTietSP data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
