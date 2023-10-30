package org.example.lab3;

public class Task2 {
    private Task2() {
        throw new IllegalStateException("Utility class");
    }

    public static <T> void removeDuplicate(MyList<T> list){
        if(list == null){
            return;
        }

        for(int i = 0; i < list.size() - 1; ++i){
            if(list.get(i).equals(list.get(i+1))){
                list.remove(i);
                --i;
            }
        }
    }
}
