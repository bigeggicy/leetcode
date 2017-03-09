/**
 * Created by bigegg on 2017/3/2 0002.
 */


    public class NeverCaught {
        static void f() {
            throw new RuntimeException("From f()");
        }
    static void g() {
            f();
        }
    public static void main(String[] args) {
            g();
        }
    } ///:~
