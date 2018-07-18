package com.test;

import java.io.FileOutputStream;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;

public class HowToXSLT {
public static void main(String[] args) {
  try {

    TransformerFactory tFactory = TransformerFactory.newInstance();

    Transformer transformer = tFactory.newTransformer(new javax.xml.transform.stream.StreamSource("contract.xsl"));

    transformer.transform(new javax.xml.transform.stream.StreamSource("Test1.xml"),       new javax.xml.transform.stream.StreamResult
            ( new FileOutputStream("index1111.html")));
    }
  catch (Exception e) {
    e.printStackTrace( );
    }
  }
}