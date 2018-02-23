package P;

public class A {
    private B[] bObj;

    public A() {
        bObj = new B[2];
        bObj[0] = new B();
        bObj[0].setName("bName1");

        bObj[1] = new B();
        bObj[1].setName("bName2");
    }

    public String[] getBObjsName() {
        String[] names = new String[2];
        names[0] = bObj[0].getName();
        names[1] = bObj[1].getName();
        return names;
    }
}
