package Review;

import java.util.*;

public class Collection {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(34, 23333));
        list.add(12);
        list.add(34);
        list.add(0, 67);
        list.add(0, 98);
        list.contains(34);

        HashSet<String> countries = new HashSet<>();
        countries.add("Armenia");
        countries.add("Georgia");
        countries.add("Russia");
        countries.add("USA");
//        countries.add(null);
        countries.add("Armenia");
//        TreeSet<String> Sorted = new TreeSet<>(countries);
//        for (String x:countries) {
//            if (x.equals("Armenia")){
//                countries.remove(x);
//            }
//            System.out.println(x);
//        }
        Map<String, String> taburetka = new HashMap<>();
        taburetka.put("X", "Y");
        taburetka.put("O", "I");
        String user = taburetka.get("X");
        for (Map.Entry<String, String> r: taburetka.entrySet()) {
            System.out.println(r.getKey()+ ":" + r.getValue());

        }
    }
}
