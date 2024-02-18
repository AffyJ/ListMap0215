package com.jully;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("マイリー・サイラス");
        names.add("テイラー・スウィフト");
        names.add("ビリー・アイリッシュ");
        names.add("ヴィクトリア・モネ");
        names.add("シザ");


        System.out.println(names.size());
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));
        System.out.println(names.get(3));
        System.out.println(names.get(4));



        Map<String, String> profileMap = new HashMap<>();
        profileMap.put("マイリー・サイラス", "最優秀レコード賞" );
        profileMap.put("テイラー・スウィフト","最優秀アルバム賞" );
        profileMap.put("ビリー・アイリッシュ", "最優秀楽曲賞");
        profileMap.put("ヴィクトリア・モネ","最優秀新人賞" );
        profileMap.put("シザ","最優秀R&Bソング賞" );




        System.out.println(profileMap.get("マイリー・サイラス"));
        System.out.println(profileMap.get("テイラー・スウィフト"));
        System.out.println(profileMap.get("ビリー・アイリッシュ"));
        System.out.println(profileMap.get("ヴィクトリア・モネ"));
        System.out.println(profileMap.get("シザ"));

        if(profileMap.containsKey("マイリー・サイラス")){
            System.out.println("マイリー・サイラスは受賞しています。");
            System.out.println("マイリー・サイラスは" + profileMap.get("マイリー・サイラス") + "を受賞しました。");
        }else{
            System.out.println("この人物の情報は見つかりませんでした。");
        }












    }
}