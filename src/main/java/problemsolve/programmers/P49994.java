package problemsolve.programmers;

import java.util.*;

import static problemsolve.programmers.P49994.Point.createInitPoint;

// https://school.programmers.co.kr/learn/courses/30/lessons/49994
public class P49994 {

    private static final int MAX_BOUND = 5;
    private static final int MIN_BOUND = -5;


    public int solution(String dirs) {

        Set<Road> visitedRoad = new HashSet<>();

        Point cur = createInitPoint();

        for(int i = 0; i < dirs.length(); i++) {
            char dir = dirs.charAt(i);
            Point next =  cur.createNext(dir);

            if(next.isInBound()) {
                visitedRoad.add(new Road(cur, next));
                visitedRoad.add(new Road(next, cur));
                cur = next;
            }

        }


        return visitedRoad.size() / 2;
    }

    static class Point {
        private int x;
        private int y;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public static Point createInitPoint() {
            return new Point(0, 0);
        }

        public boolean isInBound() {
            return MIN_BOUND <= x && x <= MAX_BOUND && MIN_BOUND <= y && y <= MAX_BOUND;
        }

        private Point createUpPoint() {
            return new Point(x, y - 1);
        }

        private Point createDownPoint() {
            return new Point(x, y + 1);
        }

        private Point createLeftPoint() {
            return new Point(x - 1, y);
        }

        private Point createRightPoint() {
            return new Point(x + 1, y);
        }

        public Point createNext(char dir) {
            if(dir == 'U') return createUpPoint();
            else if(dir == 'D') return createDownPoint();
            else if(dir == 'L') return createLeftPoint();
            else return createRightPoint();
        }
    }

    static class Road {
        private Point from;
        private Point to;

        public Road(Point from, Point to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Road road = (Road) o;
            return Objects.equals(from, road.from) && Objects.equals(to, road.to);
        }

        @Override
        public int hashCode() {
            return Objects.hash(from, to);
        }
    }

}
