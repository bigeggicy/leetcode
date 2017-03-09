import java.util.Hashtable;
import java.util.Stack;

/**
 * Created by bigegg on 2017/3/6 0006.
 */


public class CrashJava {
    public String toString() {
        return "CrashJava address: " + super.toString() + "\n";
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        Hashtable<Integer,Integer> a=new Hashtable<>();
        a.put(1,2);
        System.out.print(a);
        //for(int i = 0; i < 10; i++)s.push(1);


    }
}
