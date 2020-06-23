package examSystem;

import examSystem.view.LoginFrame;

/**
 * ProjectName: javaMaybe
 * describe:
 * create by "zhangDong"
 * createDate: 2019/11/11 0011
 * createTime: 11:11
 */
public class ExamMain {

    public static void main(String[] args) {
        LoginFrame loginFrame = new LoginFrame("this is window name");
        loginFrame.showView(true);


    }

}
