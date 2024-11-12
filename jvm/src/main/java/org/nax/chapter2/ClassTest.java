package org.nax.chapter2;

public class ClassTest {

    private int m;

    public int mul5 () {

        return m * 5;
    }

    public static void main(String[] args) {
        System.out.println(new ClassTest().mul5());
    }
}