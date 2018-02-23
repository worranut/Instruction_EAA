package P;

public class X extends A {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotal(int val) {
        super.total = val;
    }

    public int getProtectedTotal() {
        return getTotal();
    }
}
