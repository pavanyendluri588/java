class variable
     {
            public static void main(String[] args)
                  {
                         int a=10;//ineger datatype
                         System.out.println("a:" + a);//accessing the variable
                           

                         //createing the constant or final variable 
                         //constant variable means once the variable is declared means the value connot ber changed
                         int a1=10; //normal int datatype variable
                         System.out.println("before change a1:" + a1);
                         a1=50;
                         System.out.println("after change a1:" + a1);

                         //using the final keyword to create constant variable
                         final int A1=10; //constant int datatype variable
                         System.out.println("before change A1:" + A1);
                         //A1=50;
                         System.out.println("after change A1:" + A1);
                         /*
                          PS D:\sem_2_2\CSE310_PROGRAMMING_IN_JAVA\java_prathice\variables> JAVA .\variable.java
                         .\variable.java:19: error: cannot assign a value to final variable A1
                         A1=50;
                         ^
                          1 error
                          error: compilation failed
                         */

                         /*
                         //using the constant keyword to create constant variable
                         constant int B1=10; //constant int datatype variable
                         System.out.println("before change B1:" + B1);
                         B1=50;
                         System.out.println("after change B1:" + B1);
                         */
                         
                   

                  }

     }