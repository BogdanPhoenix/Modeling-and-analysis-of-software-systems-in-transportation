package org.example.lab4.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestRecentCounter {
    @Test
    void test(){
        Integer expected = 3;
        RecentCounter recentCounter = new RecentCounter();

        recentCounter.ping(1);
        recentCounter.ping(100);
        recentCounter.ping(3001);

        var actual = recentCounter.ping(3002);

        Assertions.assertEquals(expected, actual);
    }
}
