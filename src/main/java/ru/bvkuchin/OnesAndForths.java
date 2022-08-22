package ru.bvkuchin;

import java.util.*;

public class OnesAndForths {
    public boolean checkArray(Integer[] arr) {
        Set<Integer> set = new HashSet<Integer>();
        Collections.addAll(set, arr);

        if (set.contains((Integer) 1) && set.contains((Integer) 4)) {
            return true;
        } else return false;

    }
}
