class Returning_array_from_method
     {
        public int[] return_array()
        {
           int att1 = new int[5];
           att1[0]=1;
           att1[1]=2;
           att1[2]=3;
           att1[3]=4;
           att1[4]=5;
           return att1;
  
        }
        public static void main(String args[])
         {
            int atrr1 =new  int[5];
            Returning_array_from_method a = new Returning_array_from_method();
            atrr1=a.return_array();
            for (int i:a.return_array()){
             System.out.print(i);
            }
         }
     }   