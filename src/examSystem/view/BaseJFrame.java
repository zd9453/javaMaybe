package examSystem.view;

import javax.swing.*;

/**
 * ProjectName: javaMaybe
 * Package: examSystem.view
 * className: BaseJFrame
 * describe:
 * create by "zhangDong"
 * createDate: 2019/11/11 0011
 * createTime: 9:44
 */
public abstract class BaseJFrame extends JFrame {

    public BaseJFrame() {
    }

    public BaseJFrame(String title) {
        super(title);
    }

    // 初始化组件
    protected abstract void initView();

    //给组件绑定事件监听
    protected abstract void addListener();

    //往窗体类添加组件
    protected abstract void addView();

    /**
     * 显示/隐藏窗体视图
     *
     * @param isShow true 显示，组件流程走一波   false 隐藏
     */
    public void showView(boolean isShow) {
        if (isShow) {
            initView();
            addListener();
            addView();
        }
        this.setVisible(isShow);
    }
}
