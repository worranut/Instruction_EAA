package P;

public class B implements I {
    private A aObj;

    public B() {
        aObj = new A();
    }

    @Override
    public void initialA() {
        aObj.setId(1);
        aObj.setName("aName");
    }

    @Override
    public String displayAName() {
        return String.valueOf(aObj.getId()).concat(" ").concat(aObj.getName());
    }
}
