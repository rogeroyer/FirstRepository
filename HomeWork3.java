package com.jdialog.www;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
/*import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;*/
import javax.swing.*;
//import java.util.Scanner;

public class HomeWork3 {
	// extends JFrame
	// private static final long serialVersionUID = 1L;
//	private static Scanner in;
	private int array[] = { 1, 7, 1, 5 };
	private int number[] = { 1, 0, 2, 9, 3, 7, 5, 8, 6, 4 };
	String passwordTwo = new String();

	public HomeWork3() {
		JFrame jf = new JFrame("登录界面");
		Container cn = jf.getContentPane(); // new FlowLayout(1,10,10)
		cn.setLayout(new GridLayout(3, 1, 10, 10));
		JPanel J1 = new JPanel(new FlowLayout(1, 10, 10));
		JPanel J2 = new JPanel(new FlowLayout(1, 10, 10));
		JPanel J3 = new JPanel(new FlowLayout(1, 10, 10));
		JTextField jp = new JTextField(10);
		JLabel jl1 = new JLabel("用户名：");
		JPasswordField jp1 = new JPasswordField(10);
		JLabel jl2 = new JLabel("   密码：");
		JButton jb1 = new JButton("提交");
		JButton jb2 = new JButton("重置");
		J3.add(jb1);
		J3.add(jb2);
		jp1.setEchoChar('*'); // 设置回显字符，就是平时输入密码时都会显示为*号那种
		J1.add(jl1);
		J1.add(jp);
		cn.add(J1);
		J2.add(jl2);
		J2.add(jp1);
		cn.add(J2);
		cn.add(J3);
		jf.setBounds(500, 200, 300, 200);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		for (int i : array) {
			passwordTwo = passwordTwo + number[i];
		}
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jp.setText(null);
				jp1.setText(null);
			}
		});
		jb1.addActionListener(new ActionListener() {
			 @SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				String passwordOne = new String(jp1.getPassword());
				if (jp.getText().equals("18983168680") && passwordOne.equals(passwordTwo)) { 
					// System.out.println("密码正确！");
					JOptionPane.showMessageDialog(null, "登录成功！");
					 jf.hide();
					 JFrameTwo();
					
				} else {
					jp1.setText(null);
					jb1.setText("重试");
				}
			}
		});
	}

	public void JFrameTwo() {
//		in = new Scanner(System.in);
		JFrame jf1 = new JFrame("程序框");
		JTextArea ja = new JTextArea(5,22);
		Container con = jf1.getContentPane();
		con.setLayout(new FlowLayout());
		JTextField jt1 = new JTextField(20);
		JTextField jt2 = new JTextField(20);
		JLabel jl1 = new JLabel("    请输入数组：");
		JLabel jl2 = new JLabel("核对数组元素：");
//		String tip = new String();
//		String numberText = new String();   
//		tip = jt1.getText();
		for(int i = 0;i < 5;i++) {
	//		numberText = numberText + " " + in.nextInt();
		}
		
		ja.setText("This is a Test！");
		ja.setSelectedTextColor(Color.RED);
		ja.setSelectionColor(Color.BLUE);
		ja.append("asdjhgafhkjaashfkjah\n172392392");
		con.add(jl1);
		con.add(jt1);
		con.add(jl2);
		con.add(jt2);
		jt1.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				jt2.setEnabled(true);
			}
			@Override
			public void focusLost(FocusEvent e) {
				ja.append("abcdefghijklmnopqrstuvwxyz");
				jt2.setEnabled(false);
				con.add(ja);
			}
		});
		
		jf1.setVisible(true);
		jf1.setBounds(500, 200, 400, 200);
		jf1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new HomeWork3();
//		HomeWork3 h = new HomeWork3();
//		h.JFrameTwo();
		/*
		 * char[] a = {'1','2'}; String b = new String(a);
		 * System.out.println(b.equals("12"));
		 */
	}
}
