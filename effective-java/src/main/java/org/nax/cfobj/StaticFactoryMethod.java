package org.nax.cfobj;

import java.math.*;

public class StaticFactoryMethod {

    public static void main(String[] args) {
        BigInteger bigInter = BigInteger.valueOf(1324);
        BigInteger bigExp = BigInteger.valueOf(1);
        System.out.println(bigInter.toString());
        System.out.println(bigExp.toString());
    }
}