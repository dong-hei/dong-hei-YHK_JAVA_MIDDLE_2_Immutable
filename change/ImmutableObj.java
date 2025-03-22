package lang.immutable.change;

public class ImmutableObj {

    private final int val;

    public ImmutableObj(int val) {
        this.val = val;
    }

    public ImmutableObj add(int addVal) {
        int result = val + addVal;
        return new ImmutableObj(result);
        // 계산 결과를 바탕으로 새로운 객체를 만들어 값을 반환
    }

    public int getVal() {
        return val;
    }

}
