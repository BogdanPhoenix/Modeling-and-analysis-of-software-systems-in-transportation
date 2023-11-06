package org.example.lab4.queue;

public class RecentCounter {
    private final Queue<Integer> queue;
    public RecentCounter() {
        queue = new Queue<>();
    }

    public int ping(int t) {
        queue.offer(t);

        int min = t - 3000;
        int numRequest = 0;
        int countStop = queue.size();

        for(int i = 0; i < countStop; ++i){
            int buffer = queue.poll();

            if(min <= buffer && buffer <= t){
                ++numRequest;
            }

            queue.offer(buffer);
        }

        return numRequest;
    }
}
