import java.math.BigInteger;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(solution("11", "1"));
        System.out.println(solution("1010", "1011"));
        System.out.println(solution("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }

    public static String solution(String a, String b) {
        BigInteger c=new BigInteger(a,2);
        BigInteger d=new BigInteger(b,2);
        BigInteger p=c.add(d);
        String o = p.toString(2);
        return o;
    }
}
