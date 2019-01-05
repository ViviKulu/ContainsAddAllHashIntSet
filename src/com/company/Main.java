package com.company;

public class Main {

    // Write a method in the HashIntSet class called
    // containsAll that accepts another hash set as a
    // parameter and returns true if your set contains
    // every element from the other set. For example,
    // if the set stores [-2, 3, 5, 6, 8] and the method
    // is passed [3, 6, 8], your method would return true.
    // If the method were passed [3, 6, 7, 8], your method
    // would return false because your set does not contain
    // the value 7.

    public static void main(String[] args) {
	// write your code here
        HashIntSet s1 = new HashIntSet();

        s1.add(-2);
        s1.add(3);
        s1.add(5);
        s1.add(6);
        s1.add(8);

        HashIntSet s2 = new HashIntSet();

        s2.add(3);
        s2.add(6);
        s2.add(7);
        s2.add(8);

        System.out.println(s1.containsAll(s2));
    }
}
