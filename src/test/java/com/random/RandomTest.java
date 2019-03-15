package com.random;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;

public class RandomTest {
    @Test
    public void test(){
        for (int i = 0; i < 1000; i++) {
            int uniform = StdRandom.uniform(9999);
            StdOut.println(uniform);
        }
    }
}
