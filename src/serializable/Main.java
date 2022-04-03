package serializable;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (FileOutputStream fileOutputStream = new FileOutputStream("serializedData");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            //write object fo file
            objectOutputStream.writeObject(new SerializableObj(1));
        }
        try (FileInputStream fileInputStream = new  FileInputStream("serializedData");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            //read object
            Object obj = objectInputStream.readObject();
            System.out.println(obj);
            System.out.println(((SerializableObj)obj).getId());
        }
    }
}
