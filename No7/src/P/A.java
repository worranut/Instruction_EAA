package P;

public class A {
    private B bObj;

    public A() {
        bObj = new B();
        bObj.setId(1);
        bObj.setName("bName");
    }

    public String displayBName() {
        return bObj.getName();
    }

    public B getBObj() {
        return bObj;
    }
}
