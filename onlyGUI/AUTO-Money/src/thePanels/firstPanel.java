package thePanels;

import java.awt.*;
import javax.swing.*;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;


public class firstPanel extends JFrame {
	private JPanel p_1 ;				//构建登录面板	
	private JTextField t1;				//构建可输入的三个文本框
	private JTextField t2;
	private JTextField t3;
	private Button login;				//构建一个按钮
	private FlowLayout fl;				//构建一个布局管理器

	public firstPanel(){
		login = new Button("登录");		//创建按钮“登录”
//		fl = new FlowLayout(); 			//布局管理器
		p_1 = new JPanel(fl);			//设置布局
		t1 = new JTextField();			//创建三个可输入的文本框
		t2 = new JTextField();
		t3 = new JTextField();
		p_1.add(t1);					//将组件加入面板
		p_1.add(t2);
		p_1.add(t3);
		p_1.add(login);
		t1.setBounds(200,100,400,35);	//设置组件位置及其大小
		t2.setBounds(200,150,400,35);
		t3.setBounds(200,200,200,35);
		login.setBounds(375,370,55,50);
		this.getContentPane().add(p_1);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(800, 500);
		this.setVisible(true);
	}	
}
