package com;

import java.util.Comparator;

public class NameComparator  implements Comparator {
    public int compare(Object o1, Object o2) {
        Player p1=(Player) o1;
        Player p2=(Player) o2;

        return p1.name.compareTo(p2.name);
    }
}
