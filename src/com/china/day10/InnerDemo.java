package com.china.day10;

/**
 * @author Eric Lee
 * @date 2020/7/29 17:04
 */
public class InnerDemo {
    public static void main(String[] args) {
        // 等号左边： 多态
        // 等号右边 匿名内部类，定义并串讲该接口的子类对象
        FlyAble f =  new FlyAble(){
        @Override
        public void fly() {
            System.out.println("嗷嗷的在飞");
        }
    };
       f.fly();

}
}
