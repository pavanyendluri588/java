class By_using_multiple_reference_variable 
   {
        public static void main(String args[])
           {  
        //object1 of the student class
        Student s1=new Student();  
        s1.id=000000;  
        s1.name="rama"; 
 
        //object2 of the student class
        Student s2=new Student();  
        s2.id=111111111;  
        s2.name="pavan";  
        
        //object3 of the student class
        Student s3=new Student();  
        s3.id=222222;  
        s3.name="prudhvi";  
         System.out.println(s1.id+" "+s1.name);//printing members with a white space  
         System.out.println(s2.id+" "+s2.name);//printing members with a white space  
        System.out.println(s3.id+" "+s3.name);//printing members with a white space  
           }  
   }
public class Student 
   {
      int id;
      String name;

   }