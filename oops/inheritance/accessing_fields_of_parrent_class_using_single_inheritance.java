class Accessing_fields_of_parrent_class_using_single_inheritance
    {
        public static void main(String[] args)
            {
                B obj_b = new B();
                obj_b.display();
  
                //accessing the i fiels of A class using object obj_b
                System.out.println("the valuse of i on B class : " + obj_b.i);
            
            
                A obj_a = new A();
                obj_a.display();
  
                //accessing the i fiels of A class using object obj_a
                System.out.println("the valuse of i on A class : " + obj_a.i);
            } 
    }
class A
  {
      int i=10;
      void display()
        {
           System.out.println("display method in class A  and value of i is :" + i);
        }
  }
class B extends A
  {
      
      void display()
        {
           System.out.println("display method in class B  and value of i is :" + i);
        }
  }