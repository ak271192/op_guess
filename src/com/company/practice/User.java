package com.company.practice;

import java.util.HashMap;
import java.util.Map;

class Use {

    private String name;
    public Use(String name){
        this.name = name;
    }

    @Override
    public int hashCode(){
        return 1;
    }
}

public class User{

     public static void main(String[] args){
         Map<Use,Integer> map = new HashMap<>();
         map.put(new Use("a"),1);
         map.put(new Use("b"),2);
         map.put(new Use("a"),3);
         System.out.println(map.size());
         System.out.println(map.get(new Use("a")));

     }
}


