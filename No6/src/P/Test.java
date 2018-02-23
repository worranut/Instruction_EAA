package P;

public class Test {

    public static void main(String[] args) {
        A aObj = new A();
        aObj.setId(1);
        aObj.setName("aName");

        B bObj = new B(aObj);
        System.out.println("A details is " + bObj.displayListADetails());
    }
}
