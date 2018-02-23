package P;

public class A {
    private String aName;
    private B bObj;

    public A() {
        setName("aName");
        bObj = new B();
        bObj.setAObj(this);
    }

    public String getName() {
        return aName;
    }

    public void setName(String aName) {
        this.aName = aName;
    }

    public String getBName() {
        return bObj.getName();
    }

    public B getBObj() {
        return bObj;
    }
}
