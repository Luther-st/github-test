package com.wumeing.github.util;

import java.lang.reflect.Method;

public class ClassUse {

    public static void main(String[] args){
        //Foo的实例对象如何表示
        ClassDemo foo1 = new ClassDemo();

        //第一种表达方式
        Class c1 = ClassDemo.class;

        //第二种表达方式
        Class c2 = foo1.getClass();

        //第三种表达方式
        Class c3 = null;
        try{
            c3 = Class.forName("com.wumeing.github.util.ClassDemo");
            Method method = c3.getDeclaredMethod("ClassDemo1");
            System.out.println(method);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
        System.out.println(c2 == c3);

        try {
            ClassDemo foo = (ClassDemo)c1.newInstance();
            foo.print();
        }catch (InstantiationException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }
}
