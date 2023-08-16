public class Demo4 {
    public static void main(String[] args) {
        
       

        int yr = 2023;
        int mnth = 12;
        int dy = 28;
        int hh = 23;
        int mm = 59;
        int ss = 59;

        System.out.printf(
                "\033[31m%d\033[0m/\033[32m%d\033[0m/\033[34m%d\033[0m    \033[36m%d\033[0m:\033[35m%d\033[0m:\033[33m%d\033[0m",
                mnth, dy, yr, hh, mm, ss);

        System.out.println("\n\n");
    }
}
