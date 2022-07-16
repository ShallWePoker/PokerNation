package client.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableFrame extends JFrame {
    private JPanel contentPane;

    public TableFrame() {
        setResizable(false);
        setTitle("房间号"); //数据库id代表桌号·   `
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(0, 0, 800, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        ImageIcon tableicon = new ImageIcon("src/main/resources/table.jpg");
        JLabel tablePhoto = new JLabel(tableicon);
        tablePhoto.setBounds(0,0,800,600);
        contentPane.add(tablePhoto,-1);

        JButton btnbet =  new JButton("下注");
        btnbet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                betButton(e);

            }
        });
        btnbet.setFont(new Font("微软雅黑", Font.BOLD, 14));
        btnbet.setBounds(500,520,80,30);
        contentPane.add(btnbet,0);

        JButton btnraise=  new JButton("加注");
        btnraise.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                raiseButton(e);

            }
        });
        btnraise.setFont(new Font("微软雅黑", Font.BOLD, 14));
        btnraise.setBounds(600,520,80,30);
        contentPane.add(btnraise,0);

        JButton btnflod =  new JButton("弃牌");
        btnflod.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                flodButton(e);

            }
        });
        btnflod.setFont(new Font("微软雅黑", Font.BOLD, 14));
        btnflod.setBounds(700,520,80,30);
        contentPane.add(btnflod,0);

        JButton btnset =  new JButton("设置");
        btnset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setButton(e);

            }
        });
        btnset .setFont(new Font("微软雅黑", Font.BOLD, 14));
        btnset .setBounds(10,10,80,30);
        contentPane.add(btnset,0);

        JButton btnthird =  new JButton("33%");
        btnthird.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                thirdButton(e);

            }
        });
        btnthird.setFont(new Font("微软雅黑", Font.BOLD, 14));
        btnthird.setBounds(500,480,70,25);
        contentPane.add(btnthird,0);

        JButton btnhalf=  new JButton("50%");
        btnhalf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                halfButtpn(e);

            }
        });
        btnhalf.setFont(new Font("微软雅黑", Font.BOLD, 14));
        btnhalf.setBounds(600,480,70,25);
        contentPane.add(btnhalf,0);

        JButton btnpot =  new JButton("100%");
        btnpot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                potButton(e);

            }
        });
        btnpot.setFont(new Font("微软雅黑", Font.BOLD, 14));
        btnpot.setBounds(700,480,75,25);
        contentPane.add(btnpot,0);

        JTextField jetton = new JTextField();
        jetton.setFont(new Font("微软雅黑", Font.BOLD, 14));
        jetton.setBounds(380,500,100,40);
        contentPane.add(jetton,0);

        JLabel text = new JLabel("下注尺度");
        text.setFont(new Font("微软雅黑", Font.BOLD, 14));
        text.setBounds(310,500,100,40);
        contentPane.add(text,0);

        btnbet.setFocusable(false);
        btnflod.setFocusable(false);
        btnraise.setFocusable(false);
        btnset.setFocusable(false);
        btnhalf.setFocusable(false);
        btnthird.setFocusable(false);
        btnpot.setFocusable(false);

        contentPane.setLayout(null);
        setLocationRelativeTo(null);
    }

    //50%按钮
    private void halfButtpn(ActionEvent e) {
    }

    //100%按钮
    private void potButton(ActionEvent e) {
    }

    //33%按钮
    private void thirdButton(ActionEvent e) {
    }

    //设置按钮
    private void setButton(ActionEvent e) {
    }

    //弃牌按钮
    private void flodButton(ActionEvent e) {
    }

    //加注按钮
    private void raiseButton(ActionEvent e) {
    }

    //下注按钮
    private void betButton(ActionEvent e) {
    }

}

