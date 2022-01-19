class Basic_multidimensional_array
    {
        public static void main(String[] args)
           {
               /*
                  //declareing a miltidimensional array
                  data_type  array_ref_var[][];  or
                  data_type[][]  array_ref_var;  or
                  data_type  [][]array_ref_var;  or
                  data_type  []array_ref_var[];'

               */
               int arry1[][];  //method1
               int [][]arry2; //method2
               int[][] arry3; //method3
               //int []arry4[]; //method4

               /*
                   //instantiate multidimensional arrays
                    
                    
                          or
                    //declaring and instantiate multidimensional array
                    int []arry4[]=new int[3][3];
             */
                    arry1=new int[3][10];
                    arry2=new int[3][3];
                    arry3=new int[3][3];
    
             /*
                  //initialize array usinf for loop
                  System.out.println(arry1.length);
             */
                 arry1[0][0]=1;  
		 arry1[0][1]=2;  
		 arry1[0][2]=3;  
		 arry1[1][0]=4;  
		 arry1[1][1]=5;  
		 arry1[1][2]=6;  
		 arry1[2][0]=7;  
		 arry1[2][1]=8;  
		 arry1[2][2]=9; 
                //getting the kength of the 2d array
                 System.out.println(arry1.length);//x axis length
                 System.out.println(arry1[0].length);//y axis length
           }
    }

