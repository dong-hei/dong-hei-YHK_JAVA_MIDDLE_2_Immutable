package lang.immutable.address;
/**
 * 불변 객체 - 객체의 값이 변하지 않는 객체
 * 생성자를 통해서만 값을 설정할 수 있고 이후 값을 변경하는 것은 불가능
 * setter 제거
 */
public class ImmutableAddress {

    //Setter가 생성되는 것을 미연에 방지
    private final String val;

    public ImmutableAddress(String val) {
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
