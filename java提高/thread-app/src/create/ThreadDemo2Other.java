package create;

/**
 * 线程的创建方式2 可以继续继承一个类
 * 会多包装一层对象 不能返回结果
 * 匿名写法
 */
public class ThreadDemo2Other {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("子线程1执行输出：" + i);
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("子线程2执行输出：" + i);
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("子线程3执行输出：" + i);
            }
        }).start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行输出：" + i);
        }
    }
}

