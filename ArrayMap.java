import java.util.*;

public class HelloWorld {
  public static void main(String[] args) {
    
    List Countries = new ArrayList();
    
    Countries.add("India");
    Countries.add("Whales");
    Countries.add("England");
    
    Countries.remove(1);
    
    Countries.add(1,"Africa");
    
    System.out.println(Countries.toString());
    
    Map map = new HashMap();
    map.put("Father", "DJ");
    map.put("Mother", "Naina");
    
    System.out.println(map.get("Father"));
    System.out.println(map.toString());
    
      
  }
}

