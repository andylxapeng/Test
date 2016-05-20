package com.newer.peng.frame;

import javax.swing.JFrame;

public class FrameTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FrameTest ft = new FrameTest();
		ft.showFrame();

	}
	public void showFrame(){
		javax.swing.JFrame frame=new javax.swing.JFrame();
	    frame.setTitle("第一个界面程序");//设置标题
	    //创建一个标签元素：
	    javax.swing.JLabel la_name=new javax.swing.JLabel("名字: ");
	    //创建一个指定长度的文本
	    javax.swing.JTextField jta_name=new javax.swing.JTextField(4);
	    //创建一个按钮：
	    javax.swing.JButton bu_login=new javax.swing.JButton("登陆");
	    //将这三个组件加到窗体上：
	    frame.add(la_name);
	    frame.add(jta_name);
	    frame.add(bu_login);
	    frame.setSize(200,200); //设置窗体大小
	    frame.setVisible(true);

	}

}
