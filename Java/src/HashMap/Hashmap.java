package Java.src.HashMap;
import java.util.HashMap;

public class Hashmap {
    

    public static void main(String[] args) 
    {
        HashMap<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("Akshay", 2435);
        mapping.put("Anand", 3524);
    
        System.out.println(mapping);

        HashMap<String, String> UserPass = new HashMap<String, String> ();

        UserPass.put("AkshayAnand", "20BCS2435@123");
        UserPass.put("AkashAnand", "20BCS2435@3456");
        UserPass.put("AmanKumar", "Java4567");
        UserPass.put("AshishKumar", "c++4597");
         

       
        UserPass.remove("AmanKumar");
        //remove() method eliminates any key - value pair of the key that you put into it, from the hashmap. 
        System.out.println(UserPass.containsValue("c++4597"));
        //return boolean value if the hashmap contains the given value.


    }
    



}
