package com.test;

public class CustomSingleTonClass {
 
    private static CustomSingleTonClass myObj;
     
    static{
        myObj = new CustomSingleTonClass();
    }
     
    private CustomSingleTonClass(){
     
    }
     
    public static CustomSingleTonClass getInstance(){
        return myObj;
    }
     
    public void testMe(){
        System.out.println("Hey.... it is working!!!");
    }
     
    public static void main(String a[]){
        CustomSingleTonClass ms = getInstance();
        ms.testMe();
    }
}
