package white.meituan;

    import java.util.Scanner;

    public class really1 {
        public static void main(String[] args) {
            process();
        }
        public static void process(){
            Scanner sc = new Scanner((System.in));
            String text = sc.nextLine();
            char[] chars = text.toCharArray();
            int count = 0;
            for (char aChar : chars) {
                if (aChar ==' ') count++;
            }
            System.out.println(count);
        }
    }
