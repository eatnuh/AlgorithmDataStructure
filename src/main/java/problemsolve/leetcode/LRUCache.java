package problemsolve.leetcode;

import java.util.LinkedHashMap;

public class LRUCache {

    private LinkedHashMap<Integer, Integer> linkedHashMap;
    private int capacity;

    public LRUCache(int capacity) {
        this.linkedHashMap = new LinkedHashMap<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!linkedHashMap.containsKey(key)) return -1;

        int remove = linkedHashMap.remove(key);
        linkedHashMap.put(key, remove);

        return remove;
    }

    public void put(int key, int value) {
        if (linkedHashMap.containsKey(key)) {
            linkedHashMap.remove(key);
        }
        if (linkedHashMap.size() == capacity) {
            linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
        }

        linkedHashMap.put(key, value);
    }

}
