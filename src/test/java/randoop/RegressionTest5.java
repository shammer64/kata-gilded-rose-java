package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2501");
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
        java.lang.String str16 = item3.toString();
        item3.name = ", -1, 52, 10, 97";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, -1, 10" + "'", str16, "hi!, -1, 10");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2502");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", 32, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdater5.update();
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2503");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10", (int) '#', 0);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2504");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int8 = item3.sellIn;
        item3.name = "hi!, 100, 10, 1, 35";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2505");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        item3.quality = 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) -1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int15 = item3.quality;
        item3.quality = (short) 0;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2506");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (-1));
        int int4 = item3.quality;
        item3.quality = 52;
        item3.name = "hi!, -1, 97, 1, -1, 32, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2507");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        int int4 = item3.sellIn;
        int int5 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2508");
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
        java.lang.String str15 = item3.toString();
        item3.name = ", -1, 52, 35, 97";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ", 52, -1" + "'", str15, ", 52, -1");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2509");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 52, -1", 97, 10);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdater4.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2510");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        int int7 = item3.sellIn;
        int int8 = item3.quality;
        item3.name = "hi!, 1, 10";
        item3.sellIn = '4';
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2511");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", 0, 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        java.lang.Class<?> wildcardClass9 = itemUpdater8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 10" + "'", str6, "hi!, -1, 10");
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2512");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        int int8 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2513");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1, 32, 97", 52, 10);
        item3.sellIn = 32;
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2514");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", 0, (int) (short) 1);
        item3.quality = (short) -1;
        int int6 = item3.quality;
        java.lang.Class<?> wildcardClass7 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2515");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 10, -1", 100, 100);
        item3.sellIn = 0;
        java.lang.String str6 = item3.name;
        item3.name = "";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 10, -1" + "'", str6, ", 10, -1");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2516");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 10", (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2517");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int9 = item3.sellIn;
        java.lang.String str10 = item3.name;
        item3.sellIn = (short) 10;
        item3.quality = 52;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 52, 97" + "'", str10, "hi!, 52, 97");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2518");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        item3.sellIn = (short) 100;
        java.lang.String str13 = item3.name;
        item3.name = ", -1, 52, -1, 97";
        item3.quality = 0;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2519");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.name;
        item3.quality = (short) 1;
        item3.sellIn = ' ';
        item3.sellIn = 52;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater12.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2520");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        int int9 = item3.quality;
        java.lang.String str10 = item3.name;
        java.lang.String str11 = item3.name;
        int int12 = item3.quality;
        item3.quality = (short) 0;
        item3.sellIn = (-1);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater17 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater18 = conjuredItemUpdater17.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(itemUpdater18);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2521");
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
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater17 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater18 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 1, 10, -1, 35" + "'", str14, "hi!, 1, 10, -1, 35");
        org.junit.Assert.assertNotNull(itemUpdater18);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2522");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int12 = item3.sellIn;
        item3.name = "hi!, -1, 1, 97, 0";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2523");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        java.lang.String str9 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.toString();
        item3.sellIn = (short) -1;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", -1, 97" + "'", str9, ", -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", -1, 97" + "'", str11, ", -1, 97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ", -1, 97" + "'", str12, ", -1, 97");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2524");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 1, (-1));
        java.lang.String str4 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str6 = item3.toString();
        item3.name = ", 100, 1, 0, -1";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97, 1, -1" + "'", str4, "hi!, -1, 97, 1, -1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 97, 1, -1" + "'", str6, "hi!, -1, 97, 1, -1");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2525");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        item3.name = "hi!";
        int int8 = item3.quality;
        item3.sellIn = 32;
        item3.sellIn = (short) 10;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2526");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10", (int) 'a', (int) (short) 1);
        item3.name = "hi!, 52, 97";
        java.lang.String str6 = item3.name;
        item3.name = ", -1, 97, 10, 97";
        item3.quality = (byte) 10;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 52, 97" + "'", str6, "hi!, 52, 97");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2527");
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
        java.lang.String str15 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2528");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        item3.name = "hi!";
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.quality;
        int int8 = item3.quality;
        int int9 = item3.quality;
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2529");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10", (int) '#', 0);
        java.lang.String str4 = item3.name;
        int int5 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 10" + "'", str4, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2530");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        item3.name = "";
        int int11 = item3.sellIn;
        int int12 = item3.sellIn;
        java.lang.String str13 = item3.toString();
        java.lang.String str14 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ", -1, 97" + "'", str13, ", -1, 97");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2531");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) '4', (int) (byte) 0);
        java.lang.String str4 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 10" + "'", str4, "hi!, -1, 10");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 10, 52, 0" + "'", str6, "hi!, -1, 10, 52, 0");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2532");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = 97;
        item3.sellIn = (byte) 10;
        java.lang.String str16 = item3.name;
        item3.sellIn = (byte) 10;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2533");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) 'a', (int) (short) 100);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str5 = item3.toString();
        item3.sellIn = (short) 1;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, 0, 97, 100" + "'", str5, "hi!, -1, 0, 97, 100");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2534");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (int) (byte) 10, (-1));
        int int4 = item3.sellIn;
        item3.quality = (short) -1;
        item3.sellIn = (byte) 1;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2535");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater12.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2536");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (byte) 0;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2537");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 97", (int) '#', (int) (short) 1);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2538");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int11 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str13 = item3.toString();
        java.lang.String str14 = item3.name;
        item3.quality = (byte) -1;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 1, 10" + "'", str13, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2539");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, 0, 0, 10", (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2540");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = 0;
        item3.quality = (-1);
        java.lang.String str13 = item3.name;
        int int14 = item3.sellIn;
        int int15 = item3.quality;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2541");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        item3.name = "";
        item3.name = "hi!, 52, 97, -1, 52";
        java.lang.String str8 = item3.toString();
        item3.sellIn = 97;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 52, 97, -1, 52, 10, 0" + "'", str8, "hi!, 52, 97, -1, 52, 10, 0");
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2542");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.toString();
        item3.quality = (byte) 100;
        int int12 = item3.sellIn;
        int int13 = item3.quality;
        int int14 = item3.sellIn;
        int int15 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2543");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 97", (int) '#', (int) (byte) 100);
        int int4 = item3.sellIn;
        item3.name = "";
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2544");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        item3.sellIn = (byte) -1;
        item3.sellIn = (byte) 1;
        int int14 = item3.quality;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2545");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 32, 10, -1, -1", (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2546");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        java.lang.String str7 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdater8.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2547");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = 35;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (byte) 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2548");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        java.lang.String str8 = item3.name;
        int int9 = item3.quality;
        item3.sellIn = (byte) 0;
        int int12 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2549");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 97, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int11 = item3.sellIn;
        item3.sellIn = (short) -1;
        item3.name = ", 100, 1, 0, 0, 1, 32";
        int int16 = item3.sellIn;
        item3.sellIn = (byte) 0;
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2550");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52, 10, 97, 52, 97", (int) 'a', 35);
        item3.quality = 35;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2551");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str9 = item3.name;
        java.lang.String str10 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass12 = itemUpdater11.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, -1, 10" + "'", str10, "hi!, -1, 10");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2552");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        int int4 = item3.sellIn;
        int int5 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int9 = item3.sellIn;
        int int10 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, -1, 97, 0, 1";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2553");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str10 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, -1, 10" + "'", str10, "hi!, -1, 10");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2554");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        java.lang.String str7 = item3.name;
        int int8 = item3.sellIn;
        item3.sellIn = 'a';
        item3.sellIn = 10;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97, -1, 52, 10, 10";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2555");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", 97, (int) (short) 1);
        item3.name = ", 100, 1";
        item3.sellIn = (short) 1;
        item3.name = ", 100, 10, 10, 0";
        java.lang.String str10 = item3.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", 100, 10, 10, 0, 1, 1" + "'", str10, ", 100, 10, 10, 0, 1, 1");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2556");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.name;
        item3.name = ", 100, 10";
        item3.name = "hi!, -1, 0";
        java.lang.String str9 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 0, -1, 97" + "'", str9, "hi!, -1, 0, -1, 97");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2557");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        int int8 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2558");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = 1;
        java.lang.String str9 = item3.toString();
        item3.name = "hi!, 97, 0";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 97" + "'", str9, "hi!, 1, 97");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2559");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        int int9 = item3.quality;
        java.lang.String str10 = item3.name;
        int int11 = item3.quality;
        int int12 = item3.quality;
        java.lang.String str13 = item3.name;
        item3.sellIn = '4';
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2560");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        item3.quality = (short) 0;
        item3.sellIn = (-1);
        java.lang.String str14 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater16 = conjuredItemUpdater15.update();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, -1, 0" + "'", str14, "hi!, -1, 0");
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2561");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52, 35, 97", 32, 32);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2562");
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
        int int21 = item3.quality;
        item3.sellIn = 0;
        item3.name = ", -1, 97, 10, 97";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 1, 1, -1, 97, 100, 10" + "'", str20, "hi!, 1, 1, -1, 97, 100, 10");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2563");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1, 100, 97", 52, (int) 'a');
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 1, 100, 97, 52, 97" + "'", str4, "hi!, -1, 1, 100, 97, 52, 97");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2564");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 100, 52", (int) (byte) 0, (int) (byte) 100);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2565");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 52, -1", (-1), 35);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2566");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int9 = item3.sellIn;
        java.lang.String str10 = item3.name;
        item3.sellIn = (byte) 1;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (short) 100;
        int int16 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 52, 97" + "'", str10, "hi!, 52, 97");
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2567");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int10 = item3.sellIn;
        int int11 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater13.update();
        java.lang.Class<?> wildcardClass15 = conjuredItemUpdater13.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2568");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10", 10, (int) (byte) 0);
        item3.quality = 100;
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2569");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.quality = '4';
        item3.name = "hi!, 1, 1";
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.name;
        item3.quality = (short) -1;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 1, 1, -1, 52" + "'", str8, "hi!, 1, 1, -1, 52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 1" + "'", str9, "hi!, 1, 1");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2570");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        item3.quality = '#';
        item3.quality = (byte) 10;
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2571");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdater8.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2572");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = '#';
        int int12 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str14 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2573");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        item3.quality = 0;
        int int8 = item3.sellIn;
        item3.quality = 0;
        int int11 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2574");
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
        com.gildedrose.ItemUpdater itemUpdater18 = conjuredItemUpdater16.update();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdater18.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater19);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2575");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.quality = (byte) 10;
        java.lang.String str8 = item3.name;
        item3.sellIn = (byte) 100;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, -1, 10, 52, 0";
        java.lang.String str14 = item3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, -1, 10, 52, 0, 100, 10" + "'", str14, "hi!, -1, 10, 52, 0, 100, 10");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2576");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (-1);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater9.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1, 0, 0" + "'", str5, ", 100, 1, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2577");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.quality = (byte) 10;
        java.lang.String str8 = item3.name;
        item3.quality = 100;
        item3.name = "hi!, 52, 97, 97, 32, -1, -1";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2578");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        item3.name = "";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str13 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ", -1, 97" + "'", str13, ", -1, 97");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2579");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.name;
        int int12 = item3.sellIn;
        java.lang.String str13 = item3.toString();
        int int14 = item3.quality;
        java.lang.String str15 = item3.toString();
        int int16 = item3.quality;
        item3.sellIn = (byte) 0;
        int int19 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 1, 10" + "'", str13, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 1, 10" + "'", str15, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2580");
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
        item3.name = "hi!, -1, 97, 10, 100";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2581");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str12 = item3.name;
        int int13 = item3.sellIn;
        int int14 = item3.quality;
        java.lang.String str15 = item3.name;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2582");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        java.lang.Class<?> wildcardClass7 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2583");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 52, 0, 100, -1", (int) (short) 0, 52);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 52, 10, 1, 10, -1, 10";
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2584");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.sellIn = (short) 0;
        item3.name = "";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2585");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str8 = item3.toString();
        int int9 = item3.quality;
        int int10 = item3.quality;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2586");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 100;
        int int9 = item3.quality;
        item3.name = "hi!, 52, 97, 52, -1, 52, 97";
        java.lang.String str12 = item3.name;
        java.lang.String str13 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 52, 97, 52, -1, 52, 97" + "'", str12, "hi!, 52, 97, 52, -1, 52, 97");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 52, 97, 52, -1, 52, 97" + "'", str13, "hi!, 52, 97, 52, -1, 52, 97");
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2587");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int6 = item3.quality;
        item3.quality = (byte) 10;
        int int9 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2588");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (-1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2589");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdater9.update();
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2590");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (-1), (int) (byte) -1);
        java.lang.String str4 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 0;
        item3.quality = (byte) 10;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 10, -1, -1" + "'", str4, "hi!, -1, 10, -1, -1");
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2591");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", 35, (int) (byte) 0);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2592");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1" + "'", str5, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2593");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        int int9 = item3.quality;
        java.lang.String str10 = item3.name;
        int int11 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater12.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2594");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        item3.name = "hi!, -1, 97";
        item3.name = "hi!, 52, 10";
        int int16 = item3.sellIn;
        int int17 = item3.sellIn;
        item3.name = "hi!, -1, 97, 0, 1, -1, 97";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2595");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.name = "hi!, 10, 0";
        item3.name = ", 100, 1, 0, 0";
        item3.sellIn = (-1);
        java.lang.String str14 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ", 100, 1, 0, 0" + "'", str14, ", 100, 1, 0, 0");
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2596");
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
        java.lang.Class<?> wildcardClass15 = itemUpdater14.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2597");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.name;
        item3.quality = (byte) 0;
        java.lang.String str7 = item3.toString();
        item3.name = "hi!, 1, 100";
        item3.sellIn = (byte) 1;
        item3.quality = 10;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 0" + "'", str7, "hi!, -1, 0");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2598");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.name = ", 10, -1";
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = ' ';
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2599");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        item3.quality = 100;
        int int11 = item3.sellIn;
        item3.quality = (short) 1;
        item3.sellIn = 'a';
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2600");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.quality;
        java.lang.Class<?> wildcardClass12 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2601");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97, 1, 0, 1, 0", (int) (byte) 100, 52);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2602");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 100, 52", 35, (int) (short) 1);
        java.lang.String str4 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater6.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1, 100, 52, 35, 1" + "'", str4, ", 100, 1, 100, 52, 35, 1");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2603");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        item3.quality = 0;
        item3.name = "hi!, 100, -1";
        item3.name = "";
        int int10 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str12 = item3.toString();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ", 100, 0" + "'", str12, ", 100, 0");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2604");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        item3.name = "hi!, -1, 0";
        item3.sellIn = (byte) 0;
        item3.name = ", 52, 97";
        item3.name = "";
        item3.sellIn = (byte) -1;
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2605");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 100, 52);
        item3.sellIn = ' ';
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.name;
        item3.quality = (byte) 10;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2606");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 97";
        int int8 = item3.quality;
        java.lang.String str9 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 100, 97" + "'", str9, ", 100, 97");
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2607");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10", (int) (short) 1, 35);
        item3.name = "hi!, -1, 97, 1, -1, 32, 97";
        java.lang.String str6 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 97, 1, -1, 32, 97" + "'", str6, "hi!, -1, 97, 1, -1, 32, 97");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2608");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "";
        item3.sellIn = 52;
        int int11 = item3.quality;
        item3.name = ", 100, 1, 10, 0";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2609");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater4.update();
        java.lang.Class<?> wildcardClass10 = itemUpdater9.getClass();
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2610");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        int int9 = item3.quality;
        java.lang.String str10 = item3.name;
        int int11 = item3.quality;
        int int12 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass14 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2611");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "";
        item3.name = ", -1, 52";
        item3.sellIn = 52;
        java.lang.Class<?> wildcardClass13 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2612");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 1, -1, 97", (-1), (int) '#');
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2613");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 0, 1", (int) (short) 10, 35);
        item3.name = "hi!, -1, 10, -1, -1";
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2614");
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
        item3.quality = '#';
        int int19 = item3.quality;
        item3.sellIn = 0;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2615");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2616");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdater9.update();
        java.lang.Class<?> wildcardClass11 = itemUpdater9.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2617");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, -1", 0, (int) (short) 0);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2618");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", 0, (int) (byte) 10);
        item3.quality = ' ';
        item3.sellIn = (short) -1;
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2619");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        int int10 = item3.sellIn;
        java.lang.String str11 = item3.name;
        java.lang.String str12 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int14 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 1, 10" + "'", str12, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2620");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        item3.name = "hi!, 100, 10";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.name;
        java.lang.String str12 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = 100;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 100, 10" + "'", str11, "hi!, 100, 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 100, 10" + "'", str12, "hi!, 100, 10");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2621");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        java.lang.String str10 = item3.name;
        item3.name = "";
        item3.quality = '4';
        java.lang.String str15 = item3.name;
        item3.quality = 52;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2622");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 1", (int) (byte) 10, 32);
        item3.name = "hi!, -1, 0, 35, 32";
        java.lang.String str6 = item3.name;
        item3.quality = (byte) 100;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 0, 35, 32" + "'", str6, "hi!, -1, 0, 35, 32");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2623");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        java.lang.String str6 = item3.name;
        item3.quality = (short) 100;
        int int9 = item3.sellIn;
        item3.name = "hi!, -1, 97";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1" + "'", str6, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2624");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 100, 52", 35, (int) (short) 1);
        java.lang.String str4 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1, 100, 52, 35, 1" + "'", str4, ", 100, 1, 100, 52, 35, 1");
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2625");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.name;
        item3.sellIn = 'a';
        int int14 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2626");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "";
        item3.sellIn = 52;
        int int11 = item3.quality;
        java.lang.String str12 = item3.name;
        int int13 = item3.sellIn;
        java.lang.Class<?> wildcardClass14 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2627");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", 52, (int) (byte) 10);
        int int4 = item3.quality;
        item3.sellIn = '#';
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2628");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 97, 97";
        item3.quality = 32;
        int int12 = item3.sellIn;
        item3.sellIn = 0;
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2629");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int11 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2630");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (int) '#', (int) (byte) 10);
        java.lang.String str4 = item3.name;
        int int5 = item3.quality;
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", -1, 52" + "'", str4, ", -1, 52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2631");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int12 = item3.quality;
        item3.name = "hi!, -1, 97, 1, -1, 32, 97";
        item3.name = ", 100, 1, 0, -1";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater17 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater18 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str19 = item3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ", 100, 1, 0, -1, 52, 10" + "'", str19, ", 100, 1, 0, -1, 52, 10");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2632");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        item3.sellIn = 0;
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2633");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) (short) 100, (int) (short) 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 10" + "'", str4, "hi!, -1, 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, 10, 100, 1" + "'", str5, "hi!, -1, 10, 100, 1");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2634");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        item3.name = "hi!, -1, 0";
        item3.sellIn = (byte) 0;
        item3.sellIn = (byte) 0;
        item3.name = "hi!, 32, 97, 32, 35";
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2635");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.name;
        item3.sellIn = (byte) 10;
        java.lang.String str15 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 10, 10" + "'", str15, "hi!, 10, 10");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2636");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.quality;
        java.lang.String str7 = item3.name;
        item3.quality = 52;
        java.lang.String str10 = item3.name;
        int int11 = item3.quality;
        java.lang.String str12 = item3.name;
        int int13 = item3.quality;
        int int14 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2637");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 1", (int) ' ', 100);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        java.lang.String str7 = item3.name;
        int int8 = item3.quality;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 1" + "'", str7, "hi!, 1, 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2638");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str9 = item3.toString();
        int int10 = item3.sellIn;
        java.lang.String str11 = item3.name;
        java.lang.Class<?> wildcardClass12 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 97" + "'", str7, "hi!, 1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 97" + "'", str9, "hi!, 1, 97");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2639");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        item3.name = "hi!, 100, 10";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.name;
        java.lang.String str12 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 1, 97";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 100, 10" + "'", str11, "hi!, 100, 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 100, 10" + "'", str12, "hi!, 100, 10");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2640");
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
        item3.name = "hi!, 52, 97, -1, 52";
        com.gildedrose.ItemUpdater itemUpdater19 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater20 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass21 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2641");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 32, 0", (int) ' ', (int) '#');
        item3.name = "hi!, 1, 32";
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2642");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10", 0, (-1));
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 100;
        java.lang.String str7 = item3.name;
        java.lang.String str8 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str7, "hi!, 52, 97, 0, 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 52, 97, 0, 10, 100, -1" + "'", str8, "hi!, 52, 97, 0, 10, 100, -1");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2643");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) (short) 100, (int) (short) 1);
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 10" + "'", str4, "hi!, -1, 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2644");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 97", (-1), (int) (short) 0);
        item3.sellIn = (-1);
        item3.quality = 100;
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2645");
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
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater18 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater19 = conjuredItemUpdater18.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(itemUpdater19);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2646");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10", 10, (int) (byte) 0);
        item3.quality = 97;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2647");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "";
        item3.name = ", -1, 52";
        item3.sellIn = 52;
        item3.name = "hi!, 52, 97, -1, 52, 10, 97";
        int int15 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2648");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        item3.name = "";
        item3.name = "hi!, 52, 97, -1, 52";
        java.lang.String str8 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater9.update();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 52, 97, -1, 52, 10, 0" + "'", str8, "hi!, 52, 97, -1, 52, 10, 0");
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2649");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.toString();
        int int13 = item3.quality;
        java.lang.String str14 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 1, 10" + "'", str12, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2650");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.name = "hi!, 10, 0";
        item3.name = ", 100, 1, 0, 0";
        item3.sellIn = (-1);
        java.lang.String str14 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ", 100, 1, 0, 0, -1, 1" + "'", str14, ", 100, 1, 0, 0, -1, 1");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2651");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10", (int) '4', (int) '4');
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2652");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.name = ", 10, -1";
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater9.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater9.update();
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2653");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10, -1, 10", 32, 52);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2654");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int11 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2655");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int12 = item3.quality;
        item3.sellIn = 32;
        item3.quality = 0;
        java.lang.Class<?> wildcardClass17 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2656");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        java.lang.String str7 = item3.name;
        int int8 = item3.sellIn;
        item3.sellIn = 'a';
        item3.sellIn = 10;
        java.lang.String str13 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ", 100, 1" + "'", str13, ", 100, 1");
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2657");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        int int4 = item3.sellIn;
        int int5 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater9.update();
        java.lang.Class<?> wildcardClass11 = itemUpdater10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2658");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        int int8 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2659");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.name;
        item3.quality = (short) 1;
        item3.sellIn = 'a';
        item3.quality = (byte) 100;
        java.lang.Class<?> wildcardClass12 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2660");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, -1, 52", (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2661");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater4.update();
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2662");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10", (int) '4', (int) '4');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdater6.update();
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2663");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater11.update();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2664");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 100;
        int int9 = item3.quality;
        int int10 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97, -1, 10";
        item3.name = ", 100, 1, 10, 0, 10, 1";
        java.lang.String str16 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ", 100, 1, 10, 0, 10, 1, 100, 97" + "'", str16, ", 100, 1, 10, 0, 10, 1, 100, 97");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2665");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        item3.sellIn = (byte) 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int7 = item3.sellIn;
        java.lang.String str8 = item3.toString();
        int int9 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 100, 97" + "'", str8, "hi!, 100, 97");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2666");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (byte) 100;
        int int9 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2667");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, -1, 1", (int) (short) 10, (int) (byte) 1);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.quality;
        int int6 = item3.quality;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2668");
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
        item3.quality = (byte) 1;
        com.gildedrose.ItemUpdater itemUpdater19 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdater19.update();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater20);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2669");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10", (int) '#', 0);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = 0;
        item3.sellIn = '#';
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2670");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 1, -1, 97, 100, 10", (int) '#', 0);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2671");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2672");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        int int10 = item3.sellIn;
        item3.sellIn = '4';
        item3.quality = 0;
        java.lang.String str15 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2673");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 0, 1", (int) ' ', (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (-1);
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97, 0, 1" + "'", str8, "hi!, -1, 97, 0, 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97, 0, 1, -1, 97" + "'", str9, "hi!, -1, 97, 0, 1, -1, 97");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2674");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.quality;
        item3.quality = (short) 0;
        java.lang.String str7 = item3.name;
        item3.name = "hi!, -1, 10, -1, 52";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2675");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, 10", (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2676");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.toString();
        int int5 = item3.sellIn;
        item3.name = "hi!, 52, 97, 52, -1";
        item3.sellIn = (short) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater10.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 10" + "'", str4, ", 100, 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2677");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int12 = item3.quality;
        item3.sellIn = (byte) 10;
        int int15 = item3.quality;
        int int16 = item3.sellIn;
        item3.name = "hi!, 52, 97, -1, 52, 10, 0";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater19 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str20 = item3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 52, 97, -1, 52, 10, 0, 10, 10" + "'", str20, "hi!, 52, 97, -1, 52, 10, 0, 10, 10");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2678");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = ", 100, 97";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2679");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        item3.quality = 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int13 = item3.quality;
        item3.quality = (short) 100;
        item3.sellIn = (short) 100;
        item3.quality = (byte) 0;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2680");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 1", 0, 10);
        item3.name = "hi!, 10, 0";
        item3.name = ", 100, 1, 10, 52";
        int int8 = item3.quality;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2681");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2682");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 1;
        int int13 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater14.update();
        com.gildedrose.ItemUpdater itemUpdater16 = conjuredItemUpdater14.update();
        java.lang.Class<?> wildcardClass17 = conjuredItemUpdater14.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2683");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int6 = item3.quality;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (byte) 100;
        java.lang.String str11 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = ", 100, 1, 100, 52, 97, -1";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 10, 0" + "'", str7, ", 100, 1, 10, 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", 100, 1, 100, 0" + "'", str11, ", 100, 1, 100, 0");
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2684");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        item3.sellIn = 100;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2685");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 10, 0", (int) (byte) 100, (int) (short) 1);
        item3.sellIn = 10;
        java.lang.String str6 = item3.toString();
        int int7 = item3.sellIn;
        item3.sellIn = 32;
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1, 10, 0, 10, 1" + "'", str6, ", 100, 1, 10, 0, 10, 1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2686");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.sellIn = (short) 0;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (short) 10;
        item3.sellIn = (byte) 10;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 0, 0" + "'", str7, ", 100, 1, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2687");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.quality;
        int int8 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97, -1, 52, 10, 97, 100, 10";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int13 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1, 0, 0" + "'", str5, ", 100, 1, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2688");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        java.lang.String str11 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = 1;
        item3.name = ", 100, 1, 100, 52, 97, -1";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2689");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52, 1, 97", 100, (int) (short) 100);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2690");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        item3.name = "hi!, -1, 97, 100, 0";
        item3.sellIn = 97;
        int int10 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2691");
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
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater17 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str18 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 1, 10, -1, 35" + "'", str14, "hi!, 1, 10, -1, 35");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ", -1, 1" + "'", str18, ", -1, 1");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2692");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10", (int) (short) 1, 35);
        java.lang.String str4 = item3.toString();
        java.lang.String str5 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 10, 1, 35" + "'", str4, "hi!, 100, 10, 1, 35");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 100, 10" + "'", str5, "hi!, 100, 10");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2693");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) -1;
        item3.name = "hi!, 52, 97, 35, 52";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2694");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 100", 10, (int) '#');
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2695");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int6 = item3.quality;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (byte) 100;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str12 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 10, 0" + "'", str7, ", 100, 1, 10, 0");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ", 100, 1" + "'", str12, ", 100, 1");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2696");
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
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2697");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str7 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 32, 97" + "'", str7, "hi!, 32, 97");
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2698");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) (short) 100, 97);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 0" + "'", str4, "hi!, -1, 0");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2699");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52, -1, 97", (int) ' ', (int) (byte) -1);
        item3.quality = 52;
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2700");
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
        com.gildedrose.ItemUpdater itemUpdater19 = conjuredItemUpdater18.update();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater19);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2701");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = 97;
        item3.sellIn = (byte) 10;
        java.lang.String str16 = item3.name;
        int int17 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2702");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 10, -1", 97, 32);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2703");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        java.lang.String str7 = item3.name;
        int int8 = item3.sellIn;
        item3.sellIn = 'a';
        item3.sellIn = 10;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdater13.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2704");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10, 1, 10, 10, -1", (int) (short) 0, (int) (short) 10);
        item3.quality = (short) 100;
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2705");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        java.lang.String str10 = item3.toString();
        java.lang.String str11 = item3.name;
        item3.quality = 35;
        java.lang.String str14 = item3.name;
        int int15 = item3.sellIn;
        item3.quality = 32;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", -1, 52, -1, 97" + "'", str10, ", -1, 52, -1, 97");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", -1, 52" + "'", str11, ", -1, 52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ", -1, 52" + "'", str14, ", -1, 52");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2706");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater5.update();
        java.lang.Class<?> wildcardClass11 = conjuredItemUpdater5.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2707");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        int int8 = item3.quality;
        item3.name = "hi!, 52, 10";
        java.lang.String str11 = item3.name;
        item3.sellIn = (-1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 52, 10" + "'", str11, "hi!, 52, 10");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2708");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.sellIn = (short) 0;
        item3.sellIn = ' ';
        item3.sellIn = (byte) 0;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2709");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        item3.name = "hi!, 52, 97, 97, 32, -1, 97";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2710");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        item3.sellIn = 10;
        item3.sellIn = (short) 0;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) -1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater17 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater18 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 97;
        int int21 = item3.quality;
        item3.quality = (byte) -1;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2711");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str5 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int7 = item3.sellIn;
        int int8 = item3.sellIn;
        java.lang.String str9 = item3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2712");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.toString();
        item3.name = "hi!, 10, 0";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 10" + "'", str11, "hi!, -1, 10");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2713");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 100, 52", 35, (int) (short) 1);
        java.lang.String str4 = item3.toString();
        item3.quality = 'a';
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.name;
        item3.name = "hi!, -1, 1, 97, 0";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1, 100, 52, 35, 1" + "'", str4, ", 100, 1, 100, 52, 35, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 100, 52, 35, 97" + "'", str7, ", 100, 1, 100, 52, 35, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 100, 1, 100, 52" + "'", str8, ", 100, 1, 100, 52");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2714");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        int int7 = item3.sellIn;
        int int8 = item3.quality;
        item3.sellIn = 0;
        item3.quality = 32;
        int int13 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str15 = item3.name;
        java.lang.String str16 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ", 100, 1" + "'", str15, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ", 100, 1" + "'", str16, ", 100, 1");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2715");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10", 1, (int) (short) 0);
        item3.name = "";
        java.lang.String str6 = item3.name;
        int int7 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2716");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str10 = item3.name;
        item3.name = ", 100, 10, -1, 97";
        int int13 = item3.sellIn;
        int int14 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2717");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1", (int) (byte) 0, 35);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2718");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", (int) (byte) -1, (int) (short) 1);
        item3.name = "hi!, -1, 0";
        item3.name = "hi!, 52, 97, -1, 52, 10, 97";
        item3.name = "hi!, 1, 1, -1, 97, 100, 10";
        int int10 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2719");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.toString();
        int int5 = item3.sellIn;
        item3.name = "hi!, 52, 97, 52, -1";
        item3.sellIn = (short) 10;
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 10" + "'", str4, ", 100, 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2720");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.quality = '4';
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (byte) 0;
        int int11 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2721");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10, -1, 97", (int) (short) 100, 10);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 0;
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2722");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int14 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2723");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int9 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int11 = item3.sellIn;
        int int12 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2724");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str9 = item3.toString();
        int int10 = item3.sellIn;
        item3.name = "hi!, 52, 97, 97, 32";
        item3.quality = 0;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 97" + "'", str7, "hi!, 1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 97" + "'", str9, "hi!, 1, 97");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2725");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int6 = item3.quality;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (byte) 100;
        java.lang.String str11 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (byte) 1;
        java.lang.String str15 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 10, 0" + "'", str7, ", 100, 1, 10, 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", 100, 1, 100, 0" + "'", str11, ", 100, 1, 100, 0");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ", 100, 1" + "'", str15, ", 100, 1");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2726");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", 0, 0);
        java.lang.String str4 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (short) 1;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", -1, 97, 0, 0" + "'", str4, ", -1, 97, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2727");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", (int) (byte) -1, (int) 'a');
        item3.name = ", 10, -1";
        item3.quality = 1;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass9 = itemUpdater8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2728");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.quality;
        java.lang.String str7 = item3.name;
        item3.quality = 52;
        java.lang.String str10 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 0";
        item3.sellIn = (-1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 1, 52" + "'", str10, "hi!, 1, 52");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2729");
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
        com.gildedrose.ItemUpdater itemUpdater17 = conjuredItemUpdater16.update();
        com.gildedrose.ItemUpdater itemUpdater18 = conjuredItemUpdater16.update();
        java.lang.Class<?> wildcardClass19 = conjuredItemUpdater16.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2730");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, 0, 0, 10", 0, 1);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2731");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (short) -1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2732");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int8 = item3.sellIn;
        int int9 = item3.quality;
        int int10 = item3.sellIn;
        java.lang.String str11 = item3.toString();
        int int12 = item3.sellIn;
        item3.sellIn = 0;
        item3.quality = (short) 1;
        int int17 = item3.quality;
        item3.quality = (byte) 0;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 97" + "'", str11, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2733");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        item3.name = ", 100, 1, 0, 0";
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2734");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.name;
        item3.name = "hi!, -1, 97, 1, -1";
        item3.sellIn = (short) -1;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2735");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 97", (int) '#', (int) (byte) 100);
        int int4 = item3.sellIn;
        item3.name = "";
        item3.name = "hi!, 52, 97, -1, 10, 100, 97";
        item3.name = "hi!, 1, 1, -1, 97, 100, 10";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2736");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.name;
        item3.name = "hi!, -1, 97, 1, -1";
        int int7 = item3.sellIn;
        item3.quality = (byte) -1;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2737");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        int int8 = item3.quality;
        item3.name = "hi!, -1, 0, 100, 97";
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2738");
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
        item3.name = "hi!, 52, 97, -1, 52";
        java.lang.String str19 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater20 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater21 = conjuredItemUpdater20.update();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str19, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertNotNull(itemUpdater21);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2739");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        int int4 = item3.sellIn;
        int int5 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, -1, 97, 1, -1";
        java.lang.Class<?> wildcardClass11 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2740");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 32, 10", (-1), (int) (byte) -1);
        item3.quality = 'a';
        int int6 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2741");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        item3.quality = (byte) -1;
        item3.name = "hi!, 52, 97";
        item3.name = "hi!";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater17 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int18 = item3.quality;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2742");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        item3.sellIn = 'a';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.name;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2743");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str6 = item3.toString();
        item3.quality = (short) 10;
        int int9 = item3.sellIn;
        item3.sellIn = 52;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 32, 97" + "'", str6, "hi!, 32, 97");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2744");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", 35, (int) (short) 1);
        int int4 = item3.sellIn;
        item3.sellIn = 100;
        int int7 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2745");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10, 100, 100", 1, 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2746");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10, -1, 97", (int) (short) 100, 10);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 100;
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2747");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!, -1, 97";
        int int6 = item3.quality;
        int int7 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2748");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 100;
        item3.sellIn = 0;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2749");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 97, 10", (int) (short) 1, (-1));
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, 0, 97, 10, 1, -1" + "'", str4, "hi!, 10, 0, 97, 10, 1, -1");
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2750");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 1, 100", 10, (int) ' ');
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2751");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.quality = '#';
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = ", -1, 97, 10, 97";
        java.lang.String str13 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ", -1, 97, 10, 97, -1, 35" + "'", str13, ", -1, 97, 10, 97, -1, 35");
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2752");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        item3.quality = (byte) 1;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 10, -1, 97" + "'", str4, ", 100, 10, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2753");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int11 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2754");
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
        item3.quality = 0;
        item3.sellIn = '#';
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2755");
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
        java.lang.String str17 = item3.name;
        java.lang.String str18 = item3.toString();
        java.lang.String str19 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 1, 97" + "'", str18, "hi!, 1, 97");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 1, 97" + "'", str19, "hi!, 1, 97");
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2756");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        item3.sellIn = 'a';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        item3.name = "hi!, 52, 97, -1, 52, 10, 97, -1, 0, 10, 0";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 97, 97" + "'", str9, "hi!, 97, 97");
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2757");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10, 10, 10", (int) '#', (int) (short) 0);
        item3.name = "hi!, -1, 97";
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2758");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.quality = 32;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater10.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 97" + "'", str7, "hi!, 1, 97");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2759");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10, 1, 10, 10, -1", (int) '4', 100);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2760");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 100, (int) (short) 1);
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        item3.sellIn = (-1);
        item3.sellIn = (byte) 100;
        item3.name = ", 100, 1, 100, 0, 0, 35";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2761");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2762");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.toString();
        item3.quality = (short) -1;
        int int7 = item3.sellIn;
        int int8 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 10" + "'", str4, ", 100, 10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2763");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        int int10 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdater12.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2764");
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
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater18 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str19 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2765");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = '#';
        int int12 = item3.sellIn;
        item3.name = "hi!, -1, 97, 1, -1, 32, 97, 1, 35";
        java.lang.String str15 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, -1, 97, 1, -1, 32, 97, 1, 35" + "'", str15, "hi!, -1, 97, 1, -1, 32, 97, 1, 35");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2766");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52", (int) (byte) 10, (int) 'a');
        java.lang.String str4 = item3.toString();
        java.lang.String str5 = item3.name;
        item3.name = "hi!, 100, -1";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 97, -1, 52, 10, 97" + "'", str4, "hi!, 52, 97, -1, 52, 10, 97");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str5, "hi!, 52, 97, -1, 52");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2767");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.name;
        item3.quality = (short) 1;
        item3.sellIn = (short) -1;
        java.lang.String str14 = item3.toString();
        item3.name = "hi!, 35, -1";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, -1, 1" + "'", str14, "hi!, -1, 1");
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2768");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (byte) 1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2769");
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
        item3.sellIn = (-1);
        java.lang.String str20 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2770");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 0, 1, 10, 35", 32, 32);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2771");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 97, 32", (int) (short) 1, (int) (byte) -1);
        item3.sellIn = (byte) -1;
        int int6 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2772");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 100, 100", (int) (byte) 0, (int) '4');
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2773");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", (int) (byte) 1, (int) (byte) 0);
        item3.quality = (short) 0;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", -1, 97, 1, 0" + "'", str7, ", -1, 97, 1, 0");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2774");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int9 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int11 = item3.quality;
        java.lang.String str12 = item3.name;
        java.lang.String str13 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 52, 97" + "'", str12, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 52, 97" + "'", str13, "hi!, 52, 97");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2775");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2776");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10", (int) '#', 0);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 10" + "'", str7, "hi!, 1, 10");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2777");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        item3.quality = 0;
        item3.name = "hi!, 100, -1";
        item3.name = "";
        int int10 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater11.update();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2778");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 10, 100);
        int int4 = item3.quality;
        item3.sellIn = 35;
        java.lang.String str7 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater8.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2779");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str8 = item3.toString();
        item3.sellIn = (short) 100;
        java.lang.String str11 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = 35;
        java.lang.Class<?> wildcardClass15 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 10, -1" + "'", str8, ", 10, -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2780");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        item3.quality = 97;
        int int7 = item3.sellIn;
        int int8 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2781");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, 100", (int) (byte) 100, 10);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2782");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) -1, (int) (byte) 10);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = 'a';
        int int7 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2783");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        item3.quality = 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int13 = item3.quality;
        item3.quality = (short) 100;
        item3.name = "hi!, 100, 97, 100, 1";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2784");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (int) (byte) 10, (-1));
        int int4 = item3.sellIn;
        item3.quality = (short) -1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater7.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2785");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (-1), 1);
        java.lang.String str4 = item3.name;
        item3.quality = 0;
        item3.name = "hi!, -1, 1, 100, 97";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", -1, 52" + "'", str4, ", -1, 52");
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2786");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", (int) (byte) -1, (int) 'a');
        item3.name = "hi!, 10, 0";
        item3.name = "hi!, -1, 97";
        java.lang.String str8 = item3.name;
        int int9 = item3.sellIn;
        int int10 = item3.quality;
        java.lang.String str11 = item3.name;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 97" + "'", str11, "hi!, -1, 97");
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2787");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.sellIn = (short) 0;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int8 = item3.quality;
        item3.quality = (short) 100;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2788");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10, 1, 0", (int) (short) 10, (int) '4');
        int int4 = item3.quality;
        java.lang.String str5 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 52, 97, 0, 10, 1, 0" + "'", str5, "hi!, 52, 97, 0, 10, 1, 0");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2789");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.name;
        item3.name = "hi!, -1, 97, 1, -1";
        int int7 = item3.sellIn;
        java.lang.String str8 = item3.name;
        int int9 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass11 = itemUpdater10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97, 1, -1" + "'", str8, "hi!, -1, 97, 1, -1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2790");
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
        com.gildedrose.ItemUpdater itemUpdater16 = conjuredItemUpdater14.update();
        com.gildedrose.ItemUpdater itemUpdater17 = conjuredItemUpdater14.update();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdater17.update();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater18);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2791");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "";
        java.lang.String str9 = item3.toString();
        item3.name = ", 10, -1, -1, 1";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", -1, 97" + "'", str9, ", -1, 97");
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2792");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 100, 1", (int) (byte) -1, (int) '#');
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2793");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int14 = item3.quality;
        int int15 = item3.quality;
        item3.name = "hi!, 100, 35";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2794");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = '#';
        item3.name = "hi!, 52, 97, 97, 32";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass11 = conjuredItemUpdater10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2795");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2796");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 97, 100, 0", (int) 'a', 100);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2797");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater6.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2798");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.name;
        item3.quality = (byte) 0;
        java.lang.String str7 = item3.toString();
        int int8 = item3.sellIn;
        int int9 = item3.quality;
        item3.quality = (-1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 0" + "'", str7, "hi!, -1, 0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2799");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 1, (-1));
        java.lang.String str4 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 100, 10, 100, 32";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97, 1, -1" + "'", str4, "hi!, -1, 97, 1, -1");
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2800");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.toString();
        item3.name = "hi!";
        item3.quality = (short) -1;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 10" + "'", str11, "hi!, -1, 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, -1, 10" + "'", str12, "hi!, -1, 10");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2801");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10, 1, 35", (int) '#', (int) (byte) -1);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2802");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 10, 100, 97", 0, 0);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2803");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int12 = item3.quality;
        item3.name = "hi!, -1, 97, 1, -1, 32, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater16 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int17 = item3.quality;
        item3.sellIn = (-1);
        com.gildedrose.ItemUpdater itemUpdater20 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(itemUpdater20);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2804");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 32, 0", (int) (byte) 10, (int) '#');
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2805");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        item3.name = "hi!, -1, 97";
        item3.quality = (short) 10;
        java.lang.String str16 = item3.toString();
        item3.sellIn = (byte) 0;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, -1, 97, 1, 10" + "'", str16, "hi!, -1, 97, 1, 10");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2806");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        item3.sellIn = ' ';
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2807");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.toString();
        int int12 = item3.quality;
        java.lang.String str13 = item3.toString();
        item3.sellIn = 32;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 10" + "'", str11, "hi!, -1, 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, -1, 10" + "'", str13, "hi!, -1, 10");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2808");
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
        com.gildedrose.ItemUpdater itemUpdater16 = conjuredItemUpdater15.update();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2809");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 0, -1, 97", 32, 97);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2810");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.quality = 1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdater12.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2811");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.quality;
        java.lang.String str7 = item3.name;
        item3.quality = 52;
        java.lang.String str10 = item3.toString();
        item3.name = ", -1, 97, 1, 0";
        item3.sellIn = (-1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 1, 52" + "'", str10, "hi!, 1, 52");
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2812");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        int int6 = item3.sellIn;
        int int7 = item3.sellIn;
        item3.sellIn = (short) 1;
        int int10 = item3.sellIn;
        int int11 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2813");
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
        item3.quality = (short) 0;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2814");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97, 10, 97", (int) (byte) 0, (int) ' ');
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        item3.sellIn = (short) -1;
        java.lang.String str8 = item3.name;
        int int9 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", -1, 97, 10, 97" + "'", str4, ", -1, 97, 10, 97");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", -1, 97, 10, 97" + "'", str5, ", -1, 97, 10, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", -1, 97, 10, 97" + "'", str8, ", -1, 97, 10, 97");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2815");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 0, 10, -1", 52, 52);
        item3.name = "hi!, -1, 0, 1, 100";
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2816");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52, 10, 97, -1, 0", (int) '4', (int) '4');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2817");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater6.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2818");
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
        item3.name = "hi!, -1, 97, 1, -1, -1, 1";
        item3.name = "hi!, -1, 10, 52, 10, -1, 100";
        item3.name = ", -1, -1";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2819");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = ' ';
        item3.name = "hi!, -1, 97, 1, -1";
        java.lang.String str11 = item3.toString();
        int int12 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater14.update();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdater15.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 97, 1, -1, 32, 97" + "'", str11, "hi!, -1, 97, 1, -1, 32, 97");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2820");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        int int9 = item3.quality;
        item3.name = "hi!";
        java.lang.String str12 = item3.name;
        int int13 = item3.quality;
        item3.sellIn = '4';
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2821");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        java.lang.String str9 = item3.toString();
        java.lang.String str10 = item3.name;
        item3.name = "hi!, 1, 1, -1, 97";
        item3.quality = (byte) 0;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", -1, 97" + "'", str9, ", -1, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2822");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (int) '#', (int) (byte) 10);
        int int4 = item3.sellIn;
        item3.sellIn = 1;
        int int7 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2823");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str8 = item3.toString();
        int int9 = item3.quality;
        item3.name = "hi!, 100, 97, 100, 0";
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2824");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 97, 32, 100", 32, (int) '#');
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2825");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        java.lang.String str10 = item3.toString();
        item3.name = "hi!, -1, 97, 1, -1";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int14 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", -1, 52, -1, 97" + "'", str10, ", -1, 52, -1, 97");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2826");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 1, 100", 0, (int) '4');
        item3.sellIn = 35;
        int int6 = item3.quality;
        java.lang.Class<?> wildcardClass7 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2827");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, 0", (int) (short) 10, (int) (short) 0);
        java.lang.String str4 = item3.toString();
        item3.quality = 35;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1, 0, 0, 10, 0" + "'", str4, ", 100, 1, 0, 0, 10, 0");
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2828");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        item3.sellIn = (byte) 100;
        java.lang.String str6 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int8 = item3.quality;
        item3.name = "";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 100, 97" + "'", str6, "hi!, 100, 97");
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2829");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, -1", (int) (short) 10, 10);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2830");
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
        item3.sellIn = 32;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2831");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", 0, (int) '#');
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2832");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, -1", 1, 0);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2833");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.name;
        int int10 = item3.sellIn;
        int int11 = item3.quality;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2834");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.sellIn = 1;
        java.lang.String str6 = item3.name;
        int int7 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2835");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int8 = item3.sellIn;
        int int9 = item3.quality;
        int int10 = item3.sellIn;
        item3.quality = (byte) 0;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2836");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater6.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2837");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10", 0, (-1));
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 52, 97, 0, 10, 0, -1" + "'", str5, "hi!, 52, 97, 0, 10, 0, -1");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2838");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        int int9 = item3.quality;
        java.lang.String str10 = item3.name;
        int int11 = item3.quality;
        item3.sellIn = 100;
        int int14 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater15 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int16 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2839");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10", 1, (int) (short) 0);
        item3.name = "";
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2840");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = ' ';
        item3.name = "hi!, -1, 97, 1, -1";
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.toString();
        item3.sellIn = (short) 1;
        int int15 = item3.sellIn;
        item3.sellIn = (short) 100;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 97, 1, -1, 32, 97" + "'", str11, "hi!, -1, 97, 1, -1, 32, 97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, -1, 97, 1, -1, 32, 97" + "'", str12, "hi!, -1, 97, 1, -1, 32, 97");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2841");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 97" + "'", str7, "hi!, 1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2842");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.quality = '#';
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater10.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2843");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 97", (int) (byte) 100, 0);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.quality;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2844");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = 0;
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2845");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str6 = item3.toString();
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str10 = item3.toString();
        item3.name = "hi!, -1, 0, 97, 100";
        int int13 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 32, 97" + "'", str6, "hi!, 32, 97");
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 32, 10" + "'", str10, "hi!, 32, 10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2846");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 1, -1, 97", 32, 35);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2847");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.name;
        java.lang.Class<?> wildcardClass12 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2848");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.name = ", 100, 10";
        item3.quality = (short) 0;
        java.lang.String str9 = item3.toString();
        item3.sellIn = 0;
        java.lang.String str12 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 100, 10, 10, 0" + "'", str9, ", 100, 10, 10, 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ", 100, 10" + "'", str12, ", 100, 10");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2849");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", (int) (byte) -1, (int) 'a');
        item3.name = "hi!, 10, 0";
        item3.name = "hi!, -1, 97";
        java.lang.String str8 = item3.name;
        int int9 = item3.sellIn;
        int int10 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str12 = item3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, -1, 97, -1, 97" + "'", str12, "hi!, -1, 97, -1, 97");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2850");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        int int9 = item3.quality;
        item3.name = "hi!";
        java.lang.String str12 = item3.name;
        int int13 = item3.quality;
        int int14 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2851");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        item3.sellIn = 10;
        item3.name = "hi!, 52, 97, -1, 52";
        java.lang.String str14 = item3.toString();
        item3.quality = (byte) 0;
        int int17 = item3.sellIn;
        item3.name = ", 100, 1, 1, 97";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 52, 97, -1, 52, 10, 10" + "'", str14, "hi!, 52, 97, -1, 52, 10, 10");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2852");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = '#';
        item3.name = "hi!, 52, 97, 97, 32";
        item3.quality = (short) 1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2853");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdater12.update();
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2854");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 0, 1", (int) (short) 10, (int) '#');
        java.lang.String str4 = item3.toString();
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97, 0, 1, 10, 35" + "'", str4, "hi!, -1, 97, 0, 1, 10, 35");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, 97, 0, 1, 10, 35" + "'", str5, "hi!, -1, 97, 0, 1, 10, 35");
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2855");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (byte) 10;
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        item3.name = "";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 10" + "'", str9, "hi!, -1, 10");
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2856");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", 10, (int) '4');
        int int4 = item3.quality;
        int int5 = item3.quality;
        item3.sellIn = 35;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2857");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 10, -1, 10", (int) '4', 97);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2858");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = ' ';
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str14 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater15 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 1, 32" + "'", str14, "hi!, 1, 32");
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2859");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int13 = item3.sellIn;
        int int14 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2860");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int12 = item3.quality;
        item3.sellIn = (byte) 10;
        item3.sellIn = (byte) 10;
        java.lang.String str17 = item3.name;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2861");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 97, 100, 0", (int) '#', (int) (short) 0);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2862");
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
        com.gildedrose.ItemUpdater itemUpdater18 = conjuredItemUpdater16.update();
        com.gildedrose.ItemUpdater itemUpdater19 = conjuredItemUpdater16.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater19);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2863");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.name = "hi!, 10, 0";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass11 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2864");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) 0, (int) '#');
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2865");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int6 = item3.quality;
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2866");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        item3.sellIn = (-1);
        item3.name = "hi!, 10, 10";
        item3.sellIn = (short) 1;
        item3.sellIn = 10;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2867");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, -1", (int) '#', (int) (short) -1);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2868");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 97, 0", (int) (short) 100, (-1));
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2869");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.sellIn = (short) 0;
        java.lang.String str7 = item3.toString();
        item3.name = "hi!, 52, 97, 1, 100";
        item3.name = "hi!, -1, 97, 1, -1, 32, 97";
        int int12 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 0, 0" + "'", str7, ", 100, 1, 0, 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2870");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.toString();
        java.lang.String str13 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 10" + "'", str11, "hi!, -1, 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, -1, 10" + "'", str12, "hi!, -1, 10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, -1, 10" + "'", str13, "hi!, -1, 10");
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2871");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        int int9 = item3.quality;
        item3.name = "hi!";
        java.lang.String str12 = item3.name;
        item3.name = ", 97, 35";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2872");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str9 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int12 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2873");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.quality = '4';
        item3.name = "hi!, 1, 1";
        item3.quality = (short) 10;
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2874");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 97", (int) (byte) 100, 1);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2875");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 97, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int11 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2876");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10", (int) '#', 0);
        item3.quality = 97;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str9 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10, 35, 97" + "'", str9, "hi!, 1, 10, 35, 97");
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2877");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, -1", (int) '4', (int) '#');
        item3.quality = 0;
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2878");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 97, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater10.update();
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2879");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 1", (int) 'a', (int) (short) 100);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        item3.quality = 52;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 97, 1" + "'", str5, "hi!, 97, 1");
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2880");
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
        item3.sellIn = (byte) 10;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2881");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2882");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, 0", (int) (short) 10, (int) (short) 0);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2883");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        item3.sellIn = (short) 100;
        java.lang.String str13 = item3.name;
        item3.name = ", -1, 52, -1, 97";
        int int16 = item3.quality;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2884");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 52, 97, -1, -1", (int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2885");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        item3.sellIn = 'a';
        int int8 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2886");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str6 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int8 = item3.quality;
        java.lang.String str9 = item3.toString();
        java.lang.String str10 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 97" + "'", str6, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, -1, 97" + "'", str10, "hi!, -1, 97");
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2887");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1, 32, 97", (int) (byte) 100, (int) (short) 1);
        item3.name = "";
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2888");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 52, 0", (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2889");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        item3.name = "hi!";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2890");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater5.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2891");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 0, 1", (int) (short) 0, (int) (byte) 10);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdater4.update();
        java.lang.Class<?> wildcardClass6 = itemUpdater5.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2892");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int8 = item3.sellIn;
        int int9 = item3.quality;
        int int10 = item3.sellIn;
        item3.quality = '4';
        int int13 = item3.sellIn;
        item3.quality = (short) 100;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2893");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        item3.sellIn = 10;
        item3.sellIn = (short) 0;
        item3.quality = '4';
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2894");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str9 = item3.toString();
        int int10 = item3.sellIn;
        java.lang.String str11 = item3.name;
        item3.name = ", -1, 97, 1, 0";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 97" + "'", str7, "hi!, 1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 97" + "'", str9, "hi!, 1, 97");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2895");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 1, 10, 0", (int) (byte) 1, 100);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2896");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", 97, (int) (short) 1);
        item3.name = ", 100, 1";
        java.lang.String str6 = item3.name;
        item3.name = "hi!, -1, 10";
        item3.sellIn = (short) 10;
        item3.quality = 35;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1" + "'", str6, ", 100, 1");
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2897");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 52, 0", 35, 0);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2898");
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
        java.lang.Class<?> wildcardClass23 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 52, 97, 52, -1" + "'", str15, "hi!, 52, 97, 52, -1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2899");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        java.lang.String str7 = item3.name;
        int int8 = item3.sellIn;
        item3.sellIn = 'a';
        item3.sellIn = 10;
        item3.sellIn = 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2900");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        item3.sellIn = 10;
        item3.sellIn = (short) 0;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater14.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2901");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.name;
        int int12 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2902");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int12 = item3.quality;
        item3.name = "hi!, -1, 97, 1, -1, 32, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater16 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int17 = item3.quality;
        item3.sellIn = (-1);
        java.lang.String str20 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater21 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, -1, 97, 1, -1, 32, 97, -1, 10" + "'", str20, "hi!, -1, 97, 1, -1, 32, 97, -1, 10");
        org.junit.Assert.assertNotNull(itemUpdater21);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2903");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 52, 0", (int) ' ', (-1));
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2904");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int8 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass10 = conjuredItemUpdater9.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2905");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        java.lang.String str7 = item3.name;
        int int8 = item3.sellIn;
        item3.sellIn = 'a';
        item3.sellIn = 10;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int14 = item3.quality;
        item3.sellIn = 1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2906");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        item3.name = "";
        int int8 = item3.quality;
        int int9 = item3.quality;
        int int10 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2907");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 0, 1", (int) ' ', (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (-1);
        java.lang.String str8 = item3.name;
        java.lang.Class<?> wildcardClass9 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97, 0, 1" + "'", str8, "hi!, -1, 97, 0, 1");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2908");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.quality;
        item3.quality = 100;
        item3.name = "hi!, -1, 10, 52, 0";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int10 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdater11.update();
        java.lang.Class<?> wildcardClass14 = itemUpdater13.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2909");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int12 = item3.quality;
        item3.name = "hi!, -1, 97, 1, -1, 32, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater16 = conjuredItemUpdater15.update();
        java.lang.Class<?> wildcardClass17 = itemUpdater16.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2910");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", 0, (int) (short) 1);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str5 = item3.toString();
        int int6 = item3.quality;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", -1, 97, 0, 1" + "'", str5, ", -1, 97, 0, 1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2911");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        item3.sellIn = (-1);
        int int12 = item3.quality;
        java.lang.String str13 = item3.toString();
        java.lang.Class<?> wildcardClass14 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, -1, 10" + "'", str13, "hi!, -1, 10");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2912");
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
        item3.quality = ' ';
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2913");
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
        item3.sellIn = 1;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2914");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.name = "hi!, -1, 0, 35, 32";
        java.lang.String str10 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, -1, 0, 35, 32" + "'", str10, "hi!, -1, 0, 35, 32");
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2915");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 35", 52, (int) (byte) 100);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2916");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.quality;
        java.lang.String str7 = item3.name;
        item3.quality = 52;
        java.lang.String str10 = item3.name;
        int int11 = item3.quality;
        java.lang.String str12 = item3.name;
        java.lang.String str13 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 1, 52" + "'", str13, "hi!, 1, 52");
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2917");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", (int) (short) 1, 32);
        java.lang.String str4 = item3.name;
        item3.name = ", 100, 1, 0, 0";
        java.lang.String str7 = item3.name;
        item3.sellIn = (byte) 1;
        java.lang.String str10 = item3.name;
        java.lang.String str11 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 97" + "'", str4, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 0, 0" + "'", str7, ", 100, 1, 0, 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", 100, 1, 0, 0" + "'", str10, ", 100, 1, 0, 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", 100, 1, 0, 0, 1, 32" + "'", str11, ", 100, 1, 0, 0, 1, 32");
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2918");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 0", (int) (byte) 100, 100);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2919");
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
        item3.quality = 35;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2920");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2921");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = '#';
        item3.name = "hi!, 1, 10";
        int int14 = item3.quality;
        java.lang.Class<?> wildcardClass15 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2922");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, -1, 1", (int) (short) 10, (int) (byte) 1);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2923");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        item3.sellIn = 1;
        item3.quality = 0;
        int int12 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2924");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52, 10, 97", 52, (int) (short) 10);
        java.lang.String str4 = item3.toString();
        item3.sellIn = (byte) 100;
        int int7 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 97, -1, 52, 10, 97, 52, 10" + "'", str4, "hi!, 52, 97, -1, 52, 10, 97, 52, 10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2925");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (short) -1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdater11.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2926");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str10 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        java.lang.Class<?> wildcardClass13 = conjuredItemUpdater11.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2927");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int13 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str15 = item3.toString();
        java.lang.String str16 = item3.name;
        int int17 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 1, 10" + "'", str15, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2928");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1, 0, 0" + "'", str5, ", 100, 1, 0, 0");
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2929");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.sellIn;
        item3.name = ", 100, 10";
        int int7 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2930");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", (int) (byte) 10, 97);
        java.lang.String str4 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str8 = item3.name;
        item3.quality = '#';
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", -1, 97, 10, 97" + "'", str4, ", -1, 97, 10, 97");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", -1, 97" + "'", str8, ", -1, 97");
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2931");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97, 1, 0, 1, 0", 100, (int) (short) -1);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2932");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10, -1, 100", (int) ' ', (int) (short) -1);
        item3.name = ", 100, -1";
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2933");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 10, 0", 0, (int) (short) 0);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2934");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 32", (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2935");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) 100);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 10, 100" + "'", str4, ", 10, 100");
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2936");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.quality = 0;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2937");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.sellIn;
        int int11 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = 100;
        item3.quality = (short) 1;
        item3.quality = 52;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2938");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        item3.name = "hi!, -1, 97";
        item3.quality = (short) 10;
        java.lang.String str16 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater17 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str18 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater19 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, -1, 97, 1, 10" + "'", str16, "hi!, -1, 97, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, -1, 97, 1, 10" + "'", str18, "hi!, -1, 97, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater19);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2939");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        item3.quality = (byte) -1;
        item3.name = "hi!, 52, 97";
        java.lang.String str15 = item3.toString();
        int int16 = item3.sellIn;
        item3.name = "";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 52, 97, 52, -1" + "'", str15, "hi!, 52, 97, 52, -1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2940");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        item3.quality = 97;
        int int7 = item3.sellIn;
        item3.quality = 32;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2941");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.quality = (byte) -1;
        int int10 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2942");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", (int) (byte) -1, (int) 'a');
        item3.name = "hi!, 10, 0";
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 10, 0" + "'", str6, "hi!, 10, 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 10, 0" + "'", str7, "hi!, 10, 0");
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2943");
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
        java.lang.String str15 = item3.name;
        java.lang.String str16 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2944");
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
        int int23 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater24 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str17, "hi!, 52, 97, 0, 10");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(itemUpdater24);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2945");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) (short) -1, 0);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 0, -1, 0" + "'", str4, "hi!, -1, 0, -1, 0");
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2946");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        java.lang.String str6 = item3.name;
        int int7 = item3.quality;
        java.lang.String str8 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass10 = itemUpdater9.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2947");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        item3.quality = 0;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str7 = item3.name;
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2948");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10, 1, 10, 10, -1", (int) (short) 0, (int) (short) 10);
        item3.sellIn = 97;
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2949");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = 0;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str12 = item3.name;
        java.lang.Class<?> wildcardClass13 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2950");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        item3.name = "hi!, -1, 0";
        item3.sellIn = (byte) 0;
        item3.name = ", 52, 97";
        item3.name = "";
        item3.quality = (byte) 1;
        java.lang.String str14 = item3.toString();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ", 0, 1" + "'", str14, ", 0, 1");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2951");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.quality = '#';
        int int10 = item3.sellIn;
        item3.name = "hi!, 52, 97";
        java.lang.String str13 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 52, 97, -1, 35" + "'", str13, "hi!, 52, 97, -1, 35");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2952");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        item3.quality = 100;
        int int11 = item3.sellIn;
        int int12 = item3.sellIn;
        java.lang.String str13 = item3.toString();
        item3.quality = (-1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 1, 100" + "'", str13, "hi!, 1, 100");
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2953");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str6 = item3.toString();
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass10 = itemUpdater9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 32, 97" + "'", str6, "hi!, 32, 97");
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2954");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int8 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, -1, 0, 0, 10";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2955");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int12 = item3.quality;
        item3.sellIn = (byte) 10;
        int int15 = item3.quality;
        int int16 = item3.sellIn;
        java.lang.String str17 = item3.toString();
        item3.sellIn = (short) 10;
        item3.name = ", 100, 1, 10, 0, 10, 1, 100, 97";
        item3.quality = 35;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 10, 10" + "'", str17, "hi!, 10, 10");
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2956");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = '#';
        item3.name = "hi!, 1, 10";
        item3.name = "hi!, 52, 10";
        int int16 = item3.quality;
        java.lang.Class<?> wildcardClass17 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2957");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdater12.update();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2958");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '#', (int) (byte) 1);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (-1);
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2959");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) 'a', 0);
        java.lang.String str4 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 10" + "'", str4, "hi!, -1, 10");
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2960");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        item3.name = "hi!, -1, 97, 100, 0";
        item3.sellIn = 97;
        java.lang.String str10 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, -1, 97, 100, 0" + "'", str10, "hi!, -1, 97, 100, 0");
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2961");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater7.update();
        java.lang.Class<?> wildcardClass10 = itemUpdater9.getClass();
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2962");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", (int) 'a', (int) (short) 1);
        item3.name = "hi!, -1, 10, 52, 0";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater6.update();
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2963");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        item3.name = "hi!, -1, 97, 100, 0";
        item3.quality = (short) 100;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2964");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.name;
        java.lang.String str12 = item3.name;
        item3.sellIn = 10;
        item3.name = "hi!, 10, 10";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2965");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0, 35, 32", 35, 1);
        item3.sellIn = (byte) 0;
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2966");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", 0, (int) (byte) 10);
        int int4 = item3.quality;
        java.lang.String str5 = item3.name;
        item3.quality = 32;
        int int8 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 52, 97" + "'", str5, "hi!, 52, 97");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2967");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdater8.update();
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2968");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str9 = item3.name;
        item3.quality = (short) 0;
        int int12 = item3.sellIn;
        item3.quality = '4';
        com.gildedrose.ItemUpdater itemUpdater15 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2969");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.name;
        item3.quality = (short) 100;
        item3.quality = 'a';
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2970");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10, -1, 97", (int) (short) 10, (int) (short) 0);
        int int4 = item3.quality;
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2971");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10", (-1), 100);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdater5.update();
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2972");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", (int) (short) 1, 32);
        java.lang.String str4 = item3.name;
        item3.name = ", 100, 1, 0, 0";
        java.lang.String str7 = item3.name;
        item3.sellIn = (byte) 1;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdater10.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 97" + "'", str4, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 0, 0" + "'", str7, ", 100, 1, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2973");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 0, 0", 1, 35);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2974");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 35, 100", (int) (byte) -1, 0);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2975");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        int int4 = item3.quality;
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2976");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10", 1, 97);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 1, 10, 1, 97" + "'", str5, "hi!, 1, 10, 1, 97");
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2977");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (byte) 1;
        int int13 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2978");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2979");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.quality = '#';
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = ", -1, 97, 10, 97";
        int int13 = item3.quality;
        java.lang.String str14 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ", -1, 97, 10, 97, -1, 35" + "'", str14, ", -1, 97, 10, 97, -1, 35");
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2980");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        int int4 = item3.sellIn;
        int int5 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (short) 10;
        java.lang.String str9 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 100, 10" + "'", str9, ", 100, 10");
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2981");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.quality;
        java.lang.String str7 = item3.name;
        item3.quality = 52;
        int int10 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = 52;
        java.lang.String str14 = item3.toString();
        java.lang.String str15 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 1, 52" + "'", str14, "hi!, 1, 52");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 1, 52" + "'", str15, "hi!, 1, 52");
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2982");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 52, 52", (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2983");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (byte) 0;
        item3.name = "hi!, 10, 10";
        java.lang.String str10 = item3.name;
        int int11 = item3.quality;
        item3.name = "hi!, -1, 10, 0, 52";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass15 = conjuredItemUpdater14.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 10, 10" + "'", str10, "hi!, 10, 10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2984");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        item3.sellIn = (byte) -1;
        int int12 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater13.update();
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater13.update();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2985");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", 97, (int) (short) 1);
        item3.name = ", 100, 1";
        java.lang.String str6 = item3.name;
        item3.name = "hi!, -1, 10";
        java.lang.String str9 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1" + "'", str6, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 10, 97, 1" + "'", str9, "hi!, -1, 10, 97, 1");
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2986");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 52, -1", 97, 10);
        item3.name = "hi!, 1, 1, -1, 52";
        java.lang.String str6 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 1, 1, -1, 52" + "'", str6, "hi!, 1, 1, -1, 52");
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2987");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str8 = item3.toString();
        int int9 = item3.sellIn;
        item3.sellIn = 97;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 10, -1" + "'", str8, ", 10, -1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2988");
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
        com.gildedrose.ItemUpdater itemUpdater20 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdater20.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater21);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2989");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.name;
        item3.quality = (short) 1;
        item3.sellIn = 'a';
        item3.sellIn = 32;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2990");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 52", (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2991");
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
        java.lang.String str17 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2992");
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
        item3.name = ", -1, 97, 10, 97";
        java.lang.String str18 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ", -1, 97, 10, 97, 32, 100" + "'", str18, ", -1, 97, 10, 97, 32, 100");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2993");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 32, 100", (int) (short) 100, 10);
        item3.sellIn = (byte) -1;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 'a';
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2994");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, -1, 10, 52, 10, -1, 100";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2995");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = 35;
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 35, 97" + "'", str11, "hi!, 35, 97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 35, 97" + "'", str12, "hi!, 35, 97");
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2996");
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
        java.lang.String str17 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ", -1, 52" + "'", str17, ", -1, 52");
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2997");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.toString();
        item3.quality = 0;
        item3.sellIn = 52;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1, 10, 0" + "'", str6, ", 100, 1, 10, 0");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2998");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10, -1, 97", (int) (short) 100, 10);
        java.lang.String str4 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str6 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 10, -1, 97, 100, 10" + "'", str4, ", 100, 10, -1, 97, 100, 10");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 10, -1, 97" + "'", str6, ", 100, 10, -1, 97");
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test2999");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = '#';
        int int12 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str14 = item3.name;
        item3.name = "hi!, 52, 97, 1, 100";
        int int17 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest5.test3000");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str12 = item3.name;
        item3.name = "hi!, -1, 10";
        int int15 = item3.sellIn;
        item3.sellIn = (byte) 100;
        item3.sellIn = 10;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }
}

