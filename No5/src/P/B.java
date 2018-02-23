package P;

public class B {
    private A aObj;

    public B() {
        aObj = new A();
        aObj.setId(1);
        aObj.setName("aName");
    }

    public String displayListADetails() {
        return String.valueOf(aObj.getId()).concat(" ").concat(aObj.getName());
    }
}
