package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {

    static void  HashMapput(HashMap hm) {
        hm.put(101,"Fremont");
        hm.put(102,"Pleasanton");
        hm.put(103,"Dublin");
        hm.put(105,"union City");
    }

    static void HashMapkey(HashMap hm, int key) {
        Object value = hm.get(key);
        System.out.println("The Key is "+key+" The value is "+value);
    }
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        HashMapput(hm);
        HashMapkey(hm,103);
    }
}
