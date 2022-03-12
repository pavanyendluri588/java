class Without_this_keyword
  {
      public static void main(String[] args)
        {
            demo obj = new demo("pavan",19);
            obj.display();
        } 

  }
class demo
    {
        String name;
        int age;

        demo (String n,int a)
           {
                /**
                 here we will not use this this keyword because the instance variables and constructor keywords are not same 
                  */
                  name = n;
                  age = a;
           }
    
        void display(){
            System.out.println("Name :" + name + " \nage :" + age);
        }

    }