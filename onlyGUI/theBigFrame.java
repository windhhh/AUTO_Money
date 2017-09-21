package frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class theBigFrame extends JFrame{
    private JPanel pane = null; // 主要的JPanel，该JPanel的布局管理将被设置成CardLayout
    private JPanel p = null; // 放按钮的JPanel
    private CardLayout card = null; // CardLayout布局管理器	
    private JButton b_1 = null, b_2 = null, b_3 = null; // 三个可直接翻转到JPanel组件的按钮
    private JPanel p_1 = null, p_2 = null, p_3 = null; // 要切换的三个JPanel
    public theBigFrame(){
        b_1 = new JButton("登录");
        b_2 = new JButton("商品信息");
        b_3 = new JButton("商品价格");
        b_1.setMargin(new Insets(20,5,5,20));
        b_2.setMargin(new Insets(20,5,5,20));
        b_3.setMargin(new Insets(20,5,5,20));
        p.add(b_1);
        p.add(b_2);
        p.add(b_3);
        p_1 = new JPanel();
        p_2 = new JPanel();
        p_3 = new JPanel();
        p_1.add(new JLabel("登录界面"));
        p_2.add(new JLabel("商品信息"));
        p_3.add(new JLabel("商品价格"));
        pane.add(p_1, "p1");
        pane.add(p_2, "p2");
        pane.add(p_3, "p3");
        b_1.addActionListener(new ActionListener() { // 直接翻转到p_1
            public void actionPerformed(ActionEvent e) {
                card.show(pane, "p1");
            }
        });
        b_2.addActionListener(new ActionListener() { // 直接翻转到p_2
            public void actionPerformed(ActionEvent e) {
                card.show(pane, "p2");
            }
        });
        b_3.addActionListener(new ActionListener() { // 直接翻转到p_3
            public void actionPerformed(ActionEvent e) {
                card.show(pane, "p3");
            }
        });
        this.getContentPane().add(pane);
        this.getContentPane().add(p, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 500);
        this.setVisible(true);
    }
}
