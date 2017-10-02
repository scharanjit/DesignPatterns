package datastructure.T25Algo;

public class RectangleTest {

    static class Points {
        int x, y;

        public Points(int x, int y) {
            this.x = x;
            this.y = y;

        }
    }

    static class Rectangles {
        Points topLeft;
        Points bottomRight;

        public Rectangles(Points topLeft, Points bottomRight) {
            this.topLeft = topLeft;
            this.bottomRight = bottomRight;

        }

        boolean isOverlapping(Rectangles second) {

            if (this.topLeft.x > second.bottomRight.x ||
                    this.bottomRight.x < second.topLeft.x ||
                    this.topLeft.y < second.bottomRight.y ||
                    this.bottomRight.y > second.topLeft.y) {
                return false;
            }

            return true;
        }
    }


    public static void main(String[] args) {
        Points l1 = new Points(0, 10);
        Points r1 = new Points(10, 0);
        Points l2 = new Points(5, 5);
        Points r2 = new Points(15, 0);

        Rectangles rectangles1 = new Rectangles(l1, r1);
        Rectangles rectangles2 = new Rectangles(l2, r2);

        if (rectangles1.isOverlapping(rectangles2)) {
            System.out.println("yessssssss");
        } else {
            System.out.println("Noo");
        }


    }
}
