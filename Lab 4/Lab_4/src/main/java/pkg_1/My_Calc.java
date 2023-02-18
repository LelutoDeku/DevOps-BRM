package pkg_1;

public class My_Calc {
    public int sum(int a, int b)
    {
        return a+b;
    }
    public int diff(int a, int b)	{
        return a-b;
    }
    public int mul(int a, int b)	{
        return a*b;
    }
    public int div(int a, int b)	{
        return a/b;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        My_Calc obj1=new My_Calc();
        System.out.println(obj1.sum(2, 3));
        System.out.println(obj1.diff(5 , 3));
        System.out.println(obj1.mul(5 , 3));
        System.out.println(obj1.div(5 , 3));
    }

}
