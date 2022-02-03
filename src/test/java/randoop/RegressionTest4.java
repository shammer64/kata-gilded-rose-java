package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10", 32, (int) '#');
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -2, 50, 0, 50");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance(", 100, 1");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 98, (int) (short) 100);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 99, 0" + "'", str4, "hi!, 99, 0");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        java.lang.String str19 = item14.name;
        int int20 = item14.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 100, 1" + "'", str19, "hi!, 100, 1");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        com.gildedrose.ItemUpdater itemUpdater37 = itemUpdaterFactory33.getInstance("");
        com.gildedrose.Item item41 = new com.gildedrose.Item("hi!", 100, 1);
        int int42 = item41.sellIn;
        com.gildedrose.Item item43 = itemUpdater37.update(item41);
        java.lang.String str44 = item41.toString();
        item41.sellIn = 10;
        java.lang.String str47 = item41.toString();
        int int48 = item41.quality;
        com.gildedrose.Item item49 = itemUpdater4.update(item41);
        java.lang.String str50 = item49.toString();
        item49.sellIn = (short) -1;
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
        org.junit.Assert.assertNotNull(itemUpdater37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!, 99, 0" + "'", str44, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!, 10, 0" + "'", str47, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(item49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!, 9, 0" + "'", str50, "hi!, 9, 0");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 99");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 10, 0");
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!, 51, 0", 1, 97);
        com.gildedrose.Item item11 = itemUpdater6.update(item10);
        item10.sellIn = (short) -1;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(item11);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 95, 30", (int) (short) 100, 50);
        item3.sellIn = '#';
        java.lang.String str6 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 95, 30" + "'", str6, ", 95, 30");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory19 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory19.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory19.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory19.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory19.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory19.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater31 = itemUpdaterFactory19.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory19.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory19.getInstance("hi!, 0, 0, 51, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory36 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory36.getInstance("");
        com.gildedrose.Item item42 = new com.gildedrose.Item("hi!", 100, 1);
        int int43 = item42.sellIn;
        com.gildedrose.Item item44 = itemUpdater38.update(item42);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory45 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater47 = itemUpdaterFactory45.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory48 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater50 = itemUpdaterFactory48.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater52 = itemUpdaterFactory48.getInstance("");
        com.gildedrose.Item item56 = new com.gildedrose.Item("hi!", 100, 1);
        int int57 = item56.sellIn;
        com.gildedrose.Item item58 = itemUpdater52.update(item56);
        com.gildedrose.Item item59 = itemUpdater47.update(item58);
        com.gildedrose.Item item60 = itemUpdater38.update(item59);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater61 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item65 = new com.gildedrose.Item("hi!", 100, 1);
        int int66 = item65.sellIn;
        com.gildedrose.Item item67 = conjuredItemUpdater61.update(item65);
        com.gildedrose.Item item68 = itemUpdater38.update(item65);
        int int69 = item65.quality;
        item65.sellIn = 99;
        item65.name = "";
        item65.name = "hi!, 51, 0";
        com.gildedrose.Item item76 = itemUpdater35.update(item65);
        com.gildedrose.Item item77 = itemUpdater18.update(item65);
        item77.quality = (short) -1;
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
        org.junit.Assert.assertNotNull(itemUpdater31);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertNotNull(itemUpdater47);
        org.junit.Assert.assertNotNull(itemUpdater50);
        org.junit.Assert.assertNotNull(itemUpdater52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertNotNull(item58);
        org.junit.Assert.assertNotNull(item59);
        org.junit.Assert.assertNotNull(item60);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 100 + "'", int66 == 100);
        org.junit.Assert.assertNotNull(item67);
        org.junit.Assert.assertNotNull(item68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(item76);
        org.junit.Assert.assertNotNull(item77);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, -1", 8, (int) (byte) 10);
        java.lang.String str4 = item3.toString();
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, -1, 8, 10" + "'", str4, "hi!, -1, -1, 8, 10");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 1", 49, (int) '4');
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 0, 50, 1, 100, -1, 100");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -3, 49");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance(", 0, 50, 1, 100, -1, 100");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory11.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory11.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory11.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory11.getInstance("hi!, 10, 0, 10, 1, 1, -1, 52, 52");
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory11.getInstance("hi!, 100, 1, 51, 34");
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory11.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.Item item33 = new com.gildedrose.Item("hi!", (int) '4', (int) (byte) 1);
        com.gildedrose.Item item34 = itemUpdater29.update(item33);
        com.gildedrose.Item item35 = itemUpdater10.update(item34);
        java.lang.String str36 = item35.name;
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
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater29);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 1, -3, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        item46.quality = 98;
        java.lang.String str52 = item46.toString();
        java.lang.Class<?> wildcardClass53 = item46.getClass();
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!, 100, 1, 9, 1, 97, 98" + "'", str52, "hi!, 100, 1, 9, 1, 97, 98");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        item30.quality = 99;
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
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 98");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory9.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.Item item22 = new com.gildedrose.Item("hi!", 100, 1);
        int int23 = item22.sellIn;
        com.gildedrose.Item item24 = itemUpdater18.update(item22);
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
        com.gildedrose.Item item42 = itemUpdater18.update(item33);
        com.gildedrose.Item item43 = itemUpdater15.update(item42);
        com.gildedrose.Item item47 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item47.sellIn = (byte) 100;
        java.lang.String str50 = item47.name;
        item47.name = "hi!, -1, 0";
        item47.name = "hi!";
        java.lang.String str55 = item47.toString();
        com.gildedrose.Item item56 = itemUpdater15.update(item47);
        com.gildedrose.Item item57 = itemUpdater8.update(item47);
        java.lang.Class<?> wildcardClass58 = itemUpdater8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 99, 0" + "'", str36, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!, 10, 0" + "'", str39, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item42);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!, 99, 0" + "'", str50, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!, 100, 52" + "'", str55, "hi!, 100, 52");
        org.junit.Assert.assertNotNull(item56);
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 49", 98, 9);
        item3.quality = (-4);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 52, (int) (byte) 0);
        int int4 = item3.sellIn;
        item3.sellIn = (-3);
        item3.quality = (byte) -1;
        item3.sellIn = (-1);
        int int11 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -2, 50", 34, 99);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        java.lang.String str31 = item30.toString();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!, 98, 0" + "'", str31, "hi!, 98, 0");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        int int11 = item8.sellIn;
        java.lang.String str12 = item8.name;
        item8.sellIn = (-2);
        int int15 = item8.quality;
        int int16 = item8.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        item29.sellIn = 0;
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
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        java.lang.Class<?> wildcardClass26 = item25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        java.lang.String str17 = item10.name;
        int int18 = item10.sellIn;
        item10.name = "hi!, 10, 0, 10, 1, 1, -1, 97, 50";
        java.lang.Class<?> wildcardClass21 = item10.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1" + "'", str14, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        item3.name = "hi!, 10, 0";
        int int6 = item3.quality;
        item3.sellIn = 10;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0" + "'", str4, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 0, 0" + "'", str5, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 52, 1");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, -1, 52");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance(", 0, 50, 10, -1");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory0.getInstance("");
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
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.Item item16 = new com.gildedrose.Item("hi!, 100, 1, 100, 0", 96, 49);
        java.lang.String str17 = item16.name;
        com.gildedrose.Item item18 = itemUpdater12.update(item16);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory19 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory19.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory19.getInstance(", 1, 99");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory19.getInstance(", 10, 97");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory26 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory26.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory26.getInstance("hi!, -2, 0");
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
        com.gildedrose.Item item53 = itemUpdater30.update(item52);
        item52.name = "";
        com.gildedrose.Item item56 = itemUpdater25.update(item52);
        int int57 = item56.quality;
        item56.sellIn = '#';
        int int60 = item56.quality;
        com.gildedrose.Item item61 = itemUpdater12.update(item56);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 100, 1, 100, 0" + "'", str17, "hi!, 100, 1, 100, 0");
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
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
        org.junit.Assert.assertNotNull(item56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(item61);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        item20.quality = (short) 10;
        int int23 = item20.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, -1, 0, -1, 0" + "'", str19, "hi!, -1, 0, -1, 0");
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50", (int) (short) 1, (int) (short) 100);
        item3.quality = (byte) -1;
        item3.sellIn = (byte) 10;
        int int8 = item3.quality;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        java.lang.String str4 = item3.toString();
        item3.quality = '4';
        item3.sellIn = 97;
        item3.quality = 'a';
        java.lang.String str11 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 1, 32" + "'", str4, ", 1, 32");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 52, 1", (int) '4', (int) ' ');
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        item44.name = "hi!, 97, 9";
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
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.Item item19 = new com.gildedrose.Item("hi!", 100, 1);
        int int20 = item19.sellIn;
        com.gildedrose.Item item21 = itemUpdater15.update(item19);
        java.lang.String str22 = item19.toString();
        item19.sellIn = 10;
        java.lang.String str25 = item19.toString();
        java.lang.String str26 = item19.name;
        com.gildedrose.Item item27 = itemUpdater10.update(item19);
        item19.name = "hi!, -1, 1, 8, 30";
        item19.sellIn = 10;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, 99, 0" + "'", str22, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!, 10, 0" + "'", str25, "hi!, 10, 0");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(item27);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str9 = item8.name;
        java.lang.String str10 = item8.toString();
        com.gildedrose.Item item11 = itemUpdater4.update(item8);
        item8.sellIn = (byte) -1;
        item8.quality = (byte) 1;
        item8.quality = 32;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 0, 0" + "'", str9, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str10, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item11);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49", 35, (-1));
        item3.name = ", 1, 99";
        int int6 = item3.sellIn;
        int int7 = item3.sellIn;
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 1, 99" + "'", str8, ", 1, 99");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', 1);
        item3.name = "hi!, 0, 0";
        java.lang.String str6 = item3.toString();
        java.lang.String str7 = item3.toString();
        item3.name = "hi!, 98, 0";
        java.lang.String str10 = item3.name;
        item3.sellIn = 30;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str6, "hi!, 0, 0, 52, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str7, "hi!, 0, 0, 52, 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 98, 0" + "'", str10, "hi!, 98, 0");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 8, 0", 97, 10);
        int int4 = item3.quality;
        java.lang.String str5 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 8, 0" + "'", str5, "hi!, 8, 0");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50, 1, 100", (-1), (int) (byte) 100);
        java.lang.String str4 = item3.toString();
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 0, 50, 1, 100, -1, 100" + "'", str4, ", 0, 50, 1, 100, -1, 100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 0, 50, 1, 100, -1, 100" + "'", str5, ", 0, 50, 1, 100, -1, 100");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -3, 0, 52, -1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 98, 98");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory7.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory7.getInstance("hi!, 51, 0");
        com.gildedrose.Item item17 = new com.gildedrose.Item("hi!, -1, 1", (int) ' ', (int) ' ');
        item17.sellIn = (byte) 10;
        com.gildedrose.Item item20 = itemUpdater13.update(item17);
        item20.name = "hi!, 10, 50";
        item20.sellIn = (-1);
        int int25 = item20.sellIn;
        item20.name = "hi!, 52, 32";
        com.gildedrose.Item item28 = itemUpdater6.update(item20);
        com.gildedrose.Item item29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.gildedrose.Item item30 = itemUpdater6.update(item29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(item28);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        com.gildedrose.Item item49 = new com.gildedrose.Item("hi!, 0, 0, 0, 49", 48, (int) '#');
        int int50 = item49.quality;
        com.gildedrose.Item item51 = itemUpdater8.update(item49);
        item51.sellIn = 95;
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 35 + "'", int50 == 35);
        org.junit.Assert.assertNotNull(item51);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        java.lang.String str24 = item15.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!, -1, 0" + "'", str24, "hi!, -1, 0");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        java.lang.String str62 = item61.name;
        int int63 = item61.quality;
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
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!, 0, 0" + "'", str62, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 96, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 52");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, -1, 10, 100, -2, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -4, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 50");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 50");
        com.gildedrose.Item item16 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1", (int) (byte) -1, (-3));
        com.gildedrose.Item item17 = itemUpdater12.update(item16);
        int int18 = item16.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1", 52, (int) (byte) 100);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        item28.name = "hi!, 100, 1, 9, 1, 100, 1";
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
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        item8.sellIn = (-1);
        java.lang.String str18 = item8.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        java.lang.Class<?> wildcardClass7 = itemUpdater6.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory24 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory24.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory24.getInstance("");
        com.gildedrose.Item item32 = new com.gildedrose.Item("hi!", 100, 1);
        int int33 = item32.sellIn;
        com.gildedrose.Item item34 = itemUpdater28.update(item32);
        int int35 = item32.sellIn;
        java.lang.String str36 = item32.name;
        com.gildedrose.Item item37 = itemUpdater14.update(item32);
        item32.sellIn = 31;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 99 + "'", int35 == 99);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(item37);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.quality = 51;
        item4.sellIn = 98;
        java.lang.Class<?> wildcardClass11 = item4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 99, 0", 0, (int) (byte) 10);
        java.lang.String str13 = item12.name;
        java.lang.String str14 = item12.toString();
        com.gildedrose.Item item15 = itemUpdater8.update(item12);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 99, 0" + "'", str13, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 99, 0, 0, 10" + "'", str14, "hi!, 99, 0, 0, 10");
        org.junit.Assert.assertNotNull(item15);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -1, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1, 52, 100, 9, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 52, 1");
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
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        int int89 = item87.sellIn;
        item87.name = "hi!, 9, 0";
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
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 98 + "'", int89 == 98);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        java.lang.Class<?> wildcardClass11 = itemUpdaterFactory0.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        item56.sellIn = 97;
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
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 10, 52");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        java.lang.String str65 = item63.name;
        item63.name = "hi!, 100, 99";
        java.lang.Class<?> wildcardClass68 = item63.getClass();
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
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        java.lang.Class<?> wildcardClass26 = item25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        java.lang.String str4 = item3.toString();
        item3.sellIn = (short) 0;
        int int7 = item3.sellIn;
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0, 0, 98" + "'", str4, "hi!, 0, 0, 0, 98");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
        int int89 = item79.sellIn;
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
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-3) + "'", int89 == (-3));
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        item37.quality = 0;
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
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
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
        item26.name = "hi!, 0, 0";
        int int35 = item26.sellIn;
        int int36 = item26.quality;
        java.lang.String str37 = item26.name;
        com.gildedrose.Item item38 = itemUpdater10.update(item26);
        int int39 = item38.quality;
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!, 0, 0" + "'", str37, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        item15.sellIn = (byte) -1;
        java.lang.String str30 = item15.name;
        java.lang.Class<?> wildcardClass31 = item15.getClass();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 32, 100, 1, 49", 35, (-2));
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 32, 100, 1, 49, 35, -2" + "'", str4, "hi!, 100, 1, 32, 100, 1, 49, 35, -2");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -3, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 31, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 1, 99", (-4), (int) 'a');
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 99, 97", 34, (-2));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        item24.quality = 35;
        java.lang.String str34 = item24.name;
        item24.quality = 34;
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        int int84 = item83.sellIn;
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
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 49 + "'", int84 == 49);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        item3.quality = 49;
        item3.sellIn = (byte) 0;
        java.lang.String str8 = item3.toString();
        item3.quality = 31;
        java.lang.Class<?> wildcardClass11 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 0, 0, 0, 49" + "'", str8, "hi!, 0, 0, 0, 49");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
        int int18 = item8.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 98 + "'", int17 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", (int) '4', (int) '#');
        item3.name = "";
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 100, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, 9");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, -3, 0, 52, -1");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) (byte) 1, 9);
        java.lang.String str4 = item3.name;
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 0" + "'", str4, "hi!, -1, 0");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 51, 0, 0, 50", 0, 51);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        item15.quality = 51;
        java.lang.String str22 = item15.name;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str18, "hi!, 0, 0, 52, 1");
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, 0, 0" + "'", str22, "hi!, 0, 0");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0, -1, -1", 32, 46);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 52, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory15 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory20 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.Item item26 = new com.gildedrose.Item("hi!", 100, 1);
        int int27 = item26.sellIn;
        com.gildedrose.Item item28 = itemUpdater22.update(item26);
        item26.sellIn = (byte) 0;
        com.gildedrose.Item item31 = itemUpdater19.update(item26);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory32 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater34 = itemUpdaterFactory32.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory35 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater37 = itemUpdaterFactory35.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater39 = itemUpdaterFactory35.getInstance("");
        com.gildedrose.Item item43 = new com.gildedrose.Item("hi!", 100, 1);
        int int44 = item43.sellIn;
        com.gildedrose.Item item45 = itemUpdater39.update(item43);
        com.gildedrose.Item item46 = itemUpdater34.update(item45);
        com.gildedrose.Item item47 = itemUpdater19.update(item46);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory48 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater50 = itemUpdaterFactory48.getInstance("");
        com.gildedrose.Item item54 = new com.gildedrose.Item("hi!", 100, 1);
        int int55 = item54.sellIn;
        com.gildedrose.Item item56 = itemUpdater50.update(item54);
        com.gildedrose.Item item57 = itemUpdater19.update(item56);
        int int58 = item57.quality;
        java.lang.String str59 = item57.name;
        com.gildedrose.Item item60 = itemUpdater14.update(item57);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(itemUpdater34);
        org.junit.Assert.assertNotNull(itemUpdater37);
        org.junit.Assert.assertNotNull(itemUpdater39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertNotNull(item46);
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertNotNull(itemUpdater50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertNotNull(item56);
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(item60);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 0, 52", 98, 0);
        item3.name = "hi!, 98, 0, 97, 35";
        item3.sellIn = '#';
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 52, 1");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, -1, 52");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 51, 34, -2, 99");
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
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item20 = new com.gildedrose.Item(", 10, 10", (int) (short) 10, (int) (byte) -1);
        item20.name = "hi!, 98, -2";
        com.gildedrose.Item item23 = itemUpdater16.update(item20);
        item20.sellIn = 31;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(item23);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 32, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 98");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, -1, 50");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance(", -1, 9");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 0, -2");
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
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", (int) ' ', (int) (short) 100);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 32, 0", (int) (byte) 10, (int) (byte) 1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 0, 0, 32, 0" + "'", str5, "hi!, 0, 0, 32, 0");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 98, 0", 31, (int) ' ');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        int int7 = item3.quality;
        int int8 = item3.quality;
        java.lang.String str9 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 31, 32" + "'", str9, "hi!, 31, 32");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        int int9 = item4.quality;
        item4.name = "hi!";
        int int12 = item4.sellIn;
        item4.name = "hi!, 10, 0, 10, 1, 1, -1";
        java.lang.String str15 = item4.name;
        java.lang.String str16 = item4.name;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 10, 0, 10, 1, 1, -1" + "'", str15, "hi!, 10, 0, 10, 1, 1, -1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 10, 0, 10, 1, 1, -1" + "'", str16, "hi!, 10, 0, 10, 1, 1, -1");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        item51.quality = (short) 100;
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
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory13 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.Item item21 = new com.gildedrose.Item("hi!", 100, 1);
        int int22 = item21.sellIn;
        com.gildedrose.Item item23 = itemUpdater17.update(item21);
        java.lang.String str24 = item21.toString();
        item21.sellIn = 10;
        java.lang.String str27 = item21.toString();
        item21.sellIn = 1;
        item21.quality = 99;
        item21.name = "hi!";
        int int34 = item21.sellIn;
        int int35 = item21.quality;
        int int36 = item21.sellIn;
        com.gildedrose.Item item37 = itemUpdater12.update(item21);
        item37.name = ", 1, 32, 34, 0";
        int int40 = item37.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!, 99, 0" + "'", str24, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!, 10, 0" + "'", str27, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 99 + "'", int35 == 99);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        item66.sellIn = (-4);
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
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        int int10 = item6.sellIn;
        int int11 = item6.quality;
        java.lang.String str12 = item6.name;
        int int13 = item6.quality;
        int int14 = item6.sellIn;
        item6.quality = 50;
        item6.name = "hi!, -1, 1, 10, 32";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 0, (int) (byte) 10);
        int int4 = item3.sellIn;
        item3.name = "hi!, 100, 1, 32, 100, 1, 49";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, -2, -1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 51, 0, 97, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 32, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 98");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, -1, 50");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item17 = new com.gildedrose.Item("hi!", 100, 1);
        int int18 = item17.sellIn;
        com.gildedrose.Item item19 = conjuredItemUpdater13.update(item17);
        com.gildedrose.Item item20 = itemUpdater12.update(item19);
        item19.sellIn = 48;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(item20);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater32 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item36 = new com.gildedrose.Item("hi!", 100, 1);
        int int37 = item36.sellIn;
        com.gildedrose.Item item38 = conjuredItemUpdater32.update(item36);
        com.gildedrose.Item item42 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str43 = item42.name;
        java.lang.String str44 = item42.name;
        int int45 = item42.quality;
        java.lang.String str46 = item42.toString();
        com.gildedrose.Item item47 = conjuredItemUpdater32.update(item42);
        com.gildedrose.Item item48 = itemUpdater12.update(item42);
        java.lang.String str49 = item42.name;
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(item38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!, 100, 1" + "'", str46, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 97, 50", 50, (int) '#');
        item3.quality = (byte) -1;
        item3.quality = 0;
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.name;
        item3.sellIn = (short) 100;
        item3.quality = 10;
        java.lang.Class<?> wildcardClass11 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        int int25 = item24.quality;
        int int26 = item24.quality;
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 50 + "'", int26 == 50);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        int int77 = item72.sellIn;
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
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-3) + "'", int77 == (-3));
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        java.lang.String str41 = item40.name;
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!, 99, 0" + "'", str41, "hi!, 99, 0");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance(", -1, 9, 97, -2");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance(", 0, 0");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 1, 97, 50");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory19 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory19.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory22 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.Item item30 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item30.sellIn = 52;
        int int33 = item30.quality;
        com.gildedrose.Item item34 = itemUpdater26.update(item30);
        com.gildedrose.Item item35 = itemUpdater21.update(item34);
        item35.quality = 96;
        int int38 = item35.sellIn;
        com.gildedrose.Item item39 = itemUpdater18.update(item35);
        item39.quality = 1;
        item39.quality = (byte) -1;
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
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 50 + "'", int38 == 50);
        org.junit.Assert.assertNotNull(item39);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!", 100, 1);
        com.gildedrose.Item item11 = conjuredItemUpdater0.update(item10);
        item10.name = ", 1, 32, 98, 0";
        item10.sellIn = (short) 100;
        java.lang.Class<?> wildcardClass16 = item10.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 98, 99", 32, (-2));
        java.lang.String str4 = item3.toString();
        item3.name = "hi!, 99, 49";
        int int7 = item3.sellIn;
        item3.sellIn = 50;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 0, 98, 99, 32, -2" + "'", str4, "hi!, 1, 0, 98, 99, 32, -2");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        item26.sellIn = 48;
        java.lang.String str37 = item26.toString();
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!, 100, 1, 48, 0" + "'", str37, "hi!, 100, 1, 48, 0");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', 1);
        int int4 = item3.sellIn;
        item3.name = "hi!";
        item3.name = "hi!, 100, 1, 10, 0";
        java.lang.String str9 = item3.toString();
        item3.sellIn = 99;
        int int12 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 100, 1, 10, 0, 52, 1" + "'", str9, "hi!, 100, 1, 10, 0, 52, 1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        item30.name = "hi!, 10, 0, 10, 1, 1, -1, 52, 100";
        int int48 = item30.quality;
        item30.quality = ' ';
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        int int34 = item31.sellIn;
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-2) + "'", int34 == (-2));
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50, 10, -1", (int) (short) 0, 8);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 98, 0, 52, 0", 8, (int) (byte) -1);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance(", 0, 50, 10, -1");
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!, -1, 0", 51, 97);
        com.gildedrose.Item item11 = itemUpdater6.update(item10);
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!, 10, 0, 10, 1", 51, 9);
        item15.quality = 'a';
        java.lang.String str18 = item15.toString();
        com.gildedrose.Item item19 = itemUpdater6.update(item15);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory20 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory20.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory20.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory20.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory20.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item34 = new com.gildedrose.Item("", 1, (int) ' ');
        java.lang.String str35 = item34.name;
        item34.sellIn = 'a';
        com.gildedrose.Item item38 = itemUpdater30.update(item34);
        com.gildedrose.Item item39 = itemUpdater6.update(item34);
        com.gildedrose.Item item43 = new com.gildedrose.Item("hi!, 100, 1", (int) (byte) 10, (int) (short) 100);
        com.gildedrose.Item item44 = itemUpdater6.update(item43);
        item44.sellIn = (-1);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 10, 0, 10, 1, 51, 97" + "'", str18, "hi!, 10, 0, 10, 1, 51, 97");
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(item38);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertNotNull(item44);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) (short) 100, (int) '4');
        item3.sellIn = 'a';
        item3.sellIn = (byte) -1;
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        int int9 = item4.quality;
        item4.name = "hi!";
        int int12 = item4.sellIn;
        item4.name = "hi!, 10, 0, 10, 1, 1, -1";
        item4.quality = (byte) 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50", 0, (int) '#');
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 32, 100, 1, 49", 96, (int) (short) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        java.lang.Class<?> wildcardClass7 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 32, 100, 1, 49" + "'", str4, "hi!, 100, 1, 32, 100, 1, 49");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 100, 1, 32, 100, 1, 49" + "'", str5, "hi!, 100, 1, 32, 100, 1, 49");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 98, 0, 96, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1, 1, 10");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory11.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory11.getInstance("hi!, 99, 0");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater18 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item22 = new com.gildedrose.Item("hi!", 100, 1);
        int int23 = item22.sellIn;
        com.gildedrose.Item item24 = conjuredItemUpdater18.update(item22);
        item22.name = "hi!, 0, 0";
        int int27 = item22.quality;
        com.gildedrose.Item item28 = itemUpdater17.update(item22);
        item22.sellIn = 52;
        com.gildedrose.Item item31 = itemUpdater10.update(item22);
        int int32 = item31.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        item42.quality = (-2);
        java.lang.String str46 = item42.name;
        int int47 = item42.quality;
        java.lang.String str48 = item42.name;
        java.lang.String str49 = item42.name;
        int int50 = item42.sellIn;
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-2) + "'", int47 == (-2));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 98 + "'", int50 == 98);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (short) 0, 52);
        item3.sellIn = (short) 10;
        item3.name = ", 0, 50, 1, 100, 99, 0";
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        item3.name = "hi!, 0, 0";
        item3.quality = (byte) -1;
        java.lang.String str9 = item3.name;
        int int10 = item3.sellIn;
        int int11 = item3.quality;
        int int12 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 0, 0" + "'", str9, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 98, 0, 96, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1, 1, 10");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, -1, 50");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1, 98, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        item3.name = "hi!, 100, 1";
        java.lang.String str7 = item3.name;
        item3.sellIn = 1;
        java.lang.String str10 = item3.name;
        java.lang.String str11 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 100, 1" + "'", str7, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 100, 1" + "'", str10, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 100, 1, 1, 1" + "'", str11, "hi!, 100, 1, 1, 1");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 99");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 10, 0");
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!, 51, 0", 1, 97);
        com.gildedrose.Item item11 = itemUpdater6.update(item10);
        int int12 = item10.quality;
        item10.name = "";
        item10.quality = (byte) 0;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 0, 1", 46, 0);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 9, 1, 97, 98", 51, 100);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        item15.name = "hi!, 100, 1";
        item15.sellIn = 10;
        item15.sellIn = (byte) 10;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(item16);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 52, 52");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 49, 48", (int) (byte) 1, 8);
        item3.sellIn = (-1);
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 0, 0, 99, 0, 49, 48, -1, 8" + "'", str6, "hi!, 0, 0, 99, 0, 49, 48, -1, 8");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
        item41.quality = 0;
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
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, -3, 0");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 1, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory0.getInstance("");
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
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1", (int) (byte) 10, 98);
        java.lang.String str4 = item3.toString();
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, 0, 10, 1, 10, 98" + "'", str4, "hi!, 10, 0, 10, 1, 10, 98");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 10, 0, 10, 1, 10, 98" + "'", str5, "hi!, 10, 0, 10, 1, 10, 98");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        item15.name = ", 1, 32";
        java.lang.String str21 = item15.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ", 1, 32, 51, 0" + "'", str21, ", 1, 32, 51, 0");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        int int34 = item29.quality;
        int int35 = item29.sellIn;
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 98 + "'", int35 == 98);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
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
        java.lang.String str31 = item30.toString();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!, 100, 1, 9, 0" + "'", str31, "hi!, 100, 1, 9, 0");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0", 98, 99);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        item3.quality = 48;
        item3.name = "hi!, 50, 0";
        item3.name = "hi!, 100, 1, 32, 100, -2, 1";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 0" + "'", str4, "hi!, 1, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 1, 0, 98, 99" + "'", str5, "hi!, 1, 0, 98, 99");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49", (-2), (int) '4');
        int int4 = item3.sellIn;
        item3.sellIn = 34;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
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
        com.gildedrose.ItemUpdater itemUpdater37 = itemUpdaterFactory33.getInstance("");
        com.gildedrose.Item item41 = new com.gildedrose.Item("hi!", 100, 1);
        int int42 = item41.sellIn;
        com.gildedrose.Item item43 = itemUpdater37.update(item41);
        java.lang.String str44 = item41.toString();
        item41.sellIn = 10;
        java.lang.String str47 = item41.toString();
        item41.sellIn = 1;
        item41.quality = 99;
        item41.name = "hi!";
        com.gildedrose.Item item54 = itemUpdater4.update(item41);
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
        org.junit.Assert.assertNotNull(itemUpdater37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!, 99, 0" + "'", str44, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!, 10, 0" + "'", str47, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item54);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        java.lang.Class<?> wildcardClass5 = itemUpdaterFactory0.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 9, 1, 97, 50", (int) (byte) 1, 9);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 9, 1, 97, 50" + "'", str4, "hi!, 100, 1, 9, 1, 97, 50");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 98");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item13 = new com.gildedrose.Item("hi!", 100, 1);
        int int14 = item13.sellIn;
        com.gildedrose.Item item15 = conjuredItemUpdater9.update(item13);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory16.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory16.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory16.getInstance("hi!, 0, 0, 99, 0");
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
        com.gildedrose.Item item47 = itemUpdater24.update(item40);
        com.gildedrose.Item item48 = conjuredItemUpdater9.update(item40);
        int int49 = item48.quality;
        item48.quality = 49;
        java.lang.String str52 = item48.toString();
        com.gildedrose.Item item53 = itemUpdater8.update(item48);
        item53.name = "hi!, 50, 0, 98, 48";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertNotNull(itemUpdater36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(item42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!, 0, 0" + "'", str45, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item46);
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!, -3, 49" + "'", str52, "hi!, -3, 49");
        org.junit.Assert.assertNotNull(item53);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
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
        item64.sellIn = (-4);
        java.lang.Class<?> wildcardClass67 = item64.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 98, 98", 1, 52);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
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
        item32.name = "hi!, 0, 0, 51, 0";
        java.lang.String str38 = item32.name;
        java.lang.Class<?> wildcardClass39 = item32.getClass();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!, 0, 0, 51, 0" + "'", str38, "hi!, 0, 0, 51, 0");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        java.lang.String str6 = item3.name;
        int int7 = item3.sellIn;
        item3.quality = 1;
        java.lang.String str10 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 99, 0" + "'", str6, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 99, 0" + "'", str10, "hi!, 99, 0");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 100, 0", 96, 49);
        item3.sellIn = 96;
        int int6 = item3.quality;
        item3.quality = (byte) 100;
        item3.sellIn = 8;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
        item15.sellIn = 0;
        int int27 = item15.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        item35.sellIn = (short) -1;
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
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
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
        int int52 = item49.quality;
        int int53 = item49.sellIn;
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        int int20 = item15.sellIn;
        java.lang.String str21 = item15.name;
        java.lang.String str22 = item15.name;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str18, "hi!, 0, 0, 52, 1");
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 51 + "'", int20 == 51);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 0, 0" + "'", str21, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, 0, 0" + "'", str22, "hi!, 0, 0");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -4, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 50");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 52, 32, 1");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, -1, 10, 100", 96, 9);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        item11.quality = (short) 0;
        java.lang.Class<?> wildcardClass19 = item11.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 52, 0", 30, (int) (short) 1);
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        item3.sellIn = (-4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0, 52, 0, 30, 1" + "'", str4, "hi!, 0, 0, 52, 0, 30, 1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.Item item12 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        item12.quality = '4';
        com.gildedrose.Item item15 = itemUpdater8.update(item12);
        java.lang.String str16 = item12.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ", 0, 50" + "'", str16, ", 0, 50");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 100, 52, 99, 0", (int) (short) 10, 31);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        java.lang.String str9 = item8.name;
        int int10 = item8.quality;
        java.lang.String str11 = item8.name;
        java.lang.Class<?> wildcardClass12 = item8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        int int10 = item6.sellIn;
        int int11 = item6.quality;
        int int12 = item6.quality;
        int int13 = item6.sellIn;
        item6.name = "hi!, 100, 1, -2, 0";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        item32.sellIn = '4';
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
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        java.lang.String str6 = item3.name;
        item3.quality = (byte) -1;
        item3.quality = 9;
        java.lang.Class<?> wildcardClass11 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 99, 0" + "'", str6, "hi!, 99, 0");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
        item34.name = "hi!, 100, -1";
        item34.name = "hi!, 34, 0";
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
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 100, 0", 96, 49);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        item3.quality = 0;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 100, 0" + "'", str4, "hi!, 100, 1, 100, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 100, 1, 100, 0, 96, 49" + "'", str5, "hi!, 100, 1, 100, 0, 96, 49");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 98, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
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
        java.lang.String str46 = item30.toString();
        java.lang.String str47 = item30.toString();
        java.lang.Class<?> wildcardClass48 = item30.getClass();
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!, 100, 1, 9, 1, 9, 0" + "'", str46, "hi!, 100, 1, 9, 1, 9, 0");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!, 100, 1, 9, 1, 9, 0" + "'", str47, "hi!, 100, 1, 9, 1, 9, 0");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 98, -2, 98, 0");
        java.lang.Class<?> wildcardClass11 = itemUpdater10.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item14 = new com.gildedrose.Item("", (int) '4', 1);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        item15.sellIn = 96;
        item15.quality = 100;
        int int20 = item15.sellIn;
        java.lang.Class<?> wildcardClass21 = item15.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 96 + "'", int20 == 96);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        int int9 = item4.quality;
        item4.name = "hi!";
        int int12 = item4.sellIn;
        item4.sellIn = 0;
        java.lang.String str15 = item4.toString();
        int int16 = item4.sellIn;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 0, 0" + "'", str15, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 0, 10", 51, 0);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        java.lang.String str23 = item15.name;
        java.lang.String str24 = item15.name;
        int int25 = item15.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, -1, 0" + "'", str22, "hi!, -1, 0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        int int6 = item3.quality;
        item3.quality = (short) 10;
        java.lang.String str9 = item3.toString();
        int int10 = item3.quality;
        item3.name = "hi!, -1, 0, -2, 0";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 100, 10" + "'", str9, "hi!, 100, 10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        item3.name = "hi!, 0, 0";
        item3.quality = (byte) -1;
        item3.name = "hi!, 100, 1, 10, 0";
        item3.quality = (-1);
        int int13 = item3.quality;
        item3.sellIn = 98;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', 1);
        int int4 = item3.sellIn;
        item3.name = "hi!";
        int int7 = item3.sellIn;
        java.lang.String str8 = item3.name;
        item3.quality = 'a';
        item3.sellIn = (short) 1;
        java.lang.String str13 = item3.toString();
        item3.name = "hi!, 10, 0, 100, 0, -1, 32";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 1, 97" + "'", str13, "hi!, 1, 97");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        int int73 = item72.sellIn;
        java.lang.String str74 = item72.name;
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
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-3) + "'", int73 == (-3));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
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
        java.lang.String str17 = item10.name;
        int int18 = item10.sellIn;
        item10.name = "hi!, 100, -1, -2, 49";
        java.lang.String str21 = item10.name;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1" + "'", str14, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 100, -1, -2, 49" + "'", str21, "hi!, 100, -1, -2, 49");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 1, 0, 32", (int) (short) 0, 10);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1, 52, 52, -1, 0", 50, 0);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        item31.name = "hi!, 99, 0";
        item31.name = "hi!, 0, 0, 50, 0";
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
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        int int11 = item8.sellIn;
        java.lang.String str12 = item8.name;
        int int13 = item8.sellIn;
        item8.quality = '#';
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
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
        com.gildedrose.Item item76 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        java.lang.String str77 = item76.toString();
        item76.quality = '4';
        int int80 = item76.quality;
        com.gildedrose.Item item81 = conjuredItemUpdater0.update(item76);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory82 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater84 = itemUpdaterFactory82.getInstance("");
        com.gildedrose.Item item88 = new com.gildedrose.Item("hi!", 100, 1);
        int int89 = item88.sellIn;
        com.gildedrose.Item item90 = itemUpdater84.update(item88);
        int int91 = item88.sellIn;
        int int92 = item88.sellIn;
        java.lang.String str93 = item88.toString();
        item88.quality = 98;
        com.gildedrose.Item item96 = conjuredItemUpdater0.update(item88);
        java.lang.String str97 = item88.name;
        item88.quality = 9;
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
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + ", 1, 32" + "'", str77, ", 1, 32");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 52 + "'", int80 == 52);
        org.junit.Assert.assertNotNull(item81);
        org.junit.Assert.assertNotNull(itemUpdater84);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 100 + "'", int89 == 100);
        org.junit.Assert.assertNotNull(item90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 99 + "'", int91 == 99);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 99 + "'", int92 == 99);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi!, 99, 0" + "'", str93, "hi!, 99, 0");
        org.junit.Assert.assertNotNull(item96);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "hi!" + "'", str97, "hi!");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1, 52, 100, 97, 97", (int) (byte) 1, 9);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
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
        item38.quality = 1;
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
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
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
        item15.name = "";
        item15.name = "hi!, -4, 0";
        java.lang.String str30 = item15.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!, -4, 0, -1, 0" + "'", str30, "hi!, -4, 0, -1, 0");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 9", 0, 96);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
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
        int int25 = item23.quality;
        int int26 = item23.sellIn;
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory29 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater31 = itemUpdaterFactory29.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory29.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory29.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater37 = itemUpdaterFactory29.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item41 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item42 = itemUpdater37.update(item41);
        item42.quality = 35;
        int int45 = item42.sellIn;
        item42.sellIn = (short) 10;
        com.gildedrose.Item item48 = itemUpdater10.update(item42);
        java.lang.String str49 = item48.toString();
        java.lang.Class<?> wildcardClass50 = item48.getClass();
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
        org.junit.Assert.assertNotNull(itemUpdater31);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertNotNull(itemUpdater37);
        org.junit.Assert.assertNotNull(item42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!, 0, 0, 9, 34" + "'", str49, "hi!, 0, 0, 9, 34");
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -4, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 50");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 1, 9, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory11.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory11.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item23 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item24 = itemUpdater19.update(item23);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory25 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory25.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory25.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory30 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater32 = itemUpdaterFactory30.getInstance("");
        com.gildedrose.Item item36 = new com.gildedrose.Item("hi!", 100, 1);
        int int37 = item36.sellIn;
        com.gildedrose.Item item38 = itemUpdater32.update(item36);
        item36.sellIn = (byte) 0;
        com.gildedrose.Item item41 = itemUpdater29.update(item36);
        com.gildedrose.Item item42 = itemUpdater19.update(item41);
        com.gildedrose.Item item46 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str47 = item46.name;
        java.lang.String str48 = item46.toString();
        com.gildedrose.Item item49 = itemUpdater19.update(item46);
        item46.name = "hi!, 98, -2";
        com.gildedrose.Item item52 = itemUpdater10.update(item46);
        int int53 = item52.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater29);
        org.junit.Assert.assertNotNull(itemUpdater32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(item38);
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertNotNull(item42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!, 0, 0" + "'", str47, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!, 0, 0, 32, 0" + "'", str48, "hi!, 0, 0, 32, 0");
        org.junit.Assert.assertNotNull(item49);
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 30 + "'", int53 == 30);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
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
        item15.sellIn = 49;
        java.lang.String str24 = item15.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!, 49, 0" + "'", str24, "hi!, 49, 0");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
        item28.quality = 'a';
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
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
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
        int int18 = item8.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        int int9 = item4.quality;
        item4.quality = (short) -1;
        item4.name = "hi!";
        item4.name = "hi!, 0, 0, 0, 1";
        int int16 = item4.quality;
        item4.quality = (-1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance(", 0, 50, 10, -1");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory39 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater41 = itemUpdaterFactory39.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater43 = itemUpdaterFactory39.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater45 = itemUpdaterFactory39.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater47 = itemUpdaterFactory39.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater49 = itemUpdaterFactory39.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater51 = itemUpdaterFactory39.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater53 = itemUpdaterFactory39.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory54 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater56 = itemUpdaterFactory54.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory57 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater59 = itemUpdaterFactory57.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater61 = itemUpdaterFactory57.getInstance("");
        com.gildedrose.Item item65 = new com.gildedrose.Item("hi!", 100, 1);
        int int66 = item65.sellIn;
        com.gildedrose.Item item67 = itemUpdater61.update(item65);
        com.gildedrose.Item item68 = itemUpdater56.update(item67);
        int int69 = item68.sellIn;
        int int70 = item68.quality;
        item68.quality = (short) 10;
        java.lang.String str73 = item68.name;
        com.gildedrose.Item item74 = itemUpdater53.update(item68);
        com.gildedrose.Item item75 = itemUpdater15.update(item74);
        com.gildedrose.Item item79 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", 9, (int) 'a');
        com.gildedrose.Item item80 = itemUpdater15.update(item79);
        item79.sellIn = 50;
        java.lang.String str83 = item79.name;
        com.gildedrose.Item item84 = itemUpdater6.update(item79);
        com.gildedrose.Item item85 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.gildedrose.Item item86 = itemUpdater6.update(item85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
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
        org.junit.Assert.assertNotNull(itemUpdater41);
        org.junit.Assert.assertNotNull(itemUpdater43);
        org.junit.Assert.assertNotNull(itemUpdater45);
        org.junit.Assert.assertNotNull(itemUpdater47);
        org.junit.Assert.assertNotNull(itemUpdater49);
        org.junit.Assert.assertNotNull(itemUpdater51);
        org.junit.Assert.assertNotNull(itemUpdater53);
        org.junit.Assert.assertNotNull(itemUpdater56);
        org.junit.Assert.assertNotNull(itemUpdater59);
        org.junit.Assert.assertNotNull(itemUpdater61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 100 + "'", int66 == 100);
        org.junit.Assert.assertNotNull(item67);
        org.junit.Assert.assertNotNull(item68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 98 + "'", int69 == 98);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertNotNull(item74);
        org.junit.Assert.assertNotNull(item75);
        org.junit.Assert.assertNotNull(item80);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str83, "hi!, 0, 0, 99, 0");
        org.junit.Assert.assertNotNull(item84);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
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
        item8.quality = 49;
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
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 51, 0", (-2), 31);
        item3.quality = 98;
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 0, 0, 51, 0, -2, 98" + "'", str6, "hi!, 0, 0, 51, 0, -2, 98");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        item8.name = "hi!, -1, 0";
        item8.sellIn = (byte) 100;
        item8.name = "hi!, 0, 0, 32, 1";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
        java.lang.String str45 = item41.name;
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
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 0", 51, 99);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
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
        com.gildedrose.Item item71 = new com.gildedrose.Item("hi!, -1, 1", (int) ' ', (int) ' ');
        item71.name = "hi!, 0, 0, 99, 0, 51, 50";
        com.gildedrose.Item item74 = itemUpdater4.update(item71);
        int int75 = item71.quality;
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
        org.junit.Assert.assertNotNull(item74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 31 + "'", int75 == 31);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 51, 0", (-2), 31);
        item3.quality = 98;
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.name;
        item3.name = "hi!, -1, 52, 0, 100";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 0, 0, 51, 0" + "'", str6, "hi!, 0, 0, 51, 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 0, 0, 51, 0" + "'", str7, "hi!, 0, 0, 51, 0");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -2, 50", 1, 96);
        int int4 = item3.sellIn;
        item3.sellIn = (-3);
        item3.sellIn = 99;
        item3.name = "hi!, 0, 0, 31, 97";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1", 52, 100);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        item22.name = ", 0, 50";
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
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory3 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory3.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory3.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory3.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory3.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory14 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory23 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory23.getInstance("");
        com.gildedrose.Item item29 = new com.gildedrose.Item("hi!", 100, 1);
        int int30 = item29.sellIn;
        com.gildedrose.Item item31 = itemUpdater25.update(item29);
        item29.sellIn = (byte) 0;
        java.lang.String str34 = item29.toString();
        com.gildedrose.Item item35 = itemUpdater16.update(item29);
        item35.quality = '4';
        java.lang.String str38 = item35.name;
        com.gildedrose.Item item39 = itemUpdater13.update(item35);
        com.gildedrose.Item item40 = itemUpdater2.update(item35);
        int int41 = item40.sellIn;
        java.lang.Class<?> wildcardClass42 = item40.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!, 0, 0" + "'", str34, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertNotNull(item40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-3) + "'", int41 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 0, 52");
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
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        item3.quality = 1;
        int int6 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 32");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 1, 0, 0, 52, -2, 52");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance(", 0, 50, 1, 100, -1, 100");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 98, 0, 97, 35");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, -1, 50");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance(", 96, 31");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0, -2, 0", 31, 0);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 0, -2, 0, 31, 0" + "'", str4, "hi!, -1, 0, -2, 0, 31, 0");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 52, 0, 30, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 100, 52, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 51, 0, 0, 50");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 98, 8", 0, 52);
        item3.sellIn = 48;
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str9 = item8.name;
        java.lang.String str10 = item8.toString();
        com.gildedrose.Item item11 = itemUpdater4.update(item8);
        item8.sellIn = (byte) -1;
        item8.quality = 32;
        java.lang.String str16 = item8.name;
        item8.name = "hi!, 100, -1, 10, 100, -2, 0";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 0, 0" + "'", str9, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str10, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 0, 0" + "'", str16, "hi!, 0, 0");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 96", (int) (byte) 10, 31);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 99, 0);
        item3.name = "hi!, 99, 1, 49, 0";
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        int int5 = item3.quality;
        item3.name = "";
        java.lang.String str8 = item3.toString();
        int int9 = item3.quality;
        item3.name = "hi!, 0, 0, 51, 0, -2, 98";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 100, 1" + "'", str8, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
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
        item8.quality = 'a';
        int int21 = item8.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
        java.lang.Class<?> wildcardClass31 = item17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -2, 50", 1, 96);
        item3.name = "hi!, 99, 0, 100, 52";
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 31, (int) (short) 100);
        item3.name = "hi!, 0, 0, 52, 1";
        item3.sellIn = (byte) 1;
        java.lang.String str8 = item3.toString();
        item3.name = "hi!, 1, 0, 0, 52, -2, 52";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 0, 0, 52, 1, 1, 100" + "'", str8, "hi!, 0, 0, 52, 1, 1, 100");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
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
        com.gildedrose.Item item81 = new com.gildedrose.Item("hi!, -1, 0", (int) (byte) -1, (int) (short) 0);
        java.lang.String str82 = item81.toString();
        com.gildedrose.Item item83 = itemUpdater2.update(item81);
        java.lang.String str84 = item81.name;
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
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!, -1, 0, -1, 0" + "'", str82, "hi!, -1, 0, -1, 0");
        org.junit.Assert.assertNotNull(item83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!, -1, 0" + "'", str84, "hi!, -1, 0");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 1, 97, 50");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 100, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 51, 0, -2, 98");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 98");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 51, 0", 9, 10);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        item12.name = "hi!, 100, -1, -2, 97";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 32, 99", 10, 98);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
        item26.quality = (short) 0;
        java.lang.Class<?> wildcardClass34 = item26.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
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
        java.lang.String str40 = item37.name;
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
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
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater18 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item22 = new com.gildedrose.Item("hi!", 100, 1);
        int int23 = item22.sellIn;
        com.gildedrose.Item item24 = conjuredItemUpdater18.update(item22);
        item22.name = "hi!, 0, 0";
        int int27 = item22.quality;
        com.gildedrose.Item item28 = itemUpdater17.update(item22);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory29 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater31 = itemUpdaterFactory29.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory29.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory29.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater37 = itemUpdaterFactory29.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item41 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str42 = item41.name;
        int int43 = item41.sellIn;
        com.gildedrose.Item item44 = itemUpdater37.update(item41);
        int int45 = item44.quality;
        com.gildedrose.Item item46 = itemUpdater17.update(item44);
        com.gildedrose.Item item47 = itemUpdater10.update(item46);
        item47.name = "hi!, -3, 0, 52, -1";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(itemUpdater31);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertNotNull(itemUpdater37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!, 0, 0" + "'", str42, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(item46);
        org.junit.Assert.assertNotNull(item47);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
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
        item89.name = "hi!, 99, 0, 51, 0";
        int int94 = item89.quality;
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
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49", 35, (-1));
        item3.name = ", 1, 99";
        java.lang.String str6 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 1, 99" + "'", str6, ", 1, 99");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.name;
        item3.name = "hi!, 100, 52";
        item3.sellIn = ' ';
        item3.quality = (byte) -1;
        int int13 = item3.sellIn;
        item3.quality = 98;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
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
        int int37 = item29.quality;
        item29.sellIn = (byte) 0;
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
        item27.sellIn = (byte) 0;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(item27);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 8, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance(", 99, -1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 52");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance(", -1, 9, 97, -2");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory17.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory17.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory24 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory24.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory24.getInstance("hi!, -1, 0");
        com.gildedrose.Item item32 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str33 = item32.name;
        java.lang.String str34 = item32.toString();
        com.gildedrose.Item item35 = itemUpdater28.update(item32);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory36 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory36.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater40 = itemUpdaterFactory36.getInstance("");
        com.gildedrose.Item item44 = new com.gildedrose.Item("hi!", 100, 1);
        int int45 = item44.sellIn;
        com.gildedrose.Item item46 = itemUpdater40.update(item44);
        java.lang.String str47 = item44.toString();
        item44.sellIn = 10;
        java.lang.String str50 = item44.toString();
        item44.sellIn = 98;
        int int53 = item44.sellIn;
        com.gildedrose.Item item54 = itemUpdater28.update(item44);
        com.gildedrose.Item item55 = itemUpdater23.update(item54);
        int int56 = item55.sellIn;
        com.gildedrose.Item item57 = itemUpdater16.update(item55);
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
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!, 0, 0" + "'", str33, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str34, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertNotNull(itemUpdater40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertNotNull(item46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!, 99, 0" + "'", str47, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!, 10, 0" + "'", str50, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 98 + "'", int53 == 98);
        org.junit.Assert.assertNotNull(item54);
        org.junit.Assert.assertNotNull(item55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 96 + "'", int56 == 96);
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 8", (int) 'a', 96);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 51, 0, 98, 0", 52, 50);
        java.lang.String str4 = item3.name;
        int int5 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 51, 0, 98, 0" + "'", str4, "hi!, 51, 0, 98, 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 50 + "'", int5 == 50);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
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
        int int47 = item46.quality;
        java.lang.String str48 = item46.name;
        java.lang.Class<?> wildcardClass49 = item46.getClass();
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 9 + "'", int47 == 9);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
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
        java.lang.Class<?> wildcardClass54 = item53.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
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
        item29.name = "";
        java.lang.Class<?> wildcardClass38 = item29.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
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
        int int80 = item74.quality;
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
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
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
        int int71 = item70.sellIn;
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
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 98 + "'", int71 == 98);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.Item item16 = new com.gildedrose.Item("hi!, 100, 1, 100, 0", 96, 49);
        java.lang.String str17 = item16.name;
        com.gildedrose.Item item18 = itemUpdater12.update(item16);
        item18.quality = 0;
        item18.sellIn = (byte) 1;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 100, 1, 100, 0" + "'", str17, "hi!, 100, 1, 100, 0");
        org.junit.Assert.assertNotNull(item18);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 48", (int) (byte) 0, 8);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", (int) (byte) 1, (int) (short) 1);
        int int4 = item3.quality;
        item3.sellIn = (-2);
        int int7 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        item3.sellIn = 99;
        item3.name = "";
        item3.quality = 'a';
        int int10 = item3.sellIn;
        int int11 = item3.sellIn;
        item3.name = ", 99, -1";
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50", (int) (short) 1, (int) (short) 100);
        java.lang.String str4 = item3.toString();
        item3.quality = (byte) 100;
        java.lang.String str7 = item3.toString();
        int int8 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 0, 50, 1, 100" + "'", str4, ", 0, 50, 1, 100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 0, 50, 1, 100" + "'", str7, ", 0, 50, 1, 100");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 9, 1, 97, 50", (int) (byte) 1, 9);
        item3.sellIn = 95;
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 97, 50");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
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
        java.lang.String str24 = item13.toString();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!, 0, 0" + "'", str24, "hi!, 0, 0");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
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
        java.lang.String str53 = item49.toString();
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!, 100, -1, 10, 100, 31, 9" + "'", str53, "hi!, 100, -1, 10, 100, 31, 9");
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
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
        item33.sellIn = (short) -1;
        java.lang.String str43 = item33.toString();
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!, 100, 1, -1, 0" + "'", str43, "hi!, 100, 1, -1, 0");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 1, 99", 0, 32);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 1, 99" + "'", str4, ", 1, 99");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
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
        java.lang.String str37 = item36.toString();
        item36.quality = (short) 10;
        java.lang.String str40 = item36.name;
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
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
        item35.name = "hi!, 100, 1, 10, 0";
        int int41 = item35.sellIn;
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 31 + "'", int41 == 31);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 49, 32");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
        item53.sellIn = 96;
        java.lang.String str56 = item53.toString();
        item53.quality = 50;
        item53.name = "hi!, 99, 0, 98, 0";
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
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!, 96, 0" + "'", str56, "hi!, 96, 0");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 98");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, 1, 49");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance(", 1, 32, 98, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory9.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory9.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory9.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item23 = new com.gildedrose.Item("", (int) '4', 1);
        com.gildedrose.Item item24 = itemUpdater19.update(item23);
        int int25 = item24.sellIn;
        com.gildedrose.Item item26 = itemUpdater8.update(item24);
        java.lang.String str27 = item24.toString();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 51 + "'", int25 == 51);
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ", 50, 0" + "'", str27, ", 50, 0");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        item85.quality = 48;
        item85.name = "hi!, 51, 0, 98, 0";
        java.lang.String str90 = item85.toString();
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
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!, 51, 0, 98, 0, 96, 48" + "'", str90, "hi!, 51, 0, 98, 0, 96, 48");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 51, 34", 31, (int) (short) 10);
        int int4 = item3.sellIn;
        item3.quality = '#';
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 99");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -1, 1, 10, 32");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 9");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 31, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory29 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater31 = itemUpdaterFactory29.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory29.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory29.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater37 = itemUpdaterFactory29.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item41 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item42 = itemUpdater37.update(item41);
        item42.quality = 35;
        int int45 = item42.sellIn;
        item42.sellIn = (short) 10;
        com.gildedrose.Item item48 = itemUpdater10.update(item42);
        java.lang.String str49 = item48.toString();
        int int50 = item48.quality;
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
        org.junit.Assert.assertNotNull(itemUpdater31);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertNotNull(itemUpdater37);
        org.junit.Assert.assertNotNull(item42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!, 0, 0, 9, 34" + "'", str49, "hi!, 0, 0, 9, 34");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 34 + "'", int50 == 34);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
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
        item26.sellIn = 48;
        int int37 = item26.sellIn;
        item26.sellIn = (-4);
        item26.name = "hi!, 99, 0, 0, 10";
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 48 + "'", int37 == 48);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
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
        item56.name = "hi!, 100, 52, 32, 1";
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
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 32, 100, 1, 49, 35, -2", 49, (int) (byte) 1);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
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
        com.gildedrose.Item item30 = new com.gildedrose.Item("hi!", 100, 1);
        int int31 = item30.sellIn;
        com.gildedrose.Item item32 = itemUpdater26.update(item30);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory33 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory33.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory36 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory36.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater40 = itemUpdaterFactory36.getInstance("");
        com.gildedrose.Item item44 = new com.gildedrose.Item("hi!", 100, 1);
        int int45 = item44.sellIn;
        com.gildedrose.Item item46 = itemUpdater40.update(item44);
        com.gildedrose.Item item47 = itemUpdater35.update(item46);
        com.gildedrose.Item item48 = itemUpdater26.update(item47);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory49 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater51 = itemUpdaterFactory49.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater53 = itemUpdaterFactory49.getInstance("");
        com.gildedrose.Item item57 = new com.gildedrose.Item("hi!", 100, 1);
        int int58 = item57.sellIn;
        com.gildedrose.Item item59 = itemUpdater53.update(item57);
        java.lang.String str60 = item57.toString();
        item57.sellIn = 10;
        int int63 = item57.sellIn;
        item57.name = "hi!, 10, 0";
        int int66 = item57.sellIn;
        com.gildedrose.Item item67 = itemUpdater26.update(item57);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory68 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater70 = itemUpdaterFactory68.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater72 = itemUpdaterFactory68.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater74 = itemUpdaterFactory68.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater76 = itemUpdaterFactory68.getInstance("hi!, 100, 52");
        com.gildedrose.Item item80 = new com.gildedrose.Item("hi!, 100, 1", (int) '4', (int) '#');
        com.gildedrose.Item item81 = itemUpdater76.update(item80);
        com.gildedrose.Item item82 = itemUpdater26.update(item80);
        java.lang.String str83 = item80.toString();
        com.gildedrose.Item item84 = itemUpdater10.update(item80);
        item80.name = "hi!, 100, 1, 32, 100, -2, 1";
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertNotNull(itemUpdater40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertNotNull(item46);
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(itemUpdater51);
        org.junit.Assert.assertNotNull(itemUpdater53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertNotNull(item59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!, 99, 0" + "'", str60, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertNotNull(item67);
        org.junit.Assert.assertNotNull(itemUpdater70);
        org.junit.Assert.assertNotNull(itemUpdater72);
        org.junit.Assert.assertNotNull(itemUpdater74);
        org.junit.Assert.assertNotNull(itemUpdater76);
        org.junit.Assert.assertNotNull(item81);
        org.junit.Assert.assertNotNull(item82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!, 100, 1, 50, 33" + "'", str83, "hi!, 100, 1, 50, 33");
        org.junit.Assert.assertNotNull(item84);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
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
        com.gildedrose.Item item72 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        item72.name = "hi!, 52, 1";
        item72.sellIn = 34;
        com.gildedrose.Item item77 = itemUpdater6.update(item72);
        com.gildedrose.Item item81 = new com.gildedrose.Item("hi!, -1, 0, -2, 0", 52, (int) (byte) 1);
        com.gildedrose.Item item82 = itemUpdater6.update(item81);
        java.lang.Class<?> wildcardClass83 = itemUpdater6.getClass();
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
        org.junit.Assert.assertNotNull(item77);
        org.junit.Assert.assertNotNull(item82);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 51, 97", (int) (byte) -1, 0);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        item3.name = "hi!, 10, 0";
        item3.name = "hi!, -1, 1";
        item3.quality = (byte) 0;
        int int10 = item3.sellIn;
        int int11 = item3.sellIn;
        int int12 = item3.sellIn;
        item3.name = "hi!, 99, 0, 98, 0";
        item3.name = "hi!, -1, 0, 1, 0";
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        java.lang.String str4 = item3.toString();
        item3.sellIn = 95;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 10, 0" + "'", str4, "hi!, 100, 1, 10, 0");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
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
        int int17 = item8.sellIn;
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
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
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
        item35.sellIn = 1;
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
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0, -1, 0, -4, 0", (int) (short) -1, 50);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (-2), (int) (short) 0);
        java.lang.String str4 = item3.toString();
        int int5 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", -2, 0" + "'", str4, ", -2, 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
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
        int int50 = item49.quality;
        java.lang.String str51 = item49.toString();
        java.lang.Class<?> wildcardClass52 = item49.getClass();
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
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!, -3, 0" + "'", str51, "hi!, -3, 0");
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
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
        int int86 = item85.sellIn;
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
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 30 + "'", int86 == 30);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 100, 0", 51, (int) '#');
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, 0, 100, 0" + "'", str4, "hi!, 10, 0, 100, 0");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance(", 0, 50, 10, -1");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory39 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater41 = itemUpdaterFactory39.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater43 = itemUpdaterFactory39.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater45 = itemUpdaterFactory39.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater47 = itemUpdaterFactory39.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater49 = itemUpdaterFactory39.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater51 = itemUpdaterFactory39.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater53 = itemUpdaterFactory39.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory54 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater56 = itemUpdaterFactory54.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory57 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater59 = itemUpdaterFactory57.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater61 = itemUpdaterFactory57.getInstance("");
        com.gildedrose.Item item65 = new com.gildedrose.Item("hi!", 100, 1);
        int int66 = item65.sellIn;
        com.gildedrose.Item item67 = itemUpdater61.update(item65);
        com.gildedrose.Item item68 = itemUpdater56.update(item67);
        int int69 = item68.sellIn;
        int int70 = item68.quality;
        item68.quality = (short) 10;
        java.lang.String str73 = item68.name;
        com.gildedrose.Item item74 = itemUpdater53.update(item68);
        com.gildedrose.Item item75 = itemUpdater15.update(item74);
        com.gildedrose.Item item79 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", 9, (int) 'a');
        com.gildedrose.Item item80 = itemUpdater15.update(item79);
        item79.sellIn = 50;
        java.lang.String str83 = item79.name;
        com.gildedrose.Item item84 = itemUpdater6.update(item79);
        item84.name = "hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, -3";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
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
        org.junit.Assert.assertNotNull(itemUpdater41);
        org.junit.Assert.assertNotNull(itemUpdater43);
        org.junit.Assert.assertNotNull(itemUpdater45);
        org.junit.Assert.assertNotNull(itemUpdater47);
        org.junit.Assert.assertNotNull(itemUpdater49);
        org.junit.Assert.assertNotNull(itemUpdater51);
        org.junit.Assert.assertNotNull(itemUpdater53);
        org.junit.Assert.assertNotNull(itemUpdater56);
        org.junit.Assert.assertNotNull(itemUpdater59);
        org.junit.Assert.assertNotNull(itemUpdater61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 100 + "'", int66 == 100);
        org.junit.Assert.assertNotNull(item67);
        org.junit.Assert.assertNotNull(item68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 98 + "'", int69 == 98);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertNotNull(item74);
        org.junit.Assert.assertNotNull(item75);
        org.junit.Assert.assertNotNull(item80);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str83, "hi!, 0, 0, 99, 0");
        org.junit.Assert.assertNotNull(item84);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        item4.sellIn = 46;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 98, 0, 96, 0");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory50 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater52 = itemUpdaterFactory50.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory53 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater55 = itemUpdaterFactory53.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater57 = itemUpdaterFactory53.getInstance("");
        com.gildedrose.Item item61 = new com.gildedrose.Item("hi!", 100, 1);
        int int62 = item61.sellIn;
        com.gildedrose.Item item63 = itemUpdater57.update(item61);
        com.gildedrose.Item item64 = itemUpdater52.update(item63);
        com.gildedrose.Item item65 = itemUpdater43.update(item64);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater66 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item70 = new com.gildedrose.Item("hi!", 100, 1);
        int int71 = item70.sellIn;
        com.gildedrose.Item item72 = conjuredItemUpdater66.update(item70);
        com.gildedrose.Item item73 = itemUpdater43.update(item70);
        int int74 = item70.quality;
        item70.sellIn = 99;
        item70.name = "";
        com.gildedrose.Item item79 = itemUpdater17.update(item70);
        item70.sellIn = (-3);
        com.gildedrose.Item item82 = itemUpdater8.update(item70);
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
        org.junit.Assert.assertNotNull(itemUpdater52);
        org.junit.Assert.assertNotNull(itemUpdater55);
        org.junit.Assert.assertNotNull(itemUpdater57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertNotNull(item63);
        org.junit.Assert.assertNotNull(item64);
        org.junit.Assert.assertNotNull(item65);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 100 + "'", int71 == 100);
        org.junit.Assert.assertNotNull(item72);
        org.junit.Assert.assertNotNull(item73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(item79);
        org.junit.Assert.assertNotNull(item82);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', (int) (byte) 1);
        item3.sellIn = 8;
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, 9", 51, 30);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
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
        int int50 = item49.quality;
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str13 = item12.name;
        int int14 = item12.sellIn;
        com.gildedrose.Item item15 = itemUpdater8.update(item12);
        item12.quality = 'a';
        int int18 = item12.quality;
        item12.sellIn = 0;
        java.lang.String str21 = item12.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 0, 0" + "'", str13, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 0, 0, 0, 97" + "'", str21, "hi!, 0, 0, 0, 97");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
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
        int int18 = item8.sellIn;
        java.lang.String str19 = item8.name;
        item8.sellIn = 99;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 10, 0" + "'", str19, "hi!, 10, 0");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory3 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory3.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory3.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory3.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory3.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory14 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory23 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory23.getInstance("");
        com.gildedrose.Item item29 = new com.gildedrose.Item("hi!", 100, 1);
        int int30 = item29.sellIn;
        com.gildedrose.Item item31 = itemUpdater25.update(item29);
        item29.sellIn = (byte) 0;
        java.lang.String str34 = item29.toString();
        com.gildedrose.Item item35 = itemUpdater16.update(item29);
        item35.quality = '4';
        java.lang.String str38 = item35.name;
        com.gildedrose.Item item39 = itemUpdater13.update(item35);
        com.gildedrose.Item item40 = itemUpdater2.update(item35);
        int int41 = item40.sellIn;
        java.lang.String str42 = item40.name;
        int int43 = item40.sellIn;
        java.lang.String str44 = item40.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!, 0, 0" + "'", str34, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertNotNull(item40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-3) + "'", int41 == (-3));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-3) + "'", int43 == (-3));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50, 1, 100, 99, 0", (int) (byte) 100, 99);
        item3.sellIn = 98;
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
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
        java.lang.String str80 = item79.toString();
        item79.quality = 95;
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
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!, 97, 0" + "'", str80, "hi!, 97, 0");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, -1, 0", (int) (short) -1, 98);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 51, 0", 0, (int) (short) 0);
        item3.sellIn = 46;
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
        com.gildedrose.Item item44 = new com.gildedrose.Item("", (int) (short) 10, (int) (short) 10);
        com.gildedrose.Item item45 = itemUpdater40.update(item44);
        com.gildedrose.Item item46 = itemUpdater8.update(item44);
        java.lang.String str47 = item46.name;
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
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertNotNull(item46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
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
        int int37 = item32.sellIn;
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
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
        int int37 = item32.sellIn;
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
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 52, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 50, 49, -2, 52");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance(", 0, 50, 10, -1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance(", 96, 31");
        com.gildedrose.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.gildedrose.Item item12 = itemUpdater10.update(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
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
        item21.name = "hi!, -1, 1, 98, 0";
        item21.sellIn = 8;
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
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        item14.name = "hi!, 10, 0, 10, 1, 1, -1, 52, 100";
        item14.sellIn = 0;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory15 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.Item item23 = new com.gildedrose.Item("hi!", 100, 1);
        int int24 = item23.sellIn;
        com.gildedrose.Item item25 = itemUpdater19.update(item23);
        java.lang.String str26 = item23.toString();
        item23.sellIn = 10;
        java.lang.String str29 = item23.toString();
        java.lang.String str30 = item23.name;
        int int31 = item23.quality;
        com.gildedrose.Item item32 = itemUpdater14.update(item23);
        int int33 = item32.sellIn;
        java.lang.String str34 = item32.name;
        java.lang.String str35 = item32.name;
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
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
        int int21 = item8.quality;
        item8.name = "hi!, 0, 0, 51, 0, 98, 99";
        java.lang.String str24 = item8.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!, 0, 0, 51, 0, 98, 99" + "'", str24, "hi!, 0, 0, 51, 0, 98, 99");
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 9, 97, -2", (int) (short) 1, 100);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", (int) (byte) 1, (int) (short) 1);
        int int4 = item3.quality;
        item3.sellIn = (-2);
        java.lang.String str7 = item3.name;
        int int8 = item3.quality;
        java.lang.String str9 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 10, 0" + "'", str7, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 10, 0, -2, 1" + "'", str9, "hi!, 10, 0, -2, 1");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
        item49.quality = 1;
        int int52 = item49.quality;
        int int53 = item49.quality;
        item49.name = "hi!, 10, 0, 10, 1, 1, -1, 52, 52, -1, 0";
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.toString();
        java.lang.String str7 = item3.toString();
        int int8 = item3.quality;
        item3.name = "";
        item3.name = "hi!, 0, 0, 52, 1";
        int int13 = item3.quality;
        int int14 = item3.sellIn;
        item3.quality = (byte) -1;
        int int17 = item3.sellIn;
        int int18 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 100, 1" + "'", str6, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 100, 1" + "'", str7, "hi!, 100, 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
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
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory32.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater40 = itemUpdaterFactory32.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory32.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater44 = itemUpdaterFactory32.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater46 = itemUpdaterFactory32.getInstance("hi!, 0, 0, 52, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory47 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater49 = itemUpdaterFactory47.getInstance("");
        com.gildedrose.Item item53 = new com.gildedrose.Item("hi!", 100, 1);
        int int54 = item53.sellIn;
        com.gildedrose.Item item55 = itemUpdater49.update(item53);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory56 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater58 = itemUpdaterFactory56.getInstance("");
        com.gildedrose.Item item62 = new com.gildedrose.Item("hi!", 100, 1);
        int int63 = item62.sellIn;
        com.gildedrose.Item item64 = itemUpdater58.update(item62);
        item62.sellIn = (byte) 0;
        java.lang.String str67 = item62.toString();
        com.gildedrose.Item item68 = itemUpdater49.update(item62);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory69 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater71 = itemUpdaterFactory69.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater73 = itemUpdaterFactory69.getInstance("");
        com.gildedrose.Item item77 = new com.gildedrose.Item("hi!", 100, 1);
        int int78 = item77.sellIn;
        com.gildedrose.Item item79 = itemUpdater73.update(item77);
        java.lang.String str80 = item77.toString();
        item77.sellIn = 10;
        java.lang.String str83 = item77.toString();
        item77.sellIn = 98;
        item77.sellIn = (byte) 10;
        com.gildedrose.Item item88 = itemUpdater49.update(item77);
        int int89 = item88.quality;
        item88.name = "hi!, 100, 1";
        item88.name = "hi!, 97, 0";
        item88.quality = 96;
        com.gildedrose.Item item96 = itemUpdater46.update(item88);
        com.gildedrose.Item item97 = itemUpdater8.update(item96);
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertNotNull(item55);
        org.junit.Assert.assertNotNull(itemUpdater58);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 100 + "'", int63 == 100);
        org.junit.Assert.assertNotNull(item64);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!, 0, 0" + "'", str67, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item68);
        org.junit.Assert.assertNotNull(itemUpdater71);
        org.junit.Assert.assertNotNull(itemUpdater73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        org.junit.Assert.assertNotNull(item79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!, 99, 0" + "'", str80, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!, 10, 0" + "'", str83, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(item96);
        org.junit.Assert.assertNotNull(item97);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 51, 0", (-2), 31);
        item3.quality = 98;
        item3.sellIn = 49;
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        java.lang.Class<?> wildcardClass7 = itemUpdaterFactory0.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory47 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater49 = itemUpdaterFactory47.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater51 = itemUpdaterFactory47.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater53 = itemUpdaterFactory47.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater55 = itemUpdaterFactory47.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater57 = itemUpdaterFactory47.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater58 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item62 = new com.gildedrose.Item("hi!", 100, 1);
        int int63 = item62.sellIn;
        com.gildedrose.Item item64 = conjuredItemUpdater58.update(item62);
        com.gildedrose.Item item68 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str69 = item68.name;
        java.lang.String str70 = item68.name;
        int int71 = item68.quality;
        java.lang.String str72 = item68.toString();
        com.gildedrose.Item item73 = conjuredItemUpdater58.update(item68);
        java.lang.String str74 = item73.name;
        item73.name = "hi!, 99, 0";
        com.gildedrose.Item item77 = itemUpdater57.update(item73);
        item77.sellIn = 32;
        java.lang.String str80 = item77.name;
        com.gildedrose.Item item81 = itemUpdater4.update(item77);
        item81.quality = '#';
        int int84 = item81.quality;
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
        org.junit.Assert.assertNotNull(itemUpdater49);
        org.junit.Assert.assertNotNull(itemUpdater51);
        org.junit.Assert.assertNotNull(itemUpdater53);
        org.junit.Assert.assertNotNull(itemUpdater55);
        org.junit.Assert.assertNotNull(itemUpdater57);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 100 + "'", int63 == 100);
        org.junit.Assert.assertNotNull(item64);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!, 100, 1" + "'", str72, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertNotNull(item77);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!, 99, 0" + "'", str80, "hi!, 99, 0");
        org.junit.Assert.assertNotNull(item81);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 35 + "'", int84 == 35);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
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
        item30.quality = '#';
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
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance(", 100, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory18 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory18.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory21 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.Item item29 = new com.gildedrose.Item("hi!", 100, 1);
        int int30 = item29.sellIn;
        com.gildedrose.Item item31 = itemUpdater25.update(item29);
        com.gildedrose.Item item32 = itemUpdater20.update(item31);
        com.gildedrose.Item item33 = itemUpdater11.update(item32);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory34 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater36 = itemUpdaterFactory34.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory34.getInstance("");
        com.gildedrose.Item item42 = new com.gildedrose.Item("hi!", 100, 1);
        int int43 = item42.sellIn;
        com.gildedrose.Item item44 = itemUpdater38.update(item42);
        java.lang.String str45 = item42.toString();
        item42.sellIn = 10;
        int int48 = item42.sellIn;
        item42.name = "hi!, 10, 0";
        int int51 = item42.sellIn;
        com.gildedrose.Item item52 = itemUpdater11.update(item42);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory53 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater55 = itemUpdaterFactory53.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater57 = itemUpdaterFactory53.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater59 = itemUpdaterFactory53.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater61 = itemUpdaterFactory53.getInstance("hi!, 100, 52");
        com.gildedrose.Item item65 = new com.gildedrose.Item("hi!, 100, 1", (int) '4', (int) '#');
        com.gildedrose.Item item66 = itemUpdater61.update(item65);
        com.gildedrose.Item item67 = itemUpdater11.update(item65);
        int int68 = item65.sellIn;
        com.gildedrose.Item item69 = itemUpdater8.update(item65);
        java.lang.String str70 = item65.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertNotNull(itemUpdater36);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!, 99, 0" + "'", str45, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertNotNull(itemUpdater55);
        org.junit.Assert.assertNotNull(itemUpdater57);
        org.junit.Assert.assertNotNull(itemUpdater59);
        org.junit.Assert.assertNotNull(itemUpdater61);
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertNotNull(item67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 50 + "'", int68 == 50);
        org.junit.Assert.assertNotNull(item69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!, 100, 1, 49, 32" + "'", str70, "hi!, 100, 1, 49, 32");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", 96, (int) 'a');
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
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
        com.gildedrose.Item item56 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        com.gildedrose.Item item57 = itemUpdater8.update(item56);
        item57.quality = (byte) 100;
        java.lang.String str60 = item57.toString();
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
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + ", 0, 100" + "'", str60, ", 0, 100");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 51, 0, 98, 0", 52, 10);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 51, 0, 98, 0" + "'", str4, "hi!, 51, 0, 98, 0");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 100, 1", 99, (-3));
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
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
        item68.quality = (byte) -1;
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
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
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
        java.lang.String str80 = item79.name;
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
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 31, (int) (short) 100);
        item3.name = "hi!, 0, 0, 52, 1";
        item3.sellIn = (byte) 1;
        java.lang.String str8 = item3.toString();
        item3.quality = 0;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 0, 0, 52, 1, 1, 100" + "'", str8, "hi!, 0, 0, 52, 1, 1, 100");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
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
        com.gildedrose.Item item77 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str78 = item77.name;
        java.lang.String str79 = item77.toString();
        int int80 = item77.quality;
        int int81 = item77.quality;
        com.gildedrose.Item item82 = itemUpdater8.update(item77);
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
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!, 0, 0" + "'", str78, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str79, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNotNull(item82);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
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
        java.lang.String str80 = item78.toString();
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
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!, 97, 0" + "'", str80, "hi!, 97, 0");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1, 8, 30, 31, 0", (int) (short) 10, 9);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 1, 8, 30, 31, 0" + "'", str4, "hi!, -1, 1, 8, 30, 31, 0");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, -3, 0");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("");
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
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (-4), (int) (byte) -1);
        item3.sellIn = 98;
        int int6 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
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
        java.lang.String str32 = item29.toString();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!, -2, 0" + "'", str32, "hi!, -2, 0");
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 1, (-2));
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        item8.name = "hi!, -1, 0";
        item8.name = "hi!, 0, 0, 52, 0, 30, 1";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
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
        int int27 = item24.sellIn;
        java.lang.Class<?> wildcardClass28 = item24.getClass();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
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
        item18.name = ", 99, -1";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(item19);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
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
        item8.quality = (short) -1;
        int int23 = item8.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
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
        com.gildedrose.Item item65 = new com.gildedrose.Item("hi!, 10, 0, 100, 0", (int) (short) -1, (int) ' ');
        java.lang.String str66 = item65.toString();
        item65.sellIn = (-1);
        int int69 = item65.sellIn;
        com.gildedrose.Item item70 = itemUpdater14.update(item65);
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
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!, 10, 0, 100, 0, -1, 32" + "'", str66, "hi!, 10, 0, 100, 0, -1, 32");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(item70);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 52, 1, 98", (int) (byte) 10, 97);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 52, 1, 98, 10, 97" + "'", str4, "hi!, 100, 52, 1, 98, 10, 97");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
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
        int int52 = item49.quality;
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.name;
        item3.sellIn = (-1);
        java.lang.String str9 = item3.toString();
        item3.sellIn = '#';
        java.lang.String str12 = item3.name;
        java.lang.String str13 = item3.name;
        item3.quality = (byte) 0;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 1" + "'", str9, "hi!, -1, 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
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
        item15.quality = ' ';
        item15.name = "hi!, 100, 1, 9, 1, 97, 50";
        item15.quality = (byte) 10;
        int int30 = item15.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 52", (int) (byte) 0, 100);
        java.lang.String str4 = item3.toString();
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 52, 0, 100" + "'", str4, "hi!, -1, 52, 0, 100");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
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
        item22.name = "hi!, 10, 0, 10, 1, 1, -1, 52, 52";
        item22.name = "hi!, 100, 1, 35, 0";
        item22.quality = (-2);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 99, 0" + "'", str16, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 10, 0" + "'", str19, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item22);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
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
        item8.quality = 48;
        int int19 = item8.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 96, 0", 52, 48);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory3 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = itemUpdater7.update(item11);
        com.gildedrose.Item item14 = itemUpdater2.update(item13);
        item13.quality = (byte) 1;
        int int17 = item13.quality;
        item13.quality = 0;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 99");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 10, 0");
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!, 51, 0", 1, 97);
        com.gildedrose.Item item11 = itemUpdater6.update(item10);
        int int12 = item10.quality;
        item10.name = "";
        java.lang.Class<?> wildcardClass15 = item10.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
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
        item37.quality = (short) -1;
        item37.name = "hi!, 10, 10";
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
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        java.lang.String str14 = item8.toString();
        java.lang.String str15 = item8.toString();
        java.lang.Class<?> wildcardClass16 = item8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 10, 0" + "'", str15, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 51, 34");
        com.gildedrose.Item item14 = new com.gildedrose.Item("", (int) '4', 1);
        item14.name = "hi!, 0, 0";
        java.lang.String str17 = item14.toString();
        item14.name = "hi!, 99, 0";
        java.lang.String str20 = item14.toString();
        int int21 = item14.quality;
        com.gildedrose.Item item22 = itemUpdater10.update(item14);
        item14.name = "hi!, 0, 0, 32, 0, 10, 99";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str17, "hi!, 0, 0, 52, 1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 99, 0, 52, 1" + "'", str20, "hi!, 99, 0, 52, 1");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(item22);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
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
        item30.sellIn = 34;
        item30.name = "hi!, -1, 52, 0, 100";
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
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!, -1, 1", (int) ' ', (int) ' ');
        item10.sellIn = (byte) 10;
        com.gildedrose.Item item13 = itemUpdater6.update(item10);
        item10.quality = (byte) 100;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(item13);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -4, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 50");
        java.lang.Class<?> wildcardClass9 = itemUpdaterFactory0.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
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
        item17.name = "hi!, -1, 52, 1, 31";
        java.lang.Class<?> wildcardClass26 = item17.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance(", 100, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory18 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory18.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory21 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.Item item29 = new com.gildedrose.Item("hi!", 100, 1);
        int int30 = item29.sellIn;
        com.gildedrose.Item item31 = itemUpdater25.update(item29);
        com.gildedrose.Item item32 = itemUpdater20.update(item31);
        com.gildedrose.Item item33 = itemUpdater11.update(item32);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory34 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater36 = itemUpdaterFactory34.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory34.getInstance("");
        com.gildedrose.Item item42 = new com.gildedrose.Item("hi!", 100, 1);
        int int43 = item42.sellIn;
        com.gildedrose.Item item44 = itemUpdater38.update(item42);
        java.lang.String str45 = item42.toString();
        item42.sellIn = 10;
        int int48 = item42.sellIn;
        item42.name = "hi!, 10, 0";
        int int51 = item42.sellIn;
        com.gildedrose.Item item52 = itemUpdater11.update(item42);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory53 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater55 = itemUpdaterFactory53.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater57 = itemUpdaterFactory53.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater59 = itemUpdaterFactory53.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater61 = itemUpdaterFactory53.getInstance("hi!, 100, 52");
        com.gildedrose.Item item65 = new com.gildedrose.Item("hi!, 100, 1", (int) '4', (int) '#');
        com.gildedrose.Item item66 = itemUpdater61.update(item65);
        com.gildedrose.Item item67 = itemUpdater11.update(item65);
        int int68 = item65.sellIn;
        com.gildedrose.Item item69 = itemUpdater8.update(item65);
        int int70 = item69.quality;
        int int71 = item69.sellIn;
        int int72 = item69.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertNotNull(itemUpdater36);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!, 99, 0" + "'", str45, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertNotNull(itemUpdater55);
        org.junit.Assert.assertNotNull(itemUpdater57);
        org.junit.Assert.assertNotNull(itemUpdater59);
        org.junit.Assert.assertNotNull(itemUpdater61);
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertNotNull(item67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 50 + "'", int68 == 50);
        org.junit.Assert.assertNotNull(item69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 32 + "'", int70 == 32);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 49 + "'", int71 == 49);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 49 + "'", int72 == 49);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
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
        java.lang.String str40 = item28.toString();
        int int41 = item28.quality;
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!, 0, 0, 52, 1, 99, 0" + "'", str40, "hi!, 0, 0, 52, 1, 99, 0");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 31, 97", (int) (byte) 100, 48);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
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
        java.lang.String str65 = item63.name;
        item63.name = "hi!, 100, 99";
        java.lang.String str68 = item63.name;
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
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!, 100, 99" + "'", str68, "hi!, 100, 99");
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 8, 0", 97, 97);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory18 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory18.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory18.getInstance("");
        com.gildedrose.Item item26 = new com.gildedrose.Item("hi!", 100, 1);
        int int27 = item26.sellIn;
        com.gildedrose.Item item28 = itemUpdater22.update(item26);
        java.lang.String str29 = item26.toString();
        item26.sellIn = 10;
        int int32 = item26.sellIn;
        item26.name = "hi!, 10, 0";
        item26.quality = 48;
        com.gildedrose.Item item37 = itemUpdater2.update(item26);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!, 99, 0" + "'", str29, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(item37);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 10, 10", 32, 10);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
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
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!, 10, 0, 10, 1", 1, (-1));
        java.lang.String str21 = item20.toString();
        int int22 = item20.quality;
        java.lang.String str23 = item20.name;
        item20.sellIn = 'a';
        item20.sellIn = 32;
        item20.quality = 8;
        com.gildedrose.Item item30 = itemUpdater2.update(item20);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory31 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory31.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory31.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater37 = itemUpdaterFactory31.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater39 = itemUpdaterFactory31.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory40 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory40.getInstance("");
        com.gildedrose.Item item46 = new com.gildedrose.Item("hi!", 100, 1);
        int int47 = item46.sellIn;
        com.gildedrose.Item item48 = itemUpdater42.update(item46);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory49 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater51 = itemUpdaterFactory49.getInstance("");
        com.gildedrose.Item item55 = new com.gildedrose.Item("hi!", 100, 1);
        int int56 = item55.sellIn;
        com.gildedrose.Item item57 = itemUpdater51.update(item55);
        item55.sellIn = (byte) 0;
        java.lang.String str60 = item55.toString();
        com.gildedrose.Item item61 = itemUpdater42.update(item55);
        com.gildedrose.Item item62 = itemUpdater39.update(item55);
        item62.name = "hi!, 100, 1";
        java.lang.String str65 = item62.toString();
        com.gildedrose.Item item66 = itemUpdater2.update(item62);
        java.lang.String str67 = item62.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 10, 0, 10, 1, 1, -1" + "'", str21, "hi!, 10, 0, 10, 1, 1, -1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 10, 0, 10, 1" + "'", str23, "hi!, 10, 0, 10, 1");
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertNotNull(itemUpdater37);
        org.junit.Assert.assertNotNull(itemUpdater39);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(itemUpdater51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!, 0, 0" + "'", str60, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item61);
        org.junit.Assert.assertNotNull(item62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!, 100, 1, -2, 0" + "'", str65, "hi!, 100, 1, -2, 0");
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!, 100, 1, -3, 0" + "'", str67, "hi!, 100, 1, -3, 0");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 98, -2, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -1, 0, 9, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 97, 0");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = conjuredItemUpdater11.update(item15);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory18 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory18.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory18.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory18.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory18.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory27 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory27.getInstance("");
        com.gildedrose.Item item33 = new com.gildedrose.Item("hi!", 100, 1);
        int int34 = item33.sellIn;
        com.gildedrose.Item item35 = itemUpdater29.update(item33);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory36 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory36.getInstance("");
        com.gildedrose.Item item42 = new com.gildedrose.Item("hi!", 100, 1);
        int int43 = item42.sellIn;
        com.gildedrose.Item item44 = itemUpdater38.update(item42);
        item42.sellIn = (byte) 0;
        java.lang.String str47 = item42.toString();
        com.gildedrose.Item item48 = itemUpdater29.update(item42);
        com.gildedrose.Item item49 = itemUpdater26.update(item42);
        com.gildedrose.Item item50 = conjuredItemUpdater11.update(item42);
        com.gildedrose.Item item54 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49", (int) ' ', (int) 'a');
        int int55 = item54.quality;
        com.gildedrose.Item item56 = conjuredItemUpdater11.update(item54);
        com.gildedrose.Item item57 = itemUpdater10.update(item56);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertNotNull(itemUpdater29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!, 0, 0" + "'", str47, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(item49);
        org.junit.Assert.assertNotNull(item50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 97 + "'", int55 == 97);
        org.junit.Assert.assertNotNull(item56);
        org.junit.Assert.assertNotNull(item57);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 1", 0, 0);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        int int6 = item3.quality;
        item3.name = "hi!, -2, 50, 0, 50";
        java.lang.Class<?> wildcardClass9 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0" + "'", str4, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str5, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 9, 50", 97, (int) '#');
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50, 50, 97", (-4), 1);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.name;
        item3.sellIn = (-1);
        item3.quality = 0;
        item3.name = "hi!, 10, 0, 10, 1, 1, -1, 52, 52";
        item3.quality = 0;
        java.lang.String str15 = item3.toString();
        int int16 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 10, 0, 10, 1, 1, -1, 52, 52, -1, 0" + "'", str15, "hi!, 10, 0, 10, 1, 1, -1, 52, 52, -1, 0");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -4, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 50");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory9.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory9.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory9.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory9.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater26 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item30 = new com.gildedrose.Item("hi!", 100, 1);
        int int31 = item30.sellIn;
        com.gildedrose.Item item32 = conjuredItemUpdater26.update(item30);
        item30.name = "hi!, 0, 0";
        int int35 = item30.quality;
        item30.quality = (short) -1;
        item30.name = "hi!";
        item30.name = ", 1, 32";
        com.gildedrose.Item item42 = itemUpdater25.update(item30);
        java.lang.String str43 = item42.name;
        com.gildedrose.Item item44 = itemUpdater8.update(item42);
        item44.sellIn = '4';
        java.lang.String str47 = item44.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(item42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + ", 1, 32" + "'", str43, ", 1, 32");
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + ", 1, 32, 52, 0" + "'", str47, ", 1, 32, 52, 0");
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance(", 9, 9");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 10, 0);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 52, 0, 30, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 100, 52, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory13 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.Item item19 = new com.gildedrose.Item("hi!", 100, 1);
        int int20 = item19.sellIn;
        com.gildedrose.Item item21 = itemUpdater15.update(item19);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory22 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.Item item28 = new com.gildedrose.Item("hi!", 100, 1);
        int int29 = item28.sellIn;
        com.gildedrose.Item item30 = itemUpdater24.update(item28);
        item28.sellIn = (byte) 0;
        java.lang.String str33 = item28.toString();
        com.gildedrose.Item item34 = itemUpdater15.update(item28);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory35 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater37 = itemUpdaterFactory35.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater39 = itemUpdaterFactory35.getInstance("");
        com.gildedrose.Item item43 = new com.gildedrose.Item("hi!", 100, 1);
        int int44 = item43.sellIn;
        com.gildedrose.Item item45 = itemUpdater39.update(item43);
        java.lang.String str46 = item43.toString();
        item43.sellIn = 10;
        java.lang.String str49 = item43.toString();
        item43.sellIn = 98;
        item43.sellIn = (byte) 10;
        com.gildedrose.Item item54 = itemUpdater15.update(item43);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory55 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater57 = itemUpdaterFactory55.getInstance("");
        com.gildedrose.Item item61 = new com.gildedrose.Item("hi!", 100, 1);
        int int62 = item61.sellIn;
        com.gildedrose.Item item63 = itemUpdater57.update(item61);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory64 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater66 = itemUpdaterFactory64.getInstance("");
        com.gildedrose.Item item70 = new com.gildedrose.Item("hi!", 100, 1);
        int int71 = item70.sellIn;
        com.gildedrose.Item item72 = itemUpdater66.update(item70);
        item70.sellIn = (byte) 0;
        java.lang.String str75 = item70.toString();
        com.gildedrose.Item item76 = itemUpdater57.update(item70);
        com.gildedrose.Item item77 = itemUpdater15.update(item76);
        java.lang.String str78 = item76.name;
        java.lang.String str79 = item76.toString();
        item76.sellIn = 97;
        java.lang.String str82 = item76.name;
        com.gildedrose.Item item83 = itemUpdater12.update(item76);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!, 0, 0" + "'", str33, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertNotNull(itemUpdater37);
        org.junit.Assert.assertNotNull(itemUpdater39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!, 99, 0" + "'", str46, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!, 10, 0" + "'", str49, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item54);
        org.junit.Assert.assertNotNull(itemUpdater57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertNotNull(item63);
        org.junit.Assert.assertNotNull(itemUpdater66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 100 + "'", int71 == 100);
        org.junit.Assert.assertNotNull(item72);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!, 0, 0" + "'", str75, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item76);
        org.junit.Assert.assertNotNull(item77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!, -2, 0" + "'", str79, "hi!, -2, 0");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(item83);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
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
        java.lang.String str37 = item36.toString();
        item36.quality = (short) 10;
        int int40 = item36.sellIn;
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
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
        item26.name = ", 9, 50";
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
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 0, 52, 98, 0", 51, 8);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 0, 49", 0, (-2));
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
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
        item86.quality = 9;
        java.lang.String str90 = item86.toString();
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
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!, 98, 9" + "'", str90, "hi!, 98, 9");
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.Item item16 = new com.gildedrose.Item("hi!, 100, 1, 100, 0", 96, 49);
        java.lang.String str17 = item16.name;
        com.gildedrose.Item item18 = itemUpdater12.update(item16);
        int int19 = item16.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 100, 1, 100, 0" + "'", str17, "hi!, 100, 1, 100, 0");
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance(", 100, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, -1, 10, 100");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance(", 0, 0");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory17.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory17.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item29 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item30 = itemUpdater25.update(item29);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory31 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory31.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory31.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory36 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory36.getInstance("");
        com.gildedrose.Item item42 = new com.gildedrose.Item("hi!", 100, 1);
        int int43 = item42.sellIn;
        com.gildedrose.Item item44 = itemUpdater38.update(item42);
        item42.sellIn = (byte) 0;
        com.gildedrose.Item item47 = itemUpdater35.update(item42);
        com.gildedrose.Item item48 = itemUpdater25.update(item47);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory49 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater51 = itemUpdaterFactory49.getInstance("");
        com.gildedrose.Item item55 = new com.gildedrose.Item("hi!", 100, 1);
        int int56 = item55.sellIn;
        com.gildedrose.Item item57 = itemUpdater51.update(item55);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory58 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater60 = itemUpdaterFactory58.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory61 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater63 = itemUpdaterFactory61.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater65 = itemUpdaterFactory61.getInstance("");
        com.gildedrose.Item item69 = new com.gildedrose.Item("hi!", 100, 1);
        int int70 = item69.sellIn;
        com.gildedrose.Item item71 = itemUpdater65.update(item69);
        com.gildedrose.Item item72 = itemUpdater60.update(item71);
        com.gildedrose.Item item73 = itemUpdater51.update(item72);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater74 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item78 = new com.gildedrose.Item("hi!", 100, 1);
        int int79 = item78.sellIn;
        com.gildedrose.Item item80 = conjuredItemUpdater74.update(item78);
        com.gildedrose.Item item81 = itemUpdater51.update(item78);
        int int82 = item78.quality;
        item78.sellIn = 99;
        item78.name = "";
        com.gildedrose.Item item87 = itemUpdater25.update(item78);
        item78.sellIn = (-3);
        item78.name = "";
        int int92 = item78.quality;
        com.gildedrose.Item item93 = itemUpdater16.update(item78);
        java.lang.String str94 = item78.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(itemUpdater51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertNotNull(itemUpdater60);
        org.junit.Assert.assertNotNull(itemUpdater63);
        org.junit.Assert.assertNotNull(itemUpdater65);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 100 + "'", int70 == 100);
        org.junit.Assert.assertNotNull(item71);
        org.junit.Assert.assertNotNull(item72);
        org.junit.Assert.assertNotNull(item73);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 100 + "'", int79 == 100);
        org.junit.Assert.assertNotNull(item80);
        org.junit.Assert.assertNotNull(item81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(item87);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(item93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
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
        item24.sellIn = 'a';
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
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        item3.name = "hi!, 100, 1";
        int int7 = item3.sellIn;
        item3.name = "hi!, 100, 1, 9, 1";
        int int10 = item3.sellIn;
        int int11 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 100, 1, 10, 0" + "'", str5, "hi!, 100, 1, 10, 0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 100, 1, 10, 0" + "'", str7, "hi!, 100, 1, 10, 0");
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0", 98, 99);
        java.lang.String str4 = item3.name;
        int int5 = item3.quality;
        item3.quality = ' ';
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 0" + "'", str4, "hi!, 1, 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 99 + "'", int5 == 99);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
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
        item37.sellIn = (-2);
        java.lang.Class<?> wildcardClass41 = item37.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!", 100, 1);
        com.gildedrose.Item item11 = conjuredItemUpdater0.update(item10);
        int int12 = item10.sellIn;
        java.lang.String str13 = item10.toString();
        item10.quality = 95;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 99, 0" + "'", str13, "hi!, 99, 0");
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
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
        java.lang.String str90 = item86.toString();
        item86.quality = (short) 1;
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
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!, -2, 50" + "'", str90, "hi!, -2, 50");
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -1, 1, 10, 32");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 1, 0, 98, 8");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item3.sellIn = 52;
        int int6 = item3.quality;
        int int7 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", 31, (-1));
        item3.sellIn = (byte) 0;
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 52, 1, 0, 32");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -1, 1, 9, 31");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 34, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.toString();
        int int7 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 100, 1" + "'", str6, "hi!, 100, 1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 98, 9", (-4), 10);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0, 52, 1, 1, 100";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 52", (int) ' ', (int) '4');
        item3.sellIn = 96;
        java.lang.String str6 = item3.name;
        item3.sellIn = 9;
        int int9 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 100, 52" + "'", str6, "hi!, 100, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 51, 0, 98, 99", (-4), 51);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance(", 100, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance(", 100, 1, -4, 0, 1, 97");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance(", 0, 50, 1, 100, -1, 100");
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
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
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
        item33.name = "hi!, 0, 0, 9, 34";
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
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
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
        com.gildedrose.Item item57 = new com.gildedrose.Item("hi!, 100, 1", (int) (byte) 10, (int) (short) 100);
        item57.name = "hi!, -1, 0";
        com.gildedrose.Item item60 = itemUpdater8.update(item57);
        int int61 = item60.quality;
        java.lang.String str62 = item60.name;
        item60.quality = 30;
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
        org.junit.Assert.assertNotNull(item60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 50 + "'", int61 == 50);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!, -1, 0" + "'", str62, "hi!, -1, 0");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance(", 0, 50, 50, 97");
        com.gildedrose.Item item16 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str17 = item16.name;
        java.lang.String str18 = item16.name;
        int int19 = item16.quality;
        java.lang.String str20 = item16.toString();
        item16.quality = 97;
        com.gildedrose.Item item23 = itemUpdater12.update(item16);
        item16.name = "hi!, 31, 0";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 100, 1" + "'", str20, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item23);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1, 10, 32", (-3), 34);
        int int4 = item3.sellIn;
        item3.sellIn = (-3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3) + "'", int4 == (-3));
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1", 1, (-1));
        item3.sellIn = (byte) 1;
        java.lang.String str6 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 10, 0, 10, 1" + "'", str6, "hi!, 10, 0, 10, 1");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
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
        java.lang.String str90 = item86.toString();
        java.lang.String str91 = item86.name;
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
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!, -2, 50" + "'", str90, "hi!, -2, 50");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "hi!" + "'", str91, "hi!");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
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
        int int34 = item33.sellIn;
        item33.sellIn = 0;
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 98 + "'", int34 == 98);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
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
        com.gildedrose.Item item72 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        item72.name = "hi!, 52, 1";
        item72.sellIn = 34;
        com.gildedrose.Item item77 = itemUpdater6.update(item72);
        java.lang.String str78 = item72.name;
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
        org.junit.Assert.assertNotNull(item77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!, 52, 1" + "'", str78, "hi!, 52, 1");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
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
        item16.sellIn = '4';
        java.lang.String str19 = item16.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 52, 0" + "'", str19, "hi!, 52, 0");
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
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
        java.lang.String str17 = item8.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 0, 0" + "'", str9, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str10, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 0, 0" + "'", str17, "hi!, 0, 0");
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
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
        int int58 = item51.quality;
        item51.sellIn = 30;
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
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("hi!, -1, 0");
        com.gildedrose.Item item17 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str18 = item17.name;
        java.lang.String str19 = item17.toString();
        com.gildedrose.Item item20 = itemUpdater13.update(item17);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory21 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.Item item29 = new com.gildedrose.Item("hi!", 100, 1);
        int int30 = item29.sellIn;
        com.gildedrose.Item item31 = itemUpdater25.update(item29);
        java.lang.String str32 = item29.toString();
        item29.sellIn = 10;
        java.lang.String str35 = item29.toString();
        item29.sellIn = 98;
        int int38 = item29.sellIn;
        com.gildedrose.Item item39 = itemUpdater13.update(item29);
        item39.quality = (byte) 0;
        com.gildedrose.Item item42 = itemUpdater8.update(item39);
        int int43 = item39.quality;
        item39.sellIn = (byte) 1;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 0, 0" + "'", str18, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str19, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!, 99, 0" + "'", str32, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!, 10, 0" + "'", str35, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 98 + "'", int38 == 98);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertNotNull(item42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
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
        java.lang.String str36 = item35.toString();
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, -2, 50" + "'", str36, "hi!, -2, 50");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
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
        item8.name = "hi!, 10, 0";
        java.lang.Class<?> wildcardClass19 = item8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 50, 0", 9, (int) (short) 10);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 31, 52", 49, 51);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 32, 0", 10, 99);
        java.lang.String str4 = item3.name;
        item3.quality = 0;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0, 32, 0" + "'", str4, "hi!, 0, 0, 32, 0");
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50", 0, (int) '#');
        java.lang.String str4 = item3.name;
        item3.name = ", 0, 50, 1, 100, -1, 100";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 0, 50" + "'", str4, ", 0, 50");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 31, 52", 95, 0);
        item3.name = "hi!, 99, 0, 0, 10";
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
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
        item15.sellIn = (short) -1;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        java.lang.String str9 = item8.name;
        int int10 = item8.quality;
        java.lang.String str11 = item8.name;
        int int12 = item8.quality;
        item8.quality = 0;
        item8.quality = 10;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        int int10 = item6.sellIn;
        int int11 = item6.quality;
        java.lang.String str12 = item6.name;
        int int13 = item6.quality;
        int int14 = item6.sellIn;
        item6.quality = 50;
        int int17 = item6.quality;
        java.lang.Class<?> wildcardClass18 = item6.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50 + "'", int17 == 50);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 31, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance(", 0, 50, 1, 100, -1, 100");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 49, 32");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 99, -1", 35, 99);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 0, 50");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!, 1, 0, 0, 52", 98, 0);
        com.gildedrose.Item item9 = itemUpdater4.update(item8);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(item9);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory22 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory25 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory25.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory25.getInstance("");
        com.gildedrose.Item item33 = new com.gildedrose.Item("hi!", 100, 1);
        int int34 = item33.sellIn;
        com.gildedrose.Item item35 = itemUpdater29.update(item33);
        com.gildedrose.Item item36 = itemUpdater24.update(item35);
        int int37 = item36.sellIn;
        item36.name = ", 1, 32, 98, 0";
        java.lang.String str40 = item36.name;
        com.gildedrose.Item item41 = itemUpdater8.update(item36);
        item36.name = "";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 98 + "'", int37 == 98);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ", 1, 32, 98, 0" + "'", str40, ", 1, 32, 98, 0");
        org.junit.Assert.assertNotNull(item41);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 52, 52", 99, (int) ' ');
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 0, 1", (int) (byte) -1, 0);
        item3.sellIn = 100;
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
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
        item23.name = "hi!, -1, 1";
        java.lang.String str30 = item23.name;
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!, -1, 1" + "'", str30, "hi!, -1, 1");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50, 1, 100, 99, 0", 50, (-1));
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
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
        item15.name = "hi!, 99, 0";
        item15.sellIn = 'a';
        item15.quality = 52;
        int int23 = item15.quality;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1" + "'", str14, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory22 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory22.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory22.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory22.getInstance("hi!, 100, 1, 10, 0");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater29 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item33 = new com.gildedrose.Item("hi!", 100, 1);
        int int34 = item33.sellIn;
        com.gildedrose.Item item35 = conjuredItemUpdater29.update(item33);
        item33.name = "hi!, 0, 0";
        item33.sellIn = (-2);
        com.gildedrose.Item item40 = itemUpdater28.update(item33);
        com.gildedrose.Item item41 = itemUpdater8.update(item40);
        item41.name = "hi!, 100, 1, 9, 1, 98, 0";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertNotNull(item40);
        org.junit.Assert.assertNotNull(item41);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
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
        item30.quality = 'a';
        item30.quality = (byte) -1;
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
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -4, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 50");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, -1, 0");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!, 100, 1, 100, -1, 32, -1", (int) (short) 100, (int) (byte) 0);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        java.lang.Class<?> wildcardClass16 = itemUpdater10.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 52, 99);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
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
        com.gildedrose.Item item49 = new com.gildedrose.Item("hi!, 0, 0, 0, 49", 48, (int) '#');
        int int50 = item49.quality;
        com.gildedrose.Item item51 = itemUpdater8.update(item49);
        java.lang.Class<?> wildcardClass52 = item49.getClass();
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 35 + "'", int50 == 35);
        org.junit.Assert.assertNotNull(item51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
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
        item86.name = "hi!, 0, 50";
        item86.name = "hi!, 100, 52, 1, 98";
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
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 96, 0");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory33 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory33.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater37 = itemUpdaterFactory33.getInstance("");
        com.gildedrose.Item item41 = new com.gildedrose.Item("hi!", 100, 1);
        int int42 = item41.sellIn;
        com.gildedrose.Item item43 = itemUpdater37.update(item41);
        java.lang.String str44 = item41.toString();
        item41.sellIn = 10;
        java.lang.String str47 = item41.toString();
        item41.sellIn = 98;
        item41.sellIn = (byte) 10;
        com.gildedrose.Item item52 = itemUpdater13.update(item41);
        com.gildedrose.Item item56 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        item56.name = "hi!, 10, 0";
        com.gildedrose.Item item59 = itemUpdater13.update(item56);
        item59.name = ", 1, 32";
        int int62 = item59.sellIn;
        com.gildedrose.Item item63 = itemUpdater10.update(item59);
        item63.sellIn = (short) 100;
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
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertNotNull(itemUpdater37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!, 99, 0" + "'", str44, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!, 10, 0" + "'", str47, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertNotNull(item59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 99 + "'", int62 == 99);
        org.junit.Assert.assertNotNull(item63);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 100, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, 9");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 100, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 10", 1, 31);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 52, 0");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 0, 52");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory22 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.Item item28 = new com.gildedrose.Item("hi!", 100, 1);
        int int29 = item28.sellIn;
        com.gildedrose.Item item30 = itemUpdater24.update(item28);
        item28.sellIn = (byte) 0;
        com.gildedrose.Item item33 = itemUpdater21.update(item28);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory34 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater36 = itemUpdaterFactory34.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory37 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater39 = itemUpdaterFactory37.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater41 = itemUpdaterFactory37.getInstance("");
        com.gildedrose.Item item45 = new com.gildedrose.Item("hi!", 100, 1);
        int int46 = item45.sellIn;
        com.gildedrose.Item item47 = itemUpdater41.update(item45);
        com.gildedrose.Item item48 = itemUpdater36.update(item47);
        com.gildedrose.Item item49 = itemUpdater21.update(item48);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory50 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater52 = itemUpdaterFactory50.getInstance("");
        com.gildedrose.Item item56 = new com.gildedrose.Item("hi!", 100, 1);
        int int57 = item56.sellIn;
        com.gildedrose.Item item58 = itemUpdater52.update(item56);
        com.gildedrose.Item item59 = itemUpdater21.update(item58);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory60 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater62 = itemUpdaterFactory60.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater64 = itemUpdaterFactory60.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory65 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater67 = itemUpdaterFactory65.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater69 = itemUpdaterFactory65.getInstance("");
        com.gildedrose.Item item73 = new com.gildedrose.Item("hi!", 100, 1);
        int int74 = item73.sellIn;
        com.gildedrose.Item item75 = itemUpdater69.update(item73);
        java.lang.String str76 = item73.toString();
        item73.sellIn = 10;
        java.lang.String str79 = item73.toString();
        item73.sellIn = 1;
        com.gildedrose.Item item82 = itemUpdater64.update(item73);
        java.lang.String str83 = item73.toString();
        com.gildedrose.Item item84 = itemUpdater21.update(item73);
        item84.quality = (short) 10;
        com.gildedrose.Item item87 = itemUpdater16.update(item84);
        item87.quality = (byte) 1;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertNotNull(itemUpdater36);
        org.junit.Assert.assertNotNull(itemUpdater39);
        org.junit.Assert.assertNotNull(itemUpdater41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(item49);
        org.junit.Assert.assertNotNull(itemUpdater52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertNotNull(item58);
        org.junit.Assert.assertNotNull(item59);
        org.junit.Assert.assertNotNull(itemUpdater62);
        org.junit.Assert.assertNotNull(itemUpdater64);
        org.junit.Assert.assertNotNull(itemUpdater67);
        org.junit.Assert.assertNotNull(itemUpdater69);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 100 + "'", int74 == 100);
        org.junit.Assert.assertNotNull(item75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!, 99, 0" + "'", str76, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!, 10, 0" + "'", str79, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!, 0, 0" + "'", str83, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item84);
        org.junit.Assert.assertNotNull(item87);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 97, 35");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance(", 10, 10, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance(", 0, 50, 50, 97");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 9, 97");
        com.gildedrose.Item item24 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str25 = item24.name;
        java.lang.String str26 = item24.name;
        java.lang.String str27 = item24.name;
        item24.name = "hi!, 100, 52";
        item24.sellIn = ' ';
        java.lang.String str32 = item24.toString();
        item24.quality = 35;
        com.gildedrose.Item item35 = itemUpdater20.update(item24);
        item24.quality = 99;
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!, 100, 52, 32, 1" + "'", str32, "hi!, 100, 52, 32, 1");
        org.junit.Assert.assertNotNull(item35);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", (int) (byte) 10, (int) (short) 100);
        item3.quality = 'a';
        java.lang.String str6 = item3.name;
        item3.quality = (-1);
        item3.quality = 0;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 100, 1" + "'", str6, "hi!, 100, 1");
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
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
        item26.quality = (-1);
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
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!, -1, 0", 0, (int) (byte) 0);
        com.gildedrose.Item item9 = itemUpdater4.update(item8);
        int int10 = item9.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(item9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
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
        int int58 = item46.sellIn;
        item46.sellIn = 31;
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
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 98 + "'", int58 == 98);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 1, 99", (int) ' ', 51);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 52, 0", 30, (int) (short) 1);
        item3.sellIn = (short) 100;
        item3.quality = (-4);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50", 48, 100);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        item6.name = "hi!, 0, 0, 99, 0";
        item6.name = ", 0, 50, 1, 100";
        item6.sellIn = 52;
        item6.sellIn = (-1);
        int int17 = item6.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", 51, 97);
        int int4 = item3.sellIn;
        item3.name = ", 1, 32";
        int int7 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
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
        com.gildedrose.Item item81 = new com.gildedrose.Item("hi!, 1, 0", 98, 99);
        int int82 = item81.quality;
        int int83 = item81.sellIn;
        item81.name = "hi!, 0, 0, 51, 0";
        com.gildedrose.Item item86 = conjuredItemUpdater0.update(item81);
        java.lang.String str87 = item86.name;
        java.lang.String str88 = item86.toString();
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
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 99 + "'", int82 == 99);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 98 + "'", int83 == 98);
        org.junit.Assert.assertNotNull(item86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!, 0, 0, 51, 0" + "'", str87, "hi!, 0, 0, 51, 0");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!, 0, 0, 51, 0, 97, 50" + "'", str88, "hi!, 0, 0, 51, 0, 97, 50");
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 49, 48");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 1");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 99, 49");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory0.getInstance("hi!, 100, 1, -2, 0");
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
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        int int9 = item4.quality;
        item4.name = "";
        item4.quality = (-1);
        item4.sellIn = 31;
        java.lang.String str16 = item4.name;
        java.lang.String str17 = item4.name;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 0, 52", 0, (int) ' ');
        item3.sellIn = 51;
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50", 0, (int) '#');
        item3.quality = 50;
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 0, 50, 0, 50" + "'", str6, ", 0, 50, 0, 50");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
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
        item23.name = "hi!, -3, 0";
        java.lang.String str31 = item23.name;
        item23.name = "hi!, 98, 0, 97, 35, 10, -2";
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!, -3, 0" + "'", str31, "hi!, -3, 0");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
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
        item13.quality = (-4);
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
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -2, 50", 1, (int) (short) 10);
        java.lang.String str4 = item3.name;
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -2, 50" + "'", str4, "hi!, -2, 50");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 49, 48");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 1, 1");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -1, 0, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 100, 0, -1, 32");
        com.gildedrose.Item item18 = new com.gildedrose.Item("hi!, 1, 0", (int) (short) 0, (int) '4');
        java.lang.String str19 = item18.toString();
        java.lang.String str20 = item18.toString();
        item18.name = "hi!, 100, -1, 10, 100";
        item18.quality = (short) 0;
        item18.name = "hi!, -1, -1, 8, 10";
        com.gildedrose.Item item27 = itemUpdater14.update(item18);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 1, 0, 0, 52" + "'", str19, "hi!, 1, 0, 0, 52");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 1, 0, 0, 52" + "'", str20, "hi!, 1, 0, 0, 52");
        org.junit.Assert.assertNotNull(item27);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
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
        int int51 = item40.quality;
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
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
        item30.sellIn = 31;
        item30.sellIn = 46;
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
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
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
        java.lang.String str22 = item21.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, 100, 1, 98, 0, 99, 50" + "'", str22, "hi!, 100, 1, 98, 0, 99, 50");
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 8, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 50, 100, 48");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory15 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory15.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory15.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory15.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory15.getInstance("hi!, 9, 0");
        com.gildedrose.Item item29 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        com.gildedrose.Item item30 = itemUpdater25.update(item29);
        int int31 = item30.sellIn;
        java.lang.String str32 = item30.name;
        com.gildedrose.Item item33 = itemUpdater14.update(item30);
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
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 99 + "'", int31 == 99);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!, 100, 1" + "'", str32, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item33);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
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
        com.gildedrose.Item item48 = new com.gildedrose.Item("hi!", (int) '4', (int) (byte) 1);
        java.lang.String str49 = item48.name;
        item48.quality = 'a';
        int int52 = item48.sellIn;
        com.gildedrose.Item item53 = itemUpdater4.update(item48);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory54 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater56 = itemUpdaterFactory54.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater58 = itemUpdaterFactory54.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater60 = itemUpdaterFactory54.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater62 = itemUpdaterFactory54.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater64 = itemUpdaterFactory54.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory65 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater67 = itemUpdaterFactory65.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory68 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater70 = itemUpdaterFactory68.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater72 = itemUpdaterFactory68.getInstance("");
        com.gildedrose.Item item76 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item76.sellIn = 52;
        int int79 = item76.quality;
        com.gildedrose.Item item80 = itemUpdater72.update(item76);
        com.gildedrose.Item item81 = itemUpdater67.update(item80);
        com.gildedrose.Item item82 = itemUpdater64.update(item81);
        com.gildedrose.Item item83 = itemUpdater4.update(item81);
        java.lang.Class<?> wildcardClass84 = item83.getClass();
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
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 52 + "'", int52 == 52);
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertNotNull(itemUpdater56);
        org.junit.Assert.assertNotNull(itemUpdater58);
        org.junit.Assert.assertNotNull(itemUpdater60);
        org.junit.Assert.assertNotNull(itemUpdater62);
        org.junit.Assert.assertNotNull(itemUpdater64);
        org.junit.Assert.assertNotNull(itemUpdater67);
        org.junit.Assert.assertNotNull(itemUpdater70);
        org.junit.Assert.assertNotNull(itemUpdater72);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 100 + "'", int79 == 100);
        org.junit.Assert.assertNotNull(item80);
        org.junit.Assert.assertNotNull(item81);
        org.junit.Assert.assertNotNull(item82);
        org.junit.Assert.assertNotNull(item83);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
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
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str35 = item34.name;
        java.lang.String str36 = item34.name;
        java.lang.String str37 = item34.toString();
        java.lang.String str38 = item34.toString();
        int int39 = item34.quality;
        item34.name = "";
        java.lang.String str42 = item34.name;
        item34.quality = (short) 1;
        com.gildedrose.Item item45 = itemUpdater10.update(item34);
        com.gildedrose.Item item46 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.gildedrose.Item item47 = itemUpdater10.update(item46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!, 100, 1" + "'", str37, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!, 100, 1" + "'", str38, "hi!, 100, 1");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(item45);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item8.sellIn = 52;
        int int11 = item8.quality;
        com.gildedrose.Item item12 = itemUpdater4.update(item8);
        int int13 = item8.sellIn;
        item8.quality = 49;
        item8.quality = 31;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
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
        item42.quality = (-2);
        java.lang.String str46 = item42.name;
        java.lang.String str47 = item42.toString();
        item42.name = ", 0, 50, 10, 100";
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!, 98, -2" + "'", str47, "hi!, 98, -2");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
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
        item57.sellIn = 99;
        item57.name = "";
        com.gildedrose.Item item62 = itemUpdater8.update(item57);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory63 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater65 = itemUpdaterFactory63.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater67 = itemUpdaterFactory63.getInstance("");
        com.gildedrose.Item item71 = new com.gildedrose.Item("hi!", 100, 1);
        int int72 = item71.sellIn;
        com.gildedrose.Item item73 = itemUpdater67.update(item71);
        java.lang.String str74 = item71.toString();
        item71.name = "hi!, 10, 0";
        java.lang.String str77 = item71.name;
        com.gildedrose.Item item78 = itemUpdater8.update(item71);
        com.gildedrose.Item item82 = new com.gildedrose.Item("hi!, 100, 1", (int) (byte) 10, (int) (short) 100);
        item82.quality = 'a';
        java.lang.String str85 = item82.name;
        com.gildedrose.Item item86 = itemUpdater8.update(item82);
        int int87 = item86.sellIn;
        item86.quality = 0;
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
        org.junit.Assert.assertNotNull(item62);
        org.junit.Assert.assertNotNull(itemUpdater65);
        org.junit.Assert.assertNotNull(itemUpdater67);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 100 + "'", int72 == 100);
        org.junit.Assert.assertNotNull(item73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!, 99, 0" + "'", str74, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!, 10, 0" + "'", str77, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item78);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!, 100, 1" + "'", str85, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 9 + "'", int87 == 9);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
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
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory36.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater44 = itemUpdaterFactory36.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdater itemUpdater46 = itemUpdaterFactory36.getInstance("hi!, 100, 52, 32, 1");
        com.gildedrose.ItemUpdater itemUpdater48 = itemUpdaterFactory36.getInstance("hi!, 100, 1, 10, 0, 31, 0");
        com.gildedrose.Item item52 = new com.gildedrose.Item("hi!, 0, 0, 52, 1", 10, (int) (short) 0);
        item52.quality = (byte) 100;
        com.gildedrose.Item item55 = itemUpdater48.update(item52);
        com.gildedrose.Item item56 = itemUpdater10.update(item52);
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
        org.junit.Assert.assertNotNull(itemUpdater44);
        org.junit.Assert.assertNotNull(itemUpdater46);
        org.junit.Assert.assertNotNull(itemUpdater48);
        org.junit.Assert.assertNotNull(item55);
        org.junit.Assert.assertNotNull(item56);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
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
        item11.sellIn = 30;
        java.lang.String str19 = item11.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 30, 0" + "'", str19, "hi!, 30, 0");
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
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
        java.lang.String str55 = item54.name;
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
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!, 0, 0" + "'", str55, "hi!, 0, 0");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', 1);
        int int4 = item3.sellIn;
        item3.name = "hi!";
        java.lang.String str7 = item3.name;
        int int8 = item3.sellIn;
        item3.quality = ' ';
        int int11 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 1, 0, 0, 52, 8, 32");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
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
        com.gildedrose.Item item89 = new com.gildedrose.Item("hi!, 96, 0", 10, 51);
        com.gildedrose.Item item90 = itemUpdater2.update(item89);
        java.lang.Class<?> wildcardClass91 = itemUpdater2.getClass();
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
        org.junit.Assert.assertNotNull(item90);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.Item item17 = new com.gildedrose.Item("hi!", 100, 1);
        int int18 = item17.sellIn;
        com.gildedrose.Item item19 = itemUpdater13.update(item17);
        java.lang.String str20 = item17.toString();
        item17.sellIn = 10;
        java.lang.String str23 = item17.toString();
        item17.sellIn = 1;
        int int26 = item17.sellIn;
        java.lang.String str27 = item17.name;
        item17.quality = ' ';
        com.gildedrose.Item item30 = itemUpdater8.update(item17);
        item17.name = "hi!, 100, 1, -2, -1";
        java.lang.String str33 = item17.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 99, 0" + "'", str20, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 10, 0" + "'", str23, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!, 100, 1, -2, -1" + "'", str33, "hi!, 100, 1, -2, -1");
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 100, 52", (int) (byte) 100, (int) (byte) 100);
        int int13 = item12.quality;
        com.gildedrose.Item item14 = itemUpdater8.update(item12);
        int int15 = item14.sellIn;
        item14.sellIn = 31;
        item14.sellIn = (-3);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(item14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 9, 1, 97, 50", (int) (byte) 1, 9);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 9, 1, 97, 50, 1, 9" + "'", str4, "hi!, 100, 1, 9, 1, 97, 50, 1, 9");
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
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
        java.lang.String str60 = item59.name;
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
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        item13.quality = 35;
        int int16 = item13.sellIn;
        item13.name = "hi!, 99, 0, 98, 0, 31, 32";
        item13.sellIn = 10;
        int int21 = item13.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        java.lang.String str16 = item14.name;
        item14.quality = 0;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 99, 0" + "'", str16, "hi!, 99, 0");
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        item3.quality = 100;
        int int8 = item3.sellIn;
        java.lang.String str9 = item3.name;
        item3.name = "hi!, -3, 0";
        item3.name = "hi!, 100, 1, 35, 0";
        java.lang.String str14 = item3.toString();
        java.lang.String str15 = item3.name;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 99, 0" + "'", str9, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1, 35, 0, 100, 100" + "'", str14, "hi!, 100, 1, 35, 0, 100, 100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 100, 1, 35, 0" + "'", str15, "hi!, 100, 1, 35, 0");
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
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
        item41.sellIn = 50;
        item41.name = "hi!, 98, -2";
        item41.sellIn = 52;
        int int48 = item41.quality;
        item41.sellIn = (short) 100;
        int int51 = item41.quality;
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
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
        item15.sellIn = 0;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 8, 0");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory33 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory33.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater37 = itemUpdaterFactory33.getInstance("");
        com.gildedrose.Item item41 = new com.gildedrose.Item("hi!", 100, 1);
        int int42 = item41.sellIn;
        com.gildedrose.Item item43 = itemUpdater37.update(item41);
        java.lang.String str44 = item41.toString();
        item41.sellIn = 10;
        java.lang.String str47 = item41.toString();
        item41.sellIn = 98;
        item41.sellIn = (byte) 10;
        com.gildedrose.Item item52 = itemUpdater13.update(item41);
        item52.sellIn = 50;
        com.gildedrose.Item item55 = itemUpdater10.update(item52);
        item52.quality = (short) 100;
        item52.sellIn = (byte) 10;
        int int60 = item52.sellIn;
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
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertNotNull(itemUpdater37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!, 99, 0" + "'", str44, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!, 10, 0" + "'", str47, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertNotNull(item55);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -1, 52");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance(", 100, 1, -4, 0, 1, 97");
        java.lang.Class<?> wildcardClass11 = itemUpdater10.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
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
        int int48 = item38.quality;
        java.lang.String str49 = item38.name;
        item38.name = ", 52, 1";
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 50 + "'", int48 == 50);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 100, 0", 10, (int) 'a');
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50", (int) (short) 1, (int) (short) 100);
        item3.sellIn = 10;
        item3.name = "hi!, 98, 0";
        int int8 = item3.quality;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        item13.quality = 35;
        int int16 = item13.sellIn;
        item13.name = "hi!, 99, 0, 98, 0, 31, 32";
        int int19 = item13.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 0, 52, 8, 32", 98, (int) (byte) 1);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 98, -2, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -3, 49, 9, -2");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.name;
        item3.sellIn = (-1);
        int int9 = item3.quality;
        item3.name = "hi!, 10, 0, 10, 0";
        int int12 = item3.quality;
        item3.quality = 97;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
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
        com.gildedrose.Item item45 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        item45.name = "hi!, 10, 0";
        com.gildedrose.Item item48 = itemUpdater2.update(item45);
        item48.name = "hi!, -1, -1";
        java.lang.String str51 = item48.name;
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
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!, -1, -1" + "'", str51, "hi!, -1, -1");
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -3, 0", 9, 9);
        item3.sellIn = 9;
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -3, 0, 9, 9" + "'", str6, "hi!, -3, 0, 9, 9");
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        item8.quality = 100;
        item8.quality = 49;
        java.lang.String str13 = item8.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        item3.sellIn = 99;
        int int6 = item3.sellIn;
        item3.quality = 96;
        item3.quality = 35;
        item3.sellIn = 46;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6 == 99);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.name;
        item3.name = "hi!, 100, 52";
        int int9 = item3.sellIn;
        java.lang.String str10 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 100, 52, 100, 1" + "'", str10, "hi!, 100, 52, 100, 1");
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
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
        java.lang.String str68 = item61.toString();
        java.lang.String str69 = item61.toString();
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
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!, 31, 0" + "'", str68, "hi!, 31, 0");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!, 31, 0" + "'", str69, "hi!, 31, 0");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
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
        java.lang.String str18 = item8.toString();
        item8.quality = '4';
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 10, 10" + "'", str18, "hi!, 10, 10");
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        int int10 = item6.sellIn;
        item6.name = ", 10, 10";
        java.lang.String str13 = item6.toString();
        item6.quality = 95;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ", 10, 10, 99, 0" + "'", str13, ", 10, 10, 99, 0");
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 98, 0", 97, 35);
        java.lang.String str4 = item3.toString();
        java.lang.String str5 = item3.name;
        int int6 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 98, 0, 97, 35" + "'", str4, "hi!, 98, 0, 97, 35");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 98, 0" + "'", str5, "hi!, 98, 0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
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
        java.lang.String str63 = item62.toString();
        int int64 = item62.sellIn;
        java.lang.Class<?> wildcardClass65 = item62.getClass();
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
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!, 99, 0, 50, 0" + "'", str63, "hi!, 99, 0, 50, 0");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 50 + "'", int64 == 50);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (short) 0, 52);
        int int4 = item3.sellIn;
        int int5 = item3.sellIn;
        item3.quality = (-3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 49, 48");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 1, 1, 52, 100");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory37 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater39 = itemUpdaterFactory37.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater41 = itemUpdaterFactory37.getInstance("");
        com.gildedrose.Item item45 = new com.gildedrose.Item("hi!", 100, 1);
        int int46 = item45.sellIn;
        com.gildedrose.Item item47 = itemUpdater41.update(item45);
        java.lang.String str48 = item45.toString();
        item45.sellIn = 10;
        java.lang.String str51 = item45.toString();
        item45.sellIn = 98;
        item45.sellIn = (byte) 10;
        com.gildedrose.Item item56 = itemUpdater17.update(item45);
        com.gildedrose.Item item57 = itemUpdater14.update(item56);
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
        org.junit.Assert.assertNotNull(itemUpdater39);
        org.junit.Assert.assertNotNull(itemUpdater41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!, 99, 0" + "'", str48, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!, 10, 0" + "'", str51, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item56);
        org.junit.Assert.assertNotNull(item57);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", (int) (byte) 10, (int) (short) 100);
        item3.quality = 'a';
        item3.name = "";
        int int8 = item3.sellIn;
        item3.name = "hi!, 0, 0";
        java.lang.String str11 = item3.name;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 0, 0" + "'", str11, "hi!, 0, 0");
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) '4', 10);
        item3.quality = 0;
        int int6 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0", (int) (short) 0, (int) '4');
        java.lang.String str4 = item3.toString();
        java.lang.String str5 = item3.toString();
        item3.name = "hi!, 100, -1, 10, 100";
        int int8 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 0, 0, 52" + "'", str4, "hi!, 1, 0, 0, 52");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 1, 0, 0, 52" + "'", str5, "hi!, 1, 0, 0, 52");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1", 1, (-1));
        item3.sellIn = (byte) 1;
        item3.sellIn = 96;
        item3.quality = 51;
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item14 = new com.gildedrose.Item("", (int) '4', 1);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        int int16 = item15.sellIn;
        java.lang.Class<?> wildcardClass17 = item15.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        item3.quality = (short) 0;
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
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
        com.gildedrose.Item item25 = new com.gildedrose.Item("hi!, 100, -1", (int) (byte) 10, 0);
        item25.name = ", 0, 50, 1, 100, 99, 0";
        java.lang.String str28 = item25.name;
        com.gildedrose.Item item29 = itemUpdater2.update(item25);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ", 0, 50, 1, 100, 99, 0" + "'", str28, ", 0, 50, 1, 100, 99, 0");
        org.junit.Assert.assertNotNull(item29);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 10");
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
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", (-1), 99);
        int int4 = item3.sellIn;
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance(", 0, 50, 10, -1");
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!, -1, 0", 51, 97);
        com.gildedrose.Item item11 = itemUpdater6.update(item10);
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!, 10, 0, 10, 1", 51, 9);
        item15.quality = 'a';
        java.lang.String str18 = item15.toString();
        com.gildedrose.Item item19 = itemUpdater6.update(item15);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory20 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory20.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory20.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory25 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory25.getInstance("");
        com.gildedrose.Item item31 = new com.gildedrose.Item("hi!", 100, 1);
        int int32 = item31.sellIn;
        com.gildedrose.Item item33 = itemUpdater27.update(item31);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory34 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater36 = itemUpdaterFactory34.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory37 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater39 = itemUpdaterFactory37.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater41 = itemUpdaterFactory37.getInstance("");
        com.gildedrose.Item item45 = new com.gildedrose.Item("hi!", 100, 1);
        int int46 = item45.sellIn;
        com.gildedrose.Item item47 = itemUpdater41.update(item45);
        com.gildedrose.Item item48 = itemUpdater36.update(item47);
        com.gildedrose.Item item49 = itemUpdater27.update(item48);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater50 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item54 = new com.gildedrose.Item("hi!", 100, 1);
        int int55 = item54.sellIn;
        com.gildedrose.Item item56 = conjuredItemUpdater50.update(item54);
        com.gildedrose.Item item57 = itemUpdater27.update(item54);
        com.gildedrose.Item item61 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        com.gildedrose.Item item62 = itemUpdater27.update(item61);
        com.gildedrose.Item item63 = itemUpdater24.update(item61);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory64 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater66 = itemUpdaterFactory64.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater68 = itemUpdaterFactory64.getInstance("");
        com.gildedrose.Item item72 = new com.gildedrose.Item("hi!", 100, 1);
        int int73 = item72.sellIn;
        com.gildedrose.Item item74 = itemUpdater68.update(item72);
        java.lang.String str75 = item72.toString();
        java.lang.String str76 = item72.name;
        com.gildedrose.Item item77 = itemUpdater24.update(item72);
        com.gildedrose.Item item81 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1, 52, 52", 0, 9);
        com.gildedrose.Item item82 = itemUpdater24.update(item81);
        item82.quality = (-1);
        java.lang.String str85 = item82.name;
        com.gildedrose.Item item86 = itemUpdater6.update(item82);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 10, 0, 10, 1, 51, 97" + "'", str18, "hi!, 10, 0, 10, 1, 51, 97");
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertNotNull(itemUpdater36);
        org.junit.Assert.assertNotNull(itemUpdater39);
        org.junit.Assert.assertNotNull(itemUpdater41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(item49);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertNotNull(item56);
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertNotNull(item62);
        org.junit.Assert.assertNotNull(item63);
        org.junit.Assert.assertNotNull(itemUpdater66);
        org.junit.Assert.assertNotNull(itemUpdater68);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 100 + "'", int73 == 100);
        org.junit.Assert.assertNotNull(item74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!, 99, 0" + "'", str75, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(item77);
        org.junit.Assert.assertNotNull(item82);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!, 10, 0, 10, 1, 1, -1, 52, 52" + "'", str85, "hi!, 10, 0, 10, 1, 1, -1, 52, 52");
        org.junit.Assert.assertNotNull(item86);
    }
}

