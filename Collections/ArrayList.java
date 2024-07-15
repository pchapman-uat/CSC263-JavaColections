package Collections;
public class ArrayList<T> {
    // Array of any type of objects
    private Object[] array;
    // Size of the array as it will change
    public int size;
    // Create a new array
    public ArrayList(){
        array = new Object[0];
    }
    // Add element to the array
    public void add(T item){
        // Create a new array one size more than the previous array
        Object[] newArray = new Object[size + 1];
        // For each element in the array add to the new array
        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        // Set the final element to the item
        newArray[size] = item;
        // Update the array
        array = newArray;
        // Increase the size
        size++;
    }
    // Get the element at the index
    @SuppressWarnings("unchecked")
    public T get(int index){
        // A cast is needed to conver the any object to T
        return (T) array[index];
    }
    // Remove an element at an index
    public void remove(int index){
        // Create an array one smaller than the current array
        Object[] newArray = new Object[size - 1];
        // For each element in the current array
        for(int i = 0; i < size; i++){
            // If the element is less than the index, set the value at the same index
            // Else set the element one less than before
            if(i < index){
                newArray[i] = array[i];
            } else if(i > index){
                newArray[i - 1] = array[i];
            }
        }
        // Update the array
        array = newArray;
        // Decrease the size
        size--;
    }

}
