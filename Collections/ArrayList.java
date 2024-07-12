package Collections;
public class ArrayList<T> {
    private Object[] array;
    public int size;
    public ArrayList(){
        array = new Object[0];
    }
    public void add(T item){
        Object[] newArray = new Object[size + 1];
        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        newArray[size] = item;
        array = newArray;
        size++;
    }
    @SuppressWarnings("unchecked")
    public T get(int index){
        return (T) array[index];
    }
    public void remove(int index){
        Object[] newArray = new Object[size - 1];
        for(int i = 0; i < size; i++){
            if(i < index){
                newArray[i] = array[i];
            } else if(i > index){
                newArray[i - 1] = array[i];
            }
        }
        array = newArray;
        size--;
    }

}
