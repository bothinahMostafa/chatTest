/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
<<<<<<< HEAD
 * @author TOSHIBA
 */
public class Class1 {
   
    //start of bothinah
         public void sayHello(){
            System.err.println("hello bothinah");
        }
         public void bothinah(){
             System.out.println("singleton.Class1.bothinah()");
         }
    //end of bothinah
    
    //start of mohamed
    
    
    private void mohamedali()
    {
        String s = "mohamed";
        System.out.println("hello"+s);
        s = "ali";
        System.out.println("hello"+s);
    }
    
    private void testNewFunction()
    {
        System.out.println("ay kalam");
    }
    
    public static void main(String[] args)
    {
        Class1 c = new Class1();
        c.mohamedali();
        c.testNewFunction();
    }
    
    
    //end of mohamed
    

    

}
