package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("인천광역시");

        MemberV2 memA = new MemberV2("추신수", address);
        MemberV2 memB = new MemberV2("최정", address);
        
        //memA, memB 처음 주소는 모두 인천
        System.out.println("memA = " + memA);
        System.out.println("memB = " + memB);
        
        //memA의 주소만 부산
//        memA.getAddress().setValue(); // 컴파일오류
        memA.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산 -> memB.address");
        System.out.println("memA = " + memA);
        System.out.println("memB = " + memB);
    }
}
