package com.jully;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Miley Cyrus");
        names.add("Taylor Swift");
        names.add("Billie Eilish");
        names.add("Victoria Monét");
        names.add("The Beatles");


        System.out.println(names.size());
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));
        System.out.println(names.get(3));
        System.out.println(names.get(4));



        Map<String, String> profileMap = new HashMap<>();
        profileMap.put("Miley Cyrus", "Record of the Year & Best Pop Solo Performance" );
        profileMap.put("Taylor Swift","Album of the Year & Best Pop Vocal Album" );
        profileMap.put("Billie Eilish", "Song for the Year");
        profileMap.put("Victoria Monét","Best New Artist" );
        profileMap.put("The Beatles","Best Music Video" );



        if(profileMap.containsKey("Miley Cyrus")){
            System.out.println("Miley Cyrus is a winner.");
            System.out.println("She won " + profileMap.get("Miley Cyrus") + ".");
        }else{
            System.out.println("Sorry. No information founded.");
        }



        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter artist's name:");
        String name = scanner.nextLine();
        if (profileMap.containsKey(name)){
            System.out.println("This artist won " + profileMap.get(name) + ".");
        }else{
            System.out.println("Sorry. No information founded.");
        }










    }
}