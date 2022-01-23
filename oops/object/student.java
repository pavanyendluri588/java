class Student
    {
       int id;//instance variable
       String name;//instance variable

       public static void main(String[] args)
          {
             
           //creating the "obj" object for Bacic_object_creation
           Student obj = new Student();
           System.out.println("Before declareing obj.id = " + obj.id);
           System.out.println("Before declareing obj.name = " + obj.name);
           
           //declareing tyhe instance variables
           obj.id=5432;
           obj.name="pavan ram chandar";

           System.out.println("After declareing obj.id = " + obj.id);
           System.out.println("After declareing obj.name = " + obj.name);
          }
    }