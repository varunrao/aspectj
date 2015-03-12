package myproject;

import java.math.BigDecimal;

 
public class HelloWorld {
 
    public void sayHello(String message) {
    	
    	BigDecimal bigDecimal = new BigDecimal(new Double(10.25));
    	bigDecimal.setScale(10);
        System.out.println(message + "Big Decimal : " + bigDecimal);
    }
    
    public void sayBye(String message) {
        System.out.println(message);
    }
}