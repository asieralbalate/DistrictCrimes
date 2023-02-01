import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pair <K extends Comparable<K>,V > implements Comparable <Pair<K, V>> {
    private K key;
    private V value;

    public static void main(String[] args) {
        Pair<String, String> pair1 = new Pair<>("aaaaaaaa", "world");
        Pair<String, String> pair2 = new Pair<>("zzzzzz", "world");
        Pair<String, String> pair3 = new Pair<>("gggggg", "world");
        Pair<String, String> pair4 = new Pair<>("kkkkkkk", "world");
        List<Pair<String,String>> list = new ArrayList<>();
        list.add(pair1);
        list.add(pair2);
        list.add(pair3);
        list.add(pair4);
        Collections.sort(list);
        System.out.println(list);
    }

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" + key +","+ value + '}';
    }

    @Override
    public int compareTo(Pair<K, V> pair) {
        return key.compareTo(pair.key);
    }
}
