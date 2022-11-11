package datastructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HashTableTest {

    private HashTable<String, String> hashTable;

    @BeforeEach
    void beforeEach() {
        hashTable = new HashTable<>();
    }

    @Test
    void test() {
        hashTable.put("KEY1", "VALUE1");
        assertEquals("VALUE1", hashTable.get("KEY1"));
    }

    @Test
    void duplicateKeyTest() {
        hashTable.put("KEY", "ORANGE");
        hashTable.put("KEY", "APPLE");

        assertEquals("APPLE", hashTable.get("KEY"));
    }

}