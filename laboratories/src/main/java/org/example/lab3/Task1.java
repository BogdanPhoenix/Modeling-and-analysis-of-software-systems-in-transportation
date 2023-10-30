package org.example.lab3;

public class Task1 {
    private Task1() {
        throw new IllegalStateException("Utility class");
    }

    public static <T> MyList<T> merge(MyList<T> headFirst, MyList<T> headSecond){
        if(headFirst == null && headSecond == null){
            return new MyList<>();
        }
        else if (headFirst == null){
            return headSecond;
        }
        else if(headSecond == null){
            return headFirst;
        }

        headFirst.merge(headSecond);
        headFirst.sort();

        return headFirst;
    }
}
