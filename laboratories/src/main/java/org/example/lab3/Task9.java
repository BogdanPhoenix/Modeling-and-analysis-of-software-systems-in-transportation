package org.example.lab3;

import java.util.Iterator;

public class Task9 {
    private Task9() {
        throw new IllegalStateException("Utility class");
    }

    public static void splitList(MyList<Integer> list, int x){
        if(list == null || list.size() <= 1){
            return;
        }

        int indexInput = findIndexInput(list, x);

        for(int i = indexInput + 1; i < list.size(); ++i){
            Integer buffer = list.get(i);
            if(buffer < x){
                list.remove(i);
                list.add(indexInput, buffer);
                ++indexInput;
                --i;
            }
        }
    }

    private static Integer findIndexInput(MyList<Integer> list, int x){
        Integer indexInput = 0;
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            if(iterator.next() >= x){
                break;
            }
            ++indexInput;
        }

        return indexInput;
    }
}
