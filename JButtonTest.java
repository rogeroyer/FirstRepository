package com.jdialog.www;
//  imageButton.jpg要放在java->awt&swing->bin->  含有class文件的文件里面
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.*;
public class JButtonTest extends JFrame {
	private static final long serialVersionUID = 1L;
	public JButtonTest() {
		URL url = MyImageIcon.class.getResource("imageButton.jpg");
		Icon icon = new ImageIcon(url);
		setLayout(new GridLayout(3,2,5,5));
		Container c = getContentPane();
		for(int i = 0;i < 5;i++) {
			// 创建按钮，同时设置按钮文字与图标
			JButton J = new JButton("button" + i,icon);
			c.add(J);
			if(i % 2 == 0) {
				J.setEnabled(false);  // 设置其中一些按钮不可用
			}
		}
		JButton jb = new JButton(); // 实例化一个没有文字和图片的按钮
		jb.setMaximumSize(new Dimension(40,20)); // 设置按钮与图片相同大小
		jb.setIcon(icon); // 为按钮添加图标
   		jb.setHideActionText(true);
		jb.setToolTipText("图片按钮"); // 设置按钮提示为文字
		jb.setBorderPainted(false);  // 设置按钮边界不显示
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 弹出确认对话框
				JOptionPane.showMessageDialog(null, "弹出对话框");
			}
		});
		c.add(jb);
		setSize(1000,700);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JButtonTest();
	}

}
