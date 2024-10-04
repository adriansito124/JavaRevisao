import java.util.ArrayList;

public interface Set<T> {
    
    boolean exist(T value);
    void add(T value);
    ArrayList<T> unity(List<T> list1, List<T> list2);
    ArrayList<T> intersection(List<T> list1, List<T> list2);
    ArrayList<T> difference(List<T> list1, List<T> list2);


}
