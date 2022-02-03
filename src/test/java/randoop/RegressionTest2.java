package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 1, 1", (-3), (-1));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 31, 0", 32, (int) (short) -1);
        item3.sellIn = 49;
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        int int5 = item3.quality;
        item3.quality = 99;
        java.lang.String str8 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 100, 99" + "'", str8, "hi!, 100, 99");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.toString();
        item3.quality = 0;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 100, 1" + "'", str6, "hi!, 100, 1");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        java.lang.Class<?> wildcardClass23 = item21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        java.lang.String str24 = item17.toString();
        java.lang.String str25 = item17.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!, 31, 0" + "'", str24, "hi!, 31, 0");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 99, -1", 98, (int) (byte) -1);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 99, -1, 98, -1" + "'", str4, ", 99, -1, 98, -1");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str7 = item6.name;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        int int10 = item6.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str13 = item12.name;
        int int14 = item12.sellIn;
        com.gildedrose.Item item15 = itemUpdater8.update(item12);
        int int16 = item15.quality;
        java.lang.String str17 = item15.name;
        item15.sellIn = (-2);
        java.lang.String str20 = item15.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 0, 0" + "'", str13, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 0, 0" + "'", str17, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 1, 32, 98, 0", 8, 32);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1", (int) ' ', (int) ' ');
        item3.name = "hi!, 0, 0, 99, 0, 51, 50";
        item3.sellIn = 52;
        item3.quality = 35;
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        java.lang.String str6 = item3.name;
        int int7 = item3.quality;
        java.lang.String str8 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0" + "'", str4, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 0, 0, 32, 0" + "'", str5, "hi!, 0, 0, 32, 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 0, 0" + "'", str6, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 0, 0, 32, 0" + "'", str8, "hi!, 0, 0, 32, 0");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 98, 0", 97, 35);
        java.lang.String str4 = item3.toString();
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        item3.sellIn = 0;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 98, 0, 97, 35" + "'", str4, "hi!, 98, 0, 97, 35");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 98, 0" + "'", str5, "hi!, 98, 0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, -1, 35", 0, 96);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        java.lang.String str75 = item73.name;
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
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!, 99, 0" + "'", str75, "hi!, 99, 0");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        item14.quality = (byte) 0;
        item14.quality = 97;
        item14.sellIn = 100;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(item18);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        item16.quality = 0;
        java.lang.Class<?> wildcardClass21 = item16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        com.gildedrose.Item item23 = new com.gildedrose.Item("hi!", 100, 1);
        com.gildedrose.Item item24 = conjuredItemUpdater13.update(item23);
        com.gildedrose.Item item28 = new com.gildedrose.Item("", (int) '4', 1);
        item28.name = "hi!, 0, 0";
        java.lang.String str31 = item28.toString();
        com.gildedrose.Item item32 = conjuredItemUpdater13.update(item28);
        com.gildedrose.Item item33 = itemUpdater12.update(item28);
        item28.quality = (short) 10;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str31, "hi!, 0, 0, 52, 1");
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertNotNull(item33);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.name;
        item3.name = "hi!, 100, 52";
        int int9 = item3.sellIn;
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory9.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory9.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory9.getInstance("hi!, 9, 0");
        com.gildedrose.Item item23 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        com.gildedrose.Item item24 = itemUpdater19.update(item23);
        com.gildedrose.Item item25 = itemUpdater8.update(item23);
        item23.name = "hi!, 52, 1, 31, 49";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertNotNull(item25);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        item17.quality = (byte) 100;
        item17.sellIn = 98;
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, -2, 46", (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        java.lang.String str14 = item8.toString();
        item8.quality = 10;
        int int17 = item8.sellIn;
        int int18 = item8.quality;
        item8.name = "hi!, 1, 0, 0, 52";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        item24.sellIn = (short) -1;
        java.lang.Class<?> wildcardClass28 = item24.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, -1", (int) (byte) 10, 31);
        item3.quality = (short) 100;
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        java.lang.String str37 = item29.name;
        item29.sellIn = 96;
        item29.quality = 99;
        java.lang.String str42 = item29.name;
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!, 0, 0" + "'", str37, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!, 0, 0" + "'", str42, "hi!, 0, 0");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        item16.sellIn = 1;
        java.lang.Class<?> wildcardClass20 = item16.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        java.lang.String str21 = item20.name;
        java.lang.Class<?> wildcardClass22 = item20.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        com.gildedrose.Item item19 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item19.sellIn = (byte) 100;
        java.lang.String str22 = item19.name;
        item19.name = "hi!, -1, 0";
        com.gildedrose.Item item25 = conjuredItemUpdater0.update(item19);
        item25.sellIn = 52;
        item25.quality = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1" + "'", str14, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, 99, 0" + "'", str22, "hi!, 99, 0");
        org.junit.Assert.assertNotNull(item25);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 1, 32", (int) '#', (int) (byte) 1);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        java.lang.Class<?> wildcardClass28 = item15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory21 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory21.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory21.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory30 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater32 = itemUpdaterFactory30.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater34 = itemUpdaterFactory30.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater36 = itemUpdaterFactory30.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory30.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item42 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item43 = itemUpdater38.update(item42);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory44 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater46 = itemUpdaterFactory44.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater48 = itemUpdaterFactory44.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory49 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater51 = itemUpdaterFactory49.getInstance("");
        com.gildedrose.Item item55 = new com.gildedrose.Item("hi!", 100, 1);
        int int56 = item55.sellIn;
        com.gildedrose.Item item57 = itemUpdater51.update(item55);
        item55.sellIn = (byte) 0;
        com.gildedrose.Item item60 = itemUpdater48.update(item55);
        com.gildedrose.Item item61 = itemUpdater38.update(item60);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory62 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater64 = itemUpdaterFactory62.getInstance("");
        com.gildedrose.Item item68 = new com.gildedrose.Item("hi!", 100, 1);
        int int69 = item68.sellIn;
        com.gildedrose.Item item70 = itemUpdater64.update(item68);
        int int71 = item68.sellIn;
        int int72 = item68.sellIn;
        com.gildedrose.Item item73 = itemUpdater38.update(item68);
        com.gildedrose.Item item74 = itemUpdater29.update(item73);
        item74.sellIn = 96;
        java.lang.String str77 = item74.toString();
        int int78 = item74.quality;
        com.gildedrose.Item item79 = itemUpdater2.update(item74);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater29);
        org.junit.Assert.assertNotNull(itemUpdater32);
        org.junit.Assert.assertNotNull(itemUpdater34);
        org.junit.Assert.assertNotNull(itemUpdater36);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertNotNull(itemUpdater46);
        org.junit.Assert.assertNotNull(itemUpdater48);
        org.junit.Assert.assertNotNull(itemUpdater51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertNotNull(item60);
        org.junit.Assert.assertNotNull(item61);
        org.junit.Assert.assertNotNull(itemUpdater64);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertNotNull(item70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 99 + "'", int71 == 99);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 99 + "'", int72 == 99);
        org.junit.Assert.assertNotNull(item73);
        org.junit.Assert.assertNotNull(item74);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!, 96, 0" + "'", str77, "hi!, 96, 0");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(item79);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", (int) (byte) 10, (int) (short) 100);
        item3.quality = 'a';
        item3.name = "";
        int int8 = item3.sellIn;
        int int9 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        item8.name = "hi!, 0, 0, 0, 1, 1, 0";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1", 51, 9);
        item3.quality = 30;
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        item3.sellIn = 99;
        int int6 = item3.sellIn;
        item3.quality = 96;
        item3.quality = 35;
        item3.quality = 49;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6 == 99);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", (int) '#', 0);
        item3.quality = 0;
        java.lang.String str6 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 100, 1" + "'", str6, "hi!, 100, 1");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) (short) 100, 0);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        int int14 = item8.sellIn;
        item8.name = "hi!, 10, 0";
        int int17 = item8.sellIn;
        java.lang.String str18 = item8.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 10, 0" + "'", str18, "hi!, 10, 0");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        int int14 = item8.sellIn;
        int int15 = item8.quality;
        item8.quality = 98;
        item8.name = "hi!, -2, 0";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        java.lang.String str32 = item30.toString();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!, -2, 0" + "'", str32, "hi!, -2, 0");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 10, 10");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 35, 0", 1, (int) (byte) 10);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 51, 0", (int) (byte) 0, 50);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory11.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory11.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory11.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory11.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory11.getInstance("hi!, 100, 1, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.Item item29 = new com.gildedrose.Item("hi!, -1, 0", (int) (byte) -1, (int) (short) 0);
        java.lang.String str30 = item29.toString();
        com.gildedrose.Item item31 = itemUpdater25.update(item29);
        item31.quality = (short) 10;
        com.gildedrose.Item item34 = itemUpdater10.update(item31);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory35 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater37 = itemUpdaterFactory35.getInstance("");
        com.gildedrose.Item item41 = new com.gildedrose.Item("hi!", 100, 1);
        int int42 = item41.sellIn;
        com.gildedrose.Item item43 = itemUpdater37.update(item41);
        com.gildedrose.Item item47 = new com.gildedrose.Item("hi!, -1, 0", 0, (int) (byte) 0);
        com.gildedrose.Item item48 = itemUpdater37.update(item47);
        item48.quality = (short) -1;
        item48.sellIn = 35;
        com.gildedrose.Item item53 = itemUpdater10.update(item48);
        java.lang.Class<?> wildcardClass54 = itemUpdater10.getClass();
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
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!, -1, 0, -1, 0" + "'", str30, "hi!, -1, 0, -1, 0");
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertNotNull(itemUpdater37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        int int6 = item3.quality;
        int int7 = item3.quality;
        item3.name = ", 1, 32, 98, 0";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        int int71 = item70.quality;
        int int72 = item70.sellIn;
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
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 98 + "'", int72 == 98);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        java.lang.String str37 = item36.name;
        item36.name = "hi!, -2, 50";
        int int40 = item36.sellIn;
        item36.name = "hi!, 100, 1, 9, 1, 97, 50";
        java.lang.Class<?> wildcardClass43 = item36.getClass();
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!, 0, 0" + "'", str37, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 98 + "'", int40 == 98);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory7.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory7.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item19 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item20 = itemUpdater15.update(item19);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory21 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory26 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory26.getInstance("");
        com.gildedrose.Item item32 = new com.gildedrose.Item("hi!", 100, 1);
        int int33 = item32.sellIn;
        com.gildedrose.Item item34 = itemUpdater28.update(item32);
        item32.sellIn = (byte) 0;
        com.gildedrose.Item item37 = itemUpdater25.update(item32);
        com.gildedrose.Item item38 = itemUpdater15.update(item37);
        com.gildedrose.Item item39 = itemUpdater6.update(item37);
        int int40 = item37.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(item38);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-3) + "'", int40 == (-3));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance(", 0, 50, 10, -1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        item61.sellIn = 31;
        item61.name = "hi!, 52, 1, 31, 49";
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
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance(", -1, 9, 97, -2");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance(", 0, 0");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 96, 0");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory0.getInstance("hi!, -1, 1, 10, 32");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater20);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        java.lang.String str12 = item8.name;
        java.lang.String str13 = item8.toString();
        java.lang.String str14 = item8.name;
        item8.sellIn = '4';
        java.lang.String str17 = item8.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 99, 0" + "'", str13, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 52, 0" + "'", str17, "hi!, 52, 0");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) '4');
        java.lang.String str15 = item14.name;
        int int16 = item14.sellIn;
        item14.sellIn = 0;
        com.gildedrose.Item item19 = itemUpdater10.update(item14);
        java.lang.String str20 = item19.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 99, 0" + "'", str15, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 99, 0" + "'", str20, "hi!, 99, 0");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        item65.sellIn = 1;
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
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        int int27 = item21.sellIn;
        int int28 = item21.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        java.lang.String str41 = item39.name;
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 32, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 98");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, -1, 50");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory15 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.Item item21 = new com.gildedrose.Item("hi!", 100, 1);
        int int22 = item21.sellIn;
        com.gildedrose.Item item23 = itemUpdater17.update(item21);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory24 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory24.getInstance("");
        com.gildedrose.Item item30 = new com.gildedrose.Item("hi!", 100, 1);
        int int31 = item30.sellIn;
        com.gildedrose.Item item32 = itemUpdater26.update(item30);
        item30.sellIn = (byte) 0;
        java.lang.String str35 = item30.toString();
        com.gildedrose.Item item36 = itemUpdater17.update(item30);
        item36.quality = '4';
        java.lang.String str39 = item36.name;
        int int40 = item36.sellIn;
        java.lang.String str41 = item36.name;
        item36.sellIn = (byte) 100;
        com.gildedrose.Item item44 = itemUpdater14.update(item36);
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
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!, 0, 0" + "'", str35, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(item44);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        int int7 = item4.quality;
        java.lang.String str8 = item4.name;
        java.lang.String str9 = item4.name;
        item4.name = "hi!, 100, 1, 35, 0";
        int int12 = item4.sellIn;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        int int5 = item3.quality;
        item3.name = "hi!, 0, 0, 32, 0";
        item3.name = "";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!", 100, 1);
        com.gildedrose.Item item11 = conjuredItemUpdater0.update(item10);
        int int12 = item10.sellIn;
        item10.sellIn = 99;
        java.lang.String str15 = item10.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 99, 0" + "'", str15, "hi!, 99, 0");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        item15.sellIn = 0;
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
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -1, 0, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 1");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        int int9 = item4.quality;
        item4.name = "hi!";
        int int12 = item4.sellIn;
        item4.name = "hi!, 10, 0, 10, 1, 1, -1";
        java.lang.String str15 = item4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 10, 0, 10, 1, 1, -1, 99, 0" + "'", str15, "hi!, 10, 0, 10, 1, 1, -1, 99, 0");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        item37.quality = 52;
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
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        int int37 = item36.sellIn;
        int int38 = item36.quality;
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 98 + "'", int37 == 98);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        item3.quality = 49;
        item3.sellIn = (byte) 0;
        java.lang.String str8 = item3.toString();
        item3.quality = 34;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 0, 0, 0, 49" + "'", str8, "hi!, 0, 0, 0, 49");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        item16.quality = (-1);
        java.lang.String str19 = item16.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, -1, -1" + "'", str19, "hi!, -1, -1");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        int int6 = item3.quality;
        item3.sellIn = 98;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) '4', (int) (byte) 1);
        java.lang.String str4 = item3.name;
        item3.sellIn = (short) 1;
        item3.quality = 35;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        java.lang.String str6 = item3.name;
        item3.name = "hi!, -1, 0";
        item3.name = "hi!";
        item3.sellIn = (short) -1;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 99, 0" + "'", str6, "hi!, 99, 0");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 100, 0", 96, 49);
        java.lang.String str4 = item3.name;
        int int5 = item3.quality;
        item3.sellIn = 32;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 100, 0" + "'", str4, "hi!, 100, 1, 100, 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49, -2, 52", 0, (int) (short) 1);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        item49.quality = 1;
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
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 8, 0", 49, (int) (short) 1);
        item3.name = "hi!, 100, 1, 100, 0, 96, 49";
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        java.lang.String str6 = item3.name;
        int int7 = item3.sellIn;
        java.lang.String str8 = item3.toString();
        int int9 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 99, 0" + "'", str6, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 99, 0, 100, 52" + "'", str8, "hi!, 99, 0, 100, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, -1", (-2), 49);
        int int4 = item3.quality;
        item3.quality = 97;
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 100, -1" + "'", str7, "hi!, 100, -1");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item16 = new com.gildedrose.Item("hi!", 100, 1);
        com.gildedrose.Item item17 = itemUpdater12.update(item16);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory18 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory18.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory21 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.Item item29 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item29.sellIn = 52;
        int int32 = item29.quality;
        com.gildedrose.Item item33 = itemUpdater25.update(item29);
        com.gildedrose.Item item34 = itemUpdater20.update(item33);
        java.lang.String str35 = item34.name;
        item34.name = "hi!, -1, -1";
        int int38 = item34.sellIn;
        com.gildedrose.Item item39 = itemUpdater12.update(item34);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str35, "hi!, 0, 0, 99, 0");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 50 + "'", int38 == 50);
        org.junit.Assert.assertNotNull(item39);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 52, 1", (int) (byte) 1, 32);
        item3.sellIn = 95;
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory34 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater36 = itemUpdaterFactory34.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory34.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater40 = itemUpdaterFactory34.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory34.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater44 = itemUpdaterFactory34.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item48 = new com.gildedrose.Item("", 1, (int) ' ');
        java.lang.String str49 = item48.name;
        item48.sellIn = 'a';
        com.gildedrose.Item item52 = itemUpdater44.update(item48);
        int int53 = item48.sellIn;
        java.lang.String str54 = item48.toString();
        int int55 = item48.sellIn;
        item48.name = "hi!, 1, 0";
        com.gildedrose.Item item58 = itemUpdater16.update(item48);
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
        org.junit.Assert.assertNotNull(itemUpdater36);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertNotNull(itemUpdater40);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertNotNull(itemUpdater44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 96 + "'", int53 == 96);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + ", 96, 31" + "'", str54, ", 96, 31");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 96 + "'", int55 == 96);
        org.junit.Assert.assertNotNull(item58);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        int int10 = item6.sellIn;
        int int11 = item6.quality;
        item6.quality = 34;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.Item item12 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        item12.quality = '4';
        com.gildedrose.Item item15 = itemUpdater8.update(item12);
        com.gildedrose.Item item19 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str20 = item19.name;
        int int21 = item19.quality;
        item19.name = "";
        java.lang.String str24 = item19.toString();
        com.gildedrose.Item item25 = itemUpdater8.update(item19);
        int int26 = item25.sellIn;
        int int27 = item25.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ", 100, 1" + "'", str24, ", 100, 1");
        org.junit.Assert.assertNotNull(item25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 99 + "'", int26 == 99);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 0, 50");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 52, 1, 31, 49");
        java.lang.Class<?> wildcardClass9 = itemUpdaterFactory0.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        java.lang.String str18 = item15.toString();
        item15.sellIn = 10;
        java.lang.String str21 = item15.toString();
        item15.sellIn = 98;
        item15.sellIn = (byte) 10;
        item15.sellIn = (-1);
        java.lang.String str28 = item15.name;
        com.gildedrose.Item item29 = conjuredItemUpdater0.update(item15);
        item15.name = "hi!, -1, 52, 1, 31";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 99, 0" + "'", str18, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 10, 0" + "'", str21, "hi!, 10, 0");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(item29);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance(", 0, 50, 10, -1");
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!, -1, 0", 51, 97);
        com.gildedrose.Item item11 = itemUpdater6.update(item10);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory12 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.Item item18 = new com.gildedrose.Item("hi!", 100, 1);
        int int19 = item18.sellIn;
        com.gildedrose.Item item20 = itemUpdater14.update(item18);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory21 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory24 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory24.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory24.getInstance("");
        com.gildedrose.Item item32 = new com.gildedrose.Item("hi!", 100, 1);
        int int33 = item32.sellIn;
        com.gildedrose.Item item34 = itemUpdater28.update(item32);
        com.gildedrose.Item item35 = itemUpdater23.update(item34);
        com.gildedrose.Item item36 = itemUpdater14.update(item35);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater37 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item41 = new com.gildedrose.Item("hi!", 100, 1);
        int int42 = item41.sellIn;
        com.gildedrose.Item item43 = conjuredItemUpdater37.update(item41);
        item41.name = "hi!, 0, 0";
        int int46 = item41.quality;
        java.lang.String str47 = item41.toString();
        com.gildedrose.Item item48 = itemUpdater14.update(item41);
        java.lang.String str49 = item48.name;
        item48.name = "hi!, -2, 50";
        com.gildedrose.Item item52 = itemUpdater6.update(item48);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater53 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item57 = new com.gildedrose.Item("hi!", 100, 1);
        int int58 = item57.sellIn;
        com.gildedrose.Item item59 = conjuredItemUpdater53.update(item57);
        com.gildedrose.Item item63 = new com.gildedrose.Item("hi!", 100, 1);
        com.gildedrose.Item item64 = conjuredItemUpdater53.update(item63);
        java.lang.String str65 = item64.toString();
        item64.sellIn = 35;
        com.gildedrose.Item item68 = itemUpdater6.update(item64);
        java.lang.String str69 = item64.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str47, "hi!, 0, 0, 99, 0");
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!, 0, 0" + "'", str49, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertNotNull(item59);
        org.junit.Assert.assertNotNull(item64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!, 99, 0" + "'", str65, "hi!, 99, 0");
        org.junit.Assert.assertNotNull(item68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.name;
        item3.sellIn = (short) 100;
        item3.name = "hi!, 1, 0, 98, 99, 32, -2";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        java.lang.String str82 = item80.toString();
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
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!, 97, 0" + "'", str82, "hi!, 97, 0");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        item3.quality = 0;
        item3.quality = (byte) 0;
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        int int11 = item3.quality;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 100, 1" + "'", str8, "hi!, 100, 1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49", 35, (-1));
        item3.name = ", 1, 99";
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        java.lang.String str8 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 1, 99, 35, -1" + "'", str8, ", 1, 99, 35, -1");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 8, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance(", 99, -1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 52");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory15 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory15.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory24 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory24.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory24.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory29 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater31 = itemUpdaterFactory29.getInstance("");
        com.gildedrose.Item item35 = new com.gildedrose.Item("hi!", 100, 1);
        int int36 = item35.sellIn;
        com.gildedrose.Item item37 = itemUpdater31.update(item35);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory38 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater40 = itemUpdaterFactory38.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory41 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater43 = itemUpdaterFactory41.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater45 = itemUpdaterFactory41.getInstance("");
        com.gildedrose.Item item49 = new com.gildedrose.Item("hi!", 100, 1);
        int int50 = item49.sellIn;
        com.gildedrose.Item item51 = itemUpdater45.update(item49);
        com.gildedrose.Item item52 = itemUpdater40.update(item51);
        com.gildedrose.Item item53 = itemUpdater31.update(item52);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater54 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item58 = new com.gildedrose.Item("hi!", 100, 1);
        int int59 = item58.sellIn;
        com.gildedrose.Item item60 = conjuredItemUpdater54.update(item58);
        com.gildedrose.Item item61 = itemUpdater31.update(item58);
        com.gildedrose.Item item65 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        com.gildedrose.Item item66 = itemUpdater31.update(item65);
        com.gildedrose.Item item67 = itemUpdater28.update(item65);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory68 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater70 = itemUpdaterFactory68.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater72 = itemUpdaterFactory68.getInstance("");
        com.gildedrose.Item item76 = new com.gildedrose.Item("hi!", 100, 1);
        int int77 = item76.sellIn;
        com.gildedrose.Item item78 = itemUpdater72.update(item76);
        java.lang.String str79 = item76.toString();
        java.lang.String str80 = item76.name;
        com.gildedrose.Item item81 = itemUpdater28.update(item76);
        com.gildedrose.Item item82 = itemUpdater23.update(item76);
        item82.name = "hi!, 51, 0";
        com.gildedrose.Item item85 = itemUpdater14.update(item82);
        item85.quality = 99;
        item85.quality = 100;
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
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(itemUpdater40);
        org.junit.Assert.assertNotNull(itemUpdater43);
        org.junit.Assert.assertNotNull(itemUpdater45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertNotNull(item51);
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertNotNull(item60);
        org.junit.Assert.assertNotNull(item61);
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertNotNull(item67);
        org.junit.Assert.assertNotNull(itemUpdater70);
        org.junit.Assert.assertNotNull(itemUpdater72);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 100 + "'", int77 == 100);
        org.junit.Assert.assertNotNull(item78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!, 99, 0" + "'", str79, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(item81);
        org.junit.Assert.assertNotNull(item82);
        org.junit.Assert.assertNotNull(item85);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (-2), (int) (short) -1);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        item3.name = "hi!, 52, 1";
        item3.quality = ' ';
        item3.sellIn = 0;
        item3.quality = 32;
        item3.sellIn = 0;
        java.lang.String str14 = item3.name;
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 52, 1" + "'", str14, "hi!, 52, 1");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        java.lang.String str4 = item3.toString();
        item3.quality = '4';
        item3.name = "hi!, 0, 0, 52, 1, 1, 100";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 1, 32" + "'", str4, ", 1, 32");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        int int71 = item70.quality;
        item70.quality = (byte) 0;
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
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        int int11 = item8.sellIn;
        int int12 = item8.quality;
        item8.sellIn = (byte) -1;
        java.lang.String str15 = item8.toString();
        item8.quality = 50;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, -1, 0" + "'", str15, "hi!, -1, 0");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        item72.sellIn = 8;
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
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        item26.name = "hi!, 100, 1, 51, 34, -2, 99";
        item26.sellIn = 97;
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
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 10, 10");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory13 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory13.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory13.getInstance("hi!, 100, 1, 98, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory26 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory26.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory26.getInstance(", 10, 10");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory31 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory31.getInstance("");
        com.gildedrose.Item item37 = new com.gildedrose.Item("hi!", 100, 1);
        int int38 = item37.sellIn;
        com.gildedrose.Item item39 = itemUpdater33.update(item37);
        int int40 = item37.sellIn;
        java.lang.String str41 = item37.toString();
        int int42 = item37.sellIn;
        com.gildedrose.Item item43 = itemUpdater30.update(item37);
        com.gildedrose.Item item44 = itemUpdater25.update(item37);
        com.gildedrose.Item item45 = itemUpdater12.update(item44);
        com.gildedrose.Item item49 = new com.gildedrose.Item("hi!, 100, -1, 10, 100", 32, 8);
        item49.quality = (byte) 10;
        com.gildedrose.Item item52 = itemUpdater12.update(item49);
        java.lang.String str53 = item49.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 99 + "'", int40 == 99);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!, 99, 0" + "'", str41, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 99 + "'", int42 == 99);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!, 100, -1, 10, 100" + "'", str53, "hi!, 100, -1, 10, 100");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        int int10 = item6.sellIn;
        int int11 = item6.quality;
        java.lang.String str12 = item6.name;
        item6.quality = (byte) 0;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        java.lang.String str31 = item30.name;
        item30.quality = 96;
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1, 10, 32", 52, 100);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        item49.sellIn = 96;
        java.lang.Class<?> wildcardClass52 = item49.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 0, 52");
        com.gildedrose.Item item18 = new com.gildedrose.Item("hi!", 100, 1);
        item18.sellIn = 99;
        item18.name = "";
        com.gildedrose.Item item23 = itemUpdater14.update(item18);
        item18.sellIn = '#';
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(item23);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        java.lang.String str43 = item39.name;
        java.lang.Class<?> wildcardClass44 = item39.getClass();
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        item67.name = "hi!, 51, 0";
        int int70 = item67.sellIn;
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
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 97 + "'", int70 == 97);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        int int26 = item25.sellIn;
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory14 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        item20.sellIn = (byte) 0;
        java.lang.String str25 = item20.toString();
        com.gildedrose.Item item26 = itemUpdater7.update(item20);
        com.gildedrose.Item item27 = itemUpdater4.update(item26);
        item26.sellIn = 50;
        java.lang.String str30 = item26.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!, 0, 0" + "'", str25, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1", (int) 'a', 50);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        item24.quality = '#';
        java.lang.String str27 = item24.toString();
        item24.sellIn = (short) 0;
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!, 97, 35" + "'", str27, "hi!, 97, 35");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
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
        item22.name = "hi!, 0, 0";
        com.gildedrose.Item item31 = itemUpdater6.update(item22);
        int int32 = item22.quality;
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
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!", 100, 1);
        com.gildedrose.Item item11 = conjuredItemUpdater0.update(item10);
        item10.quality = (-1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertNotNull(item11);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        com.gildedrose.Item item26 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str27 = item26.name;
        java.lang.String str28 = item26.toString();
        java.lang.String str29 = item26.name;
        com.gildedrose.Item item30 = itemUpdater4.update(item26);
        item26.name = "hi!, 0, 0, 52, 1, 1, 100";
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!, 0, 0" + "'", str27, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!, 0, 0, 32, 0" + "'", str28, "hi!, 0, 0, 32, 0");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!, 0, 0" + "'", str29, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item30);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1" + "'", str4, "hi!, 100, 1");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory7.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory7.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory14 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory23 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory23.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory23.getInstance("");
        com.gildedrose.Item item31 = new com.gildedrose.Item("hi!", 100, 1);
        int int32 = item31.sellIn;
        com.gildedrose.Item item33 = itemUpdater27.update(item31);
        java.lang.String str34 = item31.toString();
        item31.sellIn = 10;
        java.lang.String str37 = item31.toString();
        item31.sellIn = 98;
        com.gildedrose.Item item40 = itemUpdater16.update(item31);
        com.gildedrose.Item item41 = itemUpdater13.update(item40);
        com.gildedrose.Item item45 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item45.sellIn = (byte) 100;
        java.lang.String str48 = item45.name;
        item45.name = "hi!, -1, 0";
        item45.name = "hi!";
        java.lang.String str53 = item45.toString();
        com.gildedrose.Item item54 = itemUpdater13.update(item45);
        java.lang.String str55 = item54.name;
        com.gildedrose.Item item56 = itemUpdater6.update(item54);
        int int57 = item54.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!, 99, 0" + "'", str34, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!, 10, 0" + "'", str37, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item40);
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!, 99, 0" + "'", str48, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!, 100, 52" + "'", str53, "hi!, 100, 52");
        org.junit.Assert.assertNotNull(item54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(item56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 49 + "'", int57 == 49);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 52, 1");
        com.gildedrose.Item item16 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str17 = item16.name;
        java.lang.String str18 = item16.name;
        java.lang.String str19 = item16.name;
        item16.name = "hi!, 100, 52";
        item16.sellIn = ' ';
        java.lang.String str24 = item16.toString();
        item16.quality = 35;
        com.gildedrose.Item item27 = itemUpdater12.update(item16);
        java.lang.Class<?> wildcardClass28 = item27.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!, 100, 52, 32, 1" + "'", str24, "hi!, 100, 52, 32, 1");
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        item23.sellIn = (byte) 100;
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
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 51, 50");
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
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        java.lang.String str6 = item3.name;
        item3.name = "hi!, 0, 0, 99, 0";
        int int9 = item3.quality;
        java.lang.String str10 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0" + "'", str4, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 0, 0, 32, 0" + "'", str5, "hi!, 0, 0, 32, 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 0, 0" + "'", str6, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str10, "hi!, 0, 0, 99, 0");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, -1, 0", 8, (int) (short) 100);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        item29.name = ", 96, 0";
        java.lang.String str40 = item29.name;
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ", 96, 0" + "'", str40, ", 96, 0");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        int int21 = item14.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 96 + "'", int19 == 96);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ", 96, 31" + "'", str20, ", 96, 31");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 31 + "'", int21 == 31);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        item65.name = "hi!, 100, 1, 100, 0, 96, 49";
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
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', 1);
        int int4 = item3.sellIn;
        item3.name = "hi!";
        java.lang.String str7 = item3.name;
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        item17.sellIn = (byte) -1;
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
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("", (int) (short) 10, (int) (short) 10);
        com.gildedrose.Item item7 = itemUpdater2.update(item6);
        java.lang.Class<?> wildcardClass8 = item7.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(item7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory68 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater70 = itemUpdaterFactory68.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater72 = itemUpdaterFactory68.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory73 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater75 = itemUpdaterFactory73.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater77 = itemUpdaterFactory73.getInstance("");
        com.gildedrose.Item item81 = new com.gildedrose.Item("hi!", 100, 1);
        int int82 = item81.sellIn;
        com.gildedrose.Item item83 = itemUpdater77.update(item81);
        java.lang.String str84 = item81.toString();
        item81.sellIn = 10;
        java.lang.String str87 = item81.toString();
        item81.sellIn = 1;
        com.gildedrose.Item item90 = itemUpdater72.update(item81);
        int int91 = item90.quality;
        com.gildedrose.Item item92 = itemUpdater8.update(item90);
        int int93 = item92.sellIn;
        int int94 = item92.quality;
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
        org.junit.Assert.assertNotNull(itemUpdater70);
        org.junit.Assert.assertNotNull(itemUpdater72);
        org.junit.Assert.assertNotNull(itemUpdater75);
        org.junit.Assert.assertNotNull(itemUpdater77);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 100 + "'", int82 == 100);
        org.junit.Assert.assertNotNull(item83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!, 99, 0" + "'", str84, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!, 10, 0" + "'", str87, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(item92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (-1), 52);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str15 = item14.name;
        java.lang.String str16 = item14.name;
        int int17 = item14.quality;
        item14.sellIn = 10;
        item14.name = "hi!, 10, 0";
        java.lang.String str22 = item14.toString();
        com.gildedrose.Item item23 = itemUpdater10.update(item14);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, 10, 0, 10, 1" + "'", str22, "hi!, 10, 0, 10, 1");
        org.junit.Assert.assertNotNull(item23);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.Item item17 = new com.gildedrose.Item("hi!", 100, 1);
        int int18 = item17.sellIn;
        com.gildedrose.Item item19 = itemUpdater13.update(item17);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory20 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.Item item26 = new com.gildedrose.Item("hi!", 100, 1);
        int int27 = item26.sellIn;
        com.gildedrose.Item item28 = itemUpdater22.update(item26);
        item26.sellIn = (byte) 0;
        java.lang.String str31 = item26.toString();
        com.gildedrose.Item item32 = itemUpdater13.update(item26);
        item32.quality = '4';
        java.lang.String str35 = item32.name;
        com.gildedrose.Item item36 = itemUpdater10.update(item32);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory37 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater39 = itemUpdaterFactory37.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater41 = itemUpdaterFactory37.getInstance("");
        com.gildedrose.Item item45 = new com.gildedrose.Item("hi!", 100, 1);
        int int46 = item45.sellIn;
        com.gildedrose.Item item47 = itemUpdater41.update(item45);
        java.lang.String str48 = item45.toString();
        item45.sellIn = 10;
        java.lang.String str51 = item45.toString();
        item45.sellIn = 1;
        item45.quality = 99;
        item45.name = "hi!";
        com.gildedrose.Item item58 = itemUpdater10.update(item45);
        java.lang.String str59 = item58.name;
        item58.sellIn = 98;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!, 0, 0" + "'", str31, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertNotNull(itemUpdater39);
        org.junit.Assert.assertNotNull(itemUpdater41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!, 99, 0" + "'", str48, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!, 10, 0" + "'", str51, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        int int19 = item8.sellIn;
        java.lang.String str20 = item8.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 1, 99" + "'", str20, "hi!, 1, 99");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", 98, (int) '#');
        item3.name = "hi!, 100, 1, 10, 0, 52, 1";
        int int6 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        int int14 = item8.sellIn;
        item8.sellIn = 31;
        int int17 = item8.sellIn;
        java.lang.Class<?> wildcardClass18 = item8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 1, (int) ' ');
        item3.quality = 99;
        item3.quality = 32;
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory5 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory5.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory14 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        item20.sellIn = (byte) 0;
        java.lang.String str25 = item20.toString();
        com.gildedrose.Item item26 = itemUpdater7.update(item20);
        com.gildedrose.Item item27 = itemUpdater4.update(item26);
        item26.sellIn = 50;
        item26.name = "hi!, 0, 0, -1, 50";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!, 0, 0" + "'", str25, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertNotNull(item27);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        java.lang.Class<?> wildcardClass26 = item24.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -2, 50", (int) ' ', (int) (short) -1);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.Item item18 = new com.gildedrose.Item("hi!, 0, 0, 0, 1", 0, (int) (short) 10);
        com.gildedrose.Item item19 = itemUpdater14.update(item18);
        com.gildedrose.Item item23 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49", 10, (int) (byte) -1);
        com.gildedrose.Item item24 = itemUpdater14.update(item23);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(item24);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        item3.sellIn = 99;
        java.lang.String str6 = item3.name;
        int int7 = item3.sellIn;
        item3.quality = 95;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7 == 99);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 97, 0", 1, 50);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        java.lang.Class<?> wildcardClass7 = itemUpdater6.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str13 = item12.name;
        java.lang.String str14 = item12.name;
        com.gildedrose.Item item15 = itemUpdater8.update(item12);
        com.gildedrose.Item item19 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str20 = item19.name;
        java.lang.String str21 = item19.name;
        java.lang.String str22 = item19.toString();
        java.lang.String str23 = item19.toString();
        int int24 = item19.quality;
        item19.name = "";
        java.lang.String str27 = item19.name;
        com.gildedrose.Item item28 = itemUpdater8.update(item19);
        item19.name = "";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 0, 0" + "'", str13, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 0, 0" + "'", str14, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, 100, 1" + "'", str22, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 100, 1" + "'", str23, "hi!, 100, 1");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(item28);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        com.gildedrose.Item item31 = new com.gildedrose.Item("", (int) '4', 1);
        item31.name = "hi!, 0, 0";
        java.lang.String str34 = item31.toString();
        item31.name = "hi!, 99, 0";
        java.lang.String str37 = item31.toString();
        int int38 = item31.quality;
        com.gildedrose.Item item39 = itemUpdater8.update(item31);
        item39.quality = 0;
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str34, "hi!, 0, 0, 52, 1");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!, 99, 0, 52, 1" + "'", str37, "hi!, 99, 0, 52, 1");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(item39);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, -1", 8, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        int int50 = item48.quality;
        item48.quality = 30;
        int int53 = item48.sellIn;
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-3) + "'", int53 == (-3));
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 0, 1", (int) (byte) -1, 1);
        item3.quality = (-4);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0", (int) (short) 0, (int) '4');
        java.lang.String str4 = item3.toString();
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 0, 0, 52" + "'", str4, "hi!, 1, 0, 0, 52");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("", (int) (short) 10, (int) (short) 10);
        com.gildedrose.Item item7 = itemUpdater2.update(item6);
        item7.quality = (short) 100;
        int int10 = item7.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(item7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        com.gildedrose.Item item23 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str24 = item23.name;
        int int25 = item23.quality;
        item23.name = "";
        item23.name = "hi!, 100, 1";
        com.gildedrose.Item item30 = itemUpdater6.update(item23);
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) '4');
        java.lang.String str35 = item34.name;
        int int36 = item34.sellIn;
        item34.sellIn = 0;
        java.lang.String str39 = item34.name;
        com.gildedrose.Item item40 = itemUpdater6.update(item34);
        int int41 = item34.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!, 99, 0" + "'", str35, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!, 99, 0" + "'", str39, "hi!, 99, 0");
        org.junit.Assert.assertNotNull(item40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 98, 0", 31, (int) ' ');
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 99, 0, 98, 0, 31, 32" + "'", str4, "hi!, 99, 0, 98, 0, 31, 32");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        int int83 = item79.quality;
        java.lang.String str84 = item79.toString();
        item79.quality = (-4);
        item79.quality = (short) -1;
        item79.name = "hi!, 100, 1, 32, 100, 1, 49";
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
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!, -3, 0" + "'", str84, "hi!, -3, 0");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        java.lang.String str34 = item33.name;
        int int35 = item33.sellIn;
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ", 1, 32" + "'", str34, ", 1, 32");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 98 + "'", int35 == 98);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory3 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory3.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory3.getInstance("hi!, 51, 0");
        com.gildedrose.Item item13 = new com.gildedrose.Item("hi!, -1, 1", (int) ' ', (int) ' ');
        item13.sellIn = (byte) 10;
        com.gildedrose.Item item16 = itemUpdater9.update(item13);
        com.gildedrose.Item item17 = itemUpdater2.update(item16);
        java.lang.String str18 = item17.toString();
        java.lang.Class<?> wildcardClass19 = item17.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, -1, 1, 8, 30" + "'", str18, "hi!, -1, 1, 8, 30");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1, 10, 32", 49, 97);
        item3.name = "hi!, 100, -1, -2, 49";
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1", (int) ' ', (int) ' ');
        item3.sellIn = (byte) 10;
        int int6 = item3.sellIn;
        int int7 = item3.sellIn;
        int int8 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        item3.quality = 0;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 100, 1, 10, 0" + "'", str7, "hi!, 100, 1, 10, 0");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        java.lang.String str19 = item8.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 1, 0" + "'", str19, "hi!, 1, 0");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 100, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, 9");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1, -2, -1");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory76 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater78 = itemUpdaterFactory76.getInstance("");
        com.gildedrose.Item item82 = new com.gildedrose.Item("hi!", 100, 1);
        int int83 = item82.sellIn;
        com.gildedrose.Item item84 = itemUpdater78.update(item82);
        int int85 = item82.sellIn;
        java.lang.String str86 = item82.toString();
        int int87 = item82.sellIn;
        java.lang.String str88 = item82.toString();
        com.gildedrose.Item item89 = itemUpdater10.update(item82);
        item89.sellIn = 1;
        item89.quality = 0;
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
        org.junit.Assert.assertNotNull(itemUpdater78);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 100 + "'", int83 == 100);
        org.junit.Assert.assertNotNull(item84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 99 + "'", int85 == 99);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!, 99, 0" + "'", str86, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 99 + "'", int87 == 99);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!, 99, 0" + "'", str88, "hi!, 99, 0");
        org.junit.Assert.assertNotNull(item89);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory21 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.Item item27 = new com.gildedrose.Item("hi!", 100, 1);
        int int28 = item27.sellIn;
        com.gildedrose.Item item29 = itemUpdater23.update(item27);
        item27.sellIn = (byte) 0;
        com.gildedrose.Item item32 = itemUpdater20.update(item27);
        int int33 = item32.quality;
        java.lang.String str34 = item32.toString();
        int int35 = item32.quality;
        com.gildedrose.Item item36 = itemUpdater10.update(item32);
        java.lang.Class<?> wildcardClass37 = item36.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!, -1, 0" + "'", str34, "hi!, -1, 0");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 52, 1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, -2, 46");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 52, 32");
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
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        java.lang.Class<?> wildcardClass53 = item47.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        java.lang.String str18 = item14.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 0, 0" + "'", str15, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 0, 0" + "'", str16, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 0, 0, -1, 0" + "'", str18, "hi!, 0, 0, -1, 0");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 99");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 50, 49");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 98, 0, 52, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, -1", (int) (byte) 10, 31);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, -1" + "'", str4, "hi!, -1, -1");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        java.lang.String str18 = item16.toString();
        java.lang.String str19 = item16.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 0, 0, 99, 0, 50, 49" + "'", str17, "hi!, 0, 0, 99, 0, 50, 49");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 0, 0, 99, 0, 50, 49" + "'", str18, "hi!, 0, 0, 99, 0, 50, 49");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 0, 0, 99, 0, 50, 49" + "'", str19, "hi!, 0, 0, 99, 0, 50, 49");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        int int6 = item3.quality;
        item3.quality = (short) 0;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        item11.sellIn = 52;
        java.lang.String str20 = item11.name;
        java.lang.String str21 = item11.toString();
        java.lang.String str22 = item11.name;
        int int23 = item11.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 0, 0, 52, 0" + "'", str21, "hi!, 0, 0, 52, 0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, 0, 0" + "'", str22, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        item65.quality = (-1);
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
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.toString();
        java.lang.String str7 = item3.toString();
        int int8 = item3.quality;
        item3.name = ", 96, 31";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 100, 1" + "'", str6, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 100, 1" + "'", str7, "hi!, 100, 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 32, 100", (-2), 98);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 32, 100" + "'", str4, "hi!, 100, 1, 32, 100");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 98");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, 1, 49");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 10, 50");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        com.gildedrose.Item item23 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str24 = item23.name;
        int int25 = item23.quality;
        item23.name = "";
        item23.name = "hi!, 100, 1";
        com.gildedrose.Item item30 = itemUpdater6.update(item23);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory31 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory31.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory31.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater37 = itemUpdaterFactory31.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater39 = itemUpdaterFactory31.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory40 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory40.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater44 = itemUpdaterFactory40.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater46 = itemUpdaterFactory40.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater48 = itemUpdaterFactory40.getInstance("hi!, 100, 52");
        com.gildedrose.Item item52 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        item52.quality = '4';
        com.gildedrose.Item item55 = itemUpdater48.update(item52);
        com.gildedrose.Item item56 = itemUpdater39.update(item55);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory57 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater59 = itemUpdaterFactory57.getInstance("");
        com.gildedrose.Item item63 = new com.gildedrose.Item("hi!", 100, 1);
        int int64 = item63.sellIn;
        com.gildedrose.Item item65 = itemUpdater59.update(item63);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory66 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater68 = itemUpdaterFactory66.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory69 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater71 = itemUpdaterFactory69.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater73 = itemUpdaterFactory69.getInstance("");
        com.gildedrose.Item item77 = new com.gildedrose.Item("hi!", 100, 1);
        int int78 = item77.sellIn;
        com.gildedrose.Item item79 = itemUpdater73.update(item77);
        com.gildedrose.Item item80 = itemUpdater68.update(item79);
        com.gildedrose.Item item81 = itemUpdater59.update(item80);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater82 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item86 = new com.gildedrose.Item("hi!", 100, 1);
        int int87 = item86.sellIn;
        com.gildedrose.Item item88 = conjuredItemUpdater82.update(item86);
        com.gildedrose.Item item89 = itemUpdater59.update(item86);
        int int90 = item86.quality;
        item86.sellIn = 99;
        java.lang.String str93 = item86.toString();
        int int94 = item86.quality;
        com.gildedrose.Item item95 = itemUpdater39.update(item86);
        com.gildedrose.Item item96 = itemUpdater6.update(item86);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertNotNull(itemUpdater37);
        org.junit.Assert.assertNotNull(itemUpdater39);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertNotNull(itemUpdater44);
        org.junit.Assert.assertNotNull(itemUpdater46);
        org.junit.Assert.assertNotNull(itemUpdater48);
        org.junit.Assert.assertNotNull(item55);
        org.junit.Assert.assertNotNull(item56);
        org.junit.Assert.assertNotNull(itemUpdater59);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 100 + "'", int64 == 100);
        org.junit.Assert.assertNotNull(item65);
        org.junit.Assert.assertNotNull(itemUpdater68);
        org.junit.Assert.assertNotNull(itemUpdater71);
        org.junit.Assert.assertNotNull(itemUpdater73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        org.junit.Assert.assertNotNull(item79);
        org.junit.Assert.assertNotNull(item80);
        org.junit.Assert.assertNotNull(item81);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 100 + "'", int87 == 100);
        org.junit.Assert.assertNotNull(item88);
        org.junit.Assert.assertNotNull(item89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi!, 99, 0" + "'", str93, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNotNull(item95);
        org.junit.Assert.assertNotNull(item96);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        item76.quality = '#';
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
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!, -1, 1", (int) ' ', (int) ' ');
        item10.sellIn = (byte) 10;
        com.gildedrose.Item item13 = itemUpdater6.update(item10);
        java.lang.String str14 = item13.toString();
        item13.quality = (short) 1;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, -1, 1, 9, 31" + "'", str14, "hi!, -1, 1, 9, 31");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        int int31 = item30.sellIn;
        java.lang.Class<?> wildcardClass32 = item30.getClass();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 51 + "'", int31 == 51);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 52");
        java.lang.Class<?> wildcardClass11 = itemUpdater10.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        com.gildedrose.Item item23 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str24 = item23.name;
        int int25 = item23.quality;
        item23.name = "";
        item23.name = "hi!, 100, 1";
        com.gildedrose.Item item30 = itemUpdater6.update(item23);
        java.lang.String str31 = item30.name;
        java.lang.String str32 = item30.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!, 100, 1" + "'", str31, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!, 100, 1" + "'", str32, "hi!, 100, 1");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 52", (int) ' ', (int) '4');
        item3.sellIn = 96;
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 100, 52" + "'", str6, "hi!, 100, 52");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 100, 52, 96, 52" + "'", str7, "hi!, 100, 52, 96, 52");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        item13.name = "hi!, 100, 10";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, -1, 0" + "'", str19, "hi!, -1, 0");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        com.gildedrose.Item item19 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item19.sellIn = (byte) 100;
        java.lang.String str22 = item19.name;
        item19.name = "hi!, -1, 0";
        com.gildedrose.Item item25 = conjuredItemUpdater0.update(item19);
        item25.sellIn = 52;
        int int28 = item25.sellIn;
        item25.sellIn = (short) 1;
        item25.quality = (byte) 0;
        java.lang.String str33 = item25.name;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1" + "'", str14, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, 99, 0" + "'", str22, "hi!, 99, 0");
        org.junit.Assert.assertNotNull(item25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!, -1, 0" + "'", str33, "hi!, -1, 0");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 97, 50", (int) (short) 100, 10);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0, 97, 50, 100, 10" + "'", str4, "hi!, 0, 0, 97, 50, 100, 10");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.Item item17 = new com.gildedrose.Item("hi!", 100, 1);
        int int18 = item17.sellIn;
        com.gildedrose.Item item19 = itemUpdater13.update(item17);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory20 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.Item item26 = new com.gildedrose.Item("hi!", 100, 1);
        int int27 = item26.sellIn;
        com.gildedrose.Item item28 = itemUpdater22.update(item26);
        item26.sellIn = (byte) 0;
        java.lang.String str31 = item26.toString();
        com.gildedrose.Item item32 = itemUpdater13.update(item26);
        item32.quality = '4';
        com.gildedrose.Item item35 = itemUpdater10.update(item32);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory36 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory36.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater40 = itemUpdaterFactory36.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory36.getInstance("hi!, 99, 0");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater43 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item47 = new com.gildedrose.Item("hi!", 100, 1);
        int int48 = item47.sellIn;
        com.gildedrose.Item item49 = conjuredItemUpdater43.update(item47);
        item47.name = "hi!, 0, 0";
        int int52 = item47.quality;
        com.gildedrose.Item item53 = itemUpdater42.update(item47);
        com.gildedrose.Item item54 = itemUpdater10.update(item47);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory55 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater57 = itemUpdaterFactory55.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater59 = itemUpdaterFactory55.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater61 = itemUpdaterFactory55.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater63 = itemUpdaterFactory55.getInstance(", 100, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory64 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater66 = itemUpdaterFactory64.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater68 = itemUpdaterFactory64.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater70 = itemUpdaterFactory64.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater72 = itemUpdaterFactory64.getInstance("hi!, 100, 52");
        com.gildedrose.Item item76 = new com.gildedrose.Item("hi!, 100, 1", (int) '4', (int) '#');
        com.gildedrose.Item item77 = itemUpdater72.update(item76);
        item77.name = "hi!, 10, 0, 10, 1, 1, -1";
        item77.name = "hi!, -1, 0";
        com.gildedrose.Item item82 = itemUpdater63.update(item77);
        com.gildedrose.Item item83 = itemUpdater10.update(item82);
        java.lang.Class<?> wildcardClass84 = item82.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!, 0, 0" + "'", str31, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertNotNull(itemUpdater40);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertNotNull(item49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertNotNull(item54);
        org.junit.Assert.assertNotNull(itemUpdater57);
        org.junit.Assert.assertNotNull(itemUpdater59);
        org.junit.Assert.assertNotNull(itemUpdater61);
        org.junit.Assert.assertNotNull(itemUpdater63);
        org.junit.Assert.assertNotNull(itemUpdater66);
        org.junit.Assert.assertNotNull(itemUpdater68);
        org.junit.Assert.assertNotNull(itemUpdater70);
        org.junit.Assert.assertNotNull(itemUpdater72);
        org.junit.Assert.assertNotNull(item77);
        org.junit.Assert.assertNotNull(item82);
        org.junit.Assert.assertNotNull(item83);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 32, -1", (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        item23.quality = 52;
        item23.sellIn = (-2);
        item23.name = "hi!, 1, 0, 0, 52";
        int int33 = item23.quality;
        java.lang.String str34 = item23.toString();
        java.lang.String str35 = item23.toString();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!, 1, 0, 0, 52, -2, 52" + "'", str34, "hi!, 1, 0, 0, 52, -2, 52");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!, 1, 0, 0, 52, -2, 52" + "'", str35, "hi!, 1, 0, 0, 52, -2, 52");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 52", (int) (byte) 1, 31);
        item3.sellIn = (short) -1;
        item3.sellIn = 97;
        item3.quality = (short) -1;
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", 31, 48);
        item3.sellIn = (byte) 0;
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        int int11 = item8.sellIn;
        int int12 = item8.quality;
        int int13 = item8.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -3, 49", 9, (-2));
        int int4 = item3.quality;
        item3.name = "hi!, 10, 0, 10, 1, 1, -1";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        int int11 = item8.quality;
        item8.name = "hi!, -1, 1, 9, 31";
        int int14 = item8.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        int int27 = item22.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 99, 0" + "'", str16, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 10, 0" + "'", str19, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 51, 50");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance(", -1, 48");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        java.lang.String str37 = item29.name;
        item29.sellIn = 96;
        java.lang.String str40 = item29.name;
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!, 0, 0" + "'", str37, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!, 0, 0" + "'", str40, "hi!, 0, 0");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -3, 0", 9, 9);
        item3.quality = 51;
        int int6 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        int int10 = item6.sellIn;
        item6.sellIn = (short) 10;
        java.lang.String str13 = item6.toString();
        item6.sellIn = 0;
        java.lang.String str16 = item6.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 10, 0" + "'", str13, "hi!, 10, 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 0, 0" + "'", str16, "hi!, 0, 0");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 10, 10");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 51, 34");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 98, 0, 31, 32");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -1, -1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory13 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory13.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory13.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory13.getInstance("hi!, 10, 0, 10, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory24 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory24.getInstance("");
        com.gildedrose.Item item30 = new com.gildedrose.Item("hi!", 100, 1);
        int int31 = item30.sellIn;
        com.gildedrose.Item item32 = itemUpdater26.update(item30);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory33 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory33.getInstance("");
        com.gildedrose.Item item39 = new com.gildedrose.Item("hi!", 100, 1);
        int int40 = item39.sellIn;
        com.gildedrose.Item item41 = itemUpdater35.update(item39);
        item39.sellIn = (byte) 0;
        java.lang.String str44 = item39.toString();
        com.gildedrose.Item item45 = itemUpdater26.update(item39);
        item39.sellIn = (byte) -1;
        java.lang.String str48 = item39.name;
        int int49 = item39.quality;
        com.gildedrose.Item item50 = itemUpdater23.update(item39);
        com.gildedrose.Item item51 = itemUpdater12.update(item39);
        java.lang.Class<?> wildcardClass52 = item51.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!, 0, 0" + "'", str44, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(item50);
        org.junit.Assert.assertNotNull(item51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 100, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance(", 0, 50");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item8.sellIn = 52;
        int int11 = item8.quality;
        com.gildedrose.Item item12 = itemUpdater4.update(item8);
        item12.name = ", -1, 48";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(item12);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        int int24 = item17.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1, 98, 0", 0, (-1));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.Item item17 = new com.gildedrose.Item("hi!", 100, 1);
        int int18 = item17.sellIn;
        com.gildedrose.Item item19 = itemUpdater13.update(item17);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory20 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.Item item26 = new com.gildedrose.Item("hi!", 100, 1);
        int int27 = item26.sellIn;
        com.gildedrose.Item item28 = itemUpdater22.update(item26);
        item26.sellIn = (byte) 0;
        java.lang.String str31 = item26.toString();
        com.gildedrose.Item item32 = itemUpdater13.update(item26);
        item32.quality = '4';
        java.lang.String str35 = item32.name;
        com.gildedrose.Item item36 = itemUpdater10.update(item32);
        java.lang.String str37 = item32.toString();
        java.lang.Class<?> wildcardClass38 = item32.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!, 0, 0" + "'", str31, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!, -2, 50" + "'", str37, "hi!, -2, 50");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        item22.name = "hi!, 0, 0, 51, 0";
        item22.sellIn = (byte) 10;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(item22);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater71 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item75 = new com.gildedrose.Item("hi!", 100, 1);
        int int76 = item75.sellIn;
        com.gildedrose.Item item77 = conjuredItemUpdater71.update(item75);
        com.gildedrose.Item item81 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str82 = item81.name;
        java.lang.String str83 = item81.name;
        int int84 = item81.quality;
        java.lang.String str85 = item81.toString();
        com.gildedrose.Item item86 = conjuredItemUpdater71.update(item81);
        com.gildedrose.Item item87 = itemUpdater8.update(item86);
        java.lang.String str88 = item87.toString();
        item87.sellIn = 99;
        java.lang.String str91 = item87.toString();
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
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 100 + "'", int76 == 100);
        org.junit.Assert.assertNotNull(item77);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!, 100, 1" + "'", str85, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item86);
        org.junit.Assert.assertNotNull(item87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!, 98, 0" + "'", str88, "hi!, 98, 0");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "hi!, 99, 0" + "'", str91, "hi!, 99, 0");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        com.gildedrose.Item item51 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str52 = item51.name;
        java.lang.String str53 = item51.name;
        int int54 = item51.quality;
        item51.sellIn = 10;
        com.gildedrose.Item item57 = itemUpdater6.update(item51);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater58 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item62 = new com.gildedrose.Item("hi!", 100, 1);
        int int63 = item62.sellIn;
        com.gildedrose.Item item64 = conjuredItemUpdater58.update(item62);
        item62.name = "hi!, 0, 0";
        int int67 = item62.quality;
        item62.quality = (short) -1;
        item62.name = "hi!";
        item62.name = "hi!, 0, 0, 0, 1";
        java.lang.String str74 = item62.toString();
        com.gildedrose.Item item75 = itemUpdater6.update(item62);
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 100 + "'", int63 == 100);
        org.junit.Assert.assertNotNull(item64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!, 0, 0, 0, 1, 99, -1" + "'", str74, "hi!, 0, 0, 0, 1, 99, -1");
        org.junit.Assert.assertNotNull(item75);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 10, 10, 99, 0", (int) '#', (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 10, 10");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 51, 34");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str9 = item8.name;
        java.lang.String str10 = item8.toString();
        com.gildedrose.Item item11 = itemUpdater4.update(item8);
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str16 = item15.name;
        java.lang.String str17 = item15.toString();
        com.gildedrose.Item item18 = itemUpdater4.update(item15);
        java.lang.Class<?> wildcardClass19 = itemUpdater4.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 0, 0" + "'", str9, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str10, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 0, 0" + "'", str16, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str17, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item14 = new com.gildedrose.Item("", (int) '4', 1);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        int int16 = item15.sellIn;
        int int17 = item15.sellIn;
        item15.name = "hi!, 98, 0, 97, 35";
        java.lang.String str20 = item15.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51 + "'", int17 == 51);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 98, 0, 97, 35, 51, 0" + "'", str20, "hi!, 98, 0, 97, 35, 51, 0");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        java.lang.String str31 = item30.name;
        java.lang.String str32 = item30.toString();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!, 51, 0" + "'", str32, "hi!, 51, 0");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        int int78 = item73.sellIn;
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
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-3) + "'", int78 == (-3));
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        int int22 = item20.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 49 + "'", int22 == 49);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item6.sellIn = 1;
        item6.sellIn = 32;
        item6.sellIn = (byte) 10;
        item6.sellIn = 32;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0", (int) (short) 0, (int) '4');
        java.lang.String str4 = item3.toString();
        java.lang.String str5 = item3.toString();
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 0, 0, 52" + "'", str4, "hi!, 1, 0, 0, 52");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 1, 0, 0, 52" + "'", str5, "hi!, 1, 0, 0, 52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 1, 0" + "'", str6, "hi!, 1, 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 0, 0, 52" + "'", str7, "hi!, 1, 0, 0, 52");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        com.gildedrose.Item item58 = new com.gildedrose.Item("hi!, 99, 0", 32, (int) (byte) 0);
        item58.sellIn = 51;
        int int61 = item58.sellIn;
        com.gildedrose.Item item62 = conjuredItemUpdater0.update(item58);
        item62.name = "hi!, 0, 0, 99, 0, 48, 47";
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
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 51 + "'", int61 == 51);
        org.junit.Assert.assertNotNull(item62);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        java.lang.String str18 = item15.toString();
        item15.sellIn = 10;
        java.lang.String str21 = item15.toString();
        item15.sellIn = 1;
        item15.quality = 99;
        com.gildedrose.Item item26 = itemUpdater6.update(item15);
        int int27 = item15.quality;
        java.lang.String str28 = item15.name;
        java.lang.String str29 = item15.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 99, 0" + "'", str18, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 10, 0" + "'", str21, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 50 + "'", int27 == 50);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!, 0, 50" + "'", str29, "hi!, 0, 50");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 32");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 97, 0");
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!", (int) '4', (int) (byte) 1);
        int int11 = item10.quality;
        item10.sellIn = 31;
        com.gildedrose.Item item14 = itemUpdater6.update(item10);
        item14.quality = '4';
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(item14);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 52, 1", 0, 98);
        java.lang.String str4 = item3.name;
        item3.sellIn = (short) 1;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 99, 0, 52, 1" + "'", str4, "hi!, 99, 0, 52, 1");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        int int43 = item42.quality;
        java.lang.String str44 = item42.toString();
        item42.quality = 96;
        int int47 = item42.sellIn;
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!, 98, 0" + "'", str44, "hi!, 98, 0");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 98 + "'", int47 == 98);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        item24.sellIn = (short) -1;
        int int28 = item24.sellIn;
        java.lang.String str29 = item24.name;
        item24.sellIn = 30;
        java.lang.String str32 = item24.name;
        java.lang.String str33 = item24.name;
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str29, "hi!, 0, 0, 99, 0");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str32, "hi!, 0, 0, 99, 0");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str33, "hi!, 0, 0, 99, 0");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        int int7 = item4.quality;
        java.lang.String str8 = item4.toString();
        item4.quality = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 99, 0" + "'", str8, "hi!, 99, 0");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 97, 50", 50, (int) '#');
        item3.quality = 9;
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        item29.sellIn = 99;
        java.lang.String str36 = item29.toString();
        int int37 = item29.quality;
        java.lang.String str38 = item29.toString();
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 99, 0" + "'", str36, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!, 99, 0" + "'", str38, "hi!, 99, 0");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        int int11 = item8.sellIn;
        int int12 = item8.quality;
        item8.sellIn = (byte) -1;
        item8.quality = 49;
        item8.quality = (-3);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        item24.name = "hi!, 100, 52, 1, 98";
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
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50, 10, 8", 35, 49);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -1, 0, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1, 52, 100");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 50, 49, -2, 52");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
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
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        item15.sellIn = (byte) -1;
        java.lang.String str24 = item15.name;
        int int25 = item15.quality;
        java.lang.Class<?> wildcardClass26 = item15.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 0, (int) (byte) 10);
        int int4 = item3.quality;
        java.lang.String str5 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 99, 0" + "'", str5, "hi!, 99, 0");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
        java.lang.String str39 = item38.toString();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!, 0, 0, 31, 0" + "'", str39, "hi!, 0, 0, 31, 0");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        java.lang.String str6 = item3.name;
        item3.name = "hi!, -1, 0";
        item3.sellIn = 0;
        item3.name = "hi!, 99, 0, 100, 52, 99, 0";
        java.lang.String str13 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 99, 0" + "'", str6, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 99, 0, 100, 52, 99, 0, 0, 52" + "'", str13, "hi!, 99, 0, 100, 52, 99, 0, 0, 52");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory28 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory28.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater32 = itemUpdaterFactory28.getInstance("");
        com.gildedrose.Item item36 = new com.gildedrose.Item("hi!", 100, 1);
        int int37 = item36.sellIn;
        com.gildedrose.Item item38 = itemUpdater32.update(item36);
        com.gildedrose.Item item39 = itemUpdater27.update(item38);
        int int40 = item39.sellIn;
        int int41 = item39.quality;
        item39.quality = (short) 10;
        java.lang.String str44 = item39.name;
        int int45 = item39.quality;
        com.gildedrose.Item item46 = itemUpdater2.update(item39);
        com.gildedrose.Item item50 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str51 = item50.name;
        int int52 = item50.quality;
        item50.name = "";
        java.lang.String str55 = item50.name;
        com.gildedrose.Item item56 = itemUpdater2.update(item50);
        java.lang.String str57 = item56.name;
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
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertNotNull(itemUpdater32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(item38);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 98 + "'", int40 == 98);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(item46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(item56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        int int10 = item6.sellIn;
        int int11 = item6.quality;
        java.lang.String str12 = item6.toString();
        java.lang.String str13 = item6.toString();
        item6.name = "hi!, 0, 0, 99, 0, 50, 49, -2, 52";
        int int16 = item6.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 99, 0" + "'", str12, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 99, 0" + "'", str13, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        item41.sellIn = (short) 100;
        item41.sellIn = (-3);
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
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        item29.sellIn = 99;
        item29.quality = (byte) 100;
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
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 50, 0", 10, (int) 'a');
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
        java.lang.String str60 = item56.name;
        java.lang.Class<?> wildcardClass61 = item56.getClass();
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
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 35, 0", 97, 97);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) '4');
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 99, 0" + "'", str4, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 99, 0, 52, 52" + "'", str6, "hi!, 99, 0, 52, 52");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance(", 100, 1");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str13 = item12.name;
        java.lang.String str14 = item12.name;
        java.lang.String str15 = item12.name;
        item12.name = "hi!, 100, 52";
        item12.sellIn = ' ';
        int int20 = item12.quality;
        com.gildedrose.Item item21 = itemUpdater8.update(item12);
        item12.quality = 52;
        item12.name = "hi!, 99, 0, 98, 0";
        java.lang.String str26 = item12.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!, 99, 0, 98, 0" + "'", str26, "hi!, 99, 0, 98, 0");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str4 = item3.name;
        item3.quality = 8;
        item3.quality = '#';
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0" + "'", str4, "hi!, 0, 0");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 99", 98, 100);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        item20.quality = (short) 1;
        java.lang.String str25 = item20.toString();
        int int26 = item20.quality;
        java.lang.String str27 = item20.toString();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!, 100, 1, 9, 1" + "'", str25, "hi!, 100, 1, 9, 1");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!, 100, 1, 9, 1" + "'", str27, "hi!, 100, 1, 9, 1");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) (byte) -1, 9);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        java.lang.String str17 = item16.name;
        item16.name = "hi!, -1, -1";
        int int20 = item16.sellIn;
        item16.quality = 1;
        item16.name = "hi!, 98, 8";
        item16.quality = (-1);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str17, "hi!, 0, 0, 99, 0");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', 1);
        item3.name = "hi!, 0, 0";
        java.lang.String str6 = item3.toString();
        item3.name = "hi!, 99, 0";
        java.lang.String str9 = item3.toString();
        int int10 = item3.quality;
        item3.sellIn = 34;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str6, "hi!, 0, 0, 52, 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 99, 0, 52, 1" + "'", str9, "hi!, 99, 0, 52, 1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 32, 100, 1, 49", 30, 46);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 98, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory13 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory13.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory13.getInstance(", 10, 10");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory18 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory18.getInstance("");
        com.gildedrose.Item item24 = new com.gildedrose.Item("hi!", 100, 1);
        int int25 = item24.sellIn;
        com.gildedrose.Item item26 = itemUpdater20.update(item24);
        int int27 = item24.sellIn;
        java.lang.String str28 = item24.toString();
        int int29 = item24.sellIn;
        com.gildedrose.Item item30 = itemUpdater17.update(item24);
        com.gildedrose.Item item31 = itemUpdater12.update(item24);
        int int32 = item31.sellIn;
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!, 99, 0" + "'", str28, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 99 + "'", int29 == 99);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        int int37 = item36.sellIn;
        item36.sellIn = 96;
        java.lang.String str40 = item36.name;
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 98 + "'", int37 == 98);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!, 0, 0" + "'", str40, "hi!, 0, 0");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 100, 0", 96, 49);
        java.lang.String str4 = item3.name;
        item3.name = "hi!, 0, 0, 99, 0, 50, 49";
        java.lang.String str7 = item3.toString();
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 100, 0" + "'", str4, "hi!, 100, 1, 100, 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 0, 0, 99, 0, 50, 49, 96, 49" + "'", str7, "hi!, 0, 0, 99, 0, 50, 49, 96, 49");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        item8.quality = 8;
        java.lang.String str19 = item8.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 98, 8" + "'", str19, "hi!, 98, 8");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        item6.name = ", 1, 32, 99, -1";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        int int10 = item6.sellIn;
        item6.sellIn = (short) 10;
        java.lang.String str13 = item6.toString();
        int int14 = item6.quality;
        item6.quality = 97;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 10, 0" + "'", str13, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        item12.name = "hi!, 0, 0, 0, 1, 1, 0";
        item12.name = "hi!, -1, 1, 8, 30";
        java.lang.String str21 = item12.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 0, 0" + "'", str13, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 0, 0, 31, 0" + "'", str16, "hi!, 0, 0, 31, 0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, -1, 1, 8, 30, 31, 0" + "'", str21, "hi!, -1, 1, 8, 30, 31, 0");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -4, 0", (-3), 51);
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -4, 0" + "'", str4, "hi!, -4, 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        item15.name = "hi!, 0, 0";
        int int24 = item15.sellIn;
        java.lang.Class<?> wildcardClass25 = item15.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.Item item17 = new com.gildedrose.Item("hi!", 100, 1);
        int int18 = item17.sellIn;
        com.gildedrose.Item item19 = itemUpdater13.update(item17);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory20 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.Item item26 = new com.gildedrose.Item("hi!", 100, 1);
        int int27 = item26.sellIn;
        com.gildedrose.Item item28 = itemUpdater22.update(item26);
        item26.sellIn = (byte) 0;
        java.lang.String str31 = item26.toString();
        com.gildedrose.Item item32 = itemUpdater13.update(item26);
        item32.quality = '4';
        java.lang.String str35 = item32.name;
        com.gildedrose.Item item36 = itemUpdater10.update(item32);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory37 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater39 = itemUpdaterFactory37.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater41 = itemUpdaterFactory37.getInstance("");
        com.gildedrose.Item item45 = new com.gildedrose.Item("hi!", 100, 1);
        int int46 = item45.sellIn;
        com.gildedrose.Item item47 = itemUpdater41.update(item45);
        java.lang.String str48 = item45.toString();
        item45.sellIn = 10;
        java.lang.String str51 = item45.toString();
        item45.sellIn = 1;
        item45.quality = 99;
        item45.name = "hi!";
        com.gildedrose.Item item58 = itemUpdater10.update(item45);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory59 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater61 = itemUpdaterFactory59.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater63 = itemUpdaterFactory59.getInstance("");
        com.gildedrose.Item item67 = new com.gildedrose.Item("hi!", 100, 1);
        int int68 = item67.sellIn;
        com.gildedrose.Item item69 = itemUpdater63.update(item67);
        java.lang.String str70 = item69.name;
        com.gildedrose.Item item71 = itemUpdater10.update(item69);
        int int72 = item69.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!, 0, 0" + "'", str31, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertNotNull(itemUpdater39);
        org.junit.Assert.assertNotNull(itemUpdater41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!, 99, 0" + "'", str48, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!, 10, 0" + "'", str51, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item58);
        org.junit.Assert.assertNotNull(itemUpdater61);
        org.junit.Assert.assertNotNull(itemUpdater63);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 100 + "'", int68 == 100);
        org.junit.Assert.assertNotNull(item69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(item71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 98 + "'", int72 == 98);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        java.lang.String str41 = item36.name;
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!, -1, 0" + "'", str41, "hi!, -1, 0");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1, 10, 32", 0, 34);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        com.gildedrose.Item item28 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str29 = item28.name;
        java.lang.String str30 = item28.name;
        java.lang.String str31 = item28.toString();
        java.lang.String str32 = item28.toString();
        int int33 = item28.quality;
        item28.name = "";
        item28.name = "hi!, 0, 0, 52, 1";
        int int38 = item28.quality;
        com.gildedrose.Item item39 = itemUpdater10.update(item28);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater40 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item44 = new com.gildedrose.Item("hi!", 100, 1);
        int int45 = item44.sellIn;
        com.gildedrose.Item item46 = conjuredItemUpdater40.update(item44);
        item44.name = "hi!, 0, 0";
        int int49 = item44.quality;
        item44.name = "";
        int int52 = item44.quality;
        item44.sellIn = 0;
        java.lang.String str55 = item44.name;
        com.gildedrose.Item item56 = itemUpdater10.update(item44);
        int int57 = item56.quality;
        item56.name = ", 99, 97";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 99 + "'", int23 == 99);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!, 100, 1" + "'", str31, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!, 100, 1" + "'", str32, "hi!, 100, 1");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertNotNull(item46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(item56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 32, 100", (-2), 98);
        java.lang.String str4 = item3.toString();
        item3.name = "hi!, 52, 0";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 32, 100, -2, 98" + "'", str4, "hi!, 100, 1, 32, 100, -2, 98");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 98, 0, 97, 35");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 52, 8, 50");
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49", (int) ' ', (int) 'a');
        int int11 = item10.quality;
        com.gildedrose.Item item12 = itemUpdater6.update(item10);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(item12);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        int int32 = item30.quality;
        java.lang.String str33 = item30.toString();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!, -2, 0" + "'", str33, "hi!, -2, 0");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        int int4 = item3.quality;
        item3.quality = 99;
        item3.sellIn = (byte) 0;
        int int9 = item3.sellIn;
        int int10 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        int int10 = item6.sellIn;
        item6.sellIn = (short) 10;
        java.lang.String str13 = item6.toString();
        item6.sellIn = 49;
        item6.sellIn = ' ';
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 10, 0" + "'", str13, "hi!, 10, 0");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, -2, 0", (int) 'a', 30);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1, 9, 31", (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str13 = item12.name;
        java.lang.String str14 = item12.name;
        com.gildedrose.Item item15 = itemUpdater8.update(item12);
        com.gildedrose.Item item19 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str20 = item19.name;
        java.lang.String str21 = item19.name;
        java.lang.String str22 = item19.toString();
        java.lang.String str23 = item19.toString();
        int int24 = item19.quality;
        item19.name = "";
        java.lang.String str27 = item19.name;
        com.gildedrose.Item item28 = itemUpdater8.update(item19);
        int int29 = item19.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 0, 0" + "'", str13, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 0, 0" + "'", str14, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, 100, 1" + "'", str22, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 100, 1" + "'", str23, "hi!, 100, 1");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 99 + "'", int29 == 99);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 100, 52", (int) (byte) 100, (int) (byte) 100);
        int int13 = item12.quality;
        com.gildedrose.Item item14 = itemUpdater8.update(item12);
        item14.quality = 0;
        item14.name = "hi!, 98, 0, 97, 35, 51, 0";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(item14);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 31, 97", 34, (int) '#');
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        int int37 = item34.quality;
        java.lang.String str38 = item34.toString();
        int int39 = item34.sellIn;
        java.lang.String str40 = item34.name;
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!, -1, 0, -2, 0" + "'", str38, "hi!, -1, 0, -2, 0");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-2) + "'", int39 == (-2));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!, -1, 0" + "'", str40, "hi!, -1, 0");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory33 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory33.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater37 = itemUpdaterFactory33.getInstance("");
        com.gildedrose.Item item41 = new com.gildedrose.Item("hi!", 100, 1);
        int int42 = item41.sellIn;
        com.gildedrose.Item item43 = itemUpdater37.update(item41);
        com.gildedrose.Item item44 = itemUpdater32.update(item43);
        com.gildedrose.Item item45 = itemUpdater17.update(item44);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory46 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater48 = itemUpdaterFactory46.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater50 = itemUpdaterFactory46.getInstance("");
        com.gildedrose.Item item54 = new com.gildedrose.Item("hi!", 100, 1);
        int int55 = item54.sellIn;
        com.gildedrose.Item item56 = itemUpdater50.update(item54);
        java.lang.String str57 = item54.toString();
        item54.sellIn = 10;
        java.lang.String str60 = item54.toString();
        int int61 = item54.quality;
        com.gildedrose.Item item62 = itemUpdater17.update(item54);
        com.gildedrose.Item item63 = itemUpdater12.update(item62);
        com.gildedrose.Item item64 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.gildedrose.Item item65 = itemUpdater12.update(item64);
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
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertNotNull(itemUpdater32);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertNotNull(itemUpdater37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertNotNull(itemUpdater48);
        org.junit.Assert.assertNotNull(itemUpdater50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertNotNull(item56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!, 99, 0" + "'", str57, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!, 10, 0" + "'", str60, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(item62);
        org.junit.Assert.assertNotNull(item63);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        com.gildedrose.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.gildedrose.Item item21 = itemUpdater6.update(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(item19);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        item3.quality = 0;
        int int6 = item3.sellIn;
        item3.sellIn = 1;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        int int10 = item6.sellIn;
        item6.name = ", 10, 10";
        item6.quality = 96;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.Item item17 = new com.gildedrose.Item("hi!", 100, 1);
        int int18 = item17.sellIn;
        com.gildedrose.Item item19 = itemUpdater13.update(item17);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory20 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.Item item26 = new com.gildedrose.Item("hi!", 100, 1);
        int int27 = item26.sellIn;
        com.gildedrose.Item item28 = itemUpdater22.update(item26);
        item26.sellIn = (byte) 0;
        java.lang.String str31 = item26.toString();
        com.gildedrose.Item item32 = itemUpdater13.update(item26);
        item32.quality = '4';
        java.lang.String str35 = item32.name;
        com.gildedrose.Item item36 = itemUpdater10.update(item32);
        item32.name = "hi!, 0, 0, 32, 0";
        int int39 = item32.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!, 0, 0" + "'", str31, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 50 + "'", int39 == 50);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        java.lang.String str6 = item3.name;
        item3.name = "hi!, 0, 0, 99, 0";
        item3.sellIn = 31;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0" + "'", str4, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 0, 0, 32, 0" + "'", str5, "hi!, 0, 0, 32, 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 0, 0" + "'", str6, "hi!, 0, 0");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 99, 0" + "'", str6, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 99, 0" + "'", str7, "hi!, 99, 0");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        com.gildedrose.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.gildedrose.Item item31 = itemUpdater10.update(item30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 52, 1", 0, 98);
        java.lang.String str4 = item3.name;
        item3.sellIn = ' ';
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 99, 0, 52, 1" + "'", str4, "hi!, 99, 0, 52, 1");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, -1", (-2), 49);
        int int4 = item3.quality;
        item3.quality = 97;
        int int7 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        int int14 = item8.sellIn;
        item8.name = "hi!, 10, 0";
        java.lang.String str17 = item8.name;
        int int18 = item8.quality;
        java.lang.Class<?> wildcardClass19 = item8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 10, 0" + "'", str17, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
        item15.name = ", 0, 50, 1, 100";
        java.lang.String str20 = item15.name;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1" + "'", str14, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ", 0, 50, 1, 100" + "'", str20, ", 0, 50, 1, 100");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        int int16 = item10.sellIn;
        item10.quality = 0;
        int int19 = item10.sellIn;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1" + "'", str14, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        int int6 = item3.quality;
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.name;
        item3.quality = (short) 0;
        item3.sellIn = 52;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 100, 1" + "'", str7, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 0, 52", 0, (int) ' ');
        int int4 = item3.sellIn;
        item3.quality = (short) -1;
        int int7 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 32");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 97, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -3, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, -3");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 1, (int) ' ');
        item3.quality = 99;
        item3.name = "hi!, 0, 0, 51, 0";
        item3.quality = ' ';
        int int10 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
        item16.sellIn = 31;
        java.lang.String str22 = item16.toString();
        java.lang.Class<?> wildcardClass23 = item16.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 0, 0, 99, 0, 50, 49" + "'", str17, "hi!, 0, 0, 99, 0, 50, 49");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, 52, 1, 31, 49" + "'", str22, "hi!, 52, 1, 31, 49");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 98, 0", (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', 1);
        item3.name = "hi!, 0, 0";
        int int6 = item3.sellIn;
        item3.name = "";
        int int9 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 98, 8", 34, 35);
        item3.sellIn = (-2);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        int int17 = item14.sellIn;
        java.lang.String str18 = item14.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51 + "'", int17 == 51);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 51, 0" + "'", str18, "hi!, 51, 0");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        int int23 = item15.sellIn;
        java.lang.String str24 = item15.toString();
        item15.quality = 0;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, -1, 0" + "'", str22, "hi!, -1, 0");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!, -1, 0" + "'", str24, "hi!, -1, 0");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 52, 0", 35, 100);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 51, 0, 97, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        java.lang.String str24 = item17.toString();
        int int25 = item17.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!, 31, 0" + "'", str24, "hi!, 31, 0");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 31 + "'", int25 == 31);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory21 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.Item item27 = new com.gildedrose.Item("hi!", 100, 1);
        int int28 = item27.sellIn;
        com.gildedrose.Item item29 = itemUpdater23.update(item27);
        item27.sellIn = (byte) 0;
        com.gildedrose.Item item32 = itemUpdater20.update(item27);
        int int33 = item32.quality;
        java.lang.String str34 = item32.toString();
        int int35 = item32.quality;
        com.gildedrose.Item item36 = itemUpdater10.update(item32);
        int int37 = item36.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!, -1, 0" + "'", str34, "hi!, -1, 0");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", 51, 97);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, 0" + "'", str4, "hi!, 10, 0");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory7.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory7.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item19 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item20 = itemUpdater15.update(item19);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory21 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory26 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory26.getInstance("");
        com.gildedrose.Item item32 = new com.gildedrose.Item("hi!", 100, 1);
        int int33 = item32.sellIn;
        com.gildedrose.Item item34 = itemUpdater28.update(item32);
        item32.sellIn = (byte) 0;
        com.gildedrose.Item item37 = itemUpdater25.update(item32);
        com.gildedrose.Item item38 = itemUpdater15.update(item37);
        com.gildedrose.Item item39 = itemUpdater6.update(item37);
        item39.sellIn = 51;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(item38);
        org.junit.Assert.assertNotNull(item39);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 10, 10");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory13 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory13.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory13.getInstance("hi!, 100, 1, 98, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory26 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory26.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory26.getInstance(", 10, 10");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory31 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory31.getInstance("");
        com.gildedrose.Item item37 = new com.gildedrose.Item("hi!", 100, 1);
        int int38 = item37.sellIn;
        com.gildedrose.Item item39 = itemUpdater33.update(item37);
        int int40 = item37.sellIn;
        java.lang.String str41 = item37.toString();
        int int42 = item37.sellIn;
        com.gildedrose.Item item43 = itemUpdater30.update(item37);
        com.gildedrose.Item item44 = itemUpdater25.update(item37);
        com.gildedrose.Item item45 = itemUpdater12.update(item44);
        java.lang.Class<?> wildcardClass46 = item44.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 99 + "'", int40 == 99);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!, 99, 0" + "'", str41, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 99 + "'", int42 == 99);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 50");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 100, 0");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, -3, 0, 52, -1");
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
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 97", 97, (int) (byte) 10);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -1, 52");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 97");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.name;
        item3.name = "hi!, 100, 52";
        item3.sellIn = ' ';
        item3.quality = (byte) -1;
        int int13 = item3.sellIn;
        int int14 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 31, (int) (short) 100);
        item3.name = "hi!, 0, 0, 52, 1";
        item3.sellIn = (byte) 1;
        java.lang.String str8 = item3.toString();
        int int9 = item3.quality;
        item3.name = "hi!, 100, 1, 32, 100";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 0, 0, 52, 1, 1, 100" + "'", str8, "hi!, 0, 0, 52, 1, 1, 100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 10, 0, 52, 1");
        com.gildedrose.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.gildedrose.Item item6 = itemUpdater4.update(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        java.lang.String str14 = item8.toString();
        java.lang.String str15 = item8.name;
        item8.quality = 31;
        item8.name = "hi!, 100, 1, 98, 0";
        int int20 = item8.quality;
        java.lang.Class<?> wildcardClass21 = item8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 31 + "'", int20 == 31);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 98, 0, 52, 1", 96, 31);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) ' ', (int) ' ');
        int int4 = item3.quality;
        item3.sellIn = (-3);
        item3.quality = (short) 10;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 50");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance(", 1, 32");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 51, 34, -2, 99");
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
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        int int11 = item8.sellIn;
        java.lang.String str12 = item8.name;
        int int13 = item8.sellIn;
        item8.sellIn = 0;
        int int16 = item8.quality;
        int int17 = item8.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        int int10 = item6.sellIn;
        item6.name = "hi!, 1, 0";
        item6.name = "hi!, -1, 52, 1, 31";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        int int10 = item6.sellIn;
        item6.sellIn = (short) 10;
        java.lang.String str13 = item6.toString();
        item6.quality = 32;
        java.lang.String str16 = item6.name;
        int int17 = item6.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 10, 0" + "'", str13, "hi!, 10, 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, -2, -1");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory33 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory33.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater37 = itemUpdaterFactory33.getInstance("");
        com.gildedrose.Item item41 = new com.gildedrose.Item("hi!", 100, 1);
        int int42 = item41.sellIn;
        com.gildedrose.Item item43 = itemUpdater37.update(item41);
        com.gildedrose.Item item44 = itemUpdater32.update(item43);
        com.gildedrose.Item item45 = itemUpdater17.update(item44);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory46 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater48 = itemUpdaterFactory46.getInstance("");
        com.gildedrose.Item item52 = new com.gildedrose.Item("hi!", 100, 1);
        int int53 = item52.sellIn;
        com.gildedrose.Item item54 = itemUpdater48.update(item52);
        com.gildedrose.Item item55 = itemUpdater17.update(item54);
        com.gildedrose.Item item59 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str60 = item59.name;
        java.lang.String str61 = item59.toString();
        java.lang.String str62 = item59.toString();
        com.gildedrose.Item item63 = itemUpdater17.update(item59);
        com.gildedrose.Item item64 = itemUpdater12.update(item59);
        int int65 = item64.sellIn;
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
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertNotNull(itemUpdater37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertNotNull(itemUpdater48);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertNotNull(item54);
        org.junit.Assert.assertNotNull(item55);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!, 0, 0" + "'", str60, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str61, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str62, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item63);
        org.junit.Assert.assertNotNull(item64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-2) + "'", int65 == (-2));
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 97", 0, 0);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        java.lang.String str4 = item3.toString();
        item3.quality = '4';
        java.lang.String str7 = item3.name;
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.name;
        java.lang.String str10 = item3.toString();
        int int11 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 1, 32" + "'", str4, ", 1, 32");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", 1, 52" + "'", str10, ", 1, 52");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 10, 0, 52, 1");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory25 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory25.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory25.getInstance("");
        com.gildedrose.Item item33 = new com.gildedrose.Item("hi!", 100, 1);
        int int34 = item33.sellIn;
        com.gildedrose.Item item35 = itemUpdater29.update(item33);
        com.gildedrose.Item item36 = itemUpdater24.update(item35);
        com.gildedrose.Item item37 = itemUpdater9.update(item36);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory38 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater40 = itemUpdaterFactory38.getInstance("");
        com.gildedrose.Item item44 = new com.gildedrose.Item("hi!", 100, 1);
        int int45 = item44.sellIn;
        com.gildedrose.Item item46 = itemUpdater40.update(item44);
        com.gildedrose.Item item47 = itemUpdater9.update(item46);
        int int48 = item47.quality;
        item47.quality = (-2);
        java.lang.String str51 = item47.name;
        int int52 = item47.quality;
        com.gildedrose.Item item53 = itemUpdater4.update(item47);
        int int54 = item53.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(itemUpdater40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertNotNull(item46);
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-2) + "'", int52 == (-2));
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 97 + "'", int54 == 97);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory3 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory3.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory3.getInstance("hi!, 51, 0");
        com.gildedrose.Item item13 = new com.gildedrose.Item("hi!, -1, 1", (int) ' ', (int) ' ');
        item13.sellIn = (byte) 10;
        com.gildedrose.Item item16 = itemUpdater9.update(item13);
        com.gildedrose.Item item17 = itemUpdater2.update(item16);
        com.gildedrose.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.gildedrose.Item item19 = itemUpdater2.update(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(item17);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.name;
        item3.sellIn = (-1);
        item3.quality = 0;
        item3.name = "hi!, 10, 0, 10, 1, 1, -1, 52, 52";
        item3.quality = 48;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 96, 8");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.name;
        item3.name = "hi!, 100, 52";
        item3.sellIn = ' ';
        item3.quality = '4';
        java.lang.String str13 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 100, 52, 32, 52" + "'", str13, "hi!, 100, 52, 32, 52");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory3 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.Item item9 = new com.gildedrose.Item("hi!", 100, 1);
        int int10 = item9.sellIn;
        com.gildedrose.Item item11 = itemUpdater5.update(item9);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory12 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.Item item18 = new com.gildedrose.Item("hi!", 100, 1);
        int int19 = item18.sellIn;
        com.gildedrose.Item item20 = itemUpdater14.update(item18);
        item18.sellIn = (byte) 0;
        java.lang.String str23 = item18.toString();
        com.gildedrose.Item item24 = itemUpdater5.update(item18);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory25 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory25.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory25.getInstance("");
        com.gildedrose.Item item33 = new com.gildedrose.Item("hi!", 100, 1);
        int int34 = item33.sellIn;
        com.gildedrose.Item item35 = itemUpdater29.update(item33);
        java.lang.String str36 = item33.toString();
        item33.sellIn = 10;
        java.lang.String str39 = item33.toString();
        item33.sellIn = 98;
        item33.sellIn = (byte) 10;
        com.gildedrose.Item item44 = itemUpdater5.update(item33);
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
        com.gildedrose.Item item67 = itemUpdater5.update(item66);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory68 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater70 = itemUpdaterFactory68.getInstance("");
        com.gildedrose.Item item74 = new com.gildedrose.Item("hi!", 100, 1);
        int int75 = item74.sellIn;
        com.gildedrose.Item item76 = itemUpdater70.update(item74);
        java.lang.String str77 = item76.name;
        com.gildedrose.Item item78 = itemUpdater5.update(item76);
        com.gildedrose.Item item79 = itemUpdater2.update(item78);
        item78.quality = 51;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 0, 0" + "'", str23, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 99, 0" + "'", str36, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!, 10, 0" + "'", str39, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertNotNull(itemUpdater47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertNotNull(itemUpdater56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertNotNull(item62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!, 0, 0" + "'", str65, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertNotNull(item67);
        org.junit.Assert.assertNotNull(itemUpdater70);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 100 + "'", int75 == 100);
        org.junit.Assert.assertNotNull(item76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertNotNull(item78);
        org.junit.Assert.assertNotNull(item79);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        item35.name = "hi!, -2, 0";
        java.lang.String str38 = item35.toString();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!, -2, 0, 30, 0" + "'", str38, "hi!, -2, 0, 30, 0");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        item41.sellIn = 98;
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
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        item3.name = "hi!, 0, 0";
        item3.quality = (byte) -1;
        item3.name = ", 10, 10";
        int int11 = item3.sellIn;
        item3.name = "hi!, 0, 0, -1, 35";
        java.lang.String str14 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 0, 0, -1, 35" + "'", str14, "hi!, 0, 0, -1, 35");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 51, 0", (-2), 31);
        item3.sellIn = 49;
        item3.name = "hi!, 10, 0, 10, 1, 1, -1, 52, 52, -1, 0";
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 99");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 50, 49");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory9.getInstance("hi!, 100, 52");
        com.gildedrose.Item item21 = new com.gildedrose.Item("hi!, 100, 1", (int) '4', (int) '#');
        com.gildedrose.Item item22 = itemUpdater17.update(item21);
        item21.quality = 32;
        com.gildedrose.Item item25 = itemUpdater8.update(item21);
        java.lang.Class<?> wildcardClass26 = item25.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(item25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        item3.sellIn = 99;
        int int6 = item3.quality;
        item3.name = "hi!, 10, 0, 10, 1, 10, 98";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        java.lang.Class<?> wildcardClass38 = item29.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        java.lang.String str14 = item8.toString();
        int int15 = item8.quality;
        item8.name = "hi!, 52, 1";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        item38.quality = 8;
        java.lang.String str50 = item38.toString();
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!, 99, 8" + "'", str50, "hi!, 99, 8");
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        int int31 = item24.sellIn;
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 51 + "'", int31 == 51);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 52", (int) (byte) 1, 31);
        item3.quality = 30;
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50", 50, 97);
        item3.sellIn = 50;
        java.lang.String str6 = item3.name;
        java.lang.Class<?> wildcardClass7 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 0, 50" + "'", str6, ", 0, 50");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        item29.sellIn = 99;
        item29.quality = 32;
        item29.name = "hi!, 98, 0";
        item29.name = "hi!, 0, 0, -2, 0";
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
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item8.sellIn = 52;
        int int11 = item8.quality;
        com.gildedrose.Item item12 = itemUpdater4.update(item8);
        com.gildedrose.Item item16 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item16.sellIn = (byte) 100;
        item16.name = "hi!, 100, 1, 98, 0";
        com.gildedrose.Item item21 = itemUpdater4.update(item16);
        int int22 = item21.sellIn;
        item21.quality = 31;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 99 + "'", int22 == 99);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        java.lang.String str14 = item8.toString();
        java.lang.String str15 = item8.name;
        int int16 = item8.quality;
        item8.name = "hi!, 0, 0, 0, 1, -2, -1";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        item81.quality = (byte) 10;
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
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        int int21 = item12.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
        java.lang.Class<?> wildcardClass23 = item14.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 96 + "'", int19 == 96);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ", 96, 31" + "'", str20, ", 96, 31");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item17 = new com.gildedrose.Item("hi!", 100, 1);
        int int18 = item17.sellIn;
        com.gildedrose.Item item19 = itemUpdater13.update(item17);
        java.lang.String str20 = item17.toString();
        item17.sellIn = 10;
        int int23 = item17.sellIn;
        item17.name = "hi!, 10, 0";
        int int26 = item17.sellIn;
        int int27 = item17.sellIn;
        com.gildedrose.Item item28 = itemUpdater8.update(item17);
        item17.name = "hi!, 100, 1, 32, 100, 1, 49";
        item17.sellIn = 10;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 99, 0" + "'", str20, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(item28);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        item52.name = "hi!, 100, 1";
        java.lang.String str56 = item52.name;
        int int57 = item52.quality;
        java.lang.String str58 = item52.toString();
        java.lang.String str59 = item52.toString();
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
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!, 100, 1" + "'", str56, "hi!, 100, 1");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!, 100, 1, 97, 0" + "'", str58, "hi!, 100, 1, 97, 0");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!, 100, 1, 97, 0" + "'", str59, "hi!, 100, 1, 97, 0");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 51, 0", (-2), 31);
        item3.quality = 98;
        java.lang.String str6 = item3.name;
        java.lang.Class<?> wildcardClass7 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 0, 0, 51, 0" + "'", str6, "hi!, 0, 0, 51, 0");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        item3.name = "hi!, 0, 0";
        item3.sellIn = (byte) 0;
        item3.quality = 31;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        int int11 = item8.sellIn;
        java.lang.String str12 = item8.name;
        item8.sellIn = ' ';
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 51, 0", (-2), 31);
        item3.sellIn = 49;
        item3.quality = 97;
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        item25.quality = (byte) 0;
        int int28 = item25.sellIn;
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        com.gildedrose.Item item26 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str27 = item26.name;
        java.lang.String str28 = item26.toString();
        java.lang.String str29 = item26.name;
        com.gildedrose.Item item30 = itemUpdater4.update(item26);
        item26.name = ", 1, 52";
        java.lang.String str33 = item26.toString();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!, 0, 0" + "'", str27, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!, 0, 0, 32, 0" + "'", str28, "hi!, 0, 0, 32, 0");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!, 0, 0" + "'", str29, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + ", 1, 52, 31, 0" + "'", str33, ", 1, 52, 31, 0");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 1, (int) ' ');
        item3.quality = 99;
        int int6 = item3.sellIn;
        item3.sellIn = 99;
        int int9 = item3.quality;
        item3.quality = (short) 100;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 31, 97", 8, 31);
        item3.name = "hi!, 100, 1, 10, 0, 52, 1";
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", (int) 'a', (int) '#');
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 49");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance(", 0, 50, 10, -1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory7.getInstance("hi!, -1, 0");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str16 = item15.name;
        java.lang.String str17 = item15.toString();
        com.gildedrose.Item item18 = itemUpdater11.update(item15);
        item15.sellIn = (byte) -1;
        java.lang.String str21 = item15.name;
        java.lang.String str22 = item15.toString();
        item15.name = "hi!, 100, -1, 10, 100";
        com.gildedrose.Item item25 = itemUpdater6.update(item15);
        int int26 = item15.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 0, 0" + "'", str16, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str17, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 0, 0" + "'", str21, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, 0, 0, -1, 0" + "'", str22, "hi!, 0, 0, -1, 0");
        org.junit.Assert.assertNotNull(item25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-2) + "'", int26 == (-2));
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        int int14 = item8.sellIn;
        int int15 = item8.quality;
        int int16 = item8.quality;
        int int17 = item8.quality;
        java.lang.Class<?> wildcardClass18 = item8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0", 98, 99);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        item3.quality = 48;
        item3.name = "hi!, 50, 0";
        java.lang.String str10 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 0" + "'", str4, "hi!, 1, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 1, 0, 98, 99" + "'", str5, "hi!, 1, 0, 98, 99");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 50, 0, 98, 48" + "'", str10, "hi!, 50, 0, 98, 48");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory9.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory9.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory9.getInstance("hi!, 9, 0");
        com.gildedrose.Item item23 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        com.gildedrose.Item item24 = itemUpdater19.update(item23);
        com.gildedrose.Item item25 = itemUpdater8.update(item23);
        java.lang.String str26 = item23.toString();
        int int27 = item23.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertNotNull(item25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!, 100, 1, 98, 0" + "'", str26, "hi!, 100, 1, 98, 0");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item8.sellIn = 52;
        int int11 = item8.quality;
        com.gildedrose.Item item12 = itemUpdater4.update(item8);
        int int13 = item8.sellIn;
        java.lang.String str14 = item8.toString();
        java.lang.Class<?> wildcardClass15 = item8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 0, 0, 99, 0, 51, 50" + "'", str14, "hi!, 0, 0, 99, 0, 51, 50");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 51, 50", 96, (int) (byte) 10);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 32, 100, -2, 1", 8, 49);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 52, 1", 32, (int) (byte) 10);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        java.lang.String str18 = item15.toString();
        item15.sellIn = 10;
        java.lang.String str21 = item15.toString();
        item15.sellIn = 1;
        item15.quality = 99;
        com.gildedrose.Item item26 = itemUpdater6.update(item15);
        item26.quality = 46;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 99, 0" + "'", str18, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 10, 0" + "'", str21, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item26);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 1, (int) ' ');
        item3.quality = 99;
        int int6 = item3.quality;
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6 == 99);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 1, 99" + "'", str7, ", 1, 99");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        int int16 = item15.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.Item item17 = new com.gildedrose.Item("hi!", 100, 1);
        int int18 = item17.sellIn;
        com.gildedrose.Item item19 = itemUpdater13.update(item17);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory20 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.Item item26 = new com.gildedrose.Item("hi!", 100, 1);
        int int27 = item26.sellIn;
        com.gildedrose.Item item28 = itemUpdater22.update(item26);
        item26.sellIn = (byte) 0;
        java.lang.String str31 = item26.toString();
        com.gildedrose.Item item32 = itemUpdater13.update(item26);
        item32.quality = '4';
        com.gildedrose.Item item35 = itemUpdater10.update(item32);
        item32.sellIn = 10;
        int int38 = item32.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!, 0, 0" + "'", str31, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 51, (int) (byte) 1);
        java.lang.String str4 = item3.name;
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) 100, (int) (byte) -1);
        int int4 = item3.quality;
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        java.lang.String str6 = item3.name;
        item3.name = "hi!, -1, 0";
        item3.name = "hi!";
        item3.sellIn = (short) 10;
        item3.quality = (-2);
        item3.sellIn = 95;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 99, 0" + "'", str6, "hi!, 99, 0");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        item3.name = "hi!, 10, 0";
        item3.sellIn = (short) -1;
        item3.sellIn = (short) -1;
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
        item33.quality = 34;
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
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        item17.quality = (byte) 100;
        int int29 = item17.sellIn;
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        item3.name = "hi!, 0, 0";
        item3.quality = (byte) -1;
        java.lang.String str9 = item3.name;
        int int10 = item3.sellIn;
        item3.sellIn = (short) 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 0, 0" + "'", str9, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        int int31 = item30.quality;
        item30.sellIn = 0;
        item30.quality = (short) 1;
        java.lang.String str36 = item30.toString();
        item30.quality = (-4);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 99, 0, 0, 1" + "'", str36, "hi!, 99, 0, 0, 1");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
        java.lang.Class<?> wildcardClass80 = item79.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
        item61.name = "";
        int int75 = item61.sellIn;
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
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-3) + "'", int75 == (-3));
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
        java.lang.Class<?> wildcardClass20 = item15.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1" + "'", str14, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 100, 0");
        java.lang.Class<?> wildcardClass9 = itemUpdaterFactory0.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 98");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, 1, 49");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = conjuredItemUpdater7.update(item11);
        item11.name = "hi!, 0, 0";
        int int16 = item11.quality;
        item11.quality = (short) -1;
        item11.name = "hi!";
        item11.name = ", 1, 32";
        int int23 = item11.quality;
        com.gildedrose.Item item24 = itemUpdater6.update(item11);
        java.lang.Class<?> wildcardClass25 = item11.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -3, 49", 97, 95);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -1, 1, 10, 32");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 10, 50");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 98");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item6.sellIn = 1;
        item6.sellIn = 32;
        int int11 = item6.sellIn;
        int int12 = item6.quality;
        item6.quality = (byte) 100;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
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
        item39.sellIn = (byte) 10;
        com.gildedrose.Item item50 = itemUpdater11.update(item39);
        int int51 = item39.quality;
        com.gildedrose.Item item52 = itemUpdater8.update(item39);
        int int53 = item52.sellIn;
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
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!, 99, 0" + "'", str42, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!, 10, 0" + "'", str45, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 8 + "'", int53 == 8);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 100, 0);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = conjuredItemUpdater11.update(item15);
        com.gildedrose.Item item21 = new com.gildedrose.Item("hi!", 100, 1);
        com.gildedrose.Item item22 = conjuredItemUpdater11.update(item21);
        com.gildedrose.Item item23 = itemUpdater10.update(item21);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory24 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory24.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory24.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory24.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater32 = itemUpdaterFactory24.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater34 = itemUpdaterFactory24.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item38 = new com.gildedrose.Item("", (int) '4', 1);
        com.gildedrose.Item item39 = itemUpdater34.update(item38);
        int int40 = item39.quality;
        com.gildedrose.Item item41 = itemUpdater10.update(item39);
        item41.quality = 0;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertNotNull(itemUpdater32);
        org.junit.Assert.assertNotNull(itemUpdater34);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(item41);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        item21.quality = 96;
        item21.quality = (-2);
        int int26 = item21.quality;
        item21.name = "hi!, 0, 50";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-2) + "'", int26 == (-2));
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 98, 99", 32, (-2));
        java.lang.String str4 = item3.toString();
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 0, 98, 99, 32, -2" + "'", str4, "hi!, 1, 0, 98, 99, 32, -2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 1, 0, 98, 99" + "'", str5, "hi!, 1, 0, 98, 99");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory9.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory9.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory9.getInstance("hi!, 9, 0");
        com.gildedrose.Item item23 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        com.gildedrose.Item item24 = itemUpdater19.update(item23);
        com.gildedrose.Item item25 = itemUpdater8.update(item23);
        int int26 = item25.quality;
        item25.name = ", 99, -1";
        item25.quality = 95;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertNotNull(item25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        com.gildedrose.Item item19 = new com.gildedrose.Item("hi!, 10, 0, 10, 1", 1, (-1));
        java.lang.String str20 = item19.toString();
        int int21 = item19.quality;
        com.gildedrose.Item item22 = conjuredItemUpdater0.update(item19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1" + "'", str14, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 10, 0, 10, 1, 1, -1" + "'", str20, "hi!, 10, 0, 10, 1, 1, -1");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(item22);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        int int17 = item14.quality;
        java.lang.String str18 = item14.name;
        java.lang.String str19 = item14.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", (-2), (int) (short) 0);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 10, 10, 99, 0", 8, (int) (short) 1);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 10, 10, 99, 0, 8, 1" + "'", str4, ", 10, 10, 99, 0, 8, 1");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 52, 8, 50", 10, 9);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 0", (-1), 31);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 98, 0, 97, 35");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 52, 8, 50");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 1");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        java.lang.Class<?> wildcardClass55 = conjuredItemUpdater0.getClass();
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
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 98, 0, 52, 0", 8, (int) (byte) -1);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 98, 0, 52, 0" + "'", str4, "hi!, 98, 0, 52, 0");
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 9, 1", (-3), 0);
        item3.sellIn = (byte) 0;
        item3.sellIn = 95;
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        java.lang.String str71 = item61.name;
        item61.name = "hi!, 52, 1, 0, 32";
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
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        item46.sellIn = 8;
        int int50 = item46.sellIn;
        java.lang.String str51 = item46.name;
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 8 + "'", int50 == 8);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!, 0, 0" + "'", str51, "hi!, 0, 0");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        com.gildedrose.Item item76 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.gildedrose.Item item77 = itemUpdater8.update(item76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item17 = new com.gildedrose.Item("hi!", 100, 1);
        int int18 = item17.sellIn;
        com.gildedrose.Item item19 = itemUpdater13.update(item17);
        java.lang.String str20 = item17.toString();
        item17.sellIn = 10;
        int int23 = item17.sellIn;
        item17.name = "hi!, 10, 0";
        int int26 = item17.sellIn;
        int int27 = item17.sellIn;
        com.gildedrose.Item item28 = itemUpdater8.update(item17);
        item17.name = "hi!, 100, 1, 32, 100, 1, 49";
        item17.name = "hi!, 0, 0, 0, 98";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 99, 0" + "'", str20, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(item28);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
        java.lang.String str43 = item39.toString();
        java.lang.String str44 = item39.toString();
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!, -3, 49" + "'", str43, "hi!, -3, 49");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!, -3, 49" + "'", str44, "hi!, -3, 49");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -1, 1, 8, 30");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        com.gildedrose.Item item72 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", 9, (int) 'a');
        com.gildedrose.Item item73 = itemUpdater8.update(item72);
        item72.sellIn = 50;
        item72.name = "hi!, 99, 0, 0, 10";
        item72.sellIn = 46;
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
        org.junit.Assert.assertNotNull(item73);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item6.sellIn = 1;
        item6.sellIn = 32;
        int int11 = item6.sellIn;
        int int12 = item6.quality;
        int int13 = item6.quality;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory11.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory11.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory11.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory11.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory11.getInstance("hi!, 100, 1, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.Item item29 = new com.gildedrose.Item("hi!, -1, 0", (int) (byte) -1, (int) (short) 0);
        java.lang.String str30 = item29.toString();
        com.gildedrose.Item item31 = itemUpdater25.update(item29);
        item31.quality = (short) 10;
        com.gildedrose.Item item34 = itemUpdater10.update(item31);
        item34.sellIn = (short) 10;
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
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!, -1, 0, -1, 0" + "'", str30, "hi!, -1, 0, -1, 0");
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(item34);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        com.gildedrose.Item item23 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str24 = item23.name;
        int int25 = item23.quality;
        item23.name = "";
        item23.name = "hi!, 100, 1";
        com.gildedrose.Item item30 = itemUpdater6.update(item23);
        int int31 = item30.quality;
        java.lang.String str32 = item30.name;
        java.lang.Class<?> wildcardClass33 = item30.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!, 100, 1" + "'", str32, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item14 = new com.gildedrose.Item("", (int) '4', 1);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        item15.sellIn = 96;
        java.lang.String str18 = item15.toString();
        java.lang.String str19 = item15.name;
        java.lang.Class<?> wildcardClass20 = item15.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ", 96, 0" + "'", str18, ", 96, 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        item3.name = "hi!, 0, 0";
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 0, 0" + "'", str7, "hi!, 0, 0");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 8, 0", 97, 10);
        int int4 = item3.quality;
        int int5 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -4, 0", (int) (short) 100, 49);
        int int4 = item3.sellIn;
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.Item item19 = new com.gildedrose.Item("hi!", 100, 1);
        int int20 = item19.sellIn;
        com.gildedrose.Item item21 = itemUpdater15.update(item19);
        com.gildedrose.Item item25 = new com.gildedrose.Item("hi!, 10, 0", 0, (-2));
        com.gildedrose.Item item26 = itemUpdater15.update(item25);
        item25.sellIn = (-3);
        com.gildedrose.Item item29 = itemUpdater10.update(item25);
        item29.name = "hi!, 1, 0, 98, 99";
        int int32 = item29.sellIn;
        int int33 = item29.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-4) + "'", int32 == (-4));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-4) + "'", int33 == (-4));
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 32, -1", 0, 8);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 98, 99", 32, (-2));
        java.lang.String str4 = item3.toString();
        item3.sellIn = 96;
        int int7 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 0, 98, 99, 32, -2" + "'", str4, "hi!, 1, 0, 98, 99, 32, -2");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50", 10, (int) ' ');
        item3.quality = 8;
        item3.sellIn = (-4);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        java.lang.Class<?> wildcardClass36 = item29.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 51, (int) (byte) 1);
        item3.sellIn = 0;
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        item31.name = "hi!, 10, 52";
        item31.quality = '#';
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
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 10");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item17 = new com.gildedrose.Item("hi!", 100, 1);
        int int18 = item17.sellIn;
        com.gildedrose.Item item19 = conjuredItemUpdater13.update(item17);
        item19.sellIn = 1;
        item19.name = "hi!, 0, 0, 0, 1";
        java.lang.String str24 = item19.name;
        com.gildedrose.Item item25 = itemUpdater12.update(item19);
        item25.quality = '4';
        item25.quality = 10;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str24, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item25);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        item57.name = "hi!, -1, 0, -1, 0";
        java.lang.String str60 = item57.toString();
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
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!, -1, 0, -1, 0, -4, 0" + "'", str60, "hi!, -1, 0, -1, 0, -4, 0");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -4, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance(", 0, 50, 10, -1");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 98");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 0, 10");
        java.lang.Class<?> wildcardClass11 = itemUpdaterFactory0.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 100, 1", (int) '#', (int) 'a');
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (-1), 52);
        int int4 = item3.quality;
        item3.sellIn = 98;
        item3.quality = 97;
        item3.name = "hi!, 100, 1, 9, 1, 9, 0";
        item3.quality = (-4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        java.lang.Class<?> wildcardClass18 = item15.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 100, 1" + "'", str17, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 0, 52);
        item3.sellIn = 51;
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        item31.name = "hi!, 99, 0, 0, 52";
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
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) (byte) -1, (int) (short) 0);
        java.lang.String str4 = item3.toString();
        item3.name = "hi!, 99, 0, 52, 1";
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 0, -1, 0" + "'", str4, "hi!, -1, 0, -1, 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 99, 0, 52, 1, -1, 0" + "'", str7, "hi!, 99, 0, 52, 1, -1, 0");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 8, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance(", 99, -1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 52");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory15 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory15.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory24 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory24.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory24.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory29 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater31 = itemUpdaterFactory29.getInstance("");
        com.gildedrose.Item item35 = new com.gildedrose.Item("hi!", 100, 1);
        int int36 = item35.sellIn;
        com.gildedrose.Item item37 = itemUpdater31.update(item35);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory38 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater40 = itemUpdaterFactory38.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory41 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater43 = itemUpdaterFactory41.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater45 = itemUpdaterFactory41.getInstance("");
        com.gildedrose.Item item49 = new com.gildedrose.Item("hi!", 100, 1);
        int int50 = item49.sellIn;
        com.gildedrose.Item item51 = itemUpdater45.update(item49);
        com.gildedrose.Item item52 = itemUpdater40.update(item51);
        com.gildedrose.Item item53 = itemUpdater31.update(item52);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater54 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item58 = new com.gildedrose.Item("hi!", 100, 1);
        int int59 = item58.sellIn;
        com.gildedrose.Item item60 = conjuredItemUpdater54.update(item58);
        com.gildedrose.Item item61 = itemUpdater31.update(item58);
        com.gildedrose.Item item65 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        com.gildedrose.Item item66 = itemUpdater31.update(item65);
        com.gildedrose.Item item67 = itemUpdater28.update(item65);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory68 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater70 = itemUpdaterFactory68.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater72 = itemUpdaterFactory68.getInstance("");
        com.gildedrose.Item item76 = new com.gildedrose.Item("hi!", 100, 1);
        int int77 = item76.sellIn;
        com.gildedrose.Item item78 = itemUpdater72.update(item76);
        java.lang.String str79 = item76.toString();
        java.lang.String str80 = item76.name;
        com.gildedrose.Item item81 = itemUpdater28.update(item76);
        com.gildedrose.Item item82 = itemUpdater23.update(item76);
        item82.name = "hi!, 51, 0";
        com.gildedrose.Item item85 = itemUpdater14.update(item82);
        java.lang.String str86 = item82.name;
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
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(itemUpdater40);
        org.junit.Assert.assertNotNull(itemUpdater43);
        org.junit.Assert.assertNotNull(itemUpdater45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertNotNull(item51);
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertNotNull(item60);
        org.junit.Assert.assertNotNull(item61);
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertNotNull(item67);
        org.junit.Assert.assertNotNull(itemUpdater70);
        org.junit.Assert.assertNotNull(itemUpdater72);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 100 + "'", int77 == 100);
        org.junit.Assert.assertNotNull(item78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!, 99, 0" + "'", str79, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(item81);
        org.junit.Assert.assertNotNull(item82);
        org.junit.Assert.assertNotNull(item85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!, 51, 0" + "'", str86, "hi!, 51, 0");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
        item31.name = "hi!, 100, 1";
        item31.quality = (short) -1;
        java.lang.String str36 = item31.toString();
        int int37 = item31.sellIn;
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 100, 1, -2, -1" + "'", str36, "hi!, 100, 1, -2, -1");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 0, 52", 98, 0);
        item3.quality = (short) 100;
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        int int37 = item34.quality;
        java.lang.String str38 = item34.toString();
        java.lang.Class<?> wildcardClass39 = item34.getClass();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!, -1, 0, -2, 0" + "'", str38, "hi!, -1, 0, -2, 0");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50, 1, 100", (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 52, 32");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory15 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.Item item23 = new com.gildedrose.Item("hi!", 100, 1);
        int int24 = item23.sellIn;
        com.gildedrose.Item item25 = itemUpdater19.update(item23);
        java.lang.String str26 = item23.toString();
        item23.sellIn = 10;
        java.lang.String str29 = item23.toString();
        item23.sellIn = 1;
        java.lang.String str32 = item23.toString();
        int int33 = item23.sellIn;
        int int34 = item23.quality;
        item23.name = ", 0, 50, 50, 97";
        com.gildedrose.Item item37 = itemUpdater14.update(item23);
        item23.quality = (byte) 10;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(item25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!, 99, 0" + "'", str26, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!, 10, 0" + "'", str29, "hi!, 10, 0");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!, 1, 0" + "'", str32, "hi!, 1, 0");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(item37);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, -1, 0, 0, 52", (int) ' ', 35);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        com.gildedrose.Item item17 = new com.gildedrose.Item("hi!", 100, 1);
        int int18 = item17.sellIn;
        item17.name = "hi!, 0, 0";
        item17.quality = (byte) -1;
        item17.name = ", 10, 10";
        int int25 = item17.quality;
        int int26 = item17.sellIn;
        com.gildedrose.Item item27 = itemUpdater8.update(item17);
        int int28 = item27.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0", 98, 99);
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.name;
        int int7 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 1, 0" + "'", str6, "hi!, 1, 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7 == 99);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 9, 50", 34, 50);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, 9", 51, 30);
        item3.name = ", 99, -1";
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        item3.quality = 0;
        item3.quality = (byte) 0;
        int int8 = item3.sellIn;
        java.lang.Class<?> wildcardClass9 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 31, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance(", 0, 50, 1, 100, -1, 100");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, -3");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory15 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.Item item23 = new com.gildedrose.Item("hi!", 100, 1);
        int int24 = item23.sellIn;
        com.gildedrose.Item item25 = itemUpdater19.update(item23);
        java.lang.String str26 = item23.toString();
        item23.sellIn = 10;
        int int29 = item23.sellIn;
        item23.name = "hi!, 10, 0";
        int int32 = item23.sellIn;
        int int33 = item23.sellIn;
        com.gildedrose.Item item34 = itemUpdater14.update(item23);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(item25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!, 99, 0" + "'", str26, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(item34);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        item80.sellIn = 34;
        item80.sellIn = '4';
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
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        java.lang.String str6 = item3.name;
        item3.sellIn = (short) 10;
        int int9 = item3.sellIn;
        int int10 = item3.quality;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 99, 0" + "'", str6, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 10, 10");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory13 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory13.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory13.getInstance("hi!, 100, 1, 98, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory26 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory26.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory26.getInstance(", 10, 10");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory31 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory31.getInstance("");
        com.gildedrose.Item item37 = new com.gildedrose.Item("hi!", 100, 1);
        int int38 = item37.sellIn;
        com.gildedrose.Item item39 = itemUpdater33.update(item37);
        int int40 = item37.sellIn;
        java.lang.String str41 = item37.toString();
        int int42 = item37.sellIn;
        com.gildedrose.Item item43 = itemUpdater30.update(item37);
        com.gildedrose.Item item44 = itemUpdater25.update(item37);
        com.gildedrose.Item item45 = itemUpdater12.update(item44);
        com.gildedrose.Item item49 = new com.gildedrose.Item("hi!, 100, -1, 10, 100", 32, 8);
        item49.quality = (byte) 10;
        com.gildedrose.Item item52 = itemUpdater12.update(item49);
        item52.quality = (byte) 10;
        java.lang.String str55 = item52.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 99 + "'", int40 == 99);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!, 99, 0" + "'", str41, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 99 + "'", int42 == 99);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!, 100, -1, 10, 100" + "'", str55, "hi!, 100, -1, 10, 100");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 1");
        java.lang.Class<?> wildcardClass11 = itemUpdaterFactory0.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1", (int) 'a', 50);
        java.lang.String str4 = item3.toString();
        item3.quality = 34;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, 0, 10, 1, 1, -1, 97, 50" + "'", str4, "hi!, 10, 0, 10, 1, 1, -1, 97, 50");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 10, 10");
        java.lang.Class<?> wildcardClass5 = itemUpdaterFactory0.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        java.lang.String str33 = item29.name;
        java.lang.String str34 = item29.name;
        item29.name = "hi!, 0, 0, 32, 0";
        java.lang.String str37 = item29.name;
        java.lang.String str38 = item29.toString();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!, 0, 0, 32, 0" + "'", str37, "hi!, 0, 0, 32, 0");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!, 0, 0, 32, 0, 98, 0" + "'", str38, "hi!, 0, 0, 32, 0, 98, 0");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        java.lang.String str24 = item21.name;
        int int25 = item21.sellIn;
        java.lang.String str26 = item21.name;
        item21.quality = 9;
        int int29 = item21.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 9 + "'", int29 == 9);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        int int14 = item8.sellIn;
        item8.name = "hi!, 10, 0";
        int int17 = item8.sellIn;
        java.lang.String str18 = item8.toString();
        item8.quality = (byte) 1;
        item8.name = "";
        java.lang.String str23 = item8.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 10, 0, 10, 0" + "'", str18, "hi!, 10, 0, 10, 0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ", 10, 1" + "'", str23, ", 10, 1");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory21 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.Item item27 = new com.gildedrose.Item("hi!", 100, 1);
        int int28 = item27.sellIn;
        com.gildedrose.Item item29 = itemUpdater23.update(item27);
        item27.sellIn = (byte) 0;
        com.gildedrose.Item item32 = itemUpdater20.update(item27);
        int int33 = item32.quality;
        java.lang.String str34 = item32.toString();
        int int35 = item32.quality;
        com.gildedrose.Item item36 = itemUpdater10.update(item32);
        int int37 = item36.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!, -1, 0" + "'", str34, "hi!, -1, 0");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        item8.name = "hi!, 98, 0";
        int int23 = item8.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str13 = item12.name;
        int int14 = item12.sellIn;
        com.gildedrose.Item item15 = itemUpdater8.update(item12);
        com.gildedrose.Item item19 = new com.gildedrose.Item("hi!, 10, 0", (int) ' ', (int) '#');
        int int20 = item19.quality;
        java.lang.String str21 = item19.name;
        com.gildedrose.Item item22 = itemUpdater8.update(item19);
        int int23 = item19.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 0, 0" + "'", str13, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 10, 0" + "'", str21, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 31 + "'", int23 == 31);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
        com.gildedrose.Item item57 = new com.gildedrose.Item("hi!", 100, 1);
        int int58 = item57.sellIn;
        item57.name = "hi!, 0, 0";
        item57.quality = 9;
        com.gildedrose.Item item63 = itemUpdater8.update(item57);
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
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertNotNull(item63);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 100, 1", (int) '4', (int) '#');
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        java.lang.String str14 = item13.name;
        java.lang.String str15 = item13.toString();
        item13.sellIn = (byte) 100;
        item13.sellIn = 97;
        int int20 = item13.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1" + "'", str14, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 100, 1, 51, 34" + "'", str15, "hi!, 100, 1, 51, 34");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 34 + "'", int20 == 34);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', 1);
        item3.name = "hi!, 0, 0";
        java.lang.String str6 = item3.toString();
        java.lang.String str7 = item3.toString();
        int int8 = item3.quality;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str6, "hi!, 0, 0, 52, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str7, "hi!, 0, 0, 52, 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 52, 0", (int) (short) 0, 35);
        item3.name = "hi!, 99, 50";
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        item31.name = "hi!, 10, 52";
        java.lang.String str34 = item31.name;
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!, 10, 52" + "'", str34, "hi!, 10, 52");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = conjuredItemUpdater11.update(item15);
        com.gildedrose.Item item21 = new com.gildedrose.Item("hi!", 100, 1);
        com.gildedrose.Item item22 = conjuredItemUpdater11.update(item21);
        com.gildedrose.Item item23 = itemUpdater10.update(item21);
        com.gildedrose.Item item27 = new com.gildedrose.Item("hi!", 100, 1);
        item27.sellIn = 99;
        int int30 = item27.sellIn;
        item27.quality = 96;
        item27.quality = 35;
        int int35 = item27.quality;
        int int36 = item27.quality;
        com.gildedrose.Item item37 = itemUpdater10.update(item27);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 99 + "'", int30 == 99);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertNotNull(item37);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.name;
        item3.sellIn = (short) 100;
        item3.quality = 10;
        item3.sellIn = (byte) 10;
        int int13 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 32, 100, 1, 49", 35, (-2));
        java.lang.String str4 = item3.toString();
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 32, 100, 1, 49, 35, -2" + "'", str4, "hi!, 100, 1, 32, 100, 1, 49, 35, -2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 100, 1, 32, 100, 1, 49, 35, -2" + "'", str5, "hi!, 100, 1, 32, 100, 1, 49, 35, -2");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 98, 8", 0, 52);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) (byte) 1, 9);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 0" + "'", str4, "hi!, -1, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, 0, 1, 9" + "'", str5, "hi!, -1, 0, 1, 9");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 100, -1", 99, 48);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        item29.name = "hi!, 0, 0, 99, 0, 1, 1";
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
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", 9, (int) 'a');
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0, 99, 0, 9, 97" + "'", str4, "hi!, 0, 0, 99, 0, 9, 97");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 32, 100, 1, 49, 35, -2", (-2), 30);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        java.lang.String str33 = item29.name;
        java.lang.String str34 = item29.name;
        item29.name = "hi!, 0, 0, 32, 0";
        item29.sellIn = 8;
        java.lang.Class<?> wildcardClass39 = item29.getClass();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        item17.name = "hi!, 0, 0, 52, 0";
        int int29 = item17.sellIn;
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        item3.name = "hi!, 10, 0";
        item3.sellIn = (short) -1;
        int int8 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        item14.quality = 0;
        item14.name = "";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(item18);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
        java.lang.String str75 = item73.name;
        com.gildedrose.Item item76 = itemUpdater8.update(item73);
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
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertNotNull(item76);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!, 10, 0", 0, (-2));
        com.gildedrose.Item item15 = itemUpdater4.update(item14);
        int int16 = item15.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        int int31 = item30.sellIn;
        item30.name = "hi!, 100, 1, 10, 0";
        java.lang.Class<?> wildcardClass34 = item30.getClass();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 51 + "'", int31 == 51);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        java.lang.Class<?> wildcardClass26 = item24.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item14 = new com.gildedrose.Item("", (int) '4', 1);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        int int16 = item15.sellIn;
        item15.name = ", 0, 50, 10, -1";
        item15.quality = 'a';
        java.lang.String str21 = item15.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ", 0, 50, 10, -1" + "'", str21, ", 0, 50, 10, -1");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.Item item10 = new com.gildedrose.Item("", (int) (short) 10, (int) 'a');
        java.lang.String str11 = item10.toString();
        com.gildedrose.Item item12 = itemUpdater6.update(item10);
        item10.sellIn = 9;
        java.lang.Class<?> wildcardClass15 = item10.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", 10, 97" + "'", str11, ", 10, 97");
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        item3.quality = 100;
        int int8 = item3.quality;
        java.lang.Class<?> wildcardClass9 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 50, 33", (int) (byte) -1, 30);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", (int) (short) 1, (int) ' ');
        item3.quality = 34;
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
        item15.sellIn = (byte) -1;
        item15.quality = (byte) 0;
        item15.sellIn = 48;
        java.lang.Class<?> wildcardClass28 = item15.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
        int int42 = item41.quality;
        java.lang.String str43 = item41.toString();
        int int44 = item41.sellIn;
        java.lang.String str45 = item41.toString();
        item41.quality = (-3);
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 9 + "'", int44 == 9);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!, 9, 0" + "'", str45, "hi!, 9, 0");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        java.lang.Class<?> wildcardClass9 = item6.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
        item81.name = "hi!, 98, -2";
        java.lang.Class<?> wildcardClass85 = item81.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 0, 52, -2, 52", (int) (short) 0, 98);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", (int) ' ', (int) '#');
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 1, 97, 50");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.Item item22 = new com.gildedrose.Item("hi!", 100, 1);
        int int23 = item22.sellIn;
        com.gildedrose.Item item24 = itemUpdater18.update(item22);
        item22.sellIn = (byte) 0;
        com.gildedrose.Item item27 = itemUpdater15.update(item22);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory28 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory28.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory31 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory31.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory31.getInstance("");
        com.gildedrose.Item item39 = new com.gildedrose.Item("hi!", 100, 1);
        int int40 = item39.sellIn;
        com.gildedrose.Item item41 = itemUpdater35.update(item39);
        com.gildedrose.Item item42 = itemUpdater30.update(item41);
        com.gildedrose.Item item43 = itemUpdater15.update(item42);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory44 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater46 = itemUpdaterFactory44.getInstance("");
        com.gildedrose.Item item50 = new com.gildedrose.Item("hi!", 100, 1);
        int int51 = item50.sellIn;
        com.gildedrose.Item item52 = itemUpdater46.update(item50);
        com.gildedrose.Item item53 = itemUpdater15.update(item52);
        int int54 = item53.quality;
        java.lang.String str55 = item53.name;
        com.gildedrose.Item item56 = itemUpdater10.update(item53);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertNotNull(item42);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertNotNull(itemUpdater46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(item56);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 51, 0", 0, (int) (short) 1);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
        int int31 = item30.sellIn;
        java.lang.String str32 = item30.name;
        int int33 = item30.quality;
        java.lang.Class<?> wildcardClass34 = item30.getClass();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 51 + "'", int31 == 51);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 0, 0, 0", 95, 48);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 52, 1");
        com.gildedrose.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.gildedrose.Item item10 = itemUpdater8.update(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        int int6 = item3.quality;
        item3.sellIn = 10;
        item3.name = "hi!, 10, 0";
        java.lang.String str11 = item3.toString();
        int int12 = item3.quality;
        item3.quality = 32;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 10, 0, 10, 1" + "'", str11, "hi!, 10, 0, 10, 1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 99");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 50, 49");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory9.getInstance("hi!, 100, 52");
        com.gildedrose.Item item21 = new com.gildedrose.Item("hi!, 100, 1", (int) '4', (int) '#');
        com.gildedrose.Item item22 = itemUpdater17.update(item21);
        item21.quality = 32;
        com.gildedrose.Item item25 = itemUpdater8.update(item21);
        int int26 = item21.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(item25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 31 + "'", int26 == 31);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) 100, (int) (byte) -1);
        int int4 = item3.quality;
        int int5 = item3.quality;
        item3.name = "hi!, 100, 1, 98, 0";
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 100, 1, 98, 0" + "'", str8, "hi!, 100, 1, 98, 0");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
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
        java.lang.String str34 = item29.name;
        java.lang.String str35 = item29.name;
        int int36 = item29.quality;
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 10, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 1, 0", 98, 99);
        int int13 = item12.quality;
        int int14 = item12.sellIn;
        item12.name = "hi!, 0, 0, 51, 0";
        com.gildedrose.Item item17 = itemUpdater8.update(item12);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory18 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory18.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory18.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory18.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory25 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory25.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory28 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory28.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater32 = itemUpdaterFactory28.getInstance("");
        com.gildedrose.Item item36 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item36.sellIn = 52;
        int int39 = item36.quality;
        com.gildedrose.Item item40 = itemUpdater32.update(item36);
        com.gildedrose.Item item41 = itemUpdater27.update(item40);
        com.gildedrose.Item item42 = itemUpdater24.update(item40);
        java.lang.String str43 = item42.toString();
        java.lang.String str44 = item42.name;
        com.gildedrose.Item item45 = itemUpdater8.update(item42);
        java.lang.Class<?> wildcardClass46 = itemUpdater8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 98 + "'", int14 == 98);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertNotNull(itemUpdater32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertNotNull(item40);
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertNotNull(item42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!, 0, 0, 99, 0, 49, 48" + "'", str43, "hi!, 0, 0, 99, 0, 49, 48");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str44, "hi!, 0, 0, 99, 0");
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }
}

