package com.jully;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


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
        profileMap.put("Miley Cyrus", "Record of the Year & Best Pop Solo Performance");
        profileMap.put("Taylor Swift", "Album of the Year & Best Pop Vocal Album");
        profileMap.put("Billie Eilish", "Song for the Year");
        profileMap.put("Victoria Monet", "Best New Artist");
        profileMap.put("The Beatles", "Best Music Video");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter artist's name:");
        String artistName = scanner.nextLine();

        try {
            if (profileMap.containsKey(artistName)) {
                System.out.println(profileMap.get(artistName));
            } else {
                throw new UserNotFoundException("No information found.");
            }
        } catch (UserNotFoundException e) {
            System.out.println("No information found. Please enter artist's name again.");
        }
    }
}
