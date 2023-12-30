package practice;

// ek time pr ek hi program run hoga EnumsEx1.java me bhi Result enum h iss liye kisi eak ko comment kr ke hi dusra chalega.

enum Result {
    PASS, FAIL, ABSENT, SPECIAL;

    int marks;

    Result() {
        System.out.println("Constructor is getting called");

    }

    void setMarks(int marks) {
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }
}

public class EnumsEx2 {
    public static void main(String[] args) {
        Result r = Result.PASS;
        r.setMarks(20);
        System.out.println(r.getMarks());

    }
}
