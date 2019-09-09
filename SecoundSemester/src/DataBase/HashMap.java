/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.util.Map;

/**
 *
 * @author Alaa
 */
public class HashMap {

    public static void main(String[] args) {
        
        Map<String, Student> map = new java.util.HashMap<>();
        Map<String, String> ids = new java.util.HashMap<>();
        
        ids.put("button1", "123");
        ids.put("button2","456");
        ids.put("button3", "789");
        
        
        for (Map.Entry me : ids.entrySet()) {
            map.put(me.getKey().toString()+"Btn",new Student(me.getValue().toString(),"1"));
        }
        

        System.out.println(map.get("button1Btn").id);
    }
}

class Student {

    String name;
    String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
