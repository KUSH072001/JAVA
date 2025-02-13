package Task10;

public class main {
    public static void main(String[] args) {
//        for local
        Constant c1=new Constant();
        Constant.mysql.local local=new Constant.mysql.local();
        System.out.println(Constant.mysql.local.username);
        System.out.println(Constant.mysql.local.password);
//        for Dev
        Constant.mysql.Dev dev=new Constant.mysql.Dev();
        System.out.println(Constant.mysql.Dev.username);
        System.out.println(Constant.mysql.Dev.password);
        dev.m1();
//        Prod
        System.out.println(Constant.mysql.Prod.username);
        System.out.println(Constant.mysql.Prod.password);

//        oracle
//        local
        System.out.println(Constant.oracle.local.username);
        System.out.println(Constant.oracle.local.password);
//    dev
        System.out.println(Constant.oracle.Dev.username);
        System.out.println(Constant.oracle.Dev.password);
//        prod
        System.out.println(Constant.oracle.Prod.username);
        System.out.println(Constant.oracle.Prod.password);
    }
}
