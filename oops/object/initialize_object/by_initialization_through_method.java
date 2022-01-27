class By_initialization_through_method
   {
        public static void main(String args[])
           {  
        //object1 of the student class
        Student s1=new Student();  
           //inserting the data through  
        s1.insert_data(111111,"rama"); 
 
 
        //object2 of the student class
        Student s2=new Student();
        s2.insert_data(22222,"prudhvi"); 
          
        
        //object3 of the student class
        Student s3=new Student();  
        s3.insert_data(333333,"pavan");
  
         System.out.println(s1.id+" "+s1.name);//printing members with a white space  
         System.out.println(s2.id+" "+s2.name);//printing members with a white space  
        System.out.println(s3.id+" "+s3.name);//printing members with a white space  




        //objects of the student_1 class
        //object1 of the student_1 class
        Student_1 obj1 = new Student_1();
        obj1.insert_data(11111111,"student_1 obj1");
        obj1.display_data();

        //object2 of the student_1 class
        Student_1 obj2 = new Student_1();
        obj2.insert_data(12121212,"student_1 obj2");
        obj2.display_data();

        //object3 of the student_1 class
        Student_1 obj3 = new Student_1();
        obj3.insert_data(13131313,"student_1 obj3");
        obj3.display_data();
           }  
   }
public class Student 
   {
      int id;
      String name;
      void insert_data(int i,String n)
        {
          id=i;
          name =n;
        }

   }
class Student_1
   {
     int id;
     String name;
     void insert_data(int i,String n)
       {
          id=i;
          name=n;
       }
     void display_data()
       {
           System.out.println(id + " " + name);
       }
   }