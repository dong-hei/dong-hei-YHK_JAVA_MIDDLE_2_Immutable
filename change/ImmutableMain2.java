package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj1= new ImmutableObj(10);
        obj1.add(20);

        //리턴값을 받아서 안썼으니까 10, 즉 불변 객체에서 변경된 객체는 반드시 반환값을 받아야 한다.
        System.out.println("obj1 = " + obj1.getVal());
    }
}
