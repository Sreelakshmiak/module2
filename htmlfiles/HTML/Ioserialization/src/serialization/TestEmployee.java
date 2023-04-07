package serialization;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class TestEmployee {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee emp=new Employee(101,"sree",4000,"abc");
		FileOutputStream fos=new FileOutputStream("emp.dat");
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		oos.writeObject(emp);
	
	}

}
