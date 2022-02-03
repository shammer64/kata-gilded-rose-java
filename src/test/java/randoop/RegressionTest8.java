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
            System.out.format("%n%s%n", "RegressionTest8.test4001");
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
        int int21 = item14.quality;
        java.lang.String str22 = item14.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, -1, 0", 0, (int) (byte) 0);
        com.gildedrose.Item item13 = itemUpdater2.update(item12);
        item12.sellIn = 35;
        java.lang.String str16 = item12.name;
        int int17 = item12.sellIn;
        int int18 = item12.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, -1, 0" + "'", str16, "hi!, -1, 0");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 100, 0", (int) (short) -1, (int) ' ');
        java.lang.String str4 = item3.toString();
        java.lang.String str5 = item3.name;
        int int6 = item3.sellIn;
        item3.sellIn = (-4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, 0, 100, 0, -1, 32" + "'", str4, "hi!, 10, 0, 100, 0, -1, 32");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 10, 0, 100, 0" + "'", str5, "hi!, 10, 0, 100, 0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, -1, 0", 0, (int) (byte) 0);
        com.gildedrose.Item item13 = itemUpdater2.update(item12);
        item12.sellIn = 35;
        java.lang.String str16 = item12.name;
        java.lang.String str17 = item12.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, -1, 0" + "'", str16, "hi!, -1, 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, -1, 0" + "'", str17, "hi!, -1, 0");
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 100, 1", (int) '4', (int) '#');
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        item13.name = "hi!, 10, 0, 10, 1, 1, -1";
        int int16 = item13.sellIn;
        java.lang.String str17 = item13.toString();
        item13.name = "hi!, 100, 1, -3, 0";
        java.lang.String str20 = item13.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 10, 0, 10, 1, 1, -1, 51, 34" + "'", str17, "hi!, 10, 0, 10, 1, 1, -1, 51, 34");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 100, 1, -3, 0" + "'", str20, "hi!, 100, 1, -3, 0");
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
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
        item12.quality = 48;
        item12.quality = 33;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(item19);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
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
        item39.sellIn = (short) 100;
        java.lang.String str45 = item39.toString();
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
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!, 100, 49" + "'", str45, "hi!, 100, 49");
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 31, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance(", 0, 50, 1, 100, -1, 100");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, -3");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
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
        item33.quality = (-1);
        int int36 = item33.quality;
        java.lang.String str37 = item33.name;
        com.gildedrose.Item item38 = itemUpdater16.update(item33);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(item38);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 51, 0", 1, 97);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 51, 0" + "'", str4, "hi!, 51, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 51, 0, 1, 97" + "'", str5, "hi!, 51, 0, 1, 97");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 0, 52");
        com.gildedrose.Item item18 = new com.gildedrose.Item("hi!, 99, 0", 31, (int) (short) 100);
        item18.name = "hi!, 0, 0, 52, 1";
        com.gildedrose.Item item21 = itemUpdater14.update(item18);
        java.lang.String str22 = item18.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, 0, 0, 52, 1, 30, 50" + "'", str22, "hi!, 0, 0, 52, 1, 30, 50");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 98, 0, 31, 32", 50, (int) (byte) 0);
        item3.quality = (short) 100;
        item3.name = "hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, -3, -1, 50";
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        item6.sellIn = (byte) 0;
        java.lang.String str11 = item6.name;
        item6.quality = 96;
        java.lang.String str14 = item6.name;
        item6.name = ", 96, 31";
        item6.quality = (short) 10;
        item6.quality = 100;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        int int6 = item3.sellIn;
        int int7 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 100, 1, 10, 0" + "'", str5, "hi!, 100, 1, 10, 0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 51, 50");
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
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 51, 34, 1, -3", (int) (byte) 100, 0);
        item3.quality = 100;
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 32, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1, 52, 52");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 51, 34");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.Item item22 = new com.gildedrose.Item("hi!", (int) '4', (int) (byte) 1);
        com.gildedrose.Item item23 = itemUpdater18.update(item22);
        int int24 = item22.quality;
        item22.quality = 0;
        java.lang.String str27 = item22.toString();
        item22.quality = 32;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!, 51, 0" + "'", str27, "hi!, 51, 0");
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory78 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater80 = itemUpdaterFactory78.getInstance("");
        com.gildedrose.Item item84 = new com.gildedrose.Item("hi!", 100, 1);
        int int85 = item84.sellIn;
        com.gildedrose.Item item86 = itemUpdater80.update(item84);
        int int87 = item84.sellIn;
        int int88 = item84.sellIn;
        int int89 = item84.quality;
        java.lang.String str90 = item84.name;
        item84.quality = 9;
        com.gildedrose.Item item93 = itemUpdater2.update(item84);
        item93.quality = 31;
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
        org.junit.Assert.assertNotNull(itemUpdater80);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 100 + "'", int85 == 100);
        org.junit.Assert.assertNotNull(item86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 99 + "'", int87 == 99);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 99 + "'", int88 == 99);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
        org.junit.Assert.assertNotNull(item93);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 99");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -1, 1, 10, 32");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance(", 100, 1, -4, 0, 1, 97");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 50", (int) (short) 100, 48);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 50, 49");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50, 10, -1", (int) (short) -1, 52);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 49, 32", (-4), 0);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        item3.name = "hi!, 0, 0";
        item3.quality = (byte) -1;
        item3.name = ", 10, 10";
        int int11 = item3.sellIn;
        item3.name = "hi!, 0, 0, -1, 35";
        item3.sellIn = ' ';
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -4, 0, -1, 0", 98, (int) '4');
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
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
        int int52 = item51.quality;
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 99, 0" + "'", str5, "hi!, 99, 0");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance(", 100, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, -1, 10, 100");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 50, 96");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory15 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory15.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory15.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory15.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory15.getInstance("hi!, 100, 1, 9, 1");
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory15.getInstance("hi!, 99, 0, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory15.getInstance(", 52, 1");
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
        item59.name = "hi!, 0, 0";
        int int64 = item59.quality;
        java.lang.String str65 = item59.toString();
        com.gildedrose.Item item66 = itemUpdater32.update(item59);
        java.lang.String str67 = item66.name;
        item66.name = "hi!, -2, 50";
        int int70 = item66.sellIn;
        com.gildedrose.Item item71 = itemUpdater29.update(item66);
        int int72 = item66.sellIn;
        com.gildedrose.Item item73 = itemUpdater14.update(item66);
        java.lang.String str74 = item73.toString();
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
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str65, "hi!, 0, 0, 99, 0");
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!, 0, 0" + "'", str67, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 98 + "'", int70 == 98);
        org.junit.Assert.assertNotNull(item71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 97 + "'", int72 == 97);
        org.junit.Assert.assertNotNull(item73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!, -2, 50, 96, 0" + "'", str74, "hi!, -2, 50, 96, 0");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
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
        item15.sellIn = 49;
        java.lang.String str19 = item15.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 0, 0" + "'", str13, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 0, 0, 49, 0" + "'", str19, "hi!, 0, 0, 49, 0");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str13 = item12.name;
        int int14 = item12.sellIn;
        com.gildedrose.Item item15 = itemUpdater8.update(item12);
        int int16 = item15.sellIn;
        java.lang.String str17 = item15.toString();
        java.lang.Class<?> wildcardClass18 = item15.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 0, 0" + "'", str13, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 31 + "'", int16 == 31);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 0, 0, 31, 0" + "'", str17, "hi!, 0, 0, 31, 0");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
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
        item31.sellIn = 99;
        java.lang.String str36 = item31.name;
        item31.name = ", 52, 0";
        java.lang.String str39 = item31.toString();
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 99, 0, 100, 52" + "'", str36, "hi!, 99, 0, 100, 52");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + ", 52, 0, 99, 0" + "'", str39, ", 52, 0, 99, 0");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 96", 34, 51);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory11.getInstance("hi!, 0, 0, 0, 1");
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
        com.gildedrose.Item item35 = itemUpdater17.update(item33);
        com.gildedrose.Item item36 = itemUpdater10.update(item33);
        java.lang.String str37 = item33.toString();
        java.lang.String str38 = item33.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!, 0, 0, 99, 0, 48, 47" + "'", str37, "hi!, 0, 0, 99, 0, 48, 47");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!, 0, 0, 99, 0, 48, 47" + "'", str38, "hi!, 0, 0, 99, 0, 48, 47");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1, 10, 32", 96, (int) (short) 1);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -4, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 50");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 50");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
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
        com.gildedrose.Item item83 = new com.gildedrose.Item("hi!, 99, 0", (int) (short) 0, 52);
        int int84 = item83.sellIn;
        com.gildedrose.Item item85 = itemUpdater12.update(item83);
        item83.quality = (byte) 100;
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
        org.junit.Assert.assertNotNull(item85);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
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
        item31.name = "hi!, 0, 0, 0, 1";
        item31.name = "hi!, 52, 1, 32, 35";
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
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
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
        int int30 = item15.sellIn;
        int int31 = item15.sellIn;
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-2) + "'", int31 == (-2));
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -3, 0, 52, -1", 0, 49);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -3, 0, 52, -1" + "'", str4, "hi!, -3, 0, 52, -1");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
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
        java.lang.String str84 = item83.name;
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
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str15 = item14.name;
        item14.quality = 99;
        int int18 = item14.quality;
        item14.sellIn = 31;
        com.gildedrose.Item item21 = itemUpdater10.update(item14);
        int int22 = item21.quality;
        java.lang.String str23 = item21.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 30, 50" + "'", str23, "hi!, 30, 50");
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 100, 0", 51, (int) '#');
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, 0, 100, 0, 51, 35" + "'", str4, "hi!, 10, 0, 100, 0, 51, 35");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
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
        item30.name = "hi!, 10, 0, 10, 1, 1, -1, 52, 100";
        int int50 = item30.quality;
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 98, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory13 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory13.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory13.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory13.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory13.getInstance("hi!, -1, 0");
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
        item54.quality = (byte) 0;
        java.lang.String str57 = item54.name;
        com.gildedrose.Item item58 = itemUpdater23.update(item54);
        com.gildedrose.Item item59 = itemUpdater12.update(item54);
        item59.quality = (byte) 0;
        item59.sellIn = 95;
        item59.quality = 98;
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
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(item58);
        org.junit.Assert.assertNotNull(item59);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 31, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 100, 0");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 100, 52, 32, 52");
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
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 52, 32, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 10, 0, 31, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance(", 0, 50, 1, 100");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 98, 0, 100, -1");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 100, 1, -2, 0");
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
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
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
        java.lang.String str29 = item28.toString();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!, 0, 0, 50, 49" + "'", str29, "hi!, 0, 0, 50, 49");
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
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
        item24.name = "hi!, 0, 0, 0, 1, 99, -1";
        item24.name = "hi!, 1, 0, 98, 99, 32, -2";
        item24.sellIn = 100;
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
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
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
        java.lang.String str17 = item8.toString();
        item8.quality = 98;
        java.lang.String str20 = item8.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 10, 10" + "'", str17, "hi!, 10, 10");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 10, 98" + "'", str20, "hi!, 10, 98");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        item3.sellIn = 99;
        item3.name = "";
        item3.quality = 'a';
        java.lang.String str10 = item3.toString();
        item3.name = "hi!, 0, 0, 0, 98";
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", 99, 97" + "'", str10, ", 99, 97");
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50, 1, 100", (-1), (int) (byte) 100);
        java.lang.String str4 = item3.toString();
        int int5 = item3.sellIn;
        item3.sellIn = 0;
        item3.quality = 32;
        java.lang.String str10 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 0, 50, 1, 100, -1, 100" + "'", str4, ", 0, 50, 1, 100, -1, 100");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ", 0, 50, 1, 100, 0, 32" + "'", str10, ", 0, 50, 1, 100, 0, 32");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
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
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory26 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory26.getInstance("");
        com.gildedrose.Item item32 = new com.gildedrose.Item("hi!", 100, 1);
        int int33 = item32.sellIn;
        com.gildedrose.Item item34 = itemUpdater28.update(item32);
        item32.sellIn = (byte) 0;
        com.gildedrose.Item item37 = itemUpdater25.update(item32);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory38 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater40 = itemUpdaterFactory38.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory38.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater44 = itemUpdaterFactory38.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater46 = itemUpdaterFactory38.getInstance("hi!, 0, 0, 99, 0");
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
        com.gildedrose.Item item69 = itemUpdater46.update(item62);
        com.gildedrose.Item item70 = itemUpdater25.update(item69);
        com.gildedrose.Item item71 = itemUpdater2.update(item70);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory72 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater74 = itemUpdaterFactory72.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater76 = itemUpdaterFactory72.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater78 = itemUpdaterFactory72.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater80 = itemUpdaterFactory72.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item84 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str85 = item84.name;
        int int86 = item84.sellIn;
        com.gildedrose.Item item87 = itemUpdater80.update(item84);
        int int88 = item87.quality;
        item87.sellIn = 49;
        com.gildedrose.Item item91 = itemUpdater2.update(item87);
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
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertNotNull(item37);
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
        org.junit.Assert.assertNotNull(item69);
        org.junit.Assert.assertNotNull(item70);
        org.junit.Assert.assertNotNull(item71);
        org.junit.Assert.assertNotNull(itemUpdater74);
        org.junit.Assert.assertNotNull(itemUpdater76);
        org.junit.Assert.assertNotNull(itemUpdater78);
        org.junit.Assert.assertNotNull(itemUpdater80);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!, 0, 0" + "'", str85, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 32 + "'", int86 == 32);
        org.junit.Assert.assertNotNull(item87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(item91);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 100, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -3, 49");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 30, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 50, 49, 31, 50");
        java.lang.Class<?> wildcardClass15 = itemUpdaterFactory0.getClass();
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
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
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
        item29.sellIn = 52;
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
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        int int9 = item4.quality;
        item4.name = "hi!";
        int int12 = item4.sellIn;
        item4.name = "hi!, 10, 0, 10, 1, 1, -1";
        item4.quality = 51;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 0, 52", (int) (byte) 0, (int) (short) 0);
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 1, 0, 0, 52, 0, 0" + "'", str5, "hi!, 1, 0, 0, 52, 0, 0");
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 52, 1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, -2, 46");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance(", 1, 32, 52, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory17.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory22 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.Item item30 = new com.gildedrose.Item("hi!", 100, 1);
        int int31 = item30.sellIn;
        com.gildedrose.Item item32 = itemUpdater26.update(item30);
        java.lang.String str33 = item30.toString();
        item30.sellIn = 10;
        java.lang.String str36 = item30.toString();
        item30.sellIn = 1;
        com.gildedrose.Item item39 = itemUpdater21.update(item30);
        item39.name = "hi!, 10, 0, 10, 1, 1, -1, 52, 52";
        item39.sellIn = (short) 1;
        java.lang.String str44 = item39.name;
        com.gildedrose.Item item45 = itemUpdater16.update(item39);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory46 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater48 = itemUpdaterFactory46.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater50 = itemUpdaterFactory46.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater52 = itemUpdaterFactory46.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater54 = itemUpdaterFactory46.getInstance("hi!, 100, 52");
        com.gildedrose.Item item58 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str59 = item58.name;
        java.lang.String str60 = item58.name;
        com.gildedrose.Item item61 = itemUpdater54.update(item58);
        item61.name = "hi!, -3, 49";
        com.gildedrose.Item item64 = itemUpdater16.update(item61);
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
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!, 99, 0" + "'", str33, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 10, 0" + "'", str36, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!, 10, 0, 10, 1, 1, -1, 52, 52" + "'", str44, "hi!, 10, 0, 10, 1, 1, -1, 52, 52");
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertNotNull(itemUpdater48);
        org.junit.Assert.assertNotNull(itemUpdater50);
        org.junit.Assert.assertNotNull(itemUpdater52);
        org.junit.Assert.assertNotNull(itemUpdater54);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!, 0, 0" + "'", str59, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!, 0, 0" + "'", str60, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item61);
        org.junit.Assert.assertNotNull(item64);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 99");
        com.gildedrose.Item item8 = new com.gildedrose.Item("", 1, (int) ' ');
        java.lang.String str9 = item8.toString();
        item8.sellIn = 96;
        com.gildedrose.Item item12 = itemUpdater4.update(item8);
        item12.quality = (short) 100;
        int int15 = item12.quality;
        int int16 = item12.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 1, 32" + "'", str9, ", 1, 32");
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 98, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory13 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory13.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory13.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory13.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory13.getInstance("hi!, -1, 0");
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
        item54.quality = (byte) 0;
        java.lang.String str57 = item54.name;
        com.gildedrose.Item item58 = itemUpdater23.update(item54);
        com.gildedrose.Item item59 = itemUpdater12.update(item54);
        java.lang.Class<?> wildcardClass60 = itemUpdater12.getClass();
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
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(item58);
        org.junit.Assert.assertNotNull(item59);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) '4');
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        item3.name = "hi!, 0, 0, 51, 0, 97, 50";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 99, 0" + "'", str4, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 99, 0" + "'", str5, "hi!, 99, 0");
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 52, 1", 50, 0);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        java.lang.Class<?> wildcardClass14 = item12.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50", 50, 97);
        item3.sellIn = 50;
        item3.quality = '4';
        item3.sellIn = 33;
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -3, 0, 52, -1", 48, 100);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 100", 100, 47);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 50, 49");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, -1, 35");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance(", 1, 32, 98, 0");
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
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1", 52, 52);
        item3.quality = 10;
        int int6 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
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
        item17.name = "hi!, 100, 1, 51, 34, -2, 99";
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
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, -1, 0", 0, (int) (byte) 0);
        com.gildedrose.Item item13 = itemUpdater2.update(item12);
        item13.quality = (short) -1;
        java.lang.String str16 = item13.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, -1, 0" + "'", str16, "hi!, -1, 0");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -3, 0, 9, 9", 31, (-3));
        int int4 = item3.quality;
        item3.name = "hi!, -1, 0, -1, 0, 0, 51";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3) + "'", int4 == (-3));
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
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
        java.lang.String str18 = item15.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1" + "'", str14, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 99, 0" + "'", str18, "hi!, 99, 0");
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
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
        item11.name = "hi!, 10, 0, 10, 1";
        java.lang.String str20 = item11.name;
        java.lang.String str21 = item11.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, -1, 0" + "'", str17, "hi!, -1, 0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 10, 0, 10, 1" + "'", str20, "hi!, 10, 0, 10, 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 10, 0, 10, 1" + "'", str21, "hi!, 10, 0, 10, 1");
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 98, 99", 32, (-2));
        java.lang.String str4 = item3.toString();
        item3.name = "hi!, 99, 49";
        int int7 = item3.sellIn;
        item3.sellIn = (short) 100;
        item3.quality = 95;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 0, 98, 99, 32, -2" + "'", str4, "hi!, 1, 0, 98, 99, 32, -2");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
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
        item21.name = "hi!, 0, 0, 31, 0";
        item21.sellIn = (-2);
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
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
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
        int int42 = item41.sellIn;
        item41.name = ", 0, 50";
        int int45 = item41.sellIn;
        java.lang.Class<?> wildcardClass46 = item41.getClass();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 9 + "'", int42 == 9);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 8, 8", (int) (short) -1, 31);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49", 97, 32);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 48, 47, 0, 34", 100, 30);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 9, 50", 32, 52);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
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
        int int42 = item41.sellIn;
        item41.name = ", 0, 50";
        item41.name = "hi!, -2, 50";
        java.lang.String str47 = item41.toString();
        int int48 = item41.sellIn;
        item41.sellIn = 51;
        java.lang.String str51 = item41.name;
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 9 + "'", int42 == 9);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!, -2, 50, 9, 0" + "'", str47, "hi!, -2, 50, 9, 0");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 9 + "'", int48 == 9);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!, -2, 50" + "'", str51, "hi!, -2, 50");
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 48, 47", (int) '#', (int) ' ');
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0, 99, 0, 48, 47, 35, 32" + "'", str4, "hi!, 0, 0, 99, 0, 48, 47, 35, 32");
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 51, 0", 9, 10);
        item3.sellIn = 47;
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 50");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory13 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory13.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory13.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory13.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory13.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory13.getInstance("hi!, 0, 0, 52, 1");
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory13.getInstance("hi!, -1, 52");
        com.gildedrose.ItemUpdater itemUpdater31 = itemUpdaterFactory13.getInstance(", 0, 50, 10, -1");
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory13.getInstance("hi!, 10, 0, 10, 0, 0, 0");
        com.gildedrose.Item item37 = new com.gildedrose.Item("hi!, -1, 0, 0, 52", (int) ' ', 35);
        com.gildedrose.Item item38 = itemUpdater33.update(item37);
        com.gildedrose.Item item39 = itemUpdater12.update(item37);
        java.lang.String str40 = item37.name;
        java.lang.Class<?> wildcardClass41 = item37.getClass();
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
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater29);
        org.junit.Assert.assertNotNull(itemUpdater31);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertNotNull(item38);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!, -1, 0, 0, 52" + "'", str40, "hi!, -1, 0, 0, 52");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        java.lang.Class<?> wildcardClass5 = itemUpdater4.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item3.sellIn = 52;
        int int6 = item3.quality;
        item3.name = "hi!, 0, 0, 99, 0, 1, 1";
        item3.name = "hi!, 0, 0, 51, 0, 98, 99";
        java.lang.String str11 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 0, 0, 51, 0, 98, 99" + "'", str11, "hi!, 0, 0, 51, 0, 98, 99");
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
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
        item39.quality = 7;
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
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
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
        com.gildedrose.Item item89 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49", 35, (-1));
        int int90 = item89.sellIn;
        com.gildedrose.Item item91 = itemUpdater2.update(item89);
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
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 35 + "'", int90 == 35);
        org.junit.Assert.assertNotNull(item91);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        java.lang.String str10 = item6.toString();
        item6.sellIn = 97;
        java.lang.String str13 = item6.name;
        int int14 = item6.sellIn;
        item6.sellIn = (-4);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 99, 0" + "'", str10, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 32");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 97, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -3, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, -1, 10, 100");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!, 100, 1, -2, -1", 50, (int) (byte) 10);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', 1);
        item3.name = "hi!, 0, 0";
        java.lang.String str6 = item3.toString();
        java.lang.String str7 = item3.toString();
        item3.sellIn = (short) -1;
        java.lang.String str10 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str6, "hi!, 0, 0, 52, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str7, "hi!, 0, 0, 52, 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 0, 0, -1, 1" + "'", str10, "hi!, 0, 0, -1, 1");
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory13 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory13.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory13.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory22 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory22.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory22.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item35 = itemUpdater30.update(item34);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory36 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory36.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater40 = itemUpdaterFactory36.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory41 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater43 = itemUpdaterFactory41.getInstance("");
        com.gildedrose.Item item47 = new com.gildedrose.Item("hi!", 100, 1);
        int int48 = item47.sellIn;
        com.gildedrose.Item item49 = itemUpdater43.update(item47);
        item47.sellIn = (byte) 0;
        com.gildedrose.Item item52 = itemUpdater40.update(item47);
        com.gildedrose.Item item53 = itemUpdater30.update(item52);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory54 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater56 = itemUpdaterFactory54.getInstance("");
        com.gildedrose.Item item60 = new com.gildedrose.Item("hi!", 100, 1);
        int int61 = item60.sellIn;
        com.gildedrose.Item item62 = itemUpdater56.update(item60);
        int int63 = item60.sellIn;
        int int64 = item60.sellIn;
        com.gildedrose.Item item65 = itemUpdater30.update(item60);
        com.gildedrose.Item item66 = itemUpdater21.update(item65);
        com.gildedrose.Item item67 = itemUpdater12.update(item66);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater68 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item72 = new com.gildedrose.Item("hi!", 100, 1);
        int int73 = item72.sellIn;
        com.gildedrose.Item item74 = conjuredItemUpdater68.update(item72);
        item72.name = "hi!, 0, 0";
        int int77 = item72.quality;
        item72.name = "";
        int int80 = item72.quality;
        item72.sellIn = 0;
        item72.quality = 99;
        item72.name = ", 100, 1, -4, 0";
        java.lang.String str87 = item72.name;
        com.gildedrose.Item item88 = itemUpdater12.update(item72);
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
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertNotNull(itemUpdater40);
        org.junit.Assert.assertNotNull(itemUpdater43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertNotNull(item49);
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertNotNull(itemUpdater56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertNotNull(item62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 99 + "'", int63 == 99);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 99 + "'", int64 == 99);
        org.junit.Assert.assertNotNull(item65);
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertNotNull(item67);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 100 + "'", int73 == 100);
        org.junit.Assert.assertNotNull(item74);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + ", 100, 1, -4, 0" + "'", str87, ", 100, 1, -4, 0");
        org.junit.Assert.assertNotNull(item88);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
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
        item35.sellIn = 95;
        int int47 = item35.sellIn;
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 95 + "'", int47 == 95);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 98, 8", (int) ' ', (-4));
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
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
        item21.quality = (byte) -1;
        java.lang.Class<?> wildcardClass40 = item21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.toString();
        java.lang.String str7 = item3.toString();
        int int8 = item3.quality;
        item3.name = "";
        item3.name = "hi!, 0, 0, 52, 1";
        java.lang.String str13 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 100, 1" + "'", str6, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 100, 1" + "'", str7, "hi!, 100, 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str13, "hi!, 0, 0, 52, 1");
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', 1);
        item3.name = "hi!, 0, 0";
        java.lang.String str6 = item3.toString();
        item3.sellIn = (short) 0;
        int int9 = item3.quality;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str6, "hi!, 0, 0, 52, 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
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
        java.lang.String str18 = item13.name;
        int int19 = item13.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
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
        item77.quality = '4';
        item77.quality = (-3);
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
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, -3, 0");
        com.gildedrose.Item item18 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str19 = item18.name;
        java.lang.String str20 = item18.name;
        java.lang.String str21 = item18.name;
        com.gildedrose.Item item22 = itemUpdater14.update(item18);
        com.gildedrose.Item item26 = new com.gildedrose.Item("hi!", (int) '4', (int) (byte) 1);
        java.lang.String str27 = item26.toString();
        item26.sellIn = '4';
        com.gildedrose.Item item30 = itemUpdater14.update(item26);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!, 52, 1" + "'", str27, "hi!, 52, 1");
        org.junit.Assert.assertNotNull(item30);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
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
        item15.quality = 100;
        item15.sellIn = 97;
        java.lang.String str22 = item15.toString();
        item15.quality = 99;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1" + "'", str14, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, 97, 100" + "'", str22, "hi!, 97, 100");
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance(", 50, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.Item item19 = new com.gildedrose.Item("hi!", 100, 1);
        int int20 = item19.sellIn;
        com.gildedrose.Item item21 = itemUpdater15.update(item19);
        java.lang.String str22 = item21.name;
        int int23 = item21.sellIn;
        com.gildedrose.Item item24 = itemUpdater10.update(item21);
        com.gildedrose.Item item28 = new com.gildedrose.Item("hi!, 10, 0, 100, 0", (int) (short) -1, (int) ' ');
        java.lang.String str29 = item28.toString();
        item28.sellIn = (-1);
        java.lang.String str32 = item28.toString();
        com.gildedrose.Item item33 = itemUpdater10.update(item28);
        item33.quality = 46;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 99 + "'", int23 == 99);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!, 10, 0, 100, 0, -1, 32" + "'", str29, "hi!, 10, 0, 100, 0, -1, 32");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!, 10, 0, 100, 0, -1, 32" + "'", str32, "hi!, 10, 0, 100, 0, -1, 32");
        org.junit.Assert.assertNotNull(item33);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        java.lang.Class<?> wildcardClass7 = itemUpdater6.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
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
        item52.quality = (short) 0;
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
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -4, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 50");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 50");
        com.gildedrose.Item item16 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1", (int) (byte) -1, (-3));
        com.gildedrose.Item item17 = itemUpdater12.update(item16);
        item16.quality = 33;
        int int20 = item16.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 33 + "'", int20 == 33);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
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
        int int19 = item18.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 50 + "'", int19 == 50);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 98");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, -1", (int) (byte) 10, 0);
        item3.name = ", 0, 50, 1, 100, 99, 0";
        java.lang.String str6 = item3.name;
        item3.name = "hi!, 0, 0, 98, 34";
        java.lang.String str9 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 0, 50, 1, 100, 99, 0" + "'", str6, ", 0, 50, 1, 100, 99, 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 0, 0, 98, 34, 10, 0" + "'", str9, "hi!, 0, 0, 98, 34, 10, 0");
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str15 = item14.name;
        java.lang.String str16 = item14.name;
        java.lang.String str17 = item14.toString();
        java.lang.String str18 = item14.toString();
        item14.quality = 99;
        com.gildedrose.Item item21 = itemUpdater10.update(item14);
        item21.name = "hi!, 99, 0, 100, 52";
        java.lang.String str24 = item21.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 100, 1" + "'", str17, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 100, 1" + "'", str18, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!, 99, 0, 100, 52" + "'", str24, "hi!, 99, 0, 100, 52");
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
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
        java.lang.String str93 = item92.name;
        item92.quality = 52;
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
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi!" + "'", str93, "hi!");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 99, -1, 98, 0", 0, 100);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) 10, (-3));
        item3.quality = (short) 1;
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
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
        item37.sellIn = (byte) 1;
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
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 96, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 52");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 98, 34");
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
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance(", 100, 1");
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
        item42.name = "hi!, 1, 0, 0, 52";
        item42.quality = 1;
        item42.name = "hi!, -1, 52";
        com.gildedrose.Item item50 = itemUpdater10.update(item42);
        item42.sellIn = 32;
        int int53 = item42.quality;
        java.lang.String str54 = item42.name;
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
        org.junit.Assert.assertNotNull(item50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!, -1, 52" + "'", str54, "hi!, -1, 52");
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 98, 8", 8, (int) '4');
        item3.quality = 98;
        item3.quality = (-2);
        item3.quality = (byte) 0;
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item14 = new com.gildedrose.Item("", (int) '4', 1);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        item15.sellIn = 96;
        item15.name = "hi!, 1, 0, 98, 8";
        item15.quality = 33;
        int int22 = item15.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 33 + "'", int22 == 33);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
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
        java.lang.String str19 = item14.toString();
        java.lang.String str20 = item14.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ", 96, 31" + "'", str19, ", 96, 31");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!, 10, 0", 51, 97);
        item20.sellIn = 0;
        com.gildedrose.Item item23 = itemUpdater16.update(item20);
        item23.quality = (byte) 1;
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
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 32, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 98");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, -1, 50");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, -1, 1, 9, 31");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 10, 0, -2, 1");
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
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 98 + "'", int34 == 98);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 98 + "'", int35 == 98);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 51, 50", (int) '#', (int) (byte) 1);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
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
        java.lang.String str69 = item67.name;
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
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 98, 0, 52, 1");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 98, 8", 8, (int) '4');
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 0, 98, 8" + "'", str4, "hi!, 1, 0, 98, 8");
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance(", 100, 1, -4, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 48");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 48, 31");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 9", 9, 0);
        item3.quality = (-2);
        item3.sellIn = (byte) 1;
        item3.sellIn = (-4);
        int int10 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4) + "'", int10 == (-4));
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance(", 100, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, -1, 10, 100");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 50, 96");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory15 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory15.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory15.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory15.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory15.getInstance("hi!, 100, 1, 9, 1");
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory15.getInstance("hi!, 99, 0, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory15.getInstance(", 52, 1");
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
        item59.name = "hi!, 0, 0";
        int int64 = item59.quality;
        java.lang.String str65 = item59.toString();
        com.gildedrose.Item item66 = itemUpdater32.update(item59);
        java.lang.String str67 = item66.name;
        item66.name = "hi!, -2, 50";
        int int70 = item66.sellIn;
        com.gildedrose.Item item71 = itemUpdater29.update(item66);
        int int72 = item66.sellIn;
        com.gildedrose.Item item73 = itemUpdater14.update(item66);
        java.lang.String str74 = item73.name;
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
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str65, "hi!, 0, 0, 99, 0");
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!, 0, 0" + "'", str67, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 98 + "'", int70 == 98);
        org.junit.Assert.assertNotNull(item71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 97 + "'", int72 == 97);
        org.junit.Assert.assertNotNull(item73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!, -2, 50" + "'", str74, "hi!, -2, 50");
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 96, 0", 10, 51);
        item3.quality = 0;
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.name;
        java.lang.String str8 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 96, 0" + "'", str6, "hi!, 96, 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 96, 0" + "'", str7, "hi!, 96, 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 96, 0, 10, 0" + "'", str8, "hi!, 96, 0, 10, 0");
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str13 = item12.name;
        int int14 = item12.sellIn;
        com.gildedrose.Item item15 = itemUpdater8.update(item12);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.Item item22 = new com.gildedrose.Item("hi!", 100, 1);
        int int23 = item22.sellIn;
        com.gildedrose.Item item24 = itemUpdater18.update(item22);
        com.gildedrose.Item item25 = itemUpdater8.update(item24);
        int int26 = item24.quality;
        java.lang.String str27 = item24.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 0, 0" + "'", str13, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertNotNull(item25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
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
        item29.name = "hi!, 99, 0, 0, 10";
        int int40 = item29.sellIn;
        int int41 = item29.sellIn;
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 98 + "'", int40 == 98);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 98 + "'", int41 == 98);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
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
        item42.quality = 7;
        int int47 = item42.quality;
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 7 + "'", int47 == 7);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, -1", (int) (byte) 10, 0);
        item3.name = ", 0, 50, 1, 100, 99, 0";
        java.lang.String str6 = item3.name;
        item3.name = "hi!, 0, 0, 98, 34";
        int int9 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 0, 50, 1, 100, 99, 0" + "'", str6, ", 0, 50, 1, 100, 99, 0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 98");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 51, 0", 9, 10);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        item12.name = "hi!, 1, 0, 98, 99";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
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
        item17.name = "hi!, 98, -2, 9, 0";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertNotNull(item24);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        item3.name = "hi!, 100, 1";
        java.lang.String str7 = item3.name;
        item3.quality = (byte) 10;
        item3.name = "";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 100, 1" + "'", str7, "hi!, 100, 1");
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, -1, 10, 100");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance(", 50, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.Item item19 = new com.gildedrose.Item("hi!", 100, 1);
        int int20 = item19.sellIn;
        com.gildedrose.Item item21 = itemUpdater15.update(item19);
        java.lang.String str22 = item21.name;
        int int23 = item21.sellIn;
        com.gildedrose.Item item24 = itemUpdater10.update(item21);
        com.gildedrose.Item item28 = new com.gildedrose.Item("hi!, 10, 0, 100, 0", (int) (short) -1, (int) ' ');
        java.lang.String str29 = item28.toString();
        item28.sellIn = (-1);
        java.lang.String str32 = item28.toString();
        com.gildedrose.Item item33 = itemUpdater10.update(item28);
        item28.name = "hi!, 100, 1, 48, 0";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 99 + "'", int23 == 99);
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!, 10, 0, 100, 0, -1, 32" + "'", str29, "hi!, 10, 0, 100, 0, -1, 32");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!, 10, 0, 100, 0, -1, 32" + "'", str32, "hi!, 10, 0, 100, 0, -1, 32");
        org.junit.Assert.assertNotNull(item33);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1, 52, 52");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 51, 34");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.Item item22 = new com.gildedrose.Item("hi!", (int) '4', (int) (byte) 1);
        com.gildedrose.Item item23 = itemUpdater18.update(item22);
        int int24 = item23.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        int int9 = item4.quality;
        item4.name = "";
        int int12 = item4.quality;
        item4.sellIn = 0;
        item4.quality = 99;
        java.lang.String str17 = item4.name;
        item4.quality = 8;
        item4.sellIn = (short) 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
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
        item17.name = "";
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
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 31, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance(", 0, 50, 1, 100, -1, 100");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, -3");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 100, 52, 99, 0");
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
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -3, 48", 100, 51);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item10.name;
        int int12 = item10.sellIn;
        int int13 = item10.sellIn;
        item10.quality = (byte) -1;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        int int9 = item4.quality;
        item4.name = "";
        item4.quality = (-1);
        int int14 = item4.sellIn;
        java.lang.String str15 = item4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ", 99, -1" + "'", str15, ", 99, -1");
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
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
        java.lang.String str19 = item15.name;
        java.lang.String str20 = item15.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1" + "'", str14, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 99, 0" + "'", str19, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 99, 0, 99, 0" + "'", str20, "hi!, 99, 0, 99, 0");
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
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
        java.lang.String str31 = item30.toString();
        item30.sellIn = 46;
        java.lang.String str34 = item30.name;
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!, 99, 0" + "'", str34, "hi!, 99, 0");
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1, 52, 52", 0, 9);
        java.lang.String str4 = item3.toString();
        item3.name = "hi!, 10, 0, 100, 0";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, 9" + "'", str4, "hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, 9");
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 0, 52");
        com.gildedrose.Item item18 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str19 = item18.name;
        java.lang.String str20 = item18.name;
        java.lang.String str21 = item18.toString();
        java.lang.String str22 = item18.toString();
        item18.quality = 32;
        int int25 = item18.sellIn;
        com.gildedrose.Item item26 = itemUpdater14.update(item18);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 100, 1" + "'", str21, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, 100, 1" + "'", str22, "hi!, 100, 1");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(item26);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
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
        java.lang.String str17 = item16.toString();
        java.lang.String str18 = item16.toString();
        item16.name = "hi!, 99, 0, 98, 0";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, -1, 0" + "'", str17, "hi!, -1, 0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, -1, 0" + "'", str18, "hi!, -1, 0");
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, -2, -1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 51, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", 0, (-2));
        item3.name = "hi!, 0, 0, 52, 0, 99, 1";
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory11.getInstance("hi!, 0, 0, 0, 1");
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
        com.gildedrose.Item item35 = itemUpdater17.update(item33);
        com.gildedrose.Item item36 = itemUpdater10.update(item33);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory37 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater39 = itemUpdaterFactory37.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater41 = itemUpdaterFactory37.getInstance("");
        com.gildedrose.Item item45 = new com.gildedrose.Item("hi!", 100, 1);
        int int46 = item45.sellIn;
        com.gildedrose.Item item47 = itemUpdater41.update(item45);
        int int48 = item45.sellIn;
        com.gildedrose.Item item49 = itemUpdater10.update(item45);
        java.lang.String str50 = item45.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertNotNull(itemUpdater39);
        org.junit.Assert.assertNotNull(itemUpdater41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 99 + "'", int48 == 99);
        org.junit.Assert.assertNotNull(item49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 100, 52, 99, 0, 0, 52", (int) (byte) -1, 100);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 100, 52", (int) (byte) 100, (int) (byte) 100);
        int int13 = item12.quality;
        com.gildedrose.Item item14 = itemUpdater8.update(item12);
        item14.sellIn = 8;
        int int17 = item14.sellIn;
        java.lang.Class<?> wildcardClass18 = item14.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(item14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 100, 0", 96, 49);
        java.lang.String str4 = item3.name;
        item3.name = "hi!, 0, 0, 99, 0, 1, 1";
        int int7 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 100, 0" + "'", str4, "hi!, 100, 1, 100, 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1, 99, -1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 52, 97");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory13 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory13.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory13.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory20 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory20.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory20.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory20.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item32 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item33 = itemUpdater28.update(item32);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory34 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater36 = itemUpdaterFactory34.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory34.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory39 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater41 = itemUpdaterFactory39.getInstance("");
        com.gildedrose.Item item45 = new com.gildedrose.Item("hi!", 100, 1);
        int int46 = item45.sellIn;
        com.gildedrose.Item item47 = itemUpdater41.update(item45);
        item45.sellIn = (byte) 0;
        com.gildedrose.Item item50 = itemUpdater38.update(item45);
        com.gildedrose.Item item51 = itemUpdater28.update(item50);
        com.gildedrose.Item item52 = itemUpdater19.update(item50);
        int int53 = item50.quality;
        int int54 = item50.sellIn;
        com.gildedrose.Item item55 = itemUpdater12.update(item50);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertNotNull(itemUpdater36);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertNotNull(itemUpdater41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertNotNull(item50);
        org.junit.Assert.assertNotNull(item51);
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-3) + "'", int54 == (-3));
        org.junit.Assert.assertNotNull(item55);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
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
        item31.sellIn = 99;
        java.lang.String str36 = item31.toString();
        java.lang.String str37 = item31.name;
        item31.quality = (byte) 1;
        item31.sellIn = 50;
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 99, 0, 100, 52, 99, 0" + "'", str36, "hi!, 99, 0, 100, 52, 99, 0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!, 99, 0, 100, 52" + "'", str37, "hi!, 99, 0, 100, 52");
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
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
        java.lang.String str41 = item39.toString();
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!, -3, 0" + "'", str41, "hi!, -3, 0");
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        java.lang.String str16 = item14.name;
        int int17 = item14.quality;
        int int18 = item14.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 100, 1" + "'", str16, "hi!, 100, 1");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
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
        item49.name = "hi!, 0, 0, 99, 0";
        java.lang.String str52 = item49.name;
        item49.name = "hi!, 0, 0, 51, 0, -2, 98";
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str52, "hi!, 0, 0, 99, 0");
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
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
        java.lang.String str41 = item37.toString();
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!, -2, 0" + "'", str41, "hi!, -2, 0");
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        item3.name = "hi!, 52, 1";
        item3.name = "hi!, 10, 0";
        int int8 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
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
        java.lang.Class<?> wildcardClass79 = item71.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
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
        item34.name = "hi!, 100, 1, 9, 1, 97, 50";
        item34.name = "hi!, 1, 99";
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
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
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
        item42.name = "hi!, 0, 0, 0, 1, 1, 0";
        item42.sellIn = (byte) 0;
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
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 100", 32, 46);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (-1), 52);
        int int4 = item3.quality;
        java.lang.String str5 = item3.name;
        item3.quality = 9;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str5, "hi!, 0, 0, 99, 0");
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 100, 52", (int) (byte) 100, (int) (byte) 100);
        int int13 = item12.quality;
        com.gildedrose.Item item14 = itemUpdater8.update(item12);
        item14.sellIn = 8;
        int int17 = item14.sellIn;
        int int18 = item14.sellIn;
        item14.sellIn = 0;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(item14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory78 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater80 = itemUpdaterFactory78.getInstance("");
        com.gildedrose.Item item84 = new com.gildedrose.Item("hi!", 100, 1);
        int int85 = item84.sellIn;
        com.gildedrose.Item item86 = itemUpdater80.update(item84);
        int int87 = item84.sellIn;
        int int88 = item84.sellIn;
        int int89 = item84.quality;
        java.lang.String str90 = item84.name;
        item84.quality = 9;
        com.gildedrose.Item item93 = itemUpdater2.update(item84);
        java.lang.Class<?> wildcardClass94 = itemUpdater2.getClass();
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
        org.junit.Assert.assertNotNull(itemUpdater80);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 100 + "'", int85 == 100);
        org.junit.Assert.assertNotNull(item86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 99 + "'", int87 == 99);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 99 + "'", int88 == 99);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
        org.junit.Assert.assertNotNull(item93);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
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
        item22.sellIn = (short) 1;
        java.lang.String str27 = item22.name;
        item22.sellIn = '#';
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 99, 0" + "'", str16, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 10, 0" + "'", str19, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!, 10, 0, 10, 1, 1, -1, 52, 52" + "'", str27, "hi!, 10, 0, 10, 1, 1, -1, 52, 52");
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
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
        java.lang.String str21 = item20.name;
        java.lang.String str22 = item20.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, -1, 0, -1, 0" + "'", str19, "hi!, -1, 0, -1, 0");
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, -1, 0" + "'", str21, "hi!, -1, 0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, -1, 0, -2, 0" + "'", str22, "hi!, -1, 0, -2, 0");
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 51, 0, 32, -3", (-2), (int) (short) 10);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str15 = item14.name;
        java.lang.String str16 = item14.name;
        java.lang.String str17 = item14.toString();
        java.lang.String str18 = item14.toString();
        item14.quality = 99;
        com.gildedrose.Item item21 = itemUpdater10.update(item14);
        java.lang.Class<?> wildcardClass22 = item14.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 100, 1" + "'", str17, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 100, 1" + "'", str18, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str9 = item8.name;
        java.lang.String str10 = item8.toString();
        com.gildedrose.Item item11 = itemUpdater4.update(item8);
        int int12 = item11.quality;
        int int13 = item11.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 0, 0" + "'", str9, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str10, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        java.lang.Class<?> wildcardClass10 = item6.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', 1);
        item3.name = "hi!, 0, 0";
        java.lang.String str6 = item3.toString();
        java.lang.String str7 = item3.toString();
        item3.name = "hi!, 98, 0";
        java.lang.String str10 = item3.name;
        int int11 = item3.quality;
        int int12 = item3.quality;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str6, "hi!, 0, 0, 52, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str7, "hi!, 0, 0, 52, 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 98, 0" + "'", str10, "hi!, 98, 0");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 9, 1", (-3), 0);
        item3.sellIn = (byte) 0;
        item3.name = "hi!, 99, 0, 100, 52, 99, 0";
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
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
        item15.name = "hi!, -3, 0, 96, 49";
        java.lang.String str22 = item15.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1" + "'", str14, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, -3, 0, 96, 49, 99, 0" + "'", str22, "hi!, -3, 0, 96, 49, 99, 0");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
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
        item23.sellIn = 48;
        item23.name = "hi!, 99, 8";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertNotNull(item23);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.Item item16 = new com.gildedrose.Item("hi!", (int) '4', (int) (byte) 1);
        com.gildedrose.Item item17 = itemUpdater12.update(item16);
        com.gildedrose.Item item21 = new com.gildedrose.Item("hi!, 0, 0, 52, 1", 8, 96);
        item21.quality = 31;
        com.gildedrose.Item item24 = itemUpdater12.update(item21);
        item24.quality = '#';
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertNotNull(item24);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50, 1, 100", (-1), (int) (byte) 100);
        java.lang.String str4 = item3.toString();
        java.lang.String str5 = item3.name;
        item3.quality = '#';
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 0, 50, 1, 100, -1, 100" + "'", str4, ", 0, 50, 1, 100, -1, 100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 0, 50, 1, 100" + "'", str5, ", 0, 50, 1, 100");
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        item3.sellIn = (short) -1;
        item3.quality = (-3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0" + "'", str4, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 0, 0" + "'", str5, "hi!, 0, 0");
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 30, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 50, 49, 96, 49");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        item3.name = "hi!, 100, 1, 98, 0";
        int int8 = item3.quality;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance(", 0, 50, 1, 100, -1, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory13 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.Item item21 = new com.gildedrose.Item("hi!", 100, 1);
        int int22 = item21.sellIn;
        com.gildedrose.Item item23 = itemUpdater17.update(item21);
        java.lang.String str24 = item21.toString();
        item21.sellIn = 10;
        item21.quality = 96;
        item21.sellIn = 32;
        int int31 = item21.quality;
        com.gildedrose.Item item32 = itemUpdater12.update(item21);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 96 + "'", int31 == 96);
        org.junit.Assert.assertNotNull(item32);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 10, (int) '4');
        item3.quality = (short) -1;
        item3.sellIn = (-1);
        int int8 = item3.sellIn;
        item3.quality = 0;
        int int11 = item3.quality;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 99, 0, 0, 52" + "'", str4, "hi!, 99, 0, 0, 52");
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 98, 0");
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
        java.lang.String str31 = item29.toString();
        int int32 = item29.quality;
        com.gildedrose.Item item33 = itemUpdater12.update(item29);
        item33.name = "hi!, 10, 0, 10, 0";
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!, -1, 0" + "'", str31, "hi!, -1, 0");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(item33);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
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
        com.gildedrose.Item item69 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item69.sellIn = (byte) 100;
        java.lang.String str72 = item69.name;
        int int73 = item69.sellIn;
        java.lang.String str74 = item69.toString();
        item69.sellIn = 7;
        com.gildedrose.Item item77 = itemUpdater4.update(item69);
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
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!, 99, 0" + "'", str72, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 100 + "'", int73 == 100);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!, 99, 0, 100, 52" + "'", str74, "hi!, 99, 0, 100, 52");
        org.junit.Assert.assertNotNull(item77);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", (int) (byte) 10, (int) (short) 100);
        item3.quality = 'a';
        java.lang.String str6 = item3.name;
        item3.quality = (-1);
        int int9 = item3.quality;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 100, 1" + "'", str6, "hi!, 100, 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 100, 0", 96, 49);
        java.lang.String str4 = item3.name;
        int int5 = item3.quality;
        java.lang.String str6 = item3.toString();
        int int7 = item3.sellIn;
        int int8 = item3.sellIn;
        item3.sellIn = 31;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 100, 0" + "'", str4, "hi!, 100, 1, 100, 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 100, 1, 100, 0, 96, 49" + "'", str6, "hi!, 100, 1, 100, 0, 96, 49");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 96 + "'", int7 == 96);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
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
        int int33 = item26.sellIn;
        int int34 = item26.quality;
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
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
        com.gildedrose.ItemUpdater itemUpdater65 = itemUpdaterFactory63.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater67 = itemUpdaterFactory63.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater69 = itemUpdaterFactory63.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater71 = itemUpdaterFactory63.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdater itemUpdater73 = itemUpdaterFactory63.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory74 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater76 = itemUpdaterFactory74.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater78 = itemUpdaterFactory74.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater80 = itemUpdaterFactory74.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater82 = itemUpdaterFactory74.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater84 = itemUpdaterFactory74.getInstance("hi!, -1, 1");
        com.gildedrose.Item item88 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) '4');
        java.lang.String str89 = item88.name;
        int int90 = item88.sellIn;
        item88.sellIn = 0;
        com.gildedrose.Item item93 = itemUpdater84.update(item88);
        com.gildedrose.Item item94 = itemUpdater73.update(item88);
        com.gildedrose.Item item95 = itemUpdater8.update(item88);
        int int96 = item88.quality;
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
        org.junit.Assert.assertNotNull(itemUpdater69);
        org.junit.Assert.assertNotNull(itemUpdater71);
        org.junit.Assert.assertNotNull(itemUpdater73);
        org.junit.Assert.assertNotNull(itemUpdater76);
        org.junit.Assert.assertNotNull(itemUpdater78);
        org.junit.Assert.assertNotNull(itemUpdater80);
        org.junit.Assert.assertNotNull(itemUpdater82);
        org.junit.Assert.assertNotNull(itemUpdater84);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!, 99, 0" + "'", str89, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 52 + "'", int90 == 52);
        org.junit.Assert.assertNotNull(item93);
        org.junit.Assert.assertNotNull(item94);
        org.junit.Assert.assertNotNull(item95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 46 + "'", int96 == 46);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
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
        item23.sellIn = 35;
        item23.sellIn = 31;
        item23.quality = 8;
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
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory26 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory26.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory26.getInstance("hi!, -1, 0");
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str35 = item34.name;
        java.lang.String str36 = item34.toString();
        com.gildedrose.Item item37 = itemUpdater30.update(item34);
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
        int int55 = item46.sellIn;
        com.gildedrose.Item item56 = itemUpdater30.update(item46);
        java.lang.String str57 = item56.name;
        com.gildedrose.Item item58 = itemUpdater8.update(item56);
        int int59 = item58.sellIn;
        int int60 = item58.sellIn;
        int int61 = item58.sellIn;
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
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!, 0, 0" + "'", str35, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str36, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(itemUpdater40);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!, 99, 0" + "'", str49, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!, 10, 0" + "'", str52, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 98 + "'", int55 == 98);
        org.junit.Assert.assertNotNull(item56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(item58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 96 + "'", int59 == 96);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 96 + "'", int60 == 96);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 96 + "'", int61 == 96);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!, 1, 0, 98, 99", 32, (-2));
        java.lang.String str11 = item10.toString();
        item10.sellIn = 96;
        com.gildedrose.Item item14 = itemUpdater6.update(item10);
        int int15 = item10.sellIn;
        item10.quality = 9;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 0, 98, 99, 32, -2" + "'", str11, "hi!, 1, 0, 98, 99, 32, -2");
        org.junit.Assert.assertNotNull(item14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 95 + "'", int15 == 95);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 97, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory19 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory19.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory19.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory19.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory19.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory28 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory28.getInstance("");
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!", 100, 1);
        int int35 = item34.sellIn;
        com.gildedrose.Item item36 = itemUpdater30.update(item34);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory37 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater39 = itemUpdaterFactory37.getInstance("");
        com.gildedrose.Item item43 = new com.gildedrose.Item("hi!", 100, 1);
        int int44 = item43.sellIn;
        com.gildedrose.Item item45 = itemUpdater39.update(item43);
        item43.sellIn = (byte) 0;
        java.lang.String str48 = item43.toString();
        com.gildedrose.Item item49 = itemUpdater30.update(item43);
        com.gildedrose.Item item50 = itemUpdater27.update(item43);
        item50.name = "hi!, 100, 1";
        int int53 = item50.quality;
        com.gildedrose.Item item54 = itemUpdater18.update(item50);
        com.gildedrose.Item item55 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.gildedrose.Item item56 = itemUpdater18.update(item55);
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
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertNotNull(itemUpdater39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!, 0, 0" + "'", str48, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item49);
        org.junit.Assert.assertNotNull(item50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(item54);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
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
        int int37 = item29.sellIn;
        int int38 = item29.quality;
        item29.sellIn = (short) 10;
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
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
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
        java.lang.String str58 = item53.toString();
        item53.sellIn = 96;
        int int61 = item53.quality;
        item53.quality = 95;
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
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!, -4, 0" + "'", str58, "hi!, -4, 0");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 100, 1");
        com.gildedrose.Item item16 = new com.gildedrose.Item("", 1, (int) ' ');
        item16.quality = 99;
        item16.name = "hi!, 0, 0, 51, 0";
        item16.sellIn = 98;
        java.lang.String str23 = item16.toString();
        com.gildedrose.Item item24 = itemUpdater12.update(item16);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 0, 0, 51, 0, 98, 99" + "'", str23, "hi!, 0, 0, 51, 0, 98, 99");
        org.junit.Assert.assertNotNull(item24);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        java.lang.String str4 = item3.toString();
        item3.quality = '4';
        int int7 = item3.quality;
        item3.name = "hi!, -1, 0, 100, 52";
        item3.quality = (byte) 100;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 1, 32" + "'", str4, ", 1, 32");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
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
        int int44 = item40.quality;
        java.lang.String str45 = item40.name;
        com.gildedrose.Item item46 = itemUpdater10.update(item40);
        java.lang.String str47 = item46.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(item46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!, 97, 0" + "'", str47, "hi!, 97, 0");
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 30, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.Item item14 = new com.gildedrose.Item(", 1, 32", 1, 9);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        item15.sellIn = 35;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1", (int) ' ', (int) ' ');
        item3.sellIn = (byte) 10;
        item3.quality = 99;
        item3.quality = 46;
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
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
        item35.name = "hi!, 98, -2";
        int int41 = item35.quality;
        item35.name = "hi!, -1, 52, 0, 100";
        int int44 = item35.sellIn;
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 31 + "'", int44 == 31);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
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
        java.lang.Class<?> wildcardClass33 = item31.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
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
        java.lang.String str51 = item48.toString();
        java.lang.String str52 = item48.name;
        int int53 = item48.sellIn;
        int int54 = item48.sellIn;
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
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!, -3, 0" + "'", str51, "hi!, -3, 0");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-3) + "'", int53 == (-3));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-3) + "'", int54 == (-3));
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
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
        int int34 = item28.quality;
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
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
        item78.name = "hi!, 10, 0, 100, 0";
        item78.sellIn = '4';
        java.lang.String str84 = item78.toString();
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
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!, 10, 0, 100, 0, 52, 0" + "'", str84, "hi!, 10, 0, 100, 0, 52, 0");
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 31, 32");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", (int) '4', (int) '#');
        item3.quality = 1;
        java.lang.String str6 = item3.name;
        int int7 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 100, 1" + "'", str6, "hi!, 100, 1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
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
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory31.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory31.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater37 = itemUpdaterFactory31.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater39 = itemUpdaterFactory31.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater41 = itemUpdaterFactory31.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater43 = itemUpdaterFactory31.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater45 = itemUpdaterFactory31.getInstance("hi!, -3, 0");
        com.gildedrose.Item item49 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str50 = item49.name;
        java.lang.String str51 = item49.name;
        java.lang.String str52 = item49.name;
        com.gildedrose.Item item53 = itemUpdater45.update(item49);
        com.gildedrose.Item item54 = itemUpdater4.update(item49);
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
        org.junit.Assert.assertNotNull(itemUpdater39);
        org.junit.Assert.assertNotNull(itemUpdater41);
        org.junit.Assert.assertNotNull(itemUpdater43);
        org.junit.Assert.assertNotNull(itemUpdater45);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertNotNull(item54);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 98, 99, 32, -2", (int) ' ', 97);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 52, 32, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -1, 52");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, -3");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 52, 0");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, -1, 52");
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
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 0, 50, 1, 100, -1, 100");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 99, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 32, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        item12.sellIn = 52;
        java.lang.String str15 = item12.name;
        com.gildedrose.Item item16 = itemUpdater8.update(item12);
        java.lang.Class<?> wildcardClass17 = item16.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 0, 0" + "'", str15, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, -1, 35", (-4), 9);
        int int4 = item3.quality;
        java.lang.String str5 = item3.name;
        item3.name = "";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 0, 0, -1, 35" + "'", str5, "hi!, 0, 0, -1, 35");
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 52, 32, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 10, 0, 31, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 98, 0, 31, 32, 50, 0");
        com.gildedrose.Item item18 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        item18.quality = '4';
        int int21 = item18.quality;
        java.lang.String str22 = item18.toString();
        int int23 = item18.sellIn;
        com.gildedrose.Item item24 = itemUpdater14.update(item18);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ", 1, 52" + "'", str22, ", 1, 52");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(item24);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 96, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 52, 1, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, -3, 0, 96, 49, 99, 0");
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
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
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
        com.gildedrose.Item item30 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str31 = item30.name;
        int int32 = item30.sellIn;
        item30.name = "hi!, 100, 1";
        com.gildedrose.Item item35 = itemUpdater8.update(item30);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!, 0, 0" + "'", str31, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertNotNull(item35);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -1, 0, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1, 52, 100");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 50, 49, -2, 52");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 1, 0, 98, 99, 32, -2, -2, 1");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 100, 0, 51, 35");
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
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
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
        java.lang.Class<?> wildcardClass66 = itemUpdater2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", (int) (byte) 10, (int) (short) 100);
        item3.sellIn = ' ';
        item3.sellIn = (byte) 10;
        item3.name = "hi!, 100, -1";
        int int10 = item3.quality;
        item3.quality = (-3);
        item3.name = "hi!, 0, 0, 31, 97";
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 96, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 97");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 50, 0, 98, 48");
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
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, -1", 98, 9);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, -1" + "'", str4, "hi!, 10, -1");
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.name;
        item3.name = "hi!, 100, 52";
        item3.sellIn = ' ';
        item3.quality = '4';
        int int13 = item3.quality;
        item3.sellIn = '4';
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 1, (int) ' ');
        item3.quality = 99;
        int int6 = item3.quality;
        item3.name = "";
        java.lang.String str9 = item3.toString();
        item3.name = "hi!, 99, 49";
        item3.sellIn = 'a';
        item3.quality = (byte) 1;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6 == 99);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 1, 99" + "'", str9, ", 1, 99");
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory9.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory19 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory19.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory19.getInstance("");
        com.gildedrose.Item item27 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item27.sellIn = 52;
        int int30 = item27.quality;
        com.gildedrose.Item item31 = itemUpdater23.update(item27);
        com.gildedrose.Item item32 = itemUpdater18.update(item31);
        com.gildedrose.Item item33 = itemUpdater15.update(item31);
        java.lang.String str34 = item33.toString();
        item33.sellIn = (short) -1;
        int int37 = item33.sellIn;
        com.gildedrose.Item item38 = itemUpdater8.update(item33);
        java.lang.String str39 = item38.toString();
        item38.quality = 46;
        int int42 = item38.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!, 0, 0, 99, 0, 49, 48" + "'", str34, "hi!, 0, 0, 99, 0, 49, 48");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(item38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!, 0, 0, 99, 0, -2, 46" + "'", str39, "hi!, 0, 0, 99, 0, -2, 46");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-2) + "'", int42 == (-2));
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 98");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 51, 0", 9, 10);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory14 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory14.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory14.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory14.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item28 = new com.gildedrose.Item("", (int) '4', 1);
        com.gildedrose.Item item29 = itemUpdater24.update(item28);
        item29.sellIn = 96;
        item29.quality = 100;
        int int34 = item29.sellIn;
        java.lang.String str35 = item29.name;
        com.gildedrose.Item item36 = itemUpdater8.update(item29);
        item36.sellIn = 49;
        item36.name = "hi!, 100, -1, -2, 97";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 96 + "'", int34 == 96);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(item36);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 98");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 51, 0", 9, 10);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory14 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory14.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory14.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory14.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item28 = new com.gildedrose.Item("", (int) '4', 1);
        com.gildedrose.Item item29 = itemUpdater24.update(item28);
        item29.sellIn = 96;
        item29.quality = 100;
        int int34 = item29.sellIn;
        java.lang.String str35 = item29.name;
        com.gildedrose.Item item36 = itemUpdater8.update(item29);
        com.gildedrose.Item item40 = new com.gildedrose.Item("hi!, 100, 52, 8, 50", 32, 98);
        com.gildedrose.Item item41 = itemUpdater8.update(item40);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory42 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater44 = itemUpdaterFactory42.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory45 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater47 = itemUpdaterFactory45.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater49 = itemUpdaterFactory45.getInstance("");
        com.gildedrose.Item item53 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item53.sellIn = 52;
        int int56 = item53.quality;
        com.gildedrose.Item item57 = itemUpdater49.update(item53);
        com.gildedrose.Item item58 = itemUpdater44.update(item57);
        java.lang.String str59 = item58.name;
        item58.name = "hi!, 96, 8";
        item58.sellIn = 97;
        com.gildedrose.Item item64 = itemUpdater8.update(item58);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 96 + "'", int34 == 96);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertNotNull(itemUpdater44);
        org.junit.Assert.assertNotNull(itemUpdater47);
        org.junit.Assert.assertNotNull(itemUpdater49);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertNotNull(item58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str59, "hi!, 0, 0, 99, 0");
        org.junit.Assert.assertNotNull(item64);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
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
        java.lang.String str19 = item15.name;
        int int20 = item15.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 100, 1" + "'", str19, "hi!, 100, 1");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 1, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 50, 0");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 49");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory0.getInstance("hi!, -1, 52, 1, 31");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory21 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory21.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory21.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item33 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item34 = itemUpdater29.update(item33);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory35 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater37 = itemUpdaterFactory35.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater39 = itemUpdaterFactory35.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory40 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory40.getInstance("");
        com.gildedrose.Item item46 = new com.gildedrose.Item("hi!", 100, 1);
        int int47 = item46.sellIn;
        com.gildedrose.Item item48 = itemUpdater42.update(item46);
        item46.sellIn = (byte) 0;
        com.gildedrose.Item item51 = itemUpdater39.update(item46);
        com.gildedrose.Item item52 = itemUpdater29.update(item51);
        com.gildedrose.Item item56 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str57 = item56.name;
        java.lang.String str58 = item56.toString();
        com.gildedrose.Item item59 = itemUpdater29.update(item56);
        com.gildedrose.Item item63 = new com.gildedrose.Item(", 0, 50", (int) (short) 1, (int) (short) 100);
        item63.quality = (byte) -1;
        int int66 = item63.quality;
        item63.quality = 49;
        com.gildedrose.Item item69 = itemUpdater29.update(item63);
        int int70 = item69.quality;
        com.gildedrose.Item item71 = itemUpdater20.update(item69);
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
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater29);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertNotNull(itemUpdater37);
        org.junit.Assert.assertNotNull(itemUpdater39);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(item51);
        org.junit.Assert.assertNotNull(item52);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!, 0, 0" + "'", str57, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!, 0, 0, 32, 0" + "'", str58, "hi!, 0, 0, 32, 0");
        org.junit.Assert.assertNotNull(item59);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(item69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 48 + "'", int70 == 48);
        org.junit.Assert.assertNotNull(item71);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!, -1, 1", (int) ' ', (int) ' ');
        item10.sellIn = (byte) 10;
        com.gildedrose.Item item13 = itemUpdater6.update(item10);
        item10.name = "hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, 9, 100, 0";
        java.lang.String str16 = item10.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, 9, 100, 0, 9, 31" + "'", str16, "hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, 9, 100, 0, 9, 31");
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
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
        item29.name = "hi!, 99, 0, 0, 10";
        int int40 = item29.sellIn;
        java.lang.Class<?> wildcardClass41 = item29.getClass();
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 98 + "'", int40 == 98);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, -2, 50", 1, 96);
        int int13 = item12.sellIn;
        com.gildedrose.Item item14 = itemUpdater2.update(item12);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory15 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory15.getInstance("");
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
        com.gildedrose.Item item35 = itemUpdater17.update(item29);
        com.gildedrose.Item item39 = new com.gildedrose.Item("", (int) '4', 1);
        int int40 = item39.sellIn;
        item39.name = "hi!";
        java.lang.String str43 = item39.name;
        int int44 = item39.sellIn;
        com.gildedrose.Item item45 = itemUpdater17.update(item39);
        int int46 = item45.sellIn;
        java.lang.String str47 = item45.name;
        int int48 = item45.quality;
        item45.sellIn = 98;
        com.gildedrose.Item item51 = itemUpdater2.update(item45);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(item14);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 51 + "'", int46 == 51);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(item51);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 100, 0", 96, 49);
        java.lang.String str4 = item3.name;
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.name;
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 100, 0" + "'", str4, "hi!, 100, 1, 100, 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 100, 1, 100, 0" + "'", str7, "hi!, 100, 1, 100, 0");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 0, 52");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 1, 0, 98, 99, 32, -2, 1, 34");
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
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        item8.quality = 96;
        java.lang.String str16 = item8.toString();
        int int17 = item8.quality;
        item8.sellIn = (short) 10;
        int int20 = item8.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 10, 96" + "'", str16, "hi!, 10, 96");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 96 + "'", int17 == 96);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.name = "hi!, 10, 0";
        item8.name = "";
        item8.name = ", 100, 1, -4, 0";
        int int18 = item8.quality;
        java.lang.String str19 = item8.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ", 100, 1, -4, 0" + "'", str19, ", 100, 1, -4, 0");
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (-1), 52);
        int int4 = item3.quality;
        item3.sellIn = 98;
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 0, 0, 99, 0, 98, 52" + "'", str7, "hi!, 0, 0, 99, 0, 98, 52");
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 52");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 50, 49, -2, 52");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 0", (int) (byte) 0, 31);
        item3.quality = '4';
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 52, 1, 98");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 10, 97");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 1, 98, 0");
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
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
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
        int int26 = item24.sellIn;
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
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 52");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 49, 50");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, -2, 50");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory58 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater60 = itemUpdaterFactory58.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater62 = itemUpdaterFactory58.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory63 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater65 = itemUpdaterFactory63.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater67 = itemUpdaterFactory63.getInstance("");
        com.gildedrose.Item item71 = new com.gildedrose.Item("hi!", 100, 1);
        int int72 = item71.sellIn;
        com.gildedrose.Item item73 = itemUpdater67.update(item71);
        java.lang.String str74 = item71.toString();
        item71.sellIn = 10;
        java.lang.String str77 = item71.toString();
        item71.sellIn = 1;
        com.gildedrose.Item item80 = itemUpdater62.update(item71);
        java.lang.String str81 = item71.toString();
        com.gildedrose.Item item82 = itemUpdater19.update(item71);
        int int83 = item71.quality;
        java.lang.String str84 = item71.name;
        item71.quality = 0;
        item71.sellIn = (-4);
        com.gildedrose.Item item89 = itemUpdater14.update(item71);
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
        org.junit.Assert.assertNotNull(itemUpdater60);
        org.junit.Assert.assertNotNull(itemUpdater62);
        org.junit.Assert.assertNotNull(itemUpdater65);
        org.junit.Assert.assertNotNull(itemUpdater67);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 100 + "'", int72 == 100);
        org.junit.Assert.assertNotNull(item73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!, 99, 0" + "'", str74, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!, 10, 0" + "'", str77, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!, 0, 0" + "'", str81, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertNotNull(item89);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory26 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory26.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory26.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater32 = itemUpdaterFactory26.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater34 = itemUpdaterFactory26.getInstance("hi!, -1, 0, -2, 0");
        com.gildedrose.Item item38 = new com.gildedrose.Item("hi!, 0, 0, 31, 97", (int) (byte) 100, 48);
        com.gildedrose.Item item39 = itemUpdater34.update(item38);
        com.gildedrose.Item item40 = itemUpdater8.update(item39);
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
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertNotNull(itemUpdater32);
        org.junit.Assert.assertNotNull(itemUpdater34);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertNotNull(item40);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 32, (int) (byte) 0);
        item3.quality = 32;
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 99, 0, 32, 32" + "'", str6, "hi!, 99, 0, 32, 32");
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 52", 0, 32);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 34, 0", (-3), (int) (short) -1);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
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
        item17.quality = 98;
        item17.sellIn = 99;
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
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory9.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory9.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory9.getInstance("hi!, 100, 1, 9, 1");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory9.getInstance(", 52, 1");
        com.gildedrose.Item item25 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item25.sellIn = (byte) 100;
        item25.name = "hi!, 100, 1, 100, 1";
        com.gildedrose.Item item30 = itemUpdater21.update(item25);
        com.gildedrose.Item item31 = itemUpdater8.update(item25);
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
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(item31);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
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
        int int65 = item64.sellIn;
        int int66 = item64.sellIn;
        item64.name = "hi!, 100, 1, 9, 50";
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
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-2) + "'", int65 == (-2));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-2) + "'", int66 == (-2));
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) '4', (int) (byte) 1);
        java.lang.String str4 = item3.name;
        item3.quality = 'a';
        item3.sellIn = 100;
        java.lang.String str9 = item3.toString();
        java.lang.String str10 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 100, 97" + "'", str9, "hi!, 100, 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 100, 97" + "'", str10, "hi!, 100, 97");
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str11 = item10.name;
        java.lang.String str12 = item10.toString();
        java.lang.String str13 = item10.name;
        com.gildedrose.Item item14 = itemUpdater6.update(item10);
        java.lang.String str15 = item10.name;
        java.lang.Class<?> wildcardClass16 = item10.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 100, 1" + "'", str12, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(item14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        java.lang.String str6 = item3.name;
        item3.name = "hi!, -1, 0";
        item3.name = "hi!";
        item3.sellIn = (short) 10;
        java.lang.String str13 = item3.toString();
        item3.quality = 30;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 99, 0" + "'", str6, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 10, 52" + "'", str13, "hi!, 10, 52");
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.Item item15 = new com.gildedrose.Item("hi!", 100, 1);
        int int16 = item15.sellIn;
        com.gildedrose.Item item17 = itemUpdater11.update(item15);
        java.lang.String str18 = item15.toString();
        item15.sellIn = 10;
        int int21 = item15.sellIn;
        item15.name = "hi!, 10, 0";
        int int24 = item15.sellIn;
        java.lang.String str25 = item15.toString();
        item15.quality = (byte) 1;
        com.gildedrose.Item item28 = itemUpdater6.update(item15);
        java.lang.String str29 = item15.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 99, 0" + "'", str18, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!, 10, 0, 10, 0" + "'", str25, "hi!, 10, 0, 10, 0");
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!, 10, 0" + "'", str29, "hi!, 10, 0");
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        item8.quality = 100;
        java.lang.String str11 = item8.toString();
        item8.sellIn = 33;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 100" + "'", str11, "hi!, 99, 100");
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -1, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 1, 8, 30, 31, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 0, 0", 10, 35);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        int int9 = item4.sellIn;
        int int10 = item4.sellIn;
        java.lang.String str11 = item4.name;
        item4.sellIn = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 0, 0" + "'", str11, "hi!, 0, 0");
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
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
        int int65 = item64.sellIn;
        int int66 = item64.quality;
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
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-2) + "'", int65 == (-2));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
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
        item15.sellIn = 99;
        item15.sellIn = 0;
        item15.quality = (short) 0;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51 + "'", int17 == 51);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        item3.name = "hi!, 100, 1";
        java.lang.String str7 = item3.name;
        item3.quality = (byte) 10;
        java.lang.String str10 = item3.name;
        java.lang.String str11 = item3.name;
        int int12 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 100, 1" + "'", str7, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 100, 1" + "'", str10, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 100, 1" + "'", str11, "hi!, 100, 1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) '4', (int) (byte) 1);
        java.lang.String str4 = item3.toString();
        item3.sellIn = '4';
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 1" + "'", str4, "hi!, 52, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 52, 1" + "'", str7, "hi!, 52, 1");
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        item6.sellIn = (byte) 0;
        int int11 = item6.quality;
        item6.name = "hi!, 100, 1, 32, 100, -3, 50";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
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
        java.lang.String str58 = item52.name;
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
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!, 100, 1" + "'", str58, "hi!, 100, 1");
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
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
        int int28 = item17.sellIn;
        item17.quality = 7;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 99 + "'", int28 == 99);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
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
        item32.sellIn = (byte) 0;
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
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
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
        java.lang.String str50 = item38.name;
        int int51 = item38.sellIn;
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 99 + "'", int51 == 99);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", (-1), 99);
        int int4 = item3.sellIn;
        item3.sellIn = (byte) -1;
        item3.quality = (byte) 10;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
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
        int int42 = item37.quality;
        java.lang.String str43 = item37.toString();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!, 98, -2, 8, 0" + "'", str43, "hi!, 98, -2, 8, 0");
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 1, 0, 32", (int) (short) 0, 10);
        item3.quality = 33;
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 1, 0, 0, 52, -2, 52");
        com.gildedrose.Item item18 = new com.gildedrose.Item("hi!, 99, 0", 98, (int) (short) 100);
        com.gildedrose.Item item19 = itemUpdater14.update(item18);
        int int20 = item18.sellIn;
        item18.sellIn = (byte) 10;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 32, 0", 96, 32);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 9, 9", 0, 96);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 1, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 50, 0");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 49");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory0.getInstance("hi!, -1, 52, 1, 31");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory21 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory21.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater31 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory21.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory21.getInstance("hi!, 99, 0, 0, 52");
        com.gildedrose.Item item39 = new com.gildedrose.Item("hi!", 100, 1);
        item39.sellIn = 99;
        item39.name = "";
        com.gildedrose.Item item44 = itemUpdater35.update(item39);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory45 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater47 = itemUpdaterFactory45.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater49 = itemUpdaterFactory45.getInstance("");
        com.gildedrose.Item item53 = new com.gildedrose.Item("hi!", 100, 1);
        int int54 = item53.sellIn;
        com.gildedrose.Item item55 = itemUpdater49.update(item53);
        int int56 = item53.sellIn;
        java.lang.String str57 = item53.name;
        com.gildedrose.Item item58 = itemUpdater35.update(item53);
        com.gildedrose.Item item59 = itemUpdater20.update(item58);
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
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater29);
        org.junit.Assert.assertNotNull(itemUpdater31);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertNotNull(itemUpdater47);
        org.junit.Assert.assertNotNull(itemUpdater49);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertNotNull(item55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 99 + "'", int56 == 99);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(item58);
        org.junit.Assert.assertNotNull(item59);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 100, 1", 10, 49);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 10, (int) '4');
        item3.quality = (short) -1;
        java.lang.String str6 = item3.toString();
        int int7 = item3.quality;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 10, -1" + "'", str6, "hi!, 10, -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 100, 52, 99, 0", 7, (int) (byte) 1);
        java.lang.String str4 = item3.toString();
        item3.name = "hi!, -2, 30";
        item3.quality = ' ';
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 99, 0, 100, 52, 99, 0, 7, 1" + "'", str4, "hi!, 99, 0, 100, 52, 99, 0, 7, 1");
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', 1);
        int int4 = item3.sellIn;
        item3.name = "hi!";
        java.lang.String str7 = item3.name;
        int int8 = item3.quality;
        java.lang.String str9 = item3.toString();
        item3.sellIn = 8;
        item3.quality = 52;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 52, 1" + "'", str9, "hi!, 52, 1");
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", (int) (byte) 10, (int) (short) 100);
        item3.sellIn = ' ';
        item3.sellIn = (byte) 10;
        item3.name = "hi!, 100, -1";
        java.lang.String str10 = item3.name;
        item3.sellIn = 31;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 100, -1" + "'", str10, "hi!, 100, -1");
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 100, 1", (int) '4', (int) '#');
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        java.lang.String str14 = item13.name;
        item13.quality = (byte) 100;
        item13.name = ", 1, 99";
        item13.name = "hi!, 100, 52, 32, 52";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1" + "'", str14, "hi!, 100, 1");
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 0, 0, -1, 50");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, -4, -1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 95, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
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
        int int78 = item77.quality;
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
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1", 51, 9);
        java.lang.String str4 = item3.toString();
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.toString();
        item3.name = "hi!, 0, 0, -1, 0";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, 0, 10, 1, 51, 9" + "'", str4, "hi!, 10, 0, 10, 1, 51, 9");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 10, 0, 10, 1, 51, 9" + "'", str6, "hi!, 10, 0, 10, 1, 51, 9");
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 9, 1", (-3), 0);
        item3.sellIn = (byte) 0;
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 100, 1, 9, 1, 0, 0" + "'", str6, "hi!, 100, 1, 9, 1, 0, 0");
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 52, 10");
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -3, 50");
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
        org.junit.Assert.assertNotNull(itemUpdater22);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -2, 50, 96, 0", 0, 98);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49", 35, (-1));
        item3.name = "hi!, 10, 0";
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory26 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory26.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory26.getInstance("hi!, -1, 0");
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str35 = item34.name;
        java.lang.String str36 = item34.toString();
        com.gildedrose.Item item37 = itemUpdater30.update(item34);
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
        int int55 = item46.sellIn;
        com.gildedrose.Item item56 = itemUpdater30.update(item46);
        java.lang.String str57 = item56.name;
        com.gildedrose.Item item58 = itemUpdater8.update(item56);
        item56.name = "hi!, 0, 0, 99, 0, -2, 46";
        item56.name = "hi!, 0, 50";
        java.lang.Class<?> wildcardClass63 = item56.getClass();
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
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!, 0, 0" + "'", str35, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str36, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(itemUpdater40);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!, 99, 0" + "'", str49, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!, 10, 0" + "'", str52, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 98 + "'", int55 == 98);
        org.junit.Assert.assertNotNull(item56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(item58);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 0, (int) (short) -1);
        item3.sellIn = (-3);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -2, 50");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, -1, 1, 8, 30");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 51, 0, -2, 98");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 0, 0, -1, 100");
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
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        item3.quality = 49;
        int int6 = item3.sellIn;
        item3.name = "hi!, 100, 1, 51, 34, 1, -3";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 1, 99", 50, 34);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0, 1, 99, 50, 34" + "'", str4, "hi!, 0, 0, 1, 99, 50, 34");
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 98, 0, 100, -1", 33, 0);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 49, 48");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 52, 1, 0, 32");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory15 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory15.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory15.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item27 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item28 = itemUpdater23.update(item27);
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
        int int62 = item58.quality;
        item58.sellIn = 99;
        item58.name = "";
        item58.name = "hi!, 51, 0";
        com.gildedrose.Item item69 = itemUpdater23.update(item58);
        java.lang.String str70 = item58.name;
        item58.sellIn = 9;
        com.gildedrose.Item item73 = itemUpdater14.update(item58);
        java.lang.Class<?> wildcardClass74 = item73.getClass();
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
        org.junit.Assert.assertNotNull(item28);
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
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(item69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!, 51, 0" + "'", str70, "hi!, 51, 0");
        org.junit.Assert.assertNotNull(item73);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory3 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdaterFactory3.getInstance("");
        com.gildedrose.Item item9 = new com.gildedrose.Item("hi!", 100, 1);
        int int10 = item9.sellIn;
        com.gildedrose.Item item11 = itemUpdater5.update(item9);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory12 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory15 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.Item item23 = new com.gildedrose.Item("hi!", 100, 1);
        int int24 = item23.sellIn;
        com.gildedrose.Item item25 = itemUpdater19.update(item23);
        com.gildedrose.Item item26 = itemUpdater14.update(item25);
        com.gildedrose.Item item27 = itemUpdater5.update(item26);
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater28 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item32 = new com.gildedrose.Item("hi!", 100, 1);
        int int33 = item32.sellIn;
        com.gildedrose.Item item34 = conjuredItemUpdater28.update(item32);
        item32.name = "hi!, 0, 0";
        int int37 = item32.quality;
        java.lang.String str38 = item32.toString();
        com.gildedrose.Item item39 = itemUpdater5.update(item32);
        java.lang.String str40 = item39.name;
        item39.name = "hi!, -2, 50";
        int int43 = item39.sellIn;
        com.gildedrose.Item item44 = itemUpdater2.update(item39);
        item44.quality = 1;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(item25);
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str38, "hi!, 0, 0, 99, 0");
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!, 0, 0" + "'", str40, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 98 + "'", int43 == 98);
        org.junit.Assert.assertNotNull(item44);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 1, (int) ' ');
        java.lang.String str4 = item3.toString();
        item3.sellIn = 96;
        item3.sellIn = 0;
        item3.sellIn = 8;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 1, 32" + "'", str4, ", 1, 32");
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        int int6 = item3.quality;
        item3.quality = (short) 10;
        java.lang.String str9 = item3.toString();
        item3.sellIn = (-1);
        int int12 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 100, 10" + "'", str9, "hi!, 100, 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 97, 50, 100, 10", 98, (int) (byte) 100);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 32, 0, 10, 99", 0, 0);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
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
        java.lang.Class<?> wildcardClass42 = item36.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 0, 50, 10, -1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 9");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance(", 100, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance(", 10, 97, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, -1", (-2), 49);
        java.lang.String str4 = item3.toString();
        java.lang.String str5 = item3.toString();
        int int6 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, -1, -2, 49" + "'", str4, "hi!, 100, -1, -2, 49");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 100, -1, -2, 49" + "'", str5, "hi!, 100, -1, -2, 49");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
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
        java.lang.String str38 = item29.name;
        java.lang.String str39 = item29.toString();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + ", 99, 0" + "'", str39, ", 99, 0");
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        item3.name = "hi!, 52, 1";
        item3.quality = ' ';
        item3.quality = (-1);
        item3.sellIn = 8;
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        item8.sellIn = 96;
        int int11 = item8.sellIn;
        item8.quality = (-1);
        int int14 = item8.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 96 + "'", int11 == 96);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 0, 0, 32, 0" + "'", str5, "hi!, 0, 0, 32, 0");
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) 0, (int) (byte) 10);
        item3.name = "hi!, -2, 30";
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -2, 30, 0, 10" + "'", str6, "hi!, -2, 30, 0, 10");
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
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
        int int58 = item57.sellIn;
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
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
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
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 0, -2");
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1, -1, 1");
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
        org.junit.Assert.assertNotNull(itemUpdater22);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 52, 1, 30, 50", (int) (short) 10, 49);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50", (int) (short) 1, (int) (short) 100);
        java.lang.String str4 = item3.toString();
        item3.quality = (byte) 100;
        int int7 = item3.sellIn;
        int int8 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 0, 50, 1, 100" + "'", str4, ", 0, 50, 1, 100");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 50", 10, 47);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        int int6 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0" + "'", str4, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 0, 0, 32, 0" + "'", str5, "hi!, 0, 0, 32, 0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) ' ', (int) ' ');
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 1, (int) ' ');
        java.lang.String str4 = item3.toString();
        item3.sellIn = 96;
        item3.sellIn = 0;
        int int9 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 1, 32" + "'", str4, ", 1, 32");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
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
        java.lang.String str83 = item79.name;
        int int84 = item79.sellIn;
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
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-3) + "'", int84 == (-3));
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -4, 0, -1, 0", (int) '#', (-3));
        item3.quality = (byte) 100;
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 9, 50", (-1), (int) (short) 10);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (byte) -1, 95);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 31, 32", (-4), (int) '4');
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        int int10 = item6.sellIn;
        item6.sellIn = (short) 10;
        java.lang.String str13 = item6.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 100, 0", (int) (short) -1, (int) ' ');
        java.lang.String str4 = item3.toString();
        int int5 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, 0, 100, 0, -1, 32" + "'", str4, "hi!, 10, 0, 100, 0, -1, 32");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
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
        item26.sellIn = 96;
        java.lang.String str30 = item26.toString();
        java.lang.String str31 = item26.name;
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!, 96, 0" + "'", str30, "hi!, 96, 0");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
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
        item14.name = ", 35, 32";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 99, 0" + "'", str15, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(item19);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        java.lang.String str4 = item3.toString();
        item3.quality = '4';
        int int7 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 1, 32" + "'", str4, ", 1, 32");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        int int9 = item4.quality;
        int int10 = item4.sellIn;
        item4.name = "hi!, 100, 1, 10, 0, 97, 0";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
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
        com.gildedrose.Item item42 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1, 52, 100", (int) 'a', (int) 'a');
        com.gildedrose.Item item43 = itemUpdater6.update(item42);
        int int44 = item43.sellIn;
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
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 96 + "'", int44 == 96);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!, -1, 52", 0, 9);
        com.gildedrose.Item item7 = itemUpdater2.update(item6);
        java.lang.String str8 = item7.toString();
        item7.quality = (short) 1;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(item7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -1, 52, -1, 7" + "'", str8, "hi!, -1, 52, -1, 7");
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
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
        item44.quality = 0;
        item44.sellIn = (short) 1;
        int int59 = item44.quality;
        int int60 = item44.sellIn;
        java.lang.String str61 = item44.toString();
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
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!, 1, 0" + "'", str61, "hi!, 1, 0");
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 0, 52");
        com.gildedrose.Item item18 = new com.gildedrose.Item("hi!, 99, 0", 31, (int) (short) 100);
        item18.name = "hi!, 0, 0, 52, 1";
        com.gildedrose.Item item21 = itemUpdater14.update(item18);
        java.lang.String str22 = item21.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, 0, 0, 52, 1, 30, 50" + "'", str22, "hi!, 0, 0, 52, 1, 30, 50");
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 98, 0, 96, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1, 1, 10");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 1, 0, 98, 99, 32, -2");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 50, 49");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory15 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory15.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory15.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item27 = new com.gildedrose.Item("hi!", 100, 1);
        int int28 = item27.sellIn;
        item27.name = "hi!, 100, 1";
        item27.name = "hi!, 100, 1, 32, 100, -2, 1";
        item27.quality = 0;
        com.gildedrose.Item item35 = itemUpdater23.update(item27);
        com.gildedrose.Item item36 = itemUpdater14.update(item35);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertNotNull(item36);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 98, 0", (int) 'a', 100);
        int int4 = item3.sellIn;
        int int5 = item3.quality;
        int int6 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance(", 96, 31");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance(", 0, 50, 10, -1");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1, 99, -1");
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 1, 97, 50, 1, 9");
        java.lang.Class<?> wildcardClass23 = itemUpdaterFactory0.getClass();
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
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance(", 100, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, -1, 10, 100");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 100, 10");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 49, 32");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance(", 51, 0");
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
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
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
        int int16 = item6.sellIn;
        item6.sellIn = (-4);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 98");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 51, 0", 9, 10);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory14 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory14.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory14.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory14.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory14.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item28 = new com.gildedrose.Item("", (int) '4', 1);
        com.gildedrose.Item item29 = itemUpdater24.update(item28);
        item29.sellIn = 96;
        item29.quality = 100;
        int int34 = item29.sellIn;
        java.lang.String str35 = item29.name;
        com.gildedrose.Item item36 = itemUpdater8.update(item29);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory37 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater39 = itemUpdaterFactory37.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater41 = itemUpdaterFactory37.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater43 = itemUpdaterFactory37.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater45 = itemUpdaterFactory37.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater47 = itemUpdaterFactory37.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater49 = itemUpdaterFactory37.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater51 = itemUpdaterFactory37.getInstance("hi!, 100, 1, 9, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory52 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater54 = itemUpdaterFactory52.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater56 = itemUpdaterFactory52.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater58 = itemUpdaterFactory52.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater60 = itemUpdaterFactory52.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater62 = itemUpdaterFactory52.getInstance("hi!, 99, 0");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater63 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item67 = new com.gildedrose.Item("hi!", 100, 1);
        int int68 = item67.sellIn;
        com.gildedrose.Item item69 = conjuredItemUpdater63.update(item67);
        com.gildedrose.Item item73 = new com.gildedrose.Item("hi!", 100, 1);
        com.gildedrose.Item item74 = conjuredItemUpdater63.update(item73);
        com.gildedrose.Item item75 = itemUpdater62.update(item73);
        com.gildedrose.Item item76 = itemUpdater51.update(item73);
        com.gildedrose.Item item77 = itemUpdater8.update(item76);
        item76.name = "hi!, 97, 0";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater24);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 96 + "'", int34 == 96);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertNotNull(itemUpdater39);
        org.junit.Assert.assertNotNull(itemUpdater41);
        org.junit.Assert.assertNotNull(itemUpdater43);
        org.junit.Assert.assertNotNull(itemUpdater45);
        org.junit.Assert.assertNotNull(itemUpdater47);
        org.junit.Assert.assertNotNull(itemUpdater49);
        org.junit.Assert.assertNotNull(itemUpdater51);
        org.junit.Assert.assertNotNull(itemUpdater54);
        org.junit.Assert.assertNotNull(itemUpdater56);
        org.junit.Assert.assertNotNull(itemUpdater58);
        org.junit.Assert.assertNotNull(itemUpdater60);
        org.junit.Assert.assertNotNull(itemUpdater62);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 100 + "'", int68 == 100);
        org.junit.Assert.assertNotNull(item69);
        org.junit.Assert.assertNotNull(item74);
        org.junit.Assert.assertNotNull(item75);
        org.junit.Assert.assertNotNull(item76);
        org.junit.Assert.assertNotNull(item77);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (-1), 52);
        int int4 = item3.quality;
        item3.sellIn = 98;
        item3.quality = 97;
        item3.name = "hi!, 100, 1, 9, 1, 9, 0";
        item3.quality = 52;
        int int13 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 98 + "'", int13 == 98);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 8, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance(", 99, -1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory13 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory13.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory13.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item25 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str26 = item25.name;
        int int27 = item25.sellIn;
        com.gildedrose.Item item28 = itemUpdater21.update(item25);
        com.gildedrose.Item item32 = new com.gildedrose.Item("hi!, 10, 0", (int) ' ', (int) '#');
        int int33 = item32.quality;
        java.lang.String str34 = item32.name;
        com.gildedrose.Item item35 = itemUpdater21.update(item32);
        com.gildedrose.Item item36 = itemUpdater12.update(item35);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!, 0, 0" + "'", str26, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!, 10, 0" + "'", str34, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertNotNull(item36);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
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
        item21.sellIn = (short) 1;
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
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 96, 0", (int) (short) 0, 97);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        java.lang.String str9 = item6.toString();
        item6.name = "hi!, 10, 0, 100, 0";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 99, 0" + "'", str9, "hi!, 99, 0");
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str13 = item12.name;
        java.lang.String str14 = item12.toString();
        int int15 = item12.quality;
        int int16 = item12.quality;
        com.gildedrose.Item item17 = itemUpdater8.update(item12);
        item12.quality = (short) -1;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 0, 0" + "'", str13, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str14, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(item17);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (short) 1);
        java.lang.String str4 = item3.toString();
        item3.quality = 33;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0, 32, 1" + "'", str4, "hi!, 0, 0, 32, 1");
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory60 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater62 = itemUpdaterFactory60.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater64 = itemUpdaterFactory60.getInstance("");
        com.gildedrose.Item item68 = new com.gildedrose.Item("hi!", 100, 1);
        int int69 = item68.sellIn;
        com.gildedrose.Item item70 = itemUpdater64.update(item68);
        java.lang.String str71 = item68.toString();
        item68.sellIn = 10;
        java.lang.String str74 = item68.toString();
        item68.sellIn = 1;
        int int77 = item68.sellIn;
        java.lang.String str78 = item68.name;
        item68.quality = ' ';
        com.gildedrose.Item item81 = itemUpdater2.update(item68);
        int int82 = item68.sellIn;
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
        org.junit.Assert.assertNotNull(itemUpdater62);
        org.junit.Assert.assertNotNull(itemUpdater64);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertNotNull(item70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!, 99, 0" + "'", str71, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!, 10, 0" + "'", str74, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertNotNull(item81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.sellIn = 10;
        item8.quality = 96;
        java.lang.String str16 = item8.toString();
        int int17 = item8.quality;
        java.lang.String str18 = item8.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 10, 96" + "'", str16, "hi!, 10, 96");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 96 + "'", int17 == 96);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", 52, (int) (short) 10);
        int int4 = item3.sellIn;
        item3.sellIn = 10;
        int int7 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
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
        java.lang.String str94 = item92.name;
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
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "hi!" + "'", str94, "hi!");
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        java.lang.String str16 = item14.toString();
        int int17 = item14.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 99, 0, 51, 0" + "'", str16, "hi!, 99, 0, 51, 0");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51 + "'", int17 == 51);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
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
        item57.name = "hi!, -1, 1, 8, 30, 31, 0";
        int int60 = item57.quality;
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
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 49 + "'", int60 == 49);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        java.lang.String str14 = item12.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 0, 0" + "'", str14, "hi!, 0, 0");
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
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
        int int19 = item16.sellIn;
        item16.name = "hi!, 10, 0, 10, 1, 1, -1, 97, 50";
        java.lang.String str22 = item16.name;
        java.lang.String str23 = item16.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 50 + "'", int19 == 50);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, 10, 0, 10, 1, 1, -1, 97, 50" + "'", str22, "hi!, 10, 0, 10, 1, 1, -1, 97, 50");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 10, 0, 10, 1, 1, -1, 97, 50" + "'", str23, "hi!, 10, 0, 10, 1, 1, -1, 97, 50");
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1, 52, 100, 9, 0", (-1), (int) 'a');
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        item3.name = "hi!, 100, 1";
        java.lang.String str7 = item3.name;
        item3.sellIn = 49;
        int int10 = item3.quality;
        int int11 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 100, 1" + "'", str7, "hi!, 100, 1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        item6.sellIn = (byte) 0;
        int int11 = item6.sellIn;
        java.lang.String str12 = item6.name;
        java.lang.String str13 = item6.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        item3.name = "hi!, 52, 1";
        item3.name = "hi!, 10, 0";
        item3.sellIn = (-4);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 0, 52", 98, 0);
        item3.name = "hi!, 98, 0, 97, 35";
        java.lang.String str6 = item3.name;
        item3.name = "hi!, -3, 48";
        java.lang.Class<?> wildcardClass9 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 98, 0, 97, 35" + "'", str6, "hi!, 98, 0, 97, 35");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
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
        java.lang.String str49 = item48.name;
        int int50 = item48.quality;
        item48.sellIn = 97;
        java.lang.String str53 = item48.name;
        java.lang.String str54 = item48.name;
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
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!, 10, 0" + "'", str49, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!, 10, 0" + "'", str53, "hi!, 10, 0");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!, 10, 0" + "'", str54, "hi!, 10, 0");
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 100, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, 9");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance(", 0, 50, 1, 100, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory13 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory13.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory13.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory13.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item25 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str26 = item25.name;
        int int27 = item25.sellIn;
        com.gildedrose.Item item28 = itemUpdater21.update(item25);
        item25.quality = 'a';
        int int31 = item25.quality;
        int int32 = item25.sellIn;
        java.lang.String str33 = item25.toString();
        item25.name = "hi!, 0, 0, 51, 0";
        com.gildedrose.Item item36 = itemUpdater12.update(item25);
        java.lang.Class<?> wildcardClass37 = itemUpdater12.getClass();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!, 0, 0" + "'", str26, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 31 + "'", int32 == 31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!, 0, 0, 31, 97" + "'", str33, "hi!, 0, 0, 31, 97");
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, 9");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 52, 32, 0, 97");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 0, 49", (int) 'a', (int) (short) 0);
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 0, 0, 0, 49, 97, 0" + "'", str5, "hi!, 0, 0, 0, 49, 97, 0");
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
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
        java.lang.String str55 = item43.name;
        item43.sellIn = 9;
        java.lang.String str58 = item43.name;
        int int59 = item43.sellIn;
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
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!, 51, 0" + "'", str55, "hi!, 51, 0");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!, 51, 0" + "'", str58, "hi!, 51, 0");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 9 + "'", int59 == 9);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.name = "hi!, 10, 0";
        java.lang.String str14 = item8.name;
        int int15 = item8.sellIn;
        java.lang.String str16 = item8.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 10, 0, 99, 0" + "'", str16, "hi!, 10, 0, 99, 0");
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 32, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 98");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, -1, 50");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 99, 1");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance(", 0, 50, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory0.getInstance("hi!, 51, 0, 98, 0, 96, 48");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater21 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item25 = new com.gildedrose.Item("hi!", 100, 1);
        int int26 = item25.sellIn;
        com.gildedrose.Item item27 = conjuredItemUpdater21.update(item25);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory28 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory28.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater32 = itemUpdaterFactory28.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater34 = itemUpdaterFactory28.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater36 = itemUpdaterFactory28.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory37 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater39 = itemUpdaterFactory37.getInstance("");
        com.gildedrose.Item item43 = new com.gildedrose.Item("hi!", 100, 1);
        int int44 = item43.sellIn;
        com.gildedrose.Item item45 = itemUpdater39.update(item43);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory46 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater48 = itemUpdaterFactory46.getInstance("");
        com.gildedrose.Item item52 = new com.gildedrose.Item("hi!", 100, 1);
        int int53 = item52.sellIn;
        com.gildedrose.Item item54 = itemUpdater48.update(item52);
        item52.sellIn = (byte) 0;
        java.lang.String str57 = item52.toString();
        com.gildedrose.Item item58 = itemUpdater39.update(item52);
        com.gildedrose.Item item59 = itemUpdater36.update(item52);
        com.gildedrose.Item item60 = conjuredItemUpdater21.update(item52);
        com.gildedrose.Item item64 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49", (int) ' ', (int) 'a');
        int int65 = item64.quality;
        com.gildedrose.Item item66 = conjuredItemUpdater21.update(item64);
        java.lang.String str67 = item64.name;
        com.gildedrose.Item item68 = itemUpdater20.update(item64);
        java.lang.String str69 = item68.name;
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertNotNull(itemUpdater32);
        org.junit.Assert.assertNotNull(itemUpdater34);
        org.junit.Assert.assertNotNull(itemUpdater36);
        org.junit.Assert.assertNotNull(itemUpdater39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertNotNull(itemUpdater48);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertNotNull(item54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!, 0, 0" + "'", str57, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item58);
        org.junit.Assert.assertNotNull(item59);
        org.junit.Assert.assertNotNull(item60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 97 + "'", int65 == 97);
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!, 0, 0, 99, 0, 50, 49" + "'", str67, "hi!, 0, 0, 99, 0, 50, 49");
        org.junit.Assert.assertNotNull(item68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!, 0, 0, 99, 0, 50, 49" + "'", str69, "hi!, 0, 0, 99, 0, 50, 49");
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
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
        item14.quality = '4';
        java.lang.Class<?> wildcardClass20 = item14.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(item14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 100, 52" + "'", str17, "hi!, 100, 52");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', 1);
        item3.name = "hi!, 0, 0";
        java.lang.String str6 = item3.toString();
        java.lang.String str7 = item3.toString();
        item3.sellIn = (short) -1;
        item3.name = "hi!, 98, 0";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str6, "hi!, 0, 0, 52, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str7, "hi!, 0, 0, 52, 1");
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 52, 0, 30, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 97, 50, 100, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
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
        java.lang.Class<?> wildcardClass27 = item22.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 99, 0" + "'", str16, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 10, 0" + "'", str19, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
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
        com.gildedrose.Item item49 = itemUpdater31.update(item43);
        com.gildedrose.Item item53 = new com.gildedrose.Item("", (int) '4', 1);
        int int54 = item53.sellIn;
        item53.name = "hi!";
        java.lang.String str57 = item53.name;
        int int58 = item53.sellIn;
        com.gildedrose.Item item59 = itemUpdater31.update(item53);
        com.gildedrose.Item item63 = new com.gildedrose.Item("hi!, -1, 0", (int) (byte) -1, (int) (short) 0);
        int int64 = item63.sellIn;
        com.gildedrose.Item item65 = itemUpdater31.update(item63);
        int int66 = item63.quality;
        item63.quality = (-1);
        com.gildedrose.Item item69 = itemUpdater10.update(item63);
        com.gildedrose.Item item73 = new com.gildedrose.Item(", 0, 50, 1, 100, 99, 0", (-1), 48);
        com.gildedrose.Item item74 = itemUpdater10.update(item73);
        java.lang.Class<?> wildcardClass75 = itemUpdater10.getClass();
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
        org.junit.Assert.assertNotNull(itemUpdater34);
        org.junit.Assert.assertNotNull(itemUpdater36);
        org.junit.Assert.assertNotNull(itemUpdater39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(item49);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 52 + "'", int54 == 52);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 52 + "'", int58 == 52);
        org.junit.Assert.assertNotNull(item59);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(item65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(item69);
        org.junit.Assert.assertNotNull(item74);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
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
        item29.name = "hi!, 98, 0, 97, 35";
        item29.name = "hi!, 31, 32";
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
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
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
        int int65 = item64.sellIn;
        java.lang.String str66 = item64.toString();
        int int67 = item64.sellIn;
        java.lang.String str68 = item64.toString();
        java.lang.String str69 = item64.toString();
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
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-2) + "'", int65 == (-2));
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!, -2, 0" + "'", str66, "hi!, -2, 0");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-2) + "'", int67 == (-2));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!, -2, 0" + "'", str68, "hi!, -2, 0");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!, -2, 0" + "'", str69, "hi!, -2, 0");
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory24 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater26 = itemUpdaterFactory24.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory24.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory24.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater32 = itemUpdaterFactory24.getInstance("hi!, 100, 52");
        com.gildedrose.Item item36 = new com.gildedrose.Item("hi!, 100, 1", (int) '4', (int) '#');
        com.gildedrose.Item item37 = itemUpdater32.update(item36);
        java.lang.String str38 = item37.name;
        java.lang.String str39 = item37.toString();
        com.gildedrose.Item item40 = itemUpdater16.update(item37);
        int int41 = item37.sellIn;
        int int42 = item37.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertNotNull(itemUpdater26);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertNotNull(itemUpdater32);
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!, 100, 1" + "'", str38, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!, 100, 1, 51, 34" + "'", str39, "hi!, 100, 1, 51, 34");
        org.junit.Assert.assertNotNull(item40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 50 + "'", int41 == 50);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 33 + "'", int42 == 33);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance(", 0, 50");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, -2, 50, 1, 50");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory17.getInstance("hi!, 0, 0, 0, 98");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory17.getInstance("hi!, 99, 0, 31, 0");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory17.getInstance("hi!, 0, 0, 99, 0, 51, 50");
        com.gildedrose.Item item29 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item29.sellIn = (byte) 100;
        item29.quality = 100;
        int int34 = item29.sellIn;
        java.lang.String str35 = item29.name;
        item29.name = "hi!, -3, 0";
        item29.name = "hi!, 100, 1, 35, 0";
        item29.sellIn = 'a';
        java.lang.String str42 = item29.toString();
        com.gildedrose.Item item43 = itemUpdater25.update(item29);
        com.gildedrose.Item item44 = itemUpdater16.update(item43);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!, 99, 0" + "'", str35, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!, 100, 1, 35, 0, 97, 100" + "'", str42, "hi!, 100, 1, 35, 0, 97, 100");
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertNotNull(item44);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, -1, 50", (int) (byte) 1, (-3));
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 100, 52, 99, 0, 10, 31");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 1, 99");
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
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 10, 10", 49, (int) (byte) 1);
        item3.sellIn = (byte) 0;
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        java.lang.String str9 = item8.name;
        int int10 = item8.quality;
        java.lang.String str11 = item8.name;
        item8.name = "hi!, 10, 0, -1, 32";
        item8.name = "hi!, 0, 0, 52, 0";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory11.getInstance("hi!, 0, 0, 0, 1");
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
        com.gildedrose.Item item35 = itemUpdater17.update(item33);
        com.gildedrose.Item item36 = itemUpdater10.update(item33);
        java.lang.String str37 = item33.toString();
        int int38 = item33.quality;
        item33.quality = 9;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertNotNull(item35);
        org.junit.Assert.assertNotNull(item36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!, 0, 0, 99, 0, 48, 47" + "'", str37, "hi!, 0, 0, 99, 0, 48, 47");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 47 + "'", int38 == 47);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 52", (int) (byte) 10, (int) '4');
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, 52, 10, 52" + "'", str4, "hi!, 10, 52, 10, 52");
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
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
        java.lang.String str23 = item8.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 1, 100" + "'", str23, "hi!, 1, 100");
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
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
        java.lang.String str28 = item15.toString();
        int int29 = item15.sellIn;
        int int30 = item15.quality;
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!, 0, 50" + "'", str28, "hi!, 0, 50");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 50 + "'", int30 == 50);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
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
        java.lang.String str31 = item30.toString();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!, 51, 0" + "'", str31, "hi!, 51, 0");
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        int int10 = item6.sellIn;
        item6.name = ", 10, 10";
        java.lang.String str13 = item6.toString();
        item6.name = "hi!, 31, 52";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ", 10, 10, 99, 0" + "'", str13, ", 10, 10, 99, 0");
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1", (int) (short) -1, (int) '#');
        item3.name = ", 99, 0";
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
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
        item20.quality = 100;
        java.lang.String str25 = item20.toString();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!, 0, 0, 0, 1, -1, 100" + "'", str25, "hi!, 0, 0, 0, 1, -1, 100");
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
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
        item24.sellIn = (-1);
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
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1, 99, 0, 32, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance(", 0, 50, 10, -1");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, 1, 49");
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
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 48", 31, 31);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
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
        int int57 = item53.quality;
        java.lang.String str58 = item53.name;
        java.lang.String str59 = item53.name;
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
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
        item61.quality = (byte) 0;
        java.lang.String str74 = item61.name;
        item61.quality = 9;
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
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str11 = item10.name;
        java.lang.String str12 = item10.toString();
        java.lang.String str13 = item10.name;
        com.gildedrose.Item item14 = itemUpdater6.update(item10);
        java.lang.Class<?> wildcardClass15 = item10.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 100, 1" + "'", str12, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(item14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
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
        java.lang.String str19 = item16.toString();
        item16.name = "hi!, -1, 1, 98, 0";
        java.lang.String str22 = item16.toString();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 98, 0" + "'", str19, "hi!, 98, 0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, -1, 1, 98, 0, 98, 0" + "'", str22, "hi!, -1, 1, 98, 0, 98, 0");
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
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
        java.lang.Class<?> wildcardClass26 = item24.getClass();
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
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory53 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater55 = itemUpdaterFactory53.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater57 = itemUpdaterFactory53.getInstance("");
        com.gildedrose.Item item61 = new com.gildedrose.Item("hi!", 100, 1);
        int int62 = item61.sellIn;
        com.gildedrose.Item item63 = itemUpdater57.update(item61);
        java.lang.String str64 = item61.toString();
        item61.sellIn = 10;
        int int67 = item61.sellIn;
        item61.name = "hi!, 10, 0";
        int int70 = item61.sellIn;
        java.lang.String str71 = item61.toString();
        item61.name = "hi!, 100, 1, 100, -1";
        com.gildedrose.Item item74 = itemUpdater12.update(item61);
        com.gildedrose.Item item78 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str79 = item78.name;
        java.lang.String str80 = item78.name;
        java.lang.String str81 = item78.name;
        item78.sellIn = (-1);
        java.lang.String str84 = item78.toString();
        item78.sellIn = '#';
        java.lang.String str87 = item78.name;
        item78.quality = 10;
        com.gildedrose.Item item90 = itemUpdater12.update(item78);
        int int91 = item90.sellIn;
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
        org.junit.Assert.assertNotNull(itemUpdater55);
        org.junit.Assert.assertNotNull(itemUpdater57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertNotNull(item63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!, 99, 0" + "'", str64, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 10 + "'", int70 == 10);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!, 10, 0, 10, 0" + "'", str71, "hi!, 10, 0, 10, 0");
        org.junit.Assert.assertNotNull(item74);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!, -1, 1" + "'", str84, "hi!, -1, 1");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertNotNull(item90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 34 + "'", int91 == 34);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
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
        int int32 = item26.quality;
        item26.sellIn = 46;
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
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
        int int71 = item61.sellIn;
        item61.quality = 98;
        item61.name = "";
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
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        item15.quality = (byte) 1;
        item15.quality = 100;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 0, 52");
        com.gildedrose.Item item18 = new com.gildedrose.Item("hi!, 99, 0", 31, (int) (short) 100);
        item18.name = "hi!, 0, 0, 52, 1";
        com.gildedrose.Item item21 = itemUpdater14.update(item18);
        item21.name = "hi!, 1, 32, 99, 96";
        int int24 = item21.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 50 + "'", int24 == 50);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 98, 0, 31, 32, 50, 0", (int) '#', 52);
        java.lang.String str4 = item3.toString();
        int int5 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 99, 0, 98, 0, 31, 32, 50, 0, 35, 52" + "'", str4, "hi!, 99, 0, 98, 0, 31, 32, 50, 0, 35, 52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
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
        java.lang.String str38 = item37.name;
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!, 99, 0" + "'", str38, "hi!, 99, 0");
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 1, 32, 97, 0", 49, 47);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 96, 9", (-3), 98);
        item3.quality = 98;
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50", 0, (int) '#');
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 0, 50" + "'", str4, ", 0, 50");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
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
        item64.name = "hi!, 10, 0, 10, 1, 51, 97";
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
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -4, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -1, 1, 8, 30");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 98, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
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
        java.lang.String str23 = item22.toString();
        item22.sellIn = 99;
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
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 100, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, 9");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 52, 9, 52");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50", 50, 97);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item6.sellIn = 1;
        item6.sellIn = 32;
        item6.sellIn = (byte) 10;
        int int13 = item6.sellIn;
        java.lang.String str14 = item6.toString();
        java.lang.String str15 = item6.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 10, 0" + "'", str15, "hi!, 10, 0");
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
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
        java.lang.String str84 = item81.toString();
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
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!, -1, 0, -2, 0" + "'", str84, "hi!, -1, 0, -2, 0");
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
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
        com.gildedrose.ItemUpdater itemUpdater36 = itemUpdaterFactory32.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory32.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater40 = itemUpdaterFactory32.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory32.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater44 = itemUpdaterFactory32.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater46 = itemUpdaterFactory32.getInstance("hi!, 10, 0, 10, 1, 1, -1, 52, 52");
        com.gildedrose.ItemUpdater itemUpdater48 = itemUpdaterFactory32.getInstance("hi!, 100, 1, 51, 34");
        com.gildedrose.ItemUpdater itemUpdater50 = itemUpdaterFactory32.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.Item item54 = new com.gildedrose.Item("hi!", (int) '4', (int) (byte) 1);
        com.gildedrose.Item item55 = itemUpdater50.update(item54);
        int int56 = item54.quality;
        item54.quality = (short) -1;
        com.gildedrose.Item item59 = itemUpdater8.update(item54);
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
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertNotNull(itemUpdater40);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertNotNull(itemUpdater44);
        org.junit.Assert.assertNotNull(itemUpdater46);
        org.junit.Assert.assertNotNull(itemUpdater48);
        org.junit.Assert.assertNotNull(itemUpdater50);
        org.junit.Assert.assertNotNull(item55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(item59);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
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
        int int37 = item29.sellIn;
        item29.quality = 100;
        int int40 = item29.quality;
        item29.name = "hi!, 100, 52, 32, 1, 32, 0";
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
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
        java.lang.String str73 = item61.name;
        item61.name = "hi!, 0, 0, -4, -1";
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
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1", (int) ' ', (int) ' ');
        item3.name = "hi!, -2, 50, 1, 50";
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -2, 50, 1, 50, 32, 32" + "'", str6, "hi!, -2, 50, 1, 50, 32, 32");
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', 1);
        int int4 = item3.sellIn;
        item3.sellIn = 35;
        int int7 = item3.quality;
        item3.sellIn = 35;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1, 10, 32", (-3), 34);
        int int4 = item3.sellIn;
        int int5 = item3.quality;
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3) + "'", int4 == (-3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -1, 1, 10, 32, -3, 34" + "'", str6, "hi!, -1, 1, 10, 32, -3, 34");
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        item6.sellIn = (byte) 0;
        java.lang.String str11 = item6.name;
        item6.quality = 96;
        java.lang.String str14 = item6.name;
        java.lang.String str15 = item6.name;
        int int16 = item6.quality;
        java.lang.String str17 = item6.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 96 + "'", int16 == 96);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
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
        int int37 = item29.sellIn;
        int int38 = item29.quality;
        item29.quality = 33;
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
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 52, 0, 30, 1", (int) (byte) 1, 10);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 52");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
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
        item26.name = "";
        java.lang.String str30 = item26.name;
        item26.name = "hi!, 50, 0";
        item26.quality = 31;
        java.lang.String str35 = item26.name;
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!, 50, 0" + "'", str35, "hi!, 50, 0");
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1, 52, 52", 0, 9);
        item3.quality = 32;
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 31, 32", 46, 10);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
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
        item30.sellIn = (byte) 1;
        item30.sellIn = 0;
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
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
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
        int int44 = item40.quality;
        java.lang.String str45 = item40.name;
        com.gildedrose.Item item46 = itemUpdater10.update(item40);
        java.lang.Class<?> wildcardClass47 = item46.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(item46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 99, 0", 49, 7);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0, 98, 0, 96, 48");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory7.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory12 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.Item item18 = new com.gildedrose.Item("hi!", 100, 1);
        int int19 = item18.sellIn;
        com.gildedrose.Item item20 = itemUpdater14.update(item18);
        int int21 = item18.sellIn;
        int int22 = item18.sellIn;
        com.gildedrose.Item item23 = itemUpdater11.update(item18);
        com.gildedrose.Item item27 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        int int28 = item27.quality;
        com.gildedrose.Item item29 = itemUpdater11.update(item27);
        com.gildedrose.Item item33 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str34 = item33.name;
        java.lang.String str35 = item33.toString();
        java.lang.String str36 = item33.name;
        com.gildedrose.Item item37 = itemUpdater11.update(item33);
        com.gildedrose.Item item38 = itemUpdater6.update(item37);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 99 + "'", int22 == 99);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!, 0, 0" + "'", str34, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!, 0, 0, 32, 0" + "'", str35, "hi!, 0, 0, 32, 0");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!, 0, 0" + "'", str36, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(item38);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
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
        int int47 = item41.quality;
        item41.sellIn = 8;
        item41.quality = 1;
        int int52 = item41.sellIn;
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 8 + "'", int52 == 8);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, 9");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -1, 1, 8, 30, 31, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory9.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory9.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory9.getInstance("hi!, 99, 0, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory9.getInstance(", -1, 9, 97, -2");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory9.getInstance(", 0, 0");
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory9.getInstance("hi!, 100, 1, 9, 1, 97, 50");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory28 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory28.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory31 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory31.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory31.getInstance("");
        com.gildedrose.Item item39 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item39.sellIn = 52;
        int int42 = item39.quality;
        com.gildedrose.Item item43 = itemUpdater35.update(item39);
        com.gildedrose.Item item44 = itemUpdater30.update(item43);
        item44.quality = 96;
        int int47 = item44.sellIn;
        com.gildedrose.Item item48 = itemUpdater27.update(item44);
        item48.quality = 1;
        com.gildedrose.Item item51 = itemUpdater8.update(item48);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory52 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater54 = itemUpdaterFactory52.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater56 = itemUpdaterFactory52.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory57 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater59 = itemUpdaterFactory57.getInstance("");
        com.gildedrose.Item item63 = new com.gildedrose.Item("hi!", 100, 1);
        int int64 = item63.sellIn;
        com.gildedrose.Item item65 = itemUpdater59.update(item63);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory66 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater68 = itemUpdaterFactory66.getInstance("");
        com.gildedrose.Item item72 = new com.gildedrose.Item("hi!", 100, 1);
        int int73 = item72.sellIn;
        com.gildedrose.Item item74 = itemUpdater68.update(item72);
        item72.sellIn = (byte) 0;
        java.lang.String str77 = item72.toString();
        com.gildedrose.Item item78 = itemUpdater59.update(item72);
        com.gildedrose.Item item79 = itemUpdater56.update(item78);
        item78.sellIn = 96;
        com.gildedrose.Item item82 = itemUpdater8.update(item78);
        int int83 = item78.quality;
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
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 50 + "'", int47 == 50);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(item51);
        org.junit.Assert.assertNotNull(itemUpdater54);
        org.junit.Assert.assertNotNull(itemUpdater56);
        org.junit.Assert.assertNotNull(itemUpdater59);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 100 + "'", int64 == 100);
        org.junit.Assert.assertNotNull(item65);
        org.junit.Assert.assertNotNull(itemUpdater68);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 100 + "'", int73 == 100);
        org.junit.Assert.assertNotNull(item74);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!, 0, 0" + "'", str77, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item78);
        org.junit.Assert.assertNotNull(item79);
        org.junit.Assert.assertNotNull(item82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 1, 32, 98, 0", (int) ' ', 1);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", (int) '4', (int) (byte) 1);
        int int4 = item3.sellIn;
        item3.quality = (byte) 0;
        int int7 = item3.sellIn;
        java.lang.String str8 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 52, 0" + "'", str8, "hi!, 52, 0");
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
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
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 0, -2");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory21 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory21.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory21.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory21.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater31 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory21.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory21.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater37 = itemUpdaterFactory21.getInstance("hi!, 0, 0, 51, 0");
        com.gildedrose.Item item41 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str42 = item41.name;
        java.lang.String str43 = item41.name;
        java.lang.String str44 = item41.name;
        item41.sellIn = (-1);
        int int47 = item41.quality;
        com.gildedrose.Item item48 = itemUpdater37.update(item41);
        int int49 = item48.quality;
        com.gildedrose.Item item50 = itemUpdater20.update(item48);
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
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater29);
        org.junit.Assert.assertNotNull(itemUpdater31);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertNotNull(itemUpdater35);
        org.junit.Assert.assertNotNull(itemUpdater37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(item50);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 97, 50, 100, 10", 96, 52);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, 9, 100, 0, 9, 31", (int) (byte) 0, 52);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 50, 0", 51, 96);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 98, 0", (int) (byte) 1, 8);
        int int4 = item3.sellIn;
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 52, 1", 34, 49);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance(", 96, 31");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, -1, 0, 0, 52");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory19 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory19.getInstance("");
        com.gildedrose.Item item25 = new com.gildedrose.Item("hi!", 100, 1);
        int int26 = item25.sellIn;
        com.gildedrose.Item item27 = itemUpdater21.update(item25);
        int int28 = item25.sellIn;
        int int29 = item25.sellIn;
        int int30 = item25.quality;
        int int31 = item25.sellIn;
        com.gildedrose.Item item32 = itemUpdater18.update(item25);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 99 + "'", int28 == 99);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 99 + "'", int29 == 99);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 99 + "'", int31 == 99);
        org.junit.Assert.assertNotNull(item32);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1", 52, 52);
        java.lang.String str4 = item3.name;
        int int5 = item3.quality;
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, 0, 10, 1, 1, -1" + "'", str4, "hi!, 10, 0, 10, 1, 1, -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 98, 0, 97, 35");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance(", 1, 32, 99, -1");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance(", 0, 50, 10, -1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 1, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1, 52, 52, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance(", 10, 10");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!, 100, 1, 1, 1", 50, (int) '4');
        com.gildedrose.Item item21 = itemUpdater16.update(item20);
        java.lang.Class<?> wildcardClass22 = itemUpdater16.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 0, (int) (byte) 10);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        java.lang.String str6 = item3.name;
        item3.sellIn = 51;
        java.lang.String str9 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 99, 0" + "'", str4, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 99, 0, 0, 10" + "'", str5, "hi!, 99, 0, 0, 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 99, 0" + "'", str6, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 99, 0" + "'", str9, "hi!, 99, 0");
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
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
        int int52 = item49.quality;
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 34 + "'", int52 == 34);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
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
        com.gildedrose.Item item61 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1, 52, 100", (int) (short) -1, 100);
        int int62 = item61.quality;
        com.gildedrose.Item item63 = itemUpdater4.update(item61);
        int int64 = item63.sellIn;
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
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertNotNull(item63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-2) + "'", int64 == (-2));
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
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
        java.lang.String str53 = item52.toString();
        java.lang.String str54 = item52.name;
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!, 8, 0" + "'", str53, "hi!, 8, 0");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 31, 97", (int) (byte) 100, 48);
        item3.name = "hi!, 10, 50";
        java.lang.String str6 = item3.toString();
        item3.quality = (short) 100;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 10, 50, 100, 48" + "'", str6, "hi!, 10, 50, 100, 48");
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -3, 0", (int) (short) -1, 98);
        item3.quality = 'a';
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, -3, 0, -1, 97" + "'", str6, "hi!, -3, 0, -1, 97");
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", (int) (byte) 10, (int) (short) 100);
        item3.quality = 97;
        int int6 = item3.quality;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
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
        com.gildedrose.Item item42 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1, 52, 100", (int) 'a', (int) 'a');
        com.gildedrose.Item item43 = itemUpdater6.update(item42);
        com.gildedrose.Item item47 = new com.gildedrose.Item("hi!, 99, 0, 98, 0", 31, (int) ' ');
        item47.name = "hi!";
        java.lang.String str50 = item47.name;
        com.gildedrose.Item item51 = itemUpdater6.update(item47);
        java.lang.String str52 = item47.name;
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
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(item51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
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
        int int69 = item68.quality;
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
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory9.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory19 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory19.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory19.getInstance("");
        com.gildedrose.Item item27 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item27.sellIn = 52;
        int int30 = item27.quality;
        com.gildedrose.Item item31 = itemUpdater23.update(item27);
        com.gildedrose.Item item32 = itemUpdater18.update(item31);
        com.gildedrose.Item item33 = itemUpdater15.update(item31);
        java.lang.String str34 = item33.toString();
        item33.sellIn = (short) -1;
        int int37 = item33.sellIn;
        com.gildedrose.Item item38 = itemUpdater8.update(item33);
        item33.name = "hi!, -3, 49";
        item33.sellIn = (-1);
        java.lang.String str43 = item33.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!, 0, 0, 99, 0, 49, 48" + "'", str34, "hi!, 0, 0, 99, 0, 49, 48");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(item38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!, -3, 49, -1, 46" + "'", str43, "hi!, -3, 49, -1, 46");
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        int int9 = item4.quality;
        item4.name = "hi!";
        int int12 = item4.sellIn;
        item4.name = "hi!, 10, 0, 10, 1, 1, -1";
        item4.sellIn = 51;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 98, 0, 31, 32, 50, 0", 95, 0);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
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
        com.gildedrose.Item item83 = new com.gildedrose.Item("hi!, 99, 0", (int) (short) 0, 52);
        int int84 = item83.sellIn;
        com.gildedrose.Item item85 = itemUpdater12.update(item83);
        java.lang.String str86 = item83.name;
        java.lang.String str87 = item83.name;
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
        org.junit.Assert.assertNotNull(item85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!, 99, 0" + "'", str86, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!, 99, 0" + "'", str87, "hi!, 99, 0");
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
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
        item15.sellIn = 47;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51 + "'", int17 == 51);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
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
        int int75 = item61.quality;
        int int76 = item61.quality;
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
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory17.getInstance(", 100, 1");
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory17.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory17.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory30 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater32 = itemUpdaterFactory30.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater34 = itemUpdaterFactory30.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater36 = itemUpdaterFactory30.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory30.getInstance(", 100, 1");
        com.gildedrose.Item item42 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str43 = item42.name;
        java.lang.String str44 = item42.name;
        java.lang.String str45 = item42.name;
        item42.name = "hi!, 100, 52";
        item42.sellIn = ' ';
        int int50 = item42.quality;
        com.gildedrose.Item item51 = itemUpdater38.update(item42);
        item42.name = "hi!, 100, 1, 9, 1, 97, 50";
        com.gildedrose.Item item54 = itemUpdater29.update(item42);
        item42.sellIn = 32;
        item42.sellIn = (-3);
        java.lang.String str59 = item42.toString();
        com.gildedrose.Item item60 = itemUpdater8.update(item42);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 0, 0" + "'", str13, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 0, 0" + "'", str15, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater29);
        org.junit.Assert.assertNotNull(itemUpdater32);
        org.junit.Assert.assertNotNull(itemUpdater34);
        org.junit.Assert.assertNotNull(itemUpdater36);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(item51);
        org.junit.Assert.assertNotNull(item54);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!, 100, 1, 9, 1, 97, 50, -3, 0" + "'", str59, "hi!, 100, 1, 9, 1, 97, 50, -3, 0");
        org.junit.Assert.assertNotNull(item60);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        item3.quality = ' ';
        item3.quality = 34;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 1, 32" + "'", str4, ", 1, 32");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
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
        int int18 = item13.quality;
        int int19 = item13.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
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
        int int16 = item6.sellIn;
        item6.quality = '4';
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 10, 0" + "'", str13, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        int int10 = item6.sellIn;
        int int11 = item6.quality;
        int int12 = item6.quality;
        java.lang.String str13 = item6.toString();
        int int14 = item6.quality;
        item6.quality = 34;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 99, 0" + "'", str13, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 0, -2");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        item3.sellIn = 99;
        item3.name = "";
        item3.quality = 'a';
        int int10 = item3.sellIn;
        item3.name = "hi!, 100, 1, 100, 1";
        int int13 = item3.quality;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 32, 100", (int) (short) 10, 9);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
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
        item19.sellIn = (short) 10;
        java.lang.String str31 = item19.name;
        java.lang.String str32 = item19.name;
        int int33 = item19.quality;
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 0, 10");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 98");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory49 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater51 = itemUpdaterFactory49.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater53 = itemUpdaterFactory49.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater55 = itemUpdaterFactory49.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater57 = itemUpdaterFactory49.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater59 = itemUpdaterFactory49.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater61 = itemUpdaterFactory49.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater63 = itemUpdaterFactory49.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory64 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater66 = itemUpdaterFactory64.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory67 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater69 = itemUpdaterFactory67.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater71 = itemUpdaterFactory67.getInstance("");
        com.gildedrose.Item item75 = new com.gildedrose.Item("hi!", 100, 1);
        int int76 = item75.sellIn;
        com.gildedrose.Item item77 = itemUpdater71.update(item75);
        com.gildedrose.Item item78 = itemUpdater66.update(item77);
        int int79 = item78.sellIn;
        int int80 = item78.quality;
        item78.quality = (short) 10;
        java.lang.String str83 = item78.name;
        com.gildedrose.Item item84 = itemUpdater63.update(item78);
        com.gildedrose.Item item85 = itemUpdater25.update(item84);
        com.gildedrose.Item item89 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", 9, (int) 'a');
        com.gildedrose.Item item90 = itemUpdater25.update(item89);
        item89.sellIn = 50;
        com.gildedrose.Item item93 = itemUpdater16.update(item89);
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
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertNotNull(itemUpdater37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!, 0, 0" + "'", str46, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(itemUpdater51);
        org.junit.Assert.assertNotNull(itemUpdater53);
        org.junit.Assert.assertNotNull(itemUpdater55);
        org.junit.Assert.assertNotNull(itemUpdater57);
        org.junit.Assert.assertNotNull(itemUpdater59);
        org.junit.Assert.assertNotNull(itemUpdater61);
        org.junit.Assert.assertNotNull(itemUpdater63);
        org.junit.Assert.assertNotNull(itemUpdater66);
        org.junit.Assert.assertNotNull(itemUpdater69);
        org.junit.Assert.assertNotNull(itemUpdater71);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 100 + "'", int76 == 100);
        org.junit.Assert.assertNotNull(item77);
        org.junit.Assert.assertNotNull(item78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 98 + "'", int79 == 98);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertNotNull(item84);
        org.junit.Assert.assertNotNull(item85);
        org.junit.Assert.assertNotNull(item90);
        org.junit.Assert.assertNotNull(item93);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1, 52, 52");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 100, -1, 10, 100");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory0.getInstance("hi!, 100, 97");
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory0.getInstance("hi!, 1, 99");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory23 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory23.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory23.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory23.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater31 = itemUpdaterFactory23.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory23.getInstance("hi!, -1, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory34 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater36 = itemUpdaterFactory34.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory34.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater40 = itemUpdaterFactory34.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory34.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater44 = itemUpdaterFactory34.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater46 = itemUpdaterFactory34.getInstance("hi!, 100, 1, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater48 = itemUpdaterFactory34.getInstance("");
        com.gildedrose.Item item52 = new com.gildedrose.Item("hi!, -1, 0", (int) (byte) -1, (int) (short) 0);
        java.lang.String str53 = item52.toString();
        com.gildedrose.Item item54 = itemUpdater48.update(item52);
        item54.quality = (short) 10;
        com.gildedrose.Item item57 = itemUpdater33.update(item54);
        com.gildedrose.Item item58 = itemUpdater22.update(item54);
        int int59 = item58.sellIn;
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
        org.junit.Assert.assertNotNull(itemUpdater22);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(itemUpdater29);
        org.junit.Assert.assertNotNull(itemUpdater31);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertNotNull(itemUpdater36);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertNotNull(itemUpdater40);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertNotNull(itemUpdater44);
        org.junit.Assert.assertNotNull(itemUpdater46);
        org.junit.Assert.assertNotNull(itemUpdater48);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!, -1, 0, -1, 0" + "'", str53, "hi!, -1, 0, -1, 0");
        org.junit.Assert.assertNotNull(item54);
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertNotNull(item58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-4) + "'", int59 == (-4));
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 100, 52, 99, 0", 7, (int) (byte) 1);
        java.lang.String str4 = item3.toString();
        item3.quality = 0;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 99, 0, 100, 52, 99, 0, 7, 1" + "'", str4, "hi!, 99, 0, 100, 52, 99, 0, 7, 1");
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
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
        int int68 = item66.sellIn;
        java.lang.String str69 = item66.name;
        item66.quality = (byte) 0;
        item66.name = "hi!, 0, 0, 32, 0, 98, 0";
        item66.quality = 46;
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
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-4) + "'", int68 == (-4));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
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
        item29.sellIn = '#';
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
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 0, 52, -2, 52", 99, 34);
        item3.sellIn = 47;
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 31, 0", (int) ' ', (int) (byte) -1);
        item3.quality = 96;
        java.lang.String str6 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 0, 0, 31, 0" + "'", str6, "hi!, 0, 0, 31, 0");
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 100, -1, 32, -1", (int) (byte) 1, 34);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 99, -1", 97, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
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
        int int17 = item8.quality;
        item8.sellIn = 'a';
        item8.quality = 99;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 1, (int) ' ');
        java.lang.String str4 = item3.name;
        item3.name = "hi!, 1, 0, 98, 8";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        int int10 = item6.sellIn;
        int int11 = item6.quality;
        int int12 = item6.quality;
        java.lang.String str13 = item6.name;
        java.lang.Class<?> wildcardClass14 = item6.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 49, 48");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 1");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 99, 49");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 100, 52, 100, -2");
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
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
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
        item15.name = "hi!, 0, 0, 99, 0, 50, 49";
        item15.sellIn = 47;
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
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        int int5 = item3.quality;
        item3.name = "hi!, 0, 0, 32, 0";
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, 9", 30, 35);
        item3.name = ", 10, 97";
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -3, 49, 9, -2", 30, 1);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        item3.name = "hi!, 10, 0";
        item3.name = "hi!, -1, 1";
        item3.quality = (byte) 0;
        int int10 = item3.sellIn;
        item3.name = "hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, 9";
        item3.name = ", -1, 9, 97, -2";
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
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
        java.lang.String str22 = item12.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, 100, 52, 31, 0" + "'", str22, "hi!, 100, 52, 31, 0");
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 48, -1", (int) (short) 10, 51);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.Item item12 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        item12.quality = '4';
        com.gildedrose.Item item15 = itemUpdater8.update(item12);
        item15.name = "hi!, 100, 1, 9, 1, 100, 1";
        java.lang.String str18 = item15.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 100, 1, 9, 1, 100, 1, 0, 50" + "'", str18, "hi!, 100, 1, 9, 1, 100, 1, 0, 50");
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.name = "hi!, 0, 0, 99, 0, 51, 50";
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 0, 0, 99, 0, 51, 50, 0, 52" + "'", str6, "hi!, 0, 0, 99, 0, 51, 50, 0, 52");
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1, 52, 52", 0, 9);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 98, 50", 31, (int) 'a');
        item3.sellIn = (byte) 0;
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.Item item10 = new com.gildedrose.Item("", (int) (short) 10, (int) 'a');
        java.lang.String str11 = item10.toString();
        com.gildedrose.Item item12 = itemUpdater6.update(item10);
        item10.sellIn = 9;
        int int15 = item10.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ", 10, 97" + "'", str11, ", 10, 97");
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 50 + "'", int15 == 50);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 52", (int) ' ', (int) '4');
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 98, 0, 96, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1, 1, 10");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 1, 0, 98, 99, 32, -2");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 50, 49");
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
        item23.name = "hi!, 100, 1, 9, 1, 100, 1";
        com.gildedrose.Item item37 = itemUpdater14.update(item23);
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
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
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
        java.lang.String str58 = item51.name;
        item51.sellIn = (byte) -1;
        item51.sellIn = (short) 0;
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
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -1, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 97, 9");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -1, 0, 96, -2");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        java.lang.String str6 = item3.name;
        item3.name = "hi!, -1, 0";
        item3.sellIn = 0;
        java.lang.String str11 = item3.name;
        java.lang.String str12 = item3.toString();
        java.lang.String str13 = item3.toString();
        int int14 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 99, 0" + "'", str6, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, -1, 0" + "'", str11, "hi!, -1, 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, -1, 0, 0, 52" + "'", str12, "hi!, -1, 0, 0, 52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, -1, 0, 0, 52" + "'", str13, "hi!, -1, 0, 0, 52");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
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
        java.lang.String str85 = item81.name;
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
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!, 98, -2" + "'", str85, "hi!, 98, -2");
    }
}

