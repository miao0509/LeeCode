package white.Learn.practices;

public class HanNuoTa {
    public  static void hanoi(int n){
        if (n>0){
            func(n,"左","中","右");
        }
    }
    public static void func(int n , String from,String to,String other){
        if (n ==1){
            System.out.println("把1从" + from + "到"+to);
        }else {
            func(n-1,from,other,to);
            System.out.println("把"+n+"从" + from + "到"+to);
            func(n-1,other,to,from);
        }
    }

    public static void main(String[] args) {
        hanoi(2);
    }
}
