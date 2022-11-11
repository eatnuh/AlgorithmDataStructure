package datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HashTable<K, V> {

    private final static int DEFAULT_CAPACITY = 10;

    private final List<Entry<K, V>>[] bucket;

    public HashTable() {
        this.bucket = new List<>[DEFAULT_CAPACITY];
    }

    public void put(K key, V value) {
        int hashKey = hash(key);
        if (bucket[hashKey] == null) bucket[hashKey] = new ArrayList<>();

        Optional<Entry<K, V>> optionalEntry = bucket[hashKey].stream().filter(entry -> entry.key.equals(key)).findAny();
        optionalEntry.ifPresent(bucket[hashKey]::remove);
        bucket[hashKey].add(new Entry<>(key, value));
    }

    public V get(K key) {
        int hashKey = hash(key);
        if (bucket[hashKey] == null) throw new IllegalArgumentException();

        return bucket[hashKey].stream()
                .filter(entry -> entry.key.equals(key))
                .findAny()
                .orElseThrow(IllegalArgumentException::new)
                .value;
    }

    private int hash(K key) {
        return key.hashCode() % bucket.length;
    }

    private record Entry<K, V>(K key, V value) {

    }
}
