public class Square {
    int a;
    int b;
    int c;
    public void area(int a, int b,int c){
        float  p=(a+b+c)/2f;
        System.out.printf("( %d + %d + %d ) /2 = %.2f", a, b, c, p);
        double  s=(p*(p-a)*(p - b) * (p - c ));
        System.out.println();
        System.out.println( Math.sqrt(s) );
    }

}
