package com;

import java.util.*;

public class ScoreComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        Player p1 = (Player) o1;
        Player p2 = (Player) o2;
        if (p1.score == p2.score){
            return 1;
        }else if(p1.score > p2.score) {
            return -1;
        } else {
            return 0;
        }
    }

}
