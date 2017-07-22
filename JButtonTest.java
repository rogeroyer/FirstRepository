package com.jdialog.www;
//  imageButton.jpgҪ����java->awt&swing->bin->  ����class�ļ����ļ�����
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
			// ������ť��ͬʱ���ð�ť������ͼ��
			JButton J = new JButton("button" + i,icon);
			c.add(J);
			if(i % 2 == 0) {
				J.setEnabled(false);  // ��������һЩ��ť������
			}
		}
		JButton jb = new JButton(); // ʵ����һ��û�����ֺ�ͼƬ�İ�ť
		jb.setMaximumSize(new Dimension(40,20)); // ���ð�ť��ͼƬ��ͬ��С
		jb.setIcon(icon); // Ϊ��ť���ͼ��
   		jb.setHideActionText(true);
		jb.setToolTipText("ͼƬ��ť"); // ���ð�ť��ʾΪ����
		jb.setBorderPainted(false);  // ���ð�ť�߽粻��ʾ
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ����ȷ�϶Ի���
				JOptionPane.showMessageDialog(null, "�����Ի���");
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
