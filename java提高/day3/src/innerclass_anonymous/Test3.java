package innerclass_anonymous;

import javax.swing.*;


/**
 * 匿名内部类使用场景
 */
public class Test3 {
    public static void main(String[] args) {
        //1.创建窗口
        JFrame win = new JFrame("登陆");
        JPanel panel = new JPanel();
        win.add(panel);

        //2.创建一个按钮对象
        JButton btn = new JButton("登陆");

        //匿名内部类的使用
        btn.addActionListener(e -> JOptionPane.showMessageDialog(win, "-----"));

        //3.把按钮对象添加到窗口
        win.add(btn);

        //4.展示窗口
        win.setSize(400, 300);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }
}
