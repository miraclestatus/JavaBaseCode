package com.china.day16;

        import java.io.FileNotFoundException;

/**
 * @author Eric Lee
 * @date 2020/8/12 17:28
 */
public class ExceptionDemo3 {
    public static void main(String[] args) {
//        try {
//            编写可能会出现异常的地方
//        }catch（异常类型 e）{
//            // 处理异常的代码
//            // 记录日志、打印异常信息、继续抛出异常
//        }finally{
//            无论上面怎样都会执行的操作
//        }
        try{
            read("解忧杂货店.text");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("++++++++++++++");
            System.out.println(e);
        }finally {
            System.out.println("不管上面发生了什么我都会执行");
        }


    }

    public static void read(String path) throws FileNotFoundException {
        if (!path.equals("解忧杂货店.txt")){
            throw new FileNotFoundException("您的文件找不到");
        }
    }


}
