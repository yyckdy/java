package 购物车案例;

import java.util.Scanner;

public class ShopCarTest {
    public static void main(String[] args) {
        Goods[] shopCar = new Goods[100];
        while (true) {
            System.out.println("输入add添加");
            System.out.println("输入query查询");
            System.out.println("输入update修改");
            System.out.println("输入pay结算");
            Scanner sc = new Scanner(System.in);
            System.out.println("输入命令");
            String command = sc.next();
            switch (command) {
                case "add":
                    //添加
                    addGoods(shopCar);
                    break;
                case "query":
                    //查询
                    queryGoods(shopCar);
                    break;
                case "update":
                    //修改
                    updateGoods(shopCar);
                    break;
                case "pay":
                    //结算
                    payGoods(shopCar);
                    break;
                default:
                    System.out.println("没有该功能");
                    break;
            }
        }
    }


    public static void payGoods(Goods[] shopCar) {
        double money = 0;
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] != null) {
                money += shopCar[i].buyNumber * shopCar[i].price;
            } else {
                break;
            }
        }
        System.out.println("订单总金额为"+money);
    }

    public static void updateGoods(Goods[] shopCar) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入要修改的id");
            int id = sc.nextInt();
            Goods g = getGoodsById(id, shopCar);
            if (g == null) {
                System.out.println("没有该商品");
            } else {
                System.out.println("输入最新购买数量");
                int buyNumber = sc.nextInt();
                g.buyNumber = buyNumber;
                System.out.println("修改完成");
                break;
            }
        }
    }

    public static Goods getGoodsById(int id, Goods[] shopCar) {
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] != null) {
                if (shopCar[i].id == id) {
                    return shopCar[i];
                }
            } else return null;
        }
        return null;
    }

    public static void queryGoods(Goods[] shopCar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("查询购物车信息如下：");
        System.out.println("编号\t\t名称\t\t\t价格\t\t\t购买数量\t\t\t");
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] != null) {
                System.out.println(shopCar[i].id + "\t\t" + shopCar[i].name + "\t\t\t" + shopCar[i].price + "\t\t\t" + shopCar[i].buyNumber);
            } else {
                break;
            }
        }
    }

    public static void addGoods(Goods[] shopCar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入编号");
        int id = sc.nextInt();
        System.out.println("输入名称");
        String name = sc.next();
        System.out.println("输入数量");
        int buyNumber = sc.nextInt();
        System.out.println("输入购买价格");
        double price = sc.nextDouble();

        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.buyNumber = buyNumber;
        g.price = price;

        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null) {
                shopCar[i] = g;
                break;
            }
        }
        System.out.println("商品" + g.name + "添加完成");
    }
}
