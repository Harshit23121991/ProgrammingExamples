package com.marshal.unmarshal.xml;

import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class MarshallXmlObj {

	public static void main(String[] args) {
		try{
		    //creating the JAXB context
		    JAXBContext jContext = JAXBContext.newInstance(Student.class);
		    //creating the marshaller object
		    Marshaller marshallObj = jContext.createMarshaller();
		    //setting the property to show xml format output
		    marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    //setting the values in POJO class
		    Student student = new Student("abhishek", 1163, "hadoop");
		    //calling the marshall method
		    marshallObj.marshal(student, new FileOutputStream("D:\\Harshit\\Harshit_WorkSpace\\filesCreated\\student.xml"));
		} catch(Exception e) {
		    e.printStackTrace();
		}

	}

}
