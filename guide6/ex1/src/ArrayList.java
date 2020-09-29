public class ArrayList<T extends Comparable<T>> implements List<T>{
    private T[] array;
    private int size;

    public ArrayList(){
        this.array = (T[]) (new Object[10]);
        this.size = 0;
    }

    public ArrayList(int size) {
        this.array = (T[]) (new Object[size]);
        this.size = 0;
    }

    public T get(int position){
        return array[position];
    }

    public T remove(int position){
        T elem = array[position];

        array[position] = null;

        for (int i = position; i < size - 1; i++) {
            array[i] = array[i+1];
        }
        array[size-1] = null;
        size --;

        return elem;
    }

    public void add(T elem){
        add(size, elem);
    }

    public void add(int position, T elem){
        if (size == array.length){
            T[] newArray = (T[]) (new Object[size*2]);
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        if (position < size){
            for (int i = size; i > position; i--) {
                array[i] = array[i-1];
            }
            array[position] = elem;
        }else {
            array[size] = elem;
        }
        size++;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

}
