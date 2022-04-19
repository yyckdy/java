package generiction_interface;

public interface Data<T> {
    void add(T s);
    void delete(int id);
    void update(T s);
    T queryById(int id);
}
