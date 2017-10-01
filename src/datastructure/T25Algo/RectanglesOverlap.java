package datastructure.T25Algo;


/**
 * Two rectangles A and B will not overlap or intersect with each other if one of
 * the following four conditions is true.
 * <p>
 * 1. Left edge of A is to the right of right edge of B. In this case first
 * rectangle A is completely on right side of second rectangle B as shown in the
 * following diagram
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 2. right edge of A is to the left of left edge of B. In this case first rectangle
 * A is completely on the left side of second rectangle B, as shown below
 * <p>
 * <p>
 * <p>
 * <p>
 * 3. Top edge of A is below bottom edge of B. In this case, first rectangle A is
 * completely under second rectangle B as shown in the following diagram
 * <p>
 * <p>
 * <p>
 * <p>
 * 4. Bottom edge of A is above top edge of B. In this case, first rectangle A is
 * completely above second rectangle B as shown in the following diagram
 * <p>
 * <p>
 * <p>
 * <p>
 * If any of above four conditions is not true then two rectangles are overlapping
 * with each other, as in following diagram first condition is violated,
 * hence rectangle A intersects rectangle B.
 * <p>
 * Read more: http://javarevisited.blogspot.com/2016/10/how-to-check-if-two-rectangle-overlap-in-java-algorithm.html#ixzz4uGPXzHfy
 */
public class RectanglesOverlap {

    public static void main(String[] args) {
        Point l1 = new Point(0, 10);
        Point r1 = new Point(10, 0);
        Point l2 = new Point(5, 5);
        Point r2 = new Point(15, 0);
        Rectangle first = new Rectangle(l1, r1);
        Rectangle second = new Rectangle(l2, r2);
        if (first.isOverLapping(second)) {
            System.out.println("Yes, two rectangles are intersecting with each other");
        } else {
            System.out.println("No, two rectangles are not overlapping with each other");
        }
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            super();
            this.x = x;
            this.y = y;
        }
    }

    static class Rectangle {
        private final Point topLeft;
        private final Point bottomRight;

        public Rectangle(Point topLeft, Point bottomRight) {
            this.topLeft = topLeft;
            this.bottomRight = bottomRight;
        }

        /**
         * Java method to check if two rectangle are intersecting to each other. *
         *
         * @param other *
         * @return true if two rectangle overlap with each other
         */

        public boolean isOverLapping(Rectangle other) {
            if (this.topLeft.x > other.bottomRight.x // R1 is right to R2
                    || this.bottomRight.x < other.topLeft.x // R1 is left to R2
                    || this.topLeft.y < other.bottomRight.y // R1 is above R2
                    || this.bottomRight.y > other.topLeft.y) {
                // R1 is below R1
                return false;
            }

            return true;
        }
    }
}

/**
 *
 *
 *
 * think this way
 *
 *
 *        x1,y1
 *
 *
 *                          x2,y2
 *
 *
 *
 *
 *
 *      a1,b1
 *
 *
 *                         a2,b2
 *
 *
 *     if (x1  >   a2  ||
 *         x2  <   a1  ||
 *         y1  <   b2  ||
 *         y2  >   b1) if any is true , then rex NOT overlapping or intersecting
 *
 *
 *
 *
 *
 *
 */


