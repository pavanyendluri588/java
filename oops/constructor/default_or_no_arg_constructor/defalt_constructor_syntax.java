class Defalt_constructor_syntax
    {
      public static void main(String[] args)
         {
             Student s1 = new Student();
             Student s2 = new Student();
             s1.display();
             s2.display();

         }
    }

//creating the new class
class Student
   {
     int id;
     String name;
    
    //creating the default constructor or no-arg_constructor syntax
    /*
       class_name ()
        {

        }
    */
     
    Student ()
      {
       id=10; //initalization through the constructor
       name="pavan"; //initalization through the constructor
      }
    void display()
       {
          System.out.println(id + "  " + name);
       }
   }