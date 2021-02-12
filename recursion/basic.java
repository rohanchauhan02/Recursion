import java.util.ArrayList;
public class basic{
    public static void main(String []args){
        solve();
    }
    public static void solve(){
        // set1();
        set2();
    }
    public static void printIncreasing(int a,int b){
        if(b==a) return;
        printIncreasing(a,b-1);
        System.out.println(b);
    }
    public static void printDecreasing(int a,int b){
        if(b==a) return;
        System.out.println(b);
        printDecreasing(a,b-1);
    }
    public static void printOddEven(int a,int b){
        if(a==b+1) return;
        if(a%2!=0) System.out.println(a);
        printOddEven(a+1, b);
        if(a%2==0) System.out.println(a);
    }
    public static int factorial(int a){
        if(a==1) return 1;
        return a*factorial(a-1);
    }
    public static int power(int a,int n){
        if(n==0) return 1;
        return a*power(a,n-1);
    }
    public static int powerBtr(int a,int n){
        if(n==0) return 1;
        int val=powerBtr(a,n/2)*powerBtr(a, n/2);
        if(n%2==0) return val;
        else return a*val;
    }
    public static void displayArray(int arr[],int idx){
        if(idx==arr.length) return;
        System.out.print(arr[idx]+" ");
        displayArray(arr,idx+1);
    }
    public static int maximum(int arr[],int idx){
        if(idx==arr.length) return Integer.MIN_VALUE;
        return Math.max(arr[idx],maximum(arr,idx+1));
    }
    public static boolean find(int []arr,int idx,int data){
        if(idx==arr.length) return false;
        if(arr[idx]==data) return true;
        return find(arr,idx+1,data);
    }
    public static int firstIdx(int []arr,int idx,int data){
        if(idx==arr.length) return -1;
        if(arr[idx]==data) return idx;
        return firstIdx(arr, idx+1, data);
    }
    public static int lastIdx(int []arr,int idx,int data){
        if(idx==arr.length) return -1;
        int val=lastIdx(arr, idx+1, data);
        if(val!=-1) return val;
        return arr[idx]==data?idx:-1;
        
    }
    public static int []allIndex(int []arr,int idx,int data,int count){
        if(idx==arr.length){
            int []base=new int[count];
            return base;
        }
        if(arr[idx]==data) count++;
        int []smallAns=allIndex(arr, idx+1, data, count);
        if(arr[idx]==data)  smallAns[count-1]=idx;
        return smallAns;
    }
    // ** revision 
    public static ArrayList<String> subsequence(String str, int idx){
        if(idx==str.length()){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        char ch=str.charAt(idx);
        ArrayList<String>ans=subsequence(str, idx+1);
        ArrayList<String>myans=new ArrayList<>();
        for(String s:ans){
            myans.add(s+ch);
            myans.add(s);
        }
        return myans;
    }
    public static void subsequence(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        String rstr=str.substring(1);
        subsequence(rstr,ans+ch);
        subsequence(rstr,ans);
    }
    static String[] words={":;/", "abc", "def", "ghi", "jkl", "mno",
    "pqrs", "tuv", "wxyz", "&*%", "#@$"};

    public static ArrayList<String> nokiaKeyPad(String str,int idx){
        if(idx==str.length()){
            ArrayList<String>base=new ArrayList<>();
            base.add("");
            return base;
        }
        int chi=str.charAt(idx)-'0';
        String word=words[chi];
        ArrayList<String>ans=nokiaKeyPad(str, idx+1);
        ArrayList<String>myAns=new ArrayList<>();
        for(String s:ans){
            for(int i=0;i<word.length();i++){
                myAns.add(word.charAt(i)+s);
            }
        }
        return myAns;
    }
    public static void nokiaKeyPad(String str,int idx,String ans){
        if(idx==str.length()){
            System.out.print(ans+" ");
            return;
        }
        int chi=str.charAt(idx)-'0';
        String word=words[chi];
        for(int i=0;i<word.length();i++){
            nokiaKeyPad(str,idx+1,ans+word.charAt(i));
        }
        if(idx < str.length() - 1){
            int chi1 = chi * 10 + (str.charAt(idx + 1)-'0');
            if(chi1 >=10 && chi1<=11){
                word = words[chi1];
                for(int i = 0;i<word.length();i++){
                    nokiaKeyPad(str,idx+2,ans+word.charAt(i));
                }
            }
        }
    }
    public static void set2(){
        // System.out.println(subsequence("abc",0));
        // subsequence("abc", "");
        System.out.println(nokiaKeyPad("123",0));
        System.out.println();
        nokiaKeyPad("123",0,"");
        System.out.println();

    }
    public static void set1(){
        printIncreasing(0, 10);
        printDecreasing(0,10);
        printOddEven(1,10);
        System.out.println(factorial(5));
        System.out.println(powerBtr(2,10));
        int []arr={4,2,5,9,2,2,5,6,7,1,0,12,3,8,4,10,2};
        displayArray(arr,0);
        System.out.println();
        System.out.println(maximum(arr,0));
        System.out.println(find(arr,0,45));
        System.out.println(firstIdx(arr,0,2));
        System.out.println(lastIdx(arr,0,4));
        int []ans=allIndex(arr,0,2,0);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
}