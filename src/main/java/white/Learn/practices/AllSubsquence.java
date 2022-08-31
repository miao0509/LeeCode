package white.Learn.practices;

public class AllSubsquence {
    String str = "abc";
    public static void printAllSubsquence(String str){
        char[] a = str.toCharArray();
        process(a,0);
    }
    public static void process(char[] a, int i ){
        if (i==a.length) {
            System.out.println(String.valueOf(a));
            return;
        }
        process(a,i+1);
        char temp = a[i];
        a[i]=0;
        process(a,i+1);
        a[i] =temp;
    }

    public static void main(String[] args) {
        printAllSubsquence("abc");
    }
}
