package SerializationDeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDeserializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
			Planet earth = new Planet("Earth","mass");
			FileOutputStream files = new FileOutputStream("file.txt");
			ObjectOutputStream out = new ObjectOutputStream(files);
			out.writeObject(earth);
			out.close();
			files.close();
			System.out.println("Successfully serialized the object!");
			
			FileInputStream files1 = new FileInputStream("file.txt");
			ObjectInputStream inp = new ObjectInputStream(files1);
			Planet earthCopy = (Planet) inp.readObject();
			System.out.println("..... Deserializing.....\n"+earthCopy.getName()+" "+earthCopy.getMass());
			inp.close();
			files1.close();
		}
		finally {
			System.out.println("Successfully completed!");
		}
	}

}
