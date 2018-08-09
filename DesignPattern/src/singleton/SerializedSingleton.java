package singleton;

import staticdemo.ClassStatic;

import java.io.*;

/**
 * @author thotv on 29/07/2018 !
 */
public class SerializedSingleton implements Serializable {
    private static final long serialVersionUID=-1L;
    private SerializedSingleton(){}

    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }

    //todo To overcome the Singleton pattern is destroyed!
    //Nice solution!
    protected Object readResolve() {
        return getInstance();
    }
}
class SingletonSerializedTest {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
        ClassStatic classStatic = new ClassStatic();

    }

}