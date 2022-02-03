package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item6.sellIn = 1;
        item6.sellIn = 32;
        item6.sellIn = (byte) 10;
        java.lang.String str13 = item6.toString();
        java.lang.String str14 = item6.name;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 10, 0" + "'", str13, "hi!, 10, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = conjuredItemUpdater11.update(item15);
        com.gildedrose.Item item21 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str22 = item21.name;
        java.lang.String str23 = item21.name;
        int int24 = item21.quality;
        java.lang.String str25 = item21.toString();
        com.gildedrose.Item item26 = conjuredItemUpdater11.update(item21);
        java.lang.String str27 = item26.name;
        item26.name = "hi!, 99, 0";
        com.gildedrose.Item item30 = itemUpdater10.update(item26);
        java.lang.String str31 = item26.toString();
        item26.name = "hi!, 99, 0, 100, 52";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!, 100, 1" + "'", str25, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!, 99, 0, 98, 0" + "'", str31, "hi!, 99, 0, 98, 0");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 50, 33", 10, (int) '4');
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        java.lang.String str14 = item8.toString();
        item8.sellIn = 1;
        int int17 = item8.sellIn;
        int int18 = item8.quality;
        item8.quality = 0;
        item8.quality = (short) 100;
        java.lang.Class<?> wildcardClass23 = item8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1, 52, 52", 97, 48);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item16 = new com.gildedrose.Item("hi!", 100, 1);
        com.gildedrose.Item item17 = itemUpdater12.update(item16);
        item16.quality = (-4);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(item17);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -4, 0");
        java.lang.Class<?> wildcardClass7 = itemUpdaterFactory0.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 32, (int) (byte) 0);
        item3.quality = 32;
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) 10, (int) (short) 10);
        java.lang.String str4 = item3.toString();
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 10, 10" + "'", str4, ", 10, 10");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, -1", (-2), 49);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        item3.sellIn = 99;
        int int6 = item3.sellIn;
        item3.quality = 96;
        item3.quality = 35;
        int int11 = item3.quality;
        java.lang.Class<?> wildcardClass12 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 10, (int) '4');
        item3.quality = (short) -1;
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory14 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.Item item25 = new com.gildedrose.Item("hi!", 100, 1);
        int int26 = item25.sellIn;
        com.gildedrose.Item item27 = itemUpdater21.update(item25);
        com.gildedrose.Item item28 = itemUpdater16.update(item27);
        com.gildedrose.Item item29 = itemUpdater7.update(item28);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater30 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!", 100, 1);
        int int35 = item34.sellIn;
        com.gildedrose.Item item36 = conjuredItemUpdater30.update(item34);
        com.gildedrose.Item item37 = itemUpdater7.update(item34);
        com.gildedrose.Item item41 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        com.gildedrose.Item item42 = itemUpdater7.update(item41);
        com.gildedrose.Item item43 = itemUpdater4.update(item41);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory44 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater46 = itemUpdaterFactory44.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater48 = itemUpdaterFactory44.getInstance("");
        com.gildedrose.Item item52 = new com.gildedrose.Item("hi!", 100, 1);
        int int53 = item52.sellIn;
        com.gildedrose.Item item54 = itemUpdater48.update(item52);
        java.lang.String str55 = item52.toString();
        java.lang.String str56 = item52.name;
        com.gildedrose.Item item57 = itemUpdater4.update(item52);
        int int58 = item52.quality;
        java.lang.String str59 = item52.name;
        java.lang.String str60 = item52.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(item42);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertNotNull(itemUpdater46);
        org.junit.Assert.assertNotNull(itemUpdater48);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertNotNull(item54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!, 99, 0" + "'", str55, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!, 98, 0" + "'", str60, "hi!, 98, 0");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", 99, (int) (short) 10);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        item6.sellIn = (byte) 0;
        java.lang.String str11 = item6.name;
        item6.quality = 96;
        int int14 = item6.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 32, (int) (byte) 0);
        item3.sellIn = 51;
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        item11.sellIn = (byte) 0;
        com.gildedrose.Item item16 = itemUpdater4.update(item11);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory20 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.Item item28 = new com.gildedrose.Item("hi!", 100, 1);
        int int29 = item28.sellIn;
        com.gildedrose.Item item30 = itemUpdater24.update(item28);
        com.gildedrose.Item item31 = itemUpdater19.update(item30);
        com.gildedrose.Item item32 = itemUpdater4.update(item31);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory33 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory33.getInstance("");
        com.gildedrose.Item item39 = new com.gildedrose.Item("hi!", 100, 1);
        int int40 = item39.sellIn;
        com.gildedrose.Item item41 = itemUpdater35.update(item39);
        com.gildedrose.Item item42 = itemUpdater4.update(item41);
        com.gildedrose.Item item46 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str47 = item46.name;
        java.lang.String str48 = item46.toString();
        java.lang.String str49 = item46.toString();
        com.gildedrose.Item item50 = itemUpdater4.update(item46);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory51 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater53 = itemUpdaterFactory51.getInstance("");
        com.gildedrose.Item item57 = new com.gildedrose.Item("hi!", 100, 1);
        int int58 = item57.sellIn;
        com.gildedrose.Item item59 = itemUpdater53.update(item57);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory60 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater62 = itemUpdaterFactory60.getInstance("");
        com.gildedrose.Item item66 = new com.gildedrose.Item("hi!", 100, 1);
        int int67 = item66.sellIn;
        com.gildedrose.Item item68 = itemUpdater62.update(item66);
        item66.sellIn = (byte) 0;
        java.lang.String str71 = item66.toString();
        com.gildedrose.Item item72 = itemUpdater53.update(item66);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory73 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater75 = itemUpdaterFactory73.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater77 = itemUpdaterFactory73.getInstance("");
        com.gildedrose.Item item81 = new com.gildedrose.Item("hi!", 100, 1);
        int int82 = item81.sellIn;
        com.gildedrose.Item item83 = itemUpdater77.update(item81);
        java.lang.String str84 = item81.toString();
        item81.sellIn = 10;
        java.lang.String str87 = item81.toString();
        item81.sellIn = 98;
        item81.sellIn = (byte) 10;
        com.gildedrose.Item item92 = itemUpdater53.update(item81);
        int int93 = item92.quality;
        com.gildedrose.Item item94 = itemUpdater4.update(item92);
        java.lang.String str95 = item94.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertNotNull(item42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!, 0, 0" + "'", str47, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str48, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str49, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item50);
        org.junit.Assert.assertNotNull(itemUpdater53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertNotNull(item59);
        org.junit.Assert.assertNotNull(itemUpdater62);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 100 + "'", int67 == 100);
        org.junit.Assert.assertNotNull(item68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!, 0, 0" + "'", str71, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item72);
        org.junit.Assert.assertNotNull(itemUpdater75);
        org.junit.Assert.assertNotNull(itemUpdater77);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 100 + "'", int82 == 100);
        org.junit.Assert.assertNotNull(item83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!, 99, 0" + "'", str84, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!, 10, 0" + "'", str87, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(item94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "hi!, 8, 0" + "'", str95, "hi!, 8, 0");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        int int14 = item11.sellIn;
        int int15 = item11.sellIn;
        com.gildedrose.Item item16 = itemUpdater4.update(item11);
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        int int21 = item20.quality;
        com.gildedrose.Item item22 = itemUpdater4.update(item20);
        java.lang.String str23 = item20.name;
        item20.sellIn = (short) 10;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 100, 1" + "'", str23, "hi!, 100, 1");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        int int9 = item4.quality;
        int int10 = item4.sellIn;
        item4.sellIn = (short) 100;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory12 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        com.gildedrose.Item item23 = itemUpdater11.update(item22);
        com.gildedrose.Item item24 = itemUpdater2.update(item23);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater25 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item29 = new com.gildedrose.Item("hi!", 100, 1);
        int int30 = item29.sellIn;
        com.gildedrose.Item item31 = conjuredItemUpdater25.update(item29);
        com.gildedrose.Item item32 = itemUpdater2.update(item29);
        item29.name = "hi!, -1, 52";
        java.lang.String str35 = item29.name;
        item29.sellIn = (byte) 10;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!, -1, 52" + "'", str35, "hi!, -1, 52");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 0");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!, 10, 0", (int) (byte) 1, (int) (short) 1);
        item20.name = "hi!, 10, 0, 10, 0";
        com.gildedrose.Item item23 = itemUpdater16.update(item20);
        java.lang.String str24 = item23.toString();
        item23.name = "hi!, 0, 0, 0, 1, 52, 97";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!, 10, 0, 10, 0, 0, 0" + "'", str24, "hi!, 10, 0, 10, 0, 0, 0");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item13 = new com.gildedrose.Item("hi!", 100, 1);
        int int14 = item13.sellIn;
        com.gildedrose.Item item15 = itemUpdater9.update(item13);
        java.lang.String str16 = item13.toString();
        item13.sellIn = 10;
        java.lang.String str19 = item13.toString();
        item13.sellIn = 1;
        com.gildedrose.Item item22 = itemUpdater4.update(item13);
        java.lang.String str23 = item13.name;
        int int24 = item13.quality;
        int int25 = item13.sellIn;
        item13.name = "hi!, 0, 0, 99, 0, 50, 49, -2, 52";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 99, 0" + "'", str16, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 10, 0" + "'", str19, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        java.lang.String str14 = item8.toString();
        item8.sellIn = 98;
        item8.sellIn = (byte) 10;
        item8.sellIn = (-1);
        java.lang.String str21 = item8.name;
        java.lang.String str22 = item8.name;
        int int23 = item8.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 0");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!, 10, 0", (int) (byte) 1, (int) (short) 1);
        item20.name = "hi!, 10, 0, 10, 0";
        com.gildedrose.Item item23 = itemUpdater16.update(item20);
        java.lang.String str24 = item20.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!, 10, 0, 10, 0, 0, 0" + "'", str24, "hi!, 10, 0, 10, 0, 0, 0");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 52, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -4, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -1, 1, 8, 30");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory9.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory9.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory9.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item23 = new com.gildedrose.Item("", 1, (int) ' ');
        java.lang.String str24 = item23.name;
        item23.sellIn = 'a';
        com.gildedrose.Item item27 = itemUpdater19.update(item23);
        com.gildedrose.Item item28 = itemUpdater8.update(item27);
        java.lang.String str29 = item27.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ", 95, 30" + "'", str29, ", 95, 30");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        int int9 = item4.quality;
        item4.quality = (short) -1;
        item4.name = "hi!";
        item4.name = ", 1, 32";
        int int16 = item4.quality;
        item4.sellIn = (byte) 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str9 = item8.name;
        java.lang.String str10 = item8.toString();
        com.gildedrose.Item item11 = itemUpdater4.update(item8);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory12 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        java.lang.String str23 = item20.toString();
        item20.sellIn = 10;
        java.lang.String str26 = item20.toString();
        item20.sellIn = 98;
        int int29 = item20.sellIn;
        com.gildedrose.Item item30 = itemUpdater4.update(item20);
        item30.quality = (byte) 0;
        item30.sellIn = 'a';
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 0, 0" + "'", str9, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str10, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 99, 0" + "'", str23, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!, 10, 0" + "'", str26, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 98 + "'", int29 == 98);
        org.junit.Assert.assertNotNull(item30);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        item15.sellIn = (byte) 0;
        java.lang.String str20 = item15.toString();
        com.gildedrose.Item item21 = itemUpdater2.update(item15);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory22 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.Item item30 = new com.gildedrose.Item("hi!", 100, 1);
        int int31 = item30.sellIn;
        com.gildedrose.Item item32 = itemUpdater26.update(item30);
        java.lang.String str33 = item30.toString();
        item30.sellIn = 10;
        java.lang.String str36 = item30.toString();
        item30.sellIn = 98;
        item30.sellIn = (byte) 10;
        com.gildedrose.Item item41 = itemUpdater2.update(item30);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory42 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater44 = itemUpdaterFactory42.getInstance("");
        com.gildedrose.Item item48 = new com.gildedrose.Item("hi!", 100, 1);
        int int49 = item48.sellIn;
        com.gildedrose.Item item50 = itemUpdater44.update(item48);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory51 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater53 = itemUpdaterFactory51.getInstance("");
        com.gildedrose.Item item57 = new com.gildedrose.Item("hi!", 100, 1);
        int int58 = item57.sellIn;
        com.gildedrose.Item item59 = itemUpdater53.update(item57);
        item57.sellIn = (byte) 0;
        java.lang.String str62 = item57.toString();
        com.gildedrose.Item item63 = itemUpdater44.update(item57);
        com.gildedrose.Item item64 = itemUpdater2.update(item63);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory65 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater67 = itemUpdaterFactory65.getInstance("");
        com.gildedrose.Item item71 = new com.gildedrose.Item("hi!", 100, 1);
        int int72 = item71.sellIn;
        com.gildedrose.Item item73 = itemUpdater67.update(item71);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory74 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater76 = itemUpdaterFactory74.getInstance("");
        com.gildedrose.Item item80 = new com.gildedrose.Item("hi!", 100, 1);
        int int81 = item80.sellIn;
        com.gildedrose.Item item82 = itemUpdater76.update(item80);
        item80.sellIn = (byte) 0;
        java.lang.String str85 = item80.toString();
        com.gildedrose.Item item86 = itemUpdater67.update(item80);
        item86.quality = 96;
        com.gildedrose.Item item89 = itemUpdater2.update(item86);
        item89.quality = (-1);
        java.lang.Class<?> wildcardClass92 = item89.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!, 99, 0" + "'", str33, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 10, 0" + "'", str36, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertNotNull(itemUpdater44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertNotNull(item50);
        org.junit.Assert.assertNotNull(itemUpdater53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertNotNull(item59);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!, 0, 0" + "'", str62, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item63);
        org.junit.Assert.assertNotNull(item64);
        org.junit.Assert.assertNotNull(itemUpdater67);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 100 + "'", int72 == 100);
        org.junit.Assert.assertNotNull(item73);
        org.junit.Assert.assertNotNull(itemUpdater76);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 100 + "'", int81 == 100);
        org.junit.Assert.assertNotNull(item82);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!, 0, 0" + "'", str85, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item86);
        org.junit.Assert.assertNotNull(item89);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) '4', (int) (byte) 1);
        java.lang.String str4 = item3.name;
        item3.quality = 'a';
        int int7 = item3.sellIn;
        item3.name = "hi!, 0, 0, 0, 1";
        java.lang.String str10 = item3.toString();
        int int11 = item3.sellIn;
        java.lang.String str12 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 0, 0, 0, 1, 52, 97" + "'", str10, "hi!, 0, 0, 0, 1, 52, 97");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str12, "hi!, 0, 0, 0, 1");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.toString();
        java.lang.String str7 = item3.toString();
        int int8 = item3.quality;
        item3.name = "";
        item3.name = ", 100, 1";
        int int13 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 100, 1" + "'", str6, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 100, 1" + "'", str7, "hi!, 100, 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory15 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory18 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory18.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory18.getInstance("");
        com.gildedrose.Item item26 = new com.gildedrose.Item("hi!", 100, 1);
        int int27 = item26.sellIn;
        com.gildedrose.Item item28 = itemUpdater22.update(item26);
        com.gildedrose.Item item29 = itemUpdater17.update(item28);
        int int30 = item29.sellIn;
        int int31 = item29.quality;
        item29.quality = (short) 10;
        java.lang.String str34 = item29.name;
        com.gildedrose.Item item35 = itemUpdater14.update(item29);
        java.lang.String str36 = item29.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 98 + "'", int30 == 98);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 98, 0", (int) (byte) 1, 8);
        item3.name = "hi!, 99, 0, 100, 52";
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        java.lang.Class<?> wildcardClass11 = itemUpdater10.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 100, 52", (-4), (int) (short) -1);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -2, 50", (int) 'a', 0);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 99");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -3, 49");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", (int) (byte) 10, (int) (short) 100);
        item3.sellIn = ' ';
        item3.sellIn = (byte) 10;
        item3.name = "hi!, 100, -1";
        item3.sellIn = (byte) -1;
        item3.sellIn = (-4);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str13 = item12.name;
        java.lang.String str14 = item12.name;
        com.gildedrose.Item item15 = itemUpdater8.update(item12);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory16.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory16.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory16.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory16.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory16.getInstance("hi!, 100, 1, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!, -1, 0", (int) (byte) -1, (int) (short) 0);
        java.lang.String str35 = item34.toString();
        com.gildedrose.Item item36 = itemUpdater30.update(item34);
        com.gildedrose.Item item37 = itemUpdater8.update(item34);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory38 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater40 = itemUpdaterFactory38.getInstance("");
        com.gildedrose.Item item44 = new com.gildedrose.Item("hi!", 100, 1);
        int int45 = item44.sellIn;
        com.gildedrose.Item item46 = itemUpdater40.update(item44);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory47 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater49 = itemUpdaterFactory47.getInstance("");
        com.gildedrose.Item item53 = new com.gildedrose.Item("hi!", 100, 1);
        int int54 = item53.sellIn;
        com.gildedrose.Item item55 = itemUpdater49.update(item53);
        item53.sellIn = (byte) 0;
        java.lang.String str58 = item53.toString();
        com.gildedrose.Item item59 = itemUpdater40.update(item53);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory60 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater62 = itemUpdaterFactory60.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater64 = itemUpdaterFactory60.getInstance("");
        com.gildedrose.Item item68 = new com.gildedrose.Item("hi!", 100, 1);
        int int69 = item68.sellIn;
        com.gildedrose.Item item70 = itemUpdater64.update(item68);
        java.lang.String str71 = item68.toString();
        item68.sellIn = 10;
        java.lang.String str74 = item68.toString();
        item68.sellIn = 98;
        item68.sellIn = (byte) 10;
        com.gildedrose.Item item79 = itemUpdater40.update(item68);
        int int80 = item79.sellIn;
        com.gildedrose.Item item81 = itemUpdater8.update(item79);
        java.lang.String str82 = item81.name;
        java.lang.String str83 = item81.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 0, 0" + "'", str13, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 0, 0" + "'", str14, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!, -1, 0, -1, 0" + "'", str35, "hi!, -1, 0, -1, 0");
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(itemUpdater40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertNotNull(item46);
        org.junit.Assert.assertNotNull(itemUpdater49);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertNotNull(item55);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!, 0, 0" + "'", str58, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item59);
        org.junit.Assert.assertNotNull(itemUpdater62);
        org.junit.Assert.assertNotNull(itemUpdater64);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertNotNull(item70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!, 99, 0" + "'", str71, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!, 10, 0" + "'", str74, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 9 + "'", int80 == 9);
        org.junit.Assert.assertNotNull(item81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!, 8, 0" + "'", str83, "hi!, 8, 0");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        java.lang.String str4 = item3.toString();
        int int5 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 10, 0" + "'", str4, "hi!, 100, 1, 10, 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.name;
        item3.name = "hi!, 100, 52";
        item3.sellIn = ' ';
        int int11 = item3.quality;
        int int12 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 52", 1, 98);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory11.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory11.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory11.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory11.getInstance("hi!, 100, 1");
        com.gildedrose.Item item27 = new com.gildedrose.Item("hi!", (int) '4', (int) (byte) 1);
        com.gildedrose.Item item28 = itemUpdater23.update(item27);
        com.gildedrose.Item item29 = itemUpdater10.update(item28);
        item29.quality = 8;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(item29);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        item15.sellIn = (byte) 0;
        java.lang.String str20 = item15.toString();
        com.gildedrose.Item item21 = itemUpdater2.update(item15);
        item21.quality = '4';
        int int24 = item21.sellIn;
        item21.name = "hi!, 1, 0";
        item21.quality = 0;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        java.lang.String str14 = item8.toString();
        item8.sellIn = 98;
        item8.sellIn = (byte) 10;
        item8.sellIn = (-1);
        java.lang.String str21 = item8.name;
        java.lang.String str22 = item8.name;
        item8.name = "";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        int int10 = item6.sellIn;
        int int11 = item6.quality;
        java.lang.String str12 = item6.name;
        item6.quality = 9;
        int int15 = item6.quality;
        java.lang.String str16 = item6.toString();
        int int17 = item6.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 99, 9" + "'", str16, "hi!, 99, 9");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        item8.name = "hi!, -1, 0";
        item8.sellIn = (byte) 100;
        item8.quality = (short) 1;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        int int9 = item4.quality;
        item4.quality = (short) -1;
        item4.name = "hi!";
        item4.name = "hi!, 0, 0, 0, 1";
        item4.sellIn = (-2);
        java.lang.String str18 = item4.toString();
        java.lang.String str19 = item4.name;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 0, 0, 0, 1, -2, -1" + "'", str18, "hi!, 0, 0, 0, 1, -2, -1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str19, "hi!, 0, 0, 0, 1");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        com.gildedrose.Item item19 = new com.gildedrose.Item("hi!, 99, 0", (int) (short) 0, 52);
        item19.sellIn = (short) 10;
        com.gildedrose.Item item22 = itemUpdater10.update(item19);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory23 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory23.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory23.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory23.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater31 = itemUpdaterFactory23.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory23.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory23.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory36 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory36.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater40 = itemUpdaterFactory36.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory36.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater44 = itemUpdaterFactory36.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory45 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater47 = itemUpdaterFactory45.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater49 = itemUpdaterFactory45.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater51 = itemUpdaterFactory45.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory52 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater54 = itemUpdaterFactory52.getInstance("");
        com.gildedrose.Item item58 = new com.gildedrose.Item("hi!", 100, 1);
        int int59 = item58.sellIn;
        com.gildedrose.Item item60 = itemUpdater54.update(item58);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory61 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater63 = itemUpdaterFactory61.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater65 = itemUpdaterFactory61.getInstance("");
        com.gildedrose.Item item69 = new com.gildedrose.Item("hi!", 100, 1);
        int int70 = item69.sellIn;
        com.gildedrose.Item item71 = itemUpdater65.update(item69);
        java.lang.String str72 = item69.toString();
        item69.sellIn = 10;
        java.lang.String str75 = item69.toString();
        item69.sellIn = 98;
        com.gildedrose.Item item78 = itemUpdater54.update(item69);
        com.gildedrose.Item item79 = itemUpdater51.update(item78);
        com.gildedrose.Item item83 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item83.sellIn = (byte) 100;
        java.lang.String str86 = item83.name;
        item83.name = "hi!, -1, 0";
        item83.name = "hi!";
        java.lang.String str91 = item83.toString();
        com.gildedrose.Item item92 = itemUpdater51.update(item83);
        java.lang.String str93 = item92.name;
        com.gildedrose.Item item94 = itemUpdater44.update(item92);
        item94.quality = (byte) 0;
        com.gildedrose.Item item97 = itemUpdater35.update(item94);
        com.gildedrose.Item item98 = itemUpdater10.update(item97);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater29);
        org.junit.Assert.assertNotNull(itemUpdater31);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertNotNull(itemUpdater40);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertNotNull(itemUpdater44);
        org.junit.Assert.assertNotNull(itemUpdater47);
        org.junit.Assert.assertNotNull(itemUpdater49);
        org.junit.Assert.assertNotNull(itemUpdater51);
        org.junit.Assert.assertNotNull(itemUpdater54);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertNotNull(item60);
        org.junit.Assert.assertNotNull(itemUpdater63);
        org.junit.Assert.assertNotNull(itemUpdater65);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 100 + "'", int70 == 100);
        org.junit.Assert.assertNotNull(item71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!, 99, 0" + "'", str72, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!, 10, 0" + "'", str75, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item78);
        org.junit.Assert.assertNotNull(item79);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!, 99, 0" + "'", str86, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "hi!, 100, 52" + "'", str91, "hi!, 100, 52");
        org.junit.Assert.assertNotNull(item92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi!" + "'", str93, "hi!");
        org.junit.Assert.assertNotNull(item94);
        org.junit.Assert.assertNotNull(item97);
        org.junit.Assert.assertNotNull(item98);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10", (int) (byte) 100, 100);
        item3.quality = (byte) 0;
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 10, 10", (-1), 8);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 9, 1, 100, 1", (-4), (int) (byte) 0);
        item3.quality = 100;
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        java.lang.Class<?> wildcardClass11 = itemUpdater10.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        item15.sellIn = (byte) 0;
        java.lang.String str20 = item15.toString();
        com.gildedrose.Item item21 = itemUpdater2.update(item15);
        item21.quality = '4';
        item21.sellIn = 10;
        java.lang.String str26 = item21.toString();
        int int27 = item21.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!, 10, 52" + "'", str26, "hi!, 10, 52");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0, 0, 98" + "'", str4, "hi!, 0, 0, 0, 98");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        item3.quality = 9;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0" + "'", str4, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 0, 0" + "'", str5, "hi!, 0, 0");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        int int15 = item14.quality;
        item14.quality = 99;
        com.gildedrose.Item item18 = itemUpdater10.update(item14);
        item18.sellIn = 32;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(item18);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50", (int) (short) 1, (int) (short) 100);
        item3.quality = (byte) -1;
        item3.sellIn = (byte) 10;
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 0, 50, 10, -1" + "'", str8, ", 0, 50, 10, -1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 0, 50, 10, -1" + "'", str9, ", 0, 50, 10, -1");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        item11.sellIn = (byte) 0;
        com.gildedrose.Item item16 = itemUpdater4.update(item11);
        java.lang.String str17 = item11.toString();
        int int18 = item11.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, -1, 0" + "'", str17, "hi!, -1, 0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        int int14 = item11.sellIn;
        int int15 = item11.sellIn;
        com.gildedrose.Item item16 = itemUpdater4.update(item11);
        java.lang.String str17 = item11.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = (short) -1;
        java.lang.String str14 = item8.name;
        int int15 = item8.sellIn;
        java.lang.String str16 = item8.toString();
        item8.quality = (byte) 0;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, -1, 0" + "'", str16, "hi!, -1, 0");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        item15.sellIn = (byte) 0;
        java.lang.String str20 = item15.toString();
        com.gildedrose.Item item21 = itemUpdater2.update(item15);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory22 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.Item item30 = new com.gildedrose.Item("hi!", 100, 1);
        int int31 = item30.sellIn;
        com.gildedrose.Item item32 = itemUpdater26.update(item30);
        java.lang.String str33 = item30.toString();
        item30.sellIn = 10;
        java.lang.String str36 = item30.toString();
        item30.sellIn = 98;
        item30.sellIn = (byte) 10;
        com.gildedrose.Item item41 = itemUpdater2.update(item30);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory42 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater44 = itemUpdaterFactory42.getInstance("");
        com.gildedrose.Item item48 = new com.gildedrose.Item("hi!", 100, 1);
        int int49 = item48.sellIn;
        com.gildedrose.Item item50 = itemUpdater44.update(item48);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory51 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater53 = itemUpdaterFactory51.getInstance("");
        com.gildedrose.Item item57 = new com.gildedrose.Item("hi!", 100, 1);
        int int58 = item57.sellIn;
        com.gildedrose.Item item59 = itemUpdater53.update(item57);
        item57.sellIn = (byte) 0;
        java.lang.String str62 = item57.toString();
        com.gildedrose.Item item63 = itemUpdater44.update(item57);
        com.gildedrose.Item item64 = itemUpdater2.update(item63);
        com.gildedrose.Item item68 = new com.gildedrose.Item("hi!, -1, 52", 0, 9);
        com.gildedrose.Item item69 = itemUpdater2.update(item68);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!, 99, 0" + "'", str33, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 10, 0" + "'", str36, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertNotNull(itemUpdater44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertNotNull(item50);
        org.junit.Assert.assertNotNull(itemUpdater53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertNotNull(item59);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!, 0, 0" + "'", str62, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item63);
        org.junit.Assert.assertNotNull(item64);
        org.junit.Assert.assertNotNull(item69);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1", 34, 48);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance(", 0, 50, 10, -1");
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!, -1, 0", 51, 97);
        com.gildedrose.Item item11 = itemUpdater6.update(item10);
        item10.quality = (short) 0;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(item11);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 0, 50, 10, -1");
        java.lang.Class<?> wildcardClass5 = itemUpdater4.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 0", 31, 35);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory14 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory19 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory19.getInstance("");
        com.gildedrose.Item item25 = new com.gildedrose.Item("hi!", 100, 1);
        int int26 = item25.sellIn;
        com.gildedrose.Item item27 = itemUpdater21.update(item25);
        item25.sellIn = (byte) 0;
        com.gildedrose.Item item30 = itemUpdater18.update(item25);
        com.gildedrose.Item item31 = itemUpdater8.update(item30);
        com.gildedrose.Item item35 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str36 = item35.name;
        java.lang.String str37 = item35.toString();
        com.gildedrose.Item item38 = itemUpdater8.update(item35);
        item38.quality = 51;
        item38.quality = 100;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 0, 0" + "'", str36, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!, 0, 0, 32, 0" + "'", str37, "hi!, 0, 0, 32, 0");
        org.junit.Assert.assertNotNull(item38);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        item15.sellIn = (byte) 0;
        java.lang.String str20 = item15.toString();
        com.gildedrose.Item item21 = itemUpdater2.update(item15);
        item21.quality = '4';
        int int24 = item21.sellIn;
        java.lang.String str25 = item21.name;
        java.lang.String str26 = item21.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!, -1, 52" + "'", str26, "hi!, -1, 52");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.Item item13 = new com.gildedrose.Item("hi!", 100, 1);
        int int14 = item13.sellIn;
        com.gildedrose.Item item15 = itemUpdater9.update(item13);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.Item item24 = new com.gildedrose.Item("hi!", 100, 1);
        int int25 = item24.sellIn;
        com.gildedrose.Item item26 = itemUpdater20.update(item24);
        java.lang.String str27 = item24.toString();
        item24.sellIn = 10;
        java.lang.String str30 = item24.toString();
        item24.sellIn = 98;
        com.gildedrose.Item item33 = itemUpdater9.update(item24);
        com.gildedrose.Item item34 = itemUpdater6.update(item33);
        com.gildedrose.Item item38 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item38.sellIn = (byte) 100;
        java.lang.String str41 = item38.name;
        item38.name = "hi!, -1, 0";
        item38.name = "hi!";
        java.lang.String str46 = item38.toString();
        com.gildedrose.Item item47 = itemUpdater6.update(item38);
        java.lang.String str48 = item38.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!, 99, 0" + "'", str27, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!, 10, 0" + "'", str30, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!, 99, 0" + "'", str41, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!, 100, 52" + "'", str46, "hi!, 100, 52");
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!, 99, 50" + "'", str48, "hi!, 99, 50");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.name = "hi!, 10, 0";
        item8.name = "";
        item8.quality = 34;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        item3.name = "hi!, 100, 1, 10, 0";
        item3.sellIn = 51;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0" + "'", str4, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 0, 0, 32, 0" + "'", str5, "hi!, 0, 0, 32, 0");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1, 10, 32", 52, 100);
        item3.quality = ' ';
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 32", (int) (short) 1, 34);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory12 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        com.gildedrose.Item item23 = itemUpdater11.update(item22);
        com.gildedrose.Item item24 = itemUpdater2.update(item23);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater25 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item29 = new com.gildedrose.Item("hi!", 100, 1);
        int int30 = item29.sellIn;
        com.gildedrose.Item item31 = conjuredItemUpdater25.update(item29);
        com.gildedrose.Item item32 = itemUpdater2.update(item29);
        int int33 = item29.quality;
        item29.sellIn = 51;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance(", 100, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory9.getInstance("hi!, 100, 52");
        com.gildedrose.Item item21 = new com.gildedrose.Item("hi!, 100, 1", (int) '4', (int) '#');
        com.gildedrose.Item item22 = itemUpdater17.update(item21);
        item22.name = "hi!, 10, 0, 10, 1, 1, -1";
        item22.name = "hi!, -1, 0";
        com.gildedrose.Item item27 = itemUpdater8.update(item22);
        java.lang.Class<?> wildcardClass28 = item27.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory12 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        com.gildedrose.Item item23 = itemUpdater11.update(item22);
        com.gildedrose.Item item24 = itemUpdater2.update(item23);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater25 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item29 = new com.gildedrose.Item("hi!", 100, 1);
        int int30 = item29.sellIn;
        com.gildedrose.Item item31 = conjuredItemUpdater25.update(item29);
        com.gildedrose.Item item32 = itemUpdater2.update(item29);
        com.gildedrose.Item item36 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        com.gildedrose.Item item37 = itemUpdater2.update(item36);
        java.lang.Class<?> wildcardClass38 = itemUpdater2.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 32, (int) (byte) 0);
        item3.sellIn = 51;
        java.lang.String str6 = item3.toString();
        item3.sellIn = (short) -1;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 99, 0, 51, 0" + "'", str6, "hi!, 99, 0, 51, 0");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str9 = item8.name;
        java.lang.String str10 = item8.toString();
        com.gildedrose.Item item11 = itemUpdater4.update(item8);
        java.lang.Class<?> wildcardClass12 = item8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 0, 0" + "'", str9, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str10, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance(", 100, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -2, 50");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory7.getInstance("hi!, -1, 0");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str16 = item15.name;
        java.lang.String str17 = item15.toString();
        com.gildedrose.Item item18 = itemUpdater11.update(item15);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory19 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory19.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory19.getInstance("");
        com.gildedrose.Item item27 = new com.gildedrose.Item("hi!", 100, 1);
        int int28 = item27.sellIn;
        com.gildedrose.Item item29 = itemUpdater23.update(item27);
        java.lang.String str30 = item27.toString();
        item27.sellIn = 10;
        java.lang.String str33 = item27.toString();
        item27.sellIn = 98;
        int int36 = item27.sellIn;
        com.gildedrose.Item item37 = itemUpdater11.update(item27);
        com.gildedrose.Item item38 = itemUpdater6.update(item37);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory39 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater41 = itemUpdaterFactory39.getInstance("");
        com.gildedrose.Item item45 = new com.gildedrose.Item("hi!", 100, 1);
        int int46 = item45.sellIn;
        com.gildedrose.Item item47 = itemUpdater41.update(item45);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory48 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater50 = itemUpdaterFactory48.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory51 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater53 = itemUpdaterFactory51.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater55 = itemUpdaterFactory51.getInstance("");
        com.gildedrose.Item item59 = new com.gildedrose.Item("hi!", 100, 1);
        int int60 = item59.sellIn;
        com.gildedrose.Item item61 = itemUpdater55.update(item59);
        com.gildedrose.Item item62 = itemUpdater50.update(item61);
        com.gildedrose.Item item63 = itemUpdater41.update(item62);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory64 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater66 = itemUpdaterFactory64.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater68 = itemUpdaterFactory64.getInstance("");
        com.gildedrose.Item item72 = new com.gildedrose.Item("hi!", 100, 1);
        int int73 = item72.sellIn;
        com.gildedrose.Item item74 = itemUpdater68.update(item72);
        java.lang.String str75 = item72.toString();
        item72.sellIn = 10;
        int int78 = item72.sellIn;
        item72.name = "hi!, 10, 0";
        int int81 = item72.sellIn;
        com.gildedrose.Item item82 = itemUpdater41.update(item72);
        com.gildedrose.Item item86 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        item86.name = "hi!, 10, 0";
        item86.name = "hi!, -1, 1";
        com.gildedrose.Item item91 = itemUpdater41.update(item86);
        com.gildedrose.Item item95 = new com.gildedrose.Item("hi!", (int) (short) 100, (int) (byte) -1);
        int int96 = item95.quality;
        java.lang.String str97 = item95.toString();
        com.gildedrose.Item item98 = itemUpdater41.update(item95);
        com.gildedrose.Item item99 = itemUpdater6.update(item98);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 0, 0" + "'", str16, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str17, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!, 99, 0" + "'", str30, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!, 10, 0" + "'", str33, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 98 + "'", int36 == 98);
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(item38);
        org.junit.Assert.assertNotNull(itemUpdater41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertNotNull(itemUpdater50);
        org.junit.Assert.assertNotNull(itemUpdater53);
        org.junit.Assert.assertNotNull(itemUpdater55);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertNotNull(item61);
        org.junit.Assert.assertNotNull(item62);
        org.junit.Assert.assertNotNull(item63);
        org.junit.Assert.assertNotNull(itemUpdater66);
        org.junit.Assert.assertNotNull(itemUpdater68);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 100 + "'", int73 == 100);
        org.junit.Assert.assertNotNull(item74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!, 99, 0" + "'", str75, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 10 + "'", int81 == 10);
        org.junit.Assert.assertNotNull(item82);
        org.junit.Assert.assertNotNull(item91);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "hi!, 100, -1" + "'", str97, "hi!, 100, -1");
        org.junit.Assert.assertNotNull(item98);
        org.junit.Assert.assertNotNull(item99);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -4, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -1, 1, 8, 30");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory12 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        com.gildedrose.Item item23 = itemUpdater11.update(item22);
        item23.sellIn = 51;
        int int26 = item23.quality;
        com.gildedrose.Item item27 = itemUpdater8.update(item23);
        item27.quality = 9;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(item27);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory3 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory8 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory8.getInstance("");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!", 100, 1);
        int int15 = item14.sellIn;
        com.gildedrose.Item item16 = itemUpdater10.update(item14);
        item14.sellIn = (byte) 0;
        com.gildedrose.Item item19 = itemUpdater7.update(item14);
        com.gildedrose.Item item20 = itemUpdater2.update(item14);
        com.gildedrose.Item item24 = new com.gildedrose.Item("", (int) '4', 1);
        int int25 = item24.sellIn;
        item24.name = "hi!";
        java.lang.String str28 = item24.name;
        int int29 = item24.sellIn;
        com.gildedrose.Item item30 = itemUpdater2.update(item24);
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!, -1, 0", (int) (byte) -1, (int) (short) 0);
        int int35 = item34.sellIn;
        com.gildedrose.Item item36 = itemUpdater2.update(item34);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory37 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater39 = itemUpdaterFactory37.getInstance("");
        com.gildedrose.Item item43 = new com.gildedrose.Item("hi!", 100, 1);
        int int44 = item43.sellIn;
        com.gildedrose.Item item45 = itemUpdater39.update(item43);
        int int46 = item43.sellIn;
        item43.sellIn = 0;
        com.gildedrose.Item item49 = itemUpdater2.update(item43);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory50 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater52 = itemUpdaterFactory50.getInstance("");
        com.gildedrose.Item item56 = new com.gildedrose.Item("hi!", 100, 1);
        int int57 = item56.sellIn;
        com.gildedrose.Item item58 = itemUpdater52.update(item56);
        int int59 = item56.sellIn;
        int int60 = item56.sellIn;
        int int61 = item56.quality;
        java.lang.String str62 = item56.name;
        item56.quality = 9;
        com.gildedrose.Item item65 = itemUpdater2.update(item56);
        java.lang.String str66 = item56.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertNotNull(itemUpdater39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 99 + "'", int46 == 99);
        org.junit.Assert.assertNotNull(item49);
        org.junit.Assert.assertNotNull(itemUpdater52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertNotNull(item58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 99 + "'", int59 == 99);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 99 + "'", int60 == 99);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(item65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!, 98, 8" + "'", str66, "hi!, 98, 8");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', 1);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 100, 52, 99, 0", 100, 0);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.name;
        item3.sellIn = (-1);
        int int9 = item3.quality;
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -1, 0, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1, 52, 100");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 50, 49, -2, 52");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 1, 0, 0, 52");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater18);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory3 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item11.sellIn = 52;
        int int14 = item11.quality;
        com.gildedrose.Item item15 = itemUpdater7.update(item11);
        com.gildedrose.Item item16 = itemUpdater2.update(item15);
        java.lang.String str17 = item16.toString();
        item16.name = "hi!, 52, 1";
        java.lang.String str20 = item16.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 0, 0, 99, 0, 50, 49" + "'", str17, "hi!, 0, 0, 99, 0, 50, 49");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 52, 1" + "'", str20, "hi!, 52, 1");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 52, (int) (byte) 0);
        int int4 = item3.sellIn;
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 32, 100", (-2), 98);
        java.lang.String str4 = item3.toString();
        item3.quality = 48;
        item3.name = "hi!, 100, 1, 32, 100";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 32, 100, -2, 98" + "'", str4, "hi!, 100, 1, 32, 100, -2, 98");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        item15.sellIn = (byte) 0;
        java.lang.String str20 = item15.toString();
        com.gildedrose.Item item21 = itemUpdater2.update(item15);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory22 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.Item item30 = new com.gildedrose.Item("hi!", 100, 1);
        int int31 = item30.sellIn;
        com.gildedrose.Item item32 = itemUpdater26.update(item30);
        java.lang.String str33 = item30.toString();
        item30.sellIn = 10;
        java.lang.String str36 = item30.toString();
        item30.sellIn = 98;
        item30.sellIn = (byte) 10;
        com.gildedrose.Item item41 = itemUpdater2.update(item30);
        int int42 = item30.quality;
        java.lang.String str43 = item30.toString();
        item30.name = "hi!, 100, 1, 9, 1";
        int int46 = item30.sellIn;
        java.lang.Class<?> wildcardClass47 = item30.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!, 99, 0" + "'", str33, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 10, 0" + "'", str36, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!, 9, 0" + "'", str43, "hi!, 9, 0");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 9 + "'", int46 == 9);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory9.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory9.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item21 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item22 = itemUpdater17.update(item21);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory23 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory23.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory23.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory28 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory28.getInstance("");
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!", 100, 1);
        int int35 = item34.sellIn;
        com.gildedrose.Item item36 = itemUpdater30.update(item34);
        item34.sellIn = (byte) 0;
        com.gildedrose.Item item39 = itemUpdater27.update(item34);
        com.gildedrose.Item item40 = itemUpdater17.update(item39);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory41 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater43 = itemUpdaterFactory41.getInstance("");
        com.gildedrose.Item item47 = new com.gildedrose.Item("hi!", 100, 1);
        int int48 = item47.sellIn;
        com.gildedrose.Item item49 = itemUpdater43.update(item47);
        int int50 = item47.sellIn;
        int int51 = item47.sellIn;
        com.gildedrose.Item item52 = itemUpdater17.update(item47);
        com.gildedrose.Item item53 = itemUpdater8.update(item52);
        item52.quality = 'a';
        java.lang.String str56 = item52.name;
        item52.quality = 0;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertNotNull(item40);
        org.junit.Assert.assertNotNull(itemUpdater43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertNotNull(item49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 99 + "'", int50 == 99);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 99 + "'", int51 == 99);
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory5.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory10 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory10.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory10.getInstance("");
        com.gildedrose.Item item18 = new com.gildedrose.Item("hi!", 100, 1);
        int int19 = item18.sellIn;
        com.gildedrose.Item item20 = itemUpdater14.update(item18);
        java.lang.String str21 = item18.toString();
        item18.sellIn = 10;
        java.lang.String str24 = item18.toString();
        item18.sellIn = 1;
        com.gildedrose.Item item27 = itemUpdater9.update(item18);
        item27.name = "hi!, 10, 0, 10, 1, 1, -1, 52, 52";
        item27.sellIn = (short) 1;
        com.gildedrose.Item item32 = itemUpdater4.update(item27);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 99, 0" + "'", str21, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!, 10, 0" + "'", str24, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertNotNull(item32);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        java.lang.String str14 = item8.toString();
        item8.sellIn = 98;
        item8.sellIn = (byte) 10;
        java.lang.String str19 = item8.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        int int18 = item15.quality;
        com.gildedrose.Item item19 = itemUpdater6.update(item15);
        int int20 = item19.quality;
        item19.quality = (short) 100;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        int int14 = item11.sellIn;
        int int15 = item11.sellIn;
        com.gildedrose.Item item16 = itemUpdater4.update(item11);
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        int int21 = item20.quality;
        com.gildedrose.Item item22 = itemUpdater4.update(item20);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory23 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory23.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory23.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory28 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory28.getInstance("");
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!", 100, 1);
        int int35 = item34.sellIn;
        com.gildedrose.Item item36 = itemUpdater30.update(item34);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory37 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater39 = itemUpdaterFactory37.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory40 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory40.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater44 = itemUpdaterFactory40.getInstance("");
        com.gildedrose.Item item48 = new com.gildedrose.Item("hi!", 100, 1);
        int int49 = item48.sellIn;
        com.gildedrose.Item item50 = itemUpdater44.update(item48);
        com.gildedrose.Item item51 = itemUpdater39.update(item50);
        com.gildedrose.Item item52 = itemUpdater30.update(item51);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater53 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item57 = new com.gildedrose.Item("hi!", 100, 1);
        int int58 = item57.sellIn;
        com.gildedrose.Item item59 = conjuredItemUpdater53.update(item57);
        com.gildedrose.Item item60 = itemUpdater30.update(item57);
        com.gildedrose.Item item64 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        com.gildedrose.Item item65 = itemUpdater30.update(item64);
        com.gildedrose.Item item66 = itemUpdater27.update(item64);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory67 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater69 = itemUpdaterFactory67.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater71 = itemUpdaterFactory67.getInstance("");
        com.gildedrose.Item item75 = new com.gildedrose.Item("hi!", 100, 1);
        int int76 = item75.sellIn;
        com.gildedrose.Item item77 = itemUpdater71.update(item75);
        java.lang.String str78 = item75.toString();
        java.lang.String str79 = item75.name;
        com.gildedrose.Item item80 = itemUpdater27.update(item75);
        com.gildedrose.Item item81 = itemUpdater4.update(item80);
        java.lang.Class<?> wildcardClass82 = item80.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertNotNull(itemUpdater39);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertNotNull(itemUpdater44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertNotNull(item50);
        org.junit.Assert.assertNotNull(item51);
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertNotNull(item59);
        org.junit.Assert.assertNotNull(item60);
        org.junit.Assert.assertNotNull(item65);
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertNotNull(itemUpdater69);
        org.junit.Assert.assertNotNull(itemUpdater71);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 100 + "'", int76 == 100);
        org.junit.Assert.assertNotNull(item77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!, 99, 0" + "'", str78, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertNotNull(item80);
        org.junit.Assert.assertNotNull(item81);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory12 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        com.gildedrose.Item item23 = itemUpdater11.update(item22);
        com.gildedrose.Item item24 = itemUpdater2.update(item23);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory25 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory25.getInstance("");
        com.gildedrose.Item item31 = new com.gildedrose.Item("hi!", 100, 1);
        int int32 = item31.sellIn;
        com.gildedrose.Item item33 = itemUpdater27.update(item31);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory34 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater36 = itemUpdaterFactory34.getInstance("");
        com.gildedrose.Item item40 = new com.gildedrose.Item("hi!", 100, 1);
        int int41 = item40.sellIn;
        com.gildedrose.Item item42 = itemUpdater36.update(item40);
        item40.sellIn = (byte) 0;
        java.lang.String str45 = item40.toString();
        com.gildedrose.Item item46 = itemUpdater27.update(item40);
        item40.sellIn = 0;
        com.gildedrose.Item item49 = itemUpdater2.update(item40);
        int int50 = item40.sellIn;
        java.lang.Class<?> wildcardClass51 = item40.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertNotNull(itemUpdater36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(item42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!, 0, 0" + "'", str45, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item46);
        org.junit.Assert.assertNotNull(item49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str9 = item8.name;
        java.lang.String str10 = item8.toString();
        com.gildedrose.Item item11 = itemUpdater4.update(item8);
        item8.sellIn = (byte) -1;
        item8.quality = 32;
        int int16 = item8.quality;
        java.lang.Class<?> wildcardClass17 = item8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 0, 0" + "'", str9, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str10, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 100, 52", (int) (byte) 100, (int) (byte) 100);
        int int13 = item12.quality;
        com.gildedrose.Item item14 = itemUpdater8.update(item12);
        item14.quality = 0;
        java.lang.String str17 = item14.name;
        item14.sellIn = 98;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(item14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 100, 52" + "'", str17, "hi!, 100, 52");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0", (int) (short) 0, (int) '4');
        java.lang.String str4 = item3.toString();
        java.lang.String str5 = item3.toString();
        java.lang.String str6 = item3.name;
        item3.name = "";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 0, 0, 52" + "'", str4, "hi!, 1, 0, 0, 52");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 1, 0, 0, 52" + "'", str5, "hi!, 1, 0, 0, 52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 1, 0" + "'", str6, "hi!, 1, 0");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str11 = item10.name;
        java.lang.String str12 = item10.name;
        int int13 = item10.quality;
        java.lang.String str14 = item10.toString();
        com.gildedrose.Item item15 = conjuredItemUpdater0.update(item10);
        java.lang.String str16 = item15.name;
        int int17 = item15.sellIn;
        item15.name = "hi!";
        int int20 = item15.quality;
        java.lang.String str21 = item15.toString();
        item15.sellIn = 0;
        java.lang.Class<?> wildcardClass24 = item15.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1" + "'", str14, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 99, 0" + "'", str21, "hi!, 99, 0");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!", 100, 1);
        com.gildedrose.Item item11 = conjuredItemUpdater0.update(item10);
        java.lang.String str12 = item10.toString();
        item10.quality = 8;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 99, 0" + "'", str12, "hi!, 99, 0");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        int int4 = item3.quality;
        item3.sellIn = (short) 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        java.lang.String str14 = item8.toString();
        item8.sellIn = 1;
        item8.quality = 99;
        int int19 = item8.quality;
        java.lang.Class<?> wildcardClass20 = item8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 9, 1", (int) (short) -1, 32);
        item3.name = "hi!, 10, 0, 10, 1, 1, -1, 52, 100";
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        int int14 = item8.sellIn;
        item8.quality = 9;
        item8.sellIn = (short) 0;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        java.lang.String str9 = item4.name;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 0, 0" + "'", str9, "hi!, 0, 0");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 50");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        int int10 = item6.sellIn;
        int int11 = item6.sellIn;
        int int12 = item6.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", (int) (byte) 10, (int) (short) 100);
        item3.sellIn = ' ';
        item3.sellIn = (byte) 10;
        item3.name = "hi!, 100, -1";
        int int10 = item3.quality;
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.name;
        item3.name = "hi!, 10, 0, 10, 1";
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 100, -1, 10, 100" + "'", str11, "hi!, 100, -1, 10, 100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 100, -1" + "'", str12, "hi!, 100, -1");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 100, 52, 99, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory3 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.Item item9 = new com.gildedrose.Item("hi!", 100, 1);
        int int10 = item9.sellIn;
        com.gildedrose.Item item11 = itemUpdater5.update(item9);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory12 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        java.lang.String str23 = item20.toString();
        item20.sellIn = 10;
        java.lang.String str26 = item20.toString();
        item20.sellIn = 98;
        com.gildedrose.Item item29 = itemUpdater5.update(item20);
        item29.name = "hi!, 99, 0, 98, 0";
        com.gildedrose.Item item32 = itemUpdater2.update(item29);
        java.lang.String str33 = item29.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 99, 0" + "'", str23, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!, 10, 0" + "'", str26, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!, 99, 0, 98, 0, 96, 0" + "'", str33, "hi!, 99, 0, 98, 0, 96, 0");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        java.lang.String str6 = item3.name;
        java.lang.Class<?> wildcardClass7 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 100, 1" + "'", str5, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1", 34, 48);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        item3.name = "hi!, 0, 0";
        item3.quality = (byte) -1;
        item3.name = ", 10, 10";
        int int11 = item3.sellIn;
        int int12 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        item11.sellIn = (byte) 0;
        com.gildedrose.Item item16 = itemUpdater4.update(item11);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater17 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item21 = new com.gildedrose.Item("hi!", 100, 1);
        int int22 = item21.sellIn;
        com.gildedrose.Item item23 = conjuredItemUpdater17.update(item21);
        item23.sellIn = 1;
        item23.name = "hi!, 0, 0, 0, 1";
        java.lang.String str28 = item23.name;
        int int29 = item23.sellIn;
        com.gildedrose.Item item30 = itemUpdater4.update(item23);
        com.gildedrose.Item item31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.gildedrose.Item item32 = itemUpdater4.update(item31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str28, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(item30);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 100, 0", (int) (short) -1, (int) ' ');
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str4 = item3.name;
        int int5 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0" + "'", str4, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item13 = new com.gildedrose.Item("hi!", 100, 1);
        int int14 = item13.sellIn;
        com.gildedrose.Item item15 = itemUpdater9.update(item13);
        java.lang.String str16 = item13.toString();
        item13.sellIn = 10;
        java.lang.String str19 = item13.toString();
        item13.sellIn = 1;
        com.gildedrose.Item item22 = itemUpdater4.update(item13);
        item22.name = "hi!, 100, 1";
        java.lang.Class<?> wildcardClass25 = item22.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 99, 0" + "'", str16, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 10, 0" + "'", str19, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49, -2, 52", 30, 51);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 99");
        com.gildedrose.Item item8 = new com.gildedrose.Item("", 1, (int) ' ');
        java.lang.String str9 = item8.toString();
        item8.sellIn = 96;
        com.gildedrose.Item item12 = itemUpdater4.update(item8);
        item12.quality = (short) 100;
        item12.quality = 51;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 1, 32" + "'", str9, ", 1, 32");
        org.junit.Assert.assertNotNull(item12);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory14 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.Item item25 = new com.gildedrose.Item("hi!", 100, 1);
        int int26 = item25.sellIn;
        com.gildedrose.Item item27 = itemUpdater21.update(item25);
        com.gildedrose.Item item28 = itemUpdater16.update(item27);
        com.gildedrose.Item item29 = itemUpdater7.update(item28);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater30 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!", 100, 1);
        int int35 = item34.sellIn;
        com.gildedrose.Item item36 = conjuredItemUpdater30.update(item34);
        com.gildedrose.Item item37 = itemUpdater7.update(item34);
        com.gildedrose.Item item41 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        com.gildedrose.Item item42 = itemUpdater7.update(item41);
        com.gildedrose.Item item43 = itemUpdater4.update(item41);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory44 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater46 = itemUpdaterFactory44.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater48 = itemUpdaterFactory44.getInstance("");
        com.gildedrose.Item item52 = new com.gildedrose.Item("hi!", 100, 1);
        int int53 = item52.sellIn;
        com.gildedrose.Item item54 = itemUpdater48.update(item52);
        java.lang.String str55 = item52.toString();
        java.lang.String str56 = item52.name;
        com.gildedrose.Item item57 = itemUpdater4.update(item52);
        item57.quality = (short) 10;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(item42);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertNotNull(itemUpdater46);
        org.junit.Assert.assertNotNull(itemUpdater48);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertNotNull(item54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!, 99, 0" + "'", str55, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(item57);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        java.lang.String str4 = item3.toString();
        item3.quality = '4';
        java.lang.String str7 = item3.name;
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.name;
        item3.name = "hi!, 100, 1, 10, 10";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 1, 32" + "'", str4, ", 1, 32");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, -1, 0, 0, 52", (int) ' ', 35);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        java.lang.String str14 = item12.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, -1, 0, 0, 52" + "'", str14, "hi!, -1, 0, 0, 52");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        item11.sellIn = (byte) 0;
        com.gildedrose.Item item16 = itemUpdater4.update(item11);
        java.lang.String str17 = item11.toString();
        java.lang.String str18 = item11.name;
        int int19 = item11.sellIn;
        java.lang.String str20 = item11.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, -1, 0" + "'", str17, "hi!, -1, 0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, -1, 0" + "'", str20, "hi!, -1, 0");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.Item item13 = new com.gildedrose.Item("hi!", 100, 1);
        int int14 = item13.sellIn;
        com.gildedrose.Item item15 = itemUpdater9.update(item13);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.Item item22 = new com.gildedrose.Item("hi!", 100, 1);
        int int23 = item22.sellIn;
        com.gildedrose.Item item24 = itemUpdater18.update(item22);
        item22.sellIn = (byte) 0;
        java.lang.String str27 = item22.toString();
        com.gildedrose.Item item28 = itemUpdater9.update(item22);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory29 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater31 = itemUpdaterFactory29.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory29.getInstance("");
        com.gildedrose.Item item37 = new com.gildedrose.Item("hi!", 100, 1);
        int int38 = item37.sellIn;
        com.gildedrose.Item item39 = itemUpdater33.update(item37);
        java.lang.String str40 = item37.toString();
        item37.sellIn = 10;
        java.lang.String str43 = item37.toString();
        item37.sellIn = 98;
        item37.sellIn = (byte) 10;
        com.gildedrose.Item item48 = itemUpdater9.update(item37);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory49 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater51 = itemUpdaterFactory49.getInstance("");
        com.gildedrose.Item item55 = new com.gildedrose.Item("hi!", 100, 1);
        int int56 = item55.sellIn;
        com.gildedrose.Item item57 = itemUpdater51.update(item55);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory58 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater60 = itemUpdaterFactory58.getInstance("");
        com.gildedrose.Item item64 = new com.gildedrose.Item("hi!", 100, 1);
        int int65 = item64.sellIn;
        com.gildedrose.Item item66 = itemUpdater60.update(item64);
        item64.sellIn = (byte) 0;
        java.lang.String str69 = item64.toString();
        com.gildedrose.Item item70 = itemUpdater51.update(item64);
        com.gildedrose.Item item71 = itemUpdater9.update(item70);
        com.gildedrose.Item item72 = conjuredItemUpdater0.update(item70);
        com.gildedrose.Item item76 = new com.gildedrose.Item("", (int) '4', (int) (byte) 1);
        com.gildedrose.Item item77 = conjuredItemUpdater0.update(item76);
        int int78 = item76.sellIn;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!, 0, 0" + "'", str27, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(itemUpdater31);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!, 99, 0" + "'", str40, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!, 10, 0" + "'", str43, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(itemUpdater51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertNotNull(itemUpdater60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!, 0, 0" + "'", str69, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item70);
        org.junit.Assert.assertNotNull(item71);
        org.junit.Assert.assertNotNull(item72);
        org.junit.Assert.assertNotNull(item77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 51 + "'", int78 == 51);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 51, 50");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 9");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, -1, 35");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str13 = item12.name;
        java.lang.String str14 = item12.name;
        java.lang.String str15 = item12.name;
        item12.name = "hi!, 100, 52";
        com.gildedrose.Item item18 = itemUpdater8.update(item12);
        item18.name = "hi!, -2, 50, 9, 0";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(item18);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1, 52, 52", (int) (short) 0, 8);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory3 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory8 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory8.getInstance("");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!", 100, 1);
        int int15 = item14.sellIn;
        com.gildedrose.Item item16 = itemUpdater10.update(item14);
        item14.sellIn = (byte) 0;
        com.gildedrose.Item item19 = itemUpdater7.update(item14);
        com.gildedrose.Item item20 = itemUpdater2.update(item14);
        com.gildedrose.Item item24 = new com.gildedrose.Item("", (int) '4', 1);
        int int25 = item24.sellIn;
        item24.name = "hi!";
        java.lang.String str28 = item24.name;
        int int29 = item24.sellIn;
        com.gildedrose.Item item30 = itemUpdater2.update(item24);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory31 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory31.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory31.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory36 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory36.getInstance("");
        com.gildedrose.Item item42 = new com.gildedrose.Item("hi!", 100, 1);
        int int43 = item42.sellIn;
        com.gildedrose.Item item44 = itemUpdater38.update(item42);
        int int45 = item42.sellIn;
        int int46 = item42.sellIn;
        com.gildedrose.Item item47 = itemUpdater35.update(item42);
        com.gildedrose.Item item51 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        int int52 = item51.quality;
        com.gildedrose.Item item53 = itemUpdater35.update(item51);
        item51.quality = (short) 1;
        java.lang.String str56 = item51.toString();
        com.gildedrose.Item item57 = itemUpdater2.update(item51);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory58 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater60 = itemUpdaterFactory58.getInstance("");
        com.gildedrose.Item item64 = new com.gildedrose.Item("hi!", 100, 1);
        int int65 = item64.sellIn;
        com.gildedrose.Item item66 = itemUpdater60.update(item64);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory67 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater69 = itemUpdaterFactory67.getInstance("");
        com.gildedrose.Item item73 = new com.gildedrose.Item("hi!", 100, 1);
        int int74 = item73.sellIn;
        com.gildedrose.Item item75 = itemUpdater69.update(item73);
        item73.sellIn = (byte) 0;
        java.lang.String str78 = item73.toString();
        com.gildedrose.Item item79 = itemUpdater60.update(item73);
        java.lang.String str80 = item73.toString();
        java.lang.String str81 = item73.name;
        com.gildedrose.Item item82 = itemUpdater2.update(item73);
        int int83 = item73.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 99 + "'", int45 == 99);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 99 + "'", int46 == 99);
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!, 100, 1, 9, 1" + "'", str56, "hi!, 100, 1, 9, 1");
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertNotNull(itemUpdater60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertNotNull(itemUpdater69);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 100 + "'", int74 == 100);
        org.junit.Assert.assertNotNull(item75);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!, 0, 0" + "'", str78, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!, -1, 0" + "'", str80, "hi!, -1, 0");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(item82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-2) + "'", int83 == (-2));
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        int int9 = item4.quality;
        item4.name = "";
        int int12 = item4.quality;
        int int13 = item4.quality;
        int int14 = item4.quality;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 49, 48", (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 98, 0, 97, 35", (int) (byte) 10, (-2));
        item3.name = "hi!, 0, 0, 51, 0";
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 100, 52, 99, 0");
        com.gildedrose.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.gildedrose.Item item14 = itemUpdater12.update(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 35, 0", 30, 10);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", 0, (int) (byte) 0);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        item3.name = "hi!, 10, 0";
        item3.name = "hi!, -1, 1";
        item3.quality = (byte) 0;
        int int10 = item3.sellIn;
        int int11 = item3.sellIn;
        int int12 = item3.sellIn;
        item3.name = "hi!, 99, 0, 98, 0";
        java.lang.Class<?> wildcardClass15 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", 52, (int) (short) 10);
        int int4 = item3.sellIn;
        item3.sellIn = 10;
        java.lang.Class<?> wildcardClass7 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 50, 0", 51, (int) (byte) -1);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory12 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        com.gildedrose.Item item23 = itemUpdater11.update(item22);
        com.gildedrose.Item item24 = itemUpdater2.update(item23);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory25 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory25.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory25.getInstance("");
        com.gildedrose.Item item33 = new com.gildedrose.Item("hi!", 100, 1);
        int int34 = item33.sellIn;
        com.gildedrose.Item item35 = itemUpdater29.update(item33);
        java.lang.String str36 = item33.toString();
        item33.sellIn = 10;
        int int39 = item33.sellIn;
        item33.name = "hi!, 10, 0";
        int int42 = item33.sellIn;
        com.gildedrose.Item item43 = itemUpdater2.update(item33);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory44 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater46 = itemUpdaterFactory44.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater48 = itemUpdaterFactory44.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater50 = itemUpdaterFactory44.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater52 = itemUpdaterFactory44.getInstance("hi!, 100, 52");
        com.gildedrose.Item item56 = new com.gildedrose.Item("hi!, 100, 1", (int) '4', (int) '#');
        com.gildedrose.Item item57 = itemUpdater52.update(item56);
        com.gildedrose.Item item58 = itemUpdater2.update(item56);
        com.gildedrose.Item item59 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.gildedrose.Item item60 = itemUpdater2.update(item59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 99, 0" + "'", str36, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertNotNull(itemUpdater46);
        org.junit.Assert.assertNotNull(itemUpdater48);
        org.junit.Assert.assertNotNull(itemUpdater50);
        org.junit.Assert.assertNotNull(itemUpdater52);
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertNotNull(item58);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        int int16 = item15.sellIn;
        java.lang.String str17 = item15.name;
        item15.quality = (byte) -1;
        item15.sellIn = 100;
        int int22 = item15.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 100, 1" + "'", str17, "hi!, 100, 1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        item11.sellIn = (byte) 0;
        com.gildedrose.Item item16 = itemUpdater4.update(item11);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory20 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.Item item28 = new com.gildedrose.Item("hi!", 100, 1);
        int int29 = item28.sellIn;
        com.gildedrose.Item item30 = itemUpdater24.update(item28);
        com.gildedrose.Item item31 = itemUpdater19.update(item30);
        com.gildedrose.Item item32 = itemUpdater4.update(item31);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory33 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory33.getInstance("");
        com.gildedrose.Item item39 = new com.gildedrose.Item("hi!", 100, 1);
        int int40 = item39.sellIn;
        com.gildedrose.Item item41 = itemUpdater35.update(item39);
        com.gildedrose.Item item42 = itemUpdater4.update(item41);
        com.gildedrose.Item item46 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str47 = item46.name;
        java.lang.String str48 = item46.toString();
        java.lang.String str49 = item46.toString();
        com.gildedrose.Item item50 = itemUpdater4.update(item46);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory51 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater53 = itemUpdaterFactory51.getInstance("");
        com.gildedrose.Item item57 = new com.gildedrose.Item("hi!", 100, 1);
        int int58 = item57.sellIn;
        com.gildedrose.Item item59 = itemUpdater53.update(item57);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory60 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater62 = itemUpdaterFactory60.getInstance("");
        com.gildedrose.Item item66 = new com.gildedrose.Item("hi!", 100, 1);
        int int67 = item66.sellIn;
        com.gildedrose.Item item68 = itemUpdater62.update(item66);
        item66.sellIn = (byte) 0;
        java.lang.String str71 = item66.toString();
        com.gildedrose.Item item72 = itemUpdater53.update(item66);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory73 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater75 = itemUpdaterFactory73.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater77 = itemUpdaterFactory73.getInstance("");
        com.gildedrose.Item item81 = new com.gildedrose.Item("hi!", 100, 1);
        int int82 = item81.sellIn;
        com.gildedrose.Item item83 = itemUpdater77.update(item81);
        java.lang.String str84 = item81.toString();
        item81.sellIn = 10;
        java.lang.String str87 = item81.toString();
        item81.sellIn = 98;
        item81.sellIn = (byte) 10;
        com.gildedrose.Item item92 = itemUpdater53.update(item81);
        int int93 = item92.quality;
        com.gildedrose.Item item94 = itemUpdater4.update(item92);
        java.lang.String str95 = item92.name;
        int int96 = item92.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertNotNull(item42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!, 0, 0" + "'", str47, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str48, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str49, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item50);
        org.junit.Assert.assertNotNull(itemUpdater53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertNotNull(item59);
        org.junit.Assert.assertNotNull(itemUpdater62);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 100 + "'", int67 == 100);
        org.junit.Assert.assertNotNull(item68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!, 0, 0" + "'", str71, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item72);
        org.junit.Assert.assertNotNull(itemUpdater75);
        org.junit.Assert.assertNotNull(itemUpdater77);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 100 + "'", int82 == 100);
        org.junit.Assert.assertNotNull(item83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!, 99, 0" + "'", str84, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!, 10, 0" + "'", str87, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(item94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "hi!" + "'", str95, "hi!");
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 98, 0");
        java.lang.Class<?> wildcardClass11 = itemUpdater10.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        item15.sellIn = (byte) 0;
        java.lang.String str20 = item15.toString();
        com.gildedrose.Item item21 = itemUpdater2.update(item15);
        int int22 = item15.sellIn;
        int int23 = item15.quality;
        java.lang.String str24 = item15.toString();
        item15.sellIn = 99;
        item15.name = ", -1, 9, 97, -2";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!, -1, 0" + "'", str24, "hi!, -1, 0");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory12 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        com.gildedrose.Item item23 = itemUpdater11.update(item22);
        com.gildedrose.Item item24 = itemUpdater2.update(item23);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater25 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item29 = new com.gildedrose.Item("hi!", 100, 1);
        int int30 = item29.sellIn;
        com.gildedrose.Item item31 = conjuredItemUpdater25.update(item29);
        item29.name = "hi!, 0, 0";
        int int34 = item29.quality;
        java.lang.String str35 = item29.toString();
        com.gildedrose.Item item36 = itemUpdater2.update(item29);
        java.lang.String str37 = item29.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str35, "hi!, 0, 0, 99, 0");
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!, 0, 0, 98, 0" + "'", str37, "hi!, 0, 0, 98, 0");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.Item item13 = new com.gildedrose.Item("hi!", 100, 1);
        int int14 = item13.sellIn;
        com.gildedrose.Item item15 = itemUpdater9.update(item13);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.Item item22 = new com.gildedrose.Item("hi!", 100, 1);
        int int23 = item22.sellIn;
        com.gildedrose.Item item24 = itemUpdater18.update(item22);
        item22.sellIn = (byte) 0;
        java.lang.String str27 = item22.toString();
        com.gildedrose.Item item28 = itemUpdater9.update(item22);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory29 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater31 = itemUpdaterFactory29.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory29.getInstance("");
        com.gildedrose.Item item37 = new com.gildedrose.Item("hi!", 100, 1);
        int int38 = item37.sellIn;
        com.gildedrose.Item item39 = itemUpdater33.update(item37);
        java.lang.String str40 = item37.toString();
        item37.sellIn = 10;
        java.lang.String str43 = item37.toString();
        item37.sellIn = 98;
        item37.sellIn = (byte) 10;
        com.gildedrose.Item item48 = itemUpdater9.update(item37);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory49 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater51 = itemUpdaterFactory49.getInstance("");
        com.gildedrose.Item item55 = new com.gildedrose.Item("hi!", 100, 1);
        int int56 = item55.sellIn;
        com.gildedrose.Item item57 = itemUpdater51.update(item55);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory58 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater60 = itemUpdaterFactory58.getInstance("");
        com.gildedrose.Item item64 = new com.gildedrose.Item("hi!", 100, 1);
        int int65 = item64.sellIn;
        com.gildedrose.Item item66 = itemUpdater60.update(item64);
        item64.sellIn = (byte) 0;
        java.lang.String str69 = item64.toString();
        com.gildedrose.Item item70 = itemUpdater51.update(item64);
        com.gildedrose.Item item71 = itemUpdater9.update(item70);
        com.gildedrose.Item item72 = conjuredItemUpdater0.update(item70);
        com.gildedrose.Item item76 = new com.gildedrose.Item("", (int) '4', (int) (byte) 1);
        com.gildedrose.Item item77 = conjuredItemUpdater0.update(item76);
        item76.quality = 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!, 0, 0" + "'", str27, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(itemUpdater31);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!, 99, 0" + "'", str40, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!, 10, 0" + "'", str43, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(itemUpdater51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertNotNull(itemUpdater60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!, 0, 0" + "'", str69, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item70);
        org.junit.Assert.assertNotNull(item71);
        org.junit.Assert.assertNotNull(item72);
        org.junit.Assert.assertNotNull(item77);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        item3.name = "hi!, 10, 0";
        item3.sellIn = (short) -1;
        item3.sellIn = (short) -1;
        item3.quality = (short) 0;
        int int12 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 31, 97");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str11 = item10.name;
        java.lang.String str12 = item10.name;
        int int13 = item10.quality;
        java.lang.String str14 = item10.toString();
        com.gildedrose.Item item15 = conjuredItemUpdater0.update(item10);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.Item item22 = new com.gildedrose.Item("hi!", 100, 1);
        int int23 = item22.sellIn;
        com.gildedrose.Item item24 = itemUpdater18.update(item22);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory25 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory25.getInstance("");
        com.gildedrose.Item item31 = new com.gildedrose.Item("hi!", 100, 1);
        int int32 = item31.sellIn;
        com.gildedrose.Item item33 = itemUpdater27.update(item31);
        item31.sellIn = (byte) 0;
        java.lang.String str36 = item31.toString();
        com.gildedrose.Item item37 = itemUpdater18.update(item31);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory38 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater40 = itemUpdaterFactory38.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory38.getInstance("");
        com.gildedrose.Item item46 = new com.gildedrose.Item("hi!", 100, 1);
        int int47 = item46.sellIn;
        com.gildedrose.Item item48 = itemUpdater42.update(item46);
        java.lang.String str49 = item46.toString();
        item46.sellIn = 10;
        java.lang.String str52 = item46.toString();
        item46.sellIn = 98;
        item46.sellIn = (byte) 10;
        com.gildedrose.Item item57 = itemUpdater18.update(item46);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory58 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater60 = itemUpdaterFactory58.getInstance("");
        com.gildedrose.Item item64 = new com.gildedrose.Item("hi!", 100, 1);
        int int65 = item64.sellIn;
        com.gildedrose.Item item66 = itemUpdater60.update(item64);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory67 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater69 = itemUpdaterFactory67.getInstance("");
        com.gildedrose.Item item73 = new com.gildedrose.Item("hi!", 100, 1);
        int int74 = item73.sellIn;
        com.gildedrose.Item item75 = itemUpdater69.update(item73);
        item73.sellIn = (byte) 0;
        java.lang.String str78 = item73.toString();
        com.gildedrose.Item item79 = itemUpdater60.update(item73);
        com.gildedrose.Item item80 = itemUpdater18.update(item79);
        java.lang.String str81 = item79.name;
        com.gildedrose.Item item82 = conjuredItemUpdater0.update(item79);
        java.lang.String str83 = item79.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1" + "'", str14, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 0, 0" + "'", str36, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(itemUpdater40);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!, 99, 0" + "'", str49, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!, 10, 0" + "'", str52, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertNotNull(itemUpdater60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertNotNull(itemUpdater69);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 100 + "'", int74 == 100);
        org.junit.Assert.assertNotNull(item75);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!, 0, 0" + "'", str78, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item79);
        org.junit.Assert.assertNotNull(item80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(item82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!, -3, 0" + "'", str83, "hi!, -3, 0");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory14 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory23 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory23.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory26 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory26.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory26.getInstance("");
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!", 100, 1);
        int int35 = item34.sellIn;
        com.gildedrose.Item item36 = itemUpdater30.update(item34);
        com.gildedrose.Item item37 = itemUpdater25.update(item36);
        com.gildedrose.Item item38 = itemUpdater16.update(item37);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater39 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item43 = new com.gildedrose.Item("hi!", 100, 1);
        int int44 = item43.sellIn;
        com.gildedrose.Item item45 = conjuredItemUpdater39.update(item43);
        com.gildedrose.Item item46 = itemUpdater16.update(item43);
        com.gildedrose.Item item50 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        com.gildedrose.Item item51 = itemUpdater16.update(item50);
        com.gildedrose.Item item52 = itemUpdater13.update(item50);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory53 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater55 = itemUpdaterFactory53.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater57 = itemUpdaterFactory53.getInstance("");
        com.gildedrose.Item item61 = new com.gildedrose.Item("hi!", 100, 1);
        int int62 = item61.sellIn;
        com.gildedrose.Item item63 = itemUpdater57.update(item61);
        java.lang.String str64 = item61.toString();
        java.lang.String str65 = item61.name;
        com.gildedrose.Item item66 = itemUpdater13.update(item61);
        com.gildedrose.Item item67 = itemUpdater8.update(item61);
        item67.name = ", 0, 50, 1, 100, -1, 100";
        int int70 = item67.quality;
        int int71 = item67.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(item38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertNotNull(item46);
        org.junit.Assert.assertNotNull(item51);
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertNotNull(itemUpdater55);
        org.junit.Assert.assertNotNull(itemUpdater57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertNotNull(item63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!, 99, 0" + "'", str64, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertNotNull(item67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -2, 50", 1, (int) (short) 10);
        item3.quality = 1;
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory14 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory19 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory19.getInstance("");
        com.gildedrose.Item item25 = new com.gildedrose.Item("hi!", 100, 1);
        int int26 = item25.sellIn;
        com.gildedrose.Item item27 = itemUpdater21.update(item25);
        item25.sellIn = (byte) 0;
        com.gildedrose.Item item30 = itemUpdater18.update(item25);
        com.gildedrose.Item item31 = itemUpdater8.update(item30);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory32 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater34 = itemUpdaterFactory32.getInstance("");
        com.gildedrose.Item item38 = new com.gildedrose.Item("hi!", 100, 1);
        int int39 = item38.sellIn;
        com.gildedrose.Item item40 = itemUpdater34.update(item38);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory41 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater43 = itemUpdaterFactory41.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory44 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater46 = itemUpdaterFactory44.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater48 = itemUpdaterFactory44.getInstance("");
        com.gildedrose.Item item52 = new com.gildedrose.Item("hi!", 100, 1);
        int int53 = item52.sellIn;
        com.gildedrose.Item item54 = itemUpdater48.update(item52);
        com.gildedrose.Item item55 = itemUpdater43.update(item54);
        com.gildedrose.Item item56 = itemUpdater34.update(item55);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater57 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item61 = new com.gildedrose.Item("hi!", 100, 1);
        int int62 = item61.sellIn;
        com.gildedrose.Item item63 = conjuredItemUpdater57.update(item61);
        com.gildedrose.Item item64 = itemUpdater34.update(item61);
        int int65 = item61.quality;
        item61.sellIn = 99;
        item61.name = "";
        com.gildedrose.Item item70 = itemUpdater8.update(item61);
        item61.sellIn = (-3);
        java.lang.Class<?> wildcardClass73 = item61.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(itemUpdater34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertNotNull(item40);
        org.junit.Assert.assertNotNull(itemUpdater43);
        org.junit.Assert.assertNotNull(itemUpdater46);
        org.junit.Assert.assertNotNull(itemUpdater48);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertNotNull(item54);
        org.junit.Assert.assertNotNull(item55);
        org.junit.Assert.assertNotNull(item56);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertNotNull(item63);
        org.junit.Assert.assertNotNull(item64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(item70);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str9 = item8.name;
        java.lang.String str10 = item8.toString();
        com.gildedrose.Item item11 = itemUpdater4.update(item8);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory12 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        java.lang.String str23 = item20.toString();
        item20.sellIn = 10;
        java.lang.String str26 = item20.toString();
        item20.sellIn = 98;
        int int29 = item20.sellIn;
        com.gildedrose.Item item30 = itemUpdater4.update(item20);
        item30.quality = (byte) 0;
        java.lang.String str33 = item30.name;
        item30.quality = (-1);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 0, 0" + "'", str9, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str10, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 99, 0" + "'", str23, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!, 10, 0" + "'", str26, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 98 + "'", int29 == 98);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        int int6 = item3.quality;
        java.lang.String str7 = item3.toString();
        item3.quality = 97;
        int int10 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 100, 1" + "'", str7, "hi!, 100, 1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49", 35, (-1));
        item3.quality = 34;
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        java.lang.String str14 = item8.toString();
        item8.sellIn = 1;
        int int17 = item8.sellIn;
        java.lang.String str18 = item8.name;
        item8.quality = 'a';
        java.lang.Class<?> wildcardClass21 = item8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", (-1), 99);
        item3.name = "hi!, -4, 0";
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item13 = new com.gildedrose.Item("hi!", 100, 1);
        int int14 = item13.sellIn;
        com.gildedrose.Item item15 = itemUpdater9.update(item13);
        java.lang.String str16 = item13.toString();
        item13.sellIn = 10;
        java.lang.String str19 = item13.toString();
        item13.sellIn = 1;
        com.gildedrose.Item item22 = itemUpdater4.update(item13);
        java.lang.String str23 = item13.toString();
        int int24 = item13.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 99, 0" + "'", str16, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 10, 0" + "'", str19, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 0, 0" + "'", str23, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory12 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        com.gildedrose.Item item23 = itemUpdater11.update(item22);
        com.gildedrose.Item item24 = itemUpdater2.update(item23);
        item23.sellIn = (short) 10;
        java.lang.String str27 = item23.toString();
        item23.name = "hi!, -1, 52";
        item23.sellIn = (short) 100;
        item23.sellIn = (-4);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!, 10, 0" + "'", str27, "hi!, 10, 0");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory14 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory23 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory23.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory26 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory26.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory26.getInstance("");
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!", 100, 1);
        int int35 = item34.sellIn;
        com.gildedrose.Item item36 = itemUpdater30.update(item34);
        com.gildedrose.Item item37 = itemUpdater25.update(item36);
        com.gildedrose.Item item38 = itemUpdater16.update(item37);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater39 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item43 = new com.gildedrose.Item("hi!", 100, 1);
        int int44 = item43.sellIn;
        com.gildedrose.Item item45 = conjuredItemUpdater39.update(item43);
        com.gildedrose.Item item46 = itemUpdater16.update(item43);
        com.gildedrose.Item item50 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        com.gildedrose.Item item51 = itemUpdater16.update(item50);
        com.gildedrose.Item item52 = itemUpdater13.update(item50);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory53 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater55 = itemUpdaterFactory53.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater57 = itemUpdaterFactory53.getInstance("");
        com.gildedrose.Item item61 = new com.gildedrose.Item("hi!", 100, 1);
        int int62 = item61.sellIn;
        com.gildedrose.Item item63 = itemUpdater57.update(item61);
        java.lang.String str64 = item61.toString();
        java.lang.String str65 = item61.name;
        com.gildedrose.Item item66 = itemUpdater13.update(item61);
        com.gildedrose.Item item67 = itemUpdater8.update(item61);
        item67.name = ", 0, 50, 1, 100, -1, 100";
        int int70 = item67.quality;
        item67.name = "";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(item38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertNotNull(item46);
        org.junit.Assert.assertNotNull(item51);
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertNotNull(itemUpdater55);
        org.junit.Assert.assertNotNull(itemUpdater57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertNotNull(item63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!, 99, 0" + "'", str64, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertNotNull(item67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 52, 0");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 0, 52");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 50, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater18);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) '4', (int) (byte) 1);
        int int4 = item3.quality;
        item3.sellIn = 31;
        item3.sellIn = (short) 100;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory18 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory18.getInstance("");
        com.gildedrose.Item item24 = new com.gildedrose.Item("hi!", 100, 1);
        int int25 = item24.sellIn;
        com.gildedrose.Item item26 = itemUpdater20.update(item24);
        item24.sellIn = (byte) 0;
        java.lang.String str29 = item24.toString();
        com.gildedrose.Item item30 = itemUpdater11.update(item24);
        com.gildedrose.Item item31 = itemUpdater8.update(item24);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory32 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater34 = itemUpdaterFactory32.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater36 = itemUpdaterFactory32.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory32.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater40 = itemUpdaterFactory32.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory32.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater44 = itemUpdaterFactory32.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater46 = itemUpdaterFactory32.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory47 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater49 = itemUpdaterFactory47.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory50 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater52 = itemUpdaterFactory50.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater54 = itemUpdaterFactory50.getInstance("");
        com.gildedrose.Item item58 = new com.gildedrose.Item("hi!", 100, 1);
        int int59 = item58.sellIn;
        com.gildedrose.Item item60 = itemUpdater54.update(item58);
        com.gildedrose.Item item61 = itemUpdater49.update(item60);
        int int62 = item61.sellIn;
        int int63 = item61.quality;
        item61.quality = (short) 10;
        java.lang.String str66 = item61.name;
        com.gildedrose.Item item67 = itemUpdater46.update(item61);
        com.gildedrose.Item item68 = itemUpdater8.update(item67);
        java.lang.String str69 = item68.toString();
        int int70 = item68.sellIn;
        java.lang.String str71 = item68.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!, 0, 0" + "'", str29, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(itemUpdater34);
        org.junit.Assert.assertNotNull(itemUpdater36);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertNotNull(itemUpdater40);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertNotNull(itemUpdater44);
        org.junit.Assert.assertNotNull(itemUpdater46);
        org.junit.Assert.assertNotNull(itemUpdater49);
        org.junit.Assert.assertNotNull(itemUpdater52);
        org.junit.Assert.assertNotNull(itemUpdater54);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertNotNull(item60);
        org.junit.Assert.assertNotNull(item61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 98 + "'", int62 == 98);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(item67);
        org.junit.Assert.assertNotNull(item68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!, 96, 8" + "'", str69, "hi!, 96, 8");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 96 + "'", int70 == 96);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory10 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory10.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory10.getInstance("");
        com.gildedrose.Item item18 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item18.sellIn = 52;
        int int21 = item18.quality;
        com.gildedrose.Item item22 = itemUpdater14.update(item18);
        com.gildedrose.Item item23 = itemUpdater9.update(item22);
        com.gildedrose.Item item24 = itemUpdater6.update(item22);
        java.lang.String str25 = item24.toString();
        item24.sellIn = (-1);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!, 0, 0, 99, 0, 49, 48" + "'", str25, "hi!, 0, 0, 99, 0, 49, 48");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50", (int) (short) 1, (int) (short) 100);
        item3.quality = (byte) -1;
        item3.quality = 52;
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory15 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory15.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory15.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory15.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory22 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory22.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory22.getInstance("hi!, -1, 0");
        com.gildedrose.Item item30 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str31 = item30.name;
        java.lang.String str32 = item30.toString();
        com.gildedrose.Item item33 = itemUpdater26.update(item30);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory34 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater36 = itemUpdaterFactory34.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory34.getInstance("");
        com.gildedrose.Item item42 = new com.gildedrose.Item("hi!", 100, 1);
        int int43 = item42.sellIn;
        com.gildedrose.Item item44 = itemUpdater38.update(item42);
        java.lang.String str45 = item42.toString();
        item42.sellIn = 10;
        java.lang.String str48 = item42.toString();
        item42.sellIn = 98;
        int int51 = item42.sellIn;
        com.gildedrose.Item item52 = itemUpdater26.update(item42);
        com.gildedrose.Item item53 = itemUpdater21.update(item52);
        int int54 = item53.sellIn;
        com.gildedrose.Item item55 = itemUpdater14.update(item53);
        item53.name = "hi!, 100, 1, 10, 0, 52, 1";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!, 0, 0" + "'", str31, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str32, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertNotNull(itemUpdater36);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!, 99, 0" + "'", str45, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!, 10, 0" + "'", str48, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 98 + "'", int51 == 98);
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 96 + "'", int54 == 96);
        org.junit.Assert.assertNotNull(item55);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 100, 0", (int) (short) -1, (int) ' ');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, 0, 100, 0, -1, 32" + "'", str4, "hi!, 10, 0, 100, 0, -1, 32");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, -1", 98, 9);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, -1, 0", 0, (int) (byte) 0);
        com.gildedrose.Item item13 = itemUpdater2.update(item12);
        item13.quality = (short) -1;
        item13.sellIn = 35;
        int int18 = item13.sellIn;
        java.lang.String str19 = item13.name;
        item13.quality = (byte) 10;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, -1, 0" + "'", str19, "hi!, -1, 0");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, -1", 0, (-1));
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 0, 50");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 98");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory9.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory9.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item21 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item22 = itemUpdater17.update(item21);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory23 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory23.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory23.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory28 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory28.getInstance("");
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!", 100, 1);
        int int35 = item34.sellIn;
        com.gildedrose.Item item36 = itemUpdater30.update(item34);
        item34.sellIn = (byte) 0;
        com.gildedrose.Item item39 = itemUpdater27.update(item34);
        com.gildedrose.Item item40 = itemUpdater17.update(item39);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory41 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater43 = itemUpdaterFactory41.getInstance("");
        com.gildedrose.Item item47 = new com.gildedrose.Item("hi!", 100, 1);
        int int48 = item47.sellIn;
        com.gildedrose.Item item49 = itemUpdater43.update(item47);
        int int50 = item47.sellIn;
        int int51 = item47.sellIn;
        com.gildedrose.Item item52 = itemUpdater17.update(item47);
        com.gildedrose.Item item53 = itemUpdater8.update(item52);
        item52.quality = '#';
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertNotNull(item40);
        org.junit.Assert.assertNotNull(itemUpdater43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertNotNull(item49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 99 + "'", int50 == 99);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 99 + "'", int51 == 99);
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertNotNull(item53);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 98, -2", 34, (int) ' ');
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 10, 10");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        int int14 = item11.sellIn;
        java.lang.String str15 = item11.toString();
        int int16 = item11.sellIn;
        com.gildedrose.Item item17 = itemUpdater4.update(item11);
        java.lang.String str18 = item11.toString();
        int int19 = item11.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 99, 0" + "'", str15, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 98, 0" + "'", str18, "hi!, 98, 0");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        java.lang.String str4 = item3.toString();
        item3.quality = '4';
        int int7 = item3.quality;
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 1, 32" + "'", str4, ", 1, 32");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 51, 50");
        java.lang.Class<?> wildcardClass11 = itemUpdaterFactory0.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 9", 9, 0);
        item3.sellIn = 30;
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", (-1), 99);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, 0" + "'", str4, "hi!, 10, 0");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str13 = item12.name;
        int int14 = item12.sellIn;
        com.gildedrose.Item item15 = itemUpdater8.update(item12);
        java.lang.String str16 = item12.toString();
        java.lang.String str17 = item12.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 0, 0" + "'", str13, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 0, 0, 31, 0" + "'", str16, "hi!, 0, 0, 31, 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 0, 0, 31, 0" + "'", str17, "hi!, 0, 0, 31, 0");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 100, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory7.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory7.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory7.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.Item item22 = new com.gildedrose.Item("hi!", 100, 1);
        int int23 = item22.sellIn;
        com.gildedrose.Item item24 = itemUpdater18.update(item22);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory25 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory25.getInstance("");
        com.gildedrose.Item item31 = new com.gildedrose.Item("hi!", 100, 1);
        int int32 = item31.sellIn;
        com.gildedrose.Item item33 = itemUpdater27.update(item31);
        item31.sellIn = (byte) 0;
        java.lang.String str36 = item31.toString();
        com.gildedrose.Item item37 = itemUpdater18.update(item31);
        com.gildedrose.Item item38 = itemUpdater15.update(item31);
        com.gildedrose.Item item39 = conjuredItemUpdater0.update(item31);
        com.gildedrose.Item item43 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49", (int) ' ', (int) 'a');
        int int44 = item43.quality;
        com.gildedrose.Item item45 = conjuredItemUpdater0.update(item43);
        com.gildedrose.Item item49 = new com.gildedrose.Item("", 0, (int) 'a');
        item49.quality = (byte) -1;
        item49.name = "hi!, 52, 1";
        com.gildedrose.Item item54 = conjuredItemUpdater0.update(item49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 0, 0" + "'", str36, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(item38);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertNotNull(item54);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50", (int) (short) 1, (int) (short) 100);
        item3.quality = (byte) -1;
        item3.sellIn = (byte) 10;
        java.lang.String str8 = item3.name;
        int int9 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 0, 50" + "'", str8, ", 0, 50");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 0", 31, (-3));
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 100, 10");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 52, 32, 1", (int) (short) 0, 8);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory3 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item11.sellIn = 52;
        int int14 = item11.quality;
        com.gildedrose.Item item15 = itemUpdater7.update(item11);
        com.gildedrose.Item item16 = itemUpdater2.update(item15);
        item16.quality = 96;
        item16.quality = 30;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(item16);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) '4');
        item3.name = "hi!, 98, 0, 97, 35";
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        item6.sellIn = 0;
        int int12 = item6.sellIn;
        item6.sellIn = '4';
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        int int9 = item4.quality;
        item4.quality = (short) -1;
        item4.name = "hi!";
        item4.name = ", 1, 32";
        int int16 = item4.quality;
        java.lang.String str17 = item4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ", 1, 32, 99, -1" + "'", str17, ", 1, 32, 99, -1");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory19 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory19.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory19.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory19.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory19.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory19.getInstance("hi!, 9, 0");
        com.gildedrose.Item item33 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        int int34 = item33.quality;
        item33.quality = 99;
        com.gildedrose.Item item37 = itemUpdater29.update(item33);
        item33.quality = (byte) 0;
        com.gildedrose.Item item40 = itemUpdater18.update(item33);
        java.lang.String str41 = item40.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(item40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!, 100, 1" + "'", str41, "hi!, 100, 1");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (short) 0, 52);
        item3.sellIn = (short) 10;
        java.lang.String str6 = item3.toString();
        item3.sellIn = 35;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 99, 0, 10, 52" + "'", str6, "hi!, 99, 0, 10, 52");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        item15.sellIn = (byte) 0;
        java.lang.String str20 = item15.toString();
        com.gildedrose.Item item21 = itemUpdater2.update(item15);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory22 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.Item item30 = new com.gildedrose.Item("hi!", 100, 1);
        int int31 = item30.sellIn;
        com.gildedrose.Item item32 = itemUpdater26.update(item30);
        java.lang.String str33 = item30.toString();
        item30.sellIn = 10;
        java.lang.String str36 = item30.toString();
        item30.sellIn = 98;
        item30.sellIn = (byte) 10;
        com.gildedrose.Item item41 = itemUpdater2.update(item30);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory42 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater44 = itemUpdaterFactory42.getInstance("");
        com.gildedrose.Item item48 = new com.gildedrose.Item("hi!", 100, 1);
        int int49 = item48.sellIn;
        com.gildedrose.Item item50 = itemUpdater44.update(item48);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory51 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater53 = itemUpdaterFactory51.getInstance("");
        com.gildedrose.Item item57 = new com.gildedrose.Item("hi!", 100, 1);
        int int58 = item57.sellIn;
        com.gildedrose.Item item59 = itemUpdater53.update(item57);
        item57.sellIn = (byte) 0;
        java.lang.String str62 = item57.toString();
        com.gildedrose.Item item63 = itemUpdater44.update(item57);
        com.gildedrose.Item item64 = itemUpdater2.update(item63);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory65 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater67 = itemUpdaterFactory65.getInstance("");
        com.gildedrose.Item item71 = new com.gildedrose.Item("hi!", 100, 1);
        int int72 = item71.sellIn;
        com.gildedrose.Item item73 = itemUpdater67.update(item71);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory74 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater76 = itemUpdaterFactory74.getInstance("");
        com.gildedrose.Item item80 = new com.gildedrose.Item("hi!", 100, 1);
        int int81 = item80.sellIn;
        com.gildedrose.Item item82 = itemUpdater76.update(item80);
        item80.sellIn = (byte) 0;
        java.lang.String str85 = item80.toString();
        com.gildedrose.Item item86 = itemUpdater67.update(item80);
        item86.quality = 96;
        com.gildedrose.Item item89 = itemUpdater2.update(item86);
        item86.sellIn = (short) 1;
        java.lang.String str92 = item86.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!, 99, 0" + "'", str33, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 10, 0" + "'", str36, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertNotNull(itemUpdater44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertNotNull(item50);
        org.junit.Assert.assertNotNull(itemUpdater53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertNotNull(item59);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!, 0, 0" + "'", str62, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item63);
        org.junit.Assert.assertNotNull(item64);
        org.junit.Assert.assertNotNull(itemUpdater67);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 100 + "'", int72 == 100);
        org.junit.Assert.assertNotNull(item73);
        org.junit.Assert.assertNotNull(itemUpdater76);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 100 + "'", int81 == 100);
        org.junit.Assert.assertNotNull(item82);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!, 0, 0" + "'", str85, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item86);
        org.junit.Assert.assertNotNull(item89);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        int int16 = item15.sellIn;
        java.lang.String str17 = item15.name;
        java.lang.String str18 = item15.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 100, 1" + "'", str17, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 100, 1" + "'", str18, "hi!, 100, 1");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 9, 50", (int) (short) -1, 50);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        int int14 = item11.sellIn;
        int int15 = item11.sellIn;
        com.gildedrose.Item item16 = itemUpdater4.update(item11);
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        int int21 = item20.quality;
        com.gildedrose.Item item22 = itemUpdater4.update(item20);
        item20.name = "hi!, 99, 0, 0, 10";
        item20.quality = (-2);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(item22);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        int int14 = item11.sellIn;
        int int15 = item11.sellIn;
        com.gildedrose.Item item16 = itemUpdater4.update(item11);
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        int int21 = item20.quality;
        com.gildedrose.Item item22 = itemUpdater4.update(item20);
        com.gildedrose.Item item26 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        item26.quality = 0;
        int int29 = item26.sellIn;
        com.gildedrose.Item item30 = itemUpdater4.update(item26);
        item26.sellIn = (byte) 10;
        item26.sellIn = 96;
        int int35 = item26.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 96 + "'", int35 == 96);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        java.lang.Class<?> wildcardClass11 = itemUpdater10.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 1, (int) ' ');
        item3.quality = 99;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.Item item13 = new com.gildedrose.Item("hi!", 100, 1);
        int int14 = item13.sellIn;
        com.gildedrose.Item item15 = itemUpdater9.update(item13);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.Item item24 = new com.gildedrose.Item("hi!", 100, 1);
        int int25 = item24.sellIn;
        com.gildedrose.Item item26 = itemUpdater20.update(item24);
        java.lang.String str27 = item24.toString();
        item24.sellIn = 10;
        java.lang.String str30 = item24.toString();
        item24.sellIn = 98;
        com.gildedrose.Item item33 = itemUpdater9.update(item24);
        com.gildedrose.Item item34 = itemUpdater6.update(item33);
        com.gildedrose.Item item38 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item38.sellIn = (byte) 100;
        java.lang.String str41 = item38.name;
        item38.name = "hi!, -1, 0";
        item38.name = "hi!";
        java.lang.String str46 = item38.toString();
        com.gildedrose.Item item47 = itemUpdater6.update(item38);
        java.lang.String str48 = item47.name;
        java.lang.String str49 = item47.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!, 99, 0" + "'", str27, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!, 10, 0" + "'", str30, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!, 99, 0" + "'", str41, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!, 100, 52" + "'", str46, "hi!, 100, 52");
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!, 99, 50" + "'", str49, "hi!, 99, 50");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 49, 48");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 1, 0, 0, 52");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory15 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.Item item21 = new com.gildedrose.Item("hi!", 100, 1);
        int int22 = item21.sellIn;
        com.gildedrose.Item item23 = itemUpdater17.update(item21);
        com.gildedrose.Item item27 = new com.gildedrose.Item("hi!, -1, 0", 0, (int) (byte) 0);
        com.gildedrose.Item item28 = itemUpdater17.update(item27);
        item28.quality = (short) -1;
        item28.sellIn = 35;
        int int33 = item28.sellIn;
        java.lang.String str34 = item28.name;
        com.gildedrose.Item item35 = itemUpdater14.update(item28);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!, -1, 0" + "'", str34, "hi!, -1, 0");
        org.junit.Assert.assertNotNull(item35);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory7.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory7.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory7.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.Item item22 = new com.gildedrose.Item("hi!", 100, 1);
        int int23 = item22.sellIn;
        com.gildedrose.Item item24 = itemUpdater18.update(item22);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory25 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory25.getInstance("");
        com.gildedrose.Item item31 = new com.gildedrose.Item("hi!", 100, 1);
        int int32 = item31.sellIn;
        com.gildedrose.Item item33 = itemUpdater27.update(item31);
        item31.sellIn = (byte) 0;
        java.lang.String str36 = item31.toString();
        com.gildedrose.Item item37 = itemUpdater18.update(item31);
        com.gildedrose.Item item38 = itemUpdater15.update(item31);
        com.gildedrose.Item item39 = conjuredItemUpdater0.update(item31);
        com.gildedrose.Item item43 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49", (int) ' ', (int) 'a');
        int int44 = item43.quality;
        com.gildedrose.Item item45 = conjuredItemUpdater0.update(item43);
        com.gildedrose.Item item46 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.gildedrose.Item item47 = conjuredItemUpdater0.update(item46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 0, 0" + "'", str36, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(item38);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertNotNull(item45);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 32");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory10 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory10.getInstance("");
        com.gildedrose.Item item16 = new com.gildedrose.Item("hi!", 100, 1);
        int int17 = item16.sellIn;
        com.gildedrose.Item item18 = itemUpdater12.update(item16);
        item16.sellIn = (byte) 0;
        com.gildedrose.Item item21 = itemUpdater9.update(item16);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory22 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory22.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory22.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory22.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory31 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory31.getInstance("");
        com.gildedrose.Item item37 = new com.gildedrose.Item("hi!", 100, 1);
        int int38 = item37.sellIn;
        com.gildedrose.Item item39 = itemUpdater33.update(item37);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory40 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory40.getInstance("");
        com.gildedrose.Item item46 = new com.gildedrose.Item("hi!", 100, 1);
        int int47 = item46.sellIn;
        com.gildedrose.Item item48 = itemUpdater42.update(item46);
        item46.sellIn = (byte) 0;
        java.lang.String str51 = item46.toString();
        com.gildedrose.Item item52 = itemUpdater33.update(item46);
        com.gildedrose.Item item53 = itemUpdater30.update(item46);
        com.gildedrose.Item item54 = itemUpdater9.update(item53);
        java.lang.String str55 = item53.name;
        java.lang.String str56 = item53.toString();
        com.gildedrose.Item item57 = itemUpdater4.update(item53);
        com.gildedrose.Item item61 = new com.gildedrose.Item("", (int) '4', 1);
        int int62 = item61.sellIn;
        item61.name = "hi!";
        com.gildedrose.Item item65 = itemUpdater4.update(item61);
        item65.quality = (short) 1;
        item65.sellIn = '#';
        item65.name = "hi!, -3, 49";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!, 0, 0" + "'", str51, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertNotNull(item54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!, -3, 0" + "'", str56, "hi!, -3, 0");
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 52 + "'", int62 == 52);
        org.junit.Assert.assertNotNull(item65);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        int int10 = item6.sellIn;
        java.lang.String str11 = item6.toString();
        java.lang.Class<?> wildcardClass12 = item6.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        item15.sellIn = (byte) 0;
        java.lang.String str20 = item15.toString();
        com.gildedrose.Item item21 = itemUpdater2.update(item15);
        java.lang.String str22 = item15.toString();
        item15.sellIn = (short) 100;
        item15.sellIn = (short) 1;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, -1, 0" + "'", str22, "hi!, -1, 0");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory14 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.Item item25 = new com.gildedrose.Item("hi!", 100, 1);
        int int26 = item25.sellIn;
        com.gildedrose.Item item27 = itemUpdater21.update(item25);
        com.gildedrose.Item item28 = itemUpdater16.update(item27);
        com.gildedrose.Item item29 = itemUpdater7.update(item28);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater30 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!", 100, 1);
        int int35 = item34.sellIn;
        com.gildedrose.Item item36 = conjuredItemUpdater30.update(item34);
        item34.name = "hi!, 0, 0";
        int int39 = item34.quality;
        java.lang.String str40 = item34.toString();
        com.gildedrose.Item item41 = itemUpdater7.update(item34);
        int int42 = item34.sellIn;
        item34.quality = 100;
        int int45 = item34.quality;
        com.gildedrose.Item item46 = itemUpdater4.update(item34);
        int int47 = item46.quality;
        java.lang.String str48 = item46.toString();
        java.lang.Class<?> wildcardClass49 = item46.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str40, "hi!, 0, 0, 99, 0");
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 98 + "'", int42 == 98);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertNotNull(item46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 50 + "'", int47 == 50);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!, 0, 0, 97, 50" + "'", str48, "hi!, 0, 0, 97, 50");
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        item3.quality = ' ';
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 1, 32" + "'", str4, ", 1, 32");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 32, 0", (int) (byte) 10, (int) (byte) 1);
        item3.sellIn = (short) -1;
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 52", 1, 98);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 52" + "'", str4, "hi!, 100, 52");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 100, 52, 1, 98" + "'", str5, "hi!, 100, 52, 1, 98");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", (int) '#', 0);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory3 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory8 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory8.getInstance("");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!", 100, 1);
        int int15 = item14.sellIn;
        com.gildedrose.Item item16 = itemUpdater10.update(item14);
        item14.sellIn = (byte) 0;
        com.gildedrose.Item item19 = itemUpdater7.update(item14);
        com.gildedrose.Item item20 = itemUpdater2.update(item14);
        com.gildedrose.Item item24 = new com.gildedrose.Item("", (int) '4', 1);
        int int25 = item24.sellIn;
        item24.name = "hi!";
        java.lang.String str28 = item24.name;
        int int29 = item24.sellIn;
        com.gildedrose.Item item30 = itemUpdater2.update(item24);
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!, -1, 0", (int) (byte) -1, (int) (short) 0);
        int int35 = item34.sellIn;
        com.gildedrose.Item item36 = itemUpdater2.update(item34);
        item36.quality = (short) 100;
        java.lang.String str39 = item36.name;
        item36.sellIn = 51;
        item36.name = ", 0, 50, 1, 100, -1, 100";
        java.lang.String str44 = item36.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!, -1, 0" + "'", str39, "hi!, -1, 0");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + ", 0, 50, 1, 100, -1, 100, 51, 100" + "'", str44, ", 0, 50, 1, 100, -1, 100, 51, 100");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory14 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.Item item25 = new com.gildedrose.Item("hi!", 100, 1);
        int int26 = item25.sellIn;
        com.gildedrose.Item item27 = itemUpdater21.update(item25);
        com.gildedrose.Item item28 = itemUpdater16.update(item27);
        com.gildedrose.Item item29 = itemUpdater7.update(item28);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater30 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!", 100, 1);
        int int35 = item34.sellIn;
        com.gildedrose.Item item36 = conjuredItemUpdater30.update(item34);
        com.gildedrose.Item item37 = itemUpdater7.update(item34);
        com.gildedrose.Item item41 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        com.gildedrose.Item item42 = itemUpdater7.update(item41);
        com.gildedrose.Item item43 = itemUpdater4.update(item41);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory44 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater46 = itemUpdaterFactory44.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater48 = itemUpdaterFactory44.getInstance("");
        com.gildedrose.Item item52 = new com.gildedrose.Item("hi!", 100, 1);
        int int53 = item52.sellIn;
        com.gildedrose.Item item54 = itemUpdater48.update(item52);
        java.lang.String str55 = item52.toString();
        java.lang.String str56 = item52.name;
        com.gildedrose.Item item57 = itemUpdater4.update(item52);
        com.gildedrose.Item item61 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1, 52, 52", 0, 9);
        com.gildedrose.Item item62 = itemUpdater4.update(item61);
        java.lang.Class<?> wildcardClass63 = item62.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(item42);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertNotNull(itemUpdater46);
        org.junit.Assert.assertNotNull(itemUpdater48);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertNotNull(item54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!, 99, 0" + "'", str55, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertNotNull(item62);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item18 = new com.gildedrose.Item("hi!, -1, 0", (int) (byte) -1, (int) (short) 0);
        java.lang.String str19 = item18.toString();
        com.gildedrose.Item item20 = itemUpdater14.update(item18);
        com.gildedrose.Item item24 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1", (int) 'a', 50);
        com.gildedrose.Item item25 = itemUpdater14.update(item24);
        item25.sellIn = 0;
        int int28 = item25.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, -1, 0, -1, 0" + "'", str19, "hi!, -1, 0, -1, 0");
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertNotNull(item25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 49 + "'", int28 == 49);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        item11.sellIn = (byte) 0;
        com.gildedrose.Item item16 = itemUpdater4.update(item11);
        java.lang.String str17 = item11.toString();
        java.lang.String str18 = item11.name;
        int int19 = item11.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, -1, 0" + "'", str17, "hi!, -1, 0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 0, 1", 49, (int) (short) 0);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', 1);
        int int4 = item3.sellIn;
        item3.name = "hi!";
        item3.name = "hi!, 100, 1, 10, 0";
        java.lang.String str9 = item3.toString();
        item3.quality = 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 100, 1, 10, 0, 52, 1" + "'", str9, "hi!, 100, 1, 10, 0, 52, 1");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        int int14 = item11.sellIn;
        int int15 = item11.sellIn;
        com.gildedrose.Item item16 = itemUpdater4.update(item11);
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        int int21 = item20.quality;
        com.gildedrose.Item item22 = itemUpdater4.update(item20);
        item20.name = "hi!, 99, 0, 0, 10";
        item20.name = "hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, -3";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(item22);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 51, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.Item item23 = new com.gildedrose.Item("hi!", 100, 1);
        int int24 = item23.sellIn;
        com.gildedrose.Item item25 = itemUpdater19.update(item23);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory26 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory26.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory29 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater31 = itemUpdaterFactory29.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory29.getInstance("");
        com.gildedrose.Item item37 = new com.gildedrose.Item("hi!", 100, 1);
        int int38 = item37.sellIn;
        com.gildedrose.Item item39 = itemUpdater33.update(item37);
        com.gildedrose.Item item40 = itemUpdater28.update(item39);
        com.gildedrose.Item item41 = itemUpdater19.update(item40);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater42 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item46 = new com.gildedrose.Item("hi!", 100, 1);
        int int47 = item46.sellIn;
        com.gildedrose.Item item48 = conjuredItemUpdater42.update(item46);
        com.gildedrose.Item item49 = itemUpdater19.update(item46);
        int int50 = item46.quality;
        item46.sellIn = 99;
        item46.name = "";
        item46.name = "hi!, 51, 0";
        com.gildedrose.Item item57 = itemUpdater16.update(item46);
        java.lang.Class<?> wildcardClass58 = itemUpdater16.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(item25);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater31);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertNotNull(item40);
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(item49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item18 = new com.gildedrose.Item("hi!, -1, 0", (int) (byte) -1, (int) (short) 0);
        java.lang.String str19 = item18.toString();
        com.gildedrose.Item item20 = itemUpdater14.update(item18);
        com.gildedrose.Item item24 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1", (int) 'a', 50);
        com.gildedrose.Item item25 = itemUpdater14.update(item24);
        item24.name = "hi!, 100, -1";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, -1, 0, -1, 0" + "'", str19, "hi!, -1, 0, -1, 0");
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertNotNull(item25);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance(", 52, 1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance(", 100, 1, -4, 0");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1, 99, -1");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        item17.name = "hi!, -1, 0";
        item17.sellIn = (byte) 100;
        item17.quality = 1;
        com.gildedrose.Item item24 = itemUpdater8.update(item17);
        int int25 = item17.sellIn;
        int int26 = item17.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 99 + "'", int25 == 99);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 99 + "'", int26 == 99);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        item3.name = "hi!, 0, 0, 52, 0";
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0" + "'", str4, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 0, 0" + "'", str5, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        item6.name = "hi!, 0, 0, 99, 0";
        java.lang.Class<?> wildcardClass11 = item6.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 52, 1", (int) '#', 98);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        item17.name = "hi!, -1, 0";
        item17.sellIn = (byte) 100;
        item17.quality = 1;
        com.gildedrose.Item item24 = itemUpdater8.update(item17);
        int int25 = item17.sellIn;
        item17.sellIn = 0;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 99 + "'", int25 == 99);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        int int6 = item3.quality;
        item3.name = "hi!, 0, 0, 52, 1";
        int int9 = item3.sellIn;
        java.lang.String str10 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str10, "hi!, 0, 0, 52, 1");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory3 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory8 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory8.getInstance("");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!", 100, 1);
        int int15 = item14.sellIn;
        com.gildedrose.Item item16 = itemUpdater10.update(item14);
        item14.sellIn = (byte) 0;
        com.gildedrose.Item item19 = itemUpdater7.update(item14);
        com.gildedrose.Item item20 = itemUpdater2.update(item14);
        com.gildedrose.Item item24 = new com.gildedrose.Item("", (int) '4', 1);
        int int25 = item24.sellIn;
        item24.name = "hi!";
        java.lang.String str28 = item24.name;
        int int29 = item24.sellIn;
        com.gildedrose.Item item30 = itemUpdater2.update(item24);
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!, -1, 0", (int) (byte) -1, (int) (short) 0);
        int int35 = item34.sellIn;
        com.gildedrose.Item item36 = itemUpdater2.update(item34);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory37 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater39 = itemUpdaterFactory37.getInstance("");
        com.gildedrose.Item item43 = new com.gildedrose.Item("hi!", 100, 1);
        int int44 = item43.sellIn;
        com.gildedrose.Item item45 = itemUpdater39.update(item43);
        int int46 = item43.sellIn;
        java.lang.String str47 = item43.toString();
        int int48 = item43.sellIn;
        com.gildedrose.Item item49 = itemUpdater2.update(item43);
        item49.sellIn = 10;
        java.lang.Class<?> wildcardClass52 = item49.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertNotNull(itemUpdater39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 99 + "'", int46 == 99);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!, 99, 0" + "'", str47, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 99 + "'", int48 == 99);
        org.junit.Assert.assertNotNull(item49);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (-1), 9);
        java.lang.String str4 = item3.toString();
        item3.quality = 8;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", -1, 9" + "'", str4, ", -1, 9");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, -1, 0", 0, (int) (byte) 0);
        com.gildedrose.Item item13 = itemUpdater2.update(item12);
        int int14 = item12.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str9 = item8.name;
        java.lang.String str10 = item8.name;
        item8.sellIn = (short) -1;
        item8.quality = 100;
        item8.name = "hi!, 100, 1, 32, 100, -2, 1";
        com.gildedrose.Item item17 = itemUpdater4.update(item8);
        java.lang.Class<?> wildcardClass18 = itemUpdater4.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 0, 0" + "'", str9, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 0, 0" + "'", str10, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item19 = new com.gildedrose.Item("hi!", 100, 1);
        int int20 = item19.sellIn;
        com.gildedrose.Item item21 = conjuredItemUpdater15.update(item19);
        item19.name = "hi!, 0, 0";
        com.gildedrose.Item item24 = itemUpdater14.update(item19);
        int int25 = item19.sellIn;
        item19.sellIn = '4';
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 98 + "'", int25 == 98);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory12 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        com.gildedrose.Item item23 = itemUpdater11.update(item22);
        com.gildedrose.Item item24 = itemUpdater2.update(item23);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory25 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory25.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory25.getInstance("");
        com.gildedrose.Item item33 = new com.gildedrose.Item("hi!", 100, 1);
        int int34 = item33.sellIn;
        com.gildedrose.Item item35 = itemUpdater29.update(item33);
        java.lang.String str36 = item33.toString();
        item33.sellIn = 10;
        int int39 = item33.sellIn;
        item33.name = "hi!, 10, 0";
        int int42 = item33.sellIn;
        com.gildedrose.Item item43 = itemUpdater2.update(item33);
        com.gildedrose.Item item47 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        item47.name = "hi!, 10, 0";
        item47.name = "hi!, -1, 1";
        com.gildedrose.Item item52 = itemUpdater2.update(item47);
        com.gildedrose.Item item56 = new com.gildedrose.Item("hi!", (int) (short) 100, (int) (byte) -1);
        int int57 = item56.quality;
        java.lang.String str58 = item56.toString();
        com.gildedrose.Item item59 = itemUpdater2.update(item56);
        int int60 = item56.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 99, 0" + "'", str36, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!, 100, -1" + "'", str58, "hi!, 100, -1");
        org.junit.Assert.assertNotNull(item59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 99 + "'", int60 == 99);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory3 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory8 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory8.getInstance("");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!", 100, 1);
        int int15 = item14.sellIn;
        com.gildedrose.Item item16 = itemUpdater10.update(item14);
        item14.sellIn = (byte) 0;
        com.gildedrose.Item item19 = itemUpdater7.update(item14);
        com.gildedrose.Item item20 = itemUpdater2.update(item14);
        com.gildedrose.Item item24 = new com.gildedrose.Item("", (int) '4', 1);
        int int25 = item24.sellIn;
        item24.name = "hi!";
        java.lang.String str28 = item24.name;
        int int29 = item24.sellIn;
        com.gildedrose.Item item30 = itemUpdater2.update(item24);
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!, -1, 0", (int) (byte) -1, (int) (short) 0);
        int int35 = item34.sellIn;
        com.gildedrose.Item item36 = itemUpdater2.update(item34);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory37 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater39 = itemUpdaterFactory37.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory40 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory40.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater44 = itemUpdaterFactory40.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory45 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater47 = itemUpdaterFactory45.getInstance("");
        com.gildedrose.Item item51 = new com.gildedrose.Item("hi!", 100, 1);
        int int52 = item51.sellIn;
        com.gildedrose.Item item53 = itemUpdater47.update(item51);
        item51.sellIn = (byte) 0;
        com.gildedrose.Item item56 = itemUpdater44.update(item51);
        com.gildedrose.Item item57 = itemUpdater39.update(item51);
        com.gildedrose.Item item61 = new com.gildedrose.Item("", (int) '4', 1);
        int int62 = item61.sellIn;
        item61.name = "hi!";
        java.lang.String str65 = item61.name;
        int int66 = item61.sellIn;
        com.gildedrose.Item item67 = itemUpdater39.update(item61);
        com.gildedrose.Item item71 = new com.gildedrose.Item("hi!, -1, 0", (int) (byte) -1, (int) (short) 0);
        int int72 = item71.sellIn;
        com.gildedrose.Item item73 = itemUpdater39.update(item71);
        item73.quality = (short) 100;
        java.lang.String str76 = item73.name;
        com.gildedrose.Item item77 = itemUpdater2.update(item73);
        item77.sellIn = (-3);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertNotNull(itemUpdater39);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertNotNull(itemUpdater44);
        org.junit.Assert.assertNotNull(itemUpdater47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertNotNull(item56);
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 52 + "'", int62 == 52);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 52 + "'", int66 == 52);
        org.junit.Assert.assertNotNull(item67);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(item73);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!, -1, 0" + "'", str76, "hi!, -1, 0");
        org.junit.Assert.assertNotNull(item77);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item13 = new com.gildedrose.Item("hi!", 100, 1);
        int int14 = item13.sellIn;
        com.gildedrose.Item item15 = itemUpdater9.update(item13);
        java.lang.String str16 = item13.toString();
        item13.sellIn = 10;
        java.lang.String str19 = item13.toString();
        item13.sellIn = 1;
        com.gildedrose.Item item22 = itemUpdater4.update(item13);
        java.lang.String str23 = item13.toString();
        java.lang.String str24 = item13.name;
        java.lang.String str25 = item13.toString();
        int int26 = item13.sellIn;
        java.lang.Class<?> wildcardClass27 = item13.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 99, 0" + "'", str16, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 10, 0" + "'", str19, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 0, 0" + "'", str23, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!, 0, 0" + "'", str25, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50", 50, 97);
        item3.sellIn = 50;
        java.lang.String str6 = item3.name;
        item3.sellIn = 30;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 0, 50" + "'", str6, ", 0, 50");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 51, 0", 96, 50);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        item11.sellIn = (byte) 0;
        com.gildedrose.Item item16 = itemUpdater4.update(item11);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory17.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory17.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory17.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory26 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory26.getInstance("");
        com.gildedrose.Item item32 = new com.gildedrose.Item("hi!", 100, 1);
        int int33 = item32.sellIn;
        com.gildedrose.Item item34 = itemUpdater28.update(item32);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory35 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater37 = itemUpdaterFactory35.getInstance("");
        com.gildedrose.Item item41 = new com.gildedrose.Item("hi!", 100, 1);
        int int42 = item41.sellIn;
        com.gildedrose.Item item43 = itemUpdater37.update(item41);
        item41.sellIn = (byte) 0;
        java.lang.String str46 = item41.toString();
        com.gildedrose.Item item47 = itemUpdater28.update(item41);
        com.gildedrose.Item item48 = itemUpdater25.update(item41);
        com.gildedrose.Item item49 = itemUpdater4.update(item48);
        java.lang.String str50 = item48.name;
        int int51 = item48.quality;
        item48.quality = 0;
        item48.name = ", 0, 0";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertNotNull(itemUpdater37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!, 0, 0" + "'", str46, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(item49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50", 10, (int) ' ');
        int int4 = item3.sellIn;
        item3.name = "hi!, 100, 1, 35, 0";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = conjuredItemUpdater11.update(item15);
        com.gildedrose.Item item21 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str22 = item21.name;
        java.lang.String str23 = item21.name;
        int int24 = item21.quality;
        java.lang.String str25 = item21.toString();
        com.gildedrose.Item item26 = conjuredItemUpdater11.update(item21);
        java.lang.String str27 = item26.name;
        item26.name = "hi!, 99, 0";
        com.gildedrose.Item item30 = itemUpdater10.update(item26);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory31 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory31.getInstance("");
        com.gildedrose.Item item37 = new com.gildedrose.Item("hi!", 100, 1);
        int int38 = item37.sellIn;
        com.gildedrose.Item item39 = itemUpdater33.update(item37);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory40 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory40.getInstance("");
        com.gildedrose.Item item46 = new com.gildedrose.Item("hi!", 100, 1);
        int int47 = item46.sellIn;
        com.gildedrose.Item item48 = itemUpdater42.update(item46);
        item46.sellIn = (byte) 0;
        java.lang.String str51 = item46.toString();
        com.gildedrose.Item item52 = itemUpdater33.update(item46);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory53 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater55 = itemUpdaterFactory53.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater57 = itemUpdaterFactory53.getInstance("");
        com.gildedrose.Item item61 = new com.gildedrose.Item("hi!", 100, 1);
        int int62 = item61.sellIn;
        com.gildedrose.Item item63 = itemUpdater57.update(item61);
        java.lang.String str64 = item61.toString();
        item61.sellIn = 10;
        java.lang.String str67 = item61.toString();
        item61.sellIn = 98;
        item61.sellIn = (byte) 10;
        com.gildedrose.Item item72 = itemUpdater33.update(item61);
        int int73 = item61.quality;
        java.lang.String str74 = item61.toString();
        com.gildedrose.Item item75 = itemUpdater10.update(item61);
        java.lang.Class<?> wildcardClass76 = item61.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!, 100, 1" + "'", str25, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!, 0, 0" + "'", str51, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertNotNull(itemUpdater55);
        org.junit.Assert.assertNotNull(itemUpdater57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertNotNull(item63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!, 99, 0" + "'", str64, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!, 10, 0" + "'", str67, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!, 9, 0" + "'", str74, "hi!, 9, 0");
        org.junit.Assert.assertNotNull(item75);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        item11.sellIn = (byte) 0;
        com.gildedrose.Item item16 = itemUpdater4.update(item11);
        int int17 = item16.quality;
        java.lang.String str18 = item16.toString();
        java.lang.String str19 = item16.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, -1, 0" + "'", str18, "hi!, -1, 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, -1, 0" + "'", str19, "hi!, -1, 0");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) '4', (int) (byte) 1);
        java.lang.String str4 = item3.name;
        item3.quality = 'a';
        item3.name = "hi!, -1, 0";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 32");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory10 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory10.getInstance("");
        com.gildedrose.Item item16 = new com.gildedrose.Item("hi!", 100, 1);
        int int17 = item16.sellIn;
        com.gildedrose.Item item18 = itemUpdater12.update(item16);
        item16.sellIn = (byte) 0;
        com.gildedrose.Item item21 = itemUpdater9.update(item16);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory22 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory22.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory22.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory22.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory31 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory31.getInstance("");
        com.gildedrose.Item item37 = new com.gildedrose.Item("hi!", 100, 1);
        int int38 = item37.sellIn;
        com.gildedrose.Item item39 = itemUpdater33.update(item37);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory40 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory40.getInstance("");
        com.gildedrose.Item item46 = new com.gildedrose.Item("hi!", 100, 1);
        int int47 = item46.sellIn;
        com.gildedrose.Item item48 = itemUpdater42.update(item46);
        item46.sellIn = (byte) 0;
        java.lang.String str51 = item46.toString();
        com.gildedrose.Item item52 = itemUpdater33.update(item46);
        com.gildedrose.Item item53 = itemUpdater30.update(item46);
        com.gildedrose.Item item54 = itemUpdater9.update(item53);
        java.lang.String str55 = item53.name;
        java.lang.String str56 = item53.toString();
        com.gildedrose.Item item57 = itemUpdater4.update(item53);
        com.gildedrose.Item item61 = new com.gildedrose.Item("", (int) '4', 1);
        int int62 = item61.sellIn;
        item61.name = "hi!";
        com.gildedrose.Item item65 = itemUpdater4.update(item61);
        item65.quality = (short) 1;
        item65.quality = 0;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!, 0, 0" + "'", str51, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertNotNull(item54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!, -3, 0" + "'", str56, "hi!, -3, 0");
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 52 + "'", int62 == 52);
        org.junit.Assert.assertNotNull(item65);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str13 = item12.name;
        int int14 = item12.sellIn;
        com.gildedrose.Item item15 = itemUpdater8.update(item12);
        item15.sellIn = 100;
        int int18 = item15.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 0, 0" + "'", str13, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.Item item17 = new com.gildedrose.Item("hi!", 100, 1);
        int int18 = item17.sellIn;
        com.gildedrose.Item item19 = itemUpdater13.update(item17);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory20 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory23 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory23.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory23.getInstance("");
        com.gildedrose.Item item31 = new com.gildedrose.Item("hi!", 100, 1);
        int int32 = item31.sellIn;
        com.gildedrose.Item item33 = itemUpdater27.update(item31);
        com.gildedrose.Item item34 = itemUpdater22.update(item33);
        com.gildedrose.Item item35 = itemUpdater13.update(item34);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater36 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item40 = new com.gildedrose.Item("hi!", 100, 1);
        int int41 = item40.sellIn;
        com.gildedrose.Item item42 = conjuredItemUpdater36.update(item40);
        com.gildedrose.Item item43 = itemUpdater13.update(item40);
        com.gildedrose.Item item44 = itemUpdater4.update(item40);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory45 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater47 = itemUpdaterFactory45.getInstance("");
        com.gildedrose.Item item51 = new com.gildedrose.Item("hi!", 100, 1);
        int int52 = item51.sellIn;
        com.gildedrose.Item item53 = itemUpdater47.update(item51);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory54 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater56 = itemUpdaterFactory54.getInstance("");
        com.gildedrose.Item item60 = new com.gildedrose.Item("hi!", 100, 1);
        int int61 = item60.sellIn;
        com.gildedrose.Item item62 = itemUpdater56.update(item60);
        item60.sellIn = (byte) 0;
        java.lang.String str65 = item60.toString();
        com.gildedrose.Item item66 = itemUpdater47.update(item60);
        item66.quality = '4';
        java.lang.String str69 = item66.name;
        int int70 = item66.sellIn;
        java.lang.String str71 = item66.name;
        item66.sellIn = (byte) 100;
        com.gildedrose.Item item74 = itemUpdater4.update(item66);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(item42);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertNotNull(itemUpdater47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertNotNull(itemUpdater56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertNotNull(item62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!, 0, 0" + "'", str65, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(item74);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0, 0, 52", 31, (int) (short) 10);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item14 = new com.gildedrose.Item("", 1, (int) ' ');
        java.lang.String str15 = item14.name;
        item14.sellIn = 'a';
        com.gildedrose.Item item18 = itemUpdater10.update(item14);
        int int19 = item14.sellIn;
        java.lang.String str20 = item14.toString();
        item14.quality = 49;
        int int23 = item14.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 96 + "'", int19 == 96);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ", 96, 31" + "'", str20, ", 96, 31");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 96 + "'", int23 == 96);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.Item item13 = new com.gildedrose.Item("hi!", 100, 1);
        int int14 = item13.sellIn;
        com.gildedrose.Item item15 = itemUpdater9.update(item13);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.Item item22 = new com.gildedrose.Item("hi!", 100, 1);
        int int23 = item22.sellIn;
        com.gildedrose.Item item24 = itemUpdater18.update(item22);
        item22.sellIn = (byte) 0;
        java.lang.String str27 = item22.toString();
        com.gildedrose.Item item28 = itemUpdater9.update(item22);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory29 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater31 = itemUpdaterFactory29.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory29.getInstance("");
        com.gildedrose.Item item37 = new com.gildedrose.Item("hi!", 100, 1);
        int int38 = item37.sellIn;
        com.gildedrose.Item item39 = itemUpdater33.update(item37);
        java.lang.String str40 = item37.toString();
        item37.sellIn = 10;
        java.lang.String str43 = item37.toString();
        item37.sellIn = 98;
        item37.sellIn = (byte) 10;
        com.gildedrose.Item item48 = itemUpdater9.update(item37);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory49 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater51 = itemUpdaterFactory49.getInstance("");
        com.gildedrose.Item item55 = new com.gildedrose.Item("hi!", 100, 1);
        int int56 = item55.sellIn;
        com.gildedrose.Item item57 = itemUpdater51.update(item55);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory58 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater60 = itemUpdaterFactory58.getInstance("");
        com.gildedrose.Item item64 = new com.gildedrose.Item("hi!", 100, 1);
        int int65 = item64.sellIn;
        com.gildedrose.Item item66 = itemUpdater60.update(item64);
        item64.sellIn = (byte) 0;
        java.lang.String str69 = item64.toString();
        com.gildedrose.Item item70 = itemUpdater51.update(item64);
        com.gildedrose.Item item71 = itemUpdater9.update(item70);
        com.gildedrose.Item item72 = conjuredItemUpdater0.update(item70);
        item72.name = "hi!, 100, 1";
        java.lang.String str75 = item72.toString();
        java.lang.Class<?> wildcardClass76 = item72.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!, 0, 0" + "'", str27, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(itemUpdater31);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!, 99, 0" + "'", str40, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!, 10, 0" + "'", str43, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(itemUpdater51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertNotNull(itemUpdater60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!, 0, 0" + "'", str69, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item70);
        org.junit.Assert.assertNotNull(item71);
        org.junit.Assert.assertNotNull(item72);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!, 100, 1, -3, 0" + "'", str75, "hi!, 100, 1, -3, 0");
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        item15.sellIn = (byte) 0;
        java.lang.String str20 = item15.toString();
        com.gildedrose.Item item21 = itemUpdater2.update(item15);
        int int22 = item15.sellIn;
        int int23 = item15.quality;
        java.lang.String str24 = item15.toString();
        item15.sellIn = 99;
        int int27 = item15.sellIn;
        item15.quality = '#';
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!, -1, 0" + "'", str24, "hi!, -1, 0");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        int int9 = item4.quality;
        item4.name = "";
        int int12 = item4.quality;
        int int13 = item4.sellIn;
        int int14 = item4.sellIn;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1, 52, 52", 51, (int) (byte) 1);
        item3.quality = 49;
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 98, 0, 97, 35", (int) (byte) 10, (-2));
        int int4 = item3.quality;
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 97, 50", (int) (short) 10, 0);
        item3.name = "hi!, -1, 0, -2, 0";
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        java.lang.String str14 = item8.toString();
        item8.sellIn = 98;
        item8.quality = 50;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        java.lang.Class<?> wildcardClass7 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0, 0, 98" + "'", str4, "hi!, 0, 0, 0, 98");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49", 35, (-1));
        item3.name = ", 1, 99";
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.Item item12 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        item12.quality = '4';
        com.gildedrose.Item item15 = itemUpdater8.update(item12);
        item15.name = "hi!, 100, 1, 9, 1, 100, 1";
        item15.quality = 99;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item15);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory9.getInstance("hi!, 100, 52");
        com.gildedrose.Item item21 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        item21.quality = '4';
        com.gildedrose.Item item24 = itemUpdater17.update(item21);
        com.gildedrose.Item item25 = itemUpdater8.update(item24);
        item24.quality = 99;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertNotNull(item25);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item19 = new com.gildedrose.Item("hi!", 100, 1);
        int int20 = item19.sellIn;
        com.gildedrose.Item item21 = conjuredItemUpdater15.update(item19);
        item19.name = "hi!, 0, 0";
        com.gildedrose.Item item24 = itemUpdater14.update(item19);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory25 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory25.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory25.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory30 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater32 = itemUpdaterFactory30.getInstance("");
        com.gildedrose.Item item36 = new com.gildedrose.Item("hi!", 100, 1);
        int int37 = item36.sellIn;
        com.gildedrose.Item item38 = itemUpdater32.update(item36);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory39 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater41 = itemUpdaterFactory39.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory42 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater44 = itemUpdaterFactory42.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater46 = itemUpdaterFactory42.getInstance("");
        com.gildedrose.Item item50 = new com.gildedrose.Item("hi!", 100, 1);
        int int51 = item50.sellIn;
        com.gildedrose.Item item52 = itemUpdater46.update(item50);
        com.gildedrose.Item item53 = itemUpdater41.update(item52);
        com.gildedrose.Item item54 = itemUpdater32.update(item53);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater55 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item59 = new com.gildedrose.Item("hi!", 100, 1);
        int int60 = item59.sellIn;
        com.gildedrose.Item item61 = conjuredItemUpdater55.update(item59);
        com.gildedrose.Item item62 = itemUpdater32.update(item59);
        com.gildedrose.Item item66 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        com.gildedrose.Item item67 = itemUpdater32.update(item66);
        com.gildedrose.Item item68 = itemUpdater29.update(item66);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory69 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater71 = itemUpdaterFactory69.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater73 = itemUpdaterFactory69.getInstance("");
        com.gildedrose.Item item77 = new com.gildedrose.Item("hi!", 100, 1);
        int int78 = item77.sellIn;
        com.gildedrose.Item item79 = itemUpdater73.update(item77);
        java.lang.String str80 = item77.toString();
        java.lang.String str81 = item77.name;
        com.gildedrose.Item item82 = itemUpdater29.update(item77);
        com.gildedrose.Item item83 = itemUpdater14.update(item82);
        int int84 = item82.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater29);
        org.junit.Assert.assertNotNull(itemUpdater32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(item38);
        org.junit.Assert.assertNotNull(itemUpdater41);
        org.junit.Assert.assertNotNull(itemUpdater44);
        org.junit.Assert.assertNotNull(itemUpdater46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertNotNull(item54);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertNotNull(item61);
        org.junit.Assert.assertNotNull(item62);
        org.junit.Assert.assertNotNull(item67);
        org.junit.Assert.assertNotNull(item68);
        org.junit.Assert.assertNotNull(itemUpdater71);
        org.junit.Assert.assertNotNull(itemUpdater73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        org.junit.Assert.assertNotNull(item79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!, 99, 0" + "'", str80, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(item82);
        org.junit.Assert.assertNotNull(item83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', 1);
        item3.name = "hi!, 0, 0";
        int int6 = item3.sellIn;
        item3.sellIn = 51;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory14 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory19 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory19.getInstance("");
        com.gildedrose.Item item25 = new com.gildedrose.Item("hi!", 100, 1);
        int int26 = item25.sellIn;
        com.gildedrose.Item item27 = itemUpdater21.update(item25);
        item25.sellIn = (byte) 0;
        com.gildedrose.Item item30 = itemUpdater18.update(item25);
        com.gildedrose.Item item31 = itemUpdater8.update(item30);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory32 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater34 = itemUpdaterFactory32.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater36 = itemUpdaterFactory32.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory37 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater39 = itemUpdaterFactory37.getInstance("");
        com.gildedrose.Item item43 = new com.gildedrose.Item("hi!", 100, 1);
        int int44 = item43.sellIn;
        com.gildedrose.Item item45 = itemUpdater39.update(item43);
        item43.sellIn = (byte) 0;
        com.gildedrose.Item item48 = itemUpdater36.update(item43);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory49 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater51 = itemUpdaterFactory49.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory52 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater54 = itemUpdaterFactory52.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater56 = itemUpdaterFactory52.getInstance("");
        com.gildedrose.Item item60 = new com.gildedrose.Item("hi!", 100, 1);
        int int61 = item60.sellIn;
        com.gildedrose.Item item62 = itemUpdater56.update(item60);
        com.gildedrose.Item item63 = itemUpdater51.update(item62);
        com.gildedrose.Item item64 = itemUpdater36.update(item63);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory65 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater67 = itemUpdaterFactory65.getInstance("");
        com.gildedrose.Item item71 = new com.gildedrose.Item("hi!", 100, 1);
        int int72 = item71.sellIn;
        com.gildedrose.Item item73 = itemUpdater67.update(item71);
        com.gildedrose.Item item74 = itemUpdater36.update(item73);
        com.gildedrose.Item item75 = itemUpdater8.update(item74);
        java.lang.Class<?> wildcardClass76 = item74.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(itemUpdater34);
        org.junit.Assert.assertNotNull(itemUpdater36);
        org.junit.Assert.assertNotNull(itemUpdater39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(itemUpdater51);
        org.junit.Assert.assertNotNull(itemUpdater54);
        org.junit.Assert.assertNotNull(itemUpdater56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertNotNull(item62);
        org.junit.Assert.assertNotNull(item63);
        org.junit.Assert.assertNotNull(item64);
        org.junit.Assert.assertNotNull(itemUpdater67);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 100 + "'", int72 == 100);
        org.junit.Assert.assertNotNull(item73);
        org.junit.Assert.assertNotNull(item74);
        org.junit.Assert.assertNotNull(item75);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 32");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!, 100, 1, 32, 100", (-2), 98);
        com.gildedrose.Item item9 = itemUpdater4.update(item8);
        java.lang.String str10 = item8.name;
        java.lang.String str11 = item8.toString();
        java.lang.Class<?> wildcardClass12 = item8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(item9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 100, 1, 32, 100" + "'", str10, "hi!, 100, 1, 32, 100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 100, 1, 32, 100, -3, 50" + "'", str11, "hi!, 100, 1, 32, 100, -3, 50");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 100, 0", 96, 49);
        item3.name = "hi!, -3, 0";
        int int6 = item3.quality;
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -3, 0" + "'", str7, "hi!, -3, 0");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 32");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory10 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory10.getInstance("");
        com.gildedrose.Item item16 = new com.gildedrose.Item("hi!", 100, 1);
        int int17 = item16.sellIn;
        com.gildedrose.Item item18 = itemUpdater12.update(item16);
        item16.sellIn = (byte) 0;
        com.gildedrose.Item item21 = itemUpdater9.update(item16);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory22 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory22.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory22.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory22.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory31 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory31.getInstance("");
        com.gildedrose.Item item37 = new com.gildedrose.Item("hi!", 100, 1);
        int int38 = item37.sellIn;
        com.gildedrose.Item item39 = itemUpdater33.update(item37);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory40 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory40.getInstance("");
        com.gildedrose.Item item46 = new com.gildedrose.Item("hi!", 100, 1);
        int int47 = item46.sellIn;
        com.gildedrose.Item item48 = itemUpdater42.update(item46);
        item46.sellIn = (byte) 0;
        java.lang.String str51 = item46.toString();
        com.gildedrose.Item item52 = itemUpdater33.update(item46);
        com.gildedrose.Item item53 = itemUpdater30.update(item46);
        com.gildedrose.Item item54 = itemUpdater9.update(item53);
        java.lang.String str55 = item53.name;
        java.lang.String str56 = item53.toString();
        com.gildedrose.Item item57 = itemUpdater4.update(item53);
        com.gildedrose.Item item61 = new com.gildedrose.Item("", (int) '4', 1);
        int int62 = item61.sellIn;
        item61.name = "hi!";
        com.gildedrose.Item item65 = itemUpdater4.update(item61);
        item65.quality = (short) 1;
        item65.quality = 10;
        int int70 = item65.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!, 0, 0" + "'", str51, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertNotNull(item54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!, -3, 0" + "'", str56, "hi!, -3, 0");
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 52 + "'", int62 == 52);
        org.junit.Assert.assertNotNull(item65);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 51 + "'", int70 == 51);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 98, 0, 97, 35");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item17 = new com.gildedrose.Item("hi!", 100, 1);
        int int18 = item17.sellIn;
        com.gildedrose.Item item19 = conjuredItemUpdater13.update(item17);
        item17.name = "hi!, 0, 0";
        int int22 = item17.quality;
        item17.quality = (short) -1;
        item17.name = "hi!";
        item17.name = "hi!, 0, 0, 0, 1";
        item17.sellIn = (-2);
        java.lang.String str31 = item17.toString();
        com.gildedrose.Item item32 = itemUpdater12.update(item17);
        java.lang.Class<?> wildcardClass33 = itemUpdater12.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!, 0, 0, 0, 1, -2, -1" + "'", str31, "hi!, 0, 0, 0, 1, -2, -1");
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        item11.sellIn = (byte) 0;
        com.gildedrose.Item item16 = itemUpdater4.update(item11);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory20 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.Item item28 = new com.gildedrose.Item("hi!", 100, 1);
        int int29 = item28.sellIn;
        com.gildedrose.Item item30 = itemUpdater24.update(item28);
        com.gildedrose.Item item31 = itemUpdater19.update(item30);
        com.gildedrose.Item item32 = itemUpdater4.update(item31);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory33 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory33.getInstance("");
        com.gildedrose.Item item39 = new com.gildedrose.Item("hi!", 100, 1);
        int int40 = item39.sellIn;
        com.gildedrose.Item item41 = itemUpdater35.update(item39);
        com.gildedrose.Item item42 = itemUpdater4.update(item41);
        item41.name = "hi!, 10, 0";
        java.lang.String str45 = item41.name;
        item41.quality = 31;
        item41.sellIn = 8;
        item41.name = "hi!, 8, 0";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertNotNull(item42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!, 10, 0" + "'", str45, "hi!, 10, 0");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, -4, 0", 1, 97);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1, -4, 0, 1, 97" + "'", str4, ", 100, 1, -4, 0, 1, 97");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 49, 48");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 52, 1, 0, 32");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 0, 0, -2, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item13 = new com.gildedrose.Item("hi!", 100, 1);
        int int14 = item13.sellIn;
        com.gildedrose.Item item15 = itemUpdater9.update(item13);
        java.lang.String str16 = item13.toString();
        item13.sellIn = 10;
        java.lang.String str19 = item13.toString();
        item13.sellIn = 1;
        com.gildedrose.Item item22 = itemUpdater4.update(item13);
        java.lang.String str23 = item13.toString();
        java.lang.String str24 = item13.name;
        item13.sellIn = 98;
        int int27 = item13.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 99, 0" + "'", str16, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 10, 0" + "'", str19, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 0, 0" + "'", str23, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory14 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory23 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory23.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory26 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory26.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory26.getInstance("");
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!", 100, 1);
        int int35 = item34.sellIn;
        com.gildedrose.Item item36 = itemUpdater30.update(item34);
        com.gildedrose.Item item37 = itemUpdater25.update(item36);
        com.gildedrose.Item item38 = itemUpdater16.update(item37);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater39 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item43 = new com.gildedrose.Item("hi!", 100, 1);
        int int44 = item43.sellIn;
        com.gildedrose.Item item45 = conjuredItemUpdater39.update(item43);
        com.gildedrose.Item item46 = itemUpdater16.update(item43);
        int int47 = item43.quality;
        item43.sellIn = 99;
        item43.name = "";
        item43.name = "hi!, 51, 0";
        com.gildedrose.Item item54 = itemUpdater8.update(item43);
        java.lang.String str55 = item54.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(item38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertNotNull(item46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(item54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!, 51, 0, 98, 0" + "'", str55, "hi!, 51, 0, 98, 0");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 8, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance(", 99, -1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 52");
        java.lang.Class<?> wildcardClass15 = itemUpdater14.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        item11.sellIn = (byte) 0;
        com.gildedrose.Item item16 = itemUpdater4.update(item11);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory20 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.Item item28 = new com.gildedrose.Item("hi!", 100, 1);
        int int29 = item28.sellIn;
        com.gildedrose.Item item30 = itemUpdater24.update(item28);
        com.gildedrose.Item item31 = itemUpdater19.update(item30);
        com.gildedrose.Item item32 = itemUpdater4.update(item31);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory33 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory33.getInstance("");
        com.gildedrose.Item item39 = new com.gildedrose.Item("hi!", 100, 1);
        int int40 = item39.sellIn;
        com.gildedrose.Item item41 = itemUpdater35.update(item39);
        com.gildedrose.Item item42 = itemUpdater4.update(item41);
        item41.name = "hi!, 10, 0";
        java.lang.String str45 = item41.name;
        item41.quality = 31;
        java.lang.Class<?> wildcardClass48 = item41.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertNotNull(item42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!, 10, 0" + "'", str45, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 1, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 50, 0");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!, 0, 0, 0, 1", 0, (int) (short) 10);
        int int21 = item20.quality;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        java.lang.String str23 = item20.name;
        int int24 = item20.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str23, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        int int9 = item4.quality;
        item4.name = "";
        item4.quality = (-1);
        item4.name = "hi!, 100, -1, 10, 100";
        item4.quality = (short) 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 1, 99", 51, 35);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        item3.quality = '4';
        int int6 = item3.quality;
        java.lang.String str7 = item3.toString();
        int int8 = item3.sellIn;
        item3.sellIn = 49;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 1, 52" + "'", str7, ", 1, 52");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        item11.sellIn = (byte) 0;
        com.gildedrose.Item item16 = itemUpdater4.update(item11);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory20 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.Item item28 = new com.gildedrose.Item("hi!", 100, 1);
        int int29 = item28.sellIn;
        com.gildedrose.Item item30 = itemUpdater24.update(item28);
        com.gildedrose.Item item31 = itemUpdater19.update(item30);
        com.gildedrose.Item item32 = itemUpdater4.update(item31);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory33 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory33.getInstance("");
        com.gildedrose.Item item39 = new com.gildedrose.Item("hi!", 100, 1);
        int int40 = item39.sellIn;
        com.gildedrose.Item item41 = itemUpdater35.update(item39);
        com.gildedrose.Item item42 = itemUpdater4.update(item41);
        com.gildedrose.Item item46 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str47 = item46.name;
        java.lang.String str48 = item46.toString();
        java.lang.String str49 = item46.toString();
        com.gildedrose.Item item50 = itemUpdater4.update(item46);
        java.lang.Class<?> wildcardClass51 = itemUpdater4.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertNotNull(item42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!, 0, 0" + "'", str47, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str48, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str49, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 9", (int) '4', 52);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 10", (int) '#', 50);
        item3.sellIn = ' ';
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        item3.sellIn = (short) -1;
        item3.quality = 100;
        item3.name = "hi!, 100, 1, 32, 100, -2, 1";
        item3.quality = (-2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0" + "'", str4, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 0, 0" + "'", str5, "hi!, 0, 0");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory3 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory8 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory8.getInstance("");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!", 100, 1);
        int int15 = item14.sellIn;
        com.gildedrose.Item item16 = itemUpdater10.update(item14);
        item14.sellIn = (byte) 0;
        com.gildedrose.Item item19 = itemUpdater7.update(item14);
        com.gildedrose.Item item20 = itemUpdater2.update(item14);
        com.gildedrose.Item item24 = new com.gildedrose.Item("", (int) '4', 1);
        int int25 = item24.sellIn;
        item24.name = "hi!";
        java.lang.String str28 = item24.name;
        int int29 = item24.sellIn;
        com.gildedrose.Item item30 = itemUpdater2.update(item24);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory31 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory31.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory31.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory36 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory36.getInstance("");
        com.gildedrose.Item item42 = new com.gildedrose.Item("hi!", 100, 1);
        int int43 = item42.sellIn;
        com.gildedrose.Item item44 = itemUpdater38.update(item42);
        int int45 = item42.sellIn;
        int int46 = item42.sellIn;
        com.gildedrose.Item item47 = itemUpdater35.update(item42);
        com.gildedrose.Item item51 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        int int52 = item51.quality;
        com.gildedrose.Item item53 = itemUpdater35.update(item51);
        item51.quality = (short) 1;
        java.lang.String str56 = item51.toString();
        com.gildedrose.Item item57 = itemUpdater2.update(item51);
        item51.sellIn = ' ';
        item51.sellIn = 51;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 99 + "'", int45 == 99);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 99 + "'", int46 == 99);
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!, 100, 1, 9, 1" + "'", str56, "hi!, 100, 1, 9, 1");
        org.junit.Assert.assertNotNull(item57);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        int int14 = item11.sellIn;
        int int15 = item11.sellIn;
        com.gildedrose.Item item16 = itemUpdater4.update(item11);
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        int int21 = item20.quality;
        com.gildedrose.Item item22 = itemUpdater4.update(item20);
        java.lang.Class<?> wildcardClass23 = item22.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory12 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        com.gildedrose.Item item23 = itemUpdater11.update(item22);
        com.gildedrose.Item item24 = itemUpdater2.update(item23);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater25 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item29 = new com.gildedrose.Item("hi!", 100, 1);
        int int30 = item29.sellIn;
        com.gildedrose.Item item31 = conjuredItemUpdater25.update(item29);
        com.gildedrose.Item item32 = itemUpdater2.update(item29);
        int int33 = item29.quality;
        item29.name = "hi!, 100, 1, 100, 1";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        java.lang.String str6 = item3.name;
        int int7 = item3.sellIn;
        item3.quality = 50;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 99, 0" + "'", str6, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = conjuredItemUpdater7.update(item11);
        item11.name = "hi!, 0, 0";
        int int16 = item11.quality;
        com.gildedrose.Item item17 = itemUpdater6.update(item11);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory18 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory18.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory18.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory18.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory18.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item30 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str31 = item30.name;
        int int32 = item30.sellIn;
        com.gildedrose.Item item33 = itemUpdater26.update(item30);
        int int34 = item33.quality;
        com.gildedrose.Item item35 = itemUpdater6.update(item33);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory36 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory36.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater40 = itemUpdaterFactory36.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory36.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater44 = itemUpdaterFactory36.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater46 = itemUpdaterFactory36.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item50 = new com.gildedrose.Item("", (int) '4', 1);
        com.gildedrose.Item item51 = itemUpdater46.update(item50);
        int int52 = item51.sellIn;
        int int53 = item51.sellIn;
        com.gildedrose.Item item54 = itemUpdater6.update(item51);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!, 0, 0" + "'", str31, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertNotNull(itemUpdater40);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertNotNull(itemUpdater44);
        org.junit.Assert.assertNotNull(itemUpdater46);
        org.junit.Assert.assertNotNull(item51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 51 + "'", int52 == 51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 51 + "'", int53 == 51);
        org.junit.Assert.assertNotNull(item54);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 49, 48");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 10, 0, 31, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) (short) 0);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0", 98, 99);
        java.lang.String str4 = item3.name;
        int int5 = item3.quality;
        item3.name = "hi!, 1, 0";
        java.lang.String str8 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 0" + "'", str4, "hi!, 1, 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 99 + "'", int5 == 99);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 1, 0, 98, 99" + "'", str8, "hi!, 1, 0, 98, 99");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", (int) (byte) 1, (int) (short) 1);
        item3.name = "hi!, 10, 0, 10, 0";
        int int6 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item14 = new com.gildedrose.Item("", 1, (int) ' ');
        java.lang.String str15 = item14.name;
        item14.sellIn = 'a';
        com.gildedrose.Item item18 = itemUpdater10.update(item14);
        com.gildedrose.Item item22 = new com.gildedrose.Item("hi!, 1, 0", 98, 99);
        int int23 = item22.quality;
        com.gildedrose.Item item24 = itemUpdater10.update(item22);
        int int25 = item22.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 99 + "'", int23 == 99);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 50 + "'", int25 == 50);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 52", 8, (int) (short) -1);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49", 35, (-1));
        item3.name = ", 1, 99";
        item3.sellIn = 99;
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        com.gildedrose.Item item19 = new com.gildedrose.Item("hi!, 99, 0", (int) (short) 0, 52);
        item19.sellIn = (short) 10;
        com.gildedrose.Item item22 = itemUpdater10.update(item19);
        java.lang.Class<?> wildcardClass23 = item19.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 35", 51, 35);
        item3.quality = 10;
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item14 = new com.gildedrose.Item("", (int) '4', 1);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory16.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory16.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory16.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory16.getInstance("hi!, 9, 0");
        com.gildedrose.Item item30 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        com.gildedrose.Item item31 = itemUpdater26.update(item30);
        com.gildedrose.Item item32 = itemUpdater10.update(item31);
        int int33 = item32.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 98 + "'", int33 == 98);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item14 = new com.gildedrose.Item("", (int) '4', 1);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory16.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory16.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory16.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory16.getInstance("hi!, 9, 0");
        com.gildedrose.Item item30 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        com.gildedrose.Item item31 = itemUpdater26.update(item30);
        com.gildedrose.Item item32 = itemUpdater10.update(item31);
        com.gildedrose.Item item36 = new com.gildedrose.Item("hi!, 100, 1", (int) (byte) 10, (int) 'a');
        item36.name = "";
        com.gildedrose.Item item39 = itemUpdater10.update(item36);
        java.lang.String str40 = item39.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ", 9, 50" + "'", str40, ", 9, 50");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory9.getInstance("hi!, 100, 52");
        com.gildedrose.Item item21 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        item21.quality = '4';
        com.gildedrose.Item item24 = itemUpdater17.update(item21);
        com.gildedrose.Item item25 = itemUpdater8.update(item24);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory26 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory26.getInstance("");
        com.gildedrose.Item item32 = new com.gildedrose.Item("hi!", 100, 1);
        int int33 = item32.sellIn;
        com.gildedrose.Item item34 = itemUpdater28.update(item32);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory35 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater37 = itemUpdaterFactory35.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory38 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater40 = itemUpdaterFactory38.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory38.getInstance("");
        com.gildedrose.Item item46 = new com.gildedrose.Item("hi!", 100, 1);
        int int47 = item46.sellIn;
        com.gildedrose.Item item48 = itemUpdater42.update(item46);
        com.gildedrose.Item item49 = itemUpdater37.update(item48);
        com.gildedrose.Item item50 = itemUpdater28.update(item49);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater51 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item55 = new com.gildedrose.Item("hi!", 100, 1);
        int int56 = item55.sellIn;
        com.gildedrose.Item item57 = conjuredItemUpdater51.update(item55);
        com.gildedrose.Item item58 = itemUpdater28.update(item55);
        int int59 = item55.quality;
        item55.sellIn = 99;
        java.lang.String str62 = item55.toString();
        int int63 = item55.quality;
        com.gildedrose.Item item64 = itemUpdater8.update(item55);
        int int65 = item64.sellIn;
        item64.sellIn = 50;
        item64.name = "hi!, 100, -1, -2, 49";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertNotNull(item25);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertNotNull(itemUpdater37);
        org.junit.Assert.assertNotNull(itemUpdater40);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(item49);
        org.junit.Assert.assertNotNull(item50);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertNotNull(item58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!, 99, 0" + "'", str62, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(item64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 98 + "'", int65 == 98);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1, 52, 52", 51, (int) (byte) 1);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.Item item13 = new com.gildedrose.Item("hi!", 100, 1);
        int int14 = item13.sellIn;
        com.gildedrose.Item item15 = itemUpdater9.update(item13);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.Item item22 = new com.gildedrose.Item("hi!", 100, 1);
        int int23 = item22.sellIn;
        com.gildedrose.Item item24 = itemUpdater18.update(item22);
        item22.sellIn = (byte) 0;
        java.lang.String str27 = item22.toString();
        com.gildedrose.Item item28 = itemUpdater9.update(item22);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory29 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater31 = itemUpdaterFactory29.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory29.getInstance("");
        com.gildedrose.Item item37 = new com.gildedrose.Item("hi!", 100, 1);
        int int38 = item37.sellIn;
        com.gildedrose.Item item39 = itemUpdater33.update(item37);
        java.lang.String str40 = item37.toString();
        item37.sellIn = 10;
        java.lang.String str43 = item37.toString();
        item37.sellIn = 98;
        item37.sellIn = (byte) 10;
        com.gildedrose.Item item48 = itemUpdater9.update(item37);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory49 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater51 = itemUpdaterFactory49.getInstance("");
        com.gildedrose.Item item55 = new com.gildedrose.Item("hi!", 100, 1);
        int int56 = item55.sellIn;
        com.gildedrose.Item item57 = itemUpdater51.update(item55);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory58 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater60 = itemUpdaterFactory58.getInstance("");
        com.gildedrose.Item item64 = new com.gildedrose.Item("hi!", 100, 1);
        int int65 = item64.sellIn;
        com.gildedrose.Item item66 = itemUpdater60.update(item64);
        item64.sellIn = (byte) 0;
        java.lang.String str69 = item64.toString();
        com.gildedrose.Item item70 = itemUpdater51.update(item64);
        com.gildedrose.Item item71 = itemUpdater9.update(item70);
        com.gildedrose.Item item72 = conjuredItemUpdater0.update(item70);
        java.lang.Class<?> wildcardClass73 = item70.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!, 0, 0" + "'", str27, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(itemUpdater31);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!, 99, 0" + "'", str40, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!, 10, 0" + "'", str43, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(itemUpdater51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertNotNull(itemUpdater60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!, 0, 0" + "'", str69, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item70);
        org.junit.Assert.assertNotNull(item71);
        org.junit.Assert.assertNotNull(item72);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 98, 0, 97, 35");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item18 = new com.gildedrose.Item("hi!, -1, 0", (int) (byte) -1, (int) (short) 0);
        java.lang.String str19 = item18.toString();
        com.gildedrose.Item item20 = itemUpdater14.update(item18);
        item20.sellIn = ' ';
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, -1, 0, -1, 0" + "'", str19, "hi!, -1, 0, -1, 0");
        org.junit.Assert.assertNotNull(item20);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", 0, (-2));
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, 0" + "'", str4, "hi!, 10, 0");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance(", 0, 50, 1, 100, -1, 100");
        java.lang.Class<?> wildcardClass11 = itemUpdater10.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        java.lang.String str9 = item8.name;
        item8.quality = (byte) 100;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = conjuredItemUpdater11.update(item15);
        com.gildedrose.Item item21 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str22 = item21.name;
        java.lang.String str23 = item21.name;
        int int24 = item21.quality;
        java.lang.String str25 = item21.toString();
        com.gildedrose.Item item26 = conjuredItemUpdater11.update(item21);
        java.lang.String str27 = item26.name;
        item26.name = "hi!, 99, 0";
        com.gildedrose.Item item30 = itemUpdater10.update(item26);
        item30.sellIn = 32;
        java.lang.String str33 = item30.name;
        java.lang.Class<?> wildcardClass34 = item30.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!, 100, 1" + "'", str25, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!, 99, 0" + "'", str33, "hi!, 99, 0");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        int int14 = item11.sellIn;
        int int15 = item11.sellIn;
        com.gildedrose.Item item16 = itemUpdater4.update(item11);
        java.lang.String str17 = item16.name;
        int int18 = item16.quality;
        item16.name = "hi!, 100, 1, 9, 1";
        java.lang.String str21 = item16.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 100, 1, 9, 1, 98, 0" + "'", str21, "hi!, 100, 1, 9, 1, 98, 0");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 9", 8, 99);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!", 100, 1);
        int int13 = item12.sellIn;
        item12.name = "hi!, 0, 0";
        item12.quality = (byte) -1;
        int int18 = item12.quality;
        com.gildedrose.Item item19 = itemUpdater8.update(item12);
        int int20 = item12.quality;
        java.lang.String str21 = item12.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str21, "hi!, 0, 0, 99, 0");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory12 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        com.gildedrose.Item item23 = itemUpdater11.update(item22);
        com.gildedrose.Item item24 = itemUpdater2.update(item23);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater25 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item29 = new com.gildedrose.Item("hi!", 100, 1);
        int int30 = item29.sellIn;
        com.gildedrose.Item item31 = conjuredItemUpdater25.update(item29);
        item29.name = "hi!, 0, 0";
        int int34 = item29.quality;
        java.lang.String str35 = item29.toString();
        com.gildedrose.Item item36 = itemUpdater2.update(item29);
        item36.name = ", 0, 50";
        java.lang.String str39 = item36.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str35, "hi!, 0, 0, 99, 0");
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + ", 0, 50" + "'", str39, ", 0, 50");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance(", 100, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 100, 52, 8, 50");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", 35, 48);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 51, 34");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 1, 9, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str4 = item3.toString();
        java.lang.String str5 = item3.toString();
        item3.sellIn = 49;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str4, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str5, "hi!, 0, 0, 0, 1");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory14 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.Item item25 = new com.gildedrose.Item("hi!", 100, 1);
        int int26 = item25.sellIn;
        com.gildedrose.Item item27 = itemUpdater21.update(item25);
        com.gildedrose.Item item28 = itemUpdater16.update(item27);
        com.gildedrose.Item item29 = itemUpdater7.update(item28);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater30 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!", 100, 1);
        int int35 = item34.sellIn;
        com.gildedrose.Item item36 = conjuredItemUpdater30.update(item34);
        item34.name = "hi!, 0, 0";
        int int39 = item34.quality;
        java.lang.String str40 = item34.toString();
        com.gildedrose.Item item41 = itemUpdater7.update(item34);
        int int42 = item34.sellIn;
        item34.quality = 100;
        int int45 = item34.quality;
        com.gildedrose.Item item46 = itemUpdater4.update(item34);
        item46.name = "hi!, 100, 1, 9, 1";
        java.lang.String str49 = item46.toString();
        java.lang.String str50 = item46.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str40, "hi!, 0, 0, 99, 0");
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 98 + "'", int42 == 98);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertNotNull(item46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!, 100, 1, 9, 1, 97, 50" + "'", str49, "hi!, 100, 1, 9, 1, 97, 50");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!, 100, 1, 9, 1, 97, 50" + "'", str50, "hi!, 100, 1, 9, 1, 97, 50");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1", 1, (-1));
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        item3.quality = 34;
        item3.quality = (-4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, 0, 10, 1, 1, -1" + "'", str4, "hi!, 10, 0, 10, 1, 1, -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", (int) (short) 1, (int) ' ');
        int int4 = item3.quality;
        item3.sellIn = 49;
        int int7 = item3.quality;
        item3.quality = (-3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        java.lang.Class<?> wildcardClass1 = conjuredItemUpdater0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        item11.sellIn = (byte) 0;
        com.gildedrose.Item item16 = itemUpdater4.update(item11);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory20 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.Item item28 = new com.gildedrose.Item("hi!", 100, 1);
        int int29 = item28.sellIn;
        com.gildedrose.Item item30 = itemUpdater24.update(item28);
        com.gildedrose.Item item31 = itemUpdater19.update(item30);
        com.gildedrose.Item item32 = itemUpdater4.update(item31);
        item31.name = "hi!, 1, 0, 0, 52";
        java.lang.Class<?> wildcardClass35 = item31.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory14 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.Item item25 = new com.gildedrose.Item("hi!", 100, 1);
        int int26 = item25.sellIn;
        com.gildedrose.Item item27 = itemUpdater21.update(item25);
        com.gildedrose.Item item28 = itemUpdater16.update(item27);
        com.gildedrose.Item item29 = itemUpdater7.update(item28);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater30 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!", 100, 1);
        int int35 = item34.sellIn;
        com.gildedrose.Item item36 = conjuredItemUpdater30.update(item34);
        com.gildedrose.Item item37 = itemUpdater7.update(item34);
        com.gildedrose.Item item41 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        com.gildedrose.Item item42 = itemUpdater7.update(item41);
        com.gildedrose.Item item43 = itemUpdater4.update(item41);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory44 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater46 = itemUpdaterFactory44.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater48 = itemUpdaterFactory44.getInstance("");
        com.gildedrose.Item item52 = new com.gildedrose.Item("hi!", 100, 1);
        int int53 = item52.sellIn;
        com.gildedrose.Item item54 = itemUpdater48.update(item52);
        java.lang.String str55 = item52.toString();
        java.lang.String str56 = item52.name;
        com.gildedrose.Item item57 = itemUpdater4.update(item52);
        com.gildedrose.Item item61 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1, 52, 52", 0, 9);
        com.gildedrose.Item item62 = itemUpdater4.update(item61);
        item62.quality = (-1);
        item62.quality = ' ';
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(item42);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertNotNull(itemUpdater46);
        org.junit.Assert.assertNotNull(itemUpdater48);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertNotNull(item54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!, 99, 0" + "'", str55, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertNotNull(item62);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        item3.name = "hi!, 0, 0";
        item3.quality = (byte) -1;
        java.lang.String str9 = item3.name;
        int int10 = item3.sellIn;
        item3.quality = 'a';
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 0, 0" + "'", str9, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50", 50, 97);
        item3.sellIn = 50;
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.toString();
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 0, 50" + "'", str6, ", 0, 50");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 0, 50, 50, 97" + "'", str7, ", 0, 50, 50, 97");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        int int7 = item4.quality;
        java.lang.String str8 = item4.name;
        item4.sellIn = '4';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -3, 49");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        item3.name = "hi!, 0, 0";
        item3.quality = (byte) -1;
        int int9 = item3.quality;
        item3.quality = (short) 1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        item3.quality = 99;
        int int7 = item3.quality;
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7 == 99);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        item3.name = "hi!, 0, 0";
        item3.quality = (byte) -1;
        item3.name = ", 10, 10";
        int int11 = item3.sellIn;
        java.lang.Class<?> wildcardClass12 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        item11.sellIn = (byte) 0;
        com.gildedrose.Item item16 = itemUpdater4.update(item11);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory20 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.Item item28 = new com.gildedrose.Item("hi!", 100, 1);
        int int29 = item28.sellIn;
        com.gildedrose.Item item30 = itemUpdater24.update(item28);
        com.gildedrose.Item item31 = itemUpdater19.update(item30);
        com.gildedrose.Item item32 = itemUpdater4.update(item31);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory33 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory33.getInstance("");
        com.gildedrose.Item item39 = new com.gildedrose.Item("hi!", 100, 1);
        int int40 = item39.sellIn;
        com.gildedrose.Item item41 = itemUpdater35.update(item39);
        com.gildedrose.Item item42 = itemUpdater4.update(item41);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory43 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater45 = itemUpdaterFactory43.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater47 = itemUpdaterFactory43.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory48 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater50 = itemUpdaterFactory48.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater52 = itemUpdaterFactory48.getInstance("");
        com.gildedrose.Item item56 = new com.gildedrose.Item("hi!", 100, 1);
        int int57 = item56.sellIn;
        com.gildedrose.Item item58 = itemUpdater52.update(item56);
        java.lang.String str59 = item56.toString();
        item56.sellIn = 10;
        java.lang.String str62 = item56.toString();
        item56.sellIn = 1;
        com.gildedrose.Item item65 = itemUpdater47.update(item56);
        java.lang.String str66 = item56.toString();
        com.gildedrose.Item item67 = itemUpdater4.update(item56);
        java.lang.String str68 = item67.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertNotNull(item42);
        org.junit.Assert.assertNotNull(itemUpdater45);
        org.junit.Assert.assertNotNull(itemUpdater47);
        org.junit.Assert.assertNotNull(itemUpdater50);
        org.junit.Assert.assertNotNull(itemUpdater52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertNotNull(item58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!, 99, 0" + "'", str59, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!, 10, 0" + "'", str62, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!, 0, 0" + "'", str66, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1, 52, 100", (int) 'a', (int) 'a');
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, 0, 10, 1, 1, -1, 52, 100" + "'", str4, "hi!, 10, 0, 10, 1, 1, -1, 52, 100");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1", 52, 52);
        item3.quality = 10;
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 9, 1", 0, (int) (byte) 1);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        item15.sellIn = (byte) 0;
        java.lang.String str20 = item15.toString();
        com.gildedrose.Item item21 = itemUpdater2.update(item15);
        item21.quality = '4';
        int int24 = item21.sellIn;
        item21.sellIn = 10;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        int int14 = item11.sellIn;
        int int15 = item11.sellIn;
        com.gildedrose.Item item16 = itemUpdater4.update(item11);
        item11.sellIn = 96;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertNotNull(item16);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) '4', 1);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item14 = new com.gildedrose.Item("", (int) '4', 1);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        int int16 = item15.sellIn;
        item15.name = "hi!, -3, 0";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 100, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory13 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory18 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory18.getInstance("");
        com.gildedrose.Item item24 = new com.gildedrose.Item("hi!", 100, 1);
        int int25 = item24.sellIn;
        com.gildedrose.Item item26 = itemUpdater20.update(item24);
        item24.sellIn = (byte) 0;
        com.gildedrose.Item item29 = itemUpdater17.update(item24);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory30 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater32 = itemUpdaterFactory30.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater34 = itemUpdaterFactory30.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater36 = itemUpdaterFactory30.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory30.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory39 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater41 = itemUpdaterFactory39.getInstance("");
        com.gildedrose.Item item45 = new com.gildedrose.Item("hi!", 100, 1);
        int int46 = item45.sellIn;
        com.gildedrose.Item item47 = itemUpdater41.update(item45);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory48 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater50 = itemUpdaterFactory48.getInstance("");
        com.gildedrose.Item item54 = new com.gildedrose.Item("hi!", 100, 1);
        int int55 = item54.sellIn;
        com.gildedrose.Item item56 = itemUpdater50.update(item54);
        item54.sellIn = (byte) 0;
        java.lang.String str59 = item54.toString();
        com.gildedrose.Item item60 = itemUpdater41.update(item54);
        com.gildedrose.Item item61 = itemUpdater38.update(item54);
        com.gildedrose.Item item62 = itemUpdater17.update(item61);
        java.lang.String str63 = item61.name;
        java.lang.String str64 = item61.toString();
        java.lang.String str65 = item61.name;
        com.gildedrose.Item item66 = itemUpdater12.update(item61);
        java.lang.String str67 = item66.toString();
        item66.sellIn = 10;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertNotNull(itemUpdater32);
        org.junit.Assert.assertNotNull(itemUpdater34);
        org.junit.Assert.assertNotNull(itemUpdater36);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertNotNull(itemUpdater41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertNotNull(itemUpdater50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertNotNull(item56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!, 0, 0" + "'", str59, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item60);
        org.junit.Assert.assertNotNull(item61);
        org.junit.Assert.assertNotNull(item62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!, -3, 0" + "'", str64, "hi!, -3, 0");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!, -4, 0" + "'", str67, "hi!, -4, 0");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!", 100, 1);
        com.gildedrose.Item item11 = conjuredItemUpdater0.update(item10);
        com.gildedrose.Item item15 = new com.gildedrose.Item("", (int) '4', 1);
        item15.name = "hi!, 0, 0";
        java.lang.String str18 = item15.toString();
        com.gildedrose.Item item19 = conjuredItemUpdater0.update(item15);
        item15.sellIn = (short) 0;
        item15.quality = (short) 100;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str18, "hi!, 0, 0, 52, 1");
        org.junit.Assert.assertNotNull(item19);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10", 1, 99);
        java.lang.String str4 = item3.name;
        item3.sellIn = 98;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 10" + "'", str4, "hi!, 100, 10");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", (int) '4', (int) '#');
        item3.quality = (byte) 100;
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (-1), 52);
        int int4 = item3.quality;
        item3.sellIn = 98;
        int int7 = item3.quality;
        int int8 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', 1);
        int int4 = item3.sellIn;
        item3.name = "hi!";
        java.lang.String str7 = item3.name;
        int int8 = item3.sellIn;
        item3.sellIn = 99;
        java.lang.String str11 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 1" + "'", str11, "hi!, 99, 1");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory7.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory7.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory7.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.Item item22 = new com.gildedrose.Item("hi!", 100, 1);
        int int23 = item22.sellIn;
        com.gildedrose.Item item24 = itemUpdater18.update(item22);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory25 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory25.getInstance("");
        com.gildedrose.Item item31 = new com.gildedrose.Item("hi!", 100, 1);
        int int32 = item31.sellIn;
        com.gildedrose.Item item33 = itemUpdater27.update(item31);
        item31.sellIn = (byte) 0;
        java.lang.String str36 = item31.toString();
        com.gildedrose.Item item37 = itemUpdater18.update(item31);
        com.gildedrose.Item item38 = itemUpdater15.update(item31);
        com.gildedrose.Item item39 = conjuredItemUpdater0.update(item31);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory40 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory40.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater44 = itemUpdaterFactory40.getInstance("");
        com.gildedrose.Item item48 = new com.gildedrose.Item("hi!", 100, 1);
        int int49 = item48.sellIn;
        com.gildedrose.Item item50 = itemUpdater44.update(item48);
        java.lang.String str51 = item48.toString();
        item48.name = "hi!, 10, 0";
        com.gildedrose.Item item54 = conjuredItemUpdater0.update(item48);
        java.lang.Class<?> wildcardClass55 = item48.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 0, 0" + "'", str36, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(item38);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertNotNull(itemUpdater44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertNotNull(item50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!, 99, 0" + "'", str51, "hi!, 99, 0");
        org.junit.Assert.assertNotNull(item54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.quality = (-3);
        int int9 = item4.quality;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item19 = new com.gildedrose.Item("hi!", 100, 1);
        int int20 = item19.sellIn;
        com.gildedrose.Item item21 = conjuredItemUpdater15.update(item19);
        item19.name = "hi!, 0, 0";
        com.gildedrose.Item item24 = itemUpdater14.update(item19);
        java.lang.String str25 = item24.toString();
        item24.quality = 'a';
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!, 0, 0, 98, 0" + "'", str25, "hi!, 0, 0, 98, 0");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        java.lang.String str9 = item6.toString();
        int int10 = item6.sellIn;
        java.lang.String str11 = item6.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 99, 0" + "'", str9, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 98");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 52, 32");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1", (int) (byte) 10, 98);
        item3.quality = 49;
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        java.lang.String str14 = item8.toString();
        item8.sellIn = 1;
        item8.quality = 99;
        item8.quality = (short) 1;
        item8.name = "hi!, 0, 0, 99, 0";
        java.lang.String str23 = item8.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str23, "hi!, 0, 0, 99, 0");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 99, 0", 31, (int) (short) 10);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory14 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory19 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory19.getInstance("");
        com.gildedrose.Item item25 = new com.gildedrose.Item("hi!", 100, 1);
        int int26 = item25.sellIn;
        com.gildedrose.Item item27 = itemUpdater21.update(item25);
        item25.sellIn = (byte) 0;
        com.gildedrose.Item item30 = itemUpdater18.update(item25);
        com.gildedrose.Item item31 = itemUpdater8.update(item30);
        item31.name = "hi!, 99, 0, 100, 52";
        item31.sellIn = 34;
        java.lang.Class<?> wildcardClass36 = item31.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str11 = item10.name;
        java.lang.String str12 = item10.name;
        int int13 = item10.quality;
        java.lang.String str14 = item10.toString();
        com.gildedrose.Item item15 = conjuredItemUpdater0.update(item10);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.Item item22 = new com.gildedrose.Item("hi!", 100, 1);
        int int23 = item22.sellIn;
        com.gildedrose.Item item24 = itemUpdater18.update(item22);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory25 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory25.getInstance("");
        com.gildedrose.Item item31 = new com.gildedrose.Item("hi!", 100, 1);
        int int32 = item31.sellIn;
        com.gildedrose.Item item33 = itemUpdater27.update(item31);
        item31.sellIn = (byte) 0;
        java.lang.String str36 = item31.toString();
        com.gildedrose.Item item37 = itemUpdater18.update(item31);
        java.lang.String str38 = item31.toString();
        item31.quality = (-1);
        com.gildedrose.Item item41 = conjuredItemUpdater0.update(item31);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1" + "'", str14, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 0, 0" + "'", str36, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!, -1, 0" + "'", str38, "hi!, -1, 0");
        org.junit.Assert.assertNotNull(item41);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!", 100, 1);
        com.gildedrose.Item item11 = conjuredItemUpdater0.update(item10);
        com.gildedrose.Item item15 = new com.gildedrose.Item("", (int) '4', 1);
        item15.name = "hi!, 0, 0";
        java.lang.String str18 = item15.toString();
        com.gildedrose.Item item19 = conjuredItemUpdater0.update(item15);
        item15.sellIn = (short) 0;
        item15.quality = 30;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str18, "hi!, 0, 0, 52, 1");
        org.junit.Assert.assertNotNull(item19);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 52, 0");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 0, 52");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        item20.name = "hi!, 100, 1";
        int int24 = item20.sellIn;
        com.gildedrose.Item item25 = itemUpdater16.update(item20);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(item25);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory3 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdaterFactory3.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory3.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory8 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory8.getInstance("");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!", 100, 1);
        int int15 = item14.sellIn;
        com.gildedrose.Item item16 = itemUpdater10.update(item14);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory20 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.Item item28 = new com.gildedrose.Item("hi!", 100, 1);
        int int29 = item28.sellIn;
        com.gildedrose.Item item30 = itemUpdater24.update(item28);
        com.gildedrose.Item item31 = itemUpdater19.update(item30);
        com.gildedrose.Item item32 = itemUpdater10.update(item31);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater33 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item37 = new com.gildedrose.Item("hi!", 100, 1);
        int int38 = item37.sellIn;
        com.gildedrose.Item item39 = conjuredItemUpdater33.update(item37);
        item37.name = "hi!, 0, 0";
        int int42 = item37.quality;
        java.lang.String str43 = item37.toString();
        com.gildedrose.Item item44 = itemUpdater10.update(item37);
        int int45 = item37.sellIn;
        item37.quality = 100;
        int int48 = item37.quality;
        com.gildedrose.Item item49 = itemUpdater7.update(item37);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory50 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater52 = itemUpdaterFactory50.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater54 = itemUpdaterFactory50.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater56 = itemUpdaterFactory50.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater58 = itemUpdaterFactory50.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater60 = itemUpdaterFactory50.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater61 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item65 = new com.gildedrose.Item("hi!", 100, 1);
        int int66 = item65.sellIn;
        com.gildedrose.Item item67 = conjuredItemUpdater61.update(item65);
        com.gildedrose.Item item71 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str72 = item71.name;
        java.lang.String str73 = item71.name;
        int int74 = item71.quality;
        java.lang.String str75 = item71.toString();
        com.gildedrose.Item item76 = conjuredItemUpdater61.update(item71);
        java.lang.String str77 = item76.name;
        item76.name = "hi!, 99, 0";
        com.gildedrose.Item item80 = itemUpdater60.update(item76);
        item80.sellIn = 32;
        java.lang.String str83 = item80.name;
        com.gildedrose.Item item84 = itemUpdater7.update(item80);
        com.gildedrose.Item item85 = itemUpdater2.update(item84);
        item85.quality = 49;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str43, "hi!, 0, 0, 99, 0");
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 98 + "'", int45 == 98);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertNotNull(item49);
        org.junit.Assert.assertNotNull(itemUpdater52);
        org.junit.Assert.assertNotNull(itemUpdater54);
        org.junit.Assert.assertNotNull(itemUpdater56);
        org.junit.Assert.assertNotNull(itemUpdater58);
        org.junit.Assert.assertNotNull(itemUpdater60);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 100 + "'", int66 == 100);
        org.junit.Assert.assertNotNull(item67);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!, 100, 1" + "'", str75, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertNotNull(item80);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!, 99, 0" + "'", str83, "hi!, 99, 0");
        org.junit.Assert.assertNotNull(item84);
        org.junit.Assert.assertNotNull(item85);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        item3.quality = 0;
        item3.quality = (byte) 0;
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        java.lang.String str11 = item3.toString();
        int int12 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 100, 1" + "'", str8, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 100, 1, 10, 10" + "'", str11, "hi!, 100, 1, 10, 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.name;
        item3.sellIn = (short) 100;
        item3.quality = 10;
        item3.name = "hi!, 0, 0, 0, 1, 99, -1";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str13 = item12.name;
        int int14 = item12.sellIn;
        com.gildedrose.Item item15 = itemUpdater8.update(item12);
        java.lang.String str16 = item15.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 0, 0" + "'", str13, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 0, 0" + "'", str16, "hi!, 0, 0");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item13 = new com.gildedrose.Item("hi!", 100, 1);
        int int14 = item13.sellIn;
        com.gildedrose.Item item15 = itemUpdater9.update(item13);
        java.lang.String str16 = item13.toString();
        item13.sellIn = 10;
        java.lang.String str19 = item13.toString();
        item13.sellIn = 1;
        com.gildedrose.Item item22 = itemUpdater4.update(item13);
        java.lang.String str23 = item13.toString();
        java.lang.String str24 = item13.toString();
        item13.sellIn = 99;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 99, 0" + "'", str16, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 10, 0" + "'", str19, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 0, 0" + "'", str23, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!, 0, 0" + "'", str24, "hi!, 0, 0");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        java.lang.Class<?> wildcardClass9 = itemUpdater8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50, 1, 100", (-1), (int) (byte) 100);
        item3.sellIn = 1;
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory7.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory7.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory7.getInstance("hi!, 100, 1, 100, 0");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory7.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory7.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item23 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        item23.sellIn = 52;
        java.lang.String str26 = item23.name;
        com.gildedrose.Item item27 = itemUpdater19.update(item23);
        com.gildedrose.Item item28 = itemUpdater6.update(item23);
        java.lang.Class<?> wildcardClass29 = itemUpdater6.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!, 0, 0" + "'", str26, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1, 8, 30", (int) (byte) 1, 1);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.Item item13 = new com.gildedrose.Item("hi!", 100, 1);
        int int14 = item13.sellIn;
        com.gildedrose.Item item15 = itemUpdater9.update(item13);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.Item item24 = new com.gildedrose.Item("hi!", 100, 1);
        int int25 = item24.sellIn;
        com.gildedrose.Item item26 = itemUpdater20.update(item24);
        java.lang.String str27 = item24.toString();
        item24.sellIn = 10;
        java.lang.String str30 = item24.toString();
        item24.sellIn = 98;
        com.gildedrose.Item item33 = itemUpdater9.update(item24);
        com.gildedrose.Item item34 = itemUpdater6.update(item33);
        java.lang.String str35 = item34.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!, 99, 0" + "'", str27, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!, 10, 0" + "'", str30, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!, 96, 0" + "'", str35, "hi!, 96, 0");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        java.lang.String str12 = item8.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 99, 0" + "'", str12, "hi!, 99, 0");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 0, 50");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) '4');
        java.lang.String str11 = item10.name;
        int int12 = item10.sellIn;
        item10.sellIn = 0;
        com.gildedrose.Item item15 = itemUpdater6.update(item10);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(item15);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item17 = new com.gildedrose.Item("hi!", 100, 1);
        int int18 = item17.sellIn;
        com.gildedrose.Item item19 = itemUpdater13.update(item17);
        java.lang.String str20 = item17.toString();
        item17.sellIn = 10;
        java.lang.String str23 = item17.toString();
        item17.sellIn = 98;
        com.gildedrose.Item item26 = itemUpdater2.update(item17);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory27 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory27.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater31 = itemUpdaterFactory27.getInstance("");
        com.gildedrose.Item item35 = new com.gildedrose.Item("hi!", 100, 1);
        int int36 = item35.sellIn;
        com.gildedrose.Item item37 = itemUpdater31.update(item35);
        java.lang.String str38 = item35.toString();
        item35.sellIn = 10;
        java.lang.String str41 = item35.toString();
        item35.sellIn = 1;
        com.gildedrose.Item item44 = itemUpdater2.update(item35);
        int int45 = item44.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 99, 0" + "'", str20, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 10, 0" + "'", str23, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertNotNull(itemUpdater29);
        org.junit.Assert.assertNotNull(itemUpdater31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!, 99, 0" + "'", str38, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!, 10, 0" + "'", str41, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory18 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory18.getInstance("");
        com.gildedrose.Item item24 = new com.gildedrose.Item("hi!", 100, 1);
        int int25 = item24.sellIn;
        com.gildedrose.Item item26 = itemUpdater20.update(item24);
        item24.sellIn = (byte) 0;
        java.lang.String str29 = item24.toString();
        com.gildedrose.Item item30 = itemUpdater11.update(item24);
        com.gildedrose.Item item31 = itemUpdater8.update(item24);
        int int32 = item31.sellIn;
        int int33 = item31.quality;
        item31.quality = 0;
        int int36 = item31.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!, 0, 0" + "'", str29, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-2) + "'", int32 == (-2));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str13 = item12.name;
        int int14 = item12.sellIn;
        java.lang.String str15 = item12.name;
        com.gildedrose.Item item16 = itemUpdater8.update(item12);
        item12.sellIn = 0;
        int int19 = item12.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 0, 0" + "'", str13, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 0, 0" + "'", str15, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.Item item13 = new com.gildedrose.Item("hi!", 100, 1);
        int int14 = item13.sellIn;
        com.gildedrose.Item item15 = itemUpdater9.update(item13);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.Item item22 = new com.gildedrose.Item("hi!", 100, 1);
        int int23 = item22.sellIn;
        com.gildedrose.Item item24 = itemUpdater18.update(item22);
        item22.sellIn = (byte) 0;
        java.lang.String str27 = item22.toString();
        com.gildedrose.Item item28 = itemUpdater9.update(item22);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory29 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater31 = itemUpdaterFactory29.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory29.getInstance("");
        com.gildedrose.Item item37 = new com.gildedrose.Item("hi!", 100, 1);
        int int38 = item37.sellIn;
        com.gildedrose.Item item39 = itemUpdater33.update(item37);
        java.lang.String str40 = item37.toString();
        item37.sellIn = 10;
        java.lang.String str43 = item37.toString();
        item37.sellIn = 98;
        item37.sellIn = (byte) 10;
        com.gildedrose.Item item48 = itemUpdater9.update(item37);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory49 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater51 = itemUpdaterFactory49.getInstance("");
        com.gildedrose.Item item55 = new com.gildedrose.Item("hi!", 100, 1);
        int int56 = item55.sellIn;
        com.gildedrose.Item item57 = itemUpdater51.update(item55);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory58 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater60 = itemUpdaterFactory58.getInstance("");
        com.gildedrose.Item item64 = new com.gildedrose.Item("hi!", 100, 1);
        int int65 = item64.sellIn;
        com.gildedrose.Item item66 = itemUpdater60.update(item64);
        item64.sellIn = (byte) 0;
        java.lang.String str69 = item64.toString();
        com.gildedrose.Item item70 = itemUpdater51.update(item64);
        com.gildedrose.Item item71 = itemUpdater9.update(item70);
        com.gildedrose.Item item72 = conjuredItemUpdater0.update(item70);
        item72.name = "hi!, 100, 1";
        int int75 = item72.sellIn;
        int int76 = item72.quality;
        item72.quality = (short) 100;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!, 0, 0" + "'", str27, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(itemUpdater31);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!, 99, 0" + "'", str40, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!, 10, 0" + "'", str43, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(itemUpdater51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertNotNull(itemUpdater60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!, 0, 0" + "'", str69, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item70);
        org.junit.Assert.assertNotNull(item71);
        org.junit.Assert.assertNotNull(item72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-3) + "'", int75 == (-3));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str15 = item14.name;
        java.lang.String str16 = item14.name;
        com.gildedrose.Item item17 = itemUpdater10.update(item14);
        java.lang.Class<?> wildcardClass18 = itemUpdater10.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 0, 0" + "'", str15, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 0, 0" + "'", str16, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) ' ', (int) ' ');
        item3.name = "hi!, 100, 52";
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item6.sellIn = 1;
        item6.sellIn = 32;
        int int11 = item6.sellIn;
        int int12 = item6.quality;
        item6.quality = (short) -1;
        int int15 = item6.sellIn;
        item6.name = "hi!, -4, 0";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str9 = item8.name;
        java.lang.String str10 = item8.toString();
        com.gildedrose.Item item11 = itemUpdater4.update(item8);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory12 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        java.lang.String str23 = item20.toString();
        item20.sellIn = 10;
        java.lang.String str26 = item20.toString();
        item20.sellIn = 98;
        int int29 = item20.sellIn;
        com.gildedrose.Item item30 = itemUpdater4.update(item20);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory31 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory31.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory31.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater37 = itemUpdaterFactory31.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory38 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater40 = itemUpdaterFactory38.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory38.getInstance("hi!, -1, 0");
        com.gildedrose.Item item46 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str47 = item46.name;
        java.lang.String str48 = item46.toString();
        com.gildedrose.Item item49 = itemUpdater42.update(item46);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory50 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater52 = itemUpdaterFactory50.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater54 = itemUpdaterFactory50.getInstance("");
        com.gildedrose.Item item58 = new com.gildedrose.Item("hi!", 100, 1);
        int int59 = item58.sellIn;
        com.gildedrose.Item item60 = itemUpdater54.update(item58);
        java.lang.String str61 = item58.toString();
        item58.sellIn = 10;
        java.lang.String str64 = item58.toString();
        item58.sellIn = 98;
        int int67 = item58.sellIn;
        com.gildedrose.Item item68 = itemUpdater42.update(item58);
        com.gildedrose.Item item69 = itemUpdater37.update(item68);
        item68.sellIn = (-2);
        com.gildedrose.Item item72 = itemUpdater4.update(item68);
        java.lang.Class<?> wildcardClass73 = item72.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 0, 0" + "'", str9, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str10, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 99, 0" + "'", str23, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!, 10, 0" + "'", str26, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 98 + "'", int29 == 98);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertNotNull(itemUpdater37);
        org.junit.Assert.assertNotNull(itemUpdater40);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!, 0, 0" + "'", str47, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str48, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item49);
        org.junit.Assert.assertNotNull(itemUpdater52);
        org.junit.Assert.assertNotNull(itemUpdater54);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertNotNull(item60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!, 99, 0" + "'", str61, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!, 10, 0" + "'", str64, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 98 + "'", int67 == 98);
        org.junit.Assert.assertNotNull(item68);
        org.junit.Assert.assertNotNull(item69);
        org.junit.Assert.assertNotNull(item72);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, -1, 0", 0, (int) (byte) 0);
        com.gildedrose.Item item13 = itemUpdater2.update(item12);
        item13.quality = (short) -1;
        item13.sellIn = 35;
        int int18 = item13.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        item3.sellIn = 51;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0, 0, 98" + "'", str4, "hi!, 0, 0, 0, 98");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item19 = new com.gildedrose.Item("hi!", 100, 1);
        int int20 = item19.sellIn;
        com.gildedrose.Item item21 = conjuredItemUpdater15.update(item19);
        item19.name = "hi!, 0, 0";
        com.gildedrose.Item item24 = itemUpdater14.update(item19);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory25 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory25.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory25.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory30 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater32 = itemUpdaterFactory30.getInstance("");
        com.gildedrose.Item item36 = new com.gildedrose.Item("hi!", 100, 1);
        int int37 = item36.sellIn;
        com.gildedrose.Item item38 = itemUpdater32.update(item36);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory39 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater41 = itemUpdaterFactory39.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory42 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater44 = itemUpdaterFactory42.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater46 = itemUpdaterFactory42.getInstance("");
        com.gildedrose.Item item50 = new com.gildedrose.Item("hi!", 100, 1);
        int int51 = item50.sellIn;
        com.gildedrose.Item item52 = itemUpdater46.update(item50);
        com.gildedrose.Item item53 = itemUpdater41.update(item52);
        com.gildedrose.Item item54 = itemUpdater32.update(item53);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater55 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item59 = new com.gildedrose.Item("hi!", 100, 1);
        int int60 = item59.sellIn;
        com.gildedrose.Item item61 = conjuredItemUpdater55.update(item59);
        com.gildedrose.Item item62 = itemUpdater32.update(item59);
        com.gildedrose.Item item66 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        com.gildedrose.Item item67 = itemUpdater32.update(item66);
        com.gildedrose.Item item68 = itemUpdater29.update(item66);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory69 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater71 = itemUpdaterFactory69.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater73 = itemUpdaterFactory69.getInstance("");
        com.gildedrose.Item item77 = new com.gildedrose.Item("hi!", 100, 1);
        int int78 = item77.sellIn;
        com.gildedrose.Item item79 = itemUpdater73.update(item77);
        java.lang.String str80 = item77.toString();
        java.lang.String str81 = item77.name;
        com.gildedrose.Item item82 = itemUpdater29.update(item77);
        com.gildedrose.Item item83 = itemUpdater14.update(item82);
        com.gildedrose.Item item87 = new com.gildedrose.Item("hi!, 51, 0", 1, 97);
        com.gildedrose.Item item88 = itemUpdater14.update(item87);
        java.lang.String str89 = item88.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater29);
        org.junit.Assert.assertNotNull(itemUpdater32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(item38);
        org.junit.Assert.assertNotNull(itemUpdater41);
        org.junit.Assert.assertNotNull(itemUpdater44);
        org.junit.Assert.assertNotNull(itemUpdater46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertNotNull(item54);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertNotNull(item61);
        org.junit.Assert.assertNotNull(item62);
        org.junit.Assert.assertNotNull(item67);
        org.junit.Assert.assertNotNull(item68);
        org.junit.Assert.assertNotNull(itemUpdater71);
        org.junit.Assert.assertNotNull(itemUpdater73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        org.junit.Assert.assertNotNull(item79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!, 99, 0" + "'", str80, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(item82);
        org.junit.Assert.assertNotNull(item83);
        org.junit.Assert.assertNotNull(item88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!, 51, 0, 0, 50" + "'", str89, "hi!, 51, 0, 0, 50");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        int int9 = item4.quality;
        item4.quality = (short) -1;
        item4.name = "hi!";
        item4.name = "hi!, 0, 0, 0, 1";
        item4.sellIn = (-2);
        java.lang.String str18 = item4.name;
        item4.quality = (short) 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str18, "hi!, 0, 0, 0, 1");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 49, 48");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 98");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 0, 1", (int) (byte) -1, 1);
        java.lang.String str4 = item3.name;
        int int5 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str4, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        item15.sellIn = (byte) 0;
        java.lang.String str20 = item15.toString();
        com.gildedrose.Item item21 = itemUpdater2.update(item15);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory22 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.Item item30 = new com.gildedrose.Item("hi!", 100, 1);
        int int31 = item30.sellIn;
        com.gildedrose.Item item32 = itemUpdater26.update(item30);
        java.lang.String str33 = item30.toString();
        item30.sellIn = 10;
        java.lang.String str36 = item30.toString();
        item30.sellIn = 98;
        item30.sellIn = (byte) 10;
        com.gildedrose.Item item41 = itemUpdater2.update(item30);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory42 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater44 = itemUpdaterFactory42.getInstance("");
        com.gildedrose.Item item48 = new com.gildedrose.Item("hi!", 100, 1);
        int int49 = item48.sellIn;
        com.gildedrose.Item item50 = itemUpdater44.update(item48);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory51 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater53 = itemUpdaterFactory51.getInstance("");
        com.gildedrose.Item item57 = new com.gildedrose.Item("hi!", 100, 1);
        int int58 = item57.sellIn;
        com.gildedrose.Item item59 = itemUpdater53.update(item57);
        item57.sellIn = (byte) 0;
        java.lang.String str62 = item57.toString();
        com.gildedrose.Item item63 = itemUpdater44.update(item57);
        com.gildedrose.Item item64 = itemUpdater2.update(item63);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory65 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater67 = itemUpdaterFactory65.getInstance("");
        com.gildedrose.Item item71 = new com.gildedrose.Item("hi!", 100, 1);
        int int72 = item71.sellIn;
        com.gildedrose.Item item73 = itemUpdater67.update(item71);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory74 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater76 = itemUpdaterFactory74.getInstance("");
        com.gildedrose.Item item80 = new com.gildedrose.Item("hi!", 100, 1);
        int int81 = item80.sellIn;
        com.gildedrose.Item item82 = itemUpdater76.update(item80);
        item80.sellIn = (byte) 0;
        java.lang.String str85 = item80.toString();
        com.gildedrose.Item item86 = itemUpdater67.update(item80);
        item86.quality = 96;
        com.gildedrose.Item item89 = itemUpdater2.update(item86);
        item89.name = "hi!, 99, 0, 0, 10";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!, 99, 0" + "'", str33, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 10, 0" + "'", str36, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertNotNull(itemUpdater44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertNotNull(item50);
        org.junit.Assert.assertNotNull(itemUpdater53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertNotNull(item59);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!, 0, 0" + "'", str62, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item63);
        org.junit.Assert.assertNotNull(item64);
        org.junit.Assert.assertNotNull(itemUpdater67);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 100 + "'", int72 == 100);
        org.junit.Assert.assertNotNull(item73);
        org.junit.Assert.assertNotNull(itemUpdater76);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 100 + "'", int81 == 100);
        org.junit.Assert.assertNotNull(item82);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!, 0, 0" + "'", str85, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item86);
        org.junit.Assert.assertNotNull(item89);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 35", 51, 35);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 9", 97, (-2));
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 99, 0, 52, -1" + "'", str4, "hi!, 99, 0, 52, -1");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.toString();
        java.lang.String str7 = item3.toString();
        int int8 = item3.quality;
        item3.name = "";
        item3.name = ", 100, 1";
        item3.quality = '#';
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 100, 1" + "'", str6, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 100, 1" + "'", str7, "hi!, 100, 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 100, 52", (int) (byte) 100, (int) (byte) 100);
        int int13 = item12.quality;
        com.gildedrose.Item item14 = itemUpdater8.update(item12);
        java.lang.Class<?> wildcardClass15 = item14.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(item14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, 9", 97, 30);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item13 = new com.gildedrose.Item("hi!", 100, 1);
        int int14 = item13.sellIn;
        com.gildedrose.Item item15 = itemUpdater9.update(item13);
        java.lang.String str16 = item13.toString();
        item13.sellIn = 10;
        java.lang.String str19 = item13.toString();
        item13.sellIn = 1;
        com.gildedrose.Item item22 = itemUpdater4.update(item13);
        java.lang.String str23 = item13.toString();
        int int24 = item13.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 99, 0" + "'", str16, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 10, 0" + "'", str19, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 0, 0" + "'", str23, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 50, 49");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, -1, 35");
        com.gildedrose.Item item18 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str19 = item18.name;
        java.lang.String str20 = item18.name;
        item18.sellIn = (short) -1;
        com.gildedrose.Item item23 = itemUpdater14.update(item18);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory24 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory24.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory24.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory24.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater32 = itemUpdaterFactory24.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory33 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory33.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater37 = itemUpdaterFactory33.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory38 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater40 = itemUpdaterFactory38.getInstance("");
        com.gildedrose.Item item44 = new com.gildedrose.Item("hi!", 100, 1);
        int int45 = item44.sellIn;
        com.gildedrose.Item item46 = itemUpdater40.update(item44);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory47 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater49 = itemUpdaterFactory47.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory50 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater52 = itemUpdaterFactory50.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater54 = itemUpdaterFactory50.getInstance("");
        com.gildedrose.Item item58 = new com.gildedrose.Item("hi!", 100, 1);
        int int59 = item58.sellIn;
        com.gildedrose.Item item60 = itemUpdater54.update(item58);
        com.gildedrose.Item item61 = itemUpdater49.update(item60);
        com.gildedrose.Item item62 = itemUpdater40.update(item61);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater63 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item67 = new com.gildedrose.Item("hi!", 100, 1);
        int int68 = item67.sellIn;
        com.gildedrose.Item item69 = conjuredItemUpdater63.update(item67);
        com.gildedrose.Item item70 = itemUpdater40.update(item67);
        com.gildedrose.Item item74 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        com.gildedrose.Item item75 = itemUpdater40.update(item74);
        com.gildedrose.Item item76 = itemUpdater37.update(item74);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory77 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater79 = itemUpdaterFactory77.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater81 = itemUpdaterFactory77.getInstance("");
        com.gildedrose.Item item85 = new com.gildedrose.Item("hi!", 100, 1);
        int int86 = item85.sellIn;
        com.gildedrose.Item item87 = itemUpdater81.update(item85);
        java.lang.String str88 = item85.toString();
        java.lang.String str89 = item85.name;
        com.gildedrose.Item item90 = itemUpdater37.update(item85);
        com.gildedrose.Item item91 = itemUpdater32.update(item85);
        item91.name = ", 0, 50, 1, 100, -1, 100";
        com.gildedrose.Item item94 = itemUpdater14.update(item91);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 0, 0" + "'", str19, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertNotNull(itemUpdater32);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertNotNull(itemUpdater37);
        org.junit.Assert.assertNotNull(itemUpdater40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertNotNull(item46);
        org.junit.Assert.assertNotNull(itemUpdater49);
        org.junit.Assert.assertNotNull(itemUpdater52);
        org.junit.Assert.assertNotNull(itemUpdater54);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertNotNull(item60);
        org.junit.Assert.assertNotNull(item61);
        org.junit.Assert.assertNotNull(item62);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 100 + "'", int68 == 100);
        org.junit.Assert.assertNotNull(item69);
        org.junit.Assert.assertNotNull(item70);
        org.junit.Assert.assertNotNull(item75);
        org.junit.Assert.assertNotNull(item76);
        org.junit.Assert.assertNotNull(itemUpdater79);
        org.junit.Assert.assertNotNull(itemUpdater81);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 100 + "'", int86 == 100);
        org.junit.Assert.assertNotNull(item87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!, 99, 0" + "'", str88, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
        org.junit.Assert.assertNotNull(item90);
        org.junit.Assert.assertNotNull(item91);
        org.junit.Assert.assertNotNull(item94);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1", (int) ' ', 10);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item17 = new com.gildedrose.Item("hi!", 100, 1);
        int int18 = item17.sellIn;
        com.gildedrose.Item item19 = itemUpdater13.update(item17);
        java.lang.String str20 = item17.toString();
        item17.sellIn = 10;
        java.lang.String str23 = item17.toString();
        item17.sellIn = 98;
        com.gildedrose.Item item26 = itemUpdater2.update(item17);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory27 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory27.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater31 = itemUpdaterFactory27.getInstance("");
        com.gildedrose.Item item35 = new com.gildedrose.Item("hi!", 100, 1);
        int int36 = item35.sellIn;
        com.gildedrose.Item item37 = itemUpdater31.update(item35);
        java.lang.String str38 = item35.toString();
        item35.sellIn = 10;
        java.lang.String str41 = item35.toString();
        item35.sellIn = 1;
        com.gildedrose.Item item44 = itemUpdater2.update(item35);
        java.lang.Class<?> wildcardClass45 = itemUpdater2.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 99, 0" + "'", str20, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 10, 0" + "'", str23, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertNotNull(itemUpdater29);
        org.junit.Assert.assertNotNull(itemUpdater31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!, 99, 0" + "'", str38, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!, 10, 0" + "'", str41, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        item3.name = "hi!, 0, 0";
        item3.quality = (byte) -1;
        item3.name = "hi!, 0, 0, 32, 0";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        int int14 = item12.sellIn;
        java.lang.String str15 = item12.toString();
        item12.name = "hi!, 1, 0, 0, 52";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 0, 0, -1, 50" + "'", str15, "hi!, 0, 0, -1, 50");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 100, 0", (int) (short) -1, (int) ' ');
        java.lang.String str4 = item3.toString();
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, 0, 100, 0, -1, 32" + "'", str4, "hi!, 10, 0, 100, 0, -1, 32");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item16 = new com.gildedrose.Item("hi!", 100, 1);
        com.gildedrose.Item item17 = itemUpdater12.update(item16);
        java.lang.Class<?> wildcardClass18 = item16.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item17 = new com.gildedrose.Item("hi!", 100, 1);
        int int18 = item17.sellIn;
        com.gildedrose.Item item19 = conjuredItemUpdater13.update(item17);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory20 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory20.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory20.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory20.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory29 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater31 = itemUpdaterFactory29.getInstance("");
        com.gildedrose.Item item35 = new com.gildedrose.Item("hi!", 100, 1);
        int int36 = item35.sellIn;
        com.gildedrose.Item item37 = itemUpdater31.update(item35);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory38 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater40 = itemUpdaterFactory38.getInstance("");
        com.gildedrose.Item item44 = new com.gildedrose.Item("hi!", 100, 1);
        int int45 = item44.sellIn;
        com.gildedrose.Item item46 = itemUpdater40.update(item44);
        item44.sellIn = (byte) 0;
        java.lang.String str49 = item44.toString();
        com.gildedrose.Item item50 = itemUpdater31.update(item44);
        com.gildedrose.Item item51 = itemUpdater28.update(item44);
        com.gildedrose.Item item52 = conjuredItemUpdater13.update(item44);
        java.lang.String str53 = item44.toString();
        com.gildedrose.Item item54 = itemUpdater12.update(item44);
        java.lang.Class<?> wildcardClass55 = itemUpdater12.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(itemUpdater40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertNotNull(item46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!, 0, 0" + "'", str49, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item50);
        org.junit.Assert.assertNotNull(item51);
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!, -3, 0" + "'", str53, "hi!, -3, 0");
        org.junit.Assert.assertNotNull(item54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 32");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!, 100, 1, 32, 100", (-2), 98);
        com.gildedrose.Item item9 = itemUpdater4.update(item8);
        item9.quality = (byte) 10;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(item9);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        item11.sellIn = (byte) 0;
        com.gildedrose.Item item16 = itemUpdater4.update(item11);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory20 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.Item item28 = new com.gildedrose.Item("hi!", 100, 1);
        int int29 = item28.sellIn;
        com.gildedrose.Item item30 = itemUpdater24.update(item28);
        com.gildedrose.Item item31 = itemUpdater19.update(item30);
        com.gildedrose.Item item32 = itemUpdater4.update(item31);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory33 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory33.getInstance("");
        com.gildedrose.Item item39 = new com.gildedrose.Item("hi!", 100, 1);
        int int40 = item39.sellIn;
        com.gildedrose.Item item41 = itemUpdater35.update(item39);
        com.gildedrose.Item item42 = itemUpdater4.update(item41);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory43 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater45 = itemUpdaterFactory43.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater47 = itemUpdaterFactory43.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory48 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater50 = itemUpdaterFactory48.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater52 = itemUpdaterFactory48.getInstance("");
        com.gildedrose.Item item56 = new com.gildedrose.Item("hi!", 100, 1);
        int int57 = item56.sellIn;
        com.gildedrose.Item item58 = itemUpdater52.update(item56);
        java.lang.String str59 = item56.toString();
        item56.sellIn = 10;
        java.lang.String str62 = item56.toString();
        item56.sellIn = 1;
        com.gildedrose.Item item65 = itemUpdater47.update(item56);
        java.lang.String str66 = item56.toString();
        com.gildedrose.Item item67 = itemUpdater4.update(item56);
        java.lang.Class<?> wildcardClass68 = item67.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertNotNull(item42);
        org.junit.Assert.assertNotNull(itemUpdater45);
        org.junit.Assert.assertNotNull(itemUpdater47);
        org.junit.Assert.assertNotNull(itemUpdater50);
        org.junit.Assert.assertNotNull(itemUpdater52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertNotNull(item58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!, 99, 0" + "'", str59, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!, 10, 0" + "'", str62, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!, 0, 0" + "'", str66, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item67);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, -1, 0", 0, (int) (byte) 0);
        com.gildedrose.Item item13 = itemUpdater2.update(item12);
        java.lang.Class<?> wildcardClass14 = item13.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        java.lang.String str4 = item3.toString();
        item3.sellIn = (short) 0;
        int int7 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0, 0, 98" + "'", str4, "hi!, 0, 0, 0, 98");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1" + "'", str4, "hi!, 100, 1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        int int14 = item11.sellIn;
        int int15 = item11.sellIn;
        com.gildedrose.Item item16 = itemUpdater4.update(item11);
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        int int21 = item20.quality;
        com.gildedrose.Item item22 = itemUpdater4.update(item20);
        com.gildedrose.Item item26 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        item26.quality = 0;
        int int29 = item26.sellIn;
        com.gildedrose.Item item30 = itemUpdater4.update(item26);
        int int31 = item26.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item6.sellIn = 1;
        item6.sellIn = 32;
        item6.sellIn = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 51, (int) (byte) 1);
        java.lang.String str4 = item3.name;
        item3.name = "hi!, 96, 0";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) 100, (int) (byte) -1);
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        int int6 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 100, -1" + "'", str5, "hi!, 100, -1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 100, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory13 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory18 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory18.getInstance("");
        com.gildedrose.Item item24 = new com.gildedrose.Item("hi!", 100, 1);
        int int25 = item24.sellIn;
        com.gildedrose.Item item26 = itemUpdater20.update(item24);
        item24.sellIn = (byte) 0;
        com.gildedrose.Item item29 = itemUpdater17.update(item24);
        int int30 = item29.quality;
        com.gildedrose.Item item31 = itemUpdater12.update(item29);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory32 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater34 = itemUpdaterFactory32.getInstance("");
        com.gildedrose.Item item38 = new com.gildedrose.Item("hi!", 100, 1);
        int int39 = item38.sellIn;
        com.gildedrose.Item item40 = itemUpdater34.update(item38);
        com.gildedrose.Item item44 = new com.gildedrose.Item("hi!, -2, 50", 1, 96);
        int int45 = item44.sellIn;
        com.gildedrose.Item item46 = itemUpdater34.update(item44);
        com.gildedrose.Item item47 = itemUpdater12.update(item46);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(itemUpdater34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertNotNull(item40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(item46);
        org.junit.Assert.assertNotNull(item47);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 32");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory10 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory10.getInstance("");
        com.gildedrose.Item item16 = new com.gildedrose.Item("hi!", 100, 1);
        int int17 = item16.sellIn;
        com.gildedrose.Item item18 = itemUpdater12.update(item16);
        item16.sellIn = (byte) 0;
        com.gildedrose.Item item21 = itemUpdater9.update(item16);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory22 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory22.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory22.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory22.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory31 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory31.getInstance("");
        com.gildedrose.Item item37 = new com.gildedrose.Item("hi!", 100, 1);
        int int38 = item37.sellIn;
        com.gildedrose.Item item39 = itemUpdater33.update(item37);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory40 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory40.getInstance("");
        com.gildedrose.Item item46 = new com.gildedrose.Item("hi!", 100, 1);
        int int47 = item46.sellIn;
        com.gildedrose.Item item48 = itemUpdater42.update(item46);
        item46.sellIn = (byte) 0;
        java.lang.String str51 = item46.toString();
        com.gildedrose.Item item52 = itemUpdater33.update(item46);
        com.gildedrose.Item item53 = itemUpdater30.update(item46);
        com.gildedrose.Item item54 = itemUpdater9.update(item53);
        java.lang.String str55 = item53.name;
        java.lang.String str56 = item53.toString();
        com.gildedrose.Item item57 = itemUpdater4.update(item53);
        com.gildedrose.Item item61 = new com.gildedrose.Item("", (int) '4', 1);
        int int62 = item61.sellIn;
        item61.name = "hi!";
        com.gildedrose.Item item65 = itemUpdater4.update(item61);
        item65.quality = 30;
        item65.quality = (byte) -1;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!, 0, 0" + "'", str51, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertNotNull(item54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!, -3, 0" + "'", str56, "hi!, -3, 0");
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 52 + "'", int62 == 52);
        org.junit.Assert.assertNotNull(item65);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        item3.name = "hi!, 10, 0";
        item3.name = "hi!, -1, 1";
        item3.quality = (byte) 0;
        int int10 = item3.sellIn;
        int int11 = item3.sellIn;
        int int12 = item3.sellIn;
        item3.name = "hi!, 99, 0, 98, 0";
        java.lang.String str15 = item3.name;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 99, 0, 98, 0" + "'", str15, "hi!, 99, 0, 98, 0");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 52");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = conjuredItemUpdater11.update(item15);
        item17.sellIn = 1;
        item17.sellIn = 32;
        int int22 = item17.sellIn;
        com.gildedrose.Item item23 = itemUpdater10.update(item17);
        java.lang.Class<?> wildcardClass24 = item23.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -1, 0, -1, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory9.getInstance(", 0, 50, 10, -1");
        com.gildedrose.Item item19 = new com.gildedrose.Item("hi!, -1, 0", 51, 97);
        com.gildedrose.Item item20 = itemUpdater15.update(item19);
        com.gildedrose.Item item21 = itemUpdater8.update(item20);
        java.lang.String str22 = item21.toString();
        item21.sellIn = 98;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, -1, 0, 49, 49" + "'", str22, "hi!, -1, 0, 49, 49");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        item3.name = "hi!, 0, 0";
        java.lang.Class<?> wildcardClass7 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 9");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!", (int) (short) 100, (int) (byte) -1);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        int int14 = item13.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 1, (int) ' ');
        item3.quality = 99;
        item3.name = "hi!, 0, 0, 51, 0";
        java.lang.String str8 = item3.name;
        item3.name = "hi!, 10, 50";
        item3.sellIn = 50;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 0, 0, 51, 0" + "'", str8, "hi!, 0, 0, 51, 0");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 52", (int) (byte) 100, (int) (byte) 100);
        item3.quality = 35;
        item3.quality = (byte) 0;
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, -4, 0, 99, 0", 0, (int) (short) -1);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 1, (int) ' ');
        java.lang.String str4 = item3.name;
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", 0, (int) (byte) 0);
        item3.quality = (short) -1;
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1", 1, (-1));
        item3.sellIn = (byte) 1;
        item3.quality = ' ';
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory18 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory18.getInstance("");
        com.gildedrose.Item item24 = new com.gildedrose.Item("hi!", 100, 1);
        int int25 = item24.sellIn;
        com.gildedrose.Item item26 = itemUpdater20.update(item24);
        item24.sellIn = (byte) 0;
        java.lang.String str29 = item24.toString();
        com.gildedrose.Item item30 = itemUpdater11.update(item24);
        com.gildedrose.Item item31 = itemUpdater8.update(item24);
        item31.quality = 0;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!, 0, 0" + "'", str29, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(item31);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.name = "hi!, 0, 0, 99, 0, 51, 50";
        int int6 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 0, 52", 0, (int) ' ');
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 32, 100", (-2), 98);
        java.lang.String str4 = item3.toString();
        item3.quality = 48;
        int int7 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 32, 100, -2, 98" + "'", str4, "hi!, 100, 1, 32, 100, -2, 98");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory3 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        com.gildedrose.Item item14 = itemUpdater2.update(item13);
        int int15 = item14.sellIn;
        int int16 = item14.quality;
        item14.quality = 49;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        java.lang.String str6 = item3.name;
        item3.name = "hi!, 99, 0";
        java.lang.Class<?> wildcardClass9 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0" + "'", str4, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 0, 0, 32, 0" + "'", str5, "hi!, 0, 0, 32, 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 0, 0" + "'", str6, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 32, 0", 10, 99);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0, 32, 0" + "'", str4, "hi!, 0, 0, 32, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 0, 0, 32, 0, 10, 99" + "'", str5, "hi!, 0, 0, 32, 0, 10, 99");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        item3.name = "hi!, 10, 0";
        item3.name = "hi!, -1, 1";
        item3.quality = (byte) 0;
        java.lang.String str10 = item3.name;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, -1, 1" + "'", str10, "hi!, -1, 1");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", 96, (-2));
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 0, 96, -2" + "'", str4, "hi!, -1, 0, 96, -2");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory12 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        com.gildedrose.Item item23 = itemUpdater11.update(item22);
        com.gildedrose.Item item24 = itemUpdater2.update(item23);
        item23.sellIn = (short) 10;
        item23.name = "hi!, 10, 52";
        int int29 = item23.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 32, 0", 0, (int) (short) 1);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", (int) (byte) 0, (-2));
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 0, -2" + "'", str4, "hi!, 100, 1, 0, -2");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        java.lang.String str14 = item8.toString();
        item8.sellIn = 98;
        item8.sellIn = (byte) 10;
        item8.sellIn = (-1);
        int int21 = item8.sellIn;
        java.lang.Class<?> wildcardClass22 = item8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 9, 50", (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory3 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item11.sellIn = 52;
        int int14 = item11.quality;
        com.gildedrose.Item item15 = itemUpdater7.update(item11);
        com.gildedrose.Item item16 = itemUpdater2.update(item15);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory17.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory17.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater31 = itemUpdaterFactory17.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory17.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item37 = new com.gildedrose.Item(", 10, 10", (int) (short) 10, (int) (byte) -1);
        item37.name = "hi!, 98, -2";
        com.gildedrose.Item item40 = itemUpdater33.update(item37);
        com.gildedrose.Item item41 = itemUpdater2.update(item37);
        java.lang.Class<?> wildcardClass42 = itemUpdater2.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater29);
        org.junit.Assert.assertNotNull(itemUpdater31);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertNotNull(item40);
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 52, 32, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -1, 52");
        java.lang.Class<?> wildcardClass13 = itemUpdater12.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.Item item13 = new com.gildedrose.Item("hi!", 100, 1);
        int int14 = item13.sellIn;
        com.gildedrose.Item item15 = itemUpdater9.update(item13);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.Item item24 = new com.gildedrose.Item("hi!", 100, 1);
        int int25 = item24.sellIn;
        com.gildedrose.Item item26 = itemUpdater20.update(item24);
        java.lang.String str27 = item24.toString();
        item24.sellIn = 10;
        java.lang.String str30 = item24.toString();
        item24.sellIn = 98;
        com.gildedrose.Item item33 = itemUpdater9.update(item24);
        com.gildedrose.Item item34 = itemUpdater6.update(item33);
        int int35 = item34.sellIn;
        java.lang.Class<?> wildcardClass36 = item34.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!, 99, 0" + "'", str27, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!, 10, 0" + "'", str30, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 96 + "'", int35 == 96);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', 1);
        int int4 = item3.sellIn;
        item3.name = "hi!";
        int int7 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory14 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory19 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory19.getInstance("");
        com.gildedrose.Item item25 = new com.gildedrose.Item("hi!", 100, 1);
        int int26 = item25.sellIn;
        com.gildedrose.Item item27 = itemUpdater21.update(item25);
        item25.sellIn = (byte) 0;
        com.gildedrose.Item item30 = itemUpdater18.update(item25);
        com.gildedrose.Item item31 = itemUpdater8.update(item30);
        com.gildedrose.Item item35 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str36 = item35.name;
        java.lang.String str37 = item35.toString();
        com.gildedrose.Item item38 = itemUpdater8.update(item35);
        com.gildedrose.Item item42 = new com.gildedrose.Item(", 0, 50", (int) (short) 1, (int) (short) 100);
        item42.quality = (byte) -1;
        int int45 = item42.quality;
        item42.quality = 49;
        com.gildedrose.Item item48 = itemUpdater8.update(item42);
        int int49 = item48.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 0, 0" + "'", str36, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!, 0, 0, 32, 0" + "'", str37, "hi!, 0, 0, 32, 0");
        org.junit.Assert.assertNotNull(item38);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item8.sellIn = 52;
        int int11 = item8.quality;
        com.gildedrose.Item item12 = itemUpdater4.update(item8);
        int int13 = item8.sellIn;
        item8.quality = (short) 10;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 52", (int) (byte) 1, 31);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 52, 1, 31" + "'", str4, "hi!, -1, 52, 1, 31");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 1, 99", 0, 32);
        item3.name = "hi!, 1, 0, 0, 52";
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory11.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory11.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory11.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory11.getInstance("hi!, 100, 1");
        com.gildedrose.Item item27 = new com.gildedrose.Item("hi!", (int) '4', (int) (byte) 1);
        com.gildedrose.Item item28 = itemUpdater23.update(item27);
        com.gildedrose.Item item29 = itemUpdater10.update(item28);
        java.lang.String str30 = item29.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!, 50, 0" + "'", str30, "hi!, 50, 0");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory11.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory11.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory11.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory11.getInstance("hi!, 100, 1");
        com.gildedrose.Item item27 = new com.gildedrose.Item("hi!", (int) '4', (int) (byte) 1);
        com.gildedrose.Item item28 = itemUpdater23.update(item27);
        com.gildedrose.Item item29 = itemUpdater10.update(item28);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory30 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater32 = itemUpdaterFactory30.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater34 = itemUpdaterFactory30.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory35 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater37 = itemUpdaterFactory35.getInstance("");
        com.gildedrose.Item item41 = new com.gildedrose.Item("hi!", 100, 1);
        int int42 = item41.sellIn;
        com.gildedrose.Item item43 = itemUpdater37.update(item41);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory44 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater46 = itemUpdaterFactory44.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory47 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater49 = itemUpdaterFactory47.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater51 = itemUpdaterFactory47.getInstance("");
        com.gildedrose.Item item55 = new com.gildedrose.Item("hi!", 100, 1);
        int int56 = item55.sellIn;
        com.gildedrose.Item item57 = itemUpdater51.update(item55);
        com.gildedrose.Item item58 = itemUpdater46.update(item57);
        com.gildedrose.Item item59 = itemUpdater37.update(item58);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater60 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item64 = new com.gildedrose.Item("hi!", 100, 1);
        int int65 = item64.sellIn;
        com.gildedrose.Item item66 = conjuredItemUpdater60.update(item64);
        com.gildedrose.Item item67 = itemUpdater37.update(item64);
        com.gildedrose.Item item71 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        com.gildedrose.Item item72 = itemUpdater37.update(item71);
        com.gildedrose.Item item73 = itemUpdater34.update(item71);
        com.gildedrose.Item item74 = itemUpdater10.update(item73);
        item74.name = "";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertNotNull(itemUpdater32);
        org.junit.Assert.assertNotNull(itemUpdater34);
        org.junit.Assert.assertNotNull(itemUpdater37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertNotNull(itemUpdater46);
        org.junit.Assert.assertNotNull(itemUpdater49);
        org.junit.Assert.assertNotNull(itemUpdater51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertNotNull(item58);
        org.junit.Assert.assertNotNull(item59);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertNotNull(item67);
        org.junit.Assert.assertNotNull(item72);
        org.junit.Assert.assertNotNull(item73);
        org.junit.Assert.assertNotNull(item74);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 51, 50");
        java.lang.Class<?> wildcardClass9 = itemUpdaterFactory0.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49", 35, (-1));
        item3.name = ", 1, 99";
        int int6 = item3.sellIn;
        item3.name = "hi!, 99, 0";
        item3.quality = 31;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 32, 100", (-2), (int) (byte) 1);
        java.lang.String str4 = item3.toString();
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 32, 100, -2, 1" + "'", str4, "hi!, 100, 1, 32, 100, -2, 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 100, 1, 32, 100, -2, 1" + "'", str5, "hi!, 100, 1, 32, 100, -2, 1");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory3 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        com.gildedrose.Item item14 = itemUpdater2.update(item13);
        item14.sellIn = 51;
        item14.quality = 0;
        java.lang.Class<?> wildcardClass19 = item14.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 52, 0");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 0, 52");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.gildedrose.Item item20 = itemUpdater18.update(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater18);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("", (int) (short) 10, (int) (short) 10);
        com.gildedrose.Item item7 = itemUpdater2.update(item6);
        java.lang.Class<?> wildcardClass8 = itemUpdater2.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(item7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1, 98, 0", 52, 0);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 1, (int) ' ');
        item3.quality = 99;
        int int6 = item3.quality;
        item3.name = "";
        int int9 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6 == 99);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item13 = new com.gildedrose.Item("hi!", 100, 1);
        int int14 = item13.sellIn;
        com.gildedrose.Item item15 = conjuredItemUpdater9.update(item13);
        com.gildedrose.Item item19 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str20 = item19.name;
        java.lang.String str21 = item19.name;
        int int22 = item19.quality;
        java.lang.String str23 = item19.toString();
        com.gildedrose.Item item24 = conjuredItemUpdater9.update(item19);
        java.lang.String str25 = item24.name;
        int int26 = item24.sellIn;
        item24.name = "hi!";
        int int29 = item24.quality;
        com.gildedrose.Item item30 = itemUpdater8.update(item24);
        int int31 = item24.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 100, 1" + "'", str23, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 99 + "'", int26 == 99);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 98 + "'", int31 == 98);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        java.lang.String str14 = item8.toString();
        item8.sellIn = 1;
        item8.quality = 99;
        int int19 = item8.quality;
        item8.sellIn = (byte) 1;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory7.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory7.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory7.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.Item item22 = new com.gildedrose.Item("hi!", 100, 1);
        int int23 = item22.sellIn;
        com.gildedrose.Item item24 = itemUpdater18.update(item22);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory25 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory25.getInstance("");
        com.gildedrose.Item item31 = new com.gildedrose.Item("hi!", 100, 1);
        int int32 = item31.sellIn;
        com.gildedrose.Item item33 = itemUpdater27.update(item31);
        item31.sellIn = (byte) 0;
        java.lang.String str36 = item31.toString();
        com.gildedrose.Item item37 = itemUpdater18.update(item31);
        com.gildedrose.Item item38 = itemUpdater15.update(item31);
        com.gildedrose.Item item39 = conjuredItemUpdater0.update(item31);
        int int40 = item39.quality;
        item39.quality = 49;
        int int43 = item39.sellIn;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 0, 0" + "'", str36, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(item38);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-3) + "'", int43 == (-3));
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 9, 50", 34, 31);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 98, 0, 97, 35", (int) (byte) 10, (-2));
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50, 1, 100, -1, 100", 51, (int) (byte) -1);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, -1, 0", 0, (int) (byte) 0);
        com.gildedrose.Item item13 = itemUpdater2.update(item12);
        item13.quality = (short) -1;
        item13.sellIn = 35;
        int int18 = item13.sellIn;
        java.lang.String str19 = item13.name;
        int int20 = item13.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, -1, 0" + "'", str19, "hi!, -1, 0");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item17 = new com.gildedrose.Item("hi!", 100, 1);
        int int18 = item17.sellIn;
        com.gildedrose.Item item19 = itemUpdater13.update(item17);
        java.lang.String str20 = item17.toString();
        item17.sellIn = 10;
        java.lang.String str23 = item17.toString();
        item17.sellIn = 98;
        com.gildedrose.Item item26 = itemUpdater2.update(item17);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory27 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory27.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater31 = itemUpdaterFactory27.getInstance("");
        com.gildedrose.Item item35 = new com.gildedrose.Item("hi!", 100, 1);
        int int36 = item35.sellIn;
        com.gildedrose.Item item37 = itemUpdater31.update(item35);
        java.lang.String str38 = item35.toString();
        item35.sellIn = 10;
        java.lang.String str41 = item35.toString();
        item35.sellIn = 1;
        com.gildedrose.Item item44 = itemUpdater2.update(item35);
        item35.name = ", 10, 97";
        java.lang.String str47 = item35.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 99, 0" + "'", str20, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 10, 0" + "'", str23, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertNotNull(itemUpdater29);
        org.junit.Assert.assertNotNull(itemUpdater31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!, 99, 0" + "'", str38, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!, 10, 0" + "'", str41, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + ", 10, 97, 0, 0" + "'", str47, ", 10, 97, 0, 0");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 1, 31, 49", 49, (int) (short) 10);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        item3.name = "hi!, 0, 0";
        item3.name = "hi!, 10, 0, 10, 1";
        item3.name = "hi!, 100, 1, 32, 100, 1, 49";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance(", -1, 9, 97, -2");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance(", 0, 0");
        java.lang.Class<?> wildcardClass17 = itemUpdaterFactory0.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        item15.sellIn = (byte) 0;
        java.lang.String str20 = item15.toString();
        com.gildedrose.Item item21 = itemUpdater2.update(item15);
        item21.quality = '4';
        int int24 = item21.sellIn;
        item21.name = "hi!, 1, 0";
        int int27 = item21.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        java.lang.String str14 = item8.toString();
        item8.sellIn = 98;
        int int17 = item8.sellIn;
        java.lang.String str18 = item8.name;
        java.lang.String str19 = item8.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 98 + "'", int17 == 98);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        int int14 = item8.sellIn;
        item8.quality = 9;
        int int17 = item8.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 100, 1", (int) '4', (int) '#');
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        java.lang.String str14 = item12.toString();
        int int15 = item12.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1, 51, 34" + "'", str14, "hi!, 100, 1, 51, 34");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", (int) (byte) 10, (int) (short) 100);
        item3.sellIn = ' ';
        item3.sellIn = (byte) 10;
        item3.name = "hi!, 100, -1";
        java.lang.String str10 = item3.name;
        java.lang.String str11 = item3.toString();
        java.lang.Class<?> wildcardClass12 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 100, -1" + "'", str10, "hi!, 100, -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 100, -1, 10, 100" + "'", str11, "hi!, 100, -1, 10, 100");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 96, 0");
        com.gildedrose.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.gildedrose.Item item14 = itemUpdater12.update(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory15 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory18 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory18.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory18.getInstance("");
        com.gildedrose.Item item26 = new com.gildedrose.Item("hi!", 100, 1);
        int int27 = item26.sellIn;
        com.gildedrose.Item item28 = itemUpdater22.update(item26);
        com.gildedrose.Item item29 = itemUpdater17.update(item28);
        int int30 = item29.sellIn;
        int int31 = item29.quality;
        item29.quality = (short) 10;
        java.lang.String str34 = item29.name;
        com.gildedrose.Item item35 = itemUpdater14.update(item29);
        item29.sellIn = (short) 0;
        item29.sellIn = (short) -1;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 98 + "'", int30 == 98);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(item35);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 1, (int) ' ');
        item3.quality = 99;
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory12 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        com.gildedrose.Item item23 = itemUpdater11.update(item22);
        com.gildedrose.Item item24 = itemUpdater2.update(item23);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater25 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item29 = new com.gildedrose.Item("hi!", 100, 1);
        int int30 = item29.sellIn;
        com.gildedrose.Item item31 = conjuredItemUpdater25.update(item29);
        com.gildedrose.Item item32 = itemUpdater2.update(item29);
        com.gildedrose.Item item36 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        com.gildedrose.Item item37 = itemUpdater2.update(item36);
        java.lang.Class<?> wildcardClass38 = item37.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        item3.name = "hi!, 10, 0";
        item3.name = "hi!, -1, 1";
        item3.quality = (byte) 0;
        int int10 = item3.sellIn;
        int int11 = item3.sellIn;
        int int12 = item3.sellIn;
        item3.name = "hi!, 99, 0, 98, 0";
        int int15 = item3.quality;
        item3.quality = (byte) 0;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item13 = new com.gildedrose.Item("hi!", 100, 1);
        int int14 = item13.sellIn;
        com.gildedrose.Item item15 = itemUpdater9.update(item13);
        java.lang.String str16 = item13.toString();
        item13.sellIn = 10;
        java.lang.String str19 = item13.toString();
        item13.sellIn = 1;
        com.gildedrose.Item item22 = itemUpdater4.update(item13);
        item22.name = "hi!, 100, 1";
        item22.name = "hi!, 100, 52";
        item22.quality = 'a';
        int int29 = item22.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 99, 0" + "'", str16, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 10, 0" + "'", str19, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        int int10 = item6.sellIn;
        int int11 = item6.quality;
        int int12 = item6.quality;
        item6.name = ", 100, 1";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater17 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item21 = new com.gildedrose.Item("hi!", 100, 1);
        int int22 = item21.sellIn;
        com.gildedrose.Item item23 = conjuredItemUpdater17.update(item21);
        item21.name = "hi!, 0, 0";
        int int26 = item21.quality;
        item21.quality = (short) -1;
        item21.name = "hi!";
        item21.name = ", 1, 32";
        com.gildedrose.Item item33 = itemUpdater16.update(item21);
        com.gildedrose.Item item37 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str38 = item37.name;
        java.lang.String str39 = item37.toString();
        java.lang.String str40 = item37.name;
        item37.name = "hi!, 99, 0";
        com.gildedrose.Item item43 = itemUpdater16.update(item37);
        item37.sellIn = 'a';
        item37.quality = (-2);
        java.lang.String str48 = item37.toString();
        java.lang.String str49 = item37.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!, 0, 0" + "'", str38, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!, 0, 0, 32, 0" + "'", str39, "hi!, 0, 0, 32, 0");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!, 0, 0" + "'", str40, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!, 99, 0, 97, -2" + "'", str48, "hi!, 99, 0, 97, -2");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!, 99, 0, 97, -2" + "'", str49, "hi!, 99, 0, 97, -2");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!, 10, 0", 0, (-2));
        com.gildedrose.Item item15 = itemUpdater4.update(item14);
        item14.name = ", 1, 32";
        java.lang.String str18 = item14.name;
        java.lang.Class<?> wildcardClass19 = item14.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ", 1, 32" + "'", str18, ", 1, 32");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory15 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory15.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory15.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory15.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory22 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory22.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory22.getInstance("hi!, -1, 0");
        com.gildedrose.Item item30 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str31 = item30.name;
        java.lang.String str32 = item30.toString();
        com.gildedrose.Item item33 = itemUpdater26.update(item30);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory34 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater36 = itemUpdaterFactory34.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory34.getInstance("");
        com.gildedrose.Item item42 = new com.gildedrose.Item("hi!", 100, 1);
        int int43 = item42.sellIn;
        com.gildedrose.Item item44 = itemUpdater38.update(item42);
        java.lang.String str45 = item42.toString();
        item42.sellIn = 10;
        java.lang.String str48 = item42.toString();
        item42.sellIn = 98;
        int int51 = item42.sellIn;
        com.gildedrose.Item item52 = itemUpdater26.update(item42);
        com.gildedrose.Item item53 = itemUpdater21.update(item52);
        int int54 = item53.sellIn;
        com.gildedrose.Item item55 = itemUpdater14.update(item53);
        int int56 = item53.quality;
        java.lang.Class<?> wildcardClass57 = item53.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!, 0, 0" + "'", str31, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str32, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertNotNull(itemUpdater36);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!, 99, 0" + "'", str45, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!, 10, 0" + "'", str48, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 98 + "'", int51 == 98);
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 96 + "'", int54 == 96);
        org.junit.Assert.assertNotNull(item55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory13 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory13.getInstance(", 1, 32");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory18 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory18.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory18.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory23 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory23.getInstance("");
        com.gildedrose.Item item29 = new com.gildedrose.Item("hi!", 100, 1);
        int int30 = item29.sellIn;
        com.gildedrose.Item item31 = itemUpdater25.update(item29);
        item29.sellIn = (byte) 0;
        com.gildedrose.Item item34 = itemUpdater22.update(item29);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory35 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater37 = itemUpdaterFactory35.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater39 = itemUpdaterFactory35.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater41 = itemUpdaterFactory35.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater43 = itemUpdaterFactory35.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory44 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater46 = itemUpdaterFactory44.getInstance("");
        com.gildedrose.Item item50 = new com.gildedrose.Item("hi!", 100, 1);
        int int51 = item50.sellIn;
        com.gildedrose.Item item52 = itemUpdater46.update(item50);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory53 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater55 = itemUpdaterFactory53.getInstance("");
        com.gildedrose.Item item59 = new com.gildedrose.Item("hi!", 100, 1);
        int int60 = item59.sellIn;
        com.gildedrose.Item item61 = itemUpdater55.update(item59);
        item59.sellIn = (byte) 0;
        java.lang.String str64 = item59.toString();
        com.gildedrose.Item item65 = itemUpdater46.update(item59);
        com.gildedrose.Item item66 = itemUpdater43.update(item59);
        com.gildedrose.Item item67 = itemUpdater22.update(item66);
        java.lang.String str68 = item66.name;
        java.lang.String str69 = item66.toString();
        com.gildedrose.Item item70 = itemUpdater17.update(item66);
        com.gildedrose.Item item74 = new com.gildedrose.Item("", (int) '4', 1);
        int int75 = item74.sellIn;
        item74.name = "hi!";
        com.gildedrose.Item item78 = itemUpdater17.update(item74);
        com.gildedrose.Item item79 = itemUpdater12.update(item74);
        item79.sellIn = '#';
        item79.quality = 0;
        int int84 = item79.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertNotNull(itemUpdater37);
        org.junit.Assert.assertNotNull(itemUpdater39);
        org.junit.Assert.assertNotNull(itemUpdater41);
        org.junit.Assert.assertNotNull(itemUpdater43);
        org.junit.Assert.assertNotNull(itemUpdater46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertNotNull(itemUpdater55);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertNotNull(item61);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!, 0, 0" + "'", str64, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item65);
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertNotNull(item67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!, -3, 0" + "'", str69, "hi!, -3, 0");
        org.junit.Assert.assertNotNull(item70);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 52 + "'", int75 == 52);
        org.junit.Assert.assertNotNull(item78);
        org.junit.Assert.assertNotNull(item79);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 100, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory13 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory18 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory18.getInstance("");
        com.gildedrose.Item item24 = new com.gildedrose.Item("hi!", 100, 1);
        int int25 = item24.sellIn;
        com.gildedrose.Item item26 = itemUpdater20.update(item24);
        item24.sellIn = (byte) 0;
        com.gildedrose.Item item29 = itemUpdater17.update(item24);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory30 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater32 = itemUpdaterFactory30.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater34 = itemUpdaterFactory30.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater36 = itemUpdaterFactory30.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory30.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory39 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater41 = itemUpdaterFactory39.getInstance("");
        com.gildedrose.Item item45 = new com.gildedrose.Item("hi!", 100, 1);
        int int46 = item45.sellIn;
        com.gildedrose.Item item47 = itemUpdater41.update(item45);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory48 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater50 = itemUpdaterFactory48.getInstance("");
        com.gildedrose.Item item54 = new com.gildedrose.Item("hi!", 100, 1);
        int int55 = item54.sellIn;
        com.gildedrose.Item item56 = itemUpdater50.update(item54);
        item54.sellIn = (byte) 0;
        java.lang.String str59 = item54.toString();
        com.gildedrose.Item item60 = itemUpdater41.update(item54);
        com.gildedrose.Item item61 = itemUpdater38.update(item54);
        com.gildedrose.Item item62 = itemUpdater17.update(item61);
        java.lang.String str63 = item61.name;
        java.lang.String str64 = item61.toString();
        java.lang.String str65 = item61.name;
        com.gildedrose.Item item66 = itemUpdater12.update(item61);
        int int67 = item61.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertNotNull(itemUpdater32);
        org.junit.Assert.assertNotNull(itemUpdater34);
        org.junit.Assert.assertNotNull(itemUpdater36);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertNotNull(itemUpdater41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertNotNull(itemUpdater50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertNotNull(item56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!, 0, 0" + "'", str59, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item60);
        org.junit.Assert.assertNotNull(item61);
        org.junit.Assert.assertNotNull(item62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!, -3, 0" + "'", str64, "hi!, -3, 0");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.name;
        java.lang.String str8 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0" + "'", str4, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 0, 0, 32, 0" + "'", str5, "hi!, 0, 0, 32, 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 0, 0" + "'", str6, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 0, 0" + "'", str7, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 0, 0, 32, 0" + "'", str8, "hi!, 0, 0, 32, 0");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory3 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory8 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory8.getInstance("");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!", 100, 1);
        int int15 = item14.sellIn;
        com.gildedrose.Item item16 = itemUpdater10.update(item14);
        item14.sellIn = (byte) 0;
        com.gildedrose.Item item19 = itemUpdater7.update(item14);
        com.gildedrose.Item item20 = itemUpdater2.update(item14);
        com.gildedrose.Item item24 = new com.gildedrose.Item("", (int) '4', 1);
        int int25 = item24.sellIn;
        item24.name = "hi!";
        java.lang.String str28 = item24.name;
        int int29 = item24.sellIn;
        com.gildedrose.Item item30 = itemUpdater2.update(item24);
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!, -1, 0", (int) (byte) -1, (int) (short) 0);
        int int35 = item34.sellIn;
        com.gildedrose.Item item36 = itemUpdater2.update(item34);
        item36.quality = (short) 100;
        java.lang.String str39 = item36.name;
        java.lang.String str40 = item36.name;
        item36.name = "hi!, 0, 0, 52, 1, 1, 100";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!, -1, 0" + "'", str39, "hi!, -1, 0");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!, -1, 0" + "'", str40, "hi!, -1, 0");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = conjuredItemUpdater7.update(item11);
        item11.name = "hi!, 0, 0";
        int int16 = item11.quality;
        com.gildedrose.Item item17 = itemUpdater6.update(item11);
        int int18 = item11.sellIn;
        item11.quality = 34;
        int int21 = item11.quality;
        java.lang.String str22 = item11.toString();
        int int23 = item11.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 34 + "'", int21 == 34);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, 0, 0, 98, 34" + "'", str22, "hi!, 0, 0, 98, 34");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 98 + "'", int23 == 98);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        item3.quality = 100;
        item3.quality = 35;
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        item3.name = "hi!, 100, 1";
        int int7 = item3.quality;
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 96, 31", (int) (short) 1, 98);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.toString();
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 100, 1" + "'", str6, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 100, 1" + "'", str7, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -4, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -1, 1, 8, 30");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory9.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory9.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory9.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item23 = new com.gildedrose.Item("", 1, (int) ' ');
        java.lang.String str24 = item23.name;
        item23.sellIn = 'a';
        com.gildedrose.Item item27 = itemUpdater19.update(item23);
        com.gildedrose.Item item28 = itemUpdater8.update(item27);
        int int29 = item27.quality;
        int int30 = item27.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 30 + "'", int29 == 30);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 95 + "'", int30 == 95);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        item3.quality = 0;
        item3.quality = (byte) 0;
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 100, 1" + "'", str8, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 100, 1, 10, 0" + "'", str9, "hi!, 100, 1, 10, 0");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        int int9 = item4.quality;
        item4.name = "hi!";
        item4.name = "hi!";
        item4.name = "hi!, 98, -2";
        int int16 = item4.sellIn;
        int int17 = item4.sellIn;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        item15.sellIn = (byte) 0;
        java.lang.String str20 = item15.toString();
        com.gildedrose.Item item21 = itemUpdater2.update(item15);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory22 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.Item item28 = new com.gildedrose.Item("hi!", 100, 1);
        int int29 = item28.sellIn;
        com.gildedrose.Item item30 = itemUpdater24.update(item28);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory31 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory31.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory31.getInstance("");
        com.gildedrose.Item item39 = new com.gildedrose.Item("hi!", 100, 1);
        int int40 = item39.sellIn;
        com.gildedrose.Item item41 = itemUpdater35.update(item39);
        java.lang.String str42 = item39.toString();
        item39.sellIn = 10;
        java.lang.String str45 = item39.toString();
        item39.sellIn = 98;
        com.gildedrose.Item item48 = itemUpdater24.update(item39);
        com.gildedrose.Item item49 = itemUpdater2.update(item48);
        java.lang.Class<?> wildcardClass50 = itemUpdater2.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!, 99, 0" + "'", str42, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!, 10, 0" + "'", str45, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(item49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        item14.name = "hi!, 10, 0, 10, 1, 1, -1, 52, 100";
        int int18 = item14.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (short) 1);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0" + "'", str4, "hi!, 0, 0");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        item13.quality = 35;
        int int16 = item13.sellIn;
        int int17 = item13.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory14 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.Item item22 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item22.sellIn = 52;
        int int25 = item22.quality;
        com.gildedrose.Item item26 = itemUpdater18.update(item22);
        com.gildedrose.Item item27 = itemUpdater13.update(item26);
        com.gildedrose.Item item28 = itemUpdater10.update(item27);
        java.lang.Class<?> wildcardClass29 = itemUpdater10.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item17 = new com.gildedrose.Item("hi!", 100, 1);
        int int18 = item17.sellIn;
        com.gildedrose.Item item19 = itemUpdater13.update(item17);
        java.lang.String str20 = item17.toString();
        item17.sellIn = 10;
        java.lang.String str23 = item17.toString();
        item17.sellIn = 98;
        com.gildedrose.Item item26 = itemUpdater2.update(item17);
        item17.sellIn = 97;
        item17.sellIn = '4';
        int int31 = item17.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 99, 0" + "'", str20, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 10, 0" + "'", str23, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", 0, (int) (byte) 0);
        item3.name = "hi!, 100, 1";
        java.lang.String str6 = item3.name;
        item3.sellIn = (short) 1;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 100, 1" + "'", str6, "hi!, 100, 1");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 32, 100", (-2), 98);
        java.lang.String str4 = item3.toString();
        item3.quality = 48;
        int int7 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 32, 100, -2, 98" + "'", str4, "hi!, 100, 1, 32, 100, -2, 98");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory15 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory18 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory18.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory18.getInstance("");
        com.gildedrose.Item item26 = new com.gildedrose.Item("hi!", 100, 1);
        int int27 = item26.sellIn;
        com.gildedrose.Item item28 = itemUpdater22.update(item26);
        com.gildedrose.Item item29 = itemUpdater17.update(item28);
        int int30 = item29.sellIn;
        int int31 = item29.quality;
        item29.quality = (short) 10;
        java.lang.String str34 = item29.name;
        com.gildedrose.Item item35 = itemUpdater14.update(item29);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory36 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory36.getInstance("");
        com.gildedrose.Item item42 = new com.gildedrose.Item("hi!", 100, 1);
        int int43 = item42.sellIn;
        com.gildedrose.Item item44 = itemUpdater38.update(item42);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory45 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater47 = itemUpdaterFactory45.getInstance("");
        com.gildedrose.Item item51 = new com.gildedrose.Item("hi!", 100, 1);
        int int52 = item51.sellIn;
        com.gildedrose.Item item53 = itemUpdater47.update(item51);
        item51.sellIn = (byte) 0;
        java.lang.String str56 = item51.toString();
        com.gildedrose.Item item57 = itemUpdater38.update(item51);
        item51.name = "hi!, 0, 0";
        int int60 = item51.sellIn;
        com.gildedrose.Item item61 = itemUpdater14.update(item51);
        java.lang.String str62 = item51.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 98 + "'", int30 == 98);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertNotNull(itemUpdater47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!, 0, 0" + "'", str56, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(item61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!, 0, 0, -2, 0" + "'", str62, "hi!, 0, 0, -2, 0");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 99");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 10, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.Item item13 = new com.gildedrose.Item("hi!", 100, 1);
        int int14 = item13.sellIn;
        com.gildedrose.Item item15 = itemUpdater9.update(item13);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.Item item22 = new com.gildedrose.Item("hi!", 100, 1);
        int int23 = item22.sellIn;
        com.gildedrose.Item item24 = itemUpdater18.update(item22);
        item22.sellIn = (byte) 0;
        java.lang.String str27 = item22.toString();
        com.gildedrose.Item item28 = itemUpdater9.update(item22);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory29 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater31 = itemUpdaterFactory29.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory29.getInstance("");
        com.gildedrose.Item item37 = new com.gildedrose.Item("hi!", 100, 1);
        int int38 = item37.sellIn;
        com.gildedrose.Item item39 = itemUpdater33.update(item37);
        java.lang.String str40 = item37.toString();
        item37.sellIn = 10;
        java.lang.String str43 = item37.toString();
        item37.sellIn = 98;
        item37.sellIn = (byte) 10;
        com.gildedrose.Item item48 = itemUpdater9.update(item37);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory49 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater51 = itemUpdaterFactory49.getInstance("");
        com.gildedrose.Item item55 = new com.gildedrose.Item("hi!", 100, 1);
        int int56 = item55.sellIn;
        com.gildedrose.Item item57 = itemUpdater51.update(item55);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory58 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater60 = itemUpdaterFactory58.getInstance("");
        com.gildedrose.Item item64 = new com.gildedrose.Item("hi!", 100, 1);
        int int65 = item64.sellIn;
        com.gildedrose.Item item66 = itemUpdater60.update(item64);
        item64.sellIn = (byte) 0;
        java.lang.String str69 = item64.toString();
        com.gildedrose.Item item70 = itemUpdater51.update(item64);
        com.gildedrose.Item item71 = itemUpdater9.update(item70);
        java.lang.String str72 = item70.name;
        java.lang.String str73 = item70.toString();
        int int74 = item70.sellIn;
        com.gildedrose.Item item75 = itemUpdater6.update(item70);
        item75.quality = 9;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!, 0, 0" + "'", str27, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(itemUpdater31);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!, 99, 0" + "'", str40, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!, 10, 0" + "'", str43, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(itemUpdater51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertNotNull(itemUpdater60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!, 0, 0" + "'", str69, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item70);
        org.junit.Assert.assertNotNull(item71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!, -2, 0" + "'", str73, "hi!, -2, 0");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-2) + "'", int74 == (-2));
        org.junit.Assert.assertNotNull(item75);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 10, 10, 99, 0", 96, (int) (short) 100);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 32");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory10 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory10.getInstance("");
        com.gildedrose.Item item16 = new com.gildedrose.Item("hi!", 100, 1);
        int int17 = item16.sellIn;
        com.gildedrose.Item item18 = itemUpdater12.update(item16);
        item16.sellIn = (byte) 0;
        com.gildedrose.Item item21 = itemUpdater9.update(item16);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory22 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory22.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory22.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory22.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory31 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory31.getInstance("");
        com.gildedrose.Item item37 = new com.gildedrose.Item("hi!", 100, 1);
        int int38 = item37.sellIn;
        com.gildedrose.Item item39 = itemUpdater33.update(item37);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory40 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory40.getInstance("");
        com.gildedrose.Item item46 = new com.gildedrose.Item("hi!", 100, 1);
        int int47 = item46.sellIn;
        com.gildedrose.Item item48 = itemUpdater42.update(item46);
        item46.sellIn = (byte) 0;
        java.lang.String str51 = item46.toString();
        com.gildedrose.Item item52 = itemUpdater33.update(item46);
        com.gildedrose.Item item53 = itemUpdater30.update(item46);
        com.gildedrose.Item item54 = itemUpdater9.update(item53);
        java.lang.String str55 = item53.name;
        java.lang.String str56 = item53.toString();
        com.gildedrose.Item item57 = itemUpdater4.update(item53);
        com.gildedrose.Item item61 = new com.gildedrose.Item("", (int) '4', 1);
        int int62 = item61.sellIn;
        item61.name = "hi!";
        com.gildedrose.Item item65 = itemUpdater4.update(item61);
        item65.quality = 30;
        int int68 = item65.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!, 0, 0" + "'", str51, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertNotNull(item54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!, -3, 0" + "'", str56, "hi!, -3, 0");
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 52 + "'", int62 == 52);
        org.junit.Assert.assertNotNull(item65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 51 + "'", int68 == 51);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, -1, 0", 0, (int) (byte) 0);
        com.gildedrose.Item item13 = itemUpdater2.update(item12);
        int int14 = item13.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.Item item12 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        item12.quality = '4';
        com.gildedrose.Item item15 = itemUpdater8.update(item12);
        int int16 = item12.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory10 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory10.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory10.getInstance("");
        com.gildedrose.Item item18 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item18.sellIn = 52;
        int int21 = item18.quality;
        com.gildedrose.Item item22 = itemUpdater14.update(item18);
        com.gildedrose.Item item23 = itemUpdater9.update(item22);
        item23.quality = 96;
        java.lang.String str26 = item23.toString();
        com.gildedrose.Item item27 = conjuredItemUpdater0.update(item23);
        int int28 = item23.sellIn;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!, 0, 0, 99, 0, 50, 96" + "'", str26, "hi!, 0, 0, 99, 0, 50, 96");
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 49 + "'", int28 == 49);
    }
}

