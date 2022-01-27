class Default_constructor_with_no_arruments  
     {
        

       public static void main(String[] args)
          {
              Student s1 = new Student();
              s1.display(); 
             //the student class doesn't hace any constructor so the compiler provides or creates the default constructor for class Student  
             //this will retuen 0  null  .these values are assigined by the  default constructoe according to the data_type
          }
     }

class Student
    {
      int id;
      String name;
     void display()
        {
           System.out.println(id +" "+ name);
        }
    }