//thanapong yamkamol
//642115022

package arraylist;
import java.util.ArrayList;
import java.util.Date;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();

        list.add(new Date());
        list.add(new Loan("Tester",1500));
        list.add(new Circle(3));

        for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i).toString()+"\n");
        }
    }
}
