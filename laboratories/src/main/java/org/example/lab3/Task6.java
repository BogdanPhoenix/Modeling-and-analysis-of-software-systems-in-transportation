package org.example.lab3;

import java.util.Iterator;

public class Task6 {
    private Task6() {
        throw new IllegalStateException("Utility class");
    }

    public static void doubleNum(MyList<Integer> list){
        if(list == null || list.isEmpty()){
            return;
        }
        int num = getNum(list);
        num *= 2;
        setNum(list, num);
    }

    private static int getNum(MyList<Integer> list){
        int num = 0;
        int numDigit = list.size() - 1;
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            int buffer = iterator.next();
            num += buffer * (int)Math.pow(10, numDigit--);
        }

        return num;
    }

    private static void setNum(MyList<Integer> list, int newNum){
        list.clear();

        while (newNum > 0){
            list.addFirst(newNum % 10);
            newNum /= 10;
        }
    }
}
