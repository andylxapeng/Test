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
	    frame.setTitle("��һ���������");//���ñ���
	    //����һ����ǩԪ�أ�
	    javax.swing.JLabel la_name=new javax.swing.JLabel("����: ");
	    //����һ��ָ�����ȵ��ı�
	    javax.swing.JTextField jta_name=new javax.swing.JTextField(4);
	    //����һ����ť��
	    javax.swing.JButton bu_login=new javax.swing.JButton("��½");
	    //������������ӵ������ϣ�
	    frame.add(la_name);
	    frame.add(jta_name);
	    frame.add(bu_login);
	    frame.setSize(200,200); //���ô����С
	    frame.setVisible(true);

	}

}
