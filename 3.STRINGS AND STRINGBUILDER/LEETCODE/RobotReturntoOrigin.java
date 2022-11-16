public class RobotReturntoOrigin {
    public static void main(String[] args) {
        System.out.println(judgeCircle("LRUD"));
    }
    static boolean judgeCircle(String moves) {
        int[] start={0,0};
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i) == 'U'){
                start[0]=start[0]+1;
            }else if(moves.charAt(i) == 'D'){
                start[0]=start[0]-1;
            }else if(moves.charAt(i) == 'L'){
                start[1]=start[1]-1;
            }else{
                start[1]=start[1]+1;
            }
        }
        return start[0]== 0 && start[1]==0;
    }
}
