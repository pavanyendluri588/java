class Invoking_the_current_class_constructor
   {
       public static void main(String[] args)
          {
                Demo obj = new Demo(10);
                Demo1 obj1 = new Demo1();
                
          }
   }

class Demo 
  {
      /*
      this() constructor call can be used to invoke the current class constructor   
      to reuse the constructor
      or used for the constructor chaining

      the another constructor must be parametrized constructor
      we hve to kee different in while creating the constructor like parameter
       
       Rule: Call to this() must be the first statement in constructor.

      */


      Demo (){
        
        System .out.println("this is the constructor of demo class without this keyword");
      }
      Demo(int x){
          this();
          System .out.println("this is the constructor of demo class with  this keyword");
          System.out.println("X:" + x);
      }
  }
class Demo1
   {
       Demo1() 
       {
           this(500);
           System.out.println("first constructor");
       }
       Demo1(int x)
       {
                    System .out.println("x:" + x);
       }
   }