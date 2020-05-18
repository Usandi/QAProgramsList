package Collections;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesWithSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<String>();
        names.add("JMeter");
        names.add("SoapUI");
        names.add("Postman");
        names.add("Git");
        names.add("jenkins");
        names.add("Git");
        System.out.println(names);
    }
}
