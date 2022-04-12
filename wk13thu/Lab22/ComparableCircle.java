//thanapong Yamkamol
//642115022

package Lab22;

class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(){
        super();
    }
    public ComparableCircle(double radius){
        super(radius);
    }
    @Override
    public int compareTo(ComparableCircle o) {
        return (int) (getRadius()-o.getRadius());
    }
}


