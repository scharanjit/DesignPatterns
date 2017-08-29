package org.factory.design.pattern;

public class FactoryMethod {

    public  OS getInstance(String str){

        if(str.equals("iOS")){
            return new iOS();
        }else if(str.equals("Linux")){
            return new Linux();
        }else{
            return new Windows();
        }

    }
}
