package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("인천광역시");

        MemberV1 memA = new MemberV1("추신수", address);
        MemberV1 memB = new MemberV1("최정", address);
        
        //memA, memB 처음 주소는 모두 인천
        System.out.println("memA = " + memA);
        System.out.println("memB = " + memB);
        
        //memA의 주소만 부산으로 변경, B만 부산으로 바꾸려했는데 A도 바뀜
        memA.getAddress().setVal("부산");
        System.out.println("부산 -> memB.address");
        System.out.println("memA = " + memA);
        System.out.println("memB = " + memB);
    }
}
