package algorithm.set;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnionFindTest {

    @Test
    public void test() {
        UnionFind unionFind = new UnionFind(10);

        unionFind.union(0, 9);

        assertEquals(unionFind.find(0), unionFind.find(9));
    }
    @Test
    public void test2() {
        UnionFind unionFind = new UnionFind(10);

        unionFind.union(3, 5);
        unionFind.union(5, 1);
        unionFind.union(2, 7);
        unionFind.union(9, 4);

        assertEquals(unionFind.find(3), unionFind.find(5));
        assertEquals(unionFind.find(3), unionFind.find(1));
        assertNotEquals(unionFind.find(7), unionFind.find(9));
        assertNotEquals(unionFind.find(3), unionFind.find(4));
    }

}