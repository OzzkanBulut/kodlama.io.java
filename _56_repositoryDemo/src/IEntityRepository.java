public interface IEntityRepository <T extends IEntity > { // Generic kısıtlama yaparken extends kullanılır
    void add(T entity);
    void delete(T entity);
    void update(T entity);
}
