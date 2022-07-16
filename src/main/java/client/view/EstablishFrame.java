package client.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EstablishFrame extends JFrame {
    private JPanel contentPane;
    public EstablishFrame()
    {
        setTitle("创建房间");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(0,0,300,400);
        contentPane=new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);

        JLabel password = new JLabel("房间密码");
        password.setFont(new Font("微软雅黑", Font.BOLD, 14));
        password.setBounds(40,80,100,40);
        contentPane.add(password);

        JTextField jTextField = new JTextField();
        jTextField.setFont(new Font("微软雅黑", Font.BOLD, 14));
        jTextField.setBounds(100,90,100,25);
        contentPane.add(jTextField);

        JLabel blinds = new JLabel("盲注级别");
        blinds.setFont(new Font("微软雅黑", Font.BOLD, 14));
        blinds.setBounds(40,130,100,40);
        contentPane.add(blinds);

        JComboBox blindsBox = new JComboBox();
        blindsBox.setFont(new Font("微软雅黑", Font.BOLD, 14));
        blindsBox.setBounds(100,140,100,25);
        blindsBox.addItem("1/2");
        blindsBox.addItem("2/4");
        blindsBox.addItem("5/10");
        blindsBox.addItem("10/20");
        contentPane.add(blindsBox);

        JLabel buyin = new JLabel("带入筹码");
        buyin.setFont(new Font("微软雅黑", Font.BOLD, 14));
        buyin.setBounds(40,180,100,40);
        contentPane.add(buyin);

        JTextField buyinTxt = new JTextField();
        buyinTxt.setFont(new Font("微软雅黑", Font.BOLD, 14));
        buyinTxt.setBounds(100,190,100,25);
        contentPane.add(buyinTxt);

        JButton btnestbilish = new JButton("创建");
        btnestbilish.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                establishButton(e);

            }
        });
        btnestbilish.setFont(new Font("微软雅黑", Font.BOLD, 14));
        btnestbilish.setBounds(100,250,80,30);
        contentPane.add(btnestbilish);

        JButton btnreturn = new JButton("返回");
        btnreturn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                returnButton(e);

            }
        });
        btnreturn.setFont(new Font("微软雅黑", Font.BOLD, 14));
        btnreturn.setBounds(100,300,80,30);
        contentPane.add(btnreturn);

        btnreturn.setFocusable(false);
        btnreturn.setFocusable(false);

    }

    //创建按钮
    private void establishButton(ActionEvent e) {
        TableFrame tableFrame = new TableFrame();
        tableFrame.setVisible(true);
        this.setVisible(false);
    }

    //返回按钮
    private void returnButton(ActionEvent e) {

        this.setVisible(false);
    }

}
