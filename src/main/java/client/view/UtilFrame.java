package client.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UtilFrame extends JFrame {
    private JPanel contentPane;


    public UtilFrame() {
        setResizable(false);
        setTitle("工具箱");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(0, 0, 280, 350);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnbattle =  new JButton("battle king");
        btnbattle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aiButton(e);

            }
        });
        btnbattle.setFont(new Font("微软雅黑", Font.BOLD, 14));
        btnbattle.setBounds(75,50,125,30);
        contentPane.add(btnbattle);

        JButton btnnumber =  new JButton("随机数生成器");
        btnnumber.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numberButton(e);

            }
        });
        btnnumber.setFont(new Font("微软雅黑", Font.BOLD, 14));
        btnnumber.setBounds(75,150,125,30);
        contentPane.add(btnnumber);

        JButton btnreport =  new JButton("聚合报告");
        btnreport.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reportButton(e);

            }
        });
        btnreport.setFont(new Font("微软雅黑", Font.BOLD, 14));
        btnreport.setBounds(75,250,125,30);
        contentPane.add(btnreport);

        btnbattle.setFocusable(false);
        btnnumber.setFocusable(false);
        btnreport.setFocusable(false);
        setLocationRelativeTo(null);

    }

    //battle king 按钮
    private void aiButton(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "功能暂未开放");
    }

    //聚合报告按钮
    private void reportButton(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "功能暂未开放");
    }

    //随机数按钮
    private void numberButton(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "功能暂未开放");
    }

}
