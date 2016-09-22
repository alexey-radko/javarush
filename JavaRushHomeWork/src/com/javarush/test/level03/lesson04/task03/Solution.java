package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg1 = new Zerg();
        zerg1.name = "a";
        Zerg zerg2 = new Zerg();
        zerg1.name = "b";
        Zerg zerg3 = new Zerg();
        zerg1.name = "c";
        Zerg zerg4 = new Zerg();
        zerg1.name = "d";
        Zerg zerg5 = new Zerg();
        zerg1.name = "e";
        Zerg zerg6 = new Zerg();
        zerg1.name = "f";
        Zerg zerg7 = new Zerg();
        zerg1.name = "g";
        Zerg zerg8 = new Zerg();
        zerg1.name = "df";
        Zerg zerg9 = new Zerg();
        zerg1.name = "re";
        Zerg zerg10 = new Zerg();
        zerg1.name = "qw";


        Protos protos1 = new Protos();
        protos1.name ="qw";
        Protos protos2 = new Protos();
        protos1.name ="qwx";
        Protos protos3 = new Protos();
        protos1.name ="qwd";
        Protos protos4 = new Protos();
        protos1.name ="qwt";
        Protos protos5 = new Protos();
        protos1.name ="qwe";

        Terran ter1  = new Terran();
        ter1.name ="asb";
        Terran ter2  = new Terran();
        ter1.name ="asg";
        Terran ter3  = new Terran();
        ter1.name ="asj";
        Terran ter4  = new Terran();
        ter1.name ="asf";
        Terran ter5  = new Terran();
        ter1.name ="asfg";
        Terran ter6  = new Terran();
        ter1.name ="aszgf";
        Terran ter7  = new Terran();
        ter1.name ="asz";
        Terran ter8  = new Terran();
        ter1.name ="astz";
        Terran ter9  = new Terran();
        ter1.name ="ase";
        Terran ter10  = new Terran();
        ter1.name ="ast";
        Terran ter11  = new Terran();
        ter1.name ="asf";
        Terran ter12  = new Terran();
        ter1.name ="asc";

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}