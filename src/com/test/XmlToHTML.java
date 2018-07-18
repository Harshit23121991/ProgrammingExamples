package com.test;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.URIResolver;
import javax.xml.transform.stream.StreamSource;

public class XmlToHTML {
public static void main(String[] args) {
  try {
	  byte[] bFile = Files.readAllBytes(Paths.get("test.xml"));
	//  ByteArrayInputStream bis = new ByteArrayInputStream(bFile);
	  InputStream myInputStream = new ByteArrayInputStream(bFile);
	  
	  
	  TransformerFactory tFactory = TransformerFactory.newInstance();
	  URIResolver oldUriResolver = tFactory.getURIResolver();
	  tFactory.setURIResolver(oldUriResolver);
	  Transformer t= tFactory.newTransformer(new StreamSource(myInputStream));
	  
	  
	  t.transform(new javax.xml.transform.stream.StreamSource("test.xml"), new javax.xml.transform.stream.StreamResult( new FileOutputStream("a1cd.html")));
	  
	  
	  
  /*  TransformerFactory tFactory = TransformerFactory.newInstance();

    Transformer transformer = tFactory.newTransformer(new javax.xml.transform.stream.StreamSource(myInputStream));

    transformer.transform(new javax.xml.transform.stream.StreamSource("test.xml"),       new javax.xml.transform.stream.StreamResult
            ( new FileOutputStream("abcd.html")));*/
    }
  catch (Exception e) {
    e.printStackTrace( );
    }
  }

}