import java.io.File;
import java.io.IOException;

/**
 * ProjectName: javaMaybe
 * Package: PACKAGE_NAME
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/11
 * createTime: 20:17
 */
public class FileTestMain {

    public static void main(String[] args) {

        String path = "src//testpage//test.text";

        File file = new File(path);

        System.out.println(">>> " + file.exists());
        System.out.println(">> " + file.getAbsolutePath());

        if (file.exists()) {
            System.out.println(">>> " + file.isFile());
            boolean delete = false;
            if (file.isFile())
                delete = file.delete();
            System.out.println("delete: " + delete);

        } else {
            boolean create = false;

            File parentFile = file.getParentFile();
            if (!parentFile.exists())
                parentFile.mkdirs();

            try {
                create = file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }


            System.out.println("create: " + create);
        }


    }

}
