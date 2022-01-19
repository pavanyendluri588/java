class Single_dimensional_array
    {
        public static void main(String[] args)
           {
                /*
                    //syntax declareing the array
                    data_type[]  array_name;  (or)
                    data_type  []array_name;  (or)
                    data_type  array_name[];
                */
                int[]  a1;//declareing a array method1
                int  []a2;//declareing a array method2
                int  a3[];//declareing a array method3

                /*
                  //allocateing memory
                   array_name=new data_type[size];
                */
                 a1=new int[5];
                 a2=new int[5];
                 a3=new int[5];

                /*
                 //initilation of array 
                   array index starts from 0
                 array_name[index]=value;
                */
                a1[0]=11;
                a1[1]=12;
                a1[2]=13;
                a1[3]=14;
                a1[4]=15;
 
                System.out.println(a1[0]);
                System.out.println(a1[1]);
                System.out.println(a1[2]);
                System.out.println(a1[3]);
                System.out.println(a1[4]);

                System.out.println("=====================================================");

                a2[0]=21;
                a2[1]=22;
                a2[2]=23;
                a2[3]=24;
                a2[4]=25;
 
                System.out.println(a2[0]);
                System.out.println(a2[1]);
                System.out.println(a2[2]);
                System.out.println(a2[3]);
                System.out.println(a2[4]);
               
                System.out.println("=====================================================");              

                a3[0]=31;
                a3[1]=32;
                a3[2]=33;
                a3[3]=34;
                a3[4]=35;
 
                System.out.println(a3[0]);
                System.out.println(a3[1]);
                System.out.println(a3[2]);
                System.out.println(a3[3]);
                System.out.println(a3[4]);


           }
    }