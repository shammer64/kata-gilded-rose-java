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
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2001");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10", 0, (-1));
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 52, 97, -1, 52";
        java.lang.String str8 = item3.name;
        item3.sellIn = 97;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str8, "hi!, 52, 97, -1, 52");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2002");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        item3.name = ", 100, 1";
        int int7 = item3.sellIn;
        item3.quality = 1;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2003");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52", 0, 52);
        item3.sellIn = (short) -1;
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2004");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        item3.sellIn = 52;
        int int13 = item3.sellIn;
        java.lang.String str14 = item3.name;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2005");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 100, 0, 0, 35", 0, (int) (short) -1);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2006");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater5.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2007");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        int int10 = item3.quality;
        int int11 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str13 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ", -1, 52" + "'", str13, ", -1, 52");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2008");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52, 10, 97, 52, 97", 35, 97);
        int int4 = item3.sellIn;
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2009");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", (-1), 10);
        item3.quality = (short) 100;
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2010");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (byte) 10;
        int int8 = item3.quality;
        int int9 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2011");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = 0;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2012");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int12 = item3.quality;
        item3.sellIn = (byte) 10;
        int int15 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater16 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str17 = item3.toString();
        java.lang.Class<?> wildcardClass18 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 10, 10" + "'", str17, "hi!, 10, 10");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2013");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int9 = item3.sellIn;
        java.lang.String str10 = item3.name;
        item3.sellIn = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 52, 97" + "'", str10, "hi!, 52, 97");
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2014");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 0;
        item3.name = "hi!, 52, 97, 0, 10";
        item3.name = ", -1, 97, 1, 0";
        int int19 = item3.sellIn;
        java.lang.String str20 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ", -1, 97, 1, 0, 1, 0" + "'", str20, ", -1, 97, 1, 0, 1, 0");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2015");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10, -1, 97", (int) ' ', (int) (short) 1);
        item3.quality = 97;
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2016");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        item3.name = "hi!, -1, 0";
        int int6 = item3.quality;
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 0, 0, 0" + "'", str7, "hi!, -1, 0, 0, 0");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2017");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = ' ';
        item3.name = "hi!, -1, 97, 1, -1";
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.toString();
        java.lang.String str13 = item3.name;
        java.lang.Class<?> wildcardClass14 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 97, 1, -1, 32, 97" + "'", str11, "hi!, -1, 97, 1, -1, 32, 97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, -1, 97, 1, -1, 32, 97" + "'", str12, "hi!, -1, 97, 1, -1, 32, 97");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, -1, 97, 1, -1" + "'", str13, "hi!, -1, 97, 1, -1");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2018");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 1, (-1));
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, -1, 97, 1, -1, -1, 1";
        int int8 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2019");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, 0, 1, 32", (int) (byte) 10, (int) ' ');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2020");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 1;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2021");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.quality = 32;
        item3.quality = 0;
        java.lang.String str12 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 97" + "'", str7, "hi!, 1, 97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 1, 0" + "'", str12, "hi!, 1, 0");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2022");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 10;
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2023");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        item3.name = "hi!, -1, 10, 10, 10";
        int int8 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 10, -1, 97" + "'", str4, ", 100, 10, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2024");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 10", 32, 0);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2025");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 10, -1", 10, (int) (byte) 0);
        item3.name = "hi!, 32, 97, 32, 35";
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2026");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", 10, (int) '4');
        item3.sellIn = 'a';
        item3.sellIn = (short) 100;
        java.lang.String str8 = item3.toString();
        item3.quality = (short) 1;
        java.lang.String str11 = item3.name;
        java.lang.String str12 = item3.name;
        int int13 = item3.quality;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 100, 1, 100, 52" + "'", str8, ", 100, 1, 100, 52");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", 100, 1" + "'", str11, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ", 100, 1" + "'", str12, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2027");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        int int8 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater9.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater9.update();
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater9.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2028");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 97, 32", (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2029");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str7 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdater9.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2030");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", 10, (int) '4');
        item3.sellIn = 'a';
        item3.sellIn = (short) 100;
        java.lang.String str8 = item3.toString();
        item3.quality = (short) 1;
        java.lang.String str11 = item3.name;
        item3.name = "hi!, 100, 97";
        item3.name = "hi!, 32, 97, 32, 35";
        java.lang.Class<?> wildcardClass16 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 100, 1, 100, 52" + "'", str8, ", 100, 1, 100, 52");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", 100, 1" + "'", str11, ", 100, 1");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2031");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 10, 0", (int) (byte) 100, (int) (short) 1);
        java.lang.String str4 = item3.name;
        item3.name = "";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1, 10, 0" + "'", str4, ", 100, 1, 10, 0");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2032");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int10 = item3.sellIn;
        int int11 = item3.sellIn;
        item3.name = "hi!, 32, 10, -1, -1";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2033");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) (short) 0, (int) '#');
        item3.name = "hi!, 52, 97, 52, -1, 52, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, 52, -1, 52, 97, 0, 35" + "'", str7, "hi!, 52, 97, 52, -1, 52, 97, 0, 35");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2034");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) (byte) 0, 10);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 0, 0, 10" + "'", str4, "hi!, -1, 0, 0, 10");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2035");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.name;
        item3.quality = (byte) 0;
        int int7 = item3.quality;
        item3.quality = 10;
        item3.name = ", 100, 1, 1, 97";
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass13 = itemUpdater12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2036");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.name;
        item3.quality = (byte) 0;
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 0" + "'", str7, "hi!, -1, 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2037");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1", 97, 97);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2038");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = '#';
        item3.quality = (byte) 0;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2039");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52, 10, 97, -1, 0", (int) ' ', (int) (byte) 100);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 97, -1, 52, 10, 97, -1, 0" + "'", str4, "hi!, 52, 97, -1, 52, 10, 97, -1, 0");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2040");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.name;
        item3.sellIn = (byte) 10;
        item3.quality = (-1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2041");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        item3.sellIn = 35;
        java.lang.String str10 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 52, 97, 35, 52" + "'", str10, "hi!, 52, 97, 35, 52");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2042");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        java.lang.String str10 = item3.toString();
        item3.name = "hi!, -1, 97, 1, -1";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str14 = item3.toString();
        java.lang.Class<?> wildcardClass15 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", -1, 52, -1, 97" + "'", str10, ", -1, 52, -1, 97");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, -1, 97, 1, -1, -1, 97" + "'", str14, "hi!, -1, 97, 1, -1, -1, 97");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2043");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdater14.update();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2044");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass13 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2045");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 97, 97";
        item3.name = ", 100, 1, 100, 52";
        item3.quality = ' ';
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int15 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2046");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 100;
        java.lang.String str9 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdater10.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2047");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str8 = item3.toString();
        item3.sellIn = (short) 100;
        java.lang.String str11 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str13 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 10, -1" + "'", str8, ", 10, -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2048");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 0, 1", (int) (short) 10, (int) '#');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2049");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 10, -1, 97" + "'", str4, ", 100, 10, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2050");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 1;
        int int13 = item3.quality;
        java.lang.String str14 = item3.name;
        java.lang.String str15 = item3.toString();
        item3.sellIn = 10;
        int int18 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ", -1, 52" + "'", str14, ", -1, 52");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ", -1, 52, 1, 97" + "'", str15, ", -1, 52, 1, 97");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2051");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.toString();
        item3.sellIn = 1;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str8, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str9, "hi!, 52, 97, -1, 52");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2052");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        int int6 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2053");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, -1, 1";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater13.update();
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater13.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2054");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10", (int) '#', 0);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 100;
        int int7 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2055");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 1", (int) 'a', (int) (short) 100);
        int int4 = item3.quality;
        java.lang.String str5 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str7 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 97, 1" + "'", str5, "hi!, 97, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 97, 1" + "'", str7, "hi!, 97, 1");
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2056");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", 0, 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.toString();
        item3.quality = (byte) 1;
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, 10, 0, 0" + "'", str5, "hi!, -1, 10, 0, 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 10" + "'", str8, "hi!, -1, 10");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2057");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str12 = item3.name;
        int int13 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass15 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2058");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str10 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdater12.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2059");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10", (int) '#', 0);
        item3.quality = 97;
        int int6 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2060");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 52;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2061");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0, 97, 100", (int) (byte) 0, 0);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2062");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.toString();
        int int8 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2063");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdater9.update();
        java.lang.Class<?> wildcardClass11 = itemUpdater10.getClass();
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2064");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        int int8 = item3.sellIn;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 10;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2065");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = '#';
        item3.name = "hi!, 1, 10";
        java.lang.String str14 = item3.toString();
        item3.name = ", -1, 1";
        com.gildedrose.ItemUpdater itemUpdater17 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int18 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 1, 10, -1, 35" + "'", str14, "hi!, 1, 10, -1, 35");
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2066");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int9 = item3.sellIn;
        java.lang.String str10 = item3.name;
        item3.sellIn = (byte) 1;
        item3.quality = (byte) 100;
        java.lang.String str15 = item3.toString();
        int int16 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 52, 97" + "'", str10, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 52, 97, 1, 100" + "'", str15, "hi!, 52, 97, 1, 100");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2067");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int9 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 0;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2068");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int15 = item3.quality;
        item3.quality = (byte) 100;
        int int18 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2069");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, -1, 1, 97, 10", 52, (int) (byte) 100);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2070");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.sellIn;
        int int5 = item3.quality;
        item3.sellIn = 1;
        java.lang.String str8 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 100, 1, 1, 0" + "'", str8, ", 100, 1, 1, 0");
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2071");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", 0, (-1));
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2072");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 32, 97", (-1), (int) (short) 10);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 32, 97" + "'", str4, "hi!, 32, 97");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2073");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 10, 0", 10, 32);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        item3.quality = '#';
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1, 10, 0" + "'", str4, ", 100, 1, 10, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1, 10, 0, 10, 32" + "'", str5, ", 100, 1, 10, 0, 10, 32");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2074");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (byte) -1;
        item3.name = "hi!, -1, 97, 1, -1, 32, 97";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1, 0, 0" + "'", str5, ", 100, 1, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2075");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        java.lang.String str10 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, -1, 10" + "'", str10, "hi!, -1, 10");
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2076");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 1", (int) 'a', (int) (short) 100);
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2077");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 1, -1, 97", (int) (byte) 10, 97);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2078");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        int int4 = item3.sellIn;
        int int5 = item3.quality;
        java.lang.String str6 = item3.toString();
        int int7 = item3.quality;
        item3.sellIn = 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 97" + "'", str6, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2079");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10", 1, (int) (short) 0);
        item3.name = "";
        java.lang.String str6 = item3.name;
        int int7 = item3.sellIn;
        java.lang.String str8 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 1, 0" + "'", str8, ", 1, 0");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2080");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater4.update();
        java.lang.Class<?> wildcardClass9 = conjuredItemUpdater4.getClass();
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2081");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int6 = item3.quality;
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater9.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2082");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = '#';
        int int12 = item3.sellIn;
        item3.name = ", 52, 0";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2083");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 52, 10, 1, 10, 10, -1";
        int int15 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2084");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10", 52, (int) (byte) 100);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2085");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.toString();
        int int13 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater15 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str16 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 1, 10" + "'", str12, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2086");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        item3.sellIn = (short) 100;
        item3.sellIn = (short) -1;
        int int15 = item3.sellIn;
        item3.name = "hi!, 52, 10, 1, 10";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater18 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str19 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 52, 10, 1, 10, -1, 10" + "'", str19, "hi!, 52, 10, 1, 10, -1, 10");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2087");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater14.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2088");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater8.update();
        java.lang.Class<?> wildcardClass11 = itemUpdater10.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 97" + "'", str7, "hi!, 1, 97");
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2089");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 52, 0", 100, 0);
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 10, 52, 0" + "'", str6, "hi!, -1, 10, 52, 0");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2090");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        item3.name = "hi!, -1, 97";
        item3.name = "hi!, 52, 10";
        java.lang.String str16 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater17 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 10, 0";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater20 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater21 = conjuredItemUpdater20.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 52, 10, 1, 10" + "'", str16, "hi!, 52, 10, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater21);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2091");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int13 = item3.sellIn;
        item3.sellIn = (short) -1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater16 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater17 = conjuredItemUpdater16.update();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdater17.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater18);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2092");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 100, 0, 0, 35", 0, (int) (short) -1);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass5 = conjuredItemUpdater4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2093");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", 97, (int) (short) -1);
        item3.quality = 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2094");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str7 = item3.name;
        item3.name = ", -1, 97, 10, 1";
        item3.quality = (byte) 1;
        item3.quality = (byte) 10;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2095");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", 97, (int) (short) 1);
        item3.name = ", 100, 1";
        java.lang.String str6 = item3.name;
        item3.name = "hi!, -1, 10";
        item3.sellIn = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1" + "'", str6, ", 100, 1");
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2096");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 0;
        item3.name = "hi!, 52, 97, 0, 10";
        java.lang.String str17 = item3.name;
        item3.name = "hi!, 10, 0";
        com.gildedrose.ItemUpdater itemUpdater20 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (short) 100;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str17, "hi!, 52, 97, 0, 10");
        org.junit.Assert.assertNotNull(itemUpdater20);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2097");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 0", 32, (int) (short) -1);
        item3.sellIn = '4';
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2098");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        java.lang.String str7 = item3.name;
        int int8 = item3.sellIn;
        item3.sellIn = 'a';
        int int11 = item3.sellIn;
        item3.name = "hi!, 52, 97, -1, 1";
        int int14 = item3.sellIn;
        item3.sellIn = (short) 100;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2099");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int9 = item3.sellIn;
        java.lang.String str10 = item3.name;
        item3.sellIn = (byte) 1;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int14 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 52, 97" + "'", str10, "hi!, 52, 97");
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2100");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0", (int) (byte) 100, 32);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2101");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        item3.sellIn = 'a';
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2102");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 52, -1, 0, 10", (int) '#', (int) (short) 10);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2103");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        item3.sellIn = (byte) 100;
        java.lang.String str6 = item3.toString();
        int int7 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 100, 97" + "'", str6, "hi!, 100, 97");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2104");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        int int8 = item3.quality;
        item3.name = "hi!, 52, 10";
        item3.sellIn = (byte) 100;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int14 = item3.sellIn;
        java.lang.String str15 = item3.name;
        int int16 = item3.quality;
        item3.sellIn = (short) 0;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 52, 10" + "'", str15, "hi!, 52, 10");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2105");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 1;
        java.lang.String str9 = item3.name;
        int int10 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1, 10, 0" + "'", str5, ", 100, 1, 10, 0");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 100, 1" + "'", str9, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2106");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", 10, 1);
        java.lang.String str4 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        java.lang.Class<?> wildcardClass7 = conjuredItemUpdater5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", -1, 97" + "'", str4, ", -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2107");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 100, 52", 35, (int) (short) 1);
        item3.sellIn = (short) -1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2108");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        item3.sellIn = (short) 100;
        java.lang.String str13 = item3.name;
        item3.name = ", -1, 52, -1, 97";
        java.lang.String str16 = item3.name;
        java.lang.String str17 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ", -1, 52, -1, 97" + "'", str16, ", -1, 52, -1, 97");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ", -1, 52, -1, 97, 100, 10" + "'", str17, ", -1, 52, -1, 97, 100, 10");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2109");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 0, 0", 1, 35);
        java.lang.String str4 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 10, 0, 0" + "'", str4, "hi!, -1, 10, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2110");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        item3.name = ", 100, 1";
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int8 = item3.quality;
        java.lang.String str9 = item3.name;
        int int10 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 100, 1" + "'", str9, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2111");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater6.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2112");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (int) (short) 0, 10);
        int int4 = item3.quality;
        item3.name = ", 100, 1, 0, 0";
        java.lang.String str7 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (short) 1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 0, 0, 0, 10" + "'", str7, ", 100, 1, 0, 0, 0, 10");
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2113");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str7 = item3.name;
        item3.quality = (byte) 1;
        java.lang.String str10 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", -1, 1" + "'", str10, ", -1, 1");
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2114");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (byte) 1;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2115");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (-1));
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = ", 100, 1, 100, 52";
        item3.sellIn = 97;
        java.lang.String str9 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 100, 1, 100, 52, 97, -1" + "'", str9, ", 100, 1, 100, 52, 97, -1");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2116");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) (short) 100, (int) (short) 1);
        item3.name = ", 100, 1";
        item3.name = ", 100, 10";
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str9 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 100, 10" + "'", str9, ", 100, 10");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2117");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.name;
        int int10 = item3.quality;
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 52, 97" + "'", str11, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 52, 97" + "'", str12, "hi!, 52, 97");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2118");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.name;
        item3.quality = (byte) 0;
        int int7 = item3.quality;
        item3.quality = 10;
        item3.name = ", 100, 10, 10, 0";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2119");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int13 = item3.sellIn;
        item3.sellIn = (short) -1;
        com.gildedrose.ItemUpdater itemUpdater16 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2120");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int10 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0, 1, 32, -1, 0";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2121");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 100, 52);
        java.lang.String str4 = item3.name;
        item3.name = "hi!, 52, 97, -1, 52";
        item3.name = "hi!, 10, 0";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2122");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10, 1, 0", (int) (byte) 100, 100);
        item3.sellIn = (byte) -1;
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2123");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) 'a', 0);
        item3.sellIn = (byte) 0;
        java.lang.String str6 = item3.toString();
        item3.name = "hi!, 35, 97";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 10, 0, 0" + "'", str6, "hi!, -1, 10, 0, 0");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2124");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        int int12 = item3.quality;
        item3.quality = 0;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2125");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int9 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int11 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater12.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2126");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) 'a', 0);
        item3.sellIn = (byte) 0;
        item3.quality = (-1);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2127");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str5 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 52, 97, -1, 10, 100, 97";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2128");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater4.update();
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2129");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10, 1, 10, 10, -1", 10, (int) (byte) 1);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2130");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 52, -1", (int) '#', 0);
        item3.quality = (byte) 10;
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2131");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = 'a';
        item3.name = "hi!, -1, 97, 0, 1, -1, 97";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2132");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str10 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater11.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2133");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        int int4 = item3.quality;
        java.lang.String str5 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1" + "'", str5, ", 100, 1");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2134");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1", (int) 'a', (int) (byte) 0);
        item3.sellIn = (byte) 1;
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2135");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", 10, 1);
        java.lang.String str4 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str6 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", -1, 97" + "'", str4, ", -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", -1, 97" + "'", str6, ", -1, 97");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2136");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdater5.update();
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2137");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        java.lang.String str6 = item3.name;
        java.lang.Class<?> wildcardClass7 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2138");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (short) 1;
        int int15 = item3.quality;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2139");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52, 1, -1", (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2140");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        item3.quality = 0;
        int int8 = item3.sellIn;
        int int9 = item3.sellIn;
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2141");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", 35, (int) (short) 1);
        int int4 = item3.sellIn;
        item3.sellIn = 100;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2142");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97, 10, 97", (int) (byte) 0, (int) ' ');
        java.lang.String str4 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", -1, 97, 10, 97" + "'", str4, ", -1, 97, 10, 97");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2143");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass11 = itemUpdater10.getClass();
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2144");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.sellIn = (short) -1;
        int int10 = item3.sellIn;
        item3.quality = (short) -1;
        item3.name = ", 100, 10, -1, 97";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2145");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 0, 1, -1, 97", (int) ' ', 52);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2146");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) -1, (int) (short) 0);
        item3.name = "hi!, 1, 10";
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2147");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 'a';
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater16 = conjuredItemUpdater15.update();
        com.gildedrose.ItemUpdater itemUpdater17 = conjuredItemUpdater15.update();
        com.gildedrose.ItemUpdater itemUpdater18 = conjuredItemUpdater15.update();
        com.gildedrose.ItemUpdater itemUpdater19 = conjuredItemUpdater15.update();
        java.lang.Class<?> wildcardClass20 = conjuredItemUpdater15.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2148");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        item3.sellIn = (short) 100;
        java.lang.String str13 = item3.name;
        item3.sellIn = 97;
        item3.name = "hi!, 10, 0, -1, 1";
        com.gildedrose.ItemUpdater itemUpdater18 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str19 = item3.toString();
        int int20 = item3.sellIn;
        item3.quality = '4';
        com.gildedrose.ItemUpdater itemUpdater23 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 10, 0, -1, 1, 97, 10" + "'", str19, "hi!, 10, 0, -1, 1, 97, 10");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(itemUpdater23);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2149");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        item3.quality = (short) 0;
        item3.sellIn = 10;
        java.lang.String str14 = item3.toString();
        int int15 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater16 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2150");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str8 = item3.toString();
        item3.sellIn = (short) 100;
        java.lang.String str11 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str13 = item3.name;
        int int14 = item3.sellIn;
        item3.sellIn = 1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 10, -1" + "'", str8, ", 10, -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2151");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater7.update();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2152");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.name;
        item3.quality = 97;
        java.lang.String str7 = item3.name;
        item3.sellIn = (-1);
        item3.name = "hi!, -1, 97, 1, -1, 32, 97, 52, 10";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2153");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = ' ';
        item3.name = "hi!, -1, 97, 1, -1";
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str14 = item3.name;
        item3.sellIn = 52;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 97, 1, -1, 32, 97" + "'", str11, "hi!, -1, 97, 1, -1, 32, 97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, -1, 97, 1, -1, 32, 97" + "'", str12, "hi!, -1, 97, 1, -1, 32, 97");
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, -1, 97, 1, -1" + "'", str14, "hi!, -1, 97, 1, -1");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2154");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10, 1, 0", (int) (short) 0, 0);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str5 = item3.name;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 52, 97, 0, 10, 1, 0" + "'", str5, "hi!, 52, 97, 0, 10, 1, 0");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2155");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 97", (int) (short) 10, (int) (byte) 1);
        java.lang.String str4 = item3.name;
        int int5 = item3.quality;
        java.lang.String str6 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 97" + "'", str4, "hi!, 1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 1, 97" + "'", str6, "hi!, 1, 97");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2156");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater7.update();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2157");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (short) -1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int8 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2158");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        item3.quality = 97;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str8 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2159");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 0, 1", (int) (short) 10, (int) '#');
        java.lang.String str4 = item3.toString();
        item3.name = "hi!, 1, 10, -1, 35";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97, 0, 1, 10, 35" + "'", str4, "hi!, -1, 97, 0, 1, 10, 35");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2160");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", 10, (int) '4');
        item3.sellIn = 'a';
        item3.sellIn = (short) 100;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = ", 100, 97";
        item3.sellIn = 100;
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2161");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1, -1, 1", (int) (byte) -1, (int) (byte) 1);
        item3.sellIn = ' ';
        item3.sellIn = (byte) 0;
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2162");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        java.lang.String str4 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater5.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", -1, 52" + "'", str4, ", -1, 52");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2163");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 1;
        java.lang.String str13 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = 52;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ", -1, 52" + "'", str13, ", -1, 52");
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2164");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        int int7 = item3.sellIn;
        int int8 = item3.quality;
        int int9 = item3.quality;
        java.lang.String str10 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass12 = itemUpdater11.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", 100, 1, 10, -1" + "'", str10, ", 100, 1, 10, -1");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2165");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1, 100, -1", (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2166");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        java.lang.String str10 = item3.name;
        item3.name = "";
        item3.quality = '4';
        java.lang.String str15 = item3.name;
        java.lang.String str16 = item3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ", 52, 52" + "'", str16, ", 52, 52");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2167");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str8 = item3.toString();
        item3.sellIn = (short) 100;
        java.lang.String str11 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str13 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater16 = conjuredItemUpdater15.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 10, -1" + "'", str8, ", 10, -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2168");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 100, (int) 'a');
        item3.quality = '4';
        item3.name = "hi!, 52, 97, -1, 52, 10, 97, 52, 10";
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2169");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str8 = item3.toString();
        item3.sellIn = (short) 100;
        java.lang.String str11 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass16 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 10, -1" + "'", str8, ", 10, -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2170");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater6.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2171");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 35, 10);
        item3.name = ", 100, 1, 52, 0";
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2172");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.toString();
        item3.quality = (byte) 100;
        int int12 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = 32;
        java.lang.String str16 = item3.toString();
        item3.quality = 10;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 32, 100" + "'", str16, "hi!, 32, 100");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2173");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        item3.name = "hi!";
        int int8 = item3.sellIn;
        int int9 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2174");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.quality;
        item3.quality = (short) 0;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = 52;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2175");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdater12.update();
        java.lang.Class<?> wildcardClass14 = itemUpdater13.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2176");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", (int) (byte) 1, (int) (byte) 0);
        item3.quality = (short) 0;
        item3.quality = 'a';
        item3.sellIn = (short) 0;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int11 = item3.quality;
        int int12 = item3.quality;
        java.lang.String str13 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ", -1, 97, 0, 97" + "'", str13, ", -1, 97, 0, 97");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2177");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 97" + "'", str6, "hi!, -1, 97");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2178");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.quality;
        item3.quality = 100;
        item3.name = "hi!, -1, 10, 52, 0";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int10 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater11.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2179");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 97, 32", (int) (short) 100, (int) ' ');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2180");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.quality = '4';
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (byte) 1;
        item3.quality = 52;
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2181");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10", (int) (byte) 100, (int) (byte) 100);
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 10, 100, 100" + "'", str4, "hi!, 1, 10, 100, 100");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2182");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int6 = item3.quality;
        int int7 = item3.quality;
        item3.name = "hi!, 1, 1, -1, 52";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdater11.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2183");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.sellIn = (short) -1;
        int int10 = item3.sellIn;
        java.lang.String str11 = item3.name;
        java.lang.String str12 = item3.name;
        item3.sellIn = (short) -1;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2184");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 100, (int) (short) 1);
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        item3.sellIn = (-1);
        item3.name = ", -1, 52, 10, -1";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2185");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 97, 32, -1, 97", (int) (short) 1, 0);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2186");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        item3.name = ", 100, 1";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2187");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1, -1, 1", (int) (byte) -1, (int) (byte) 1);
        int int4 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 0;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2188");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = ' ';
        java.lang.String str9 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2189");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", 100, (int) (short) 0);
        java.lang.String str4 = item3.name;
        item3.quality = 0;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str8 = item3.toString();
        item3.sellIn = 0;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97, 100, 0" + "'", str8, "hi!, -1, 97, 100, 0");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2190");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.quality;
        int int5 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2191");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.sellIn = (short) -1;
        int int10 = item3.sellIn;
        java.lang.String str11 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 1" + "'", str11, "hi!, -1, 1");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2192");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.sellIn = 1;
        java.lang.String str6 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass8 = itemUpdater7.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2193");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 1", 97, 10);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2194");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10, 10, 0", 0, (int) (short) 100);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2195");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (-1));
        int int4 = item3.quality;
        item3.sellIn = 32;
        item3.sellIn = '#';
        java.lang.String str9 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 35, -1" + "'", str9, "hi!, 35, -1");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2196");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", 100, (int) (short) 0);
        item3.name = ", -1, 97";
        item3.name = "hi!, 52, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2197");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) (short) 100, (int) (short) 1);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (byte) 100;
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2198");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", 100, (int) 'a');
        item3.quality = (byte) 10;
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2199");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 10, 0, 10, 1", 0, 1);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2200");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str9 = item3.name;
        int int10 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = ", 100, 1, 100, 52";
        item3.quality = (short) 0;
        item3.sellIn = (byte) 0;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2201");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2202");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 100;
        int int9 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2203");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        item3.quality = 0;
        item3.name = "hi!, 1, 1, -1, 97, 100, 10";
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2204");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1, 97, 0", (int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2205");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 'a';
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int16 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater17 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(itemUpdater17);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2206");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 97, 32, -1, 97", (int) 'a', (-1));
        item3.sellIn = (short) 100;
        item3.sellIn = 10;
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2207");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        int int12 = item3.quality;
        item3.name = ", 100, 1, 0, 0, 1, 32";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass16 = conjuredItemUpdater15.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2208");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        int int12 = item3.sellIn;
        int int13 = item3.quality;
        java.lang.String str14 = item3.toString();
        int int15 = item3.quality;
        item3.quality = (byte) 100;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, -1, 10" + "'", str14, "hi!, -1, 10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2209");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52, 10, 97, -1, 0", (int) '4', (int) '4');
        item3.name = ", 100, 10, -1, 97, 100, 10";
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2210");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", 0, 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdater4.update();
        java.lang.Class<?> wildcardClass7 = itemUpdater4.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2211");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        item3.name = "";
        int int11 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass13 = itemUpdater12.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2212");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.toString();
        item3.quality = (byte) 100;
        item3.sellIn = '#';
        item3.name = "hi!, -1, 10, 52, 0";
        int int16 = item3.sellIn;
        item3.sellIn = 1;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2213");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", 0, 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdater6.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2214");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater5.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2215");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = 1;
        item3.name = "";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2216");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) 'a', (int) (short) 100);
        java.lang.String str4 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 0, 97, 100" + "'", str4, "hi!, -1, 0, 97, 100");
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2217");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 32, 97, 32, 35", (int) (short) 10, (int) (short) 100);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2218");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.quality;
        java.lang.String str7 = item3.name;
        item3.quality = 52;
        java.lang.String str10 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 1, 52" + "'", str10, "hi!, 1, 52");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2219");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", 10, 0);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2220");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 1;
        int int13 = item3.quality;
        int int14 = item3.quality;
        item3.sellIn = '#';
        java.lang.String str17 = item3.toString();
        java.lang.String str18 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ", -1, 52, 35, 97" + "'", str17, ", -1, 52, 35, 97");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ", -1, 52, 35, 97" + "'", str18, ", -1, 52, 35, 97");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2221");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = '#';
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int9 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2222");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.name;
        java.lang.String str12 = item3.toString();
        item3.sellIn = ' ';
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 1, 10" + "'", str12, "hi!, 1, 10");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2223");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 0, 1", (int) ' ', (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdater5.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2224");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        int int9 = item3.sellIn;
        item3.sellIn = 0;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2225");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 97, 32", (int) (short) 1, (int) (byte) -1);
        item3.sellIn = (byte) -1;
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 52, 97, 97, 32, -1, -1" + "'", str6, "hi!, 52, 97, 97, 32, -1, -1");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2226");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, -1, 1";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int14 = item3.quality;
        java.lang.String str15 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, -1, 1, -1, 97" + "'", str15, "hi!, -1, 1, -1, 97");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2227");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        item3.sellIn = (-1);
        item3.name = "hi!, 10, 10";
        item3.sellIn = '4';
        item3.quality = 0;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2228");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int9 = item3.quality;
        java.lang.String str10 = item3.name;
        item3.sellIn = (byte) 100;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2229");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        java.lang.String str7 = item3.name;
        int int8 = item3.sellIn;
        item3.sellIn = 'a';
        item3.sellIn = 10;
        item3.name = "";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2230");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        int int8 = item3.quality;
        item3.name = "hi!, 52, 10";
        item3.sellIn = (byte) 100;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int14 = item3.sellIn;
        java.lang.String str15 = item3.name;
        int int16 = item3.quality;
        item3.quality = (short) 100;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 52, 10" + "'", str15, "hi!, 52, 10");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2231");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.toString();
        item3.quality = (short) -1;
        int int7 = item3.sellIn;
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 10" + "'", str4, ", 100, 10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 100, -1" + "'", str9, ", 100, -1");
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2232");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 10, -1, -1, 1", (int) ' ', 100);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2233");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 100", 10, (int) '#');
        int int4 = item3.quality;
        item3.quality = '4';
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2234");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2235");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", 10, (int) '4');
        item3.sellIn = 'a';
        item3.sellIn = (short) 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 100;
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2236");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        java.lang.String str5 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater6.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2237");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdater6.update();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2238");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        java.lang.String str10 = item3.name;
        item3.name = "";
        item3.quality = '4';
        item3.name = ", 100, 10, -1, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater17 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater18 = conjuredItemUpdater17.update();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater18);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2239");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.sellIn = (short) 0;
        item3.sellIn = (short) 10;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2240");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 0, 1", (int) ' ', (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (-1);
        item3.quality = (byte) 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2241");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.quality = 1;
        item3.quality = 32;
        int int12 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2242");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str8 = item3.toString();
        int int9 = item3.quality;
        item3.name = "hi!, 100, 97, 100, 0";
        java.lang.String str12 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 100, 97, 100, 0, -1, 97" + "'", str12, "hi!, 100, 97, 100, 0, -1, 97");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2243");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int9 = item3.sellIn;
        java.lang.String str10 = item3.name;
        item3.quality = (short) 1;
        item3.quality = (short) 10;
        java.lang.String str15 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater16 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass17 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 52, 97" + "'", str10, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 52, 97, -1, 10" + "'", str15, "hi!, 52, 97, -1, 10");
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2244");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        int int8 = item3.quality;
        item3.name = "hi!, 52, 10";
        item3.sellIn = (byte) 100;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = 97;
        java.lang.String str16 = item3.name;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 52, 10" + "'", str16, "hi!, 52, 10");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2245");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        item3.quality = 100;
        java.lang.String str11 = item3.name;
        item3.quality = 35;
        int int14 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2246");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 100, 52", 32, 97);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2247");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.quality;
        item3.quality = 100;
        int int7 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int9 = item3.quality;
        int int10 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2248");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10, 10, 0", 0, (int) (short) 100);
        item3.sellIn = (byte) 10;
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2249");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str6 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 97" + "'", str6, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2250");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10, -1, 97", 52, (int) '#');
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 10, -1, 97" + "'", str4, "hi!, 100, 10, -1, 97");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2251");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdater7.update();
        java.lang.Class<?> wildcardClass9 = itemUpdater8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2252");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 1", 0, 10);
        item3.name = ", 100, 1, -1, 97";
        item3.sellIn = (short) -1;
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2253");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1, 10, -1", (int) ' ', (int) ' ');
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2254");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        java.lang.String str10 = item3.toString();
        java.lang.String str11 = item3.name;
        item3.quality = 35;
        java.lang.String str14 = item3.name;
        int int15 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", -1, 52, -1, 97" + "'", str10, ", -1, 52, -1, 97");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", -1, 52" + "'", str11, ", -1, 52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ", -1, 52" + "'", str14, ", -1, 52");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2255");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (int) (byte) 10, (-1));
        int int4 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass6 = conjuredItemUpdater5.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2256");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 97, 32", (int) ' ', (-1));
        item3.name = "hi!, -1, 10, 0, 52";
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2257");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, -1, 1, 97, 10", 52, (int) '4');
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2258");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        int int12 = item3.quality;
        int int13 = item3.quality;
        item3.sellIn = (short) 0;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2259");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int9 = item3.sellIn;
        java.lang.String str10 = item3.name;
        item3.quality = (short) 1;
        item3.quality = (short) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater16 = conjuredItemUpdater15.update();
        com.gildedrose.ItemUpdater itemUpdater17 = conjuredItemUpdater15.update();
        com.gildedrose.ItemUpdater itemUpdater18 = conjuredItemUpdater15.update();
        com.gildedrose.ItemUpdater itemUpdater19 = conjuredItemUpdater15.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 52, 97" + "'", str10, "hi!, 52, 97");
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater19);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2260");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.toString();
        item3.sellIn = (short) -1;
        item3.name = "";
        item3.name = "hi!, -1, 97, 1, -1, 32, 97, 1, 35";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, 97" + "'", str5, "hi!, -1, 97");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2261");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 100", 10, (int) '#');
        item3.sellIn = '4';
        int int6 = item3.quality;
        item3.name = "hi!, 32, 100";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2262");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2263");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!, -1, 97";
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = 0;
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2264");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) (short) 100, (int) (short) 1);
        item3.name = "hi!, 1, 32";
        int int6 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2265");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 97, 32", (int) (short) 100, (int) ' ');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2266");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2267");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 100;
        java.lang.String str9 = item3.name;
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2268");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1", 97, 97);
        item3.quality = (-1);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2269");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1, 32, 97", (-1), (-1));
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2270");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.toString();
        int int9 = item3.quality;
        item3.quality = (short) 1;
        java.lang.Class<?> wildcardClass12 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str8, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2271");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, 0, 1, 10", 10, 0);
        item3.quality = 35;
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2272");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.quality;
        int int8 = item3.sellIn;
        java.lang.String str9 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1, 0, 0" + "'", str5, ", 100, 1, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 100, 1, 0, 0" + "'", str9, ", 100, 1, 0, 0");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2273");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.name;
        item3.quality = (short) 1;
        item3.sellIn = ' ';
        item3.sellIn = 52;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2274");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        item3.sellIn = 100;
        item3.quality = (short) 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str10 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2275");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        item3.sellIn = 'a';
        int int8 = item3.quality;
        java.lang.String str9 = item3.toString();
        int int10 = item3.quality;
        item3.quality = (byte) 0;
        java.lang.String str13 = item3.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 97, 97" + "'", str9, "hi!, 97, 97");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 97, 0" + "'", str13, "hi!, 97, 0");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2276");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 100", (int) ' ', (int) (short) 0);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2277");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        java.lang.String str9 = item3.toString();
        java.lang.String str10 = item3.name;
        item3.name = "hi!, 1, 1, -1, 97";
        item3.quality = 10;
        item3.name = ", 100, 1, 10, 52";
        item3.quality = (byte) -1;
        item3.sellIn = (byte) -1;
        java.lang.String str21 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", -1, 97" + "'", str9, ", -1, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ", 100, 1, 10, 52" + "'", str21, ", 100, 1, 10, 52");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2278");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", 10, 1);
        java.lang.String str4 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater6.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", -1, 97" + "'", str4, ", -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2279");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        int int10 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass12 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2280");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        item3.name = "hi!, -1, 97";
        item3.name = "hi!, 52, 10";
        java.lang.String str16 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater17 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 10, 0";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater20 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass21 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 52, 10, 1, 10" + "'", str16, "hi!, 52, 10, 1, 10");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2281");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 97", (int) (short) 10, (int) (byte) 1);
        java.lang.String str4 = item3.toString();
        item3.name = ", 10, -1, 1, 97";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 97, 10, 1" + "'", str4, "hi!, 1, 97, 10, 1");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2282");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97, 10, 1", 35, (int) (byte) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", -1, 97, 10, 1" + "'", str4, ", -1, 97, 10, 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", -1, 97, 10, 1, 35, 0" + "'", str5, ", -1, 97, 10, 1, 35, 0");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2283");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int6 = item3.quality;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (byte) 100;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 10, 0" + "'", str7, ", 100, 1, 10, 0");
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2284");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) (short) -1, (int) (byte) 100);
        item3.sellIn = (short) 100;
        item3.quality = (-1);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2285");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 10, 100);
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater6.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, 97, 10, 100" + "'", str5, "hi!, -1, 97, 10, 100");
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2286");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.toString();
        item3.quality = 0;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1, 10, 0" + "'", str6, ", 100, 1, 10, 0");
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2287");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        item3.quality = 97;
        int int7 = item3.sellIn;
        item3.sellIn = '#';
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2288");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!, -1, 97";
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2289");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater7.update();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2290");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", (int) '#', (int) (short) 1);
        int int4 = item3.sellIn;
        int int5 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2291");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str5 = item3.toString();
        item3.quality = 0;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 32, 97" + "'", str5, "hi!, 32, 97");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2292");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        int int4 = item3.sellIn;
        int int5 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, -1, 97, 1, -1";
        int int11 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2293");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = '4';
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = ' ';
        java.lang.String str17 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater18 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(itemUpdater18);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2294");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 10, -1, 10", 97, (int) (byte) 100);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2295");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (byte) 1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater13.update();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdater14.update();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdater14.update();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2296");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.name;
        item3.quality = (short) 1;
        item3.sellIn = (short) -1;
        java.lang.String str14 = item3.toString();
        int int15 = item3.sellIn;
        item3.sellIn = 32;
        int int18 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater19 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int20 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, -1, 1" + "'", str14, "hi!, -1, 1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2297");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int11 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str13 = item3.toString();
        item3.sellIn = '4';
        int int16 = item3.sellIn;
        java.lang.String str17 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 1, 10" + "'", str13, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2298");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (int) (byte) 10, (-1));
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2299");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.name;
        item3.name = "hi!, -1, 97, 1, -1";
        int int7 = item3.sellIn;
        java.lang.String str8 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int10 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97, 1, -1" + "'", str8, "hi!, -1, 97, 1, -1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2300");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (short) 100;
        int int11 = item3.quality;
        item3.name = "hi!, -1, 1";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2301");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        item3.sellIn = (byte) -1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) -1;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2302");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10", 1, 97);
        int int4 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2303");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10", 10, (int) (byte) 0);
        item3.quality = 97;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str8, "hi!, 52, 97, 0, 10");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2304");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        java.lang.String str7 = item3.name;
        int int8 = item3.sellIn;
        item3.sellIn = 'a';
        item3.sellIn = 10;
        int int13 = item3.sellIn;
        int int14 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2305");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str13 = item3.name;
        int int14 = item3.quality;
        int int15 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater16 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdater16.update();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater17);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2306");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 32", (int) ' ', 0);
        item3.name = "hi!, -1, 0, 1, 100";
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2307");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        java.lang.String str9 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 100;
        int int13 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", -1, 97" + "'", str9, ", -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2308");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1" + "'", str6, ", 100, 1");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2309");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str9 = item3.name;
        int int10 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = ", 100, 1, 100, 52";
        int int14 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2310");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.quality = 1;
        item3.quality = 32;
        item3.name = ", -1, 97, 10, 97";
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str15 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ", -1, 97, 10, 97, -1, 32" + "'", str15, ", -1, 97, 10, 97, -1, 32");
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2311");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = '4';
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = ' ';
        java.lang.String str17 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ", 32, -1" + "'", str17, ", 32, -1");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2312");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 10, 32", (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2313");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, -1, 1, 97, 10", (int) '#', (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2314");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.sellIn = 1;
        item3.quality = 97;
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2315");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.name;
        item3.quality = (short) 1;
        java.lang.String str12 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, -1, 1" + "'", str12, "hi!, -1, 1");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2316");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int6 = item3.quality;
        int int7 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2317");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        item3.quality = (byte) -1;
        item3.name = "hi!, 52, 97";
        java.lang.String str15 = item3.toString();
        int int16 = item3.sellIn;
        item3.name = ", -1, 52";
        com.gildedrose.ItemUpdater itemUpdater19 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater20 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 100, 97, 100, 0";
        java.lang.String str23 = item3.name;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 52, 97, 52, -1" + "'", str15, "hi!, 52, 97, 52, -1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 100, 97, 100, 0" + "'", str23, "hi!, 100, 97, 100, 0");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2318");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater16 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater17 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater18 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdater18.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater19);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2319");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 52, 0, 100, -1, 0, -1", 1, (int) (short) 100);
        item3.quality = 32;
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2320");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) 'a', 1);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int6 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2321");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int9 = item3.sellIn;
        java.lang.String str10 = item3.name;
        item3.sellIn = (byte) 1;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str14 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 52, 97" + "'", str10, "hi!, 52, 97");
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 52, 97, 1, 52" + "'", str14, "hi!, 52, 97, 1, 52");
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2322");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 97, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = '#';
        item3.name = "hi!, 32, 97";
        java.lang.String str15 = item3.toString();
        item3.quality = (byte) 10;
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 32, 97, 32, 35" + "'", str15, "hi!, 32, 97, 32, 35");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2323");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 97", (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2324");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, -1", (int) 'a', (int) (short) 10);
        item3.name = ", -1, 52";
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2325");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        int int12 = item3.sellIn;
        int int13 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater14.update();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2326");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 97, 97";
        item3.name = ", 100, 1, 100, 52";
        item3.quality = ' ';
        int int14 = item3.quality;
        int int15 = item3.sellIn;
        int int16 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2327");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.quality = 1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str13 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2328");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 0", (int) (short) -1, 97);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2329");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = ' ';
        int int13 = item3.sellIn;
        java.lang.String str14 = item3.toString();
        int int15 = item3.sellIn;
        java.lang.String str16 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 1, 32" + "'", str14, "hi!, 1, 32");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2330");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str8 = item3.toString();
        item3.sellIn = (short) 100;
        java.lang.String str11 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str13 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater14.update();
        com.gildedrose.ItemUpdater itemUpdater16 = conjuredItemUpdater14.update();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdater16.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 10, -1" + "'", str8, ", 10, -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater17);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2331");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, -1, 52", (int) (short) 0, (int) ' ');
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2332");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 97, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = '#';
        item3.name = "hi!, 32, 97";
        item3.sellIn = 35;
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2333");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str5 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 32, 97" + "'", str5, "hi!, 32, 97");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2334");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        java.lang.String str7 = item3.name;
        item3.sellIn = 100;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2335");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.quality = '#';
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.name;
        item3.name = ", -1, 52, 1, 97";
        java.lang.String str14 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ", -1, 52, 1, 97, -1, 35" + "'", str14, ", -1, 52, 1, 97, -1, 35");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2336");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 10, 0", (int) (byte) 100, (int) (short) 1);
        item3.sellIn = 10;
        java.lang.String str6 = item3.toString();
        int int7 = item3.sellIn;
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1, 10, 0, 10, 1" + "'", str6, ", 100, 1, 10, 0, 10, 1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2337");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.toString();
        item3.quality = (byte) 100;
        int int12 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = 32;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater16 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str17 = item3.name;
        item3.name = ", -1, 97, 10, 97, 35, 35";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2338");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 97, 100, 0", (int) 'a', 10);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2339");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", 32, (int) (byte) 100);
        item3.sellIn = 1;
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2340");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", 100, (int) (byte) 1);
        int int4 = item3.quality;
        int int5 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2341");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        item3.quality = 0;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater8.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2342");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int12 = item3.quality;
        java.lang.String str13 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater14.update();
        com.gildedrose.ItemUpdater itemUpdater16 = conjuredItemUpdater14.update();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 52, 10" + "'", str13, "hi!, 52, 10");
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2343");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 0;
        item3.name = "hi!, 52, 97, 0, 10";
        java.lang.String str17 = item3.name;
        int int18 = item3.quality;
        item3.quality = 1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater21 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int22 = item3.quality;
        item3.name = "hi!, 52, 0";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str17, "hi!, 52, 97, 0, 10");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2344");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        int int8 = item3.quality;
        item3.name = "hi!, 52, 10";
        item3.sellIn = (byte) 100;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int14 = item3.sellIn;
        java.lang.String str15 = item3.name;
        int int16 = item3.quality;
        java.lang.String str17 = item3.name;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 52, 10" + "'", str15, "hi!, 52, 10");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 52, 10" + "'", str17, "hi!, 52, 10");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2345");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int9 = item3.sellIn;
        java.lang.String str10 = item3.name;
        item3.sellIn = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int14 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 52, 97" + "'", str10, "hi!, 52, 97");
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2346");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        int int8 = item3.quality;
        item3.name = "hi!, 52, 10";
        item3.sellIn = 'a';
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2347");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 0, 1", (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2348");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        int int8 = item3.sellIn;
        int int9 = item3.sellIn;
        java.lang.String str10 = item3.name;
        item3.sellIn = (byte) -1;
        int int13 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2349");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", 100, (int) (short) 0);
        java.lang.String str4 = item3.name;
        item3.quality = 0;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, -1, 97";
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2350");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", (int) (byte) -1, (int) 'a');
        item3.name = "hi!, 10, 0";
        java.lang.String str6 = item3.name;
        item3.quality = (short) 10;
        item3.sellIn = 1;
        int int11 = item3.quality;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 10, 0" + "'", str6, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2351");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", 0, 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        int int8 = item3.sellIn;
        item3.name = "";
        int int11 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 10, 0, 0" + "'", str7, "hi!, -1, 10, 0, 0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2352");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        item3.sellIn = 'a';
        int int7 = item3.quality;
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2353");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 1, (-1));
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdater5.update();
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2354");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.name;
        int int10 = item3.quality;
        java.lang.String str11 = item3.name;
        int int12 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2355");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        item3.quality = 97;
        int int7 = item3.sellIn;
        java.lang.String str8 = item3.toString();
        item3.name = "hi!, 52, 97, -1, 52, 10, 97, -1, 0, 10, 0";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2356");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, -1, 100", 97, 0);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2357");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1, -1, 1", (int) (byte) -1, (int) (byte) 1);
        int int4 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2358");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int8 = item3.sellIn;
        int int9 = item3.quality;
        item3.sellIn = (byte) -1;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2359");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (int) (byte) 10, (-1));
        int int4 = item3.sellIn;
        int int5 = item3.quality;
        item3.sellIn = (byte) -1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2360");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.quality = 1;
        item3.name = "hi!, 100, 97, 100, 0";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2361");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 1", (int) 'a', (int) (short) 100);
        int int4 = item3.quality;
        java.lang.String str5 = item3.name;
        item3.name = ", -1, 97";
        java.lang.String str8 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 97, 1" + "'", str5, "hi!, 97, 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", -1, 97, 97, 100" + "'", str8, ", -1, 97, 97, 100");
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2362");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.quality;
        item3.quality = 100;
        item3.name = "hi!, -1, 10, 52, 0";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        java.lang.String str12 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, -1, 10, 52, 0" + "'", str12, "hi!, -1, 10, 52, 0");
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2363");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        item3.sellIn = 10;
        item3.name = "hi!, 52, 97, -1, 52";
        item3.name = "hi!, 52, 97, -1, 52, 10, 10";
        int int16 = item3.sellIn;
        int int17 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2364");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = ", 10, -1";
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2365");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str7 = item3.name;
        item3.quality = (byte) 1;
        java.lang.String str10 = item3.toString();
        item3.name = "hi!, 52, 97, -1, 10";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", -1, 1" + "'", str10, ", -1, 1");
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2366");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        int int6 = item3.quality;
        java.lang.String str7 = item3.name;
        item3.name = "hi!, 1, 10, -1, 35";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2367");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10", 0, (-1));
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdater4.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2368");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str9 = item3.name;
        java.lang.String str10 = item3.toString();
        java.lang.Class<?> wildcardClass11 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 97" + "'", str7, "hi!, 1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 1, 97" + "'", str10, "hi!, 1, 97");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2369");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 100", (int) (short) 10, (int) '4');
        java.lang.String str4 = item3.toString();
        item3.quality = (short) 100;
        item3.sellIn = 97;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 100, 10, 52" + "'", str4, "hi!, 1, 100, 10, 52");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2370");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 97, 100, 0", 52, 10);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2371");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 52, 0, 100, -1", (int) ' ', 52);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2372");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        item3.name = "hi!, 10, 0, 97, 10";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2373");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, 0", (int) (byte) 100, (int) (short) 100);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 1;
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 0, 0" + "'", str7, ", 100, 1, 0, 0");
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2374");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        item3.quality = (byte) -1;
        item3.name = "hi!, 52, 97";
        java.lang.String str15 = item3.toString();
        int int16 = item3.sellIn;
        item3.sellIn = (short) 1;
        int int19 = item3.sellIn;
        item3.name = ", 100, 1, 10, 0, 10, 32";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 52, 97, 52, -1" + "'", str15, "hi!, 52, 97, 52, -1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2375");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.quality = '4';
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdater12.update();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdater13.update();
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2376");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 10;
        int int13 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "";
        java.lang.String str17 = item3.name;
        java.lang.String str18 = item3.name;
        item3.quality = 'a';
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2377");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", 0, (int) (short) 1);
        item3.quality = (short) -1;
        java.lang.String str6 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", -1, 97" + "'", str6, ", -1, 97");
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2378");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 35, 52", (int) 'a', 100);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2379");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", 0, (int) (byte) 10);
        java.lang.String str4 = item3.toString();
        item3.sellIn = 'a';
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str4, "hi!, 52, 97, 0, 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, 97, 10" + "'", str7, "hi!, 52, 97, 97, 10");
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2380");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.quality = 'a';
        java.lang.String str10 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 97" + "'", str7, "hi!, 1, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 1, 97" + "'", str10, "hi!, 1, 97");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2381");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) 0, (int) (short) 10);
        item3.sellIn = '4';
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2382");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) ' ', (int) (byte) 100);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = ", 100, 1, 100, 0";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2383");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = '#';
        item3.name = "hi!, 1, 10";
        java.lang.String str14 = item3.toString();
        item3.name = ", -1, 1";
        int int17 = item3.quality;
        int int18 = item3.sellIn;
        item3.sellIn = 32;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 1, 10, -1, 35" + "'", str14, "hi!, 1, 10, -1, 35");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2384");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.quality = '4';
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdater6.update();
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2385");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        item3.sellIn = 52;
        int int13 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = ", 100, 1, 100, 0";
        int int17 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2386");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = '#';
        int int12 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int15 = item3.sellIn;
        java.lang.String str16 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ", -1, 35" + "'", str16, ", -1, 35");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2387");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10", (int) '4', (int) '4');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater4.update();
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2388");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        item3.quality = 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdater14.update();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdater15.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2389");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 0;
        item3.name = "hi!, 52, 97, 0, 10";
        java.lang.String str17 = item3.name;
        item3.name = "hi!, 10, 0";
        com.gildedrose.ItemUpdater itemUpdater20 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str21 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str17, "hi!, 52, 97, 0, 10");
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 10, 0" + "'", str21, "hi!, 10, 0");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2390");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", (int) 'a', (int) (short) 1);
        item3.name = "hi!, -1, 10, 52, 0";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = 97;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2391");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.sellIn;
        int int11 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater12.update();
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater12.update();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2392");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97, 10, 97", (int) (byte) 0, (int) ' ');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2393");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 10, 0, 10, 32", (-1), (int) ' ');
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2394");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.quality;
        item3.quality = 100;
        item3.name = "hi!, -1, 10, 52, 0";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int10 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater11.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2395");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52, 10, 10", (int) (short) 10, (int) (short) 0);
        item3.name = ", -1, 97, 10, 97, -1, 32";
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2396");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10", (int) (short) 1, 35);
        item3.name = "hi!, -1, 97, 1, -1, 32, 97";
        java.lang.String str6 = item3.toString();
        item3.sellIn = (byte) -1;
        java.lang.String str9 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 97, 1, -1, 32, 97, 1, 35" + "'", str6, "hi!, -1, 97, 1, -1, 32, 97, 1, 35");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97, 1, -1, 32, 97" + "'", str9, "hi!, -1, 97, 1, -1, 32, 97");
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2397");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 35, 52", (int) (short) 1, 10);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2398");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str10 = item3.name;
        item3.name = ", 100, 10, -1, 97";
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int14 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2399");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 0;
        item3.name = "hi!, 52, 97, 0, 10";
        item3.quality = (byte) 1;
        java.lang.Class<?> wildcardClass19 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2400");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.quality;
        item3.name = "hi!, 10, 10, -1, 10";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2401");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 0, 1, 10, 35", 0, (int) (byte) 10);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2402");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        int int7 = item3.sellIn;
        int int8 = item3.quality;
        int int9 = item3.quality;
        java.lang.String str10 = item3.toString();
        item3.name = "hi!, 52, 97, -1, 10";
        int int13 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", 100, 1, 10, -1" + "'", str10, ", 100, 1, 10, -1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2403");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        int int8 = item3.sellIn;
        java.lang.Class<?> wildcardClass9 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2404");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) 'a', 1);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass5 = conjuredItemUpdater4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2405");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = '#';
        item3.name = "hi!, 52, 97, 97, 32";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater10.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2406");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", 0, 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.toString();
        java.lang.String str6 = item3.toString();
        item3.name = ", -1, 52, -1, 35";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, 10, 0, 0" + "'", str5, "hi!, -1, 10, 0, 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 10, 0, 0" + "'", str6, "hi!, -1, 10, 0, 0");
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2407");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str9 = item3.name;
        item3.quality = (short) 0;
        item3.sellIn = '#';
        item3.quality = (short) 1;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2408");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater5.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2409");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        java.lang.String str9 = item3.toString();
        java.lang.String str10 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater11.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", -1, 97" + "'", str9, ", -1, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2410");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", (int) (byte) -1, (int) 'a');
        item3.name = "hi!, 10, 0";
        java.lang.String str6 = item3.name;
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass10 = itemUpdater9.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 10, 0" + "'", str6, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2411");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        int int12 = item3.quality;
        item3.quality = '4';
        int int15 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater16 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int17 = item3.quality;
        item3.name = ", -1, 52, -1, 97, 100, 10";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2412");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int9 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (short) 0;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater13.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2413");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2414");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int8 = item3.sellIn;
        java.lang.String str9 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2415");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 97", 1, (int) (byte) 10);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 97, 97" + "'", str4, "hi!, 97, 97");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 97, 97" + "'", str5, "hi!, 97, 97");
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2416");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 97, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = '#';
        item3.sellIn = 52;
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2417");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10", 1, (int) (short) 0);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) -1;
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2418");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (-1), (int) (byte) -1);
        java.lang.String str4 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 0;
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 10, -1, -1" + "'", str4, "hi!, -1, 10, -1, -1");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 10" + "'", str8, "hi!, -1, 10");
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2419");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        item3.name = ", 100, 1";
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int8 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int10 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2420");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = ' ';
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (byte) -1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater16 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2421");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.sellIn;
        int int5 = item3.quality;
        item3.quality = ' ';
        item3.quality = 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2422");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        item3.quality = (byte) 100;
        int int8 = item3.quality;
        java.lang.Class<?> wildcardClass9 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2423");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        java.lang.String str12 = item3.name;
        item3.sellIn = (short) 100;
        item3.name = ", 100, 1";
        item3.name = "";
        int int19 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2424");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        int int4 = item3.sellIn;
        int int5 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int9 = item3.sellIn;
        int int10 = item3.sellIn;
        java.lang.String str11 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2425");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2426");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        item3.name = ", -1, 97";
        item3.quality = '#';
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2427");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 32, 97, 32, 35", (int) (byte) 1, 35);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2428");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str13 = item3.name;
        item3.quality = (-1);
        java.lang.String str16 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2429");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) 10);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2430");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", 100, (int) (short) 0);
        item3.sellIn = '#';
        int int6 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2431");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.toString();
        item3.quality = (byte) 100;
        int int12 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater13.update();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdater14.update();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdater14.update();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdater16.update();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdater17.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater18);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2432");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 52;
        int int10 = item3.quality;
        item3.quality = 32;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2433");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.toString();
        int int13 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater15 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdater15.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 1, 10" + "'", str12, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2434");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        java.lang.String str7 = item3.name;
        int int8 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater9.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2435");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 1", (int) (byte) 10, 32);
        item3.quality = (short) 0;
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 97, 1, 10, 0" + "'", str6, "hi!, 97, 1, 10, 0");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2436");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, -1", (int) (short) 0, 1);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2437");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str5 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str7 = item3.toString();
        item3.name = "hi!, 10, 0";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2438");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10", 1, (int) (short) 0);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2439");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater12.update();
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater12.update();
        java.lang.Class<?> wildcardClass15 = itemUpdater14.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2440");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        item3.quality = 'a';
        java.lang.String str9 = item3.name;
        int int10 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 100, 1" + "'", str9, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2441");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        item3.name = "hi!";
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.quality;
        int int8 = item3.quality;
        java.lang.String str9 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2442");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        int int7 = item3.sellIn;
        int int8 = item3.quality;
        item3.sellIn = 0;
        item3.quality = 32;
        int int13 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater14.update();
        java.lang.Class<?> wildcardClass16 = itemUpdater15.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2443");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int12 = item3.quality;
        java.lang.String str13 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater14.update();
        java.lang.Class<?> wildcardClass16 = conjuredItemUpdater14.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 52, 10" + "'", str13, "hi!, 52, 10");
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2444");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.quality;
        int int6 = item3.quality;
        item3.quality = ' ';
        item3.sellIn = ' ';
        int int11 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2445");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        java.lang.String str10 = item3.name;
        java.lang.String str11 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", -1, 52" + "'", str10, ", -1, 52");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", -1, 52, -1, 97" + "'", str11, ", -1, 52, -1, 97");
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2446");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", 32, (int) 'a');
        item3.name = ", -1, 52, 1, 97";
        int int6 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2447");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdater10.update();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2448");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int8 = item3.sellIn;
        int int9 = item3.quality;
        int int10 = item3.sellIn;
        item3.quality = 97;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2449");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.name;
        item3.quality = (byte) 0;
        java.lang.String str7 = item3.toString();
        int int8 = item3.quality;
        item3.name = "hi!, 1, 97, -1, 10";
        java.lang.String str11 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 0" + "'", str7, "hi!, -1, 0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 97, -1, 10" + "'", str11, "hi!, 1, 97, -1, 10");
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2450");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 1, (-1));
        java.lang.String str4 = item3.toString();
        item3.quality = '4';
        int int7 = item3.quality;
        java.lang.String str8 = item3.name;
        item3.quality = (short) -1;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97, 1, -1" + "'", str4, "hi!, -1, 97, 1, -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2451");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        java.lang.Class<?> wildcardClass8 = conjuredItemUpdater5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2452");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.sellIn = (short) 0;
        item3.sellIn = (short) -1;
        item3.sellIn = '4';
        java.lang.String str11 = item3.toString();
        int int12 = item3.sellIn;
        int int13 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", 100, 1, 52, 0" + "'", str11, ", 100, 1, 52, 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2453");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10, -1, 100", (int) ' ', 97);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2454");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 1;
        int int13 = item3.quality;
        java.lang.String str14 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater15 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str16 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ", -1, 52" + "'", str14, ", -1, 52");
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ", -1, 52, 1, 97" + "'", str16, ", -1, 52, 1, 97");
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2455");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdater12.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2456");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.sellIn = 1;
        java.lang.String str6 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str8 = item3.name;
        item3.quality = 1;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2457");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        item3.quality = (-1);
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2458");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 100, 0, 0, 35", 0, (int) (short) -1);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2459");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.quality = '#';
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int11 = item3.quality;
        int int12 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2460");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 0, 1", 1, (int) (byte) 1);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2461");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        item3.name = "hi!, 100, 10";
        int int10 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2462");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (-1));
        int int4 = item3.quality;
        item3.quality = 52;
        item3.name = "hi!, -1, 97, 1, -1, 32, 97";
        item3.sellIn = (short) -1;
        java.lang.Class<?> wildcardClass11 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2463");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) 100, 97);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2464");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.toString();
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 1, 1, -1, 52";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 10" + "'", str4, ", 100, 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2465");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        item3.name = "hi!, -1, 97";
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = 35;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2466");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass9 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2467");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.toString();
        int int5 = item3.sellIn;
        item3.name = "hi!, 52, 97, 52, -1";
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int10 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater11.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 10" + "'", str4, ", 100, 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2468");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) '4', (int) (byte) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 10" + "'", str4, "hi!, -1, 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, 10" + "'", str5, "hi!, -1, 10");
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2469");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        int int8 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater9.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater9.update();
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdater11.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2470");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52, 10, 97, 52, 97", 0, (int) ' ');
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2471");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = ' ';
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str14 = item3.name;
        item3.name = "hi!, -1, 10, 52, 0";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2472");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.quality;
        item3.sellIn = 'a';
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 32;
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass13 = itemUpdater12.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2473");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int8 = item3.sellIn;
        int int9 = item3.quality;
        item3.quality = (short) 0;
        int int12 = item3.sellIn;
        item3.quality = 100;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2474");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) '4', (int) (byte) 0);
        java.lang.String str4 = item3.name;
        int int5 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 10" + "'", str4, "hi!, -1, 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2475");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int9 = item3.sellIn;
        java.lang.String str10 = item3.name;
        item3.sellIn = (byte) 1;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass15 = itemUpdater14.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 52, 97" + "'", str10, "hi!, 52, 97");
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2476");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str12 = item3.name;
        int int13 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2477");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.toString();
        item3.quality = (short) -1;
        item3.quality = 35;
        item3.name = ", -1, 52, -1, 35";
        java.lang.String str11 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 10" + "'", str4, ", 100, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", -1, 52, -1, 35" + "'", str11, ", -1, 52, -1, 35");
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2478");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 97, 32", (int) (short) 1, (int) (byte) -1);
        item3.name = "hi!, -1, 97, 0, 1";
        java.lang.String str6 = item3.toString();
        int int7 = item3.quality;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 97, 0, 1, 1, -1" + "'", str6, "hi!, -1, 97, 0, 1, 1, -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2479");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        item3.sellIn = 1;
        int int10 = item3.sellIn;
        item3.quality = (-1);
        int int13 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2480");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        item3.quality = (byte) -1;
        item3.name = "hi!, 52, 97";
        item3.sellIn = (short) -1;
        com.gildedrose.ItemUpdater itemUpdater17 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int18 = item3.quality;
        int int19 = item3.quality;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2481");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = '#';
        item3.name = "hi!, 1, 10";
        java.lang.String str14 = item3.toString();
        item3.name = ", -1, 1";
        item3.quality = 32;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 1, 10, -1, 35" + "'", str14, "hi!, 1, 10, -1, 35");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2482");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 10;
        int int13 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "";
        java.lang.String str17 = item3.toString();
        java.lang.String str18 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ", 10, 10" + "'", str17, ", 10, 10");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2483");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.name = ", 100, 10";
        item3.quality = (byte) 10;
        item3.name = "hi!, -1, 97, 100, 100, 0, 100";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2484");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 97", 1, (int) (byte) 10);
        java.lang.String str4 = item3.name;
        item3.quality = (byte) -1;
        item3.name = "hi!, 100, -1";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 97, 97" + "'", str4, "hi!, 97, 97");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2485");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (int) (byte) 10, (int) (short) 1);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int7 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2486");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) (short) 0, (int) '4');
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2487");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        int int4 = item3.sellIn;
        int int5 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.quality;
        item3.quality = 35;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2488");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", 0, 1);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2489");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 0;
        item3.name = "hi!, 52, 97, 0, 10";
        java.lang.String str17 = item3.name;
        int int18 = item3.quality;
        item3.quality = 1;
        item3.name = "";
        java.lang.Class<?> wildcardClass23 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str17, "hi!, 52, 97, 0, 10");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2490");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str9 = item3.name;
        item3.quality = (short) 0;
        item3.sellIn = '#';
        item3.quality = '4';
        int int16 = item3.quality;
        item3.sellIn = 0;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2491");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int13 = item3.sellIn;
        item3.sellIn = (short) -1;
        item3.sellIn = 100;
        item3.name = "hi!, 1, 1, -1, 97";
        java.lang.String str20 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater21 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdater21.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 1, 1, -1, 97, 100, 10" + "'", str20, "hi!, 1, 1, -1, 97, 100, 10");
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertNotNull(itemUpdater22);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2492");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 97", (int) '#', (int) (byte) 100);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2493");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 100;
        int int9 = item3.quality;
        item3.sellIn = 0;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2494");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int8 = item3.sellIn;
        int int9 = item3.quality;
        item3.name = ", 100, 97";
        java.lang.Class<?> wildcardClass12 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2495");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdater12.update();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdater12.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2496");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52, 10, 97", 52, (int) (short) 10);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.name;
        java.lang.String str8 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 52, 97, -1, 52, 10, 97" + "'", str6, "hi!, 52, 97, -1, 52, 10, 97");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52, 10, 97" + "'", str7, "hi!, 52, 97, -1, 52, 10, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 52, 97, -1, 52, 10, 97, 52, 10" + "'", str8, "hi!, 52, 97, -1, 52, 10, 97, 52, 10");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2497");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.sellIn = (short) -1;
        int int10 = item3.sellIn;
        item3.quality = (short) -1;
        item3.sellIn = (byte) 0;
        java.lang.Class<?> wildcardClass15 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2498");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.name;
        java.lang.String str12 = item3.name;
        item3.quality = 0;
        java.lang.String str15 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 1, 0" + "'", str15, "hi!, 1, 0");
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2499");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int6 = item3.quality;
        item3.quality = 10;
        item3.name = ", -1, 52, 10, 97";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest4.test2500");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        item3.sellIn = 100;
        java.lang.String str7 = item3.toString();
        item3.sellIn = (byte) -1;
        java.lang.String str10 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 100, 97" + "'", str7, "hi!, 100, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, -1, 97" + "'", str10, "hi!, -1, 97");
    }
}

