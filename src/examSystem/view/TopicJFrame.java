package examSystem.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ProjectName: javaMaybe
 * Package: examSystem.view
 * className: TopicJFrame
 * describe:
 * create by "zhangDong"
 * createDate: 2019/11/11 0011
 * createTime: 10:24
 */
public class TopicJFrame extends BaseJFrame implements ActionListener {

    private JPanel topicPanel = new JPanel();
    private JPanel infoPanel = new JPanel();
    private JPanel actionPanel = new JPanel();

    private JTextArea textArea = new JTextArea();
    private JScrollPane scrollPane = new JScrollPane(textArea);

    private JLabel pic = new JLabel("图片占位");
    private JLabel nowLabel = new JLabel("当前题号：");
    private JLabel totalLabel = new JLabel("总共题数：");
    private JLabel doLabel = new JLabel("已完成数：");
    private JLabel finishLabel = new JLabel("未答题数：");
    private JLabel timeLabel = new JLabel("00:08:08");

    private JRadioButton buttonA = new JRadioButton("A");
    private JRadioButton buttonB = new JRadioButton("B");
    private JRadioButton buttonC = new JRadioButton("C");
    private JRadioButton buttonD = new JRadioButton("D");
    private JButton buttonPrev = new JButton("上一题");
    private JButton buttonCommit = new JButton("提交");
    private JButton buttonNext = new JButton("下一题");

    public TopicJFrame() {
    }

    public TopicJFrame(String title) {
        super(title);
    }

    @Override
    protected void initView() {
        topicPanel.setLayout(null);
        infoPanel.setLayout(null);
        actionPanel.setLayout(null);

        topicPanel.setBounds(5, 5, 750, 400);
        topicPanel.setBackground(Color.GRAY);

        scrollPane.setBounds(5, 5, 740, 390);
        textArea.setFont(new Font("黑体", Font.BOLD, 26));
        textArea.setDisabledTextColor(Color.black);
        textArea.setEnabled(false);
        textArea.setText("  1.下列哪个不是Java基本数据类型？\t\n\n    A.String\n    B.boolean\n    C.char\n    D.int");

        infoPanel.setBounds(760, 5, 230, 560);
        infoPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        Font textFont = new Font("黑体", Font.BOLD, 22);
        pic.setBounds(10, 15, 210, 100);
        pic.setFont(textFont);
        pic.setHorizontalAlignment(JLabel.CENTER);
        pic.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        nowLabel.setBounds(20, 135, 190, 30);
        nowLabel.setFont(textFont);
        totalLabel.setBounds(20, 185, 190, 30);
        totalLabel.setFont(textFont);
        doLabel.setBounds(20, 235, 190, 30);
        doLabel.setFont(textFont);
        finishLabel.setBounds(20, 285, 190, 30);
        finishLabel.setFont(textFont);
        timeLabel.setBounds(20, 335, 190, 30);
        timeLabel.setFont(textFont);
        timeLabel.setForeground(Color.red);

        actionPanel.setBounds(5, 410, 750, 155);
        actionPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        buttonA.setBounds(130, 10, 50, 50);
        buttonB.setBounds(240, 10, 50, 50);
        buttonC.setBounds(350, 10, 50, 50);
        buttonD.setBounds(460, 10, 50, 50);
        buttonA.setHorizontalAlignment(JRadioButton.CENTER);
        buttonB.setHorizontalAlignment(JRadioButton.CENTER);
        buttonC.setHorizontalAlignment(JRadioButton.CENTER);
        buttonD.setHorizontalAlignment(JRadioButton.CENTER);
        buttonA.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buttonB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buttonC.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buttonD.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        buttonPrev.setBounds(130, 90, 100, 40);
        buttonCommit.setBounds(290, 90, 100, 40);
        buttonNext.setBounds(450, 90, 100, 40);

        ButtonGroup group = new ButtonGroup();
        group.add(buttonA);
        group.add(buttonB);
        group.add(buttonC);
        group.add(buttonD);

    }

    @Override
    protected void addListener() {
        buttonA.addActionListener(this);
        buttonB.addActionListener(this);
        buttonC.addActionListener(this);
        buttonD.addActionListener(this);
        buttonPrev.addActionListener(this);
        buttonCommit.addActionListener(this);
        buttonNext.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        switch (e.getActionCommand()) {
            case "A":
                buttonA.setSelected(true);
                break;
            case "B":
                buttonB.setSelected(true);
                break;
            case "C":
                buttonC.setSelected(true);
                break;
            case "D":
                buttonD.setSelected(true);
                break;
            case "上一题":
                buttonPrev.setSelected(true);
                break;
            case "提交":
                buttonCommit.setSelected(true);
                break;
            case "下一题":
                buttonNext.setSelected(true);
                break;
        }
    }

    @Override
    protected void addView() {
        topicPanel.add(scrollPane);

        infoPanel.add(pic);
        infoPanel.add(nowLabel);
        infoPanel.add(totalLabel);
        infoPanel.add(doLabel);
        infoPanel.add(finishLabel);
        infoPanel.add(timeLabel);

        actionPanel.add(buttonA);
        actionPanel.add(buttonB);
        actionPanel.add(buttonC);
        actionPanel.add(buttonD);
        actionPanel.add(buttonPrev);
        actionPanel.add(buttonCommit);
        actionPanel.add(buttonNext);

        this.setLayout(null);
        this.add(topicPanel);
        this.add(infoPanel);
        this.add(actionPanel);

        this.setBounds(400, 300, 1000, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
