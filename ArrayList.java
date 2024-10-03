public class ArrayList<T> implements Collection<T>{
    private T[] data;
    public ArrayList() {
        data = create(10);
    }

    T[] create(int size) {
        Object[] array = new Object[size];
        return (T[])array;
    }

    @Override
    public T get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public void add(T value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    
}
