import java.util.HashMap;

public class HW6 {
private static HashMap<Integer, Object> hashMap = new HashMap<>();
private static final Object OBJECT = new Object();

    public static void main(String[] args) throws Exception {
        add(43);
        add(432);
        add(2);
        add(11);
        add(13);
        add(75);
        Object[] tmp = hashMap.keySet().toArray();
        for (int i = 0; i < tmp.length; i++) {
            System.out.print((Integer)tmp[i]+" ");
        }

    }
public static void add(Integer numbers){
        hashMap.put(numbers, OBJECT);
}
}
