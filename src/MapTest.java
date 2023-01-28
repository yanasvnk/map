import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
    public static final Map<String, Integer> strMap = new HashMap<>();
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        addNumberToMap("строка", 1);
        addNumberToMap("строка", 1);
        addNumberToMap("строка2", 3);
        addNumberToMap("строка2", 4);

        for(Map.Entry<String, Integer> stringIntegerEntry: strMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " : " + stringIntegerEntry.getValue());
        }
    }

    public static void addNumberToMap(String s, Integer i) {
        if (strMap.containsKey(s)&& strMap.containsValue(i)){
            throw new RuntimeException(strMap + " ключ уже есть и значения совпадают.");
        }
        strMap.put(s, i);
    }

    public static Integer sumElements (List<Integer> list) {
        Integer sum = 0;
        for (Integer element: list) {
            sum += element;
        }
        return sum;
    }

}

