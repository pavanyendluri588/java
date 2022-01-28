

class Parametrized_constructor_example1
   {
      public static void main(String[] args) 
        {
          //passing the parameters while creating the objects
          Student obj1= new Student(1234,"pavan ram chandar");
          Student obj2= new Student(2345,"prudhvi ram chandar");
          obj1.display();
          obj2.display();
        }
   }

public class Student
   {
    int id;
    String name;
    
   //creating the parametrized constructor
   Student (int i,String n)
         {
              id=i;
              name =n;
         }   
     void display()
         {
            System.out.println(id +" " + name);
         }
   }

