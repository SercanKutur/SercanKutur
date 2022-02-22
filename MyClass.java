public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int sayi1 = sc.nextInt();
      int sayi2 = sc.nextInt();
      int sayi3 = sc.nextInt();
        MyClass r = new MyClass();
        r.findRoots(sayi1, sayi2, sayi3);
    }
    void findRoots(int a,int b, int c)
    {
        double root1= (-b-Math.sqrt((b*b-4*a*c))) /2*a;   
        double root2= (-b+Math.sqrt((b*b-4*a*c))) /2*a;   
        System.out.println("Roots of equation: "+root1 + "  " + root2);
        
    }
}