
package debugng;
import java.math.*;

public class Testcode2 {
	int a;
	int b;
	int x;
	static int a1[]= {2,5,7,8,5};
	static int b1[]= {23,43,27,32,12};
	static int x1[]= {18,19,20,21,22};
	static int eqn(int a,int b,int x) {
		int temp;
		int temp2;
		int temp3;
		temp=(int)(a*Math.pow(x, 2));
		temp2=(int)(b*Math.pow(x, 2));
		temp3=2*a*b;
		int esum=(temp+temp2+temp3);
		return esum;
		//357863
	}
		
		
		
	public static void main(String[] args) {
		int s;
		for(int i=0;i<5;i++) {
			s=eqn(a1[i],b1[i],x1[i]);
			System.out.println(s);
		}
	

	}

}




