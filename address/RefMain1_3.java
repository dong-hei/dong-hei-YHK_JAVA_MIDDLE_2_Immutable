package lang.immutable.address;

/**
 * A와 B가 서로 다른 참조를 하게끔 변경하면 되는데
 * 조금이라도 복잡해지면 참조 이슈로 인한 사이드 이펙트를 확인하기 어렵다.
 * 하지만 자바에선 여러 변수가 하나의 객체를 참조하는 공유 참조를 막을 방법이 없다
 */
public class RefMain1_3 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //같은 참조값을 복사했기때문에 a도 창원으로 변경된다.
        change(b, "창원"); //b의 값을 창원으로 변경
        System.out.println("부산 -> b");
        System.out.println("a = " + a); // 사이드 이펙트! (a값은 안바꿀껀데 왜 a 값도 바뀌었나)
        System.out.println("b = " + b);
    }

    private static void change(Address address, String changeAddress){
        System.out.println("주소 값 변경 =>" + changeAddress);
        address.setVal(changeAddress);
    }
}
