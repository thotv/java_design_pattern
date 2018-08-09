import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List ls = new ArrayList<>();
        ls.add("A");
        ls.add("B");
        String arr[] = (String[]) ls.toArray(new String[ls.size()]);
        System.out.println(ls);
        StringBuilder stringBuilder = new StringBuilder("-");
        StringBuffer stringBuffer  = new StringBuffer("-");
        stringBuffer.append("-");
        stringBuilder.append("-");
        stringBuffer.append("-",3,5);
        String str = "a";
        System.out.println(stringBuilder.toString());
        System.out.println(stringBuffer.toString());
        StringUtils.repeat("-",2);
//        List<String> ls2 = List.copyOf(ls);
//        System.out.println(ls2);
//        ls.add("C");
//        System.out.println(ls);
//        System.out.println(ls2);
    }
}
