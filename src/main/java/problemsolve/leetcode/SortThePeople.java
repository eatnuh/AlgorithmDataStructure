package problemsolve.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        List<Person> people = new ArrayList<>();

        for(int i = 0; i < names.length; i++) {
            people.add(new Person(names[i], heights[i]));
        }

        Collections.sort(people, (p1, p2) -> p2.height - p1.height);

        String[] namesOrderByHeightDesc = new String[people.size()];

        for(int i = 0; i < people.size(); i++) {
            namesOrderByHeightDesc[i] = people.get(i).name;
        }

        return namesOrderByHeightDesc;
    }

    static class Person {
        private final String name;
        private final int height;

        public Person(String name, int height) {
            this.name = name;
            this.height = height;
        }
    }
}
