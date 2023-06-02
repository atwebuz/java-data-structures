package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));

        colors[2] = "yello";

        System.out.println(colors[0]);

        for (int i=0 ; i<colors.length; i++){
            System.out.println(colors[i]);
        }

        System.out.println("-- reverse for --");

        for (int i = colors.length - 1; i>=0;i-- ){
            System.out.println(colors[i]);
        }

        System.out.println("-- forEach --");
        for(String color: colors){
            System.out.println(color);
        }

        System.out.println("-- second way forEach Stream --");
        Arrays.stream(colors).forEach(System.out::println);


    }
}