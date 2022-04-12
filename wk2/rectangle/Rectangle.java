//thanpong yamkamol
//642115022

package rectangle;

public class Rectangle {
    private float width;
    private float height;
    private float area;
    private float perimeter;
    
    public Rectangle(float w , float h){
        width = w;
        height = h;
    }

    public float getWidth(){return width;}
    public float getHeight(){return height;}
   

    public float area(){
        area = width*height;
        return area;
    }
    public float Perimeter(){
        perimeter = 2*(height+width);
        return perimeter;
    }
}
