class Print_matrix_using_multidimensional_array
    {
        public static void main(String[] args)
           {
              //declareing and instantiate array
              int arry[][]=new int[4][4];
              byte x=0;
              //initialition of array
              for(int i=0;i<arry.length;i++)
                 {
                    for(int j=0;j<arry[i].length;j++)
                       {
                          x+=1;
                          arry[i][j]=x;
                       }
                 }
               //printing the array
             for(int i=0;i<arry.length;i++)
                 {
                    for(int j=0;j<arry[i].length;j++)
                       {
                          System.out.print(arry[i][j] +" ");
                       }
                    System.out.println(" ");
                 }
           }
    }