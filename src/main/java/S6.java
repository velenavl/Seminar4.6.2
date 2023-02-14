import java.util.*;

public class S6 {
    private static HashMap<Integer, Object> hMap = new HashMap<>();
    private static final Object OBJECT = new Object();
    public static void main(String[] args) throws Exception {
        // Нужно изобразить работу hashSet
        add(65);
        add(15);
        add(38);
        add(65);
        System.out.println(hMap.keySet());
        System.out.println(getString());
        System.out.println(isEmptty());
        Object[] tmp = hMap.keySet().toArray();
        for (int i = 0; i < tmp.length; i++) {
            System.out.print((Integer)tmp[i]+" ");
        }
//        System.out.println();
//        System.out.println(gettKey(0));
//
//        try {
//            System.out.println(gettKey(110));
//        } catch (Exception e) {
//            // TODO: handle exception
//            System.out.println(e.getMessage());
//        }



        Iterator<Integer> iterator = hMap.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    // Получить значение по индексу. Если вышли за пределы индекса, то он единицу делит на ноль
//    public static int gettKey(int num) {
//        return (Integer)hMap.keySet().toArray()[num];
//    }
    private static boolean isEmptty(){
        return hMap.isEmpty();
    }
    private static String getString(){
        return hMap.keySet().toString();
    }
    public static void add(Integer numbers) {
        hMap.put(numbers, OBJECT);
        }
    }

