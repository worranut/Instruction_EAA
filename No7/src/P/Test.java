package P;

public class Test {

    public static void main(String[] args) {
        A aObj = new A();
        C cObj = new C(aObj);
        System.out.println("[Call By C] B name is " + cObj.displayBName());
        cObj.changeBName("newBName");
        System.out.println("[Call By A] B name is " + aObj.displayBName());
    }
}
