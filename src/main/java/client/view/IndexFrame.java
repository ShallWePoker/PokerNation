package client.view;

import client.model.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndexFrame extends JFrame
{
    private JPanel contentPane;
    private JTextField roomtext;
    private JTextField passwordtext;
    private JButton btnutil;

    public static  User user;

    public IndexFrame(User u) {
        user = u ;
        setTitle("游戏大厅");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,700,500);
        contentPane=new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);

            JLabel titlelabel = new JLabel("Poker Nation");
            titlelabel.setForeground(Color.BLACK);
            titlelabel.setFont(new Font("微软雅黑", Font.PLAIN, 40));
            titlelabel.setBounds(100, 60, 300, 40);
            contentPane.add(titlelabel);

            JButton btnestablish = new JButton("创建房间");
            btnestablish .addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    establishBtutton (e);

                }
            });
            btnestablish .setFont(new Font("微软雅黑", Font.BOLD, 14));
            btnestablish .setBounds(80, 350, 100, 30);
            contentPane.add(btnestablish );
            btnestablish.setFocusable(false);

            JButton btnaddroom = new JButton("加入房间");
            btnaddroom .addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                  addroomBtutton (e);

                }
            });
            btnaddroom .setFont(new Font("微软雅黑", Font.BOLD, 14));
            btnaddroom .setBounds(280, 350, 100, 30);
            contentPane.add(btnaddroom  );
            btnaddroom.setFocusable(false);

            JLabel roomlabel = new JLabel("房间号");
            roomlabel.setFont((new Font("微软雅黑",Font.BOLD,14)));
            roomlabel.setBounds(100,180,200,30);
            contentPane.add(roomlabel);

            JLabel passwordlabel = new JLabel("密码");
            passwordlabel.setFont((new Font("微软雅黑",Font.BOLD,14)));
            passwordlabel.setBounds(100,230,200,30);
            contentPane.add(passwordlabel);

            roomtext = new JTextField();
            roomtext.setFont((new Font("微软雅黑",Font.BOLD,14)));
            roomtext.setBounds(150,185,200,25);
            contentPane.add(roomtext);

            passwordtext = new JTextField();
            passwordtext.setFont((new Font("微软雅黑",Font.BOLD,14)));
            passwordtext.setBounds(150,235,200,25);
            contentPane.add(passwordtext);

            JLabel label = new JLabel("");
            label.setBounds(480,0,200,500);
            label.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
            contentPane.add(label);

            JLabel userlabel = new JLabel("用户：");
            userlabel.setFont((new Font("微软雅黑",Font.BOLD,18)));
            userlabel.setBounds(500,50,200,30);
            contentPane.add(userlabel);

            String userNameStr = this.user.getName();
            JLabel usernamelabel = new JLabel(userNameStr);
            usernamelabel.setFont((new Font("微软雅黑",Font.BOLD,18)));
            usernamelabel.setBounds(550,50,200,30);
            contentPane.add(usernamelabel);

            btnutil = new JButton("工具箱");
            btnutil .addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    utilBtutton(e);
                }
            });
            btnutil.setFont(new Font("微软雅黑", Font.BOLD, 14));
            btnutil.setBounds(520, 350, 120, 35);
            contentPane.add( btnutil);
            btnutil.setFocusable(false);




        }

        //工具箱按钮
    private void utilBtutton(ActionEvent e) {
        UtilFrame utilFrame = new UtilFrame();
        utilFrame.setVisible(true);
    }


    //加入房间按钮
    private void addroomBtutton(ActionEvent e) {
    }

       //创建房间按钮
    private void establishBtutton(ActionEvent e) {
        EstablishFrame establishFrame = new EstablishFrame();
        establishFrame.setVisible(true);
    }


}

