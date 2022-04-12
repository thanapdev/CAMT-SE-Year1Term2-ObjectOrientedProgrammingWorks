//thanapong yamkamol
//642115022

package lab4_2;
public class Counter {
       private int Count;

       public Counter(int newcount){
           Count = newcount;
       }
       public int getCount(){
           return Count;
       }
       public void click(){
            Count++;
       }
       public void reset(){
           Count = 0;
       }
}
