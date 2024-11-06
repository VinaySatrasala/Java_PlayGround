public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters={'e','e','e','e','e','e','n','n','n','n'};
        char c=nextGreatestLetter(letters, 'e');
        System.out.println((c));
    }
    static char nextGreatestLetter(char[] letters, char target) {
        
        int s=0;
        int e=letters.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if (target>=letters[m]){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return letters[s % letters.length];
    }
}
