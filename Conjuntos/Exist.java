public class Exist<T> implements Collection {

    private Object[] list;
    private int size = 0;
    
    List() {
        data = new Object[10];
        size = 0;
    }

    @Override
    public boolean existe(int value) {
        return true;
    }


    @Override
    public void add(int value) {
        if (size == list.length)
        {
            Object[] copia = new Object[2 * list.length];
            for (int i = 0; i < size; i++) {
                copia[i] = list[i];
            }
            list = copia;
        }

        list[size] = value;
        size++;
    }

}
