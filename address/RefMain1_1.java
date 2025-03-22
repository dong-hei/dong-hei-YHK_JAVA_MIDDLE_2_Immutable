package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //같은 참조값을 복사했기때문에 a도 부산으로 변경된다.
        b.setVal("부산"); //b의 값을 부산으로 변경
        System.out.println("부산 -> b");
        System.out.println("a = " + a); // 사이드 이펙트! (a값은 안바꿀껀데 왜 a 값도 바뀌었나)
        System.out.println("b = " + b);
    }
}
