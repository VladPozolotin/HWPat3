package org.example;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator();
    }

    private class RandomIterator implements Iterator {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Object next() {
            Integer rand = 0;
            while (rand < min) {
                rand = random.nextInt(max + 1);
            }
            return rand;
        }
    }
}
