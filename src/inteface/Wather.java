package inteface;

/**
 * ProjectName: javaMaybe
 * Package: PACKAGE_NAME
 * className: inteface.Wather
 * describe:
 * create by "zhangDong"
 * createDate: 2019/9/30 0030
 * createTime: 9:24
 */
public class Wather {

    private String name;

    private String pice;

    public Wather(String dw, String pice) {
        this.name = dw;
        this.pice = pice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPice() {
        return pice;
    }

    public void setPice(String pice) {
        this.pice = pice;
    }

    @Override
    public String toString() {
        return "Wather {" +
                "name='" + name + '\'' +
                ", pice='" + pice + '\'' +
                '}';
    }
}
