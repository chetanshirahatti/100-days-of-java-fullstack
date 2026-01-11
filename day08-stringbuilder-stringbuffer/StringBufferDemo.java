// StringBuffer is similar to StringBuilder but is synchronized (thread-safe). 

public class StringBufferDemo {

    public static void main(String[] args) {

        /*
         StringBuffer is also mutable.
         It is thread-safe (synchronized).
         Slower than StringBuilder.
        */

        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Full Stack");
        sb.append(" Learning");

        System.out.println(sb.toString());
    }
}
