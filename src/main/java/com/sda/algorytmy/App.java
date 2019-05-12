package com.sda.algorytmy;

public class App {
    public static void main(String[] args) {
        boolean tab[] = new boolean[1000];
        tab[0] = false;
        tab[1] = false;
        for (int i = 2; i < tab.length; i++) {
            tab[i] = true;
        }


        for(int j =2; j<tab.length;j++)
        if(tab[j]==true){
            for(int a=j+j; a<tab.length;){
                tab[a]=false;
                a=a+j;
            }
        }


        for (int i = 2; i < tab.length; i++) {
            if(tab[i]==true){
            System.out.println(i);
        }
    }
}}
