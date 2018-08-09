package staticdemo;

import singleton.SerializedSingleton;

/**
 * @author thotv on 29/07/2018 !
 */
public class ClassNoneStatic {
    public ClassNoneStatic() {
    }

    private static class SingletonHelper{
        private static final ClassNoneStatic instance = new ClassNoneStatic();
    }

    public static ClassNoneStatic getInstance(){
        return ClassNoneStatic.SingletonHelper.instance;
    }

    //todo To overcome the Singleton pattern is destroyed!
    //Nice solution!
    protected Object readResolve() {
        return getInstance();
    }
    public void print(){
        System.out.println("This is ClassNoneStatic");
    }

    public static void main(String[] args) {
        ClassStatic classStatic = new ClassStatic();
        classStatic.strDemo="";
    }
}
