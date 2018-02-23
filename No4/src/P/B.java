package P;

public class B {
    private String bName;

    private A aObj;

    public B() {
        setName("bName");
    }

    public String getName() {
        return bName;
    }

    public void setName(String name) {
        this.bName = name;
    }

    public String getAName() {
        return aObj.getName();
    }

    public void setAObj(A a) {
        aObj = a;
    }
}
