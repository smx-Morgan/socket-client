import java.util.Random;
import java.util.Scanner;

public class Hellow {
    public static void main(String[] args) {
        pijiu(1000);
        game();
        int a = 10;
        int b = 20;
        /*
        *& 对应位置为1则全为1
        *0000 1010
        *0001 0101
        * | 对应位置有一个为1就为1
        * */
        System.out.println(a & b);
        System.out.println(a | b);
        /*
        * << 往左挪位置 >> 往右挪位置 >>> 符号位要挪
        * 0000 0100
        * 0001 0000
        * */
        System.out.println(4 << 2);
        System.out.println(64 >> 2);
        int score = 100;
        System.out.println( score>=90 ? "电脑":"手机" );
        // [0,100]
        int num = (int)(Math.random()*101);
        //int num = (int)Math.random()*101;不行会等于1，会取math的0作为int
        System.out.println(num);
        //[18,60]
        int num2 = (int)(Math.random()*43)+18;
        System.out.println(num2);
        Random random = new Random();
        int num3 = random.nextInt(43);
        System.out.println(num3);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = scanner.next();
        System.out.println("请输入年龄");
        int age  = scanner.nextInt();
        System.out.println("name : "+ name + " age : "+ age);
    }


    public static void game(){
        System.out.println("你傻吗？请输入yes");
        Scanner scanner = new Scanner(System.in);
        String yes = scanner.next();
        if ("yes".equals(yes)){
            System.out.println("知道就好，要坚强");
        }else{
             game();
        }
    }
    public static void pijiu(int money){
        if (money<5) {
            System.out.println("only find one");
        }else {
            int num = money/5;
            System.out.println(num+pijiu2(num));
        }
    }
    public static int pijiu2(int bot){
        int num = bot/3;
        if (num>1){
            return num+pijiu2(num);
        }else{
            return 0 ;
        }
    }
}
