package examSystem.view;

import examSystem.service.UserService;
import examSystem.utils.MySpring;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ProjectName: javaMaybe
 * Package: examSystem.view
 * className: LoginFrame
 * describe:
 * create by "zhangDong"
 * createDate: 2019/11/11 0011
 * createTime: 9:49
 */
public class LoginFrame extends BaseJFrame implements ActionListener {

    private JPanel panel = new JPanel();
    private JLabel titleLabel = new JLabel("用户登录界面");
    private JLabel nameLabel = new JLabel("用户名：");
    private JLabel passLabel = new JLabel("密 码：");
    private JTextField inputName = new JTextField(20);
    private JPasswordField inputPass = new JPasswordField(20);
    private JButton loginButton = new JButton("登录");
    private JButton exitButton = new JButton("退出");

    private UserService userService;

    public LoginFrame() {
    }

    public LoginFrame(String title) {
        super(title);
    }

    @Override
    protected void initView() {
        panel.setLayout(null);
        titleLabel.setBounds(0, 10, 600, 50);
        titleLabel.setFont(new Font("斜体", Font.BOLD, 30));
        titleLabel.setHorizontalAlignment(JTextField.CENTER);
        Font textFont = new Font("黑体", Font.PLAIN, 24);
        nameLabel.setBounds(150, 90, 100, 30);
        nameLabel.setFont(textFont);
        inputName.setBounds(260, 90, 190, 30);
        inputName.setFont(textFont);
        passLabel.setBounds(150, 150, 100, 30);
        passLabel.setFont(textFont);
        inputPass.setBounds(260, 150, 190, 30);
        inputPass.setFont(textFont);
        loginButton.setBounds(200, 230, 80, 30);
        exitButton.setBounds(320, 230, 80, 30);
    }

    @Override
    protected void addListener() {
        loginButton.addActionListener(this);
        exitButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "登录":
                //检查用户名
                String nameText = inputName.getText();
                if (null == nameText || nameText.trim().length() == 0) {
                    JOptionPane.showMessageDialog(this, "请输入有效的用户名！");
                    return;
                }
                //检查密码
                char[] password = inputPass.getPassword();
                if (null == password || password.length == 0) {
                    JOptionPane.showMessageDialog(this, "密码不能为空！");
                    return;
                }
                String passText = new String(password);
                //匹配用户数据
                System.out.println("登录：name: " + nameText + " , pass: " + passText);

                if (null == userService)
                    userService = MySpring.getBean("examSystem.service.UserService");

                boolean login = userService.login(nameText, passText);

                if (login) {
                    //登录成功
                    TopicJFrame topicJFrame = new TopicJFrame("欢迎" + nameText + "进入系统！");
                    topicJFrame.showView(true);
                    this.showView(false);
                } else {
                    //登录失败
                    inputName.setText(null);
                    inputPass.setText(null);
                    JOptionPane.showMessageDialog(this, "用户名或密码错误！");
                }
                break;
            case "退出":
                System.out.println("退出");
                this.showView(false);
                break;
        }
    }

    @Override
    protected void addView() {
        panel.add(titleLabel);
        panel.add(nameLabel);
        panel.add(inputName);
        panel.add(passLabel);
        panel.add(inputPass);
        panel.add(loginButton);
        panel.add(exitButton);

        this.add(panel);
        this.setBounds(500, 300, 600, 350);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
