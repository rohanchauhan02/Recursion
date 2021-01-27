public class demo {
    public static void main(String[]args){
        solution(12);
    }
    public static void solution(int n){
        System.out.println(answer(n,0));
    }
    public static int answer(int n,int psf ){
        if(psf==n) return 1;
        int count=0;
        for(int i=1;i<=3;i++){
            if(psf+i<=n){
                count+=answer(n,psf+i);
            }
        }
        return count;
    }
}
