package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {

        //char
        char charA = 'A';
        char charB = 'B';
        // 모든 문자가 고유의 숫자값을 갖고 있다
        System.out.println(charA + " = " + (int)charA);
        System.out.println(charB + " = " + (int)charB);

        int hashCode = hasCode("A");
        int hashCode1 = hasCode("B");

        System.out.println("hashCode = " + hashCode);
        System.out.println("hashCode(B) = " + hashCode1);

        // hashIndex
        System.out.println("hashIndex(A) = " + hashIndex(hasCode("A")));
        System.out.println("hashIndex(B)= " + hashIndex(hasCode("B")));
        System.out.println("hashIndex(C) = " + hashIndex(hasCode("C")));
        System.out.println("hashIndex(AB) = " + hashIndex(hasCode("AB")));


    }

    // 문자를 hashCode 로 변경
    static int hasCode(String str){
        char [] chars = str.toCharArray();
        int sum = 0;
        for (char aChar : chars) {
            sum += (int) aChar;
        }
        return sum;

    }

    static int hashIndex(int value){
        return value % CAPACITY;
    }
}
