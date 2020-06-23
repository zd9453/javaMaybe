package io;

/**
 * ProjectName: javaMaybe
 * Package: io
 * className: FileTest
 * describe:
 * create by "zhangDong"
 * createDate: 2019/10/31 0031
 * createTime: 9:52
 */
public class FileTest {

    public static void main(String[] args) {

//        System.out.println(FileUtils.deleteFiles("src//io//copy//text//moDao2.txt"));

       /* FileUtils utils = new FileUtils();

        FileUtils.createFile("src//io//copy//text//utils.txt", false);
        FileOutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            outputStream = new FileOutputStream("src//io//copy//text//utils.txt");
            objectOutputStream = new ObjectOutputStream(outputStream);

            objectOutputStream.writeObject(utils);
            objectOutputStream.writeObject(utils);
            objectOutputStream.writeObject(utils);
            objectOutputStream.flush();

            outputStream.close();
            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != outputStream) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (null != objectOutputStream) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("src//io//copy//text//utils.txt");
            ois = new ObjectInputStream(fis);

            Object object = ois.readObject();
            while (null!=object){
                System.out.println(object.getClass().getName());
                object=ois.readObject();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/


        //总长度
        int total = 634;
        int shortSize = 7;
        int longSize = 13;
        //保证长短各先生产1个，剩余材料在计算
        int sL = total - shortSize - longSize;
        //最大限度的生产长的的个数
        int lC = sL / longSize;
        //记录剩余材料
        int littleL = sL;
        //后续再生产长的个数
        int x = 0;
        //倒序  长的越多  切割次数越少
        for (int i = lC; i >= 0; i--) {
            //生产i个长的剩余的生产短的
            int i1 = (sL - longSize * i) % shortSize;
            if (littleL > i1) {
                littleL = i1;
                x = i;
                //如果剩余为0 则跳出
                if (littleL == 0)
                    break;
            }
        }
        System.out.println("生产13长的：" + (x + 1) + "; 生产7长的：" + (total - (x + 1) * longSize) / shortSize + "; 剩余长度：" + littleL);
    }

}
