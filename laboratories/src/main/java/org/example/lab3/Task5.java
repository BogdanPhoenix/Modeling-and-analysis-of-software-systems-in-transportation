package org.example.lab3;

public class Task5 {
    private Task5() {
        throw new IllegalStateException("Utility class");
    }

    public static <T> void removeElement(MyList<T> list, T value){
        if(list == null || list.isEmpty()){
            return;
        }

        list.remove(value);
    }
}
