package client.view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class RegFrame extends JFrame {
    private JPanel contentPane;
    private JTextField userNameTxt;
    private JPasswordField passwordTxt;
    private JPasswordField rePasswordTxt;

    public RegFrame() {
        setResizable(false);
        setTitle("账号注册");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 500, 445);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Poker Nation");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 30));
        lblNewLabel.setBounds(147, 50, 199, 31);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("账号");
        lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 14));
        lblNewLabel_1.setBounds(130, 160, 64, 30);
        contentPane.add(lblNewLabel_1);

        userNameTxt = new JTextField();
        userNameTxt.setFont(new Font("微软雅黑", Font.BOLD, 14));
        userNameTxt.setBounds(165, 166, 191, 21);
        contentPane.add(userNameTxt);
        userNameTxt.setColumns(10);

        JLabel lblNewLabel_1_1 = new JLabel("密码");
        lblNewLabel_1_1.setFont(new Font("微软雅黑", Font.BOLD, 14));
        lblNewLabel_1_1.setBounds(130, 215, 64, 30);
        contentPane.add(lblNewLabel_1_1);

        JButton btnNewButton = new JButton("注册");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                regButton(e);

            }
        });
        btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 14));
        btnNewButton.setBounds(250, 350, 115, 23);
        contentPane.add(btnNewButton);

        JButton btnreturn = new JButton("返回");
        btnreturn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                returnButton(e);

            }
        });
        btnreturn.setFont(new Font("微软雅黑", Font.BOLD, 14));
        btnreturn.setBounds(110, 350, 115, 23);
        contentPane.add(btnreturn);
        btnreturn.setFocusable(false);

        passwordTxt = new JPasswordField();
        passwordTxt.setFont(new Font("微软雅黑", Font.BOLD, 14));
        passwordTxt.setBounds(165, 221, 191, 21);
        contentPane.add(passwordTxt);

        JLabel lblNewLabel_1_1_1 = new JLabel("确认密码");
        lblNewLabel_1_1_1.setFont(new Font("微软雅黑", Font.BOLD, 14));
        lblNewLabel_1_1_1.setBounds(100, 265, 115, 30);
        contentPane.add(lblNewLabel_1_1_1);

        rePasswordTxt = new JPasswordField();
        rePasswordTxt.setFont(new Font("微软雅黑", Font.BOLD, 14));
        rePasswordTxt.setBounds(165, 269, 191, 21);
        contentPane.add(rePasswordTxt);
        setLocationRelativeTo(null);
        btnNewButton.setFocusable(false);

    }

    //返回按钮
    private void returnButton(ActionEvent e) {
        TopFrame topFrame = new TopFrame();
        topFrame.setVisible(true);
        this.setVisible(false);

    }

    //注册按钮
    private void regButton(ActionEvent e) {

    }


}

