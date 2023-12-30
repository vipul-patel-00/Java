package practice;

enum Result {
    PASS, FAIL, ABSENT;
}

public class EnumsEx1 {
    enum Gender {
        MALE, FEMALE, OTHER;
    }

    public static void main(String[] args) {
        Gender g = Gender.MALE;
        System.out.println(g);
        System.out.println(g.getClass());
        Result r = Result.PASS;
        System.out.println(r.getClass());

    }
}
