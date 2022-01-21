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
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0501");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) '#', 32);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str5 = item3.toString();
        int int6 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, 0, 35, 32" + "'", str5, "hi!, -1, 0, 35, 32");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0502");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int13 = item3.quality;
        int int14 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0503");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52, -1, 97", 52, (-1));
        item3.sellIn = (byte) 100;
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0504");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", 0, 0);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0505");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10, 1, 10, 10, -1", (int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0506");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0507");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        int int12 = item3.sellIn;
        item3.sellIn = 100;
        int int15 = item3.sellIn;
        java.lang.Class<?> wildcardClass16 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0508");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.quality;
        item3.quality = 100;
        int int7 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int9 = item3.sellIn;
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0509");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str10 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        java.lang.Class<?> wildcardClass13 = itemUpdater12.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0510");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) (short) 100, 97);
        item3.sellIn = 100;
        int int6 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0511");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", (int) (byte) -1, (int) 'a');
        item3.name = "hi!, 10, 0";
        java.lang.String str6 = item3.name;
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, -1, 97, 1, -1, 100, -1";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 10, 0" + "'", str6, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0512");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        item3.name = ", 100, 1";
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0513");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 52", (int) (short) 10, (int) '#');
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0514");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 10, 0", 10, 32);
        java.lang.String str4 = item3.name;
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1, 10, 0" + "'", str4, ", 100, 1, 10, 0");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0515");
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
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdater20.update();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 52, 97, 52, -1" + "'", str15, "hi!, 52, 97, 52, -1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater21);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0516");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", (-1), 52);
        item3.quality = 35;
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0517");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 10, 0, 10, 1", (int) (short) 100, (-1));
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0518");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        java.lang.String str7 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0519");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        java.lang.String str10 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdater15.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", -1, 52" + "'", str10, ", -1, 52");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0520");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 52, 0", (int) (short) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0521");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str10 = item3.name;
        item3.sellIn = 52;
        java.lang.String str13 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ", 52, 97" + "'", str13, ", 52, 97");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0522");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97, 97, 32, -1, 97";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0523");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int11 = item3.quality;
        item3.name = "hi!, -1, 10, 0, 0";
        int int14 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0524");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.quality;
        item3.quality = 100;
        item3.name = "hi!, -1, 10, 52, 0";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0525");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", 100, (int) (short) 0);
        item3.sellIn = 100;
        item3.quality = (short) 1;
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0526");
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0527");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdater6.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0528");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.sellIn = (short) -1;
        java.lang.String str10 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, -1, 1" + "'", str10, "hi!, -1, 1");
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0529");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10", (int) '#', 0);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass5 = conjuredItemUpdater4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0530");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        item3.sellIn = (byte) -1;
        item3.sellIn = (byte) 1;
        item3.quality = 0;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0531");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 1", (int) '#', (int) (byte) 100);
        int int4 = item3.sellIn;
        item3.sellIn = 10;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0532");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        item3.name = "";
        int int11 = item3.sellIn;
        int int12 = item3.sellIn;
        item3.sellIn = 32;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0533");
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
        int int21 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str17, "hi!, 52, 97, 0, 10");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0534");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 1, (-1));
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 100;
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0535");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (int) (byte) 10, (-1));
        int int4 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        java.lang.Class<?> wildcardClass8 = conjuredItemUpdater5.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0536");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.name;
        item3.quality = (byte) 0;
        int int7 = item3.quality;
        int int8 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0537");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        item3.quality = (byte) -1;
        item3.name = "hi!, 52, 97";
        java.lang.String str15 = item3.toString();
        int int16 = item3.sellIn;
        item3.name = "hi!, 52, 97, 52, -1";
        item3.quality = 'a';
        int int21 = item3.sellIn;
        int int22 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 52, 97, 52, -1" + "'", str15, "hi!, 52, 97, 52, -1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0538");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.toString();
        int int5 = item3.sellIn;
        item3.name = "hi!, 52, 97, 52, -1";
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass9 = itemUpdater8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 10" + "'", str4, ", 100, 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0539");
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
        java.lang.String str16 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0540");
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
        int int19 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 1, 10, -1, 35" + "'", str14, "hi!, 1, 10, -1, 35");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0541");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", 1, 97);
        java.lang.String str4 = item3.toString();
        item3.quality = (byte) 1;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1, 1, 97" + "'", str4, ", 100, 1, 1, 97");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0542");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        item3.name = "hi!";
        int int8 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0543");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        int int4 = item3.quality;
        item3.name = "hi!, -1, 97, 0, 1";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0544");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.quality;
        item3.quality = 100;
        item3.name = "hi!, -1, 10, 52, 0";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater9.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater9.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0545");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) 'a', (int) '#');
        item3.quality = (byte) -1;
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0546");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 97", 0, 10);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0547");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        int int12 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 100;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0548");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.toString();
        item3.quality = 1;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 10" + "'", str11, "hi!, -1, 10");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0549");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        item3.quality = 52;
        item3.sellIn = 10;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0550");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        item3.sellIn = 10;
        item3.sellIn = (short) 0;
        java.lang.Class<?> wildcardClass14 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0551");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        item3.quality = 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int13 = item3.quality;
        item3.quality = (short) 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater16 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass17 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0552");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        item3.quality = (-1);
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int10 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0553");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (int) '#', (int) (byte) 10);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", -1, 52" + "'", str4, ", -1, 52");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", -1, 52" + "'", str5, ", -1, 52");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0554");
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
        int int20 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0555");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) (short) 0, (int) '4');
        item3.sellIn = (short) 1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0556");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        int int4 = item3.sellIn;
        int int5 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0557");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        int int8 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 52, 97, 1, 100";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0558");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.sellIn = (short) -1;
        int int10 = item3.sellIn;
        java.lang.String str11 = item3.name;
        item3.sellIn = 52;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0559");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", (int) (byte) -1, (int) (short) 1);
        item3.name = "hi!, -1, 0";
        int int6 = item3.quality;
        java.lang.Class<?> wildcardClass7 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0560");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        int int4 = item3.sellIn;
        int int5 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.quality;
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0561");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.sellIn = (short) 0;
        item3.sellIn = (short) -1;
        int int9 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0562");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.quality = '4';
        java.lang.String str6 = item3.name;
        int int7 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0563");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        item3.name = "hi!, -1, 0";
        item3.sellIn = (byte) 0;
        item3.sellIn = (short) 100;
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0564");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass11 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0565");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str6 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdater7.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1" + "'", str6, ", 100, 1");
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0566");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "";
        item3.sellIn = 52;
        int int11 = item3.quality;
        java.lang.String str12 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0567");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int8 = item3.sellIn;
        int int9 = item3.quality;
        item3.quality = (short) 0;
        java.lang.String str12 = item3.toString();
        item3.quality = ' ';
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, -1, 0" + "'", str12, "hi!, -1, 0");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0568");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        java.lang.String str8 = item3.toString();
        int int9 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0569");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", 10, 0);
        item3.quality = 10;
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0570");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) (short) 100, 97);
        java.lang.String str4 = item3.toString();
        int int5 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 0, 100, 97" + "'", str4, "hi!, -1, 0, 100, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0571");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10, -1, 100", 35, (int) '#');
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0572");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 10", (int) ' ', (int) (short) 1);
        item3.name = "hi!, 1, 32";
        item3.sellIn = 100;
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0573");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str9 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 10" + "'", str9, "hi!, -1, 10");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0574");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.quality = 1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass13 = itemUpdater12.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0575");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10", (int) (byte) -1, 100);
        java.lang.String str4 = item3.toString();
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 10, -1, 100" + "'", str4, "hi!, 52, 10, -1, 100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 52, 10, -1, 100" + "'", str5, "hi!, 52, 10, -1, 100");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0576");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        item3.quality = (short) 0;
        item3.sellIn = 10;
        int int14 = item3.quality;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0577");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1", 0, (int) '#');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, 1, 0, 35" + "'", str5, "hi!, -1, 1, 0, 35");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0578");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        java.lang.String str10 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater14.update();
        java.lang.Class<?> wildcardClass16 = itemUpdater15.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", -1, 52" + "'", str10, ", -1, 52");
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0579");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10", 1, 97);
        item3.quality = (byte) 1;
        item3.quality = (byte) 10;
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 1, 10" + "'", str8, "hi!, 1, 10");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0580");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) -1, (int) (short) 0);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0581");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 97, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater10.update();
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0582");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) 10);
        item3.name = "hi!, 52, 97, 0, 10, 1, 0";
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0583");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.toString();
        int int5 = item3.sellIn;
        int int6 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 10" + "'", str4, ", 100, 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0584");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdater7.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0585");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        item3.quality = 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass12 = conjuredItemUpdater11.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0586");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 52, 0", 100, 0);
        int int4 = item3.quality;
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0587");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0588");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdater7.update();
        java.lang.Class<?> wildcardClass9 = itemUpdater7.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0589");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        int int9 = item3.quality;
        java.lang.String str10 = item3.name;
        int int11 = item3.quality;
        int int12 = item3.quality;
        int int13 = item3.quality;
        java.lang.String str14 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0590");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.quality;
        item3.sellIn = 'a';
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdater9.update();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdater9.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0591");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        item3.sellIn = (byte) 100;
        java.lang.String str6 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0592");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 0, (int) (short) 1);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0593");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, -1, 1";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass14 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0594");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.sellIn = (short) -1;
        java.lang.String str10 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) -1;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, -1, 1" + "'", str10, "hi!, -1, 1");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0595");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        java.lang.Class<?> wildcardClass6 = conjuredItemUpdater4.getClass();
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0596");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        java.lang.Class<?> wildcardClass13 = itemUpdater12.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0597");
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
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdater17.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater18);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0598");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        int int12 = item3.quality;
        item3.quality = '4';
        item3.sellIn = ' ';
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0599");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", 0, 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.name;
        item3.quality = 1;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 10" + "'", str6, "hi!, -1, 10");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0600");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int6 = item3.quality;
        int int7 = item3.sellIn;
        item3.quality = (short) 1;
        item3.name = "hi!, 1, 10, -1, 35";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0601");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.name = "hi!, 10, 0";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdater12.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0602");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) '4', (int) (byte) 0);
        java.lang.String str4 = item3.toString();
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 10, 52, 0" + "'", str4, "hi!, -1, 10, 52, 0");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0603");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        int int8 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater9.update();
        java.lang.Class<?> wildcardClass11 = itemUpdater10.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0604");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 97, (int) (short) -1);
        java.lang.String str4 = item3.name;
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0605");
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
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdater15.update();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 52, 10" + "'", str13, "hi!, 52, 10");
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0606");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10", (int) (byte) -1, (int) (byte) 100);
        item3.name = ", 100, 1, 0, 0";
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0607");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) (short) 100, (int) (short) 1);
        java.lang.String str4 = item3.name;
        item3.quality = (short) -1;
        int int7 = item3.sellIn;
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 10" + "'", str4, "hi!, -1, 10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0608");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", (int) (byte) 0, 0);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0609");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        item3.quality = 0;
        java.lang.String str6 = item3.name;
        int int7 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0610");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 97", (-1), (int) (short) 0);
        item3.sellIn = (-1);
        int int6 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0611");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 97, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int11 = item3.sellIn;
        item3.sellIn = (short) -1;
        item3.name = ", 100, 1, 0, 0, 1, 32";
        java.lang.Class<?> wildcardClass16 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0612");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", 10, (int) '4');
        item3.sellIn = 'a';
        item3.sellIn = (short) 100;
        item3.quality = (short) 100;
        java.lang.String str10 = item3.name;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", 100, 1" + "'", str10, ", 100, 1");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0613");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 100, 100", 52, (int) (byte) 10);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0614");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int11 = item3.quality;
        item3.name = "hi!, -1, 10, 0, 0";
        item3.name = "";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0615");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97, 10, 97", (int) 'a', (int) ' ');
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0616");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdater7.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0617");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0618");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0, 35, 32", (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0619");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        item3.name = "hi!, 52, 10";
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0620");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        int int9 = item3.quality;
        item3.quality = (byte) 0;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater12.update();
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater12.update();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdater14.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0621");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 10, -1", 97, (int) '#');
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0622");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        item3.sellIn = (short) 100;
        item3.sellIn = (short) -1;
        int int15 = item3.sellIn;
        java.lang.String str16 = item3.toString();
        item3.sellIn = (byte) 1;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, -1, 10" + "'", str16, "hi!, -1, 10");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0623");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "";
        item3.sellIn = 52;
        int int11 = item3.quality;
        java.lang.String str12 = item3.name;
        java.lang.String str13 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ", 52, 97" + "'", str13, ", 52, 97");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0624");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 10", (int) ' ', (int) (short) 1);
        item3.quality = (byte) -1;
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0625");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int8 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 97;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0626");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.quality = 1;
        item3.quality = '4';
        java.lang.String str12 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0627");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 1, (-1));
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0628");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        item3.sellIn = 35;
        item3.quality = 1;
        int int11 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0629");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = 0;
        java.lang.String str9 = item3.toString();
        int int10 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 0" + "'", str9, "hi!, 1, 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0630");
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
        com.gildedrose.ItemUpdater itemUpdater17 = conjuredItemUpdater16.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater17);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0631");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        int int9 = item3.quality;
        int int10 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0632");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater7.update();
        java.lang.Class<?> wildcardClass10 = itemUpdater9.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0633");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        item3.name = ", -1, 52";
        java.lang.String str9 = item3.toString();
        item3.quality = 0;
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass13 = itemUpdater12.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", -1, 52, -1, 97" + "'", str9, ", -1, 52, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0634");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        item3.quality = (byte) -1;
        item3.name = "hi!, 52, 97";
        java.lang.String str15 = item3.toString();
        int int16 = item3.sellIn;
        item3.name = "hi!, 52, 97, 52, -1";
        item3.quality = 'a';
        java.lang.String str21 = item3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 52, 97, 52, -1" + "'", str15, "hi!, 52, 97, 52, -1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 52, 97, 52, -1, 52, 97" + "'", str21, "hi!, 52, 97, 52, -1, 52, 97");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0635");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        java.lang.String str10 = item3.name;
        item3.sellIn = 32;
        int int13 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0636");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdater11.update();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0637");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.sellIn;
        int int11 = item3.sellIn;
        item3.quality = 52;
        item3.sellIn = (-1);
        item3.quality = (byte) 1;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0638");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.sellIn;
        int int11 = item3.sellIn;
        item3.quality = 52;
        item3.sellIn = (-1);
        java.lang.String str16 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, -1, 52" + "'", str16, "hi!, -1, 52");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0639");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.name;
        item3.quality = (short) 1;
        int int8 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0640");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        item3.sellIn = 'a';
        int int8 = item3.quality;
        java.lang.String str9 = item3.toString();
        int int10 = item3.quality;
        item3.quality = 0;
        item3.name = "hi!, -1, 10, -1, -1";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 97, 97" + "'", str9, "hi!, 97, 97");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0641");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 97", (int) (short) 100, 0);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0642");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.quality = '#';
        int int10 = item3.sellIn;
        java.lang.String str11 = item3.name;
        item3.quality = (short) 10;
        java.lang.String str14 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0643");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        item3.sellIn = 'a';
        java.lang.String str8 = item3.name;
        int int9 = item3.sellIn;
        java.lang.String str10 = item3.name;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0644");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (short) -1;
        item3.sellIn = '4';
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0645");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = ", -1, 1";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0646");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdater9.update();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdater9.update();
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdater9.update();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdater12.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0647");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdater9.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0648");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (-1));
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        java.lang.String str6 = item3.toString();
        java.lang.Class<?> wildcardClass7 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, -1" + "'", str5, "hi!, -1, -1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, -1" + "'", str6, "hi!, -1, -1");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0649");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        int int7 = item3.sellIn;
        int int8 = item3.quality;
        int int9 = item3.quality;
        java.lang.String str10 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass12 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", 100, 1, 10, -1" + "'", str10, ", 100, 1, 10, -1");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0650");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        item3.name = "hi!";
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.quality;
        int int8 = item3.quality;
        item3.name = "hi!, 1, 1, -1, 97, 100, 10";
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0651");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.quality = '#';
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater10.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0652");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) 'a', 0);
        item3.quality = 100;
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0653");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        java.lang.String str7 = item3.name;
        int int8 = item3.sellIn;
        item3.sellIn = 'a';
        int int11 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0654");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater8.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0655");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 100, (int) (short) 1);
        item3.sellIn = (short) 100;
        int int6 = item3.quality;
        java.lang.String str7 = item3.toString();
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0656");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int9 = item3.sellIn;
        java.lang.String str10 = item3.name;
        item3.sellIn = (short) 10;
        item3.name = "hi!, -1, 1";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 52, 97" + "'", str10, "hi!, 52, 97");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0657");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.sellIn;
        int int5 = item3.quality;
        item3.quality = (short) 10;
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 100, 1" + "'", str8, ", 100, 1");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0658");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.quality = (byte) 10;
        java.lang.String str8 = item3.name;
        item3.sellIn = (byte) 100;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 32;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0659");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = ", 10, -1";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass12 = conjuredItemUpdater11.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0660");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 10, 0", (int) (byte) 100, (int) (short) 1);
        item3.sellIn = 10;
        java.lang.String str6 = item3.toString();
        int int7 = item3.sellIn;
        item3.quality = '4';
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1, 10, 0, 10, 1" + "'", str6, ", 100, 1, 10, 0, 10, 1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0661");
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
        java.lang.Class<?> wildcardClass16 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ", -1, 52" + "'", str14, ", -1, 52");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ", -1, 52, 1, 97" + "'", str15, ", -1, 52, 1, 97");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0662");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int12 = item3.quality;
        item3.sellIn = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater15 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater16 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater17 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdater17.update();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater18);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0663");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdater7.update();
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0664");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        int int6 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0665");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.name = ", 100, 1";
        java.lang.String str8 = item3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 100, 1, -1, 97" + "'", str8, ", 100, 1, -1, 97");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0666");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater5.update();
        java.lang.Class<?> wildcardClass10 = conjuredItemUpdater5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0667");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, 0", (int) (short) 100, (int) (byte) 1);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0668");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 1, -1, 97", 0, (int) ' ');
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0669");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10", 0, (-1));
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 52, 97, -1, 52";
        java.lang.String str8 = item3.name;
        java.lang.Class<?> wildcardClass9 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str8, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0670");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, 0", 1, (int) (short) -1);
        item3.quality = (short) 10;
        item3.name = "hi!, -1, 52";
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0671");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (-1), (int) '#');
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0672");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0673");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        int int4 = item3.sellIn;
        int int5 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater6.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0674");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str12 = item3.name;
        item3.name = "hi!, -1, 10";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str16 = item3.name;
        item3.sellIn = (short) 10;
        java.lang.String str19 = item3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, -1, 10" + "'", str16, "hi!, -1, 10");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, -1, 10, 10, 10" + "'", str19, "hi!, -1, 10, 10, 10");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0675");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        java.lang.String str9 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int11 = item3.quality;
        int int12 = item3.sellIn;
        item3.quality = 32;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", -1, 97" + "'", str9, ", -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0676");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 1", (int) (byte) 100, (int) (short) 0);
        item3.quality = (byte) 0;
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0677");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 97, 100, 0", 35, (int) (byte) 1);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0678");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        int int8 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str10 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, -1, 97" + "'", str10, "hi!, -1, 97");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0679");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        item3.name = "hi!, 100, 10";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.name;
        java.lang.String str12 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 100, 10" + "'", str11, "hi!, 100, 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 100, 10, -1, 97" + "'", str12, "hi!, 100, 10, -1, 97");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0680");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10, -1, 35", (int) (byte) 10, (int) '4');
        int int4 = item3.quality;
        item3.sellIn = (short) 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0681");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.quality = '4';
        item3.name = "hi!, 1, 1";
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.name;
        item3.quality = 0;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 1, 1, -1, 52" + "'", str8, "hi!, 1, 1, -1, 52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 1" + "'", str9, "hi!, 1, 1");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0682");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10", 0, (-1));
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) -1;
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0683");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 52, -1", 97, 10);
        item3.name = "hi!, 10, 0";
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.name;
        item3.sellIn = ' ';
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 10, 0" + "'", str7, "hi!, 10, 0");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0684");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.name = ", 100, 10";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0685");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        int int6 = item3.sellIn;
        item3.name = ", -1, -1";
        item3.sellIn = (byte) 0;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0686");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", 0, 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.name;
        int int7 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 10" + "'", str6, "hi!, -1, 10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0687");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = 0;
        int int11 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater12.update();
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater12.update();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdater14.update();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0688");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int8 = item3.sellIn;
        int int9 = item3.quality;
        int int10 = item3.sellIn;
        item3.sellIn = 1;
        int int13 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0689");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        java.lang.String str10 = item3.toString();
        item3.name = "hi!, -1, 97, 1, -1";
        item3.sellIn = 10;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", -1, 52, -1, 97" + "'", str10, ", -1, 52, -1, 97");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0690");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.name;
        item3.quality = (byte) 0;
        int int7 = item3.quality;
        item3.quality = 10;
        java.lang.String str10 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0691");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = 0;
        item3.sellIn = 97;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0692");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 0, 0", 1, 35);
        java.lang.String str4 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass6 = itemUpdater5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 10, 0, 0" + "'", str4, "hi!, -1, 10, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0693");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        int int8 = item3.quality;
        int int9 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0694");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        java.lang.String str7 = item3.name;
        item3.name = "hi!, -1, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater11.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0695");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 97", (int) ' ', (int) (short) 100);
        item3.sellIn = (byte) 10;
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0696");
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
        java.lang.Class<?> wildcardClass17 = conjuredItemUpdater16.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0697");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", (int) (byte) -1, (int) 'a');
        item3.name = "hi!, 10, 0";
        item3.name = "hi!, -1, 97";
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97, -1, 97" + "'", str9, "hi!, -1, 97, -1, 97");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0698");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1, 100, 97", 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0699");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 100, 52", (int) (byte) 0, (int) (byte) 100);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0700");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.quality = '4';
        item3.name = "hi!, 1, 1";
        java.lang.String str8 = item3.toString();
        java.lang.Class<?> wildcardClass9 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 1, 1, -1, 52" + "'", str8, "hi!, 1, 1, -1, 52");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0701");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int6 = item3.quality;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (byte) 100;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass12 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 10, 0" + "'", str7, ", 100, 1, 10, 0");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0702");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        java.lang.String str7 = item3.name;
        int int8 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 100, 10";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0703");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", 0, 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 10;
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0704");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.toString();
        item3.quality = (byte) 100;
        item3.sellIn = (short) 1;
        java.lang.Class<?> wildcardClass14 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0705");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdater7.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0706");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, 97" + "'", str5, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0707");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdater7.update();
        java.lang.Class<?> wildcardClass9 = itemUpdater7.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0708");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 100, (int) (short) 1);
        java.lang.String str4 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0709");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 100, 0, 0, 35", (int) ' ', (int) (short) 10);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0710");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.toString();
        item3.quality = (byte) 100;
        java.lang.String str12 = item3.name;
        int int13 = item3.quality;
        int int14 = item3.sellIn;
        int int15 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0711");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 97", (int) (byte) 1, (-1));
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (byte) 10;
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0712");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int12 = item3.quality;
        item3.sellIn = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater15 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater16 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater17 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str18 = item3.name;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0713");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (short) 0;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass9 = itemUpdater8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0714");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        item3.sellIn = (short) 10;
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0715");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.quality;
        item3.quality = 100;
        int int7 = item3.sellIn;
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0716");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) (short) 0, (int) '4');
        java.lang.String str4 = item3.name;
        item3.sellIn = (-1);
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 10" + "'", str4, "hi!, -1, 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 10, -1, 52" + "'", str7, "hi!, -1, 10, -1, 52");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0717");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        item3.name = "hi!, 100, -1";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0718");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        item3.quality = 0;
        int int6 = item3.quality;
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 0" + "'", str7, ", 100, 0");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0719");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.name;
        item3.quality = (byte) 0;
        int int7 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0720");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", 0, (int) (byte) 10);
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        item3.sellIn = 0;
        int int8 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str5, "hi!, 52, 97, 0, 10");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0721");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        item3.name = "hi!, 52, 10";
        java.lang.Class<?> wildcardClass12 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0722");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (int) (byte) 10, (-1));
        int int4 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdater8.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0723");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 97", (-1), (int) (short) 0);
        item3.sellIn = (-1);
        item3.sellIn = 0;
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0724");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", 97, (int) (short) 1);
        item3.name = ", 100, 1";
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.name;
        item3.quality = (byte) 1;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1" + "'", str6, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0725");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1, 0, 35", (int) (short) 1, 1);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0726");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int6 = item3.quality;
        java.lang.String str7 = item3.toString();
        int int8 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 10, 0" + "'", str7, ", 100, 1, 10, 0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0727");
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater17);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0728");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 0, 0", 1, 35);
        item3.sellIn = (short) 100;
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0729");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.toString();
        item3.name = "hi!, 100, -1, 1, 97";
        java.lang.Class<?> wildcardClass12 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0730");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.quality;
        item3.quality = (short) 0;
        int int7 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0731");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 52, 35);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0732");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 10;
        int int13 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater14.update();
        java.lang.Class<?> wildcardClass16 = conjuredItemUpdater14.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0733");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str12 = item3.name;
        item3.name = "hi!, -1, 10";
        java.lang.String str15 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater16 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 35, 97";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, -1, 10, 52, 10" + "'", str15, "hi!, -1, 10, 52, 10");
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0734");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 32, 100", (int) '#', (int) (byte) -1);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0735");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0736");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        item3.quality = (byte) -1;
        item3.name = "hi!, 52, 97";
        java.lang.String str15 = item3.toString();
        int int16 = item3.sellIn;
        item3.name = "hi!, 52, 97, 52, -1";
        item3.quality = ' ';
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 52, 97, 52, -1" + "'", str15, "hi!, 52, 97, 52, -1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0737");
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
        item3.name = "hi!, -1, 10";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 52, 97" + "'", str10, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 52, 97, -1, 10" + "'", str15, "hi!, 52, 97, -1, 10");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0738");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10", (int) '4', (int) '4');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdater5.update();
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0739");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (byte) 0;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0740");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 100, (int) 'a');
        int int4 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 97, 100, 97" + "'", str6, "hi!, -1, 97, 100, 97");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0741");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater7.update();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0742");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (-1));
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int6 = item3.quality;
        java.lang.Class<?> wildcardClass7 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0743");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 0, 1", 35, (int) (byte) 100);
        item3.name = ", -1, 52, 1, 97";
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0744");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 100, 0, 0, 35", 0, (int) '4');
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0745");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdater9.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0746");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdater13.update();
        java.lang.Class<?> wildcardClass15 = itemUpdater14.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0747");
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
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0748");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!, -1, 97";
        int int6 = item3.quality;
        item3.name = ", -1, 1";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0749");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str12 = item3.name;
        item3.quality = (short) -1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0750");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdater6.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0751");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str13 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0752");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", (int) (byte) -1, (int) (short) 1);
        item3.quality = (short) 1;
        int int6 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0753");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 100, 97", (int) (short) 100, (int) 'a');
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0754");
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
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater17 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str18 = item3.name;
        item3.name = ", 100, 1, 100, 0";
        java.lang.String str21 = item3.name;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ", 100, 1, 100, 0" + "'", str21, ", 100, 1, 100, 0");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0755");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (-1));
        int int4 = item3.quality;
        item3.sellIn = 32;
        item3.sellIn = 0;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int10 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0756");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) 'a', 0);
        item3.sellIn = (byte) 0;
        java.lang.String str6 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 10" + "'", str6, "hi!, -1, 10");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0757");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) 'a', 1);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater4.update();
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0758");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.name;
        item3.name = "hi!, -1, 97, 1, -1";
        item3.sellIn = (short) -1;
        java.lang.String str9 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97, 1, -1, -1, 10" + "'", str9, "hi!, -1, 97, 1, -1, -1, 10");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0759");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 97, 32", (int) (short) 0, 35);
        item3.sellIn = (byte) 0;
        item3.name = "hi!, 10, 10";
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0760");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        int int5 = item3.quality;
        java.lang.String str6 = item3.toString();
        java.lang.String str7 = item3.toString();
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 10, -1" + "'", str6, ", 10, -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 10, -1" + "'", str7, ", 10, -1");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0761");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 32, 97", (-1), (int) (short) 10);
        item3.name = "hi!, 1, 97";
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 1, 97, -1, 10" + "'", str6, "hi!, 1, 97, -1, 10");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0762");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str13 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater14.update();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0763");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0764");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", (-1), (-1));
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, 97, 1, -1, -1, -1" + "'", str5, "hi!, -1, 97, 1, -1, -1, -1");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0765");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        item3.name = "hi!";
        int int8 = item3.quality;
        int int9 = item3.sellIn;
        item3.name = ", 1, 0";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0766");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "";
        item3.name = ", -1, 52";
        java.lang.String str11 = item3.name;
        int int12 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", -1, 52" + "'", str11, ", -1, 52");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0767");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        int int8 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int10 = item3.quality;
        java.lang.String str11 = item3.toString();
        item3.name = "hi!, -1, 97, 100, 97";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 97" + "'", str11, "hi!, -1, 97");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0768");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 1;
        item3.quality = 97;
        item3.quality = (short) -1;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0769");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", 32, (int) ' ');
        item3.name = ", 100, 1, 0, -1";
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1, 0, -1, 32, 32" + "'", str6, ", 100, 1, 0, -1, 32, 32");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0770");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (-1));
        int int4 = item3.quality;
        int int5 = item3.quality;
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0771");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str13 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str15 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, -1, 10" + "'", str15, "hi!, -1, 10");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0772");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        item3.quality = (byte) -1;
        item3.name = "hi!, 52, 97";
        java.lang.String str15 = item3.toString();
        int int16 = item3.sellIn;
        item3.name = "hi!, 52, 97, 52, -1";
        item3.quality = 'a';
        int int21 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater22 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater23 = conjuredItemUpdater22.update();
        com.gildedrose.ItemUpdater itemUpdater24 = conjuredItemUpdater22.update();
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdater24.update();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 52, 97, 52, -1" + "'", str15, "hi!, 52, 97, 52, -1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater25);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0773");
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
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdater11.update();
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
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0774");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        item3.name = "";
        item3.name = "hi!, 52, 97, 52, -1";
        int int13 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0775");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        item3.quality = (short) 0;
        item3.sellIn = 10;
        java.lang.String str14 = item3.name;
        java.lang.String str15 = item3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 10, 0" + "'", str15, "hi!, 10, 0");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0776");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = ' ';
        int int13 = item3.sellIn;
        item3.quality = 10;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0777");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.name;
        item3.name = "hi!, -1, 97, 1, -1";
        int int7 = item3.sellIn;
        int int8 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0778");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", (int) (byte) -1, (int) (short) 1);
        item3.name = "hi!, -1, 0";
        item3.name = "hi!, 52, 97, -1, 52, 10, 97";
        item3.quality = 0;
        java.lang.String str10 = item3.name;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 52, 97, -1, 52, 10, 97" + "'", str10, "hi!, 52, 97, -1, 52, 10, 97");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0779");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int6 = item3.quality;
        int int7 = item3.quality;
        int int8 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0780");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (-1));
        int int4 = item3.quality;
        int int5 = item3.quality;
        int int6 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0781");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 'a';
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0782");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 1", (int) (short) 10, 10);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0783");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int8 = item3.sellIn;
        int int9 = item3.quality;
        int int10 = item3.sellIn;
        item3.sellIn = 1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass14 = conjuredItemUpdater13.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0784");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        item3.sellIn = (short) 100;
        java.lang.String str13 = item3.name;
        item3.name = ", -1, 52, -1, 97";
        item3.quality = (byte) 0;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0785");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (byte) 10;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0786");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int8 = item3.sellIn;
        int int9 = item3.quality;
        int int10 = item3.sellIn;
        item3.sellIn = 1;
        item3.name = ", 100, 1";
        item3.name = "";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0787");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 97, -1, 10", 100, (int) 'a');
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0788");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 97, 100, 0", (int) 'a', 100);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 97, 100, 0, 97, 100" + "'", str4, "hi!, 100, 97, 100, 0, 97, 100");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0789");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", (int) 'a', (int) (short) 1);
        item3.name = "hi!, -1, 10, 52, 0";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdater8.update();
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0790");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10", 52, (int) (short) 1);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 10" + "'", str4, "hi!, 100, 10");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0791");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        item3.sellIn = (short) 100;
        item3.sellIn = (short) -1;
        int int15 = item3.sellIn;
        java.lang.String str16 = item3.toString();
        java.lang.String str17 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, -1, 10" + "'", str16, "hi!, -1, 10");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, -1, 10" + "'", str17, "hi!, -1, 10");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0792");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.name;
        item3.quality = (short) 1;
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0793");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1" + "'", str6, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0794");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", 100, (int) (short) 0);
        java.lang.String str4 = item3.name;
        int int5 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0795");
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
        item3.sellIn = 52;
        int int21 = item3.quality;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 52, 97, 52, -1" + "'", str15, "hi!, 52, 97, 52, -1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0796");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        item3.sellIn = 10;
        item3.sellIn = (short) 0;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater15 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0797");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 97, 97";
        item3.name = ", 100, 1, 100, 52";
        java.lang.Class<?> wildcardClass12 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0798");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str9 = item3.name;
        item3.quality = (short) 0;
        int int12 = item3.sellIn;
        java.lang.Class<?> wildcardClass13 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0799");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 0, 0", 1, 35);
        java.lang.String str4 = item3.name;
        item3.name = "hi!, -1, 97, 1, 52";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 10, 0, 0" + "'", str4, "hi!, -1, 10, 0, 0");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0800");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) (short) 100, (int) (short) 1);
        java.lang.String str4 = item3.name;
        item3.quality = (short) -1;
        int int7 = item3.sellIn;
        item3.quality = 0;
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 10" + "'", str4, "hi!, -1, 10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0801");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 0, 0", 1, 35);
        item3.sellIn = '#';
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0802");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1, 32, 97", 52, 10);
        item3.quality = (byte) 100;
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0803");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = '#';
        item3.name = "hi!, 52, 97, 97, 32";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 100;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0804");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 0, 0", (int) 'a', (int) (short) 0);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0805");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = 'a';
        item3.quality = (short) -1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0806");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str6 = item3.name;
        int int7 = item3.quality;
        java.lang.String str8 = item3.toString();
        item3.name = ", -1, 1";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1" + "'", str6, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 100, 1, 10, 0" + "'", str8, ", 100, 1, 10, 0");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0807");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        java.lang.String str11 = item3.toString();
        item3.name = "hi!, 52, 97, 97, 32";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 52, 10" + "'", str11, "hi!, 52, 10");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0808");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 0, (int) (short) 1);
        item3.quality = (byte) 10;
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0809");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int11 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater13.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0810");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) 'a', 1);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdater6.update();
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0811");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = 0;
        int int11 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater12.update();
        java.lang.Class<?> wildcardClass14 = itemUpdater13.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0812");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass13 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 10" + "'", str11, "hi!, -1, 10");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0813");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 'a';
        int int15 = item3.sellIn;
        int int16 = item3.quality;
        item3.name = "hi!, 1, 32";
        java.lang.String str19 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 1, 32, 1, 97" + "'", str19, "hi!, 1, 32, 1, 97");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0814");
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
        com.gildedrose.ItemUpdater itemUpdater18 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdater18.update();
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdater18.update();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater20);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0815");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 1, -1, 97", 32, (int) 'a');
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0816");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass13 = conjuredItemUpdater12.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0817");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", (int) (byte) -1, (int) (short) 1);
        int int4 = item3.quality;
        item3.sellIn = 0;
        int int7 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0818");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str10 = item3.name;
        item3.name = ", 100, 10, -1, 97";
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int14 = item3.quality;
        java.lang.String str15 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ", 100, 10, -1, 97" + "'", str15, ", 100, 10, -1, 97");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0819");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.name;
        item3.quality = (byte) 0;
        int int7 = item3.quality;
        int int8 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdater9.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0820");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 100, 0", (int) (short) 0, 1);
        item3.quality = (short) 1;
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0821");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 100;
        int int9 = item3.quality;
        int int10 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97, -1, 10";
        int int14 = item3.quality;
        java.lang.String str15 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 52, 97, -1, 10, 100, 97" + "'", str15, "hi!, 52, 97, -1, 10, 100, 97");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0822");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", 100, (int) (short) 0);
        java.lang.String str4 = item3.name;
        item3.quality = 0;
        item3.quality = 100;
        item3.name = "hi!, 1, 1, -1, 52";
        int int11 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0823");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", (int) (byte) -1, (int) 'a');
        item3.name = "hi!, 10, 0";
        java.lang.String str6 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int8 = item3.quality;
        item3.sellIn = (short) -1;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 10, 0" + "'", str6, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0824");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = ' ';
        int int13 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdater14.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0825");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!, -1, 97";
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str9 = item3.name;
        item3.name = "hi!, 32, 97";
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0826");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater12.update();
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater12.update();
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater12.update();
        java.lang.Class<?> wildcardClass16 = itemUpdater15.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0827");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 100, (int) (short) 1);
        item3.name = ", -1, 52";
        item3.sellIn = 35;
        java.lang.String str8 = item3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", -1, 52, 35, 1" + "'", str8, ", -1, 52, 35, 1");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0828");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 97, 32", (int) (short) 0, 35);
        item3.sellIn = (byte) 0;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0829");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int12 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0830");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        int int4 = item3.sellIn;
        int int5 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater8.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0831");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        item3.sellIn = (byte) 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 52, 97, 0, 10, 1, 0";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = ", -1, 52, 1, 97";
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0832");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        item3.quality = (short) 0;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0833");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        item3.sellIn = 100;
        item3.quality = (short) 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater9.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater9.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0834");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) 'a', 1);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str5 = item3.name;
        item3.sellIn = (short) 100;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0835");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater11.update();
        java.lang.Class<?> wildcardClass14 = itemUpdater13.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0836");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        java.lang.String str6 = item3.name;
        item3.quality = (short) 100;
        int int9 = item3.sellIn;
        item3.name = "hi!, -1, 97, 100, 100";
        java.lang.String str12 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1" + "'", str6, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, -1, 97, 100, 100, 0, 100" + "'", str12, "hi!, -1, 97, 100, 100, 0, 100");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0837");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        item3.quality = 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) -1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int15 = item3.quality;
        int int16 = item3.sellIn;
        int int17 = item3.sellIn;
        item3.name = "";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0838");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 1, (-1));
        java.lang.String str4 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97, 1, -1" + "'", str4, "hi!, -1, 97, 1, -1");
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0839");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 97, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass11 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0840");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        item3.quality = 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int13 = item3.quality;
        item3.quality = (short) 100;
        java.lang.String str16 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0841");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", (int) (byte) 1, (int) (byte) 0);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", -1, 97, 1, 0" + "'", str4, ", -1, 97, 1, 0");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0842");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10", (-1), 100);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0843");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        item3.name = "hi!";
        int int8 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdater9.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0844");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.toString();
        item3.quality = (byte) 100;
        item3.sellIn = '#';
        int int14 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater15 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0845");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10", (int) (short) 1, 35);
        item3.name = "hi!, -1, 97, 1, -1, 32, 97";
        item3.name = "";
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0846");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) (short) 100, (int) (short) 1);
        item3.name = ", 100, 1";
        item3.name = "hi!, 1, 1";
        int int8 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0847");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, -1, -1", 35, 52);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0848");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) -1, (int) (byte) 10);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = 'a';
        item3.sellIn = 52;
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0849");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52", (int) (byte) 10, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdater4.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0850");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = ' ';
        item3.name = "hi!, -1, 97, 1, -1";
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int14 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 97, 1, -1, 32, 97" + "'", str11, "hi!, -1, 97, 1, -1, 32, 97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, -1, 97, 1, -1, 32, 97" + "'", str12, "hi!, -1, 97, 1, -1, 32, 97");
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0851");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        int int6 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0852");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.toString();
        int int5 = item3.sellIn;
        item3.name = "hi!, 52, 97, 52, -1";
        item3.sellIn = (short) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int11 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 10" + "'", str4, ", 100, 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0853");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.quality = '#';
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = ", -1, 97, 10, 97";
        java.lang.String str13 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ", -1, 97, 10, 97" + "'", str13, ", -1, 97, 10, 97");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0854");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (short) 10);
        item3.name = ", 100, 1, 10, 52";
        int int6 = item3.sellIn;
        item3.name = "hi!, -1, 97, 1, 52";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0855");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = 0;
        item3.quality = (-1);
        java.lang.String str13 = item3.name;
        item3.quality = 0;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0856");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 0, 35);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass5 = itemUpdater4.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0857");
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
        com.gildedrose.ItemUpdater itemUpdater22 = conjuredItemUpdater21.update();
        com.gildedrose.ItemUpdater itemUpdater23 = conjuredItemUpdater21.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str17, "hi!, 52, 97, 0, 10");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater23);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0858");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.toString();
        int int12 = item3.quality;
        java.lang.String str13 = item3.toString();
        java.lang.String str14 = item3.name;
        item3.sellIn = ' ';
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 10" + "'", str11, "hi!, -1, 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, -1, 10" + "'", str13, "hi!, -1, 10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0859");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (-1));
        int int4 = item3.quality;
        item3.quality = 52;
        item3.name = ", 100, 10";
        java.lang.Class<?> wildcardClass9 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0860");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97, 10, 1", 35, (int) (byte) 0);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0861");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 32, 97", (int) 'a', (int) (byte) 100);
        item3.name = ", 100, 1, 0, 0, 0, 10";
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0862");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 0, 1", (int) ' ', (int) 'a');
        item3.sellIn = (byte) -1;
        item3.name = ", 100, 1, 0, -1, 32, 32";
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0863");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 52, 0", 97, 100);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0864");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 10, 100);
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, 97, 10, 100" + "'", str5, "hi!, -1, 97, 10, 100");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0865");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        java.lang.String str12 = item3.name;
        java.lang.String str13 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, -1, 10" + "'", str13, "hi!, -1, 10");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0866");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 97", (int) 'a', (-1));
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0867");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int8 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass10 = itemUpdater9.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0868");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str9 = item3.name;
        java.lang.String str10 = item3.toString();
        int int11 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 97" + "'", str7, "hi!, 1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 1, 97" + "'", str10, "hi!, 1, 97");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0869");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 100;
        int int9 = item3.quality;
        int int10 = item3.quality;
        item3.quality = (short) -1;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0870");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52, 10, 97", 52, (int) (short) 10);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0871");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = ", 10, -1";
        item3.name = ", 100, 10, -1, 97, 100, 10";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0872");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 100, 97";
        int int15 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0873");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (byte) 0;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int10 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0874");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 100, (int) (short) 1);
        java.lang.String str4 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = 32;
        int int8 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0875");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0876");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdater8.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0877");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) '#', 32);
        item3.sellIn = '#';
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0878");
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0879");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.quality = 1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass11 = conjuredItemUpdater10.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0880");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.toString();
        item3.quality = (short) -1;
        item3.quality = 35;
        java.lang.String str9 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 10" + "'", str4, ", 100, 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 100, 35" + "'", str9, ", 100, 35");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0881");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", (int) (short) 1, 32);
        java.lang.String str4 = item3.name;
        item3.name = ", 100, 1, 0, 0";
        java.lang.String str7 = item3.name;
        item3.sellIn = (byte) 1;
        item3.quality = (byte) 1;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 97" + "'", str4, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 0, 0" + "'", str7, ", 100, 1, 0, 0");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0882");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!, -1, 97";
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass7 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0883");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdater13.update();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdater13.update();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0884");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 100, (int) (short) 1);
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        item3.sellIn = (-1);
        int int8 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0885");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 97, 100, 0, 97, 100", 32, (int) (short) 10);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0886");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdater12.update();
        java.lang.Class<?> wildcardClass14 = itemUpdater12.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0887");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 32, 100", 35, (int) ' ');
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0888");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 97, 97";
        item3.name = ", 100, 1, 100, 52";
        item3.quality = ' ';
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 1;
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0889");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 1, 97, -1, 10";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, 97" + "'", str5, "hi!, -1, 97");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0890");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", 100, (int) (short) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, 97" + "'", str5, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 97, 100, 0" + "'", str6, "hi!, -1, 97, 100, 0");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0891");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        item3.quality = (byte) 100;
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0892");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", 100, (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 0;
        java.lang.Class<?> wildcardClass7 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0893");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str8 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int11 = item3.quality;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0894");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97, 1, 0", (-1), (int) '#');
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0895");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        item3.name = ", -1, 52";
        java.lang.String str9 = item3.toString();
        item3.quality = 0;
        item3.quality = 32;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", -1, 52, -1, 97" + "'", str9, ", -1, 52, -1, 97");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0896");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str12 = item3.name;
        item3.name = "hi!, -1, 10";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str16 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater17 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97, 0, 10";
        item3.name = "hi!, 100, -1";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, -1, 10" + "'", str16, "hi!, -1, 10");
        org.junit.Assert.assertNotNull(itemUpdater17);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0897");
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
        item3.name = "hi!, -1, 97, 1, 52";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0898");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (byte) 10;
        item3.name = "hi!, 52, 10";
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0899");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        item3.sellIn = 'a';
        int int8 = item3.quality;
        java.lang.String str9 = item3.toString();
        int int10 = item3.quality;
        item3.name = "hi!, -1, 10, 52, 0";
        java.lang.Class<?> wildcardClass13 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 97, 97" + "'", str9, "hi!, 97, 97");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0900");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.name = "hi!, 10, 0";
        item3.name = ", 100, 1, 0, 0";
        item3.sellIn = (-1);
        java.lang.Class<?> wildcardClass14 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0901");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 1, (-1));
        int int4 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.sellIn = (byte) 10;
        java.lang.Class<?> wildcardClass9 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0902");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!, -1, 97";
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdater7.update();
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0903");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.name;
        item3.sellIn = ' ';
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdater9.update();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0904");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass7 = itemUpdater6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0905");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 1, (-1));
        java.lang.String str4 = item3.toString();
        item3.quality = '4';
        item3.quality = 97;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97, 1, -1" + "'", str4, "hi!, -1, 97, 1, -1");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0906");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str9 = item3.name;
        item3.quality = (short) 0;
        item3.sellIn = '#';
        java.lang.Class<?> wildcardClass14 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0907");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (short) 100;
        int int11 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0908");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 32, 100", 52, 52);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0909");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        item3.name = "hi!, -1, 0";
        item3.sellIn = (byte) 0;
        item3.quality = (short) 0;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater10.update();
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0910");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10, 1, 10", (int) (short) 10, (int) (byte) -1);
        java.lang.String str4 = item3.name;
        int int5 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 10, 1, 10" + "'", str4, "hi!, 52, 10, 1, 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0911");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.sellIn = (short) 0;
        item3.sellIn = ' ';
        java.lang.String str9 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 100, 1, 32, 0" + "'", str9, ", 100, 1, 32, 0");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0912");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10, 1, 35", (int) (short) 10, 97);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0913");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 10, -1, 1, 97", 10, (-1));
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0914");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        java.lang.String str7 = item3.name;
        int int8 = item3.sellIn;
        item3.sellIn = 'a';
        int int11 = item3.sellIn;
        item3.name = "hi!, 52, 97, -1, 1";
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0915");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass13 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0916");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", 10, 0);
        item3.quality = (-1);
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 97, 1, -1, 10, -1" + "'", str6, "hi!, -1, 97, 1, -1, 10, -1");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0917");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", 10, 32);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1" + "'", str5, ", 100, 1");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0918");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 10", 0, 52);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0919");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = '4';
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0920");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 100, (int) (short) 1);
        item3.sellIn = (short) 100;
        int int6 = item3.quality;
        java.lang.String str7 = item3.toString();
        item3.name = "hi!, 1, 52";
        item3.quality = '#';
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0921");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        item3.name = "hi!, -1, 0";
        item3.sellIn = 0;
        item3.name = "hi!, -1, 0, 100, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0922");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        item3.quality = (short) 0;
        item3.name = "hi!, 32, 100";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0923");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", 100, (int) (short) 0);
        item3.sellIn = 100;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str8 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97, 100, 0" + "'", str8, "hi!, -1, 97, 100, 0");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0924");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", (int) (byte) -1, (int) (short) 1);
        item3.name = "hi!, -1, 0";
        item3.name = "hi!, 52, 97, -1, 52, 10, 97";
        item3.quality = 0;
        java.lang.String str10 = item3.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 52, 97, -1, 52, 10, 97, -1, 0" + "'", str10, "hi!, 52, 97, -1, 52, 10, 97, -1, 0");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0925");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdater10.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0926");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.quality;
        item3.quality = 100;
        item3.name = "hi!, -1, 10, 52, 0";
        java.lang.String str9 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 10, 52, 0" + "'", str9, "hi!, -1, 10, 52, 0");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0927");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        java.lang.String str6 = item3.name;
        item3.quality = (short) 100;
        int int9 = item3.sellIn;
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1" + "'", str6, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0928");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", (int) 'a', (int) (short) 1);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (byte) 0;
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0929");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str12 = item3.name;
        item3.name = "hi!, -1, 10";
        int int15 = item3.sellIn;
        item3.sellIn = (byte) -1;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0930");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.quality;
        java.lang.String str7 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0931");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) (short) 0, (int) '#');
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 10, 0, 35" + "'", str4, "hi!, -1, 10, 0, 35");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0932");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        item3.sellIn = (byte) -1;
        item3.sellIn = (byte) 1;
        java.lang.String str14 = item3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 1, 97" + "'", str14, "hi!, 1, 97");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0933");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        int int7 = item3.sellIn;
        int int8 = item3.quality;
        int int9 = item3.quality;
        java.lang.String str10 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", 100, 1" + "'", str10, ", 100, 1");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0934");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10, 1, 10", (int) '#', 97);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0935");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.quality = 1;
        item3.quality = 32;
        item3.name = ", -1, 97, 10, 97";
        item3.sellIn = (-1);
        int int16 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0936");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        item3.name = "";
        int int11 = item3.sellIn;
        int int12 = item3.sellIn;
        java.lang.String str13 = item3.toString();
        java.lang.String str14 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ", -1, 97" + "'", str13, ", -1, 97");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ", -1, 97" + "'", str14, ", -1, 97");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0937");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 1", (int) 'a', (int) (short) 100);
        int int4 = item3.quality;
        java.lang.String str5 = item3.name;
        item3.name = ", -1, 97";
        item3.name = "hi!, -1, 97, 1, -1, -1, -1";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 97, 1" + "'", str5, "hi!, 97, 1");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0938");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdater5.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0939");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        java.lang.String str10 = item3.name;
        item3.name = "";
        item3.quality = 0;
        java.lang.String str15 = item3.toString();
        item3.name = ", 100, 0";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ", 52, 0" + "'", str15, ", 52, 0");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0940");
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
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater17 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str18 = item3.name;
        item3.name = "hi!, -1, 97, 35, 100";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0941");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = ' ';
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str15 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 1, 32" + "'", str15, "hi!, 1, 32");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0942");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 0", (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0943");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 1;
        int int13 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0944");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        item3.sellIn = 0;
        item3.sellIn = (short) 0;
        java.lang.Class<?> wildcardClass11 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0945");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.quality;
        item3.quality = 100;
        item3.name = "hi!, -1, 10, 52, 0";
        item3.name = "";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0946");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", (int) (byte) -1, (int) 'a');
        item3.name = "hi!, 10, 0";
        java.lang.String str6 = item3.name;
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdater9.update();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 10, 0" + "'", str6, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0947");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        item3.quality = 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdater12.update();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdater12.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0948");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) 'a', (int) '#');
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 97, 35" + "'", str4, ", 97, 35");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0949");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.sellIn;
        int int5 = item3.quality;
        item3.sellIn = ' ';
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0950");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        java.lang.Class<?> wildcardClass9 = conjuredItemUpdater7.getClass();
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0951");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10", (int) (byte) 100, 32);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 10, 100, 32" + "'", str4, "hi!, 100, 10, 100, 32");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0952");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (byte) 10;
        item3.name = "hi!, 52, 10";
        int int10 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0953");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) (short) 100, (int) (short) 1);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdater5.update();
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0954");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdater10.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0955");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", 0, (int) (byte) 10);
        int int4 = item3.quality;
        item3.name = ", 100, 1, 0, 0";
        int int7 = item3.quality;
        java.lang.String str8 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 100, 1, 0, 0, 0, 10" + "'", str8, ", 100, 1, 0, 0, 0, 10");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0956");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        int int4 = item3.sellIn;
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0957");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 97", 100, (int) 'a');
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0958");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        item3.name = "hi!, 100, 10";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.name;
        java.lang.String str12 = item3.name;
        item3.sellIn = (short) 0;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 100, 10" + "'", str11, "hi!, 100, 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 100, 10" + "'", str12, "hi!, 100, 10");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0959");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", 10, 0);
        item3.quality = (-1);
        int int6 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0960");
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
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater16 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0961");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdater5.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0962");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (int) (short) 0, 10);
        int int4 = item3.quality;
        int int5 = item3.quality;
        item3.name = ", -1, 97, 10, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0963");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int11 = item3.quality;
        int int12 = item3.quality;
        item3.sellIn = '4';
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0964");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int8 = item3.sellIn;
        int int9 = item3.quality;
        int int10 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass12 = conjuredItemUpdater11.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0965");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        int int6 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 100;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0966");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", 32, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0967");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = ' ';
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdater13.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0968");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        item3.name = "hi!, -1, 0";
        item3.sellIn = (byte) 0;
        item3.sellIn = (byte) 0;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass11 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0969");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.name;
        item3.sellIn = ' ';
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater9.update();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdater10.update();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0970");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str12 = item3.name;
        item3.name = "hi!, -1, 10";
        int int15 = item3.sellIn;
        java.lang.String str16 = item3.name;
        int int17 = item3.quality;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, -1, 10" + "'", str16, "hi!, -1, 10");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0971");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (int) (byte) 10, (-1));
        int int4 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        java.lang.Class<?> wildcardClass8 = itemUpdater7.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0972");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 97, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = '#';
        java.lang.Class<?> wildcardClass13 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0973");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", 10, (int) '4');
        int int4 = item3.quality;
        java.lang.String str5 = item3.name;
        item3.name = ", 52, 97";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1" + "'", str5, ", 100, 1");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0974");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 52, 10", (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0975");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        int int12 = item3.quality;
        java.lang.String str13 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0976");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        item3.quality = (byte) -1;
        item3.name = "hi!, 52, 97";
        java.lang.String str15 = item3.toString();
        item3.name = ", 100, 1, 100, 52, 35, 1";
        java.lang.String str18 = item3.name;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 52, 97, 52, -1" + "'", str15, "hi!, 52, 97, 52, -1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ", 100, 1, 100, 52, 35, 1" + "'", str18, ", 100, 1, 100, 52, 35, 1");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0977");
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
        java.lang.Class<?> wildcardClass18 = conjuredItemUpdater17.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 52, 10, 1, 10" + "'", str16, "hi!, 52, 10, 1, 10");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0978");
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
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater16 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int17 = item3.sellIn;
        item3.quality = (short) 10;
        java.lang.String str20 = item3.name;
        java.lang.Class<?> wildcardClass21 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0979");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdater5.update();
        java.lang.Class<?> wildcardClass8 = itemUpdater5.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0980");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.sellIn;
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0981");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 52, 0", (int) (short) -1, (int) (short) 100);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0982");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 52, 0", (int) (byte) 0, (int) ' ');
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 10, 52, 0" + "'", str4, "hi!, -1, 10, 52, 0");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0983");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", (int) (byte) 10, 97);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0984");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        java.lang.String str10 = item3.toString();
        java.lang.String str11 = item3.name;
        item3.quality = 35;
        java.lang.String str14 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", -1, 52, -1, 97" + "'", str10, ", -1, 52, -1, 97");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", -1, 52" + "'", str11, ", -1, 52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ", -1, 52, -1, 35" + "'", str14, ", -1, 52, -1, 35");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0985");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 1", (int) '#', (int) (short) 1);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0986");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.toString();
        java.lang.String str13 = item3.toString();
        int int14 = item3.quality;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 10" + "'", str11, "hi!, -1, 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, -1, 10" + "'", str12, "hi!, -1, 10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, -1, 10" + "'", str13, "hi!, -1, 10");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0987");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 52, 10", (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0988");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) 'a', (int) (short) 100);
        item3.sellIn = (short) -1;
        int int6 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0989");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0, 35, 32", (int) ' ', 0);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0990");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, 52", 10, (int) (short) 0);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0991");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 10", (int) (short) 1, 10);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0992");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        item3.sellIn = 'a';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.name;
        int int10 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0993");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.quality = 32;
        item3.sellIn = 0;
        item3.quality = 0;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 97" + "'", str7, "hi!, 1, 97");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0994");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 97, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdater12.update();
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0995");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 10", (-1), (int) (short) 100);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0996");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10, 1, 0", (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0997");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", (int) (short) 100, (-1));
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0998");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (-1));
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test0999");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater12.update();
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater12.update();
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater12.update();
        java.lang.Class<?> wildcardClass16 = conjuredItemUpdater12.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest1.test1000");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        item3.quality = (short) 0;
        item3.sellIn = (-1);
        item3.sellIn = (short) 1;
        item3.quality = 10;
        java.lang.String str18 = item3.name;
        item3.sellIn = 32;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }
}

