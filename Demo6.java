public class Demo6 {
    public static void main(String[] args) {

        System.out.println("\n\n");
        
        int a = 5;
        int b = 0;
        char ch = '%';
        System.out.printf("\033[41m[    %d\033[0m\033[42m%d%c    ]\033[0m", a, b, ch);

        System.out.println("\n\n");

        final String COLOR1 = "\033[39;1m";
        final String COLOR2 = "\033[36;1m";
        final String COLOR3 = "\033[31;2m";
        final String RESET1 = "\033[30;0m";
        final String COLOR4 = "\033[32;2m";
        final String COLOR5 = "\033[33;2m";

        System.out.printf("%1$s+-----------------+-----+%2$s\n", COLOR5, RESET1);
        System.out.printf("| %1$sNAME%2$s\t\t  | %1$sAGE%2$s |\n", COLOR2, RESET1);
        System.out.printf("%1$s+-----------------+-----+%2$s\n", COLOR5, RESET1);
        System.out.printf("| Alice\t\t  | %1$s 24%2$s |\n", COLOR3, RESET1);
        System.out.printf("| Bob\t\t  | %1$s 30%2$s |\n", COLOR3, RESET1);
        System.out.printf("%1$s+-----------------+-----+%2$s\n\n", COLOR5, RESET1);

        System.out.printf("%s+-----------------+-------------+------------+%s\n", COLOR1, RESET1);
        System.out.printf("| %1$sNAME%2$s\t\t  | %1$sSTATE%2$s\t| POPULATION |\n", COLOR2, RESET1);
        System.out.printf("%s+-----------------+-------------+------------+%s\n", COLOR1, RESET1);
        System.out.printf("| Los Angeles\t  | California  |  %1$s3,966,936%2$s |\n", COLOR3, RESET1);
        System.out.printf("| %1$sNew%2$s York\t  | %1$sNew%2$s York    |  %3$s8,336,817%2$s |\n", COLOR4, RESET1,
                COLOR3);
        System.out.printf("%s+-----------------+-------------+------------+%s\n", COLOR1, RESET1);

        System.out.printf("%s+----------+----------+-------+%s\n", COLOR1, RESET1);
        System.out.printf("| ITEM\t   | QUANTITY | PRICE |\n", COLOR2, RESET1);
        System.out.printf("%s+----------+----------+-------+%s\n", COLOR1, RESET1);
        System.out.printf("| Apples   |        %1$s5%2$s | %3$s$%2$s%4$s0.99%2$s |\n", COLOR2, RESET1, COLOR4, COLOR3);
        System.out.printf("| Oranges  |       %1$s10%2$s | %3$s$%2$s%4$s1.49%2$s |\n", COLOR2, RESET1, COLOR4, COLOR3);
        System.out.printf("%s+----------+----------+-------+%s\n", COLOR1, RESET1);

        System.out.println("\n\n");


    }
}
