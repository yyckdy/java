package com.itheima.run;

import com.itheima.been.Business;
import com.itheima.been.Customer;
import com.itheima.been.Movie;
import com.itheima.been.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MovieSystem {
    /**
     * 定义系统的数据容器存储数据
     */
    public static final List<User> ALL_USERS = new ArrayList<>();

    /**
     * 存储全部商家和排片信息
     * 商家=[p1,p2,p3....]
     */
    public static final Map<Business, List<Movie>> ALL_MOVIES = new HashMap<>();

    public static final Scanner SYS_SC = new Scanner(System.in);

    public static User loginUser;
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static Logger LOGGER = LoggerFactory.getLogger("MovieSystem");

    /*
     准备一些测试数据
     */
    static {
        Customer c = new Customer();
        c.setLoginName("zyf888");
        c.setPassWord("123456");
        c.setUserName("刘德华");
        c.setSex('男');
        c.setMoney(10000);
        c.setPhone("110110");
        ALL_USERS.add(c);

        Customer c1 = new Customer();
        c1.setLoginName("gzl888");
        c1.setPassWord("123456");
        c1.setUserName("关之琳");
        c1.setSex('女');
        c1.setMoney(2000);
        c1.setPhone("111111");
        ALL_USERS.add(c1);

        Business b = new Business();
        b.setLoginName("baozugong888");
        b.setPassWord("123456");
        b.setUserName("包租公");
        b.setSex('男');
        b.setMoney(0);
        b.setPhone("110110");
        b.setAddress("火星6号2B2层");
        b.setShopName("甜甜圈国际影城");
        ALL_USERS.add(b);
        List<Movie> movies = new ArrayList<>();
        ALL_MOVIES.put(b, movies);

        Business b2 = new Business();
        b2.setLoginName("baozupo888");
        b2.setPassWord("123456");
        b2.setUserName("包租婆");
        b2.setSex('女');
        b2.setMoney(0);
        b2.setPhone("110110");
        b2.setAddress("火星8号8B8层");
        b2.setShopName("巧克力国际影城");
        ALL_USERS.add(b2);
        List<Movie> movies2 = new ArrayList<>();
        ALL_MOVIES.put(b2, movies2);
    }

    public static void main(String[] args) {
        showMain();
    }

    /**
     * 首页展示
     */
    private static void showMain() {
        while (true) {
            System.out.println("==========电影首页==========");
            System.out.println("1、登陆");
            System.out.println("2、用户注册");
            System.out.println("3、商家注册");
            System.out.println("请输入操作命令:");
            String command = SYS_SC.nextLine();
            switch (command) {
                case "1":
                    //登陆
                    login();
                    break;
                case "2":
                    //
                    break;
                case "3":
                    //
                    break;
                default:
                    System.out.println("命令有误重新输入");
            }
        }
    }

    /**
     * 登陆功能
     */
    private static void login() {
        while (true) {
            System.out.println("输入登陆名称:");
            String loginName = SYS_SC.nextLine();
            System.out.println("请您输入登陆密码");
            String passWord = SYS_SC.nextLine();

            //根据登陆名查询用户对象
            User u = getUserByLoginName(loginName);
            //判读用户对象是否存在
            if (u != null) {
                if (u.getPassWord().equals(passWord)) {
                    //登陆成功
                    loginUser = u;//记录登陆成功的用户
                    LOGGER.info(u.getUserName() + "登陆了系统～～～～～");
                    if (u instanceof Customer) {
                        //用户对象
                        showCustomerMain();
                    } else {
                        //商家对象
                        showBusinessMain();
                    }
                    return;
                } else {
                    System.out.println("密码有误");
                }
            } else {
                System.out.println("登录名不存在，请确认");
            }
        }

    }

    /**
     * 商家后台操作界面
     */
    private static void showBusinessMain() {
        while (true) {
            System.out.println("==========商家界面==========");
            LOGGER.info(loginUser.getUserName() + "商家正在查看详情");
            System.out.println(loginUser.getUserName() + ((loginUser.getSex() == '男') ? "先生" : "女士" + ",欢迎进入系统"));
            System.out.println("选择要操作的功能");
            System.out.println("1、展示详情");
            System.out.println("2、上架电影");
            System.out.println("3、下架电影");
            System.out.println("4、修改电影");
            System.out.println("5、退出");
            System.out.println("请输入您要操作的命令");
            String command = SYS_SC.nextLine();
            switch (command) {
                case "1":
                    //展示全部信息
                    showBusinessInfos();
                    break;
                case "2":
                    //上架电影
                    addMovie();
                    break;
                case "3":
                    //下架电影
                    deleteMovie();
                    break;
                case "4":
                    //修改电影
                    updateMovie();
                    break;
                case "5":
                    //退出
                    return;
                default:
                    System.out.println("输入有误，请重新输入");

            }
        }
    }

    /**
     * 影片修改
     */
    private static void updateMovie() {
        System.out.println("==========修改电影==========");
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        if (movies.size() == 0) {
            System.out.println("当前片可以修改");
            return;
        }
        while (true) {
            //选择需要修改的电影名称
            System.out.println("请您输入要修改的电影名称");
            String movieName = SYS_SC.nextLine();
            //查询该影片对象
            Movie movie = getMovieByName(movieName);
            if (movie != null) {
                //修改
                System.out.println("输入修改后的片名");
                String name = SYS_SC.nextLine();
                System.out.println("输入修改后的主演");
                String actor = SYS_SC.nextLine();
                System.out.println("输入修改后的时长");
                String time = SYS_SC.nextLine();
                System.out.println("输入修改后的票价");
                String price = SYS_SC.nextLine();
                System.out.println("输入修改后的票数");
                String number = SYS_SC.nextLine();
                while (true) {
                    try {
                        System.out.println("输入修改后的放映时间");
                        String stime = SYS_SC.nextLine();
                        movie.setName(name);
                        movie.setActor(actor);
                        movie.setNumber(Integer.parseInt(number));
                        movie.setPrice(Double.parseDouble(price));
                        movie.setTime(Double.valueOf(time));
                        movie.setStartTime(sdf.parse(stime));
                        System.out.println("成功修改影片:《" + movie.getName() + "》");
                        LOGGER.info(business.getUserName() + "修改了影片《" + movieName + "》");
                        showBusinessInfos();
                        return;
                    } catch (ParseException e) {
                        e.printStackTrace();
                        System.out.println("时间解析有误，请重新输入");
                        LOGGER.error("时间解析出错");
                    }
                }
            } else {
                System.out.println("没有找到该影片");
                System.out.println("继续修改？ y/n");
                String command = SYS_SC.nextLine();
                if ("y".equals(command)) {
                } else {
                    return;
                }
            }
        }
    }

    /**
     * 下架影片
     */
    private static void deleteMovie() {
        System.out.println("==========下架电影==========");
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        if (movies.size() == 0) {
            System.out.println("当前无法下架");
            return;
        }
        while (true) {
            //选择需要下架的电影名称
            System.out.println("请您输入要下架的电影名称");
            String movieName = SYS_SC.nextLine();
            //查询该影片对象
            Movie movie = getMovieByName(movieName);
            if (movie != null) {
                movies.remove(movie);
                System.out.println("成功下架：" + movie.getName());
                showBusinessInfos();
                LOGGER.info(business.getUserName() + "下架了" + movie.getName() + "影片");
                return;
            } else {
                System.out.println("没有找到该影片");
                System.out.println("继续下架？ y/n");
                String command = SYS_SC.nextLine();
                if ("y".equals(command)) {
                } else {
                    return;
                }
            }
        }
    }

    public static Movie getMovieByName(String name) {
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        for (Movie movie : movies) {
            if (movie.getName().contains(name)) {
                return movie;
            }
        }
        return null;
    }

    /**
     * 商家进行电影上架
     */
    private static void addMovie() {
        System.out.println("==========上架影片==========");
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        System.out.println("输入要添加的片名");
        String name = SYS_SC.nextLine();
        System.out.println("输入主演");
        String actor = SYS_SC.nextLine();
        System.out.println("输入时长");
        String time = SYS_SC.nextLine();
        System.out.println("输入票价");
        String price = SYS_SC.nextLine();
        System.out.println("输入票数");
        String number = SYS_SC.nextLine();
        while (true) {
            try {
                System.out.println("输入放映时间");
                String stime = SYS_SC.nextLine();
                Movie movie = new Movie(name, actor, Double.valueOf(time), Double.valueOf(price), Integer.valueOf(number), sdf.parse(stime));
                movies.add(movie);
                System.out.println("成功上架影片:《" + movie.getName() + "》");
                return;
            } catch (ParseException e) {
                e.printStackTrace();
                System.out.println("时间解析有误，请重新输入");
                LOGGER.error("时间解析出错");
            }
        }
    }

    /**
     * 展示当前商家详细信息
     */
    private static void showBusinessInfos() {
        //根据商家对象(loginUser)的键提取对应的值
        System.out.println("==========商家详情界面==========");
        Business business = (Business) loginUser;
        System.out.println(business.getShopName() + "\t\t电话:" + business.getPhone() + "\t\t地址:" + business.getAddress());
        List<Movie> movies = ALL_MOVIES.get(business);
        if (movies.size() > 0) {
            System.out.println("片名\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println(movie.getName() + "\t\t" + movie.getActor() + "\t\t" + movie.getTime() + "\t\t" + movie.getScore()
                        + "\t\t" + movie.getPrice() + "\t\t" + movie.getNumber() + "\t\t" + sdf.format(movie.getStartTime()));
            }
        } else {
            System.out.println("您的店铺当前无片可播");
        }
    }

    /**
     * 客户操作界面
     */
    private static void showCustomerMain() {
        while (true) {
            System.out.println("==========客户界面==========");
            System.out.println(loginUser.getUserName() + ((loginUser.getSex() == '男') ? "先生" : "女士" + ",欢迎进入系统"));
            System.out.println("选择要操作的功能");
            System.out.println("1、展示全部影片信息");
            System.out.println("2、根据电影名查看电影信息");
            System.out.println("3、评分功能");
            System.out.println("4、购票功能");
            System.out.println("5、退出系统");
            System.out.println("输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command) {
                case "1":
                    //展示全部影片信息
                    showAllMovies();
                    break;
                case "2":
                    //根据电影名查看电影信息
                    break;
                case "3":
                    //评分功能
                    break;
                case "4":
                    //购票功能
                    buyMovie();
                    break;
                case "5":
                    //退出系统
                    return;
                default:
                    System.out.println("输入错误，请重新输入");
            }
        }
    }

    /**
     * 用户购票
     */
    private static void buyMovie() {
        showAllMovies();
        System.out.println("==========用户购票==========");
        while (true) {
            System.out.println("输入购票的门店");
            String shopName = SYS_SC.nextLine();
            //查询商家是否存在
            Business business = getUserByShopName(shopName);
            if (business == null) {
                System.out.println("该店铺不存在");
            }
            List<Movie> movies = ALL_MOVIES.get(business);
            if (movies.size() > 0) {
                while (true) {
                    //购买
                    System.out.println("输入购买名称");
                    String movieName = SYS_SC.nextLine();
                    Movie movie = getMovieByShopAndName(business, movieName);
                    if (movie == null) {
                        System.out.println("影片不存在");
                    } else {
                        while (true) {
                            //开始购买
                            System.out.println("输入购买数量");
                            String number = SYS_SC.nextLine();
                            int buyNumber = Integer.valueOf(number);
                            if (movie.getNumber() >= buyNumber) {
                                double money = BigDecimal.valueOf(movie.getPrice()).multiply(BigDecimal.valueOf(buyNumber)).doubleValue();
                                if (loginUser.getMoney() <= money) {
                                    System.out.println("成功购买" + movie.getName() + " " + buyNumber + "张" + "，总金额：" + money);
                                    loginUser.setMoney(loginUser.getMoney() - money);
                                    assert business != null;
                                    business.setMoney(business.getMoney() + money);
                                    movie.setNumber(movie.getNumber() - buyNumber);
                                    return;
                                } else {
                                    System.out.println("余额不足");
                                    System.out.println("继续？y/n");
                                    String command = SYS_SC.nextLine();
                                    switch (command) {
                                        case "y":
                                            break;
                                        default:
                                            return;
                                    }
                                }
                            } else {
                                System.out.println("票数不足，当前剩余" + movie.getNumber() + "张");
                                System.out.println("继续？y/n");
                                String command = SYS_SC.nextLine();
                                switch (command) {
                                    case "y":
                                        break;
                                    default:
                                        return;
                                }
                            }
                        }
                    }
                }
            } else {
                System.out.println("影片为空\n继续？y/n");
                String command = SYS_SC.nextLine();
                switch (command) {
                    case "y":
                        break;
                    default:
                        return;
                }
            }
        }
    }

    public static Movie getMovieByShopAndName(Business business, String name) {
        List<Movie> movies = ALL_MOVIES.get(business);
        for (Movie movie : movies) {
            if (movie.getName().equals(name)) {
                return movie;
            }
        }
        return null;
    }

    public static Business getUserByShopName(String shopName) {
        Set<Business> businesses = ALL_MOVIES.keySet();
        for (Business business : businesses) {
            if (business.getShopName().equals(shopName)) {
                return business;
            }
        }
        return null;
    }

    /**
     * 展示所以商家的信息
     */
    private static void showAllMovies() {
        LOGGER.info("用户" + loginUser.getUserName() + "查询了所以影片信息");
        ALL_MOVIES.forEach((business, movies) -> {
            System.out.println(business.getShopName() + "\t\t电话:" + business.getPhone() + "\t\t地址:" + business.getAddress());
            System.out.println("片名\t\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println(movie.getName() + "\t\t\t" + movie.getActor() + "\t\t" + movie.getTime() + "\t\t" + movie.getScore()
                        + "\t\t" + movie.getPrice() + "\t\t" + movie.getNumber() + "\t\t" + sdf.format(movie.getStartTime()));
            }
        });
    }

    public static User getUserByLoginName(String loginName) {
        for (User user : ALL_USERS) {
            //判断登录名是否是我们需要的
            if (user.getLoginName().equals(loginName)) {
                return user;
            }
        }
        return null;//没有此登陆名
    }
}
