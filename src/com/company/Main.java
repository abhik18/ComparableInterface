/**
 * @author Abhinav Komaravelli
 * @version 1.0
 * @since 2018-08-07
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        /**
         * Creates two Compare objects
         * Compares them for testing
         * Just manipulate the id to test how integer value is returned
         */
        Compare ex = new Compare("B");
        Compare ex2 = new Compare("A");
        System.out.println(ex2.compareTo(ex));
    }
}
