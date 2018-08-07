package com.marshal.unmarshal.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class UnMarshalXmlObject {

	public static void main(String[] args) {
		try{
		    //getting the xml file to read
		    File file = new File("D:\\Harshit\\Harshit_WorkSpace\\filesCreated\\student.xml");
		    //creating the JAXB context
		    JAXBContext jContext = JAXBContext.newInstance(Student.class);
		    //creating the unmarshall object
		    Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
		    //calling the unmarshall method
		    Student student=(Student) unmarshallerObj.unmarshal(file);
		    System.out.println(student.getName()+" "+student.getId()+" "+student.getSubject());
		}catch(Exception e){
		    e.printStackTrace();
		}

	}

}
