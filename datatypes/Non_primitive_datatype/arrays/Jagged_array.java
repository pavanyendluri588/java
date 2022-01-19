class Jagged_array
  {
      public static  void main(String[] args)
      {
          //creating array nwith onlu 3 rows abt no of columns for each row is not filxed id claaed jagged array.
          int arry[][]=new int[3][];
          //creating columns size
          arry[0]=new int[3];
          arry[1]=new int[5];
          arry[2]=new int[10];
          //assaining values to arry

          for(int i=0;i<(arry.length%2);i++)
          {
              for(int j=0;j<arry[i].length;j++)
              {
                  arry[i][j]=j+i;
              }
          }
          for(int i=(arry.length%2);i<arry.length;i++)
          {
              for(int j=0;j<(arry[i].length);j++)
              {
                  arry[i][j]=(i+j);
              }
          }
          for(int i=0;i<arry.length;i++)
          {
              for (int j = 0; j < arry[i].length; j++)
              {
                 System.out.print(arry[i][j] + " ");
              }
              System.out.println(" ");
          }
      }
  }