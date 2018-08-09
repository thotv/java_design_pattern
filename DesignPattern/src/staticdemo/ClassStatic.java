package staticdemo;

/**
 * @author thotv on 29/07/2018 !
 */
public class ClassStatic {
    //public static ClassNoneStatic classNoneStatic;
    String strDemo;
     static {
        try{
            ClassNoneStatic classNoneStatic = ClassNoneStatic.getInstance();
            classNoneStatic.print();
            //classNoneStatic.print();
            System.out.println("Done!");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("This is ClassStatic");
    }
}
