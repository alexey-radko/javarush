package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
       Man alex = new Man("alex",12,"Beckendorf");
       Man mica = new Man("mica",12,"Lisakowsk");

        Woman julija = new Woman("julija",32, "Karlsruhe");
        Woman mura = new Woman("mura",2, "Karlsruhe");

        System.out.println(alex);
        System.out.println(mica);
        System.out.println(julija);
        System.out.println(mura);


        //выведи их на экран тут
    }

    public  static  class Man{
        public String name ;
        public  int age;
        public String address;

        public Man(String name)
        {
            this.name = name;
        }

        public Man(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public Man(String name, int age, String adress)
        {
            this.name = name;
            this.age = age;
            this.address = adress;
        }

        @Override
        public String toString()
        {
            return
                    "name " + name +
                    " age " + age +
                    " adress '" + address;
        }
    }
    public static class Woman{

        public String name ;
        public  int age;
        public String address;

        public Woman(String name)
        {
            this.name = name;
        }

        public Woman(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public Woman(String name, int age, String adress)
        {
            this.name = name;
            this.age = age;
            this.address = adress;
        }

        @Override
        public String toString()
        {
            return
                    "name " + name +
                            " age " + age +
                            " adress " + address;
        }

    }
}
