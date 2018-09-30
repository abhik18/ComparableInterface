package com.company;

public class Compare implements Comparable<Compare>{
    String id;

    /**
     * @param id passed into constructor to give value to the id of a Compare Object
     */
    public Compare(String id)
    {
        this.id = id;
    }

    /**
     * @param a passed into method to be compared to the object at hand
     * @return the integer result of the comparison
     */
    public int compareTo(Compare a) {
        return this.id.compareTo(a.id);
    }
}
