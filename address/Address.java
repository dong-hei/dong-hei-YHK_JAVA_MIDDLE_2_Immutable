package lang.immutable.address;

public class Address {

    private String val;

    public Address(String val) {
        this.val = val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    @Override
    public String toString() {
        return "Address{" +
                "val='" + val + '\'' +
                '}';
    }
}
