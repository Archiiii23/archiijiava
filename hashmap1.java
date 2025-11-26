 import java. util.HashMap;
class hashmap1 {
public static void main(String[]args){
    HashMap< Integer,Integer> map=new HashMap<>();
    map.put (1,10);
    map.put (2,20);
    System.out.println(map.get(1));
    System.out.println(map.getOrDefault(3,30));
    System.out.println(map.containsKey(5));
}
}
