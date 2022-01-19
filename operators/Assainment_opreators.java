class Assainment_opreators
    {
        public static void main(String[] args)
           {
                byte a=10,b;
                b=a;
                System.out.println("b value =:" + b);
                b+=a;
                System.out.println("b value +=:" + b);
                b-=a;
                System.out.println("b value -=:" + b);
                b/=a;
                System.out.println("b value /=:" + b);
                b%=a;
                System.out.println("b value %=:" + b);
                a=8;
                b=4;
                b^=a;
                System.out.println("b value ^=:" + b);
                a=8;
                b=4;
                b|=a;
                System.out.println("b value |=:" + b);
                a=8;
                b=4;
                b<<=a;
                System.out.println("b value <<=:" + b);
                a=8;
                b=3;
                b>>=a;
                System.out.println("b value >>=:" + b);
                a=8;
                b=4;
                b>>>=a;
                System.out.println("b value >>>=:" + b);

           }
    }