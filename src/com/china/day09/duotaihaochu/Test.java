package com.china.day09.duotaihaochu;

/**
 * @author Eric Lee
 * @date 2020/7/25 20:58
 */
public class Test {
    public static void main(String[] args) {

//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        showCatEat(cat);
//        showDogEat(dog);
        // 上面的调用编写了方法去调用eat方法
        // 能否编写一个方法 可以将Cat和Dog都可以作为参数
        // 然后调用eat方法呢？

        // 多态的形式
        Animal a = new Cat();
        // 多态的形式
        Animal a2 = new Dog();

        // 调用
        showAnimalEat(a); // Cat
        showAnimalEat(a2); //Dog

        // 是程序编写变得简单,并且具有良好的扩展性


    }
    public static void showCatEat(Cat cat){
        cat.eat();
    }
    public static void showDogEat(Dog dog ){
        dog.eat();
    }
    // 编写方法使用 Animal类作为方法参数，在方法中调用相应的eat()
    public static void showAnimalEat(Animal animal){
        animal.eat();
    }


}
