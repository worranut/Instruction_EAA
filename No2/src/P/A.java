package P;

public class A {
    private B bObj;

    public A() {
        bObj = new B();
        bObj.setName("bName");
    }

    public String getBObjName(){
        return bObj.getName();
    }
}
