//642115022
//thanapong yamkamol

package lab7_2;
public class MyPoint {
        public double x;
        public double y;
    
        public MyPoint(double x, double y) {
            this.x = x;
            this.y = y;
        }
    
        public static double distance(double x2, double y2) {
            return Math.sqrt(((y2 - 0) * (y2 - 0)) + ((x2 - 0) * (x2 - 0)));
        }
    
        public double distance() {
            return Math.sqrt(((this.y - 0) * (this.y - 0)) + ((this.x - 0) * (this.x - 0)));
        }
    
        public static double distance(MyPoint p1, MyPoint p2) {
    
            return Math.sqrt(((p2.getY() - p1.getY()) * (p2.getY() - p1.getY()))
                    + ((p2.getX() - p1.getX()) * (p2.getX() - p1.getX())));
        }
        
        public double distance(MyPoint p2) {
            return Math.sqrt(((p2.getY() - this.y) * (p2.getY() - this.y))
                    + ((p2.getX() - this.x) * (p2.getX() - this.x)));
        }

        public double getX() {
            return this.x;
        }
    
        public double getY() {
            return this.y;
        }
    }

