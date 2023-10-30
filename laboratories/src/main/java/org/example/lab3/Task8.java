package org.example.lab3;

public class Task8 {
    private Task8() {
        throw new IllegalStateException("Utility class");
    }

    public static <T> void swapElement(MyList<T> list, int k){
        if(list == null || list.isEmpty()){
            return;
        }

        for(int i = 0; i < list.size(); i += k){
            if(i + k >= list.size()){
                break;
            }

            list.swap(i, i + k - 1);
        }
    }
}
