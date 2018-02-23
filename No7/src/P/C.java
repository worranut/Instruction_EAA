package P;

public class C {
    private B bObj;

    public C(A aObj) {
        bObj = aObj.getBObj();
    }

    public String displayBName() {
        return bObj.getName();
    }

    public void changeBName(String name) {
        bObj.setName(name);
    }
}
