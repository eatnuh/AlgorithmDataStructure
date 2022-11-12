package datastructure;

import java.util.ArrayList;
import java.util.List;

public class HashTable<K, V> {

    private final static int DEFAULT_CAPACITY = 10;

    private final List<Entry<K, V>>[] bucket;

    public HashTable() {
        this.bucket = new List[DEFAULT_CAPACITY];
    }

    public void put(K key, V value) {
        int hashKey = hash(key);
        if (bucket[hashKey] == null) bucket[hashKey] = new ArrayList<>();

        for(int i = 0; i < bucket[hashKey].size(); i++) {
            if(bucket[hashKey].get(i).key.equals(key)) {
                bucket[hashKey].remove(i);
                break;
            }
        }

        bucket[hashKey].add(new Entry<>(key, value));
    }

    public V get(K key) {
        int hashKey = hash(key);
        if (bucket[hashKey] == null) bucket[hashKey] = new ArrayList<>();

        for(Entry<K, V> entry : bucket[hashKey]) {
            if(entry.key.equals(key)) return entry.value;
        }

        throw new IllegalArgumentException();
    }

    private int hash(K key) {
        return key.hashCode() % bucket.length;
    }

    private record Entry<K, V>(K key, V value) {

    }
}
