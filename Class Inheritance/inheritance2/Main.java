class A
{
protected
    String a;
public
    String getA()
    {
        return a;
    }
}
class B extends A
{
protected
    String b;

public
    String getB()
    {
        return b;
    }
}

class C extends B
{
protected
    String c;
 
public
    String getC()
    {
        return c;
    }
}
 
class D extends C
{
private
        String d;
public
    String getD()
    {
        return d;
    }
    D(String aValue, String bValue,
      String cValue, String dValue) {
        a = aValue;
        b = bValue;
        c = cValue;
        d = dValue;
    }
}
public class Main {
    public static void main(String[] args) {
        D sampleObject = new D("AValue", "BValue", "CValue", "DValue");
        System.out.println(sampleObject.getA());
      System.out.println(sampleObject.getB());
        System.out.println(sampleObject.getC());
        System.out.println(sampleObject.getD());

    }

}