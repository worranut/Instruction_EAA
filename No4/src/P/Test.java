package P;

public class Test {

    public static void main(String[] args) {
        A aObj = new A();
        B bObj = aObj.getBObj();

        System.out.println("B is " + aObj.getBName());
        System.out.println("A is " + bObj.getAName());
    }
}
