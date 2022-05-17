import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 * 入口类
 */
public class ATMSystem {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            //首页
            System.out.println("==========ATM==========");
            System.out.println("1.登陆");
            System.out.println("2.开户");
            System.out.println("请您选择操作");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //登陆操作
                    login(accounts, sc);
                    break;
                case 2:
                    //开户操作
                    register(accounts, sc);
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
    }

    /**
     * @param accounts 全部账户对象集合
     * @param sc       扫描器
     */
    private static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("==========系统登陆==========");
        if (accounts.size() == 0) {
            System.out.println("系统无账户信息");
            return;
        }

        while (true) {
            System.out.println("输入登陆卡号：");
            String cardId = sc.next();
            Account account = getAccountByCardId(cardId, accounts);
            if (account != null) {
                while (true) {
                    System.out.println("请您输入密码：");
                    String passWord = sc.next();
                    if (account.getPassWord().equals(passWord)) {
                        //登陆成功
                        System.out.println("恭喜您，" + account.getUserName() + "登陆成功," + "您的卡号是" + account.getCardId());
                        //查询 转账
                        //展示登陆后的操作页面
                        showUserCommand(sc, account, accounts);
                        return;
                    } else {
                        System.out.println("密码错误");
                    }
                }
            } else {
                System.out.println("系统不存在该卡号");
            }
        }
    }

    /**
     * 展示登陆后面菜单
     */
    private static void showUserCommand(Scanner scanner, Account account, ArrayList<Account> accounts) {
        while (true) {
            System.out.println("==========用户操作页面==========");
            System.out.println("1、查询账户");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、修改密码");
            System.out.println("6、退出");
            System.out.println("7、注销账户");
            System.out.println("请选择您的操作");
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    //查询
                    showAccount(account);
                    break;
                case 2:
                    //存款
                    depositMoney(account, scanner);
                    break;
                case 3:
                    //取款
                    drawMoney(account, scanner);
                    break;
                case 4:
                    //转账
                    transMoney(account, scanner, accounts);
                    break;
                case 5:
                    //修改密码
                    updatePassWord(account,scanner);
                    return;
                case 6:
                    //退出
                    System.out.println("欢迎下次光临");
                    return;
                case 7:
                    //注销
                    System.out.println("您确定要销户么？输入y确定，输入n取消：");
                    String rs=scanner.next();
                    switch (rs){
                        case "y":
                            accounts.remove(account);
                            System.out.println("您的账户注销成功");
                            return;
                        default:
                            System.out.println("您取消了操作");
                    }
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * 修改密码
     * @param account 当前账户
     * @param scanner 扫描器
     */
    private static void updatePassWord(Account account, Scanner scanner) {
        System.out.println("==========用户密码修改==========");
        while (true) {
            String passWord=scanner.next();
            if(account.getPassWord().equals(passWord)){
                while (true) {
                    System.out.println("请您输入新密码");
                    String newPassWord=scanner.next();
                    System.out.println("请您确认新密码");
                    String okPassWord=scanner.next();
                    if(okPassWord.equals(newPassWord)){
                        account.setPassWord(newPassWord);
                        System.out.println("修改成功");
                        return;
                    }else{
                        System.out.println("您两次输入的密码不一致");
                    }
                }
            }else{
                System.out.println("您输入的密码不正确");
            }
        }
    }

    /**
     * 转账
     *
     * @param account  自己的账户对象
     * @param scanner  扫描器
     * @param accounts 全部账户集合
     */
    private static void transMoney(Account account, Scanner scanner, ArrayList<Account> accounts) {
        if (accounts.size() < 2) {
            System.out.println("系统账户数量不足2个，不能转账");
            return;
        }
        System.out.println("==========转账操作==========");
        if (account.getMoney() == 0) {
            System.out.println("z账户余额不足");
            return;
        }
        while (true) {
            System.out.println("输入您要转账的卡号：");
            String cardId = scanner.next();
            if (cardId.equals(account.getCardId())) {
                System.out.println("不能向自己的卡号转账");
                continue;
            }
            Account account1 = getAccountByCardId(cardId, accounts);
            if (account1 == null) {
                System.out.println("对方账户不存在，请重新输入");
            } else {
                System.out.println("请您输入卡号*" + account1.getUserName().substring(1) + "的姓氏");
                String preName = scanner.next();
                if (account1.getUserName().startsWith(preName)) {
                    while (true) {
                        System.out.println("输入您的转账金额");
                        double money = scanner.nextDouble();
                        if (money > account.getMoney()) {
                            System.out.println("余额不足,您最多可以转账" + account.getMoney() + "元");
                        } else {
                            account.setMoney(account.getMoney() - money);
                            account1.setMoney(account1.getMoney() + money);
                            System.out.println("转账成功，您的账户余额为" + account.getMoney());
                            return;
                        }
                    }
                } else {
                    System.out.println("您输入的信息有误");
                }
            }
        }
    }

    /**
     * 取款
     *
     * @param account 当前账户
     * @param scanner 扫描器
     */
    private static void drawMoney(Account account, Scanner scanner) {
        System.out.println("==========取==========");
        if (account.getMoney() < 100) {
            System.out.println("余额不足100");
            return;
        }
        while (true) {
            System.out.println("请您输入取款金额：");
            double money = scanner.nextDouble();
            if (money <= account.getMoney()) {
                if (money > account.getMoney()) {
                    return;
                }
                account.setMoney(account.getMoney() - money);
            } else {
                System.out.println("余额不足");
            }
            System.out.println("取款成功，您的余额为：" + account.getMoney());
            return;
        }
    }

    /**
     * 存钱
     *
     * @param account 当前账户对象
     * @param scanner 扫描器
     */
    private static void depositMoney(Account account, Scanner scanner) {
        System.out.println("==========存钱==========");
        System.out.println("请您输入金额：");
        double money = scanner.nextDouble();
        account.setMoney(account.getMoney() + money);
        System.out.println("存款成功");
    }

    /**
     * 展示账户信息
     *
     * @param account
     */
    private static void showAccount(Account account) {
        System.out.println("==========当前账户信息==========");
        System.out.println("卡号：" + account.getCardId());
        System.out.println("户主：" + account.getUserName());
        System.out.println("余额：" + account.getMoney());
        System.out.println("限额：" + account.getQuotaMoney());
    }

    /**
     * 用户开户功能实现
     *
     * @param accounts 接收的账户集合
     */
    public static void register(ArrayList<Account> accounts, Scanner scanner) {
        //创建一个账户对象
        Account account = new Account();
        //录入信息
        while (true) {
            System.out.println("请您输入账户用户名");
            String userName = scanner.next();
            account.setUserName(userName);
            System.out.println("请您输入账户密码");
            String passWord = scanner.next();
            System.out.println("确认密码");
            String okPassWord = scanner.next();
            if (okPassWord.equals(passWord)) {
                account.setPassWord(passWord);
                break;
            } else {
                System.out.println("两次密码不一致");
            }
        }
        System.out.println("请您输入单次限额");
        double quotaMoney = scanner.nextDouble();
        account.setQuotaMoney(quotaMoney);

        //随机一个八位卡号
        String cardId = getRandomCardId(accounts);
        account.setCardId(cardId);
        //添加到账户集合
        accounts.add(account);
        System.out.println("恭喜您," + account.getUserName() + ",您开户成功，您的卡号是：" + cardId);
    }

    /**
     * 生成八位未生成卡号
     *
     * @return 生成的卡号
     */
    public static String getRandomCardId(ArrayList<Account> accounts) {
        String cardId = "";
        Random random = new Random();
        while (true) {
            for (int i = 0; i < 8; i++) {
                cardId += random.nextInt(10);
            }
            //判断重复
            if (getAccountByCardId(cardId, accounts) == null) {
                return cardId;
            }
        }
    }

    public static Account getAccountByCardId(String cardId, ArrayList<Account> accounts) {
        for (Account account : accounts) {
            if (account.getCardId().equals(cardId)) {
                return account;
            }
        }
        return null;
    }
}
