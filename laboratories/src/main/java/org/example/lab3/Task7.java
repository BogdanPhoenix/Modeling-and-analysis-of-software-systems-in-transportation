package org.example.lab3;

public class Task7 {
    private Task7() {
        throw new IllegalStateException("Utility class");
    }

    public static MyList<Integer> createList(Integer[][] matrix){
        if(matrix == null){
            new MyList<Integer>();
        }

        MyList<Integer> list = new MyList<>();

        for (Integer[] integers : matrix) {
            for (Integer integer : integers) {
                list.addLast(integer);
            }
        }

        list.sort();

        return list;
    }
}
