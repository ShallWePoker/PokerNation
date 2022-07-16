package client.view;

import client.dao.UserDao;
import client.model.User;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TopFrame extends JFrame {

    private JPanel contentPane;
    private JTextField userName;
    private JPasswordField userPassword;

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TopFrame frame = new TopFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public TopFrame() {
        setResizable(false);
        setTitle("登录界面");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 330);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Poker Nation");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 30));
        lblNewLabel.setBounds(147, 10, 199, 31);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("用户名：");
        lblNewLabel_1.setForeground(Color.BLACK);
        lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        lblNewLabel_1.setBounds(133, 82, 93, 37);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("密码：");
        lblNewLabel_2.setForeground(Color.BLACK);
        lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        lblNewLabel_2.setBounds(133, 150, 93, 37);
        contentPane.add(lblNewLabel_2);

        userName = new JTextField();
        userName.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        userName.setBounds(185, 90, 149, 21);
        contentPane.add(userName);
        userName.setColumns(10);

        userPassword = new JPasswordField();
        userPassword.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        userPassword.setBounds(185, 155, 149, 21);
        contentPane.add(userPassword);
        userPassword.setColumns(10);

        JButton registerbtn = new JButton("注册");
        registerbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                regButton(e);

            }
        });
        registerbtn.setBounds(120,250,100,30);
        contentPane.add(registerbtn);

        JButton btnlogin = new JButton("登录");
        btnlogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loginButton(e);

            }
        });
        btnlogin.setBounds(258, 250, 100, 30);
        contentPane.add(btnlogin);
        registerbtn.setFocusable(false);
        btnlogin.setFocusable(false);

        setLocationRelativeTo(null);
    }

    //登录按钮
    private void loginButton(ActionEvent e) {
        String name = this.userName.getText();
        String password =  new String(userPassword.getPassword());
        User user = new User(name, password);
        /*
        UserDao userDao = new UserDao();
        User user = userDao.selectUser(name, password);

        if(user==null) {
            JOptionPane.showMessageDialog(this, "用户名或密码错误");
            return;
        }
        else

        {

         */
            IndexFrame indexFrame =  new IndexFrame(user);
            indexFrame.setVisible(true);
            this.dispose();

       // }

    }

    //注册按钮
    private void regButton(ActionEvent e) {
        RegFrame regFrame = new RegFrame();
        regFrame.setVisible(true);
        this.dispose();
    }

}


