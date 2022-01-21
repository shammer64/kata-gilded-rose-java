package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3001");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 1, -1, 97", 32, 35);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3002");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 100, (int) (short) 1);
        item3.name = ", -1, 52";
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3003");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1", 0, (int) '#');
        java.lang.String str4 = item3.name;
        item3.sellIn = 100;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 1" + "'", str4, "hi!, -1, 1");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3004");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.quality;
        java.lang.String str7 = item3.name;
        item3.quality = 52;
        java.lang.String str10 = item3.toString();
        item3.name = ", -1, 97, 1, 0";
        item3.quality = (byte) -1;
        item3.name = ", 100, 1, 0, 0, 10, 0";
        java.lang.Class<?> wildcardClass17 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 1, 52" + "'", str10, "hi!, 1, 52");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3005");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10, 10, 100", 32, 1);
        item3.sellIn = (byte) 0;
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3006");
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
        item3.sellIn = (short) 10;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 52, 10, 1, 10" + "'", str16, "hi!, 52, 10, 1, 10");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3007");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1, 97, 0", (int) (short) 0, (int) 'a');
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3008");
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
        int int18 = item3.sellIn;
        item3.name = "hi!, 32, 10, -1, -1";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3009");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        item3.name = "hi!, -1, 97, 1, 10";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3010");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97, 97, 100", (int) '4', 0);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3011");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 97, 100, 0", (int) 'a', (int) (byte) 10);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3012");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 97, 100, 1", 10, (int) (short) 0);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3013");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int10 = item3.sellIn;
        java.lang.String str11 = item3.toString();
        item3.name = "hi!, -1, 1, 100, 97";
        int int14 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 1" + "'", str11, "hi!, -1, 1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3014");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = '#';
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 'a';
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = 'a';
        int int14 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3015");
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
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3016");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52, 10, 97, -1, 0", (int) (short) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3017");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10, 1, 0", (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3018");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 97", 0, 35);
        item3.quality = '#';
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3019");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) 'a', 0);
        item3.sellIn = (byte) 0;
        java.lang.String str6 = item3.toString();
        item3.sellIn = 35;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 10, 0, 0" + "'", str6, "hi!, -1, 10, 0, 0");
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3020");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10", (int) (byte) -1, (int) (byte) 100);
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 10, -1, 100" + "'", str4, "hi!, 100, 10, -1, 100");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3021");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", 100, (int) (short) 0);
        item3.sellIn = 100;
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 97, 100, 0" + "'", str6, "hi!, -1, 97, 100, 0");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3022");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '#', (int) (byte) 1);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3023");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        item3.name = ", 100, 1";
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3024");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10, 10, 10", (int) '4', (int) (short) 100);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3025");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 100, 52);
        item3.sellIn = ' ';
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.name;
        java.lang.String str8 = item3.toString();
        int int9 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97, 32, 52" + "'", str8, "hi!, -1, 97, 32, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3026");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) (short) 100, 97);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3027");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.name = "hi!, 10, 0";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass15 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3028");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 97, 32, 100", (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3029");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        item3.quality = 100;
        int int11 = item3.sellIn;
        int int12 = item3.sellIn;
        java.lang.String str13 = item3.toString();
        int int14 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater15 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdater15.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 1, 100" + "'", str13, "hi!, 1, 100");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3030");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", 97, (int) (short) -1);
        item3.name = "hi!, 10, 0";
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3031");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 52, -1", (int) '#', 0);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.quality;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3032");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) ' ', 0);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3033");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = ", -1, 97, 10, 97";
        int int15 = item3.sellIn;
        int int16 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3034");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", 10, (int) '4');
        item3.sellIn = 'a';
        item3.sellIn = (short) 100;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = ", 100, 97";
        int int11 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3035");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 100, 52", 35, (int) (short) 1);
        java.lang.String str4 = item3.toString();
        item3.name = ", 100, 10";
        item3.sellIn = (byte) 100;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1, 100, 52, 35, 1" + "'", str4, ", 100, 1, 100, 52, 35, 1");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3036");
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
        com.gildedrose.ItemUpdater itemUpdater20 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int21 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 10, 0, -1, 1, 97, 10" + "'", str19, "hi!, 10, 0, -1, 1, 97, 10");
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3037");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10, 100, 100", (int) ' ', 32);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3038");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 32, 97", (int) 'a', (int) (byte) 100);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 32, 97" + "'", str5, "hi!, 32, 97");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3039");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int12 = item3.quality;
        item3.name = "hi!, 1, 1";
        java.lang.Class<?> wildcardClass15 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3040");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        int int8 = item3.sellIn;
        int int9 = item3.sellIn;
        java.lang.String str10 = item3.name;
        java.lang.String str11 = item3.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 52, 97" + "'", str11, "hi!, 52, 97");
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3041");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", 0, (int) (byte) 10);
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        java.lang.String str6 = item3.toString();
        item3.name = "hi!, 32, 10, -1, -1";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str4, "hi!, 52, 97, 0, 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str6, "hi!, 52, 97, 0, 10");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3042");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, -1, 1, 97, 10", (int) '#', (int) 'a');
        item3.sellIn = 100;
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3043");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "";
        item3.sellIn = 52;
        int int11 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3044");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        item3.name = "hi!";
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3045");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97, 10, 97, 35, 35", (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3046");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, -1, -1", (int) (short) 10, (int) (byte) 10);
        item3.name = "hi!, -1, 97, 1, -1";
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3047");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str9 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 100, 1" + "'", str9, ", 100, 1");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3048");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str8 = item3.toString();
        item3.sellIn = (short) 100;
        java.lang.String str11 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (byte) 1;
        int int15 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 10, -1" + "'", str8, ", 10, -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3049");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 97", (int) ' ', 0);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3050");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        int int8 = item3.sellIn;
        item3.quality = '#';
        java.lang.String str11 = item3.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 52, 35" + "'", str11, "hi!, 52, 35");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3051");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        java.lang.String str10 = item3.toString();
        java.lang.Class<?> wildcardClass11 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", -1, 52, -1, 97" + "'", str10, ", -1, 52, -1, 97");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3052");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 10, 100, 97", 0, (int) (short) 1);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3053");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 32, 10);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3054");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 52, 0", (int) (short) 100, (int) (short) -1);
        item3.sellIn = (byte) 0;
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3055");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        java.lang.String str7 = item3.name;
        item3.name = "hi!, 52, 97, -1, 52";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3056");
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
        java.lang.String str16 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater17 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass18 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 52, 97" + "'", str10, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 52, 97, -1, 10" + "'", str15, "hi!, 52, 97, -1, 10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 52, 97, -1, 10" + "'", str16, "hi!, 52, 97, -1, 10");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3057");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 1, (-1));
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdater6.update();
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3058");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.quality = 1;
        item3.quality = 32;
        item3.name = ", -1, 97, 10, 97";
        item3.sellIn = ' ';
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3059");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", (int) 'a', (int) (short) 1);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3060");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", 10, (int) '4');
        item3.sellIn = 'a';
        item3.sellIn = (short) 100;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int9 = item3.quality;
        java.lang.String str10 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", 100, 1, 100, 52" + "'", str10, ", 100, 1, 100, 52");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3061");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.sellIn = (short) 0;
        item3.sellIn = (short) -1;
        item3.sellIn = '4';
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass12 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3062");
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
        int int16 = item3.quality;
        item3.quality = (short) 0;
        item3.sellIn = (short) 1;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, -1, 10" + "'", str14, "hi!, -1, 10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3063");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 100, 52", (int) (short) 0, (int) ' ');
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3064");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 10;
        int int13 = item3.sellIn;
        item3.quality = (byte) 10;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3065");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        int int4 = item3.sellIn;
        int int5 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) -1;
        item3.quality = (short) -1;
        int int12 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3066");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 97, 10, 1, -1", (int) (byte) 0, 1);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3067");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 10, 10", (int) 'a', 97);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3068");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 100, 52", (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3069");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.quality;
        java.lang.String str7 = item3.name;
        item3.quality = 52;
        java.lang.String str10 = item3.toString();
        java.lang.String str11 = item3.name;
        int int12 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 1, 52" + "'", str10, "hi!, 1, 52");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3070");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 32, 0", 1, 52);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3071");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "";
        item3.sellIn = (short) 100;
        java.lang.String str13 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ", 100, 10" + "'", str13, ", 100, 10");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3072");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 97, (int) (short) -1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        item3.sellIn = ' ';
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3073");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "";
        item3.name = ", -1, 52";
        java.lang.String str11 = item3.name;
        java.lang.String str12 = item3.toString();
        item3.quality = 0;
        item3.quality = (short) 100;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", -1, 52" + "'", str11, ", -1, 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ", -1, 52, -1, 97" + "'", str12, ", -1, 52, -1, 97");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3074");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        item3.sellIn = (short) 100;
        item3.sellIn = (short) -1;
        int int15 = item3.sellIn;
        item3.name = ", 100, -1";
        java.lang.String str18 = item3.name;
        java.lang.String str19 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ", 100, -1" + "'", str18, ", 100, -1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ", 100, -1, -1, 10" + "'", str19, ", 100, -1, -1, 10");
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3075");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", 0, (int) (short) 1);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str5 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", -1, 97, 0, 1" + "'", str5, ", -1, 97, 0, 1");
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3076");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1, 32, 97", (int) ' ', (int) '#');
        item3.sellIn = ' ';
        item3.quality = (short) 0;
        int int8 = item3.sellIn;
        java.lang.String str9 = item3.name;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97, 1, -1, 32, 97" + "'", str9, "hi!, -1, 97, 1, -1, 32, 97");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3077");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 10, 100);
        int int4 = item3.quality;
        item3.sellIn = 35;
        java.lang.String str7 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater8.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3078");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.quality;
        int int8 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass10 = itemUpdater9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1, 0, 0" + "'", str5, ", 100, 1, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3079");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str6 = item3.toString();
        item3.quality = (short) 10;
        java.lang.String str9 = item3.toString();
        item3.quality = (byte) -1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 35, 97";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 32, 97" + "'", str6, "hi!, 32, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 32, 10" + "'", str9, "hi!, 32, 10");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3080");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 100", (int) (short) 10, (int) '4');
        java.lang.String str4 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 100, 10, 52" + "'", str4, "hi!, 1, 100, 10, 52");
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3081");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) 'a', (int) (byte) 10);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3082");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10, 1, 0", 10, (int) (short) -1);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 52, 97, 0, 10, 1, 0, 10, -1" + "'", str5, "hi!, 52, 97, 0, 10, 1, 0, 10, -1");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3083");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        item3.name = "";
        java.lang.String str10 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int13 = item3.sellIn;
        java.lang.String str14 = item3.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ", 52, 97" + "'", str14, ", 52, 97");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3084");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.toString();
        int int5 = item3.sellIn;
        item3.name = "hi!, 52, 97, 52, -1";
        item3.sellIn = 0;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 10" + "'", str4, ", 100, 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3085");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", 97, (int) (short) -1);
        item3.name = "hi!, 10, 0";
        java.lang.String str6 = item3.name;
        int int7 = item3.sellIn;
        java.lang.String str8 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 10, 0" + "'", str6, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 10, 0" + "'", str8, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3086");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", 100, (int) (short) 0);
        item3.name = ", -1, 97";
        item3.name = ", 100, 35";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int9 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3087");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str9 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str12 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 52, 97" + "'", str12, "hi!, 52, 97");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3088");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10", (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3089");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 0, 35", (int) '4', (int) (byte) 100);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 10, 0, 35" + "'", str4, "hi!, -1, 10, 0, 35");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3090");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3091");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.name;
        int int10 = item3.quality;
        int int11 = item3.quality;
        java.lang.String str12 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, -1, 97" + "'", str12, "hi!, -1, 97");
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3092");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", 0, (int) '#');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3093");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int6 = item3.quality;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (byte) 100;
        java.lang.String str11 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str13 = item3.name;
        int int14 = item3.sellIn;
        int int15 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 10, 0" + "'", str7, ", 100, 1, 10, 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", 100, 1, 100, 0" + "'", str11, ", 100, 1, 100, 0");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ", 100, 1" + "'", str13, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3094");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        int int8 = item3.sellIn;
        int int9 = item3.sellIn;
        java.lang.String str10 = item3.name;
        item3.sellIn = (byte) -1;
        java.lang.String str13 = item3.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, -1, 97" + "'", str13, "hi!, -1, 97");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3095");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater6.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1" + "'", str5, ", 100, 1");
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3096");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.quality = '#';
        int int10 = item3.sellIn;
        item3.name = "hi!, 52, 97";
        item3.quality = 10;
        item3.quality = 35;
        int int17 = item3.quality;
        int int18 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3097");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.toString();
        java.lang.String str13 = item3.name;
        int int14 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 1, 10" + "'", str12, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3098");
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
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3099");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, -1, 1";
        java.lang.String str13 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, -1, 1, -1, 97" + "'", str13, "hi!, -1, 1, -1, 97");
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3100");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 32, 97, 32, 35", (int) (short) 10, (int) (short) 100);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 32, 97, 32, 35, 10, 100" + "'", str4, "hi!, 32, 97, 32, 35, 10, 100");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3101");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        item3.name = "hi!";
        int int8 = item3.quality;
        int int9 = item3.sellIn;
        item3.quality = 0;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3102");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 52", 100, (int) (short) 0);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 52" + "'", str4, "hi!, 1, 52");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3103");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.quality;
        item3.quality = 100;
        item3.name = "hi!, -1, 10, 52, 0";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int10 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdater12.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3104");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        item3.sellIn = 'a';
        int int8 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass11 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3105");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str8 = item3.toString();
        int int9 = item3.sellIn;
        java.lang.String str10 = item3.toString();
        item3.sellIn = (short) 100;
        item3.sellIn = 1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 10, -1" + "'", str8, ", 10, -1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", 10, -1" + "'", str10, ", 10, -1");
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3106");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10", 0, (-1));
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.name;
        item3.name = "hi!, 52, 97, 97, 32";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str5, "hi!, 52, 97, 0, 10");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3107");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        java.lang.String str8 = item3.toString();
        item3.quality = 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3108");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        java.lang.String str6 = item3.toString();
        int int7 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 97" + "'", str6, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3109");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        item3.quality = (byte) 100;
        item3.sellIn = 1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int11 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3110");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", 0, 0);
        java.lang.String str4 = item3.toString();
        item3.quality = 52;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", -1, 97, 0, 0" + "'", str4, ", -1, 97, 0, 0");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3111");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", 100, (int) (short) 0);
        item3.sellIn = 100;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = 32;
        item3.name = "hi!, 1, 97, 32, 100";
        item3.name = "hi!, 100, -1";
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3112");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1, 97, 0", (int) (short) 10, 35);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3113");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 97, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int11 = item3.sellIn;
        item3.name = "hi!, 52, 97, 0, 10, 1, 0";
        item3.name = "hi!, 52, 97, 0, 10, 1, 0, 10, -1";
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3114");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 100, (int) (short) 1);
        java.lang.String str4 = item3.toString();
        item3.quality = 97;
        java.lang.String str7 = item3.name;
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3115");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, -1, -1", 1, 0);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3116");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 97", (int) ' ', (int) (short) 100);
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        int int6 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 1, 97, 32, 100" + "'", str5, "hi!, 1, 97, 32, 100");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3117");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 100, 52, 35, 1", 1, 0);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3118");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        item3.sellIn = 0;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3119");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", 0, (int) (byte) 10);
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = '#';
        java.lang.String str9 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str5, "hi!, 52, 97, 0, 10");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97, 35, 10" + "'", str9, "hi!, 52, 97, 35, 10");
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3120");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater5.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3121");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater10.update();
        java.lang.Class<?> wildcardClass13 = conjuredItemUpdater10.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3122");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 1, (-1));
        item3.name = ", 100, 1, 0, -1";
        item3.quality = (byte) 100;
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 100, 1, 0, -1" + "'", str8, ", 100, 1, 0, -1");
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3123");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        int int9 = item3.quality;
        item3.name = "hi!";
        java.lang.String str12 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3124");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.toString();
        item3.quality = '#';
        int int9 = item3.quality;
        java.lang.String str10 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1, 10, 0" + "'", str6, ", 100, 1, 10, 0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", 100, 1" + "'", str10, ", 100, 1");
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3125");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater6.update();
        java.lang.Class<?> wildcardClass9 = itemUpdater8.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1, 10, 0" + "'", str5, ", 100, 1, 10, 0");
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3126");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) -1, (int) (byte) 10);
        item3.sellIn = (short) -1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97, -1, 10" + "'", str7, "hi!, -1, 97, -1, 10");
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3127");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", 0, 0);
        java.lang.String str4 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", -1, 97, 0, 0" + "'", str4, ", -1, 97, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", -1, 97, 0, 0" + "'", str6, ", -1, 97, 0, 0");
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3128");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.quality = '4';
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (byte) 0;
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3129");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 52, -1", 97, 10);
        item3.name = "hi!, 10, 0";
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        int int8 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 10, 0, 97, 10" + "'", str7, "hi!, 10, 0, 97, 10");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3130");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (int) (byte) 10, (-1));
        int int4 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater5.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3131");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        item3.name = "hi!, 52, 10, 1, 10, 10, 100";
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1, 10, 0" + "'", str5, ", 100, 1, 10, 0");
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3132");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.quality;
        java.lang.String str7 = item3.name;
        item3.quality = 52;
        int int10 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3133");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        item3.sellIn = 'a';
        int int8 = item3.quality;
        java.lang.String str9 = item3.toString();
        item3.name = "hi!";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 97, 97" + "'", str9, "hi!, 97, 97");
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3134");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        java.lang.String str7 = item3.name;
        int int8 = item3.sellIn;
        item3.sellIn = 'a';
        item3.quality = 32;
        item3.sellIn = 32;
        java.lang.String str15 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ", 100, 1, 32, 32" + "'", str15, ", 100, 1, 32, 32");
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3135");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        item3.name = "hi!, -1, 0";
        item3.sellIn = (byte) 0;
        item3.name = ", 52, 97";
        item3.name = "";
        item3.name = "hi!, -1, 97, 1, -1, -1, 1";
        item3.name = "hi!, 100, 10, 100, 32";
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3136");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 1, 0", 100, (int) (short) 0);
        item3.quality = 10;
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3137");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.quality;
        java.lang.String str7 = item3.name;
        item3.quality = 52;
        java.lang.String str10 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = ' ';
        item3.name = "";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 1, 52" + "'", str10, "hi!, 1, 52");
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3138");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass7 = conjuredItemUpdater6.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3139");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10", (int) (byte) -1, 100);
        int int4 = item3.quality;
        java.lang.String str5 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 52, 10" + "'", str5, "hi!, 52, 10");
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3140");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str10 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (byte) 1;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3141");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 1", 35, (int) (byte) -1);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 97, -1, 1, 35, -1" + "'", str4, "hi!, 52, 97, -1, 1, 35, -1");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3142");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        int int5 = item3.quality;
        int int6 = item3.quality;
        int int7 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3143");
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
        item3.sellIn = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater21 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int22 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater23 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 1;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(itemUpdater23);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3144");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = ' ';
        item3.name = "hi!, -1, 97, 1, -1";
        java.lang.String str11 = item3.toString();
        int int12 = item3.sellIn;
        int int13 = item3.quality;
        int int14 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 97, 1, -1, 32, 97" + "'", str11, "hi!, -1, 97, 1, -1, 32, 97");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3145");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        int int7 = item3.sellIn;
        int int8 = item3.quality;
        item3.name = "hi!, 1, 10";
        item3.name = ", 100, 1";
        item3.name = "hi!, 52, 97, -1, 52";
        item3.sellIn = (byte) 10;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3146");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.name;
        item3.name = ", 100, 10";
        item3.name = ", 100, 1, 0, 100, 1, 97";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3147");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", (int) (short) 1, 32);
        java.lang.String str4 = item3.name;
        item3.name = ", 100, 1, 0, 0";
        java.lang.String str7 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = ", 100, 0, -1, 97";
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 97" + "'", str4, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 0, 0" + "'", str7, ", 100, 1, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3148");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 1, -1, 52", (int) (short) 10, (int) (short) 10);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 1, -1, 52" + "'", str4, "hi!, 1, 1, -1, 52");
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3149");
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
        int int18 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, -1, 97, 1, 10" + "'", str16, "hi!, -1, 97, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3150");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1, -1, 10", (int) (short) 1, (int) (byte) 0);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97, 1, -1, -1, 10, 1, 0" + "'", str4, "hi!, -1, 97, 1, -1, -1, 10, 1, 0");
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3151");
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
        item3.sellIn = 1;
        item3.quality = (-1);
        int int24 = item3.quality;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3152");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, -1, 52, 10", (-1), 100);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1, 0, -1, 52, 10, -1, 100" + "'", str4, ", 100, 1, 0, -1, 52, 10, -1, 100");
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3153");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3154");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 97";
        int int8 = item3.quality;
        java.lang.Class<?> wildcardClass9 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3155");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10, 1, 10", (int) (short) 10, (int) (byte) -1);
        java.lang.String str4 = item3.name;
        item3.name = "hi!, -1, 97, 35, 100";
        item3.quality = 0;
        java.lang.Class<?> wildcardClass9 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 10, 1, 10" + "'", str4, "hi!, 52, 10, 1, 10");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3156");
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
        item3.quality = 32;
        java.lang.String str23 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3157");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        item3.quality = 100;
        java.lang.String str11 = item3.name;
        int int12 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3158");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        int int6 = item3.quality;
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 32, 97" + "'", str7, "hi!, 32, 97");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3159");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        item3.quality = (byte) -1;
        item3.quality = 97;
        int int15 = item3.quality;
        item3.name = "hi!, 52, 97, 97, 32";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3160");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        item3.sellIn = 0;
        item3.sellIn = (-1);
        item3.sellIn = '4';
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass14 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3161");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10", 10, (int) (byte) 0);
        item3.quality = 97;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater7.update();
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3162");
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
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3163");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str8 = item3.toString();
        int int9 = item3.sellIn;
        java.lang.String str10 = item3.toString();
        item3.sellIn = (short) 100;
        java.lang.String str13 = item3.name;
        java.lang.String str14 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 10, -1" + "'", str8, ", 10, -1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", 10, -1" + "'", str10, ", 10, -1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3164");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str9 = item3.name;
        item3.quality = (short) 0;
        int int12 = item3.sellIn;
        item3.name = ", -1, 52, -1, 97, 100, 10";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3165");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str6 = item3.toString();
        int int7 = item3.sellIn;
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 97" + "'", str6, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3166");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.name;
        item3.quality = (byte) 0;
        int int7 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass9 = conjuredItemUpdater8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3167");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", (int) (byte) -1, (int) (short) 1);
        item3.sellIn = (-1);
        int int6 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3168");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        int int8 = item3.sellIn;
        int int9 = item3.sellIn;
        int int10 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3169");
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
        com.gildedrose.ItemUpdater itemUpdater19 = conjuredItemUpdater10.update();
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
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3170");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.name;
        item3.name = "hi!, -1, 97, 1, -1";
        int int7 = item3.sellIn;
        item3.quality = (short) 0;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass11 = conjuredItemUpdater10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3171");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 100, 0", (int) 'a', 0);
        int int4 = item3.quality;
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3172");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 1", (int) (byte) 1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 52, 97, 0, 10, 1, 0";
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3173");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, 0", 1, (int) (short) -1);
        java.lang.String str4 = item3.name;
        int int5 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1, 0, 0" + "'", str4, ", 100, 1, 0, 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3174");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) '#', 32);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater5.update();
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3175");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int6 = item3.quality;
        java.lang.String str7 = item3.toString();
        int int8 = item3.quality;
        item3.name = ", 0, 97";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 10, 0" + "'", str7, ", 100, 1, 10, 0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3176");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        item3.sellIn = 'a';
        int int8 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3177");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1", (int) 'a', (int) (byte) 0);
        java.lang.String str4 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass6 = conjuredItemUpdater5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 1, 97, 0" + "'", str4, "hi!, -1, 1, 97, 0");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3178");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 97", (int) ' ', (int) (short) 100);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdater4.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3179");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater13.update();
        java.lang.Class<?> wildcardClass15 = conjuredItemUpdater13.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3180");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 100, 52", 35, (int) (short) 1);
        java.lang.String str4 = item3.toString();
        item3.quality = 'a';
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1, 100, 52, 35, 1" + "'", str4, ", 100, 1, 100, 52, 35, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 100, 52, 35, 97" + "'", str7, ", 100, 1, 100, 52, 35, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 100, 1, 100, 52" + "'", str8, ", 100, 1, 100, 52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 100, 1, 100, 52, 35, 97" + "'", str9, ", 100, 1, 100, 52, 35, 97");
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3181");
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
        java.lang.String str15 = item3.name;
        item3.quality = (-1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, -1, 10" + "'", str14, "hi!, -1, 10");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3182");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = '4';
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 10;
        java.lang.Class<?> wildcardClass16 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3183");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.toString();
        int int12 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str14 = item3.toString();
        item3.quality = 0;
        int int17 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 10" + "'", str11, "hi!, -1, 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, -1, 10" + "'", str14, "hi!, -1, 10");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3184");
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
        java.lang.String str17 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater18 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, -1, 97, 1, -1, 32, 97, 52, 10" + "'", str17, "hi!, -1, 97, 1, -1, 32, 97, 52, 10");
        org.junit.Assert.assertNotNull(itemUpdater18);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3185");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        item3.sellIn = 52;
        int int13 = item3.sellIn;
        int int14 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3186");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        item3.name = "";
        int int11 = item3.sellIn;
        int int12 = item3.sellIn;
        item3.name = "hi!, 52, 97, 1, 100";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3187");
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
        java.lang.String str17 = item3.name;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, -1, 10, 52, 10" + "'", str15, "hi!, -1, 10, 52, 10");
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, -1, 10" + "'", str17, "hi!, -1, 10");
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3188");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10", 1, 97);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdater5.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3189");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 32, 100", (int) (short) 100, 10);
        item3.sellIn = (byte) -1;
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 32, 100, -1, 10" + "'", str6, "hi!, 32, 100, -1, 10");
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3190");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10, 10, 10", (int) '#', (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3191");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        java.lang.String str10 = item3.name;
        item3.name = "";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater13.update();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdater14.update();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3192");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str5 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = 52;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 10" + "'", str5, ", 100, 10");
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3193");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.sellIn;
        item3.sellIn = (byte) 100;
        int int7 = item3.sellIn;
        item3.quality = ' ';
        item3.name = ", -1, 97, 10, 97, 32, 100";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3194");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater11.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3195");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.toString();
        int int12 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 10;
        java.lang.String str16 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 10" + "'", str11, "hi!, -1, 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 10, 10" + "'", str16, "hi!, 10, 10");
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3196");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
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
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3197");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", 97, (int) (short) 1);
        item3.name = ", 100, 1";
        item3.quality = (byte) 1;
        int int8 = item3.quality;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3198");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) (short) 0, (int) '4');
        item3.name = "hi!, 10, 0";
        item3.name = ", -1, -1";
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3199");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3200");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        item3.quality = 0;
        item3.name = "";
        java.lang.String str11 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3201");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", 0, (int) (byte) 10);
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        item3.name = "hi!, 10, 0, -1, 1, 97, 10";
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str4, "hi!, 52, 97, 0, 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3202");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        int int4 = item3.sellIn;
        int int5 = item3.quality;
        item3.name = "hi!, 52, 0, 10, -1";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3203");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52, 10, 97", 52, (int) (short) 10);
        item3.quality = 'a';
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3204");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass7 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3205");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 97, 32, -1, 97", (int) 'a', (-1));
        item3.sellIn = 52;
        item3.sellIn = (short) 0;
        item3.quality = (short) 100;
        item3.sellIn = (-1);
        item3.name = "hi!, -1, 1, 0, 35";
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3206");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.name;
        item3.name = "hi!, -1, 97, 1, -1";
        item3.quality = (byte) -1;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3207");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 52, -1", (-1), 35);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 97, 52, -1, -1, 35" + "'", str4, "hi!, 52, 97, 52, -1, -1, 35");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3208");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        item3.quality = 0;
        item3.name = "hi!, 1, 1, -1, 97, 100, 10";
        item3.sellIn = (short) 100;
        item3.name = "";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3209");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52, 10, 97, -1, 0", (int) 'a', (int) (short) 1);
        item3.name = ", -1, 52, 1, 97, -1, 35";
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3210");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (int) (short) 0, 10);
        int int4 = item3.quality;
        item3.name = ", 100, 1, 0, 0";
        java.lang.String str7 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 0, 0, 0, 10" + "'", str7, ", 100, 1, 0, 0, 0, 10");
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3211");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        item3.sellIn = 'a';
        int int8 = item3.quality;
        java.lang.String str9 = item3.toString();
        item3.sellIn = 100;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 97, 97" + "'", str9, "hi!, 97, 97");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3212");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52", (int) 'a', (int) '#');
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3213");
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
        item3.name = ", -1, 97, 10, 97, -1, 32";
        java.lang.Class<?> wildcardClass18 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 52, 97" + "'", str10, "hi!, 52, 97");
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3214");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (int) (short) 0, 10);
        int int4 = item3.quality;
        int int5 = item3.quality;
        int int6 = item3.quality;
        item3.quality = 100;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3215");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater13.update();
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater13.update();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3216");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (byte) 0;
        item3.name = "hi!, 10, 10";
        java.lang.String str10 = item3.name;
        int int11 = item3.quality;
        item3.name = "hi!, -1, 10, 0, 52";
        int int14 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 10, 10" + "'", str10, "hi!, 10, 10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3217");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, -1, 0", (-1), (int) (byte) 0);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3218");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        item3.sellIn = 97;
        java.lang.String str9 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3219");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3220");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        item3.sellIn = (byte) -1;
        int int12 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3221");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 52;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3222");
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
        item3.quality = '4';
        java.lang.Class<?> wildcardClass20 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3223");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int11 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = ", 100, 1, -1, -1";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3224");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str6 = item3.toString();
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str10 = item3.toString();
        item3.sellIn = (byte) 10;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 32, 97" + "'", str6, "hi!, 32, 97");
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 32, 10" + "'", str10, "hi!, 32, 10");
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3225");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (-1));
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        java.lang.String str6 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, -1" + "'", str5, "hi!, -1, -1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, -1" + "'", str6, "hi!, -1, -1");
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3226");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        int int6 = item3.sellIn;
        int int7 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3227");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", (int) (byte) 1, (int) (byte) 0);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        item3.name = "hi!, 1, 1, -1, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        item3.sellIn = 32;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", -1, 97" + "'", str5, ", -1, 97");
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3228");
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
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3229");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.quality;
        item3.quality = (short) 0;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3230");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.toString();
        item3.quality = (byte) 100;
        int int12 = item3.sellIn;
        item3.sellIn = (byte) 100;
        item3.quality = (short) 0;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3231");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str5 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdater10.update();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3232");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", 0, 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        int int8 = item3.sellIn;
        item3.name = "";
        item3.sellIn = 0;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 10, 0, 0" + "'", str7, "hi!, -1, 10, 0, 0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3233");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.quality;
        int int7 = item3.quality;
        item3.quality = 0;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3234");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        item3.sellIn = (-1);
        item3.sellIn = (byte) 0;
        item3.name = "hi!, 1, 1, -1, 97, 100, 10";
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3235");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str12 = item3.name;
        item3.name = "hi!, -1, 10";
        int int15 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater16 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater17 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass18 = itemUpdater17.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3236");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = 'a';
        int int9 = item3.sellIn;
        int int10 = item3.quality;
        java.lang.Class<?> wildcardClass11 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3237");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.quality = '#';
        int int10 = item3.sellIn;
        int int11 = item3.quality;
        java.lang.String str12 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, -1, 35" + "'", str12, "hi!, -1, 35");
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3238");
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
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater21 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(itemUpdater20);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3239");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str12 = item3.name;
        item3.name = "hi!, -1, 10";
        int int15 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater16 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = ' ';
        item3.quality = (byte) 1;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3240");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int9 = item3.sellIn;
        java.lang.String str10 = item3.name;
        item3.sellIn = (byte) 1;
        item3.quality = (byte) 100;
        item3.name = ", 100, 1, 10, 0";
        java.lang.String str17 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 52, 97" + "'", str10, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ", 100, 1, 10, 0, 1, 100" + "'", str17, ", 100, 1, 10, 0, 1, 100");
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3241");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 97, 32, -1, 97", (int) 'a', (-1));
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdater7.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3242");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.name;
        int int10 = item3.sellIn;
        java.lang.Class<?> wildcardClass11 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3243");
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
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdater14.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3244");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.quality;
        java.lang.String str7 = item3.name;
        int int8 = item3.sellIn;
        int int9 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3245");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 100;
        item3.quality = 32;
        item3.quality = (byte) -1;
        java.lang.String str13 = item3.toString();
        item3.sellIn = (short) 100;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 100, -1" + "'", str13, "hi!, 100, -1");
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3246");
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
        com.gildedrose.ItemUpdater itemUpdater16 = conjuredItemUpdater14.update();
        com.gildedrose.ItemUpdater itemUpdater17 = conjuredItemUpdater14.update();
        com.gildedrose.ItemUpdater itemUpdater18 = conjuredItemUpdater14.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 97, 1, -1, 32, 97" + "'", str11, "hi!, -1, 97, 1, -1, 32, 97");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater18);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3247");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        item3.quality = 52;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3248");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.name;
        item3.name = "hi!, -1, 97, 1, -1";
        int int7 = item3.sellIn;
        item3.sellIn = (short) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, -1, 97, 1, -1, 32, 97";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3249");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) (short) 100, 97);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdater4.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3250");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 97, 32, -1, 97", (int) 'a', (-1));
        item3.sellIn = 52;
        item3.sellIn = 'a';
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3251");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str9 = item3.toString();
        int int10 = item3.sellIn;
        int int11 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3252");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        java.lang.String str9 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int11 = item3.quality;
        item3.name = "hi!, 100, -1";
        java.lang.String str14 = item3.name;
        java.lang.String str15 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", -1, 97" + "'", str9, ", -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, -1" + "'", str14, "hi!, 100, -1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 100, -1" + "'", str15, "hi!, 100, -1");
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3253");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 1, -1, 52", (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3254");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        java.lang.String str9 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", -1, 97" + "'", str9, ", -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", -1, 97" + "'", str11, ", -1, 97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ", -1, 97" + "'", str12, ", -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3255");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 97, 32", (int) (short) 1, (int) (byte) -1);
        item3.name = "hi!, -1, 97, 0, 1";
        java.lang.String str6 = item3.toString();
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 97, 0, 1, 1, -1" + "'", str6, "hi!, -1, 97, 0, 1, 1, -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97, 0, 1, 1, -1" + "'", str7, "hi!, -1, 97, 0, 1, 1, -1");
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3256");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", (int) (byte) -1, (int) 'a');
        item3.name = ", 10, -1";
        item3.sellIn = 0;
        item3.sellIn = (short) 1;
        int int10 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3257");
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
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater13.update();
        java.lang.Class<?> wildcardClass16 = itemUpdater15.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3258");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 0, 1, 1, -1", (int) (short) 10, (int) (byte) 1);
        item3.quality = (short) 1;
        int int6 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3259");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str5 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 1;
        item3.name = ", 100, 1, 32, 0";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 10" + "'", str5, ", 100, 10");
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3260");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97, 10, 1, 35, 0", (int) (byte) 10, 0);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3261");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 97, 32", 32, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3262");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52, -1, 97", (int) (byte) 100, (int) ' ');
        item3.name = ", 100, 1, 32, 0";
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3263");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        item3.quality = ' ';
        item3.sellIn = 97;
        java.lang.String str11 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3264");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, (int) (short) 100);
        item3.sellIn = 32;
        item3.quality = 0;
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3265");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", (int) (byte) 100, (int) (short) -1);
        java.lang.String str4 = item3.toString();
        item3.name = "hi!, -1, 97, 0, 1, 10, 35";
        item3.sellIn = 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97, 1, -1, 100, -1" + "'", str4, "hi!, -1, 97, 1, -1, 100, -1");
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3266");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3267");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        item3.sellIn = 10;
        item3.name = "hi!, 52, 97, -1, 52";
        java.lang.String str14 = item3.toString();
        item3.quality = (byte) 0;
        item3.sellIn = (short) 0;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 52, 97, -1, 52, 10, 10" + "'", str14, "hi!, 52, 97, -1, 52, 10, 10");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3268");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str9 = item3.name;
        item3.quality = (short) 0;
        item3.sellIn = '#';
        item3.quality = '4';
        java.lang.String str16 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 35, 52" + "'", str16, "hi!, 35, 52");
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3269");
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
        java.lang.Class<?> wildcardClass21 = itemUpdater20.getClass();
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
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3270");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 32, 97, 32, 35", 32, 10);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3271");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        int int8 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3272");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.sellIn = 1;
        java.lang.String str6 = item3.name;
        int int7 = item3.sellIn;
        item3.sellIn = '#';
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3273");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 35", (int) (byte) -1, 0);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3274");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", 0, (int) (byte) 10);
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.quality;
        int int8 = item3.quality;
        java.lang.Class<?> wildcardClass9 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str5, "hi!, 52, 97, 0, 10");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3275");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", (int) (short) 1, 32);
        java.lang.String str4 = item3.name;
        item3.name = ", 100, 1, 0, 0";
        java.lang.String str7 = item3.name;
        item3.sellIn = (byte) 1;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int11 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater12.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 97" + "'", str4, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 0, 0" + "'", str7, ", 100, 1, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3276");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3277");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str9 = item3.toString();
        item3.quality = (short) 0;
        int int12 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 97" + "'", str7, "hi!, 1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 97" + "'", str9, "hi!, 1, 97");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3278");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", (int) (byte) -1, (int) 'a');
        item3.quality = 97;
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3279");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 100, 100, 0, 100", 97, (int) (byte) 1);
        item3.quality = 'a';
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3280");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", (int) (byte) -1, (int) 'a');
        item3.name = ", 10, -1";
        item3.quality = 1;
        int int8 = item3.quality;
        item3.sellIn = '#';
        item3.quality = 35;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3281");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        int int6 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3282");
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
        item3.sellIn = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater21 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int22 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater23 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str24 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!, 52, 97, 0, 10, 10, 1" + "'", str24, "hi!, 52, 97, 0, 10, 10, 1");
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3283");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        item3.sellIn = 'a';
        int int8 = item3.quality;
        java.lang.String str9 = item3.name;
        java.lang.String str10 = item3.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 97, 97" + "'", str10, "hi!, 97, 97");
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3284");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        item3.sellIn = (short) 100;
        int int13 = item3.sellIn;
        item3.quality = (byte) 1;
        item3.sellIn = 1;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3285");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int12 = item3.quality;
        item3.sellIn = (short) 0;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3286");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3287");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        java.lang.String str6 = item3.name;
        int int7 = item3.quality;
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", -1, 52" + "'", str9, ", -1, 52");
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3288");
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
        java.lang.Class<?> wildcardClass18 = itemUpdater17.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3289");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.toString();
        int int5 = item3.sellIn;
        item3.name = "hi!, 52, 97, 52, -1";
        item3.sellIn = 0;
        item3.quality = (byte) -1;
        int int12 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 10" + "'", str4, ", 100, 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3290");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        int int7 = item3.sellIn;
        int int8 = item3.quality;
        int int9 = item3.quality;
        java.lang.String str10 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int13 = item3.sellIn;
        int int14 = item3.sellIn;
        int int15 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", 100, 1, 10, -1" + "'", str10, ", 100, 1, 10, -1");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3291");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", (-1), 10);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3292");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", 0, (int) (byte) 10);
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        java.lang.String str6 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str4, "hi!, 52, 97, 0, 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str6, "hi!, 52, 97, 0, 10");
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3293");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        java.lang.String str4 = item3.toString();
        java.lang.String str5 = item3.toString();
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", -1, 52" + "'", str4, ", -1, 52");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", -1, 52" + "'", str5, ", -1, 52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3294");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 97, 97";
        item3.quality = 32;
        int int12 = item3.sellIn;
        item3.quality = 1;
        java.lang.String str15 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 97, 97, 32, 1" + "'", str15, "hi!, 97, 97, 32, 1");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3295");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 97", (int) (byte) 1, (-1));
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 97, 97" + "'", str5, "hi!, 97, 97");
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3296");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 10, -1", 100, 100);
        item3.quality = 100;
        int int6 = item3.sellIn;
        item3.quality = (byte) 100;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3297");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 100, 52);
        item3.quality = (short) 0;
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3298");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (int) '#', (int) (byte) 10);
        int int4 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3299");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.toString();
        item3.sellIn = 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 10, -1" + "'", str5, ", 10, -1");
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3300");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, 100", 10, (int) (byte) 10);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3301");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        item3.name = ", -1, 52";
        int int9 = item3.quality;
        int int10 = item3.quality;
        item3.name = "hi!, 52, 97, -1, 1, 35, -1";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3302");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", 0, (int) (byte) 10);
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        item3.sellIn = 0;
        item3.quality = (short) 100;
        item3.name = "hi!, 32, 97";
        int int12 = item3.sellIn;
        item3.sellIn = (short) 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str5, "hi!, 52, 97, 0, 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3303");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10, 1, 0, 10, -1", 52, (int) ' ');
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3304");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", (int) (byte) 100, (int) (short) -1);
        item3.name = "hi!, 52, 10, 1, 10, -1, 10";
        int int6 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3305");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", 97, (int) '4');
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3306");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        java.lang.String str9 = item3.toString();
        java.lang.String str10 = item3.name;
        int int11 = item3.sellIn;
        int int12 = item3.sellIn;
        java.lang.String str13 = item3.name;
        item3.name = ", -1, 97, 10, 97";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", -1, 97" + "'", str9, ", -1, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3307");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10", 1, 97);
        int int4 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        java.lang.Class<?> wildcardClass7 = conjuredItemUpdater5.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3308");
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
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3309");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 0, 1", (int) (short) 10, (int) '#');
        java.lang.String str4 = item3.toString();
        int int5 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97, 0, 1, 10, 35" + "'", str4, "hi!, -1, 97, 0, 1, 10, 35");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3310");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 10, -1, 1, 97", 100, 0);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3311");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        item3.sellIn = 'a';
        int int8 = item3.quality;
        java.lang.String str9 = item3.toString();
        java.lang.String str10 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater11.update();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 97, 97" + "'", str9, "hi!, 97, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3312");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", (int) (short) 1, 32);
        java.lang.String str4 = item3.name;
        item3.name = ", 100, 1, 0, 0";
        java.lang.String str7 = item3.name;
        java.lang.String str8 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (byte) 100;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 97" + "'", str4, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 0, 0" + "'", str7, ", 100, 1, 0, 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 100, 1, 0, 0, 1, 32" + "'", str8, ", 100, 1, 0, 0, 1, 32");
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3313");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        item3.name = "";
        item3.sellIn = (-1);
        java.lang.String str12 = item3.name;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3314");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.toString();
        item3.quality = '#';
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str10 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1, 10, 0" + "'", str6, ", 100, 1, 10, 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", 100, 1, 10, 35" + "'", str10, ", 100, 1, 10, 35");
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3315");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.toString();
        item3.name = "hi!";
        item3.sellIn = (byte) -1;
        java.lang.String str17 = item3.name;
        item3.sellIn = (byte) 1;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 10" + "'", str11, "hi!, -1, 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, -1, 10" + "'", str12, "hi!, -1, 10");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3316");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = 0;
        item3.quality = (-1);
        java.lang.String str13 = item3.name;
        item3.sellIn = (short) 1;
        item3.name = "hi!, 100, 10, 1, 35";
        int int18 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater19 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3317");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 97", (int) (short) 10, (int) (byte) 1);
        item3.quality = 35;
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3318");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1, 32, 97", 52, 10);
        item3.sellIn = '4';
        java.lang.String str6 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 97, 1, -1, 32, 97" + "'", str6, "hi!, -1, 97, 1, -1, 32, 97");
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3319");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater4.update();
        java.lang.Class<?> wildcardClass9 = itemUpdater8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3320");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3321");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str5 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 10" + "'", str5, ", 100, 10");
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3322");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.quality = 1;
        item3.quality = 32;
        item3.name = ", -1, 97, 10, 97";
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater15 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int16 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3323");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.sellIn = (short) -1;
        int int10 = item3.sellIn;
        item3.quality = (short) -1;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3324");
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
        int int15 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 1, 10" + "'", str12, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3325");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", (int) (short) 1, 32);
        java.lang.String str4 = item3.name;
        item3.name = ", 100, 1, 0, 0";
        java.lang.String str7 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 97" + "'", str4, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 0, 0" + "'", str7, ", 100, 1, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3326");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 1", (int) (byte) 10, 32);
        item3.name = "hi!, -1, 0, 35, 32";
        java.lang.String str6 = item3.name;
        item3.name = "hi!, -1, 10, 10, 10";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 0, 35, 32" + "'", str6, "hi!, -1, 0, 35, 32");
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3327");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 32, 97, 32, 35", (int) (byte) -1, 0);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3328");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 10, 10", 10, (int) '#');
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3329");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        item3.quality = 0;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str7 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 0" + "'", str7, ", 100, 0");
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3330");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str9 = item3.name;
        int int10 = item3.sellIn;
        int int11 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3331");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        item3.name = ", 100, 1";
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, -1, 97" + "'", str7, ", 100, 1, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 100, 1, -1, 97" + "'", str8, ", 100, 1, -1, 97");
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3332");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52, 10, 97, -1, 0", (int) '4', (int) '4');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3333");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 0, 1", (int) (short) 10, (int) '#');
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3334");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        item3.name = "hi!, -1, 0";
        item3.sellIn = '#';
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3335");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.name = ", 100, 10";
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3336");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", (int) (byte) -1, (int) 'a');
        item3.quality = 10;
        int int6 = item3.sellIn;
        item3.name = "hi!, 1, 32, 1, 97";
        java.lang.String str9 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 32, 1, 97" + "'", str9, "hi!, 1, 32, 1, 97");
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3337");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater7.update();
        java.lang.Class<?> wildcardClass11 = itemUpdater10.getClass();
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3338");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", (int) (byte) 100, (int) (short) -1);
        item3.quality = (byte) 10;
        java.lang.String str6 = item3.name;
        int int7 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 97, 1, -1" + "'", str6, "hi!, -1, 97, 1, -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3339");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.toString();
        item3.sellIn = (short) -1;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int9 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, 97" + "'", str5, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3340");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0, 0, 10", (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3341");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        item3.sellIn = 100;
        java.lang.String str7 = item3.toString();
        item3.quality = (byte) 1;
        java.lang.String str10 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str12 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 100, 97" + "'", str7, "hi!, 100, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3342");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, -1, 1, 97", 1, 100);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3343");
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
        item3.quality = (byte) 10;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str17, "hi!, 52, 97, 0, 10");
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3344");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        item3.sellIn = 1;
        item3.quality = 0;
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97, -1, 52, 10, 97, 52, 97";
        item3.name = "hi!, -1, 10, -1, -1";
        item3.sellIn = (byte) 100;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3345");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.toString();
        java.lang.String str13 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (byte) -1;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 1, 10" + "'", str12, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3346");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.name;
        item3.quality = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = 0;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3347");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 97", (int) ' ', (int) (short) 100);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 97" + "'", str4, "hi!, 1, 97");
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3348");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = 0;
        int int11 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str14 = item3.toString();
        item3.name = "hi!, -1, 97, 100, 100, 0, 100";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 52, 0" + "'", str14, "hi!, 52, 0");
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3349");
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
        java.lang.String str21 = item3.toString();
        item3.quality = (byte) -1;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 1, 10" + "'", str21, "hi!, 1, 10");
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3350");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        item3.sellIn = 100;
        java.lang.String str7 = item3.toString();
        item3.quality = (byte) 1;
        java.lang.String str10 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 100, 97" + "'", str7, "hi!, 100, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3351");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", (int) (byte) 1, (int) (byte) 0);
        item3.quality = (short) 0;
        item3.quality = 'a';
        item3.name = "hi!, 1, 10, -1, 35";
        int int10 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3352");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.quality;
        item3.quality = (short) 0;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater7.update();
        java.lang.Class<?> wildcardClass12 = conjuredItemUpdater7.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3353");
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
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdater16.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater17);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3354");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 1, (-1));
        int int4 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 0;
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3355");
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
        item3.name = "hi!, -1, 0";
        int int19 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3356");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        item3.name = ", -1, 52";
        int int9 = item3.quality;
        int int10 = item3.quality;
        java.lang.Class<?> wildcardClass11 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3357");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) 'a', 0);
        item3.sellIn = (byte) 0;
        java.lang.String str6 = item3.toString();
        item3.sellIn = 10;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 10, 0, 0" + "'", str6, "hi!, -1, 10, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3358");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdater9.update();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdater9.update();
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdater11.update();
        java.lang.Class<?> wildcardClass13 = itemUpdater12.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3359");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10, 35, 97", 100, 35);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3360");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97, 10, 1", (int) '#', (int) (byte) -1);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", -1, 97, 10, 1" + "'", str4, ", -1, 97, 10, 1");
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3361");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (byte) 0;
        item3.name = "hi!, 10, 10";
        java.lang.String str10 = item3.name;
        int int11 = item3.quality;
        item3.name = "hi!, -1, 10, 0, 52";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater14.update();
        com.gildedrose.ItemUpdater itemUpdater16 = conjuredItemUpdater14.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 10, 10" + "'", str10, "hi!, 10, 10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3362");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 10", (int) (short) 10, (int) '#');
        item3.quality = (short) 100;
        item3.sellIn = (byte) -1;
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 10, 10" + "'", str8, "hi!, 10, 10");
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3363");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str10 = item3.name;
        item3.name = ", 100, 10, -1, 97";
        int int13 = item3.sellIn;
        int int14 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3364");
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
        int int18 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3365");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        item3.name = ", 100, 1";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdater8.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3366");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        java.lang.Class<?> wildcardClass8 = itemUpdater7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3367");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", 97, (int) '4');
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3368");
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
        java.lang.String str16 = item3.name;
        java.lang.String str17 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 52, 97" + "'", str10, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 52, 97" + "'", str16, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 52, 97, -1, 10" + "'", str17, "hi!, 52, 97, -1, 10");
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3369");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.name;
        item3.quality = (short) 1;
        item3.sellIn = ' ';
        item3.quality = (byte) 0;
        item3.quality = 1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3370");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52, 10, 97", 52, (int) (short) 10);
        item3.name = "hi!, -1, 0, 100, 97";
        item3.quality = (byte) 1;
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3371");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 97, -1, 10", (int) (short) -1, (int) (short) 0);
        item3.sellIn = (byte) 0;
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3372");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        item3.sellIn = (byte) 100;
        item3.quality = 35;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str9 = item3.toString();
        int int10 = item3.quality;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 100, 35" + "'", str9, "hi!, 100, 35");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3373");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10, 52, 10", (int) 'a', (int) (short) 1);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3374");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = ' ';
        int int13 = item3.sellIn;
        java.lang.String str14 = item3.toString();
        java.lang.String str15 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 1, 32" + "'", str14, "hi!, 1, 32");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3375");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) -1, 32);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3376");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str12 = item3.name;
        item3.name = "hi!, -1, 10";
        int int15 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater16 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdater16.update();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdater17.update();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater18);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3377");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.quality;
        item3.name = ", 52, -1";
        item3.name = "hi!, 100, 97, 100, 0";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1, 0, 0" + "'", str5, ", 100, 1, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3378");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52, 35, 97", 35, (int) (short) 10);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3379");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", (int) (byte) 100, (int) (short) -1);
        java.lang.String str4 = item3.toString();
        item3.name = "hi!, -1, 97, 0, 1, 10, 35";
        java.lang.String str7 = item3.name;
        item3.name = "hi!, 1, 32, 1, 97";
        item3.quality = 0;
        item3.quality = 'a';
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97, 1, -1, 100, -1" + "'", str4, "hi!, -1, 97, 1, -1, 100, -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97, 0, 1, 10, 35" + "'", str7, "hi!, -1, 97, 0, 1, 10, 35");
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3380");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 32, 10", (int) 'a', 0);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3381");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        item3.name = ", 100, 1";
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3382");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 52;
        int int10 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3383");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str9 = item3.toString();
        int int10 = item3.sellIn;
        item3.name = "hi!, 100, -1";
        item3.sellIn = (short) 1;
        java.lang.Class<?> wildcardClass15 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 97" + "'", str7, "hi!, 1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 97" + "'", str9, "hi!, 1, 97");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3384");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) (short) -1, 0);
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3385");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        item3.quality = 'a';
        java.lang.String str14 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 1, 97" + "'", str14, "hi!, 1, 97");
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3386");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.quality = 1;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int11 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3387");
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
        java.lang.String str16 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater17 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "";
        int int20 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, -1, 10" + "'", str14, "hi!, -1, 10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, -1, 10" + "'", str16, "hi!, -1, 10");
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3388");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = '#';
        item3.name = "hi!, 1, 10";
        java.lang.String str14 = item3.toString();
        item3.quality = 35;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 1, 10, -1, 35" + "'", str14, "hi!, 1, 10, -1, 35");
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3389");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1, -1, 1", (int) (byte) -1, (int) (byte) 1);
        int int4 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3390");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        item3.name = ", -1, 52";
        int int9 = item3.quality;
        int int10 = item3.quality;
        item3.sellIn = (byte) 1;
        java.lang.String str13 = item3.name;
        item3.name = "hi!, -1, 97, 100, 97";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ", -1, 52" + "'", str13, ", -1, 52");
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3391");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10", (int) (short) 1, 35);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3392");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int12 = item3.quality;
        item3.sellIn = 32;
        com.gildedrose.ItemUpdater itemUpdater15 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3393");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        item3.name = "hi!, 100, 10";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.name;
        int int12 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 100, 10" + "'", str11, "hi!, 100, 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3394");
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
        item3.name = "hi!, -1, 10";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 52, 97" + "'", str10, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 52, 97, -1, 10" + "'", str15, "hi!, 52, 97, -1, 10");
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3395");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 35, 100", (int) (byte) -1, 0);
        java.lang.String str4 = item3.toString();
        item3.sellIn = 97;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97, 35, 100, -1, 0" + "'", str4, "hi!, -1, 97, 35, 100, -1, 0");
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3396");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, -1", 0, 10);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3397");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", 10, 32);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = ' ';
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3398");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.quality;
        int int8 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97, -1, 52, 10, 97, 100, 10";
        java.lang.String str12 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1, 0, 0" + "'", str5, ", 100, 1, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 52, 97, -1, 52, 10, 97, 100, 10" + "'", str12, "hi!, 52, 97, -1, 52, 10, 97, 100, 10");
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3399");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdater10.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3400");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        int int8 = item3.quality;
        item3.name = "hi!, 52, 10";
        java.lang.String str11 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int13 = item3.quality;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 52, 10" + "'", str11, "hi!, 52, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3401");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.quality = (byte) 10;
        java.lang.String str8 = item3.name;
        item3.quality = 100;
        int int11 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3402");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        item3.name = "hi!, -1, 0";
        item3.sellIn = (byte) 0;
        item3.name = ", 52, 97";
        item3.name = "";
        item3.name = "hi!, -1, 97, 1, -1, -1, 1";
        java.lang.String str14 = item3.toString();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, -1, 97, 1, -1, -1, 1, 0, 0" + "'", str14, "hi!, -1, 97, 1, -1, -1, 1, 0, 0");
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3403");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 1", (int) (byte) 10, 32);
        item3.name = "hi!, -1, 0, 35, 32";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 0, 35, 32" + "'", str6, "hi!, -1, 0, 35, 32");
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3404");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        item3.sellIn = (short) 100;
        java.lang.String str13 = item3.name;
        item3.name = ", -1, 52, -1, 97";
        item3.name = ", -1, 97, 1, 0";
        int int18 = item3.quality;
        int int19 = item3.quality;
        java.lang.Class<?> wildcardClass20 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3405");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        int int7 = item3.sellIn;
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3406");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, 0", (int) (byte) 100, (int) (short) 100);
        java.lang.String str4 = item3.name;
        item3.name = "hi!, -1, 10, -1, -1, -1, 97";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1, 0, 0" + "'", str4, ", 100, 1, 0, 0");
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3407");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 97, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = '#';
        int int13 = item3.quality;
        int int14 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3408");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.sellIn;
        int int11 = item3.sellIn;
        int int12 = item3.quality;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3409");
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
        java.lang.Class<?> wildcardClass18 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3410");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.name = "hi!, 10, 0";
        java.lang.String str10 = item3.toString();
        java.lang.String str11 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 10, 0, -1, 1" + "'", str10, "hi!, 10, 0, -1, 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 10, 0, -1, 1" + "'", str11, "hi!, 10, 0, -1, 1");
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3411");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int6 = item3.quality;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (byte) 100;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int12 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 10, 0" + "'", str7, ", 100, 1, 10, 0");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3412");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass7 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1, 10, 0" + "'", str5, ", 100, 1, 10, 0");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3413");
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
        item3.quality = 'a';
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater20 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 10, 10" + "'", str17, "hi!, 10, 10");
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3414");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 1;
        item3.quality = 97;
        java.lang.String str14 = item3.toString();
        int int15 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 1, 97" + "'", str14, "hi!, 1, 97");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3415");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 97", (int) (byte) 100, 0);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = 'a';
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3416");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3417");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 35, 52", (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3418");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 10, 100);
        int int4 = item3.quality;
        item3.sellIn = '#';
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3419");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 32, (int) ' ');
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3420");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = 0;
        int int11 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater12.update();
        java.lang.Class<?> wildcardClass14 = conjuredItemUpdater12.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3421");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.sellIn = (short) -1;
        java.lang.String str10 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int12 = item3.quality;
        item3.name = ", -1, 97, 0, 1";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, -1, 1" + "'", str10, "hi!, -1, 1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3422");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 97", (int) (short) -1, 10);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3423");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 1, (-1));
        java.lang.String str4 = item3.toString();
        item3.quality = '4';
        item3.quality = 10;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97, 1, -1" + "'", str4, "hi!, -1, 97, 1, -1");
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3424");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 10", (int) ' ', (int) 'a');
        item3.quality = (byte) 100;
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3425");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.name;
        item3.quality = 97;
        java.lang.String str7 = item3.name;
        item3.sellIn = (-1);
        int int10 = item3.quality;
        java.lang.String str11 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", -1, 97" + "'", str11, ", -1, 97");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3426");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (int) (byte) 10, (-1));
        int int4 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdater8.update();
        java.lang.Class<?> wildcardClass10 = itemUpdater8.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3427");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.name = ", 100, 10";
        item3.quality = (short) 0;
        int int9 = item3.quality;
        java.lang.String str10 = item3.name;
        int int11 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", 100, 10" + "'", str10, ", 100, 10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3428");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", (int) (byte) 10, 10);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3429");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, -1, 97", (int) (byte) 10, (int) (short) 100);
        item3.name = "hi!, 32, 97, 32, 35";
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3430");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        int int8 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3431");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52, 10, 97", 52, (int) (short) 10);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3432");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, -1, 97", (int) (byte) 10, (int) (short) 100);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3433");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, -1, 97", 52, (int) (byte) 100);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3434");
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
        item3.name = "hi!, 1, 10, 1, 97";
        java.lang.String str20 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ", -1, 52" + "'", str14, ", -1, 52");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ", -1, 52, 1, 97" + "'", str15, ", -1, 52, 1, 97");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 1, 10, 1, 97, 10, 97" + "'", str20, "hi!, 1, 10, 1, 97, 10, 97");
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3435");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, 0, 1, 32, -1, 0, -1, -1", (int) (byte) 1, 52);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3436");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52, -1, 97", 52, (-1));
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass5 = itemUpdater4.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3437");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, -1", (int) '#', (-1));
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3438");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, (int) (short) 100);
        item3.sellIn = 32;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3439");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int11 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3440");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10", (int) (short) 1, 35);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3441");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1", (int) (byte) 10, 0);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 1" + "'", str4, "hi!, -1, 1");
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3442");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        item3.quality = 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = 'a';
        int int14 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3443");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10", (int) 'a', (int) (short) 1);
        item3.name = "hi!, 52, 97";
        java.lang.String str6 = item3.name;
        item3.name = ", -1, 97, 10, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater9.update();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 52, 97" + "'", str6, "hi!, 52, 97");
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3444");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater12.update();
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater12.update();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdater14.update();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 10" + "'", str11, "hi!, -1, 10");
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3445");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.quality;
        java.lang.String str6 = item3.toString();
        int int7 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 32, 97" + "'", str6, "hi!, 32, 97");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3446");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 97, 10", (int) '#', 32);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3447");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 100, 52);
        item3.sellIn = ' ';
        java.lang.String str6 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 97" + "'", str6, "hi!, -1, 97");
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3448");
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
        item3.sellIn = 10;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 52, 10, 1, 10" + "'", str16, "hi!, 52, 10, 1, 10");
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3449");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 10, -1", 100, 100);
        item3.sellIn = 0;
        java.lang.String str6 = item3.name;
        int int7 = item3.sellIn;
        item3.name = "hi!, -1, 10, 52, 0";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 10, -1" + "'", str6, ", 10, -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3450");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 1", 35, 0);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3451");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        int int4 = item3.sellIn;
        int int5 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater9.update();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdater10.update();
        java.lang.Class<?> wildcardClass13 = itemUpdater10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3452");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) (short) 0, (int) '#');
        item3.name = "hi!, 52, 97, 52, -1, 52, 97";
        int int6 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3453");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10, 1, 10", (int) (byte) 100, 97);
        item3.name = ", 100, 10, -1, 97";
        item3.quality = (byte) 100;
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3454");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.quality = '4';
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater8.update();
        java.lang.Class<?> wildcardClass11 = conjuredItemUpdater8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3455");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 100, 52", 0, (int) (byte) 0);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97, 100, 52" + "'", str4, "hi!, -1, 97, 100, 52");
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3456");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "";
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (byte) 10;
        item3.sellIn = 0;
        java.lang.String str15 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", -1, 97" + "'", str9, ", -1, 97");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3457");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        item3.quality = (short) 0;
        item3.quality = '4';
        java.lang.Class<?> wildcardClass14 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3458");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", 1, 97);
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1, 1, 97" + "'", str4, ", 100, 1, 1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3459");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 1, (-1));
        item3.sellIn = 97;
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3460");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        item3.quality = 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 0;
        java.lang.String str14 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3461");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, -1", 0, 100);
        item3.quality = 'a';
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3462");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        int int9 = item3.quality;
        java.lang.String str10 = item3.name;
        int int11 = item3.quality;
        item3.sellIn = 100;
        item3.sellIn = 0;
        java.lang.String str16 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater17 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ", 0, 97" + "'", str16, ", 0, 97");
        org.junit.Assert.assertNotNull(itemUpdater17);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3463");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        int int12 = item3.quality;
        java.lang.String str13 = item3.name;
        item3.quality = (byte) 100;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3464");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        int int8 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdater9.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3465");
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
        java.lang.String str14 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, -1, 100" + "'", str14, "hi!, -1, 100");
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3466");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.sellIn;
        int int5 = item3.quality;
        item3.quality = ' ';
        int int8 = item3.quality;
        java.lang.String str9 = item3.toString();
        item3.sellIn = 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 100, 1, 10, 32" + "'", str9, ", 100, 1, 10, 32");
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3467");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 0", (int) (byte) 10, 100);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3468");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.name;
        item3.quality = (short) 1;
        item3.sellIn = (short) -1;
        item3.name = ", -1, -1";
        java.lang.String str16 = item3.toString();
        item3.name = "hi!, 1, 1, -1, 52, 32, 32";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ", -1, -1, -1, 1" + "'", str16, ", -1, -1, -1, 1");
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3469");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.name;
        item3.name = "hi!, -1, 97, 1, -1";
        int int7 = item3.sellIn;
        item3.quality = (short) 0;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater10.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3470");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        int int12 = item3.quality;
        item3.quality = '4';
        item3.name = "";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater17 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater18 = conjuredItemUpdater17.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(itemUpdater18);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3471");
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
        int int16 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater17 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3472");
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
        com.gildedrose.ItemUpdater itemUpdater20 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str21 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater22 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, -1, 10" + "'", str16, "hi!, -1, 10");
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 52, 97, 0, 10, 52, 10" + "'", str21, "hi!, 52, 97, 0, 10, 52, 10");
        org.junit.Assert.assertNotNull(itemUpdater22);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3473");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.name;
        java.lang.String str12 = item3.name;
        item3.sellIn = 10;
        java.lang.String str15 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 10, 10" + "'", str15, "hi!, 10, 10");
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3474");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 100, 97";
        item3.sellIn = 100;
        item3.quality = (short) 1;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3475");
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
        int int15 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 10" + "'", str11, "hi!, -1, 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, -1, 10" + "'", str13, "hi!, -1, 10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3476");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 52, 97", (int) (byte) 100, (int) '4');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (byte) 100;
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3477");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 10", (int) (short) 100, 100);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, 10" + "'", str4, "hi!, 10, 10");
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3478");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.name = "hi!, 10, 0";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (short) 10;
        java.lang.Class<?> wildcardClass13 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3479");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        java.lang.String str7 = item3.name;
        int int8 = item3.sellIn;
        item3.sellIn = 'a';
        item3.sellIn = 10;
        item3.name = "hi!, 100, 10";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str16 = item3.name;
        int int17 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 100, 10" + "'", str16, "hi!, 100, 10");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3480");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, -1, 52", 100, 0);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3481");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0, 100, 97", (int) (short) 100, 0);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3482");
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
        item3.sellIn = 10;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3483");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = 0;
        item3.quality = (-1);
        java.lang.String str13 = item3.name;
        item3.sellIn = (short) 1;
        int int16 = item3.sellIn;
        int int17 = item3.quality;
        item3.sellIn = 100;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3484");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", 0, 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.name;
        item3.quality = (byte) 1;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 10" + "'", str6, "hi!, -1, 10");
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3485");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) -1, (int) (byte) 10);
        item3.quality = (-1);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3486");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10", 0, (-1));
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 100;
        java.lang.String str7 = item3.name;
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str7, "hi!, 52, 97, 0, 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str8, "hi!, 52, 97, 0, 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str9, "hi!, 52, 97, 0, 10");
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3487");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.quality;
        java.lang.String str7 = item3.name;
        item3.quality = 52;
        java.lang.String str10 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 1, 52" + "'", str10, "hi!, 1, 52");
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3488");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 97, 32", (int) (short) 0, 35);
        item3.sellIn = (byte) 0;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, 97, 32" + "'", str7, "hi!, 52, 97, 97, 32");
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3489");
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
        com.gildedrose.ItemUpdater itemUpdater18 = conjuredItemUpdater17.update();
        java.lang.Class<?> wildcardClass19 = conjuredItemUpdater17.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3490");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        int int6 = item3.quality;
        item3.sellIn = (byte) 100;
        java.lang.String str9 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1, 0, 0" + "'", str5, ", 100, 1, 0, 0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 100, 1" + "'", str9, ", 100, 1");
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3491");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", (int) (short) 1, (-1));
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3492");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.toString();
        item3.quality = '#';
        item3.name = "hi!, 52, 10, 1, 10, 10, 100";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1, 10, 0" + "'", str6, ", 100, 1, 10, 0");
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3493");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) 0, (int) (byte) 1);
        item3.sellIn = (byte) -1;
        int int6 = item3.quality;
        item3.sellIn = (short) 10;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3494");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, 0", (int) 'a', 52);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3495");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str5 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater6.update();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3496");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.quality = 32;
        item3.sellIn = 0;
        item3.quality = '4';
        item3.sellIn = 52;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 97" + "'", str7, "hi!, 1, 97");
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3497");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10, 1, 10, 10, -1", (int) '4', 100);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 10, 1, 10, 10, -1" + "'", str4, "hi!, 52, 10, 1, 10, 10, -1");
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3498");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        item3.sellIn = 10;
        item3.sellIn = (-1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3499");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 100", 10, (int) '#');
        int int4 = item3.quality;
        item3.quality = 52;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest6.test3500");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.toString();
        int int12 = item3.quality;
        java.lang.String str13 = item3.toString();
        item3.quality = (short) 100;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 10" + "'", str11, "hi!, -1, 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, -1, 10" + "'", str13, "hi!, -1, 10");
    }
}

