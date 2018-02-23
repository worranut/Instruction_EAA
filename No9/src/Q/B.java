package Q;

import P.X;

public class B {
    private X xObj;

    public B() {
        xObj = new X();
        xObj.setName("xName");
        xObj.setTotal(10);
    }

    public String displayXDetails() {
        return "Name is ".concat(xObj.getName()).concat(", Total is ").concat(String.valueOf(xObj.getProtectedTotal()));
    }
}
