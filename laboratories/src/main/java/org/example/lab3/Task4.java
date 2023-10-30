package org.example.lab3;

public class Task4 {
    private Task4() {
        throw new IllegalStateException("Utility class");
    }

    public static <T> void rearrangeList(MyList<T> list){
        if(list == null || list.size() <= 1){
            return;
        }

        for(int i = 1; i <= list.size() - 1; i += 2){
            list.add(i, list.get(list.size() - 1));
            list.removeLast();
        }
    }
}
