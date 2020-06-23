package bankSystem;

import java.io.*;
import java.util.List;

/**
 * ProjectName: javaMaybe
 * Package: io
 * className: FileUtils
 * describe:
 * create by "zhangDong"
 * createDate: 2019/11/4 0004
 * createTime: 10:21
 */
public class FileUtils implements Serializable {
    private static final long serialVersionUID = -4006081085100378921L;


    //字节流什么文件都能读  但是处理纯文本的文件时容易产生问题 因为一个中文占2个字节  按bate[] 数组读可能乱码
    // FileInputStream  FileOutputStream
    //字符流处理纯文本文件
    //FileReader  FileWriter

    /**
     * 遍历文件夹
     *
     * @param file      .
     * @param fileNames 用来装名字的集合
     * @return 子文件的名字集合
     */
    public static List<String> getListFiles(File file, List<String> fileNames) {
        if (null != file) {
            File[] files = file.listFiles();
            if (null != files && files.length != 0) {
                for (File f : files) {
                    getListFiles(f, fileNames);
                }
            }
            fileNames.add(file.getAbsolutePath());
        }
        return fileNames;
    }

    /**
     * 删除文件/文件夹
     *
     * @param file .
     * @return 是否执行完成
     */
    public static boolean deleteFiles(File file) {
        if (null == file || !file.exists())
            return true;
        File[] files = file.listFiles();
        if (null != files && files.length != 0)
            //是文件夹 且有子文件
            for (File f : files)
                deleteFiles(f);

        //执行完成
        return file.delete();
    }

    /**
     * 删除文件/文件夹
     *
     * @param filePath .
     * @return 是否执行完成
     */
    public static boolean deleteFiles(String filePath) {
        if (null == filePath || filePath.length() == 0)
            return true;
        File file = new File(filePath);
        return deleteFiles(file);
    }

    /**
     * 创建文件/文件夹
     *
     * @param file        。
     * @param isDirectory 是否是创建文件夹
     * @return .
     */
    public static boolean createFile(File file, boolean isDirectory) {
        if (null == file)
            return false;
        //创建文件夹
        if (isDirectory) {
            boolean mkdirs = true;
            if (!file.exists()) {
                mkdirs = file.mkdirs();
            }
            return mkdirs;
        } else {
            //创建文件
            if (file.exists()) {
                return true;
            } else {
                boolean newFile = true;
                //父目录不存在则创建父目录
                File parentF = new File(file.getParent());
                if (!parentF.exists())
                    newFile = parentF.mkdirs();
                //创建文件
                try {
                    newFile = file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                    newFile = false;
                }
                return newFile;
            }
        }
    }

    /**
     * 复制文件
     *
     * @param sourceFile 源文件
     * @param targetFile 复制之后存储的文件
     */
    public static void copyFile(File sourceFile, File targetFile) {
        //源文件不存在
        if (null == sourceFile || !sourceFile.exists())
            return;

        //创建目标文件
        boolean create = createFile(targetFile, false);
        //创建复制之后的存储文件失败
        if (!create)
            return;

        //读源文件
        FileInputStream inputStream = null;
        //写目标文件
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(sourceFile);
            outputStream = new FileOutputStream(targetFile);

            System.out.println(System.currentTimeMillis());

            byte[] readByte = new byte[1024];
            //读
            int read = inputStream.read(readByte);
            while (read != -1) {
                //写
                outputStream.write(readByte, 0, read);
                outputStream.flush();
                //继续读
                read = inputStream.read(readByte);
            }
            System.out.println(System.currentTimeMillis());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != inputStream) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != outputStream) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void copyDirectory(File sourceFile, File targetFile) {
        //源文件判断
        if (null == sourceFile || !sourceFile.exists())
            return;
        //创建目标文件夹
        boolean create = createFile(targetFile, true);
        if (!create)
            return;
        //复制源文件内容
        copyContent(sourceFile, targetFile);
    }

    private static void copyContent(File sourceFile, File targetFile) {

        String absolutePath = targetFile.getAbsolutePath();
        String name = sourceFile.getName();
        File newFile = new File(absolutePath + File.separator + name);

        File[] files = sourceFile.listFiles();
        if (null != files) {
            //是文件夹,创建文件夹
            newFile.mkdir();

            if (files.length != 0)
                //有子文件/文件夹
                for (File file : files) {
                    copyContent(file, newFile);
                }
        } else {
            copyFile(sourceFile, newFile);
        }
    }

    /**
     * 创建文件/文件夹
     *
     * @param filePath    文件/文件夹路径
     * @param isDirectory 是否是创建文件夹
     * @return 是否创建成功
     */
    public static boolean createFile(String filePath, boolean isDirectory) {
        if (null == filePath || filePath.length() == 0)
            return false;

        //创建是否成功
        boolean createStatus = false;
        File file = new File(filePath);

        if (isDirectory) {
            //创建文件夹
            if (file.exists() && file.isDirectory())
                createStatus = true;
            else
                createStatus = file.mkdirs();
        } else {
            //创建文件
            if (file.exists() && file.isFile())
                createStatus = true;
            else {
                //父目录
                File parentFile = file.getParentFile();
                if (!parentFile.exists())
                    createStatus = parentFile.mkdirs();
                //创建文件
                try {
                    createStatus = file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                    createStatus = false;
                }
            }
        }

        return createStatus;
    }

}
