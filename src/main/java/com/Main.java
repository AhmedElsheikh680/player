package com;

import java.util.*;

public class Main {
    public static void main(String[] args) {



        ArrayList al = new ArrayList();
        Scanner sc = new Scanner(System.in);
       int size =  sc.nextInt();
//        int size = sc.nextInt();
//        Player[] players = new Player[size];
//        for (int i=0; i<size; i++){
//            Player player = new Player();
//            player.name = sc.next();
//            player.score = sc.nextInt();
//            players[i] = player;
//        }


            al.add(new Player("amy ", 100));
            al.add(new Player("david  ", 100));
            al.add(new Player("heraldo  ", 50));
            al.add(new Player("aakansha  ", 75));
            al.add(new Player("aleksa  ", 150));




        Collections.sort(al, new ScoreComparator());
        Iterator<Player> playerIterator2 = al.iterator();
        while (playerIterator2.hasNext()){
            Player player = (Player) playerIterator2.next();
            System.out.println(player.name + ""+ player.score) ;
        }







    }
}
