
class Multilevel_inheritance_example1
   {
      public static void main(String[] args) {
               C obj_c = new C();
               System.out.println("this is C class object");
               obj_c.display();
               System.out.println("===========================================");


               B obj_b = new B();
               System.out.println("this is B class object");
               obj_b.display();
               System.out.println("===========================================");

               A obj_a = new A();
               System.out.println("this is A class object");
               obj_a.display();
               System.out.println("===========================================");

          }
   }

class  A
    {
         int i=20;
         void display()
             {
                  System.out.println("this is class A");
             }
    }
class B extends A
    {
       int i=30;
       void display()
           {
                  System.out.println("this is class B");
           }
    }
class C extends B
     {
            
     }
