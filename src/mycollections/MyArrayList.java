package mycollections;

public class MyArrayList<T> {
    private int element = 0;
    private Object[] myList;
    T array;

    public MyArrayList() {
        myList = new Object[0];
    }

    public void add(T array) {
        this.array = array;

        if (element == myList.length) {
            Object[] temp = myList;
            myList = new String[myList.length + 1];
            for (int i = 0; i < temp.length; i++) {
                myList[i] = temp[i];
            }
            myList[element] = this.array;
            element++;

        }
    }

    public Object size() {
        return myList.length;
    }

    public T[] items() {
        return (T[])myList;
    }

}
