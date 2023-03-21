package com.Example.demo1;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class SerialzeTest {

	public static void main(String[] args) throws Exception {
		
//		Employee e = new Employee();
//		e.id=101;
//		e.name="Ashwini";
//		e.address="Ghtanji";
//		
//		
//		FileOutputStream fos = new FileOutputStream("ashwinimuneshwar.ser");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(e);
		
		
		Class c = Employee.class;
	Constructor[] con = c.getDeclaredConstructors();
		for (Constructor const1 : con) {
			System.out.println(const1.getName());
		}

	}

}


//ka g br nahi n bore hote ka hello hello hello bol tari g off  kay zal ahen
//ka br ekdam aawaj kami zal goli ghen agli hoti madhat aata tu youtube chalu kel tr jaag aali

//mala file dakhychi hoti banli file aapli dakhav n sirani refesh kel hot mi nahi kel manun nahi aali mla call vr samjhun sanshil process
//ho aata ek kaam kr he file ghe ani desrealize kr mi sangto tase mi fresh houn yevu ka ye tula br nhi samhte mla020min mddh3 yeto ha disconnect krto ha bye tc ha

