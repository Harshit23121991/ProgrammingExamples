package com.designpatterns.creational.SingleTon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingleTonSerializedTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SerializedSingleTon instanceOne = SerializedSingleTon.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("FileName.ser"));
		out.writeObject(instanceOne);
		out.close();
		
		ObjectInput in = new ObjectInputStream(new FileInputStream("FileName.ser"));
		SerializedSingleTon instanceTwo = (SerializedSingleTon) in.readObject();
		in.close();
		System.out.println("instanceOne hashCode : "+instanceOne.hashCode());
		System.out.println("instanceTwo hashCode : "+instanceTwo.hashCode());
	}

}
