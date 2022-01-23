class By_reference_variable 
   {
        public static void main(String args[])
           {  
        Student s1=new Student();  
        s1.id=101;  
        s1.name="Sonoo";  
        System.out.println(s1.id+" "+s1.name);//printing members with a white space  
           }  
   }
public class Student 
   {
      int id;
      String name;

   }