public class ReconstructOriginalDigitsfromEnglish {
    public static void main(String[] args) {
        // System.out.println("z"*4);
    }
    static String originalDigits(String s) {
        int[] freq=new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch-'a']++;
        }
        int[] digits=new int[10];

        digits[0] = freq['z' - 'a'];
        digits[2] = freq['w' - 'a'];
        digits[4] = freq['u' - 'a'];
        digits[6] = freq['x' - 'a'];
        digits[8] = freq['g' - 'a'];

        digits[1] = freq['o' - 'a'] - freq['w' - 'a'] - freq['u' - 'a'] - freq['z' - 'a'];
        digits[3] = freq['t' - 'a'] - freq['w' - 'a'] - freq['g' - 'a'];
        digits[5] = freq['f' - 'a'] - freq['u' - 'a'];
        digits[7] = freq['s' - 'a'] - freq['x' - 'a'];
        digits[9] = freq['i' - 'a'] - freq['g' - 'a'] - freq['x' - 'a'] - digits[5];

        StringBuilder tr=new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            String str=(i+"").repeat(digits[i]);
            tr.append(str);
        }

        return tr.toString();
    }
}
