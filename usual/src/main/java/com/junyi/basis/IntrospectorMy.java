package com.junyi.basis;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
 * User: JY
 * Date: 2020/7/18 0018
 * Description:
 */
public class IntrospectorMy {
    public static void main(String[] args) throws Exception {
            BeanInfo info = Introspector.getBeanInfo(Person.class);
            for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
                System.out.println(pd.getName());
                System.out.println("  " + pd.getReadMethod());
                System.out.println("  " + pd.getWriteMethod());
            }
    }

    class Person {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
