package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4001");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        int int10 = item3.quality;
        int int11 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4002");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 97, 32", (int) (short) 100, (int) ' ');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4003");
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
        item3.name = ", -1, 52, 1, -1";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4004");
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
        item3.name = "hi!";
        item3.quality = (short) 1;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4005");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        int int8 = item3.sellIn;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (byte) 100;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4006");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.quality = 1;
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (byte) 10;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4007");
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
        item3.name = "hi!, -1, 97, 100, 52";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4008");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10", (int) '#', 0);
        item3.quality = 97;
        int int6 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater7.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4009");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 0, 1", (int) ' ', (int) 'a');
        item3.name = "hi!, 10, 0, -1, 1, 97, 10";
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4010");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 32, 10, -1, -1", (int) (byte) 0, 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4011");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0, 97, 100", (int) (byte) 0, 0);
        item3.quality = 0;
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4012");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (-1), (int) (byte) -1);
        int int4 = item3.quality;
        int int5 = item3.quality;
        item3.quality = 35;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4013");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.quality;
        item3.quality = (short) 0;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdater11.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4014");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdater6.update();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4015");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        item3.name = "hi!, 52, 10, 1, 10, 10, 100";
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1, 10, 0" + "'", str5, ", 100, 1, 10, 0");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4016");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str5 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4017");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str9 = item3.name;
        java.lang.String str10 = item3.toString();
        item3.sellIn = '#';
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, -1, 10" + "'", str10, "hi!, -1, 10");
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4018");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, -1", (int) (byte) 100, 32);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4019");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52, 10, 97, -1, 0", (int) '4', (int) '4');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, -1, 97, 1, -1, 32, 97, 52, 10";
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4020");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        java.lang.String str10 = item3.name;
        item3.name = "";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater13.update();
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater13.update();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdater15.update();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4021");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", (int) (short) -1, (int) (byte) 100);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 10, -1, 100" + "'", str4, "hi!, -1, 10, -1, 100");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4022");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.name;
        item3.quality = 97;
        java.lang.String str7 = item3.name;
        int int8 = item3.sellIn;
        item3.quality = '4';
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4023");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = '#';
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str13 = item3.name;
        item3.quality = 97;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4024");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int12 = item3.quality;
        int int13 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4025");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater8.update();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4026");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, -1, 1", (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4027");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", (int) (short) 1, 32);
        java.lang.String str4 = item3.name;
        item3.name = ", 100, 1, 0, 0";
        java.lang.String str7 = item3.name;
        item3.sellIn = (byte) 1;
        java.lang.String str10 = item3.name;
        java.lang.String str11 = item3.name;
        int int12 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 97" + "'", str4, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 0, 0" + "'", str7, ", 100, 1, 0, 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", 100, 1, 0, 0" + "'", str10, ", 100, 1, 0, 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", 100, 1, 0, 0" + "'", str11, ", 100, 1, 0, 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4028");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 0;
        java.lang.String str15 = item3.toString();
        item3.name = "hi!, 100, 35";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 1, 0" + "'", str15, "hi!, 1, 0");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4029");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, 0, 1, 10", (int) (short) 10, (int) (short) -1);
        item3.quality = (short) 10;
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4030");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.quality;
        item3.quality = (short) 0;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater7.update();
        java.lang.Class<?> wildcardClass14 = itemUpdater13.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4031");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", 97, 1);
        item3.quality = '#';
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4032");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 10", (int) 'a', (int) '4');
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4033");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52, 10, 97, 52, 10", (int) 'a', 100);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4034");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.toString();
        item3.quality = (byte) 100;
        java.lang.String str12 = item3.name;
        int int13 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4035");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10, -1, 97", 0, (int) ' ');
        item3.name = "hi!, 100, -1, 1, 97";
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4036");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 10, 52", 1, 0);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1, 10, 52" + "'", str5, ", 100, 1, 10, 52");
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4037");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10, 1, 0", (int) (short) 10, (int) (short) 10);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 52, 97, 0, 10, 1, 0" + "'", str5, "hi!, 52, 97, 0, 10, 1, 0");
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4038");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10", (int) (byte) 10, (int) ' ');
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4039");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 97, 1";
        item3.sellIn = 97;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4040");
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
        com.gildedrose.ItemUpdater itemUpdater16 = conjuredItemUpdater11.update();
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
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4041");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (-1), 1);
        java.lang.String str4 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", -1, 52" + "'", str4, ", -1, 52");
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4042");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 35, 100", (int) (byte) -1, 0);
        java.lang.String str4 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdater7.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97, 35, 100, -1, 0" + "'", str4, "hi!, -1, 97, 35, 100, -1, 0");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4043");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10", (int) (short) 10, 0);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4044");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10, -1, 97", 0, (int) '#');
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4045");
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
        java.lang.String str19 = item3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ", 100, 10, -1, 97, 52, 52" + "'", str19, ", 100, 10, -1, 97, 52, 52");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4046");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        item3.quality = 0;
        int int6 = item3.quality;
        item3.name = "hi!, 100, 10, 1, 35";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4047");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.name;
        java.lang.String str12 = item3.toString();
        java.lang.String str13 = item3.toString();
        int int14 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 1, 10" + "'", str12, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 1, 10" + "'", str13, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4048");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1, -1, 1", (int) (byte) 0, 10);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4049");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52, 52, 10", (int) (short) 1, (int) 'a');
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4050");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str7 = item3.toString();
        item3.sellIn = (short) -1;
        item3.name = "";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 0, 0" + "'", str7, ", 100, 1, 0, 0");
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4051");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        int int5 = item3.quality;
        java.lang.String str6 = item3.name;
        item3.name = ", 100, 1, 10, 0";
        item3.quality = 97;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4052");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int9 = item3.quality;
        item3.name = "hi!, 32, 97";
        item3.sellIn = (short) 10;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4053");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        int int4 = item3.sellIn;
        int int5 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = ", 10, -1, 0, 97";
        item3.quality = (-1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4054");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        item3.sellIn = 'a';
        item3.sellIn = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int11 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4055");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10", 10, 10);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 100, 97, 100, 0, 97, 100";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4056");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        int int12 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (byte) 0;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4057");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.toString();
        int int9 = item3.quality;
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str8, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4058");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        int int7 = item3.sellIn;
        int int8 = item3.quality;
        item3.sellIn = 0;
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.name;
        item3.sellIn = ' ';
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater16 = conjuredItemUpdater15.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", 100, 1, 0, -1" + "'", str11, ", 100, 1, 0, -1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ", 100, 1" + "'", str12, ", 100, 1");
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4059");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        item3.quality = (short) 10;
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4060");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater8.update();
        java.lang.Class<?> wildcardClass12 = itemUpdater11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4061");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.quality = (byte) 0;
        java.lang.String str10 = item3.name;
        item3.sellIn = 1;
        java.lang.String str13 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 10, -1" + "'", str7, ", 10, -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4062");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater11.update();
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater11.update();
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4063");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int10 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = '4';
        item3.quality = 97;
        com.gildedrose.ItemUpdater itemUpdater16 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4064");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10, 1, 97", (-1), (int) ' ');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4065");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int13 = item3.quality;
        int int14 = item3.quality;
        java.lang.String str15 = item3.toString();
        item3.quality = (short) 100;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, -1, 10" + "'", str15, "hi!, -1, 10");
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4066");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", 97, (int) (short) 1);
        item3.name = ", 100, 1";
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = '4';
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1" + "'", str6, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4067");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        java.lang.String str12 = item3.name;
        item3.quality = 35;
        java.lang.String str15 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4068");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        item3.quality = (byte) -1;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!";
        item3.name = ", 100, 1, 0, 0";
        int int18 = item3.quality;
        int int19 = item3.quality;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4069");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) (short) 100, 97);
        item3.sellIn = 100;
        java.lang.String str6 = item3.toString();
        item3.quality = 97;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 0, 100, 97" + "'", str6, "hi!, -1, 0, 100, 97");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4070");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, 0", 1, (int) (short) -1);
        item3.quality = (short) 10;
        item3.sellIn = (byte) 10;
        item3.name = "hi!, 100, 97, 100, 0";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 100, 97, 100, 0, 10, 10" + "'", str11, "hi!, 100, 97, 100, 0, 10, 10");
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4071");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        item3.quality = (short) -1;
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, -1" + "'", str7, "hi!, -1, -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, -1" + "'", str8, "hi!, -1, -1");
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4072");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int11 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str13 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = 35;
        item3.quality = (short) 10;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 1, 10" + "'", str13, "hi!, 1, 10");
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4073");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.quality;
        item3.quality = 100;
        item3.name = "hi!, -1, 10, 52, 0";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int10 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, -1, 97, 1, -1, 100, 10";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4074");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.name;
        item3.name = "hi!, -1, 97, 1, -1";
        int int7 = item3.sellIn;
        item3.sellIn = (short) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4075");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = 0;
        int int11 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str14 = item3.toString();
        int int15 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 52, 0" + "'", str14, "hi!, 52, 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4076");
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
        java.lang.String str18 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater19 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass20 = itemUpdater19.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4077");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4078");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 100, 52", 35, (int) (short) 1);
        java.lang.String str4 = item3.toString();
        item3.sellIn = ' ';
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1, 100, 52, 35, 1" + "'", str4, ", 100, 1, 100, 52, 35, 1");
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4079");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52, -1, 97", (int) (byte) 100, (int) ' ');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", -1, 52, -1, 97, 100, 32" + "'", str5, ", -1, 52, -1, 97, 100, 32");
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4080");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.quality;
        java.lang.String str12 = item3.toString();
        item3.sellIn = 'a';
        java.lang.String str15 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, -1, 10" + "'", str12, "hi!, -1, 10");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 97, 10" + "'", str15, "hi!, 97, 10");
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4081");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int8 = item3.sellIn;
        int int9 = item3.quality;
        int int10 = item3.sellIn;
        item3.quality = '4';
        int int13 = item3.sellIn;
        item3.sellIn = 52;
        java.lang.Class<?> wildcardClass16 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4082");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        java.lang.String str10 = item3.name;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4083");
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
        item3.name = "hi!, -1, 0, 0, 10";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4084");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 100, 52", (int) (byte) 0, (int) (byte) 100);
        item3.quality = (byte) 1;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 100, 52" + "'", str7, ", 100, 1, 100, 52");
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4085");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4086");
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
        com.gildedrose.ItemUpdater itemUpdater18 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater19 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 52, 97, -1, 52, 10, 10" + "'", str14, "hi!, 52, 97, -1, 52, 10, 10");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater19);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4087");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.name;
        item3.quality = (byte) 0;
        int int7 = item3.quality;
        int int8 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4088");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        item3.name = "hi!, 100, 10";
        int int10 = item3.sellIn;
        java.lang.String str11 = item3.name;
        int int12 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 100, 10" + "'", str11, "hi!, 100, 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4089");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.toString();
        int int12 = item3.quality;
        java.lang.String str13 = item3.toString();
        item3.quality = (byte) 1;
        int int16 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater17 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 10" + "'", str11, "hi!, -1, 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, -1, 10" + "'", str13, "hi!, -1, 10");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4090");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = itemUpdater6.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1, 0, 0" + "'", str5, ", 100, 1, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4091");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.name;
        int int10 = item3.quality;
        java.lang.String str11 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater12.update();
        java.lang.Class<?> wildcardClass14 = conjuredItemUpdater12.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4092");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        java.lang.String str4 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        java.lang.Class<?> wildcardClass7 = itemUpdater6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", -1, 52" + "'", str4, ", -1, 52");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4093");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10", 1, (int) (short) 0);
        item3.name = "";
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.name;
        int int9 = item3.quality;
        java.lang.String str10 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 1, 0" + "'", str7, ", 1, 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4094");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.toString();
        item3.sellIn = (short) -1;
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, 97" + "'", str5, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4095");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 0, 1", (int) (short) 0, (int) (byte) 10);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4096");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 1, 10" + "'", str12, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4097");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.quality = 97;
        item3.name = "hi!, -1, 10, -1, -1";
        java.lang.String str10 = item3.toString();
        java.lang.Class<?> wildcardClass11 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, -1, 10, -1, -1, -1, 97" + "'", str10, "hi!, -1, 10, -1, -1, -1, 97");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4098");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 100;
        int int9 = item3.quality;
        int int10 = item3.quality;
        int int11 = item3.quality;
        item3.quality = 35;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4099");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = 0;
        int int11 = item3.quality;
        int int12 = item3.quality;
        int int13 = item3.quality;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4100");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = 97;
        item3.quality = 1;
        java.lang.String str16 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4101");
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
        int int19 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, -1, 1" + "'", str14, "hi!, -1, 1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4102");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 1, 97", 35, (int) ' ');
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4103");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        int int4 = item3.sellIn;
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.name;
        item3.name = "hi!, 52, 97, 97, 10";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4104");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        item3.quality = (short) 0;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater12.update();
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater12.update();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4105");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) 100, 97);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4106");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str6 = item3.name;
        int int7 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4107");
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
        int int21 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater22 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = 1;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4108");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        java.lang.String str9 = item3.toString();
        int int10 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", -1, 97" + "'", str9, ", -1, 97");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4109");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10", 1, (int) (byte) 0);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4110");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        item3.name = ", 100, 1";
        java.lang.String str7 = item3.toString();
        item3.quality = '#';
        java.lang.String str10 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, -1, 97" + "'", str7, ", 100, 1, -1, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", 100, 1" + "'", str10, ", 100, 1");
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4111");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1, 32, 97, 1, 35", (int) (byte) 10, (int) (short) -1);
        int int4 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4112");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 10, -1, 97" + "'", str4, ", 100, 10, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4113");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (-1), 1);
        int int4 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4114");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", 97, (int) (short) 1);
        item3.quality = 'a';
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.sellIn = 1;
        int int10 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", -1, 97, 97, 97" + "'", str7, ", -1, 97, 97, 97");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4115");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 32, 97", (int) 'a', (int) (byte) 100);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = 0;
        item3.sellIn = (-1);
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4116");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater8.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 97" + "'", str7, "hi!, 1, 97");
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4117");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.quality = (byte) 10;
        java.lang.String str8 = item3.name;
        item3.sellIn = (byte) 100;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4118");
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
        item3.sellIn = '#';
        int int22 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str17, "hi!, 52, 97, 0, 10");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4119");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", (int) (short) 1, 32);
        java.lang.String str4 = item3.name;
        item3.name = ", 100, 1, 0, 0";
        java.lang.String str7 = item3.name;
        item3.sellIn = (byte) 1;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int11 = item3.sellIn;
        int int12 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 97" + "'", str4, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 0, 0" + "'", str7, ", 100, 1, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4120");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.name = ", 100, 10";
        int int7 = item3.sellIn;
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        item3.name = "hi!, 52, 97, 0, 10, 1, 0";
        java.lang.String str12 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 100, 10" + "'", str8, ", 100, 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 100, 10, 10, 0" + "'", str9, ", 100, 10, 10, 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 52, 97, 0, 10, 1, 0, 10, 0" + "'", str12, "hi!, 52, 97, 0, 10, 1, 0, 10, 0");
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4121");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 32, 97", 10, 0);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4122");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        item3.name = ", -1, 52";
        item3.quality = (-1);
        int int11 = item3.quality;
        item3.sellIn = (byte) 10;
        item3.quality = (byte) 0;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4123");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.quality;
        item3.quality = 100;
        int int7 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str9 = item3.name;
        java.lang.String str10 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, -1, 100" + "'", str10, "hi!, -1, 100");
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4124");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.name = "hi!, 10, 0";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdater10.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4125");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.toString();
        int int9 = item3.quality;
        item3.quality = (short) 1;
        int int12 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater13.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str8, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4126");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", (int) (byte) 10, 97);
        java.lang.String str4 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, -1, 0, -1, 100";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", -1, 97, 10, 97" + "'", str4, ", -1, 97, 10, 97");
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4127");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", 0, (int) (byte) 10);
        item3.quality = ' ';
        item3.name = "";
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4128");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.quality;
        int int8 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97, -1, 52, 10, 97, 100, 10";
        java.lang.String str12 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1, 0, 0" + "'", str5, ", 100, 1, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 52, 97, -1, 52, 10, 97, 100, 10, 0, 0" + "'", str12, "hi!, 52, 97, -1, 52, 10, 97, 100, 10, 0, 0");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4129");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 97, 97";
        item3.name = ", 100, 1, 100, 52";
        item3.quality = ' ';
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 1, 1, -1, 52";
        java.lang.String str17 = item3.toString();
        java.lang.String str18 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 1, 1, -1, 52, 32, 32" + "'", str17, "hi!, 1, 1, -1, 52, 32, 32");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 1, 1, -1, 52, 32, 32" + "'", str18, "hi!, 1, 1, -1, 52, 32, 32");
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4130");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        int int8 = item3.quality;
        item3.name = "hi!, 52, 10";
        item3.sellIn = (byte) 100;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 0";
        com.gildedrose.ItemUpdater itemUpdater16 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4131");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, 10", (int) ' ', 0);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4132");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        java.lang.String str10 = item3.name;
        item3.name = "";
        item3.quality = 0;
        item3.name = ", 100, 1, 0, -1";
        item3.sellIn = 0;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4133");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.toString();
        int int13 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater14.update();
        com.gildedrose.ItemUpdater itemUpdater16 = conjuredItemUpdater14.update();
        com.gildedrose.ItemUpdater itemUpdater17 = conjuredItemUpdater14.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 1, 10" + "'", str12, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater17);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4134");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, 0, 1, 32, -1, 0, -1, -1", (int) '4', (int) (short) -1);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4135");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str6 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 52;
        java.lang.String str13 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1" + "'", str6, ", 100, 1");
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 100, 1" + "'", str8, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 100, 1" + "'", str9, ", 100, 1");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ", 100, 1, 10, 52" + "'", str13, ", 100, 1, 10, 52");
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4136");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str12 = item3.toString();
        java.lang.String str13 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 1, 10" + "'", str12, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 1, 10" + "'", str13, "hi!, 1, 10");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4137");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", (int) (byte) 1, (int) (byte) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", -1, 97, 1, 0" + "'", str6, ", -1, 97, 1, 0");
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4138");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 100, (int) (short) 1);
        java.lang.String str4 = item3.toString();
        item3.quality = 97;
        int int7 = item3.sellIn;
        item3.name = ", 100, 10, 10, 100";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4139");
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
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdater16.update();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdater17.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater18);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4140");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) (short) 100, 97);
        item3.sellIn = 100;
        java.lang.String str6 = item3.toString();
        item3.sellIn = (short) 100;
        java.lang.String str9 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 0, 100, 97" + "'", str6, "hi!, -1, 0, 100, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 0" + "'", str9, "hi!, -1, 0");
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4141");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 52, 10", (int) (short) -1, (int) (byte) 10);
        item3.quality = (byte) 1;
        int int6 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4142");
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
        com.gildedrose.ItemUpdater itemUpdater15 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = ", 10, 100";
        int int18 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4143");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 0, 1", 35, (int) (byte) 100);
        int int4 = item3.sellIn;
        item3.quality = 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4144");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 0", (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4145");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int10 = item3.sellIn;
        int int11 = item3.sellIn;
        item3.sellIn = (byte) 1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass15 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4146");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        item3.quality = (byte) -1;
        item3.name = "hi!, 52, 97";
        item3.sellIn = (short) -1;
        int int17 = item3.quality;
        java.lang.String str18 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater19 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 52, 97" + "'", str18, "hi!, 52, 97");
        org.junit.Assert.assertNotNull(itemUpdater19);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4147");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        int int12 = item3.quality;
        java.lang.String str13 = item3.name;
        java.lang.String str14 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, -1, 10" + "'", str14, "hi!, -1, 10");
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4148");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int8 = item3.sellIn;
        int int9 = item3.quality;
        int int10 = item3.sellIn;
        item3.sellIn = 1;
        item3.name = ", 100, 1";
        item3.quality = 0;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4149");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        item3.name = "";
        item3.quality = (short) 1;
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4150");
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
        item3.quality = (short) 10;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 1, 1, -1, 97, 100, 10" + "'", str20, "hi!, 1, 1, -1, 97, 100, 10");
        org.junit.Assert.assertNotNull(itemUpdater21);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4151");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 10, 0, 1, 100", (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4152");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", (int) (byte) -1, (int) 'a');
        item3.quality = 10;
        int int6 = item3.sellIn;
        int int7 = item3.sellIn;
        item3.name = ", 100, 97";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4153");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97, 0, 1", (int) (byte) -1, 1);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4154");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.quality = '#';
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str12 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4155");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        java.lang.String str7 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str10 = item3.toString();
        item3.sellIn = 0;
        item3.sellIn = (byte) 1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", 100, 1, 10, -1" + "'", str10, ", 100, 1, 10, -1");
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4156");
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
        java.lang.String str20 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 10, 0, -1, 1, 97, 10" + "'", str19, "hi!, 10, 0, -1, 1, 97, 10");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 10, 0, -1, 1" + "'", str20, "hi!, 10, 0, -1, 1");
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4157");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater5.update();
        java.lang.Class<?> wildcardClass10 = conjuredItemUpdater5.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4158");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (int) (byte) 10, (-1));
        int int4 = item3.sellIn;
        int int5 = item3.quality;
        item3.sellIn = (byte) -1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4159");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, -1, 52", (int) '4', (int) (short) 10);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 10, -1, 52, 52, 10" + "'", str4, "hi!, -1, 10, -1, 52, 52, 10");
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4160");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10", (int) '#', 0);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdater8.update();
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4161");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) (byte) 0, 10);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4162");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97, 10, 1", 32, (-1));
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4163");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdater9.update();
        java.lang.Class<?> wildcardClass11 = itemUpdater10.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4164");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 52, 10", (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4165");
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
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater19 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4166");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        item3.name = "hi!, 100, 10";
        int int10 = item3.sellIn;
        int int11 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4167");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 'a';
        java.lang.String str8 = item3.name;
        item3.name = "hi!, 100, 97, 100, 0, -1, 97";
        int int11 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4168");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97, 1, 0", 10, (int) (short) 10);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", -1, 97, 1, 0" + "'", str4, ", -1, 97, 1, 0");
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4169");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.name;
        item3.quality = (short) 1;
        int int8 = item3.quality;
        java.lang.Class<?> wildcardClass9 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4170");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4171");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 52, -1", (int) '#', 0);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass5 = conjuredItemUpdater4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4172");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, 0", 1, (int) (short) -1);
        item3.quality = (short) 10;
        java.lang.String str6 = item3.toString();
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1, 0, 0, 1, 10" + "'", str6, ", 100, 1, 0, 0, 1, 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 0, 0" + "'", str7, ", 100, 1, 0, 0");
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4173");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52, 10, 97", 97, 1);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 97, -1, 52, 10, 97" + "'", str4, "hi!, 52, 97, -1, 52, 10, 97");
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4174");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10", (int) (short) -1, (int) (short) 1);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass6 = itemUpdater5.getClass();
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4175");
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
        com.gildedrose.ItemUpdater itemUpdater19 = conjuredItemUpdater16.update();
        com.gildedrose.ItemUpdater itemUpdater20 = conjuredItemUpdater16.update();
        com.gildedrose.ItemUpdater itemUpdater21 = conjuredItemUpdater16.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater21);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4176");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 1;
        item3.quality = 97;
        int int14 = item3.sellIn;
        java.lang.String str15 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 1, 97" + "'", str15, "hi!, 1, 97");
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4177");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        int int12 = item3.quality;
        item3.quality = '4';
        java.lang.String str15 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4178");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        item3.sellIn = 'a';
        int int8 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater9.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater9.update();
        java.lang.Class<?> wildcardClass12 = conjuredItemUpdater9.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4179");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 0, 1", 1, (int) (byte) 1);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97, 0, 1" + "'", str4, "hi!, -1, 97, 0, 1");
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4180");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        item3.quality = (short) 0;
        item3.sellIn = (-1);
        int int14 = item3.quality;
        java.lang.String str15 = item3.toString();
        java.lang.Class<?> wildcardClass16 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, -1, 0" + "'", str15, "hi!, -1, 0");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4181");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = 'a';
        item3.name = "hi!, 52, 97, -1, 1";
        java.lang.String str11 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 52, 97, -1, 1" + "'", str11, "hi!, 52, 97, -1, 1");
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4182");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str8 = item3.toString();
        item3.sellIn = (short) 100;
        java.lang.String str11 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdater13.update();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdater14.update();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdater14.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 10, -1" + "'", str8, ", 10, -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4183");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        int int6 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 1, 32";
        item3.sellIn = ' ';
        item3.sellIn = 10;
        java.lang.String str15 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 1, 32, 10, 97" + "'", str15, "hi!, 1, 32, 10, 97");
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4184");
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
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", -1, 52" + "'", str10, ", -1, 52");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4185");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.name;
        item3.sellIn = (byte) 10;
        int int15 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4186");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 1, (-1));
        int int4 = item3.sellIn;
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4187");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", 0, 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4188");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 10, 0", (int) (byte) 100, (int) (short) 1);
        java.lang.String str4 = item3.name;
        int int5 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1, 10, 0" + "'", str4, ", 100, 1, 10, 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4189");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 35", (int) 'a', (int) ' ');
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4190");
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
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4191");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 1, 97", 35, (int) ' ');
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4192");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        int int9 = item3.sellIn;
        java.lang.String str10 = item3.name;
        item3.sellIn = (short) -1;
        java.lang.String str13 = item3.name;
        item3.quality = '#';
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4193");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) 0, (int) (byte) 1);
        item3.sellIn = (short) 1;
        java.lang.String str6 = item3.toString();
        java.lang.String str7 = item3.toString();
        item3.sellIn = (byte) -1;
        item3.sellIn = 97;
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 1, 1" + "'", str6, "hi!, 1, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 1" + "'", str7, "hi!, 1, 1");
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4194");
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
        int int16 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4195");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) 'a', (int) (byte) 10);
        int int4 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdater7.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4196");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) 'a', 1);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str5 = item3.name;
        item3.quality = 0;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4197");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.name;
        java.lang.String str12 = item3.name;
        item3.quality = (short) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4198");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.sellIn = 1;
        item3.sellIn = '4';
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4199");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, 0, 1, 32, -1, 0", (int) (byte) -1, (int) (short) -1);
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1, 0, 0, 1, 32, -1, 0, -1, -1" + "'", str4, ", 100, 1, 0, 0, 1, 32, -1, 0, -1, -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4200");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 1, (-1));
        java.lang.String str4 = item3.toString();
        item3.quality = '4';
        int int7 = item3.quality;
        java.lang.String str8 = item3.toString();
        item3.name = "hi!, -1, 97, 100, 0";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater11.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97, 1, -1" + "'", str4, "hi!, -1, 97, 1, -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97, 1, 52" + "'", str8, "hi!, -1, 97, 1, 52");
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4201");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 52, -1", (int) (short) -1, (int) (short) -1);
        item3.quality = (byte) 10;
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4202");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 52, 97", (int) (byte) -1, 1);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 52, 97, -1, 1" + "'", str4, ", 52, 97, -1, 1");
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4203");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = 97;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (byte) -1;
        java.lang.String str17 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ", -1, 97" + "'", str17, ", -1, 97");
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4204");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '#', (int) (short) 0);
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4205");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int8 = item3.sellIn;
        int int9 = item3.quality;
        int int10 = item3.sellIn;
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.name;
        item3.sellIn = '4';
        java.lang.Class<?> wildcardClass15 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 97" + "'", str11, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4206");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.quality = 32;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (-1);
        int int13 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 97" + "'", str7, "hi!, 1, 97");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4207");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        item3.sellIn = (byte) -1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater12.update();
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater12.update();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4208");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 0, (int) (short) 1);
        java.lang.String str4 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97, 0, 1" + "'", str4, "hi!, -1, 97, 0, 1");
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4209");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 10", 97, 52);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4210");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.toString();
        item3.name = ", 100, 97, 32, 97";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 10" + "'", str11, "hi!, -1, 10");
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4211");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10", 0, (-1));
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater5.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater5.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4212");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = '#';
        item3.sellIn = (-1);
        item3.sellIn = 'a';
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4213");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = 100;
        item3.quality = 100;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4214");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 100, 52", 35, (int) (short) 1);
        java.lang.String str4 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 1, 100";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1, 100, 52, 35, 1" + "'", str4, ", 100, 1, 100, 52, 35, 1");
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4215");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 1", (int) (short) 1, (int) (short) 10);
        java.lang.String str4 = item3.name;
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 97, 1" + "'", str4, "hi!, 97, 1");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4216");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 1", (int) 'a', (int) (short) 100);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        int int6 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 97, 1" + "'", str5, "hi!, 97, 1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4217");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (-1));
        int int4 = item3.quality;
        item3.quality = 52;
        item3.quality = (short) 0;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4218");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        java.lang.String str11 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = 1;
        int int15 = item3.sellIn;
        java.lang.Class<?> wildcardClass16 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4219");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "";
        java.lang.Class<?> wildcardClass11 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4220");
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
        int int19 = item3.quality;
        item3.sellIn = 'a';
        item3.quality = 0;
        int int24 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4221");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 32, 10", (-1), (int) (byte) -1);
        item3.quality = 'a';
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 32, 10, -1, 97" + "'", str6, "hi!, 32, 10, -1, 97");
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4222");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.quality = 32;
        item3.name = ", 52, -1";
        item3.sellIn = 35;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 97" + "'", str7, "hi!, 1, 97");
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4223");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        item3.quality = 0;
        int int8 = item3.sellIn;
        int int9 = item3.sellIn;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4224");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", 0, (int) ' ');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4225");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int13 = item3.quality;
        int int14 = item3.quality;
        int int15 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater16 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str17 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4226");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) '4', (int) (byte) 0);
        item3.name = "";
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4227");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", 0, 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.sellIn;
        int int8 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, 10, 0, 0" + "'", str5, "hi!, -1, 10, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4228");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", 10, (int) '4');
        int int4 = item3.quality;
        int int5 = item3.quality;
        item3.sellIn = '4';
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4229");
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
        int int23 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater24 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str17, "hi!, 52, 97, 0, 10");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4230");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10", 97, (int) (byte) 0);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4231");
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
        int int22 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater23 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 52, 97, 52, -1" + "'", str15, "hi!, 52, 97, 52, -1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4232");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = 0;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 0" + "'", str9, "hi!, 1, 0");
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4233");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", 52, (int) (byte) 10);
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 10, 0, 52, 10" + "'", str5, "hi!, 10, 0, 52, 10");
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4234");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) -1;
        java.lang.String str10 = item3.toString();
        item3.name = ", 100, 1";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str14 = item3.toString();
        int int15 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", -1, -1" + "'", str10, ", -1, -1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ", 100, 1, -1, -1" + "'", str14, ", 100, 1, -1, -1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4235");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 10", 0, 97);
        int int4 = item3.quality;
        item3.name = "";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4236");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 100, 52", 35, (int) (short) 1);
        java.lang.String str4 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str7 = item3.name;
        int int8 = item3.quality;
        int int9 = item3.quality;
        item3.quality = (byte) 1;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1, 100, 52, 35, 1" + "'", str4, ", 100, 1, 100, 52, 35, 1");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 100, 52" + "'", str7, ", 100, 1, 100, 52");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4237");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 97";
        item3.name = "hi!, 10, 0, -1, 1, 97, 10";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4238");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = 'a';
        int int9 = item3.sellIn;
        int int10 = item3.quality;
        java.lang.String str11 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", 100, 1" + "'", str11, ", 100, 1");
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4239");
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
        com.gildedrose.ItemUpdater itemUpdater16 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = 100;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 1, 32" + "'", str14, "hi!, 1, 32");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4240");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        item3.sellIn = (short) 10;
        int int6 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4241");
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
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4242");
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
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater19 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater20 = conjuredItemUpdater19.update();
        com.gildedrose.ItemUpdater itemUpdater21 = conjuredItemUpdater19.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater21);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4243");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 0", (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4244");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.toString();
        int int5 = item3.sellIn;
        item3.name = "hi!, 52, 97, 52, -1";
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int10 = item3.quality;
        item3.name = "hi!, 52, 97, -1, 10, 100, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str15 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 10" + "'", str4, ", 100, 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 52, 97, -1, 10, 100, 97" + "'", str15, "hi!, 52, 97, -1, 10, 100, 97");
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4245");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str7 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = 0;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int12 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4246");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10", 10, (int) (byte) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass6 = itemUpdater5.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4247");
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
        com.gildedrose.ItemUpdater itemUpdater18 = conjuredItemUpdater17.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 52, 97" + "'", str10, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 52, 97, -1, 10" + "'", str15, "hi!, 52, 97, -1, 10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 52, 97, -1, 10" + "'", str16, "hi!, 52, 97, -1, 10");
        org.junit.Assert.assertNotNull(itemUpdater18);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4248");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, -1, 1";
        java.lang.Class<?> wildcardClass13 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4249");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        int int9 = item3.quality;
        item3.quality = (byte) 0;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4250");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", 97, (int) (short) 1);
        item3.name = ", 100, 1";
        item3.quality = (byte) 1;
        item3.sellIn = 52;
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4251");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        int int12 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass14 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4252");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.quality = (byte) 10;
        java.lang.String str8 = item3.name;
        item3.quality = '#';
        java.lang.String str11 = item3.toString();
        int int12 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater13 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int14 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 35" + "'", str11, "hi!, -1, 35");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4253");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        item3.sellIn = 'a';
        item3.name = "hi!, 32, 97, 32, 35, 10, 100";
        item3.quality = 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4254");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        java.lang.String str10 = item3.toString();
        item3.name = "hi!, -1, 97, 1, -1";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = ' ';
        int int16 = item3.quality;
        java.lang.Class<?> wildcardClass17 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", -1, 52, -1, 97" + "'", str10, ", -1, 52, -1, 97");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4255");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        item3.quality = (short) 0;
        item3.quality = '4';
        java.lang.String str14 = item3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 52, 52" + "'", str14, "hi!, 52, 52");
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4256");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.quality = 1;
        item3.quality = (byte) 10;
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str13 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, -1, 10" + "'", str13, "hi!, -1, 10");
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4257");
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
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater9.update();
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
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4258");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 0, 0", 1, 35);
        java.lang.String str4 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (-1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 10, 0, 0" + "'", str4, "hi!, -1, 10, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4259");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        int int4 = item3.sellIn;
        int int5 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int9 = item3.sellIn;
        int int10 = item3.sellIn;
        item3.quality = '4';
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4260");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        item3.name = "hi!, 100, 10";
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.name;
        java.lang.String str12 = item3.name;
        java.lang.String str13 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 100, 10" + "'", str11, "hi!, 100, 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 100, 10" + "'", str12, "hi!, 100, 10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 100, 10, -1, 97" + "'", str13, "hi!, 100, 10, -1, 97");
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4261");
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
        item3.quality = (short) -1;
        java.lang.Class<?> wildcardClass18 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4262");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = ' ';
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4263");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10", (int) (byte) -1, (int) 'a');
        item3.name = "hi!, 10, 0";
        java.lang.String str6 = item3.name;
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 'a';
        java.lang.String str12 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 10, 0" + "'", str6, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 10, 0, -1, 97" + "'", str12, "hi!, 10, 0, -1, 97");
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4264");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.quality = 97;
        item3.name = "hi!, -1, 10, -1, -1";
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4265");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = 0;
        int int11 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater12.update();
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater12.update();
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater12.update();
        com.gildedrose.ItemUpdater itemUpdater16 = conjuredItemUpdater12.update();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4266");
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
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass16 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4267");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        item3.sellIn = 1;
        item3.sellIn = ' ';
        item3.sellIn = 100;
        java.lang.Class<?> wildcardClass14 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4268");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", 10, (int) '4');
        item3.sellIn = 'a';
        item3.sellIn = (short) 100;
        java.lang.String str8 = item3.toString();
        item3.quality = (short) 1;
        java.lang.String str11 = item3.name;
        item3.name = "hi!, 100, 97";
        int int14 = item3.quality;
        java.lang.String str15 = item3.toString();
        item3.quality = 97;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 100, 1, 100, 52" + "'", str8, ", 100, 1, 100, 52");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", 100, 1" + "'", str11, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 100, 97, 100, 1" + "'", str15, "hi!, 100, 97, 100, 1");
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4269");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", (int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4270");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 97" + "'", str6, "hi!, -1, 97");
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4271");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass11 = itemUpdater10.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4272");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.quality = '4';
        item3.name = "hi!, 1, 1";
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.name;
        java.lang.String str10 = item3.name;
        int int11 = item3.sellIn;
        item3.sellIn = (short) -1;
        item3.quality = 0;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 1, 1, -1, 52" + "'", str8, "hi!, 1, 1, -1, 52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 1" + "'", str9, "hi!, 1, 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 1, 1" + "'", str10, "hi!, 1, 1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4273");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (short) -1, (int) ' ');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4274");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52, 10, 10", 32, (int) '#');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.Class<?> wildcardClass5 = conjuredItemUpdater4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4275");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10", (int) (byte) -1, 100);
        item3.name = "hi!";
        item3.sellIn = '4';
        item3.quality = 97;
        java.lang.String str10 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 52, 97" + "'", str10, "hi!, 52, 97");
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4276");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 100", (int) (byte) 0, (int) (byte) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4277");
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
        int int18 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4278");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 100, 52);
        item3.sellIn = ' ';
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.name;
        java.lang.String str8 = item3.toString();
        java.lang.Class<?> wildcardClass9 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97, 32, 52" + "'", str8, "hi!, -1, 97, 32, 52");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4279");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.toString();
        int int7 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1, 10, 0" + "'", str6, ", 100, 1, 10, 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4280");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater8.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4281");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 100, 0, 0, 35", (int) (short) -1, 0);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4282");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 97";
        int int8 = item3.quality;
        java.lang.String str9 = item3.name;
        int int10 = item3.sellIn;
        int int11 = item3.quality;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 100, 97" + "'", str9, ", 100, 97");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4283");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10, 1, 10, -1, 10", 1, 0);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4284");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10", 10, 10);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 100, 97, 100, 0, 97, 100";
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 100, 97, 100, 0, 97, 100" + "'", str7, "hi!, 100, 97, 100, 0, 97, 100");
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4285");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", 100, (int) (byte) 1);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4286");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (short) -1;
        int int10 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4287");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.toString();
        int int10 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 10, -1" + "'", str7, ", 10, -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 10, -1" + "'", str8, ", 10, -1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 10, -1" + "'", str9, ", 10, -1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4288");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10, 0, -1", (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4289");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 52, -1, 100, 10", (-1), 0);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4290");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        item3.name = ", 100, 1, 0, 0";
        item3.name = "hi!, 52, 97, -1, 52";
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4291");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 100, (int) 'a');
        item3.quality = ' ';
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4292");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.toString();
        int int10 = item3.sellIn;
        java.lang.String str11 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4293");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10", (int) '#', 0);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater6 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater4.update();
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4294");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        int int4 = item3.sellIn;
        int int5 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 10, 1, 10, 10, -1";
        java.lang.String str9 = item3.name;
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 10, 1, 10, 10, -1" + "'", str9, "hi!, 52, 10, 1, 10, 10, -1");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4295");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (byte) 10;
        int int8 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4296");
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
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdater18.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater19);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4297");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.quality = '#';
        int int10 = item3.sellIn;
        item3.name = "hi!, 52, 97";
        item3.name = "hi!, 1, 10";
        item3.quality = (byte) -1;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4298");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, 52, 10", (int) (short) -1, (int) (byte) 10);
        int int4 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4299");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        int int4 = item3.sellIn;
        int int5 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = ", 10, -1, 0, 97";
        java.lang.String str11 = item3.name;
        java.lang.String str12 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", 10, -1, 0, 97" + "'", str11, ", 10, -1, 0, 97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ", 10, -1, 0, 97, 100, 10" + "'", str12, ", 10, -1, 0, 97, 100, 10");
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4300");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 1;
        item3.quality = 97;
        item3.name = "";
        item3.sellIn = 10;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4301");
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
        int int23 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 10, 0, -1, 1, 97, 10" + "'", str19, "hi!, 10, 0, -1, 1, 97, 10");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4302");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 0", (int) (short) -1, (int) '4');
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4303");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str6 = item3.name;
        int int7 = item3.quality;
        java.lang.String str8 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = 1;
        int int12 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1" + "'", str6, ", 100, 1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 100, 1, 10, 0" + "'", str8, ", 100, 1, 10, 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4304");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = 35;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (byte) 100;
        item3.sellIn = 97;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4305");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.toString();
        item3.quality = (short) 10;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4306");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int8 = item3.sellIn;
        int int9 = item3.quality;
        int int10 = item3.sellIn;
        item3.sellIn = 1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater13.update();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdater14.update();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdater15.update();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4307");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52, 10, 97", 52, (int) (short) 10);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater6.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 52, 97, -1, 52, 10, 97, 52, 10" + "'", str5, "hi!, 52, 97, -1, 52, 10, 97, 52, 10");
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4308");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (byte) 1;
        item3.sellIn = (byte) 1;
        item3.sellIn = 10;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4309");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", (int) (short) 1, 32);
        java.lang.String str4 = item3.name;
        item3.name = ", 100, 1, 0, 0";
        java.lang.String str7 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdater8.update();
        java.lang.Class<?> wildcardClass11 = itemUpdater10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 97" + "'", str4, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 0, 0" + "'", str7, ", 100, 1, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4310");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 32, 97, 32, 35", (int) (short) 10, (int) (short) 100);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4311");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.toString();
        item3.quality = (byte) 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1" + "'", str6, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 10, 0" + "'", str7, ", 100, 1, 10, 0");
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4312");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", 0, (int) (short) 1);
        item3.quality = (short) -1;
        item3.sellIn = (short) 10;
        item3.quality = 10;
        int int10 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4313");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 35, 100", (int) (short) 1, 0);
        int int4 = item3.sellIn;
        int int5 = item3.quality;
        int int6 = item3.quality;
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97, 35, 100" + "'", str7, "hi!, -1, 97, 35, 100");
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4314");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 100, 52, 35, 1", (int) '#', 1);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4315");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 0, 0" + "'", str7, ", 100, 1, 0, 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 100, 1" + "'", str8, ", 100, 1");
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4316");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.name;
        int int10 = item3.quality;
        java.lang.String str11 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater12.update();
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater12.update();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdater14.update();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4317");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10, 10, 0", (int) '4', (int) '4');
        int int4 = item3.sellIn;
        int int5 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4318");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "hi!, 97, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int11 = item3.sellIn;
        item3.sellIn = (short) 10;
        java.lang.String str14 = item3.name;
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 97, 97" + "'", str14, "hi!, 97, 97");
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4319");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.name;
        item3.quality = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4320");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int11 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str13 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater14.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 1, 10" + "'", str13, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater15);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4321");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, 100", 0, 100);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4322");
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
        int int19 = item3.sellIn;
        item3.quality = (byte) -1;
        java.lang.Class<?> wildcardClass22 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, -1, 10" + "'", str16, "hi!, -1, 10");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4323");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        int int6 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = "";
        item3.quality = 32;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4324");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) -1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4325");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.name;
        item3.quality = (byte) 0;
        int int7 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.name = ", 100, 1, 0, 100, 1, 97";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4326");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", (int) 'a', 32);
        int int4 = item3.sellIn;
        item3.sellIn = 32;
        java.lang.String str7 = item3.toString();
        item3.sellIn = 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, 32, 32" + "'", str7, "hi!, 52, 97, 32, 32");
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4327");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        item3.quality = (byte) -1;
        item3.name = "hi!, 52, 97";
        java.lang.String str15 = item3.toString();
        int int16 = item3.sellIn;
        item3.quality = '4';
        item3.quality = 10;
        int int21 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater22 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 52, 97, 52, -1" + "'", str15, "hi!, 52, 97, 52, -1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(itemUpdater22);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4328");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        java.lang.String str10 = item3.toString();
        java.lang.String str11 = item3.name;
        item3.name = "hi!, 1, 10";
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", -1, 52, -1, 97" + "'", str10, ", -1, 52, -1, 97");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", -1, 52" + "'", str11, ", -1, 52");
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4329");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97";
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.toString();
        int int9 = item3.quality;
        item3.quality = (short) 1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (-1);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str8, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4330");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", 10, (int) '4');
        item3.sellIn = 0;
        item3.name = "hi!, -1, 10, 0, 35";
        java.lang.String str8 = item3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 10, 0, 35, 0, 52" + "'", str8, "hi!, -1, 10, 0, 35, 0, 52");
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4331");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        int int6 = item3.quality;
        java.lang.Class<?> wildcardClass7 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4332");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 1", (int) ' ', 100);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = conjuredItemUpdater4.update();
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdater5.update();
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4333");
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
        com.gildedrose.ItemUpdater itemUpdater18 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater18);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4334");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) 'a', (int) (short) 100);
        item3.sellIn = (short) -1;
        java.lang.String str6 = item3.toString();
        int int7 = item3.quality;
        item3.quality = 97;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 0, -1, 100" + "'", str6, "hi!, -1, 0, -1, 100");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4335");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.sellIn = (short) 0;
        item3.sellIn = (short) -1;
        item3.sellIn = '4';
        java.lang.String str11 = item3.toString();
        int int12 = item3.sellIn;
        int int13 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", 100, 1, 52, 0" + "'", str11, ", 100, 1, 52, 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4336");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 32", (int) 'a', 1);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4337");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        item3.name = ", -1, 52";
        item3.quality = (-1);
        int int11 = item3.quality;
        int int12 = item3.quality;
        java.lang.String str13 = item3.name;
        item3.sellIn = 0;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ", -1, 52" + "'", str13, ", -1, 52");
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4338");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.quality = (byte) -1;
        int int7 = item3.sellIn;
        int int8 = item3.quality;
        item3.sellIn = 0;
        int int11 = item3.sellIn;
        java.lang.String str12 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ", 100, 1" + "'", str12, ", 100, 1");
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4339");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int11 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str13 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = 35;
        int int17 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 1, 10" + "'", str13, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4340");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 100;
        item3.quality = 32;
        item3.quality = (byte) -1;
        item3.quality = (byte) -1;
        java.lang.String str15 = item3.toString();
        java.lang.String str16 = item3.toString();
        java.lang.String str17 = item3.name;
        int int18 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 100, -1" + "'", str15, "hi!, 100, -1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 100, -1" + "'", str16, "hi!, 100, -1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4341");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", 0, (int) (byte) 10);
        item3.quality = ' ';
        item3.name = ", 100, 1, 100, 52, 97, -1";
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4342");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 10", (int) (byte) -1, 100);
        item3.name = "hi!";
        item3.sellIn = '4';
        int int8 = item3.sellIn;
        item3.quality = (short) 0;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4343");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.quality = 'a';
        item3.name = ", 100, -1, -1, 10";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 97" + "'", str7, "hi!, 1, 97");
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4344");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0, -1, 100", (int) (byte) 10, 1);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4345");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        int int9 = item3.sellIn;
        java.lang.String str10 = item3.name;
        java.lang.String str11 = item3.name;
        java.lang.String str12 = item3.name;
        int int13 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4346");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdater4.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4347");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.toString();
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdater7.update();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 10" + "'", str4, ", 100, 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4348");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        int int4 = item3.sellIn;
        int int5 = item3.quality;
        java.lang.String str6 = item3.toString();
        int int7 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 97" + "'", str6, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4349");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        item3.name = ", -1, 52";
        item3.quality = (-1);
        int int11 = item3.quality;
        int int12 = item3.quality;
        java.lang.String str13 = item3.name;
        int int14 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ", -1, 52" + "'", str13, ", -1, 52");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4350");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, 52", (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4351");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 0, 35);
        java.lang.String str4 = item3.name;
        item3.quality = (byte) -1;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4352");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        item3.name = ", -1, 97, 10, 97";
        int int9 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4353");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1, 32, 97, 1, 35", (int) (byte) 10, (int) (short) -1);
        int int4 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = 1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4354");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str5 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater6.update();
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater6.update();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4355");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", 10, 1);
        java.lang.String str4 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", -1, 97" + "'", str4, ", -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", -1, 97" + "'", str7, ", -1, 97");
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4356");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", (int) 'a', (int) (short) 100);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4357");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.name;
        int int10 = item3.sellIn;
        item3.quality = (short) -1;
        item3.name = "hi!, 1, 1";
        java.lang.String str15 = item3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 1, 1, 52, -1" + "'", str15, "hi!, 1, 1, 52, -1");
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4358");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 100;
        int int9 = item3.quality;
        int int10 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str12 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4359");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        int int12 = item3.quality;
        int int13 = item3.sellIn;
        item3.name = "hi!, 1, 0";
        item3.sellIn = (byte) -1;
        item3.sellIn = ' ';
        item3.name = "hi!, -1, 97, 1, -1, 32, 97, -1, 10";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4360");
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
        com.gildedrose.ItemUpdater itemUpdater15 = conjuredItemUpdater12.update();
        com.gildedrose.ItemUpdater itemUpdater16 = conjuredItemUpdater12.update();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdater16.update();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdater16.update();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdater16.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater19);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4361");
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
        item3.quality = (-1);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater20 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater21 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str22 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, -1, 10" + "'", str14, "hi!, -1, 10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, -1, 10" + "'", str16, "hi!, -1, 10");
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, -1, -1" + "'", str22, "hi!, -1, -1");
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4362");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97", 97, (int) (short) 1);
        item3.name = ", 100, 1";
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1" + "'", str6, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1" + "'", str7, ", 100, 1");
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4363");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.quality = (byte) 10;
        java.lang.String str8 = item3.name;
        item3.quality = '#';
        java.lang.String str11 = item3.toString();
        java.lang.Class<?> wildcardClass12 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 35" + "'", str11, "hi!, -1, 35");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4364");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str5 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.toString();
        java.lang.Class<?> wildcardClass9 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4365");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 97", (int) ' ', (int) (short) 100);
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        item3.quality = 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdater9.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 1, 97, 32, 100" + "'", str5, "hi!, 1, 97, 32, 100");
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4366");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str12 = item3.name;
        item3.name = "hi!, 0, 10, 97, 52";
        int int15 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4367");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        item3.quality = 32;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater12.update();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 97" + "'", str7, "hi!, 1, 97");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4368");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 10;
        int int13 = item3.sellIn;
        item3.quality = '4';
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4369");
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
        java.lang.Class<?> wildcardClass14 = itemUpdater13.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4370");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.toString();
        item3.name = "hi!";
        item3.name = "hi!, -1, 1, 100, 97";
        item3.sellIn = 1;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 10" + "'", str11, "hi!, -1, 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, -1, 10" + "'", str12, "hi!, -1, 10");
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4371");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 100", (int) (short) 10, (int) '4');
        item3.sellIn = (byte) 0;
        item3.quality = 32;
        item3.sellIn = (short) 0;
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4372");
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
        int int18 = item3.sellIn;
        item3.sellIn = (short) 0;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4373");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = 0;
        item3.quality = '4';
        java.lang.String str13 = item3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 52, 52" + "'", str13, "hi!, 52, 52");
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4374");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.name;
        item3.quality = (byte) 0;
        java.lang.String str7 = item3.toString();
        item3.name = "hi!, 1, 100";
        int int10 = item3.quality;
        int int11 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 0" + "'", str7, "hi!, -1, 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4375");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 1;
        java.lang.String str12 = item3.toString();
        java.lang.Class<?> wildcardClass13 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 1, 1" + "'", str12, "hi!, 1, 1");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4376");
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
        int int21 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater22 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str23 = item3.name;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ", 100, 1, 100, 0" + "'", str23, ", 100, 1, 100, 0");
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4377");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        int int8 = item3.sellIn;
        item3.quality = '#';
        java.lang.String str11 = item3.name;
        java.lang.String str12 = item3.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 52, 35" + "'", str12, "hi!, 52, 35");
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4378");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) 100, 97);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4379");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater12 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 100, 97";
        int int15 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater16 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4380");
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
        item3.sellIn = 100;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4381");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        item3.quality = '#';
        int int10 = item3.sellIn;
        java.lang.String str11 = item3.name;
        item3.quality = (short) 10;
        item3.quality = (short) 0;
        int int16 = item3.quality;
        java.lang.Class<?> wildcardClass17 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4382");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 97, 10", (int) 'a', 10);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4383");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 100, 52);
        item3.sellIn = ' ';
        int int6 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97" + "'", str8, "hi!, -1, 97");
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4384");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1", (int) (byte) -1, (int) (short) 1);
        item3.name = "hi!, -1, 0";
        item3.sellIn = (short) 1;
        int int8 = item3.quality;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4385");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 97, 10, 1", (int) (short) 10, (int) (byte) 10);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str5 = item3.name;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 1, 97, 10, 1" + "'", str5, "hi!, 1, 97, 10, 1");
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4386");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        int int9 = item3.quality;
        item3.name = "hi!";
        java.lang.String str12 = item3.name;
        int int13 = item3.quality;
        item3.name = "";
        int int16 = item3.quality;
        java.lang.String str17 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ", -1, 97" + "'", str17, ", -1, 97");
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4387");
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
        item3.sellIn = (short) -1;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, -1, 97, 1, 10" + "'", str16, "hi!, -1, 97, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, -1, 97, 1, 10" + "'", str18, "hi!, -1, 97, 1, 10");
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4388");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52", (int) (short) 0, 10);
        int int4 = item3.quality;
        item3.sellIn = (-1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4389");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10", (int) (short) 1, 35);
        item3.name = "hi!, -1, 97, 1, -1, 32, 97";
        java.lang.String str6 = item3.toString();
        int int7 = item3.quality;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 97, 1, -1, 32, 97, 1, 35" + "'", str6, "hi!, -1, 97, 1, -1, 32, 97, 1, 35");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4390");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", 0, 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.toString();
        item3.name = "hi!, 52, 97, 52, -1, 100, 10";
        item3.name = "hi!, -1, -1";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, 10, 0, 0" + "'", str5, "hi!, -1, 10, 0, 0");
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4391");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4392");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, 0", (int) (byte) 100, (int) (short) 100);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1, 0, 0" + "'", str4, ", 100, 1, 0, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1, 0, 0" + "'", str5, ", 100, 1, 0, 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1, 0, 0, 100, 100" + "'", str6, ", 100, 1, 0, 0, 100, 100");
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4393");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.quality;
        item3.name = ", 52, -1";
        int int10 = item3.quality;
        int int11 = item3.sellIn;
        item3.sellIn = 'a';
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1, 0, 0" + "'", str5, ", 100, 1, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4394");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (byte) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str9 = item3.name;
        item3.quality = (short) -1;
        java.lang.String str12 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, -1, -1" + "'", str12, "hi!, -1, -1");
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4395");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, (int) (short) 1);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4396");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10, -1, 35", (int) (byte) 10, (int) '4');
        int int4 = item3.quality;
        java.lang.String str5 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 1, 10, -1, 35" + "'", str5, "hi!, 1, 10, -1, 35");
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4397");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 100, (int) (short) 1);
        java.lang.String str4 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = 32;
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 100, 1" + "'", str4, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4398");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str10 = item3.name;
        java.lang.String str11 = item3.name;
        int int12 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4399");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.quality = '4';
        item3.name = "hi!, 1, 1";
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.name;
        java.lang.String str10 = item3.name;
        int int11 = item3.sellIn;
        item3.sellIn = (short) -1;
        java.lang.String str14 = item3.name;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 1, 1, -1, 52" + "'", str8, "hi!, 1, 1, -1, 52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 1" + "'", str9, "hi!, 1, 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 1, 1" + "'", str10, "hi!, 1, 1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 1, 1" + "'", str14, "hi!, 1, 1");
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4400");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4401");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 97", (int) (short) 10, (int) (byte) 1);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.toString();
        int int6 = item3.quality;
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 1, 97, 10, 1" + "'", str5, "hi!, 1, 97, 10, 1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 97, 10, 1" + "'", str7, "hi!, 1, 97, 10, 1");
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4402");
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
        item3.name = ", -1, 52";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4403");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (short) -1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater13.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4404");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52, 10, 97", 52, (int) (short) 10);
        item3.name = "hi!, -1, 0, 100, 97";
        int int6 = item3.sellIn;
        java.lang.Class<?> wildcardClass7 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4405");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.sellIn;
        item3.name = ", 100, 10";
        int int7 = item3.quality;
        int int8 = item3.sellIn;
        java.lang.Class<?> wildcardClass9 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4406");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 1, 0, 0";
        item3.name = ", -1, 52";
        java.lang.String str10 = item3.name;
        item3.name = "hi!, 100, 10, -1, 97";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", -1, 52" + "'", str10, ", -1, 52");
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4407");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = 0;
        item3.quality = (-1);
        java.lang.String str13 = item3.name;
        item3.sellIn = (short) 1;
        int int16 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater17 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(itemUpdater17);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4408");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 1", (int) '#', (int) (short) -1);
        item3.quality = (-1);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4409");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", 0, (int) (byte) 10);
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str5, "hi!, 52, 97, 0, 10");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str7, "hi!, 52, 97, 0, 10");
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4410");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        item3.name = ", 100, 97";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str9 = item3.toString();
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 100, 97, 32, 97" + "'", str9, ", 100, 97, 32, 97");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4411");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) 10);
        item3.quality = 0;
        java.lang.String str6 = item3.name;
        item3.sellIn = 0;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4412");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.sellIn;
        item3.sellIn = 'a';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.name;
        int int10 = item3.quality;
        java.lang.String str11 = item3.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 97, 97" + "'", str11, "hi!, 97, 97");
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4413");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str6 = item3.name;
        item3.name = "hi!, -1, 97, 0, 1";
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4414");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 10", (int) (byte) 100, (int) ' ');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (byte) -1;
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4415");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 0;
        item3.quality = (short) 10;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4416");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 10, -1, 97", (int) (short) 100, 10);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4417");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1", 0, (int) '#');
        int int4 = item3.quality;
        int int5 = item3.quality;
        java.lang.String str6 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 1, 0, 35" + "'", str6, "hi!, -1, 1, 0, 35");
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4418");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.quality;
        item3.quality = 100;
        item3.name = "hi!, -1, 10, 52, 0";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4419");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        item3.name = "";
        java.lang.String str10 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = 1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4420");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.sellIn;
        item3.sellIn = (byte) 100;
        int int7 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int9 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4421");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        item3.quality = (short) 0;
        java.lang.String str12 = item3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 52, 0" + "'", str12, "hi!, 52, 0");
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4422");
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
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdater14.update();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdater14.update();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdater16.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater17);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4423");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater11 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = ' ';
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4424");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 1", (-1), (int) (short) 100);
        item3.name = "hi!, -1, 10, -1, -1";
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater6.update();
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4425");
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
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4426");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 100, (int) 'a');
        item3.quality = ' ';
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4427");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) -1, (int) (short) 0);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = 52;
        java.lang.String str7 = item3.toString();
        int int8 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, -1, 52" + "'", str7, ", 100, 1, -1, 52");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4428");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10", (int) (short) -1, (int) (short) 1);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str5 = item3.name;
        int int6 = item3.quality;
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str5, "hi!, 52, 97, 0, 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, 0, 10, -1, 1" + "'", str7, "hi!, 52, 97, 0, 10, -1, 1");
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4429");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        int int9 = item3.quality;
        int int10 = item3.sellIn;
        item3.quality = (byte) 100;
        java.lang.Class<?> wildcardClass13 = item3.getClass();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4430");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.toString();
        int int7 = item3.quality;
        int int8 = item3.sellIn;
        item3.sellIn = (byte) 10;
        item3.sellIn = (byte) -1;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 97" + "'", str6, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4431");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.name = ", 100, 10";
        int int7 = item3.sellIn;
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 100, 10" + "'", str8, ", 100, 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 100, 10, 10, 0" + "'", str9, ", 100, 10, 10, 0");
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4432");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "";
        item3.name = ", -1, 52";
        java.lang.String str11 = item3.name;
        item3.sellIn = (byte) -1;
        item3.sellIn = 52;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", -1, 52" + "'", str11, ", -1, 52");
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4433");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = (byte) 10;
        java.lang.String str11 = item3.name;
        item3.name = ", 100, 1, 10, 0";
        item3.quality = 100;
        int int16 = item3.quality;
        item3.name = "hi!, 97, 97, 32, 10";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4434");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        item3.quality = (short) 0;
        item3.sellIn = (-1);
        item3.sellIn = (short) 1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater16 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str17 = item3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 97" + "'", str9, "hi!, 52, 97");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 1, 0" + "'", str17, "hi!, 1, 0");
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4435");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = 0;
        item3.quality = (-1);
        java.lang.String str13 = item3.name;
        java.lang.String str14 = item3.name;
        item3.sellIn = 97;
        item3.name = ", 100, 1, 10, 0, 97, 10";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4436");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        int int4 = item3.sellIn;
        int int5 = item3.quality;
        java.lang.String str6 = item3.toString();
        java.lang.String str7 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 97" + "'", str6, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4437");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (short) -1;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.sellIn = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int11 = item3.quality;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4438");
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
        item3.name = ", 100, 1, 10, -1, 1, 97";
        int int22 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4439");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", 100, (int) (short) 0);
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 0;
        java.lang.String str7 = item3.toString();
        item3.name = ", 10, -1, -1, 1";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97, 100, 0" + "'", str7, "hi!, -1, 97, 100, 0");
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4440");
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
        item3.sellIn = (short) 0;
        item3.sellIn = 1;
        java.lang.String str24 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!, 1, 1, -1, 97" + "'", str24, "hi!, 1, 1, -1, 97");
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4441");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", 100, (int) (short) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        item3.name = "hi!, -1, 0, 100, 97";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, 97" + "'", str5, "hi!, -1, 97");
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4442");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 10", (int) ' ', (int) (short) 1);
        item3.quality = 100;
        int int6 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4443");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        java.lang.String str9 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = 100;
        item3.sellIn = (short) 0;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", -1, 97" + "'", str9, ", -1, 97");
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4444");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) ' ', (int) 'a');
        item3.sellIn = 1;
        java.lang.String str6 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4445");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.quality = '4';
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (byte) 1;
        com.gildedrose.ItemUpdater itemUpdater9 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) 100;
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4446");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 10, 0, 10, 1, 100, 97", 10, (int) (byte) 1);
        item3.name = "hi!, 32, 10";
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4447");
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
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4448");
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 52, 97, 0, 10" + "'", str17, "hi!, 52, 97, 0, 10");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemUpdater22);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4449");
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
        int int19 = item3.quality;
        java.lang.String str20 = item3.name;
        java.lang.String str21 = item3.name;
        item3.sellIn = 0;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ", 100, 1" + "'", str20, ", 100, 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ", 100, 1" + "'", str21, ", 100, 1");
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4450");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        java.lang.String str6 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 100, 1, 10, 0" + "'", str5, ", 100, 1, 10, 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 100, 1" + "'", str6, ", 100, 1");
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4451");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        int int4 = item3.quality;
        item3.quality = (short) 0;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater13 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater14 = conjuredItemUpdater7.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4452");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int6 = item3.sellIn;
        item3.name = "";
        int int9 = item3.quality;
        java.lang.String str10 = item3.name;
        int int11 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) -1;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4453");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        item3.name = ", -1, 52";
        java.lang.String str9 = item3.toString();
        item3.quality = 0;
        item3.name = "";
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", -1, 52, -1, 97" + "'", str9, ", -1, 52, -1, 97");
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4454");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        item3.quality = 0;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.sellIn;
        item3.sellIn = 100;
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4455");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 0, (int) (short) 0);
        item3.name = "hi!, -1, 0";
        item3.sellIn = (byte) 0;
        item3.sellIn = (byte) 0;
        java.lang.String str10 = item3.name;
        java.lang.String str11 = item3.name;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, -1, 0" + "'", str10, "hi!, -1, 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 0" + "'", str11, "hi!, -1, 0");
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4456");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) 100, 97);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (short) -1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4457");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 1", 100, (int) (short) 1);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4458");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, 0, 10", 1, (int) (short) 0);
        item3.name = "";
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 1, 0" + "'", str7, ", 1, 0");
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4459");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater8 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater7.update();
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdater11.update();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4460");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) '4', (int) (byte) 0);
        item3.name = ", 32, -1";
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4461");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        int int10 = item3.sellIn;
        java.lang.String str11 = item3.name;
        java.lang.String str12 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater13 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int14 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 1, 10" + "'", str12, "hi!, 1, 10");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4462");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) 'a', (int) (byte) 10);
        int int4 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater6 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater7 = conjuredItemUpdater6.update();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4463");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.name;
        int int13 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater14 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (short) 10;
        java.lang.String str17 = item3.name;
        java.lang.String str18 = item3.toString();
        java.lang.String str19 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 10" + "'", str11, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 1, 10" + "'", str18, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 1, 10" + "'", str19, "hi!, 1, 10");
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4464");
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
        java.lang.String str20 = item3.name;
        java.lang.String str21 = item3.toString();
        java.lang.String str22 = item3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 10, 10" + "'", str17, "hi!, 10, 10");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 10, 10" + "'", str21, "hi!, 10, 10");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, 10, 10" + "'", str22, "hi!, 10, 10");
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4465");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10, -1, -1", (int) (short) 10, (int) (short) -1);
        int int4 = item3.quality;
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater5);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4466");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (byte) 10, (int) (short) 0);
        int int4 = item3.quality;
        item3.sellIn = (short) 0;
        java.lang.String str7 = item3.toString();
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = "hi!, 52, 97, -1, 52, 10, 0, 10, 10";
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 100, 1, 0, 0" + "'", str7, ", 100, 1, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4467");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", 10, (int) '4');
        item3.sellIn = 'a';
        item3.sellIn = (short) 100;
        com.gildedrose.ItemUpdater itemUpdater8 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.name = ", 100, 97";
        item3.sellIn = 32;
        int int13 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4468");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str6 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater7);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4469");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        java.lang.String str4 = item3.name;
        item3.name = "hi!, -1, 97, 1, -1";
        int int7 = item3.sellIn;
        java.lang.String str8 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int10 = item3.sellIn;
        item3.quality = (byte) 10;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97, 1, -1" + "'", str8, "hi!, -1, 97, 1, -1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4470");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 1, -1, -1, 1, 0, 0", (int) (short) 100, (int) ' ');
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4471");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 10", (int) 'a', (int) (short) 1);
        item3.name = "hi!, 52, 97";
        int int6 = item3.quality;
        item3.name = "hi!, -1, 97, 0, 1, 1, -1";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4472");
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
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater15 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater16 = conjuredItemUpdater15.update();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdater16.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str7, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 52, 97" + "'", str10, "hi!, 52, 97");
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater17);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4473");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, 0, 0, 1, 32", 97, (int) (byte) -1);
        item3.quality = 1;
        item3.name = ", 100, 1, 100, 52, 35, 97";
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ", 100, 1, 100, 52, 35, 97" + "'", str8, ", 100, 1, 100, 52, 35, 97");
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4474");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        item3.sellIn = '4';
        java.lang.String str8 = item3.name;
        item3.quality = 0;
        int int11 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater12 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int13 = item3.quality;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4475");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) -1, (int) '4');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str7 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater9 = conjuredItemUpdater8.update();
        com.gildedrose.ItemUpdater itemUpdater10 = conjuredItemUpdater8.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4476");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 52, 35, 1", (int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4477");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 10);
        item3.name = "hi!";
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int7 = item3.quality;
        int int8 = item3.quality;
        java.lang.String str9 = item3.name;
        item3.sellIn = 0;
        int int12 = item3.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4478");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97, 0, 1", (int) ' ', (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        com.gildedrose.ItemUpdater itemUpdater5 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (-1);
        java.lang.String str8 = item3.name;
        int int9 = item3.sellIn;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater10 = new com.gildedrose.ConjuredItemUpdater(item3);
        com.gildedrose.ItemUpdater itemUpdater11 = conjuredItemUpdater10.update();
        com.gildedrose.ItemUpdater itemUpdater12 = conjuredItemUpdater10.update();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 97, 0, 1" + "'", str8, "hi!, -1, 97, 0, 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4479");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52", 52, (int) (byte) 10);
        int int4 = item3.sellIn;
        item3.quality = (short) -1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4480");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 97", (int) (byte) 1, (-1));
        item3.name = ", 100, 1, 0, -1";
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4481");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10", (int) (byte) 100, 32);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 10" + "'", str4, "hi!, 100, 10");
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4482");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 1", (int) ' ', 100);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4483");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 97, 10, 97", (int) 'a', (int) ' ');
        item3.sellIn = 0;
        com.gildedrose.ItemUpdater itemUpdater6 = com.gildedrose.ItemUpdater.getInstance(item3);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4484");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!, -1, 97";
        int int6 = item3.quality;
        item3.quality = (short) 100;
        java.lang.String str9 = item3.name;
        java.lang.String str10 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, -1, 97, -1, 100" + "'", str10, "hi!, -1, 97, -1, 100");
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4485");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        item3.quality = (short) 100;
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4486");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 10", 0, 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        item3.sellIn = (byte) 100;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 10" + "'", str4, "hi!, -1, 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, 10, 0, 0" + "'", str5, "hi!, -1, 10, 0, 0");
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4487");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.name;
        item3.quality = (byte) 0;
        int int7 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str9 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 0" + "'", str9, "hi!, -1, 0");
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4488");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1, -1, 52", 10, 52);
        item3.name = "hi!, 52, 97, -1, 35";
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4489");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater4 = new com.gildedrose.ConjuredItemUpdater(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater8 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4490");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater5 = new com.gildedrose.ConjuredItemUpdater(item3);
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 97" + "'", str4, "hi!, -1, 97");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -1, 97" + "'", str7, "hi!, -1, 97");
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4491");
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
        int int21 = item3.quality;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 52, 97, -1, 52" + "'", str19, "hi!, 52, 97, -1, 52");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4492");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        com.gildedrose.ItemUpdater itemUpdater4 = com.gildedrose.ItemUpdater.getInstance(item3);
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        int int7 = item3.quality;
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.toString();
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, -1, 97" + "'", str9, "hi!, -1, 97");
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4493");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (byte) -1, (-1));
        int int4 = item3.quality;
        item3.sellIn = 32;
        item3.sellIn = '#';
        item3.name = "hi!, 52, 97, 52, -1";
        int int11 = item3.quality;
        int int12 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4494");
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
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater14 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4495");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.quality;
        java.lang.String str7 = item3.name;
        int int8 = item3.sellIn;
        int int9 = item3.sellIn;
        item3.name = "hi!, -1, 97, 1, -1, 100, -1";
        int int12 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4496");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.sellIn = 1;
        int int6 = item3.sellIn;
        item3.quality = (byte) 10;
        java.lang.String str9 = item3.toString();
        item3.sellIn = 10;
        item3.name = "hi!, 52, 97, -1, 52";
        item3.name = "hi!, 52, 97, -1, 52, 10, 10";
        item3.sellIn = 0;
        java.lang.String str18 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 1, 10" + "'", str9, "hi!, 1, 10");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 52, 97, -1, 52, 10, 10, 0, 10" + "'", str18, "hi!, 52, 97, -1, 52, 10, 10, 0, 10");
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4497");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (int) (byte) -1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        com.gildedrose.ItemUpdater itemUpdater7 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.sellIn = (short) -1;
        java.lang.String str10 = item3.name;
        com.gildedrose.ItemUpdater itemUpdater11 = com.gildedrose.ItemUpdater.getInstance(item3);
        item3.quality = (short) 1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(itemUpdater11);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4498");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        item3.sellIn = (-1);
        item3.name = "hi!, 10, 10";
        item3.sellIn = (byte) -1;
        int int16 = item3.sellIn;
        int int17 = item3.sellIn;
        java.lang.String str18 = item3.toString();
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater19 = new com.gildedrose.ConjuredItemUpdater(item3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 10, 10, -1, 10" + "'", str18, "hi!, 10, 10, -1, 10");
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4499");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97, -1, 52, 10, 0", (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTest8.test4500");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) (short) -1, (int) 'a');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater(item3);
        item3.quality = (short) 10;
        com.gildedrose.ItemUpdater itemUpdater10 = com.gildedrose.ItemUpdater.getInstance(item3);
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.toString();
        java.lang.String str13 = item3.toString();
        java.lang.String str14 = item3.name;
        java.lang.String str15 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 10" + "'", str11, "hi!, -1, 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, -1, 10" + "'", str12, "hi!, -1, 10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, -1, 10" + "'", str13, "hi!, -1, 10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, -1, 10" + "'", str15, "hi!, -1, 10");
    }
}

