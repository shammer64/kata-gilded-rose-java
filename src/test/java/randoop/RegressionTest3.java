package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 0, 1", 0, (int) (short) 10);
        int int4 = item3.quality;
        java.lang.String str5 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str5, "hi!, 0, 0, 0, 1");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!", 100, 1);
        int int9 = item8.sellIn;
        com.gildedrose.Item item10 = itemUpdater4.update(item8);
        java.lang.String str11 = item8.toString();
        item8.name = "hi!, 10, 0";
        item8.sellIn = 0;
        java.lang.String str16 = item8.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 10, 0" + "'", str16, "hi!, 10, 0");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        item53.quality = (short) 10;
        java.lang.Class<?> wildcardClass63 = item53.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 0, (int) 'a');
        item3.quality = (byte) -1;
        int int6 = item3.quality;
        item3.sellIn = 99;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory1 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater3 = itemUpdaterFactory1.getInstance("");
        com.gildedrose.Item item7 = new com.gildedrose.Item("hi!", 100, 1);
        int int8 = item7.sellIn;
        com.gildedrose.Item item9 = itemUpdater3.update(item7);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory10 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory10.getInstance("");
        com.gildedrose.Item item16 = new com.gildedrose.Item("hi!", 100, 1);
        int int17 = item16.sellIn;
        com.gildedrose.Item item18 = itemUpdater12.update(item16);
        item16.sellIn = (byte) 0;
        java.lang.String str21 = item16.toString();
        com.gildedrose.Item item22 = itemUpdater3.update(item16);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory23 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory23.getInstance("");
        com.gildedrose.Item item29 = new com.gildedrose.Item("hi!", 100, 1);
        int int30 = item29.sellIn;
        com.gildedrose.Item item31 = itemUpdater25.update(item29);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory32 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater34 = itemUpdaterFactory32.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater36 = itemUpdaterFactory32.getInstance("");
        com.gildedrose.Item item40 = new com.gildedrose.Item("hi!", 100, 1);
        int int41 = item40.sellIn;
        com.gildedrose.Item item42 = itemUpdater36.update(item40);
        java.lang.String str43 = item40.toString();
        item40.sellIn = 10;
        java.lang.String str46 = item40.toString();
        item40.sellIn = 98;
        com.gildedrose.Item item49 = itemUpdater25.update(item40);
        com.gildedrose.Item item50 = itemUpdater3.update(item49);
        int int51 = item49.quality;
        java.lang.String str52 = item49.toString();
        com.gildedrose.Item item53 = conjuredItemUpdater0.update(item49);
        int int54 = item53.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(item9);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 0, 0" + "'", str21, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(itemUpdater34);
        org.junit.Assert.assertNotNull(itemUpdater36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(item42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!, 99, 0" + "'", str43, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!, 10, 0" + "'", str46, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item49);
        org.junit.Assert.assertNotNull(item50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!, 96, 0" + "'", str52, "hi!, 96, 0");
        org.junit.Assert.assertNotNull(item53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 95 + "'", int54 == 95);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        java.lang.String str19 = item18.name;
        java.lang.String str20 = item18.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 100, 1" + "'", str19, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 100, 1" + "'", str20, "hi!, 100, 1");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 9");
        java.lang.Class<?> wildcardClass9 = itemUpdater8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!, -1, 1", (int) ' ', (int) ' ');
        item10.sellIn = (byte) 10;
        com.gildedrose.Item item13 = itemUpdater6.update(item10);
        item13.name = "hi!, 10, 50";
        item13.sellIn = (-1);
        item13.name = "hi!, -3, 0, 50, 49";
        int int20 = item13.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 31 + "'", int20 == 31);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        item39.quality = 100;
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
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance(", 100, 1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory15 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory15.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory15.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory15.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory15.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater24 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item28 = new com.gildedrose.Item("hi!", 100, 1);
        int int29 = item28.sellIn;
        com.gildedrose.Item item30 = conjuredItemUpdater24.update(item28);
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str35 = item34.name;
        java.lang.String str36 = item34.name;
        int int37 = item34.quality;
        java.lang.String str38 = item34.toString();
        com.gildedrose.Item item39 = conjuredItemUpdater24.update(item34);
        java.lang.String str40 = item39.name;
        int int41 = item39.sellIn;
        item39.name = "hi!";
        int int44 = item39.quality;
        com.gildedrose.Item item45 = itemUpdater23.update(item39);
        com.gildedrose.Item item46 = itemUpdater14.update(item39);
        java.lang.Class<?> wildcardClass47 = itemUpdater14.getClass();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!, 100, 1" + "'", str38, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 99 + "'", int41 == 99);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertNotNull(item46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        int int5 = item3.sellIn;
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        java.lang.Class<?> wildcardClass20 = item15.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 100, 1" + "'", str19, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -2, 50", 0, (-2));
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        int int5 = item3.quality;
        item3.name = "hi!, 0, 0, 32, 0";
        item3.name = "hi!, -3, 0, 50, 49";
        item3.quality = 9;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        java.lang.String str19 = item16.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        item37.quality = (-2);
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
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 32, 0, 10, 99", (int) (short) 100, 8);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 100, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 0, 0, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        item18.quality = (short) 0;
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
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        item23.name = "hi!, 10, 0, 10, 1, 1, -1, 52, 100";
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
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        item13.sellIn = ' ';
        item13.sellIn = 8;
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
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        java.lang.Class<?> wildcardClass58 = item56.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (short) 10, (int) (byte) -1);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49", (int) ' ', (int) 'a');
        item3.name = "hi!, 51, 0";
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        java.lang.Class<?> wildcardClass33 = item30.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        item67.quality = 51;
        int int70 = item67.sellIn;
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
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 97 + "'", int70 == 97);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 51 + "'", int71 == 51);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        item12.name = "";
        java.lang.Class<?> wildcardClass21 = item12.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        item67.quality = 51;
        int int70 = item67.sellIn;
        item67.quality = '4';
        int int73 = item67.quality;
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
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 52 + "'", int73 == 52);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        item26.sellIn = 98;
        item26.sellIn = 35;
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
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, -1");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item8.sellIn = 52;
        int int11 = item8.quality;
        com.gildedrose.Item item12 = itemUpdater4.update(item8);
        int int13 = item8.sellIn;
        java.lang.String str14 = item8.toString();
        int int15 = item8.quality;
        java.lang.Class<?> wildcardClass16 = item8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 0, 0, 99, 0, 51, 50" + "'", str14, "hi!, 0, 0, 99, 0, 51, 50");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 50 + "'", int15 == 50);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        item29.quality = (byte) 1;
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
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 52");
        java.lang.Class<?> wildcardClass11 = itemUpdaterFactory0.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', 1);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.toString();
        item3.name = "hi!, 99, 0, 98, 0";
        java.lang.String str8 = item3.name;
        java.lang.String str9 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ", 52, 1" + "'", str5, ", 52, 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 99, 0, 98, 0" + "'", str8, "hi!, 99, 0, 98, 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 99, 0, 98, 0" + "'", str9, "hi!, 99, 0, 98, 0");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        int int6 = item3.quality;
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        java.lang.String str35 = item31.toString();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!, 0, 0, 0, 1, 97, 0" + "'", str35, "hi!, 0, 0, 0, 1, 97, 0");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item6.sellIn = 1;
        item6.sellIn = 32;
        item6.sellIn = (byte) 10;
        java.lang.String str13 = item6.toString();
        item6.quality = 'a';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 10, 0" + "'", str13, "hi!, 10, 0");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str4 = item3.name;
        item3.quality = 51;
        int int7 = item3.sellIn;
        item3.name = "hi!";
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0" + "'", str4, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance(", 0, 50");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        int int74 = item73.sellIn;
        item73.quality = 32;
        java.lang.String str77 = item73.name;
        java.lang.Class<?> wildcardClass78 = item73.getClass();
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
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 8 + "'", int74 == 8);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str77, "hi!, 0, 0, 99, 0");
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        item3.quality = 100;
        int int8 = item3.sellIn;
        java.lang.String str9 = item3.name;
        item3.name = "hi!, -3, 0";
        item3.name = "hi!, 100, 1, 35, 0";
        java.lang.Class<?> wildcardClass14 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 99, 0" + "'", str9, "hi!, 99, 0");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 1, 32" + "'", str4, ", 1, 32");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 98, 99, 32, -2", 8, 31);
        item3.name = "hi!, 0, 0, 31, 0";
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        java.lang.Class<?> wildcardClass13 = itemUpdaterFactory0.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1", (int) 'a', 50);
        int int4 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 32, 100", (int) (short) 1, 49);
        java.lang.String str4 = item3.toString();
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 32, 100, 1, 49" + "'", str4, "hi!, 100, 1, 32, 100, 1, 49");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", (int) (byte) 10, (int) (short) 100);
        item3.sellIn = ' ';
        item3.sellIn = (byte) 10;
        item3.name = "hi!, 100, -1";
        int int10 = item3.quality;
        item3.quality = (-3);
        java.lang.String str13 = item3.name;
        int int14 = item3.quality;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 100, -1" + "'", str13, "hi!, 100, -1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3) + "'", int14 == (-3));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item6.sellIn = 1;
        item6.name = "hi!, 0, 0, 0, 1";
        java.lang.String str11 = item6.name;
        int int12 = item6.sellIn;
        item6.sellIn = 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str11, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        int int41 = item40.quality;
        item40.quality = 96;
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 48 + "'", int41 == 48);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", 96, (-2));
        int int4 = item3.quality;
        item3.quality = 50;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        java.lang.String str40 = item35.toString();
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!, 0, 0, 99, 0, 49, 50" + "'", str40, "hi!, 0, 0, 99, 0, 49, 50");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
        item15.name = "";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 0, 0" + "'", str9, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str10, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 0, 0" + "'", str16, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str17, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item18);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        java.lang.Class<?> wildcardClass25 = item22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.name;
        item3.sellIn = (-1);
        java.lang.String str9 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        int int50 = item38.quality;
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 50 + "'", int50 == 50);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 0, 1, 52, 97", (int) 'a', 98);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 98, 0, 97, 35");
        java.lang.Class<?> wildcardClass5 = itemUpdater4.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -3, 0, 50, 49");
        java.lang.Class<?> wildcardClass11 = itemUpdaterFactory0.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        java.lang.String str6 = item3.name;
        item3.name = "hi!, -1, 0";
        item3.sellIn = 0;
        item3.sellIn = 1;
        java.lang.String str13 = item3.name;
        item3.sellIn = 0;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 99, 0" + "'", str6, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, -1, 0" + "'", str13, "hi!, -1, 0");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        com.gildedrose.Item item25 = new com.gildedrose.Item("hi!, 100, 1", (int) '#', 0);
        item25.name = ", 1, 32";
        int int28 = item25.quality;
        com.gildedrose.Item item29 = itemUpdater2.update(item25);
        java.lang.String str30 = item25.toString();
        java.lang.String str31 = item25.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + ", 1, 32, 34, 0" + "'", str30, ", 1, 32, 34, 0");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ", 1, 32, 34, 0" + "'", str31, ", 1, 32, 34, 0");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -4, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -1, 1, 8, 30");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        item12.name = "hi!, 10, 0";
        item12.name = "hi!, -1, 1";
        item12.quality = (byte) 0;
        int int19 = item12.sellIn;
        int int20 = item12.sellIn;
        int int21 = item12.sellIn;
        item12.name = "hi!, 99, 0, 98, 0";
        com.gildedrose.Item item24 = itemUpdater8.update(item12);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(item24);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        java.lang.String str44 = item37.toString();
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!, 99, 0, 31, 0" + "'", str44, "hi!, 99, 0, 31, 0");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 0, 1", (int) (byte) 1, (int) (byte) 10);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0, 0, 1, 1, 10" + "'", str4, "hi!, 0, 0, 0, 1, 1, 10");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        item12.quality = 'a';
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
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 98, 0, 97, 35", (int) ' ', (-2));
        item3.name = ", 99, -1, 98, -1";
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49", 10, (int) (byte) -1);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0, 99, 0, 50, 49, 10, -1" + "'", str4, "hi!, 0, 0, 99, 0, 50, 49, 10, -1");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 49", 30, (int) 'a');
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
        item41.quality = 35;
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
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49, 96, 49", (int) (short) 0, 30);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item6.sellIn = 1;
        item6.sellIn = 32;
        int int11 = item6.sellIn;
        int int12 = item6.quality;
        item6.quality = (short) -1;
        item6.sellIn = 10;
        java.lang.String str17 = item6.name;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 51, 34", 31, (int) (short) 10);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 51, 34" + "'", str4, "hi!, 100, 1, 51, 34");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 98, 0, 96, 0", 35, 98);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        item3.quality = '4';
        int int6 = item3.quality;
        int int7 = item3.quality;
        item3.name = "hi!, 99, 0, -2, 52";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 51, 0, 98, 0", (int) (byte) 10, 31);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 32, (int) (short) 10);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -4, 0", (int) (byte) 100, 8);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        java.lang.Class<?> wildcardClass82 = itemUpdater2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 0, 52");
        com.gildedrose.Item item18 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item18.sellIn = (byte) 100;
        java.lang.String str21 = item18.name;
        item18.name = "hi!, -1, 0";
        com.gildedrose.Item item24 = itemUpdater14.update(item18);
        java.lang.String str25 = item18.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 99, 0" + "'", str21, "hi!, 99, 0");
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!, -1, 0, 99, 50" + "'", str25, "hi!, -1, 0, 99, 50");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 10, 0");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater7 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item11 = new com.gildedrose.Item("hi!", 100, 1);
        int int12 = item11.sellIn;
        com.gildedrose.Item item13 = conjuredItemUpdater7.update(item11);
        item11.name = "hi!, 0, 0";
        item11.sellIn = (-2);
        com.gildedrose.Item item18 = itemUpdater6.update(item11);
        java.lang.String str19 = item11.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 0, 0, -3, 0" + "'", str19, "hi!, 0, 0, -3, 0");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        item80.name = "hi!, 10, 0, 10, 1, 1, -1, 52, 52";
        item80.sellIn = (short) 1;
        com.gildedrose.Item item85 = itemUpdater6.update(item80);
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
        org.junit.Assert.assertNotNull(itemUpdater60);
        org.junit.Assert.assertNotNull(itemUpdater62);
        org.junit.Assert.assertNotNull(itemUpdater65);
        org.junit.Assert.assertNotNull(itemUpdater67);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 100 + "'", int72 == 100);
        org.junit.Assert.assertNotNull(item73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!, 99, 0" + "'", str74, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!, 10, 0" + "'", str77, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item80);
        org.junit.Assert.assertNotNull(item85);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
        int int55 = item43.quality;
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
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        java.lang.Class<?> wildcardClass46 = item37.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        int int40 = item34.sellIn;
        item34.sellIn = 10;
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        java.lang.String str18 = item15.name;
        java.lang.String str19 = item15.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1" + "'", str14, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 99, 0" + "'", str19, "hi!, 99, 0");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 31, (int) (short) 100);
        item3.name = "hi!, 0, 0, 52, 1";
        java.lang.String str6 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str6, "hi!, 0, 0, 52, 1");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        item3.name = "hi!, 52, 1";
        item3.quality = ' ';
        item3.sellIn = 0;
        int int10 = item3.quality;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        int int23 = item8.sellIn;
        int int24 = item8.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 32, 0");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item13 = new com.gildedrose.Item("hi!", 100, 1);
        int int14 = item13.sellIn;
        com.gildedrose.Item item15 = conjuredItemUpdater9.update(item13);
        item13.name = "hi!, 0, 0";
        int int18 = item13.quality;
        item13.name = "hi!";
        item13.name = "hi!";
        item13.name = "hi!, 98, -2";
        int int25 = item13.sellIn;
        com.gildedrose.Item item26 = itemUpdater8.update(item13);
        java.lang.String str27 = item13.toString();
        java.lang.Class<?> wildcardClass28 = item13.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 99 + "'", int25 == 99);
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!, 98, -2, 98, 0" + "'", str27, "hi!, 98, -2, 98, 0");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 100, 1", (int) '4', (int) '#');
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        java.lang.String str14 = item12.toString();
        int int15 = item12.quality;
        java.lang.String str16 = item12.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1, 51, 34" + "'", str14, "hi!, 100, 1, 51, 34");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 100, 1" + "'", str16, "hi!, 100, 1");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 0, (int) (byte) 10);
        int int4 = item3.quality;
        item3.sellIn = (short) 10;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        java.lang.String str6 = item3.name;
        item3.name = "hi!, -1, 0";
        item3.sellIn = 0;
        item3.sellIn = 1;
        item3.quality = 0;
        java.lang.String str15 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 99, 0" + "'", str6, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, -1, 0, 1, 0" + "'", str15, "hi!, -1, 0, 1, 0");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        item11.quality = 32;
        item11.quality = 34;
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
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
        java.lang.String str27 = item15.toString();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!, 99, 0" + "'", str27, "hi!, 99, 0");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -2, 50", 99, 50);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50", (int) (short) 1, (int) (short) 100);
        java.lang.String str4 = item3.toString();
        item3.sellIn = 34;
        item3.sellIn = 0;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 0, 50, 1, 100" + "'", str4, ", 0, 50, 1, 100");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        java.lang.Class<?> wildcardClass45 = item44.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        item15.sellIn = (byte) 100;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1" + "'", str14, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item15);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 48, 47");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory13 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory13.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory16 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory16.getInstance("");
        com.gildedrose.Item item24 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item24.sellIn = 52;
        int int27 = item24.quality;
        com.gildedrose.Item item28 = itemUpdater20.update(item24);
        com.gildedrose.Item item29 = itemUpdater15.update(item28);
        java.lang.String str30 = item29.toString();
        item29.name = "hi!, 52, 1";
        item29.sellIn = 31;
        com.gildedrose.Item item35 = itemUpdater12.update(item29);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!, 0, 0, 99, 0, 50, 49" + "'", str30, "hi!, 0, 0, 99, 0, 50, 49");
        org.junit.Assert.assertNotNull(item35);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        item49.sellIn = 0;
        java.lang.String str52 = item49.name;
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 98, 0, 31, 32", 50, (int) (byte) 0);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 99, 0, 98, 0, 31, 32, 50, 0" + "'", str4, "hi!, 99, 0, 98, 0, 31, 32, 50, 0");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) (short) 100, (int) '4');
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 0" + "'", str4, "hi!, -1, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, -1, 0, 100, 52" + "'", str5, "hi!, -1, 0, 100, 52");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0", 98, 99);
        int int4 = item3.quality;
        item3.sellIn = ' ';
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 1, 0, 32, 99" + "'", str7, "hi!, 1, 0, 32, 99");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater28 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item32 = new com.gildedrose.Item("hi!", 100, 1);
        int int33 = item32.sellIn;
        com.gildedrose.Item item34 = conjuredItemUpdater28.update(item32);
        com.gildedrose.Item item38 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str39 = item38.name;
        java.lang.String str40 = item38.name;
        int int41 = item38.quality;
        java.lang.String str42 = item38.toString();
        com.gildedrose.Item item43 = conjuredItemUpdater28.update(item38);
        java.lang.String str44 = item43.name;
        item43.name = "hi!, 99, 0";
        com.gildedrose.Item item47 = itemUpdater4.update(item43);
        int int48 = item47.sellIn;
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(item34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!, 100, 1" + "'", str42, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 98 + "'", int48 == 98);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        int int41 = item38.sellIn;
        int int42 = item38.sellIn;
        com.gildedrose.Item item43 = itemUpdater8.update(item38);
        item38.sellIn = 97;
        java.lang.String str46 = item38.name;
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 99 + "'", int41 == 99);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 99 + "'", int42 == 99);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 32, 100", 48, 51);
        int int4 = item3.quality;
        item3.name = "hi!, 98, -2";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        java.lang.String str46 = item45.toString();
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!, 0, 0, 99, 0, 50, 49, 31, 50" + "'", str46, "hi!, 0, 0, 99, 0, 50, 49, 31, 50");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        item8.quality = (-3);
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
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        int int66 = item61.sellIn;
        item61.sellIn = (byte) 0;
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
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 51 + "'", int66 == 51);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 99");
        com.gildedrose.Item item8 = new com.gildedrose.Item("", 1, (int) ' ');
        java.lang.String str9 = item8.toString();
        item8.sellIn = 96;
        com.gildedrose.Item item12 = itemUpdater4.update(item8);
        java.lang.Class<?> wildcardClass13 = itemUpdater4.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 1, 32" + "'", str9, ", 1, 32");
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
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
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
        java.lang.String str20 = item15.toString();
        java.lang.Class<?> wildcardClass21 = item15.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1" + "'", str14, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ", 0, 50, 1, 100, 99, 0" + "'", str20, ", 0, 50, 1, 100, 99, 0");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 98, 0, 97, 35");
        java.lang.Class<?> wildcardClass13 = itemUpdaterFactory0.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 52, 0", (int) (short) -1, 10);
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        item8.quality = 0;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        int int18 = item8.quality;
        java.lang.String str19 = item8.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 10, 0, 10, 0" + "'", str19, "hi!, 10, 0, 10, 0");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 99, -1, 98, -1", 52, (int) (short) -1);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 98, 0, 31, 32, 50, 0", 48, 51);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        java.lang.String str6 = item3.name;
        item3.name = "hi!, -1, 0";
        item3.name = "hi!";
        item3.sellIn = (short) 10;
        item3.sellIn = (short) 10;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 99, 0" + "'", str6, "hi!, 99, 0");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
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
        int int18 = item8.sellIn;
        item8.name = ", 0, 50, 1, 100";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        item16.name = "hi!, -2, 50, 9, 0";
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
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, (int) (byte) 0);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        int int22 = item15.sellIn;
        java.lang.Class<?> wildcardClass23 = item15.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 99 + "'", int22 == 99);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str9 = item8.name;
        java.lang.String str10 = item8.toString();
        com.gildedrose.Item item11 = itemUpdater4.update(item8);
        item8.sellIn = (byte) -1;
        item8.quality = (byte) 1;
        java.lang.String str16 = item8.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 0, 0" + "'", str9, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str10, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 0, 0" + "'", str16, "hi!, 0, 0");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory7 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater9 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory7.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory7.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory7.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory7.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory7.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory7.getInstance("hi!, 0, 0, 52, 1");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory7.getInstance("hi!, -1, 52");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory7.getInstance(", 0, 50, 10, -1");
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory7.getInstance("hi!, 10, 0, 10, 0, 0, 0");
        com.gildedrose.Item item31 = new com.gildedrose.Item("hi!, -1, 0, 0, 52", (int) ' ', 35);
        com.gildedrose.Item item32 = itemUpdater27.update(item31);
        item32.quality = (-2);
        com.gildedrose.Item item35 = conjuredItemUpdater0.update(item32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertNotNull(itemUpdater9);
        org.junit.Assert.assertNotNull(itemUpdater11);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater17);
        org.junit.Assert.assertNotNull(itemUpdater19);
        org.junit.Assert.assertNotNull(itemUpdater21);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertNotNull(item35);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 51, 34, -2, 99");
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
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 0, 98", 31, 52);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        item3.name = "hi!, 0, 0";
        item3.quality = (byte) -1;
        java.lang.String str9 = item3.name;
        int int10 = item3.sellIn;
        item3.name = "hi!, -2, 0";
        item3.sellIn = 46;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 0, 0" + "'", str9, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        java.lang.String str18 = item15.toString();
        java.lang.Class<?> wildcardClass19 = item15.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51 + "'", int17 == 51);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ", 51, 0" + "'", str18, ", 51, 0");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 51, (int) (byte) 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        item24.sellIn = (short) 0;
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
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
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
        item11.name = "hi!, 10, 96";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, -3, 0");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, -3, 49");
        java.lang.Class<?> wildcardClass19 = itemUpdaterFactory0.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 9");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!", (int) (short) 100, (int) (byte) -1);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        com.gildedrose.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.gildedrose.Item item15 = itemUpdater8.update(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
        com.gildedrose.Item item53 = new com.gildedrose.Item("", 1, (int) ' ');
        item53.quality = 99;
        int int56 = item53.sellIn;
        item53.sellIn = 99;
        com.gildedrose.Item item59 = itemUpdater2.update(item53);
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
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(item59);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 98, 0, 97, 35");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1, 97, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        java.lang.String str24 = item23.name;
        java.lang.String str25 = item23.toString();
        item23.sellIn = 10;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!, 98, 0" + "'", str25, "hi!, 98, 0");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        item39.name = "hi!, 34, 0";
        int int45 = item39.sellIn;
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-3) + "'", int45 == (-3));
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
        java.lang.String str22 = item21.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str22, "hi!, 0, 0, 52, 1");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        java.lang.Class<?> wildcardClass21 = itemUpdater20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 100, 1", (int) '4', (int) '#');
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        java.lang.String str14 = item13.name;
        item13.quality = 98;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1" + "'", str14, "hi!, 100, 1");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
        java.lang.Class<?> wildcardClass39 = item35.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 99, 0" + "'", str5, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 99, 0, 0, 52" + "'", str6, "hi!, 99, 0, 0, 52");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        java.lang.String str25 = item24.name;
        item24.name = "hi!, 10, 0, 52, 10";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(item24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ", 1, 32" + "'", str25, ", 1, 32");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory0.getInstance("hi!, 34, 0");
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
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 98, 0, 31, 32", 52, 49);
        item3.quality = 96;
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        int int5 = item3.quality;
        item3.name = "hi!, 0, 0, 32, 0";
        item3.name = ", 100, 1, -4, 0";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
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
        com.gildedrose.Item item28 = new com.gildedrose.Item("hi!, 10, 0, 10, 0", 52, (int) (short) 100);
        item28.name = ", 99, -1";
        com.gildedrose.Item item31 = itemUpdater2.update(item28);
        int int32 = item31.sellIn;
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
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 51 + "'", int32 == 51);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance(", 100, 1, -4, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 98");
        java.lang.Class<?> wildcardClass13 = itemUpdaterFactory0.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        int int53 = item49.sellIn;
        int int54 = item49.sellIn;
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 31 + "'", int53 == 31);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 31 + "'", int54 == 31);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        item3.quality = 100;
        int int8 = item3.sellIn;
        java.lang.String str9 = item3.name;
        java.lang.String str10 = item3.name;
        item3.name = "hi!, 0, 0, 0, 49";
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 99, 0" + "'", str9, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 99, 0" + "'", str10, "hi!, 99, 0");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
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
        java.lang.String str35 = item33.toString();
        java.lang.String str36 = item33.name;
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 10, 99);
        int int4 = item3.quality;
        item3.sellIn = 1;
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 0, 0, 1, 99" + "'", str7, "hi!, 0, 0, 1, 99");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        item6.name = "hi!, 0, 0, 99, 0";
        java.lang.String str11 = item6.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str11, "hi!, 0, 0, 99, 0");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        java.lang.String str6 = item3.name;
        item3.name = "hi!, 0, 0, 99, 0";
        item3.name = "hi!, 100, 1, 32, 100, -2, 98";
        item3.quality = (byte) 100;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0" + "'", str4, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 0, 0, 32, 0" + "'", str5, "hi!, 0, 0, 32, 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 0, 0" + "'", str6, "hi!, 0, 0");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", 1, (-1));
        int int4 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        int int4 = item3.quality;
        item3.name = "hi!, 51, 0";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", (int) '#', 0);
        item3.quality = 0;
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 1, (int) '4');
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        int int88 = item84.quality;
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
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 8 + "'", int88 == 8);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater19 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item23 = new com.gildedrose.Item("hi!", 100, 1);
        int int24 = item23.sellIn;
        com.gildedrose.Item item25 = conjuredItemUpdater19.update(item23);
        com.gildedrose.Item item29 = new com.gildedrose.Item("hi!", 100, 1);
        com.gildedrose.Item item30 = conjuredItemUpdater19.update(item29);
        item29.name = ", 1, 32, 98, 0";
        com.gildedrose.Item item33 = itemUpdater18.update(item29);
        java.lang.Class<?> wildcardClass34 = item29.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(item25);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        java.lang.String str28 = item21.name;
        java.lang.String str29 = item21.name;
        int int30 = item21.sellIn;
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!, 1, 0" + "'", str28, "hi!, 1, 0");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!, 1, 0" + "'", str29, "hi!, 1, 0");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        int int32 = item30.sellIn;
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-2) + "'", int32 == (-2));
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        int int7 = item4.quality;
        java.lang.String str8 = item4.name;
        java.lang.String str9 = item4.name;
        java.lang.String str10 = item4.name;
        int int11 = item4.sellIn;
        java.lang.String str12 = item4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 99, 0" + "'", str12, "hi!, 99, 0");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
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
        int int19 = item16.quality;
        java.lang.String str20 = item16.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, -1, 0" + "'", str18, "hi!, -1, 0");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, -1, 0" + "'", str20, "hi!, -1, 0");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 0, 52");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 51, 0, 97, 0");
        com.gildedrose.Item item20 = new com.gildedrose.Item(", 10, 10", (int) (short) 10, (int) (byte) -1);
        com.gildedrose.Item item21 = itemUpdater16.update(item20);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(item21);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        java.lang.String str19 = item18.toString();
        item18.sellIn = 0;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 100, 1, 9, 50" + "'", str19, "hi!, 100, 1, 9, 50");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 52, (int) (byte) 0);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 52, 0" + "'", str4, ", 52, 0");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
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
        item30.name = "hi!, 10, 0, 10, 0, 0, 0";
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
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        item3.quality = 100;
        int int8 = item3.sellIn;
        java.lang.String str9 = item3.name;
        item3.name = "hi!, 99, 0, 98, 0, 52, 1";
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 99, 0" + "'", str9, "hi!, 99, 0");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        item32.name = "hi!, 0, 0, 0, 1, 99, -1";
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
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
        int int68 = item56.quality;
        item56.quality = 31;
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
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 32, 100", (-2), 98);
        java.lang.String str4 = item3.toString();
        item3.sellIn = 8;
        item3.sellIn = (short) -1;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 32, 100, -2, 98" + "'", str4, "hi!, 100, 1, 32, 100, -2, 98");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item3.sellIn = 52;
        int int6 = item3.quality;
        item3.name = "hi!, 0, 0, 99, 0, 1, 1";
        item3.sellIn = 0;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        item12.sellIn = (short) 100;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", (int) ' ', (int) '#');
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, 0" + "'", str4, "hi!, 10, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 10, 0, 32, 35" + "'", str5, "hi!, 10, 0, 32, 35");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
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
        item8.quality = 0;
        item8.name = "hi!, 99, 0, 100, 52";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 98 + "'", int17 == 98);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        com.gildedrose.Item item46 = new com.gildedrose.Item("hi!, 98, 0, 52, 0", (int) (short) -1, (int) (short) 100);
        com.gildedrose.Item item47 = itemUpdater8.update(item46);
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
        org.junit.Assert.assertNotNull(item47);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
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
        item29.name = "hi!, 99, 0, 98, 0";
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
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 98, 99", 32, (-2));
        java.lang.String str4 = item3.toString();
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.name;
        item3.sellIn = 99;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 0, 98, 99, 32, -2" + "'", str4, "hi!, 1, 0, 98, 99, 32, -2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 1, 0, 98, 99" + "'", str5, "hi!, 1, 0, 98, 99");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 1, 0, 98, 99" + "'", str6, "hi!, 1, 0, 98, 99");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 97", 35, (int) (short) 0);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        java.lang.String str4 = item3.toString();
        java.lang.String str5 = item3.toString();
        java.lang.String str6 = item3.toString();
        int int7 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 10, 0" + "'", str4, "hi!, 100, 1, 10, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 100, 1, 10, 0" + "'", str5, "hi!, 100, 1, 10, 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 100, 1, 10, 0" + "'", str6, "hi!, 100, 1, 10, 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -3, 0, 50, 49");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!, 100, 1, 32, 100, 1, 49, 96, 0", 100, (int) (byte) -1);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str9 = item8.name;
        java.lang.String str10 = item8.toString();
        com.gildedrose.Item item11 = itemUpdater4.update(item8);
        int int12 = item11.quality;
        int int13 = item11.quality;
        java.lang.String str14 = item11.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 0, 0" + "'", str9, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str10, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 0, 0" + "'", str14, "hi!, 0, 0");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
        java.lang.String str82 = item81.toString();
        item81.sellIn = 35;
        java.lang.String str85 = item81.name;
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
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', 1);
        int int4 = item3.sellIn;
        item3.name = "hi!";
        java.lang.String str7 = item3.name;
        int int8 = item3.quality;
        int int9 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        java.lang.String str50 = item43.toString();
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!, 98, 0" + "'", str50, "hi!, 98, 0");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 48", (int) '4', 48);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
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
        item84.name = "hi!, 31, 52";
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
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        java.lang.Class<?> wildcardClass35 = item29.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
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
        item86.name = "hi!, -1, 0";
        item86.sellIn = 98;
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
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        java.lang.String str21 = item19.toString();
        item19.quality = 52;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 98, 0" + "'", str21, "hi!, 98, 0");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1", 1, (-1));
        item3.sellIn = (byte) 1;
        item3.sellIn = 96;
        java.lang.String str8 = item3.name;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 10, 0, 10, 1" + "'", str8, "hi!, 10, 0, 10, 1");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 0", 9, 97);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        item29.name = "hi!, -1, 1, 10, 32";
        int int38 = item29.quality;
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 9 + "'", int38 == 9);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
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
        item30.name = "hi!, 100, -1, 10, 100";
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
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 10, 97, 0, 0", (int) (short) 100, 48);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
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
        item41.quality = 99;
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
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        item13.quality = 35;
        int int16 = item13.sellIn;
        item13.sellIn = (short) 10;
        item13.sellIn = 31;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        java.lang.String str13 = item12.toString();
        item12.quality = '4';
        java.lang.String str16 = item12.name;
        java.lang.String str17 = item12.name;
        java.lang.String str18 = item12.name;
        com.gildedrose.Item item19 = itemUpdater8.update(item12);
        java.lang.Class<?> wildcardClass20 = item12.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ", 1, 32" + "'", str13, ", 1, 32");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
        item84.name = "hi!, 10, 0, 10, 1";
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
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        int int35 = item33.quality;
        java.lang.String str36 = item33.name;
        int int37 = item33.quality;
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ", 1, 32" + "'", str36, ", 1, 32");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.toString();
        java.lang.String str7 = item3.toString();
        java.lang.String str8 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 100, 1" + "'", str6, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 100, 1" + "'", str7, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 100, 1" + "'", str8, "hi!, 100, 1");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 9, 1, 97, 50", 0, 35);
        item3.name = "hi!, 0, 0, 97, 50";
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
        int int40 = item34.sellIn;
        item34.quality = 34;
        java.lang.String str43 = item34.name;
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!, 100, -1" + "'", str43, "hi!, 100, -1");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -3, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 0, -2, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.name;
        item3.sellIn = (-1);
        item3.quality = (byte) -1;
        java.lang.Class<?> wildcardClass11 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 51, 0, 98, 99");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1", (int) ' ', (int) ' ');
        item3.sellIn = (byte) 10;
        int int6 = item3.sellIn;
        int int7 = item3.sellIn;
        java.lang.Class<?> wildcardClass8 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
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
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 1, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 50, 0");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 50");
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
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 98, 0, 97, 35", (int) (byte) 10, (-2));
        int int4 = item3.quality;
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 98, 0, 97, 35, 10, -2" + "'", str5, "hi!, 98, 0, 97, 35, 10, -2");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 32");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 97, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 97, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!, -1, 1", (int) ' ', (int) ' ');
        item10.sellIn = (byte) 10;
        com.gildedrose.Item item13 = itemUpdater6.update(item10);
        item13.name = "hi!, 10, 50";
        item13.sellIn = (-1);
        int int18 = item13.sellIn;
        java.lang.String str19 = item13.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!, 10, 50" + "'", str19, "hi!, 10, 50");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        item67.quality = 9;
        item67.quality = 96;
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
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
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
        int int56 = item55.quality;
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
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory3 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater5 = itemUpdaterFactory3.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory6 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory6.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory6.getInstance("");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item14.sellIn = 52;
        int int17 = item14.quality;
        com.gildedrose.Item item18 = itemUpdater10.update(item14);
        com.gildedrose.Item item19 = itemUpdater5.update(item18);
        java.lang.String str20 = item19.name;
        item19.name = "hi!, -1, -1";
        com.gildedrose.Item item23 = itemUpdater2.update(item19);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str20, "hi!, 0, 0, 99, 0");
        org.junit.Assert.assertNotNull(item23);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
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
        item40.name = "hi!, 99, 0, 100, 52";
        com.gildedrose.Item item43 = itemUpdater8.update(item40);
        item43.name = "hi!, -2, 0";
        item43.name = "hi!, 0, 0, 0, 1";
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
        org.junit.Assert.assertNotNull(item43);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 98, 99", 32, (-2));
        java.lang.String str4 = item3.toString();
        item3.sellIn = '#';
        item3.quality = 51;
        java.lang.Class<?> wildcardClass9 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 0, 98, 99, 32, -2" + "'", str4, "hi!, 1, 0, 98, 99, 32, -2");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance(", 0, 50, 10, -1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 98, 34");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance(", 1, 99, 35, -1");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        item30.name = ", 1, 32";
        item30.sellIn = (-2);
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
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
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
        item17.quality = (short) 0;
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
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
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
        item51.quality = ' ';
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
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
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
        item24.sellIn = 8;
        java.lang.String str34 = item24.toString();
        java.lang.Class<?> wildcardClass35 = item24.getClass();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!, 8, 0" + "'", str34, "hi!, 8, 0");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 52, 32", 0, (int) 'a');
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 52, 32, 0, 97" + "'", str4, "hi!, 52, 32, 0, 97");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
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
        java.lang.String str20 = item15.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 0, 0" + "'", str13, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 0, 0" + "'", str17, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0, -2, 0" + "'", str20, "hi!, 0, 0, -2, 0");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        int int9 = item6.sellIn;
        java.lang.String str10 = item6.toString();
        int int11 = item6.sellIn;
        java.lang.String str12 = item6.name;
        item6.sellIn = (byte) 1;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 99, 0" + "'", str10, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 52, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance(", 1, 99");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        item66.sellIn = (-2);
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
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        int int27 = item17.sellIn;
        int int28 = item17.quality;
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, -2, -1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory13 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory13.getInstance("");
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
        com.gildedrose.Item item33 = itemUpdater15.update(item27);
        com.gildedrose.Item item37 = new com.gildedrose.Item("", (int) '4', 1);
        int int38 = item37.sellIn;
        item37.name = "hi!";
        java.lang.String str41 = item37.name;
        int int42 = item37.sellIn;
        com.gildedrose.Item item43 = itemUpdater15.update(item37);
        com.gildedrose.Item item47 = new com.gildedrose.Item("hi!, -1, 0", (int) (byte) -1, (int) (short) 0);
        int int48 = item47.sellIn;
        com.gildedrose.Item item49 = itemUpdater15.update(item47);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory50 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater52 = itemUpdaterFactory50.getInstance("");
        com.gildedrose.Item item56 = new com.gildedrose.Item("hi!", 100, 1);
        int int57 = item56.sellIn;
        com.gildedrose.Item item58 = itemUpdater52.update(item56);
        int int59 = item56.sellIn;
        item56.sellIn = 0;
        com.gildedrose.Item item62 = itemUpdater15.update(item56);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory63 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater65 = itemUpdaterFactory63.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater67 = itemUpdaterFactory63.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater69 = itemUpdaterFactory63.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater71 = itemUpdaterFactory63.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item75 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item76 = itemUpdater71.update(item75);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory77 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater79 = itemUpdaterFactory77.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater81 = itemUpdaterFactory77.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory82 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater84 = itemUpdaterFactory82.getInstance("");
        com.gildedrose.Item item88 = new com.gildedrose.Item("hi!", 100, 1);
        int int89 = item88.sellIn;
        com.gildedrose.Item item90 = itemUpdater84.update(item88);
        item88.sellIn = (byte) 0;
        com.gildedrose.Item item93 = itemUpdater81.update(item88);
        com.gildedrose.Item item94 = itemUpdater71.update(item93);
        com.gildedrose.Item item95 = itemUpdater15.update(item94);
        java.lang.String str96 = item94.toString();
        com.gildedrose.Item item97 = itemUpdater12.update(item94);
        java.lang.String str98 = item94.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertNotNull(itemUpdater23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(item29);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
        org.junit.Assert.assertNotNull(item43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(item49);
        org.junit.Assert.assertNotNull(itemUpdater52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertNotNull(item58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 99 + "'", int59 == 99);
        org.junit.Assert.assertNotNull(item62);
        org.junit.Assert.assertNotNull(itemUpdater65);
        org.junit.Assert.assertNotNull(itemUpdater67);
        org.junit.Assert.assertNotNull(itemUpdater69);
        org.junit.Assert.assertNotNull(itemUpdater71);
        org.junit.Assert.assertNotNull(item76);
        org.junit.Assert.assertNotNull(itemUpdater79);
        org.junit.Assert.assertNotNull(itemUpdater81);
        org.junit.Assert.assertNotNull(itemUpdater84);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 100 + "'", int89 == 100);
        org.junit.Assert.assertNotNull(item90);
        org.junit.Assert.assertNotNull(item93);
        org.junit.Assert.assertNotNull(item94);
        org.junit.Assert.assertNotNull(item95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "hi!, -3, 0" + "'", str96, "hi!, -3, 0");
        org.junit.Assert.assertNotNull(item97);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "hi!, -4, 0" + "'", str98, "hi!, -4, 0");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 98, 99, 32, -2, -2, 1", 32, (-4));
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10", 1, 99);
        java.lang.String str4 = item3.name;
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 10" + "'", str4, "hi!, 100, 10");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 100, 52, 99, 0, 0, 52", 32, (int) (byte) 1);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 10, (int) '4');
        item3.sellIn = 0;
        item3.sellIn = 31;
        java.lang.String str8 = item3.toString();
        java.lang.String str9 = item3.name;
        java.lang.String str10 = item3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 31, 52" + "'", str8, "hi!, 31, 52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 31, 52" + "'", str10, "hi!, 31, 52");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 51, 50");
        java.lang.Class<?> wildcardClass9 = itemUpdater8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
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
        item14.name = "hi!, 0, 0, 52, 1";
        item14.sellIn = '4';
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(item20);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        item16.quality = 48;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 0, 0, 99, 0, 50, 49" + "'", str17, "hi!, 0, 0, 99, 0, 50, 49");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, 52, 1, 31, 49" + "'", str22, "hi!, 52, 1, 31, 49");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        int int9 = item4.quality;
        item4.name = "";
        item4.name = "hi!, 99, 0, 0, 52";
        int int14 = item4.quality;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance(", 100, 1");
        java.lang.Class<?> wildcardClass11 = itemUpdaterFactory0.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) (byte) -1, 100);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance(", 100, 1");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str15 = item14.name;
        java.lang.String str16 = item14.name;
        java.lang.String str17 = item14.name;
        item14.name = "hi!, 100, 52";
        item14.sellIn = ' ';
        java.lang.String str22 = item14.toString();
        com.gildedrose.Item item23 = itemUpdater10.update(item14);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, 100, 52, 32, 1" + "'", str22, "hi!, 100, 52, 32, 1");
        org.junit.Assert.assertNotNull(item23);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, -1, 0", 0, (int) (byte) 0);
        com.gildedrose.Item item13 = itemUpdater2.update(item12);
        item13.quality = (short) -1;
        item13.sellIn = 35;
        java.lang.Class<?> wildcardClass18 = item13.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str13 = item12.name;
        java.lang.String str14 = item12.name;
        com.gildedrose.Item item15 = itemUpdater8.update(item12);
        java.lang.Class<?> wildcardClass16 = item15.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 0, 0" + "'", str13, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 0, 0" + "'", str14, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 100, 0");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater9 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item13 = new com.gildedrose.Item("hi!", 100, 1);
        int int14 = item13.sellIn;
        com.gildedrose.Item item15 = conjuredItemUpdater9.update(item13);
        int int16 = item13.quality;
        java.lang.String str17 = item13.name;
        java.lang.String str18 = item13.name;
        com.gildedrose.Item item19 = itemUpdater8.update(item13);
        item19.sellIn = 96;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(item19);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
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
        com.gildedrose.ItemUpdater itemUpdater54 = itemUpdaterFactory50.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater56 = itemUpdaterFactory50.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater58 = itemUpdaterFactory50.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item62 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item63 = itemUpdater58.update(item62);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory64 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater66 = itemUpdaterFactory64.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater68 = itemUpdaterFactory64.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory69 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater71 = itemUpdaterFactory69.getInstance("");
        com.gildedrose.Item item75 = new com.gildedrose.Item("hi!", 100, 1);
        int int76 = item75.sellIn;
        com.gildedrose.Item item77 = itemUpdater71.update(item75);
        item75.sellIn = (byte) 0;
        com.gildedrose.Item item80 = itemUpdater68.update(item75);
        com.gildedrose.Item item81 = itemUpdater58.update(item80);
        com.gildedrose.Item item82 = itemUpdater2.update(item81);
        java.lang.String str83 = item81.toString();
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 99 + "'", int46 == 99);
        org.junit.Assert.assertNotNull(item49);
        org.junit.Assert.assertNotNull(itemUpdater52);
        org.junit.Assert.assertNotNull(itemUpdater54);
        org.junit.Assert.assertNotNull(itemUpdater56);
        org.junit.Assert.assertNotNull(itemUpdater58);
        org.junit.Assert.assertNotNull(item63);
        org.junit.Assert.assertNotNull(itemUpdater66);
        org.junit.Assert.assertNotNull(itemUpdater68);
        org.junit.Assert.assertNotNull(itemUpdater71);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 100 + "'", int76 == 100);
        org.junit.Assert.assertNotNull(item77);
        org.junit.Assert.assertNotNull(item80);
        org.junit.Assert.assertNotNull(item81);
        org.junit.Assert.assertNotNull(item82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!, -3, 0" + "'", str83, "hi!, -3, 0");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        java.lang.String str70 = item67.toString();
        java.lang.String str71 = item67.toString();
        int int72 = item67.sellIn;
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
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!, 51, 0, 97, 0" + "'", str70, "hi!, 51, 0, 97, 0");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!, 51, 0, 97, 0" + "'", str71, "hi!, 51, 0, 97, 0");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 97 + "'", int72 == 97);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        com.gildedrose.Item item43 = new com.gildedrose.Item("hi!", (int) '4', (int) (byte) 1);
        int int44 = item43.quality;
        java.lang.String str45 = item43.toString();
        com.gildedrose.Item item46 = conjuredItemUpdater0.update(item43);
        java.lang.Class<?> wildcardClass47 = conjuredItemUpdater0.getClass();
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!, 52, 1" + "'", str45, "hi!, 52, 1");
        org.junit.Assert.assertNotNull(item46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!", 100, 1);
        com.gildedrose.Item item11 = conjuredItemUpdater0.update(item10);
        java.lang.String str12 = item11.toString();
        item11.name = "hi!, -3, 0";
        item11.name = "hi!, 1, 99";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 99, 0" + "'", str12, "hi!, 99, 0");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        java.lang.String str6 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0, 0, 98" + "'", str4, "hi!, 0, 0, 0, 98");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 0, 0" + "'", str6, "hi!, 0, 0");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 50");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance(", 1, 32");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 50, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory17 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory17.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory17.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory22 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater24 = itemUpdaterFactory22.getInstance("");
        com.gildedrose.Item item28 = new com.gildedrose.Item("hi!", 100, 1);
        int int29 = item28.sellIn;
        com.gildedrose.Item item30 = itemUpdater24.update(item28);
        int int31 = item28.sellIn;
        int int32 = item28.sellIn;
        com.gildedrose.Item item33 = itemUpdater21.update(item28);
        com.gildedrose.Item item37 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        int int38 = item37.quality;
        com.gildedrose.Item item39 = itemUpdater21.update(item37);
        com.gildedrose.Item item43 = new com.gildedrose.Item("hi!, 100, 1", 10, (int) (byte) 0);
        item43.quality = 0;
        int int46 = item43.sellIn;
        com.gildedrose.Item item47 = itemUpdater21.update(item43);
        int int48 = item43.sellIn;
        com.gildedrose.Item item49 = itemUpdater16.update(item43);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 99 + "'", int31 == 99);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 99 + "'", int32 == 99);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 9 + "'", int48 == 9);
        org.junit.Assert.assertNotNull(item49);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        item8.sellIn = 96;
        item8.quality = 10;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 35, 0", 0, 30);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
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
        int int44 = item43.quality;
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
        java.lang.String str23 = item21.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 99 + "'", int22 == 99);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 100, 1, 98, 0" + "'", str23, "hi!, 100, 1, 98, 0");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50", (int) (short) 1, (int) (short) 100);
        item3.quality = (byte) -1;
        int int6 = item3.quality;
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ", 0, 50, 1, -1" + "'", str7, ", 0, 50, 1, -1");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
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
        item48.name = ", 1, 32";
        item48.sellIn = 95;
        item48.quality = 96;
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
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance(", 100, 1");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, -1, 10, 100");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance(", 0, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory15 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.Item item21 = new com.gildedrose.Item("hi!", 100, 1);
        int int22 = item21.sellIn;
        com.gildedrose.Item item23 = itemUpdater17.update(item21);
        int int24 = item21.sellIn;
        int int25 = item21.sellIn;
        int int26 = item21.quality;
        int int27 = item21.quality;
        java.lang.String str28 = item21.toString();
        com.gildedrose.Item item29 = itemUpdater14.update(item21);
        item21.quality = 35;
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 99 + "'", int24 == 99);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 99 + "'", int25 == 99);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!, 99, 0" + "'", str28, "hi!, 99, 0");
        org.junit.Assert.assertNotNull(item29);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        java.lang.String str96 = item92.name;
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
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "hi!" + "'", str96, "hi!");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory23.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory26 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater28 = itemUpdaterFactory26.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater30 = itemUpdaterFactory26.getInstance("");
        com.gildedrose.Item item34 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item34.sellIn = 52;
        int int37 = item34.quality;
        com.gildedrose.Item item38 = itemUpdater30.update(item34);
        com.gildedrose.Item item39 = itemUpdater25.update(item38);
        item38.sellIn = (-3);
        com.gildedrose.Item item42 = itemUpdater10.update(item38);
        int int43 = item38.sellIn;
        item38.sellIn = (byte) 10;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater28);
        org.junit.Assert.assertNotNull(itemUpdater30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(item38);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertNotNull(item42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-4) + "'", int43 == (-4));
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50, 1, 100, 99, 0", (-1), 48);
        item3.quality = 0;
        item3.name = "hi!, 0, 0, 99, 0";
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
        java.lang.Class<?> wildcardClass35 = item26.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
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
        item26.sellIn = (short) -1;
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
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        item3.name = "hi!, 100, 1";
        item3.name = "hi!, 100, 1, 32, 100, -2, 1";
        item3.quality = 0;
        item3.quality = 8;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 32, (int) (byte) 0);
        item3.quality = 32;
        int int6 = item3.sellIn;
        int int7 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
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
        item16.quality = 52;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertNotNull(item16);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory62 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater64 = itemUpdaterFactory62.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater66 = itemUpdaterFactory62.getInstance("");
        com.gildedrose.Item item70 = new com.gildedrose.Item("hi!", 100, 1);
        int int71 = item70.sellIn;
        com.gildedrose.Item item72 = itemUpdater66.update(item70);
        java.lang.String str73 = item70.toString();
        item70.sellIn = 10;
        java.lang.String str76 = item70.toString();
        item70.sellIn = 98;
        item70.sellIn = (byte) 10;
        com.gildedrose.Item item81 = itemUpdater42.update(item70);
        int int82 = item70.quality;
        java.lang.String str83 = item70.toString();
        com.gildedrose.Item item84 = itemUpdater6.update(item70);
        item70.quality = 0;
        java.lang.String str87 = item70.name;
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
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(itemUpdater51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!, 0, 0" + "'", str60, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item61);
        org.junit.Assert.assertNotNull(itemUpdater64);
        org.junit.Assert.assertNotNull(itemUpdater66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 100 + "'", int71 == 100);
        org.junit.Assert.assertNotNull(item72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!, 99, 0" + "'", str73, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!, 10, 0" + "'", str76, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!, 9, 0" + "'", str83, "hi!, 9, 0");
        org.junit.Assert.assertNotNull(item84);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
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
        com.gildedrose.Item item28 = new com.gildedrose.Item("hi!, 10, 0, 10, 0", 52, (int) (short) 100);
        item28.name = ", 99, -1";
        com.gildedrose.Item item31 = itemUpdater2.update(item28);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory32 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater34 = itemUpdaterFactory32.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater36 = itemUpdaterFactory32.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory32.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater40 = itemUpdaterFactory32.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory32.getInstance("hi!, 9, 0");
        com.gildedrose.Item item46 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        com.gildedrose.Item item47 = itemUpdater42.update(item46);
        com.gildedrose.Item item51 = new com.gildedrose.Item("hi!, 99, 0", (int) (short) 0, 52);
        item51.sellIn = (short) 10;
        com.gildedrose.Item item54 = itemUpdater42.update(item51);
        item54.name = "hi!, 0, 0, 51, 0";
        com.gildedrose.Item item57 = itemUpdater2.update(item54);
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
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertNotNull(itemUpdater34);
        org.junit.Assert.assertNotNull(itemUpdater36);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertNotNull(itemUpdater40);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertNotNull(item47);
        org.junit.Assert.assertNotNull(item54);
        org.junit.Assert.assertNotNull(item57);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 9, 1, 97, 50", 0, 35);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 9, 1, 97, 50, 0, 35" + "'", str4, "hi!, 100, 1, 9, 1, 97, 50, 0, 35");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
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
        java.lang.String str23 = item22.name;
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
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
        java.lang.String str26 = item23.name;
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!, 100, 1" + "'", str26, "hi!, 100, 1");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory14 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory14.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory14.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory14.getInstance("hi!, 100, 1, 10, 0");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater21 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item25 = new com.gildedrose.Item("hi!", 100, 1);
        int int26 = item25.sellIn;
        com.gildedrose.Item item27 = conjuredItemUpdater21.update(item25);
        item25.name = "hi!, 0, 0";
        item25.sellIn = (-2);
        com.gildedrose.Item item32 = itemUpdater20.update(item25);
        com.gildedrose.Item item33 = itemUpdater8.update(item25);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory34 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater36 = itemUpdaterFactory34.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater38 = itemUpdaterFactory34.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater40 = itemUpdaterFactory34.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory34.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory43 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater45 = itemUpdaterFactory43.getInstance("");
        com.gildedrose.Item item49 = new com.gildedrose.Item("hi!", 100, 1);
        int int50 = item49.sellIn;
        com.gildedrose.Item item51 = itemUpdater45.update(item49);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory52 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater54 = itemUpdaterFactory52.getInstance("");
        com.gildedrose.Item item58 = new com.gildedrose.Item("hi!", 100, 1);
        int int59 = item58.sellIn;
        com.gildedrose.Item item60 = itemUpdater54.update(item58);
        item58.sellIn = (byte) 0;
        java.lang.String str63 = item58.toString();
        com.gildedrose.Item item64 = itemUpdater45.update(item58);
        com.gildedrose.Item item65 = itemUpdater42.update(item58);
        item65.name = "hi!, 10, 52";
        com.gildedrose.Item item68 = itemUpdater8.update(item65);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertNotNull(itemUpdater20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(item27);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertNotNull(itemUpdater36);
        org.junit.Assert.assertNotNull(itemUpdater38);
        org.junit.Assert.assertNotNull(itemUpdater40);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertNotNull(itemUpdater45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertNotNull(item51);
        org.junit.Assert.assertNotNull(itemUpdater54);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertNotNull(item60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!, 0, 0" + "'", str63, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item64);
        org.junit.Assert.assertNotNull(item65);
        org.junit.Assert.assertNotNull(item68);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 1, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 98, -2, -1, 10");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance(", 10, 10, 99, 0");
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
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 0");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!, -2, 0", (int) ' ', (int) (byte) 100);
        com.gildedrose.Item item21 = itemUpdater16.update(item20);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(item21);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        item3.name = "hi!, 10, 0";
        item3.name = "hi!, -1, 1";
        item3.quality = (byte) 0;
        int int10 = item3.sellIn;
        int int11 = item3.sellIn;
        int int12 = item3.sellIn;
        item3.name = "hi!, 99, 0, 98, 0";
        int int15 = item3.quality;
        item3.quality = 96;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1", 1, (-1));
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        java.lang.String str6 = item3.name;
        int int7 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, 0, 10, 1, 1, -1" + "'", str4, "hi!, 10, 0, 10, 1, 1, -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 10, 0, 10, 1" + "'", str6, "hi!, 10, 0, 10, 1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        item3.quality = 100;
        int int8 = item3.quality;
        item3.sellIn = 32;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 1, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 50, 0");
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
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        java.lang.Class<?> wildcardClass9 = itemUpdater8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
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
        java.lang.String str44 = item33.toString();
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!, 10, 0, 9, 0" + "'", str44, "hi!, 10, 0, 9, 0");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", (int) (short) 1, (int) ' ');
        int int4 = item3.quality;
        item3.sellIn = 49;
        int int7 = item3.quality;
        java.lang.String str8 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 10, 0, 49, 32" + "'", str8, "hi!, 10, 0, 49, 32");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
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
        java.lang.String str37 = item31.toString();
        item31.quality = 96;
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!, 100, 1, -2, -1" + "'", str37, "hi!, 100, 1, -2, -1");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 9");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!", (int) (short) 100, (int) (byte) -1);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        int int14 = item12.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
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
        item8.sellIn = 30;
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
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50, 50, 97", 0, 51);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 0, -2");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 99, 9");
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
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 52, (int) (short) -1);
        item3.name = "hi!, 52, 1";
        item3.quality = ' ';
        item3.sellIn = 35;
        int int10 = item3.sellIn;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
        item41.sellIn = 0;
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
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
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
        int int40 = item39.sellIn;
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 51 + "'", int40 == 51);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
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
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory0.getInstance(", 96, 0");
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
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
        int int63 = item62.sellIn;
        com.gildedrose.Item item64 = itemUpdater12.update(item62);
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
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-3) + "'", int63 == (-3));
        org.junit.Assert.assertNotNull(item64);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
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
        java.lang.Class<?> wildcardClass19 = item13.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
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
        int int43 = item41.sellIn;
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 98 + "'", int43 == 98);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50", (int) (short) 1, (int) (short) 100);
        item3.sellIn = 10;
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ", 0, 50, 10, 100" + "'", str6, ", 0, 50, 10, 100");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 98, -2, 98, 0", (int) (short) 0, 34);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 96, 31", 0, 46);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
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
        com.gildedrose.Item item26 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str27 = item26.name;
        java.lang.String str28 = item26.name;
        java.lang.String str29 = item26.toString();
        java.lang.String str30 = item26.toString();
        int int31 = item26.quality;
        item26.name = "";
        item26.name = "hi!, 0, 0, 52, 1";
        item26.sellIn = (-3);
        int int38 = item26.quality;
        com.gildedrose.Item item39 = itemUpdater10.update(item26);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str17, "hi!, 0, 0, 52, 1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 99, 0, 52, 1" + "'", str20, "hi!, 99, 0, 52, 1");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!, 100, 1" + "'", str29, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!, 100, 1" + "'", str30, "hi!, 100, 1");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(item39);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 32, 100, 1, 49", 96, (int) (short) 0);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        item3.name = "";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 32, 100, 1, 49" + "'", str4, "hi!, 100, 1, 32, 100, 1, 49");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 100, 1, 32, 100, 1, 49, 96, 0" + "'", str5, "hi!, 100, 1, 32, 100, 1, 49, 96, 0");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
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
        item17.quality = (-3);
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
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49", (-2), (int) '4');
        com.gildedrose.Item item9 = itemUpdater4.update(item8);
        com.gildedrose.Item item13 = new com.gildedrose.Item("", (int) '4', 1);
        item13.name = "hi!, 0, 0";
        java.lang.String str16 = item13.toString();
        java.lang.String str17 = item13.toString();
        item13.name = "hi!, 98, 0";
        com.gildedrose.Item item20 = itemUpdater4.update(item13);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(item9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str16, "hi!, 0, 0, 52, 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str17, "hi!, 0, 0, 52, 1");
        org.junit.Assert.assertNotNull(item20);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
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
        item20.sellIn = 'a';
        int int26 = item20.quality;
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
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
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1, -2, -1");
        java.lang.Class<?> wildcardClass21 = itemUpdaterFactory0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 96, 99);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
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
        item57.name = ", 100, 1";
        java.lang.String str60 = item57.toString();
        item57.quality = 46;
        int int63 = item57.quality;
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
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + ", 100, 1, -4, 0" + "'", str60, ", 100, 1, -4, 0");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 46 + "'", int63 == 46);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 52, 1");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str13 = item12.name;
        java.lang.String str14 = item12.name;
        int int15 = item12.quality;
        item12.quality = (short) 10;
        java.lang.String str18 = item12.toString();
        com.gildedrose.Item item19 = itemUpdater8.update(item12);
        java.lang.Class<?> wildcardClass20 = itemUpdater8.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 100, 10" + "'", str18, "hi!, 100, 10");
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", 0, (int) (byte) 0);
        item3.name = "hi!, 100, 1";
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.name;
        java.lang.String str8 = item3.toString();
        java.lang.Class<?> wildcardClass9 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 100, 1" + "'", str7, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 100, 1, 0, 0" + "'", str8, "hi!, 100, 1, 0, 0");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) (short) 1, (int) ' ');
        java.lang.String str4 = item3.toString();
        int int5 = item3.quality;
        item3.sellIn = (-2);
        item3.quality = (-1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 1, 32" + "'", str4, ", 1, 32");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 30, 0", 46, 0);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 32");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 97, 0");
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!", (int) '4', (int) (byte) 1);
        int int11 = item10.quality;
        item10.sellIn = 31;
        com.gildedrose.Item item14 = itemUpdater6.update(item10);
        java.lang.String str15 = item14.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(item14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 30, 0" + "'", str15, "hi!, 30, 0");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
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
        item21.sellIn = 52;
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
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
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
        java.lang.String str24 = item23.name;
        java.lang.String str25 = item23.toString();
        item23.sellIn = 49;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!, 98, 0" + "'", str25, "hi!, 98, 0");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 98");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, 1, 49");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 1, 99");
        com.gildedrose.Item item8 = new com.gildedrose.Item("", 1, (int) ' ');
        java.lang.String str9 = item8.toString();
        item8.sellIn = 96;
        com.gildedrose.Item item12 = itemUpdater4.update(item8);
        item12.sellIn = (-4);
        int int15 = item12.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ", 1, 32" + "'", str9, ", 1, 32");
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 31 + "'", int15 == 31);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str7 = item6.name;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        java.lang.String str9 = item6.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 0, 0" + "'", str7, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 0, 0, -1, 0" + "'", str9, "hi!, 0, 0, -1, 0");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        int int9 = item4.sellIn;
        int int10 = item4.sellIn;
        java.lang.String str11 = item4.toString();
        java.lang.String str12 = item4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str11, "hi!, 0, 0, 99, 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str12, "hi!, 0, 0, 99, 0");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 96, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 0, 0, -2, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory11.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory11.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory11.getInstance("");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory52 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater54 = itemUpdaterFactory52.getInstance("");
        com.gildedrose.Item item58 = new com.gildedrose.Item("hi!", 100, 1);
        int int59 = item58.sellIn;
        com.gildedrose.Item item60 = itemUpdater54.update(item58);
        int int61 = item58.sellIn;
        int int62 = item58.sellIn;
        com.gildedrose.Item item63 = itemUpdater28.update(item58);
        com.gildedrose.Item item64 = itemUpdater19.update(item63);
        int int65 = item64.sellIn;
        item64.quality = 32;
        item64.quality = (short) 10;
        com.gildedrose.Item item70 = itemUpdater10.update(item64);
        item64.sellIn = 1;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
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
        org.junit.Assert.assertNotNull(itemUpdater54);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertNotNull(item60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 99 + "'", int61 == 99);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 99 + "'", int62 == 99);
        org.junit.Assert.assertNotNull(item63);
        org.junit.Assert.assertNotNull(item64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 97 + "'", int65 == 97);
        org.junit.Assert.assertNotNull(item70);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
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
        java.lang.String str41 = item35.toString();
        java.lang.String str42 = item35.toString();
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!, 100, 1, 10, 0, 31, 0" + "'", str41, "hi!, 100, 1, 10, 0, 31, 0");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!, 100, 1, 10, 0, 31, 0" + "'", str42, "hi!, 100, 1, 10, 0, 31, 0");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 31, 97", (int) (byte) 100, 48);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.name;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 0, 0, 31, 97" + "'", str5, "hi!, 0, 0, 31, 97");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
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
        item37.name = "hi!, -1, 1, 8, 30";
        int int50 = item37.quality;
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-2) + "'", int50 == (-2));
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
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
        item15.quality = (byte) 1;
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
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 10", 9, 0);
        item3.sellIn = (byte) 10;
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
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
        java.lang.Class<?> wildcardClass33 = item29.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
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
        java.lang.Class<?> wildcardClass40 = item31.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance(", 99, -1");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49, 96, 49", 52, 52);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
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
        com.gildedrose.ItemUpdater itemUpdater35 = itemUpdaterFactory33.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater37 = itemUpdaterFactory33.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater39 = itemUpdaterFactory33.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory40 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater42 = itemUpdaterFactory40.getInstance("");
        com.gildedrose.Item item46 = new com.gildedrose.Item("hi!", 100, 1);
        int int47 = item46.sellIn;
        com.gildedrose.Item item48 = itemUpdater42.update(item46);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory49 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater51 = itemUpdaterFactory49.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater53 = itemUpdaterFactory49.getInstance("");
        com.gildedrose.Item item57 = new com.gildedrose.Item("hi!", 100, 1);
        int int58 = item57.sellIn;
        com.gildedrose.Item item59 = itemUpdater53.update(item57);
        java.lang.String str60 = item57.toString();
        item57.sellIn = 10;
        java.lang.String str63 = item57.toString();
        item57.sellIn = 98;
        com.gildedrose.Item item66 = itemUpdater42.update(item57);
        com.gildedrose.Item item67 = itemUpdater39.update(item66);
        com.gildedrose.Item item68 = itemUpdater4.update(item66);
        int int69 = item68.quality;
        item68.quality = 96;
        java.lang.String str72 = item68.toString();
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
        org.junit.Assert.assertNotNull(itemUpdater39);
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(itemUpdater51);
        org.junit.Assert.assertNotNull(itemUpdater53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertNotNull(item59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!, 99, 0" + "'", str60, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!, 10, 0" + "'", str63, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item66);
        org.junit.Assert.assertNotNull(item67);
        org.junit.Assert.assertNotNull(item68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!, 95, 96" + "'", str72, "hi!, 95, 96");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 100, 52", 50, (-3));
        item3.sellIn = (short) 10;
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        int int4 = item3.sellIn;
        item3.name = "hi!, 100, 1";
        int int7 = item3.sellIn;
        item3.name = "";
        java.lang.Class<?> wildcardClass10 = item3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
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
        java.lang.String str22 = item20.name;
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!, -1, 0" + "'", str22, "hi!, -1, 0");
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, -1", (-2), 49);
        int int4 = item3.quality;
        item3.quality = 97;
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 100, -1, -2, 97" + "'", str7, "hi!, 100, -1, -2, 97");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
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
        int int27 = item17.sellIn;
        java.lang.String str28 = item17.toString();
        item17.sellIn = 32;
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!, 97, 0" + "'", str28, "hi!, 97, 0");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
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
        item8.quality = ' ';
        java.lang.String str21 = item8.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 1, 32" + "'", str21, "hi!, 1, 32");
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, -1, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory11.getInstance("hi!, -1, 0");
        com.gildedrose.Item item19 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str20 = item19.name;
        java.lang.String str21 = item19.toString();
        com.gildedrose.Item item22 = itemUpdater15.update(item19);
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
        int int40 = item31.sellIn;
        com.gildedrose.Item item41 = itemUpdater15.update(item31);
        item41.quality = (byte) 0;
        java.lang.String str44 = item41.name;
        com.gildedrose.Item item45 = itemUpdater10.update(item41);
        java.lang.Class<?> wildcardClass46 = item41.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater13);
        org.junit.Assert.assertNotNull(itemUpdater15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!, 0, 0" + "'", str20, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str21, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(itemUpdater25);
        org.junit.Assert.assertNotNull(itemUpdater27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(item33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!, 99, 0" + "'", str34, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!, 10, 0" + "'", str37, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 98 + "'", int40 == 98);
        org.junit.Assert.assertNotNull(item41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
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
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 1, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 52, 32, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, -1, 52");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory15 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory15.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory15.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item27 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str28 = item27.name;
        int int29 = item27.sellIn;
        com.gildedrose.Item item30 = itemUpdater23.update(item27);
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory31 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater33 = itemUpdaterFactory31.getInstance("");
        com.gildedrose.Item item37 = new com.gildedrose.Item("hi!", 100, 1);
        int int38 = item37.sellIn;
        com.gildedrose.Item item39 = itemUpdater33.update(item37);
        int int40 = item37.sellIn;
        int int41 = item37.sellIn;
        int int42 = item37.quality;
        java.lang.String str43 = item37.name;
        com.gildedrose.Item item44 = itemUpdater23.update(item37);
        com.gildedrose.Item item45 = itemUpdater14.update(item37);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!, 0, 0" + "'", str28, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertNotNull(itemUpdater33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(item39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 99 + "'", int40 == 99);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 99 + "'", int41 == 99);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(item44);
        org.junit.Assert.assertNotNull(item45);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 32, 100", (int) (short) 1, 49);
        java.lang.String str4 = item3.toString();
        int int5 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 100, 1, 32, 100, 1, 49" + "'", str4, "hi!, 100, 1, 32, 100, 1, 49");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 0, 1, -2, -1", 98, (int) '4');
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0, 0, 1, -2, -1" + "'", str4, "hi!, 0, 0, 0, 1, -2, -1");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 48, 47", 8, (int) '4');
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', 1);
        item3.name = "hi!, 0, 0";
        int int6 = item3.sellIn;
        java.lang.String str7 = item3.name;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 0, 0" + "'", str7, "hi!, 0, 0");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0, -1, 0", 0, 51);
        int int4 = item3.sellIn;
        item3.quality = (byte) -1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 10, 0", (int) (short) -1, 34);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
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
        java.lang.String str21 = item14.toString();
        java.lang.String str22 = item14.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater5);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, -2, 0" + "'", str21, "hi!, -2, 0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 98, 0", 31, (int) ' ');
        item3.name = "hi!";
        java.lang.String str6 = item3.name;
        item3.name = "hi!, 0, 0, 98, 34";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 52", 31, (int) (short) -1);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
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
        item11.sellIn = 32;
        int int21 = item11.quality;
        int int22 = item11.quality;
        int int23 = item11.quality;
        java.lang.String str24 = item11.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0" + "'", str4, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!, -1, 1", (int) ' ', (int) ' ');
        item10.sellIn = (byte) 10;
        com.gildedrose.Item item13 = itemUpdater6.update(item10);
        item13.name = "hi!, 10, 50";
        item13.sellIn = (-1);
        int int18 = item13.sellIn;
        item13.name = "hi!, 52, 32";
        java.lang.String str21 = item13.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!, 52, 32" + "'", str21, "hi!, 52, 32");
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (int) ' ', 100);
        item3.sellIn = 52;
        int int6 = item3.quality;
        item3.name = "hi!, 0, 0, 99, 0, 1, 1";
        java.lang.String str9 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 0, 0, 99, 0, 1, 1, 52, 100" + "'", str9, "hi!, 0, 0, 99, 0, 1, 1, 52, 100");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
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
        item22.sellIn = 95;
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
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, -2, 50", 1, 96);
        int int13 = item12.sellIn;
        com.gildedrose.Item item14 = itemUpdater2.update(item12);
        item12.name = "hi!, -1, 0, 1, 9";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(item14);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
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
        item87.name = "hi!, 100, 1";
        item87.name = "hi!, 1, 0, 32, 99";
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
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item6 = new com.gildedrose.Item("hi!", 100, 1);
        int int7 = item6.sellIn;
        com.gildedrose.Item item8 = itemUpdater2.update(item6);
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, -1, 0", 0, (int) (byte) 0);
        com.gildedrose.Item item13 = itemUpdater2.update(item12);
        item13.quality = (short) -1;
        java.lang.String str16 = item13.toString();
        item13.name = ", 10, 10, 99, 0";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, -1, 0, -1, -1" + "'", str16, "hi!, -1, 0, -1, -1");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0, 0, 52", 100, 0);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
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
        int int49 = item42.sellIn;
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 9 + "'", int49 == 9);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 10, 10");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 51, 34");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 10, 50");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory9.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory9.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory9.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory9.getInstance("hi!, 10, 0, 10, 1, 1, -1, 52, 52");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory9.getInstance("hi!, 100, 1, 51, 34");
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory9.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.Item item31 = new com.gildedrose.Item("hi!", (int) '4', (int) (byte) 1);
        com.gildedrose.Item item32 = itemUpdater27.update(item31);
        int int33 = item31.sellIn;
        int int34 = item31.quality;
        com.gildedrose.Item item35 = itemUpdater8.update(item31);
        item35.name = "hi!, -4, 0";
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
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 51 + "'", int33 == 51);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(item35);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
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
        java.lang.String str72 = item70.toString();
        item70.sellIn = (-2);
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
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!, -4, 0" + "'", str72, "hi!, -4, 0");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", (int) (short) 1, (int) ' ');
        item3.sellIn = (-1);
        java.lang.String str6 = item3.name;
        java.lang.String str7 = item3.name;
        item3.name = "hi!, -1, 0, -1, -1";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 10, 0" + "'", str6, "hi!, 10, 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 10, 0" + "'", str7, "hi!, 10, 0");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
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
        int int39 = item38.sellIn;
        item38.quality = 10;
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 96 + "'", int39 == 96);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1", (int) (byte) 10, 98);
        java.lang.String str4 = item3.toString();
        item3.quality = (short) 1;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, 0, 10, 1, 10, 98" + "'", str4, "hi!, 10, 0, 10, 1, 10, 98");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", 52, (int) (short) 10);
        int int4 = item3.sellIn;
        java.lang.String str5 = item3.toString();
        item3.quality = (byte) 100;
        int int8 = item3.quality;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 10, 0, 52, 10" + "'", str5, "hi!, 10, 0, 52, 10");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) ' ', (int) (byte) 0);
        java.lang.String str4 = item3.name;
        int int5 = item3.sellIn;
        java.lang.String str6 = item3.name;
        item3.quality = 1;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0" + "'", str4, "hi!, 0, 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 0, 0" + "'", str6, "hi!, 0, 0");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -3, 49", 9, (-2));
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -3, 49, 9, -2" + "'", str4, "hi!, -3, 49, 9, -2");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
        java.lang.String str18 = item14.toString();
        int int19 = item14.sellIn;
        item14.quality = (-1);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(item14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!, 100, 52, 8, 50" + "'", str18, "hi!, 100, 52, 8, 50");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
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
        java.lang.String str78 = item65.toString();
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
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!, 51, 0, 97, 0" + "'", str78, "hi!, 51, 0, 97, 0");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 8, 0", 97, 10);
        java.lang.String str4 = item3.name;
        item3.quality = ' ';
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 8, 0" + "'", str4, "hi!, 8, 0");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
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
        int int28 = item15.quality;
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 50 + "'", int28 == 50);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 50, 49, -2, 52", 52, 95);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) '4', 10);
        java.lang.String str4 = item3.name;
        item3.sellIn = 97;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 0" + "'", str4, "hi!, -1, 0");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 100, 1", (int) '4', (int) '#');
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        java.lang.String str14 = item13.name;
        java.lang.String str15 = item13.toString();
        int int16 = item13.sellIn;
        item13.name = "hi!, 9, 0";
        item13.quality = (-4);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 100, 1" + "'", str14, "hi!, 100, 1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!, 100, 1, 51, 34" + "'", str15, "hi!, 100, 1, 51, 34");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -1, 1, 10, 32");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 10, 50");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory9 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater11 = itemUpdaterFactory9.getInstance("");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory12 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory12.getInstance("");
        com.gildedrose.Item item20 = new com.gildedrose.Item("hi!", 100, 1);
        int int21 = item20.sellIn;
        com.gildedrose.Item item22 = itemUpdater16.update(item20);
        com.gildedrose.Item item23 = itemUpdater11.update(item22);
        int int24 = item23.sellIn;
        int int25 = item23.quality;
        com.gildedrose.Item item26 = itemUpdater8.update(item23);
        item26.quality = 50;
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 98 + "'", int24 == 98);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(item26);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50", 10, (int) ' ');
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 0, 50, 10, 32" + "'", str4, ", 0, 50, 10, 32");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
        int int26 = item15.quality;
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
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
        item18.quality = (byte) 10;
        item18.quality = (short) 100;
        int int24 = item18.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(item19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 52, 1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, -2, 46");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 100, -1");
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
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 51, 0", (-2), 31);
        item3.sellIn = 49;
        java.lang.Class<?> wildcardClass6 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 100, 1", (int) (short) 0, 96);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance(", 0, 50, 1, 100, -1, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 100, 9);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 98, 0, 96, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance(", 100, 1, -4, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
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
        item13.sellIn = (-4);
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
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0, 50, 0", (int) (short) 100, 34);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
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
        java.lang.Class<?> wildcardClass15 = item6.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
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
        int int36 = item31.quality;
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
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
        int int40 = item36.quality;
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
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
        java.lang.Class<?> wildcardClass50 = item49.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
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
        item10.quality = 0;
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
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50, 1, 100, 99, 0", (int) (byte) 100, 99);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        java.lang.String str9 = item4.toString();
        item4.sellIn = 34;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str9, "hi!, 0, 0, 99, 0");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        item3.name = "hi!, 10, 0";
        item3.name = "hi!, -1, 1";
        item3.sellIn = 95;
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
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
        java.lang.Class<?> wildcardClass33 = item32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (short) 0, 52);
        int int4 = item3.sellIn;
        item3.name = "hi!, 10, 50";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 98, 0");
        com.gildedrose.Item item8 = new com.gildedrose.Item("hi!, 0, 0, 99, 0", (-1), 52);
        int int9 = item8.quality;
        java.lang.String str10 = item8.name;
        com.gildedrose.Item item11 = itemUpdater4.update(item8);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str10, "hi!, 0, 0, 99, 0");
        org.junit.Assert.assertNotNull(item11);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 32, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 98");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, -1, 50");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, -1, 1, 9, 31");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item22 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str23 = item22.name;
        java.lang.String str24 = item22.name;
        java.lang.String str25 = item22.name;
        item22.sellIn = (-1);
        java.lang.String str28 = item22.toString();
        int int29 = item22.quality;
        com.gildedrose.Item item30 = itemUpdater18.update(item22);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
        org.junit.Assert.assertNotNull(itemUpdater16);
        org.junit.Assert.assertNotNull(itemUpdater18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!, -1, 1" + "'", str28, "hi!, -1, 1");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(item30);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
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
        com.gildedrose.Item item26 = new com.gildedrose.Item("hi!, 100, 1, 51, 34", (-2), 99);
        int int27 = item26.sellIn;
        com.gildedrose.Item item28 = itemUpdater16.update(item26);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertNotNull(item28);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.name;
        java.lang.String str6 = item3.name;
        item3.name = "hi!, 100, 52";
        item3.sellIn = ' ';
        java.lang.String str11 = item3.toString();
        java.lang.String str12 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 100, 52, 32, 1" + "'", str11, "hi!, 100, 52, 32, 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!, 100, 52, 32, 1" + "'", str12, "hi!, 100, 52, 32, 1");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 100, 0", 96, 49);
        item3.name = "hi!, -3, 0";
        int int6 = item3.quality;
        java.lang.String str7 = item3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, -3, 0, 96, 49" + "'", str7, "hi!, -3, 0, 96, 49");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', (int) (byte) 1);
        item3.quality = (short) 1;
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
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
        java.lang.Class<?> wildcardClass76 = item75.getClass();
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
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
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
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory62 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater64 = itemUpdaterFactory62.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater66 = itemUpdaterFactory62.getInstance("");
        com.gildedrose.Item item70 = new com.gildedrose.Item("hi!", 100, 1);
        int int71 = item70.sellIn;
        com.gildedrose.Item item72 = itemUpdater66.update(item70);
        java.lang.String str73 = item70.toString();
        item70.sellIn = 10;
        java.lang.String str76 = item70.toString();
        item70.sellIn = 98;
        item70.sellIn = (byte) 10;
        com.gildedrose.Item item81 = itemUpdater42.update(item70);
        int int82 = item70.quality;
        java.lang.String str83 = item70.toString();
        com.gildedrose.Item item84 = itemUpdater6.update(item70);
        item70.quality = 0;
        int int87 = item70.sellIn;
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
        org.junit.Assert.assertNotNull(itemUpdater42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertNotNull(itemUpdater51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(item57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!, 0, 0" + "'", str60, "hi!, 0, 0");
        org.junit.Assert.assertNotNull(item61);
        org.junit.Assert.assertNotNull(itemUpdater64);
        org.junit.Assert.assertNotNull(itemUpdater66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 100 + "'", int71 == 100);
        org.junit.Assert.assertNotNull(item72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!, 99, 0" + "'", str73, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!, 10, 0" + "'", str76, "hi!, 10, 0");
        org.junit.Assert.assertNotNull(item81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!, 9, 0" + "'", str83, "hi!, 9, 0");
        org.junit.Assert.assertNotNull(item84);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 8 + "'", int87 == 8);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 10, 99);
        item3.quality = 0;
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 51, 0", (-2), 31);
        item3.quality = 98;
        java.lang.String str6 = item3.name;
        item3.name = "hi!, 100, 1, 10, 0, 31, 0";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 0, 0, 51, 0" + "'", str6, "hi!, 0, 0, 51, 0");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 100, 1, -2, -1");
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
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, -1", 8, (int) (byte) 10);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, -1" + "'", str4, "hi!, -1, -1");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
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
        int int58 = item56.quality;
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
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
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
        int int24 = item21.quality;
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!, -1, 52" + "'", str26, "hi!, -1, 52");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
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
        int int68 = item56.quality;
        java.lang.String str69 = item56.name;
        int int70 = item56.sellIn;
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
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 97, 50", 34, 34);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
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
        item18.sellIn = (short) 10;
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
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 51, 0");
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!, -1, 1", (int) ' ', (int) ' ');
        item10.sellIn = (byte) 10;
        com.gildedrose.Item item13 = itemUpdater6.update(item10);
        int int14 = item10.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, 98);
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        item13.name = "hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, -3";
        item13.quality = 96;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, -2, 98");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 98, -2");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 99, 0, 0, 10");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 1, 1");
        com.gildedrose.Item item16 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str17 = item16.name;
        java.lang.String str18 = item16.name;
        int int19 = item16.quality;
        item16.sellIn = 10;
        item16.name = "hi!, 10, 0";
        com.gildedrose.Item item24 = itemUpdater12.update(item16);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(item24);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
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
        java.lang.String str17 = item8.toString();
        int int18 = item8.sellIn;
        int int19 = item8.quality;
        item8.name = "hi!, 100, 1, 9, 1, 100, 1";
        item8.quality = 35;
        int int24 = item8.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 99, 0" + "'", str11, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!, 10, 0" + "'", str14, "hi!, 10, 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 1, 0" + "'", str17, "hi!, 1, 0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 98, 50", 34, (int) (short) -1);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        java.lang.Class<?> wildcardClass13 = itemUpdaterFactory0.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 51, 50", (int) '#', 99);
        item3.name = "hi!, -1, 1, 98, 0";
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, -1", 50, 100);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
        int int83 = item79.sellIn;
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
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-3) + "'", int83 == (-3));
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
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
        int int16 = item6.quality;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!, 10, 0" + "'", str13, "hi!, 10, 0");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
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
        int int41 = item36.quality;
        item36.quality = (-4);
        int int44 = item36.sellIn;
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-2) + "'", int44 == (-2));
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        item3.name = "hi!, 10, 0";
        item3.name = "hi!, -1, 1";
        item3.quality = (byte) 0;
        item3.name = ", 0, 50, 1, 100, -1, 100";
        java.lang.String str12 = item3.name;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ", 0, 50, 1, 100, -1, 100" + "'", str12, ", 0, 50, 1, 100, -1, 100");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!", 100, 1);
        item3.sellIn = 99;
        int int6 = item3.sellIn;
        item3.quality = 96;
        item3.quality = 35;
        item3.quality = (byte) 10;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6 == 99);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0", 98, 99);
        int int4 = item3.quality;
        item3.sellIn = ' ';
        item3.sellIn = 35;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", (int) '4', 1);
        item3.name = "hi!, 0, 0";
        java.lang.String str6 = item3.toString();
        java.lang.String str7 = item3.toString();
        item3.sellIn = (short) -1;
        java.lang.String str10 = item3.name;
        java.lang.String str11 = item3.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str6, "hi!, 0, 0, 52, 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!, 0, 0, 52, 1" + "'", str7, "hi!, 0, 0, 52, 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 0, 0" + "'", str10, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 0, 0" + "'", str11, "hi!, 0, 0");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        java.lang.Class<?> wildcardClass7 = itemUpdater6.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        java.lang.String str6 = item3.name;
        item3.name = "hi!, -1, 0";
        item3.quality = 49;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 99, 0" + "'", str6, "hi!, 99, 0");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance(", 0, 50, 10, -1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory11.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory11.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory11.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.Item item25 = new com.gildedrose.Item("", (int) '4', 1);
        com.gildedrose.Item item26 = itemUpdater21.update(item25);
        int int27 = item26.sellIn;
        int int28 = item26.sellIn;
        com.gildedrose.Item item29 = itemUpdater10.update(item26);
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
        org.junit.Assert.assertNotNull(item26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 51 + "'", int27 == 51);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 51 + "'", int28 == 51);
        org.junit.Assert.assertNotNull(item29);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
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
        item41.sellIn = 48;
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
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 98, 0", 50, 32);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 98, 0" + "'", str4, "hi!, 98, 0");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 1, 32, 99, -1", 51, (int) (short) 1);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -3, 49", 9, (-2));
        int int4 = item3.quality;
        item3.quality = 49;
        item3.quality = (short) 100;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -2, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance(", -1, 9");
        com.gildedrose.ItemUpdater itemUpdater16 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 98, 0");
        com.gildedrose.ItemUpdater itemUpdater18 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100");
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
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0, 1, 9", 1, 35);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
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
        com.gildedrose.Item item80 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.gildedrose.Item item81 = itemUpdater2.update(item80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, -1, 1");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!, 99, 0, 50, 0", 1, (int) 'a');
        com.gildedrose.Item item13 = itemUpdater8.update(item12);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item13);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 99", 35, (int) (short) 1);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0, -2, 0", 31, (-3));
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
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
        int int14 = item6.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 1, 100, 0", 49, (int) ' ');
        item3.sellIn = (short) 1;
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50, 1, 100, 99, 0", 49, 49);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 0, 50, 1, 100, 99, 0" + "'", str4, ", 0, 50, 1, 100, 99, 0");
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 0, 1");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 52, 0, 30, 1");
        com.gildedrose.Item item12 = new com.gildedrose.Item("hi!", 100, 1);
        item12.sellIn = 99;
        item12.name = "";
        item12.quality = 'a';
        com.gildedrose.Item item19 = itemUpdater8.update(item12);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item19);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
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
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item4.name = "hi!, 0, 0";
        java.lang.String str9 = item4.toString();
        java.lang.String str10 = item4.name;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!, 0, 0, 99, 0" + "'", str9, "hi!, 0, 0, 99, 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!, 0, 0" + "'", str10, "hi!, 0, 0");
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
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
        java.lang.Class<?> wildcardClass43 = itemUpdater4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance(", 0, 50");
        java.lang.Class<?> wildcardClass5 = itemUpdaterFactory0.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
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
        int int33 = item23.sellIn;
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2) + "'", int33 == (-2));
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 9", 0, 32);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
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
        item23.sellIn = 51;
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
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
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
        java.lang.String str50 = item30.toString();
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!, 10, 0, 10, 1, 1, -1, 52, 100, 9, 0" + "'", str50, "hi!, 10, 0, 10, 1, 1, -1, 52, 100, 9, 0");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
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
        item14.quality = (-2);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertNotNull(item21);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -2, 50", 96, (int) (byte) 100);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
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
        item16.name = "hi!, 0, 0, 99, 0, 50, 49";
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertNotNull(item16);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", (int) (byte) 0, (int) '4');
        item3.sellIn = (byte) 100;
        java.lang.String str6 = item3.name;
        item3.quality = (byte) -1;
        int int9 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 99, 0" + "'", str6, "hi!, 99, 0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance(", 0, 50, 10, -1");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory15 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory15.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater21 = itemUpdaterFactory15.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater23 = itemUpdaterFactory15.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater25 = itemUpdaterFactory15.getInstance("hi!, 100, 1, 32, 100");
        com.gildedrose.ItemUpdater itemUpdater27 = itemUpdaterFactory15.getInstance("hi!, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater29 = itemUpdaterFactory15.getInstance("hi!, -3, 0");
        com.gildedrose.Item item33 = new com.gildedrose.Item("hi!", 100, 1);
        java.lang.String str34 = item33.name;
        java.lang.String str35 = item33.name;
        java.lang.String str36 = item33.name;
        com.gildedrose.Item item37 = itemUpdater29.update(item33);
        com.gildedrose.Item item38 = itemUpdater14.update(item37);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(item37);
        org.junit.Assert.assertNotNull(item38);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
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
        item67.quality = 9;
        java.lang.String str70 = item67.toString();
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
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!, 96, 9" + "'", str70, "hi!, 96, 9");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 31, (int) (short) 100);
        item3.name = "hi!, 0, 0, 52, 1";
        item3.sellIn = (byte) 1;
        item3.name = "hi!, 0, 0, 52, 1, 99, 0";
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
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
        item28.sellIn = 10;
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
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        item6.sellIn = 1;
        item6.sellIn = 32;
        item6.sellIn = (byte) 10;
        java.lang.Class<?> wildcardClass13 = item6.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.Item item10 = new com.gildedrose.Item("hi!, 1, 0, 98, 99", 32, (-2));
        java.lang.String str11 = item10.toString();
        item10.sellIn = 96;
        com.gildedrose.Item item14 = itemUpdater6.update(item10);
        com.gildedrose.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.gildedrose.Item item16 = itemUpdater6.update(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!, 1, 0, 98, 99, 32, -2" + "'", str11, "hi!, 1, 0, 98, 99, 32, -2");
        org.junit.Assert.assertNotNull(item14);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
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
        item18.quality = '4';
        int int21 = item18.sellIn;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.Item item12 = new com.gildedrose.Item(", 0, 50", 50, 97);
        item12.sellIn = 50;
        com.gildedrose.Item item15 = itemUpdater8.update(item12);
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(item15);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!, 100, 1");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, -4, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 32, 100, 1, 49, 35, -2");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", -1, 9, 97, -2", 46, (int) '4');
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0, 99, 0, 48, 47", 0, 34);
        item3.sellIn = 48;
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
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
        int int97 = item88.quality;
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
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 50 + "'", int97 == 50);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
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
        java.lang.Class<?> wildcardClass57 = item52.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0, 10, 1, 1, -1, 52, 100", (int) 'a', (int) 'a');
        java.lang.String str4 = item3.toString();
        java.lang.String str5 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, 0, 10, 1, 1, -1, 52, 100, 97, 97" + "'", str4, "hi!, 10, 0, 10, 1, 1, -1, 52, 100, 97, 97");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 10, 0, 10, 1, 1, -1, 52, 100, 97, 97" + "'", str5, "hi!, 10, 0, 10, 1, 1, -1, 52, 100, 97, 97");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 9, 0");
        com.gildedrose.Item item14 = new com.gildedrose.Item("hi!, 100, 1", 100, (int) (short) 0);
        com.gildedrose.Item item15 = itemUpdater10.update(item14);
        item14.quality = 0;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 10, 0", 48, (int) (short) -1);
        java.lang.String str4 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 10, 0, 48, -1" + "'", str4, "hi!, 10, 0, 48, -1");
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
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
        item15.quality = 1;
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
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 52, 0", 31, (-3));
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
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
        java.lang.Class<?> wildcardClass50 = item49.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
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
        java.lang.String str16 = item6.name;
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(item8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 1, 32, 98, 0", (int) ' ', 1);
        java.lang.String str4 = item3.name;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 1, 32, 98, 0" + "'", str4, ", 1, 32, 98, 0");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
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
        item20.quality = 100;
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
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 51, 0", 1, 97);
        item3.name = "hi!, -2, 50";
        item3.quality = 50;
        java.lang.String str8 = item3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, -2, 50, 1, 50" + "'", str8, "hi!, -2, 50, 1, 50");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
        java.lang.Class<?> wildcardClass22 = item15.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!, 100, 1" + "'", str17, "hi!, 100, 1");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 99, 0", 0, (int) (byte) 10);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        item3.quality = 10;
        java.lang.String str8 = item3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 99, 0" + "'", str4, "hi!, 99, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 99, 0, 0, 10" + "'", str5, "hi!, 99, 0, 0, 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!, 99, 0, 0, 10" + "'", str8, "hi!, 99, 0, 0, 10");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
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
        java.lang.String str31 = item30.name;
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!, 99, 0" + "'", str31, "hi!, 99, 0");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 100, 52");
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
        java.lang.String str57 = item56.name;
        com.gildedrose.Item item58 = itemUpdater8.update(item56);
        item56.quality = 0;
        item56.quality = (byte) 10;
        int int63 = item56.sellIn;
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
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(item58);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 98 + "'", int63 == 98);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 97, 0");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory11 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater13 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater15 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater17 = itemUpdaterFactory11.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater19 = itemUpdaterFactory11.getInstance("");
        com.gildedrose.Item item23 = new com.gildedrose.Item("hi!, 52, 1", 50, 0);
        com.gildedrose.Item item24 = itemUpdater19.update(item23);
        com.gildedrose.Item item25 = itemUpdater10.update(item24);
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
        org.junit.Assert.assertNotNull(item25);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
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
        java.lang.Class<?> wildcardClass24 = itemUpdater10.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
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
        java.lang.String str26 = item25.toString();
        item25.name = "hi!, 0, 0, 99, 0, 1, 1";
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ", -1, 48" + "'", str26, ", -1, 48");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
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
        int int59 = item53.quality;
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
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 50 + "'", int59 == 50);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
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
        item11.sellIn = 32;
        int int21 = item11.quality;
        int int22 = item11.quality;
        java.lang.String str23 = item11.toString();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!, 32, 0" + "'", str23, "hi!, 32, 0");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 0");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0, 49, 48");
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
        com.gildedrose.Item item36 = itemUpdater12.update(item32);
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
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        com.gildedrose.ConjuredItemUpdater conjuredItemUpdater0 = new com.gildedrose.ConjuredItemUpdater();
        com.gildedrose.Item item4 = new com.gildedrose.Item("hi!", 100, 1);
        int int5 = item4.sellIn;
        com.gildedrose.Item item6 = conjuredItemUpdater0.update(item4);
        int int7 = item4.quality;
        java.lang.String str8 = item4.name;
        java.lang.String str9 = item4.name;
        item4.name = "hi!, 100, 1, 35, 0";
        item4.name = "hi!, 0, 0, 52, 0";
        item4.quality = 1;
        java.lang.String str16 = item4.name;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(item6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!, 0, 0, 52, 0" + "'", str16, "hi!, 0, 0, 52, 0");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 10", 96, (int) (short) -1);
        item3.quality = 0;
        java.lang.String str6 = item3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!, 100, 10, 96, 0" + "'", str6, "hi!, 100, 10, 96, 0");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 0", (int) '4', 10);
        java.lang.String str4 = item3.name;
        java.lang.Class<?> wildcardClass5 = item3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, -1, 0" + "'", str4, "hi!, -1, 0");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 9, 34");
        java.lang.Class<?> wildcardClass7 = itemUpdater6.getClass();
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        com.gildedrose.Item item3 = new com.gildedrose.Item(", 0, 50", (int) (short) 1, (int) (short) 100);
        java.lang.String str4 = item3.toString();
        item3.quality = (byte) 100;
        item3.name = "hi!, 1, 0, 98, 8";
        item3.sellIn = 52;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", 0, 50, 1, 100" + "'", str4, ", 0, 50, 1, 100");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        com.gildedrose.ItemUpdaterFactory itemUpdaterFactory0 = new com.gildedrose.ItemUpdaterFactory();
        com.gildedrose.ItemUpdater itemUpdater2 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater4 = itemUpdaterFactory0.getInstance("");
        com.gildedrose.ItemUpdater itemUpdater6 = itemUpdaterFactory0.getInstance("hi!, 0, 0, 99, 0");
        com.gildedrose.ItemUpdater itemUpdater8 = itemUpdaterFactory0.getInstance("hi!, 0, 0");
        com.gildedrose.ItemUpdater itemUpdater10 = itemUpdaterFactory0.getInstance("hi!, 100, 1, 9, 1");
        com.gildedrose.ItemUpdater itemUpdater12 = itemUpdaterFactory0.getInstance(", 52, 1");
        com.gildedrose.ItemUpdater itemUpdater14 = itemUpdaterFactory0.getInstance("hi!, 10, 0, 10, 1, 1, -1, 52, 52, 0, 9, 100, 0");
        org.junit.Assert.assertNotNull(itemUpdater2);
        org.junit.Assert.assertNotNull(itemUpdater4);
        org.junit.Assert.assertNotNull(itemUpdater6);
        org.junit.Assert.assertNotNull(itemUpdater8);
        org.junit.Assert.assertNotNull(itemUpdater10);
        org.junit.Assert.assertNotNull(itemUpdater12);
        org.junit.Assert.assertNotNull(itemUpdater14);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 100, 52, 32, 1", (int) (short) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = item3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, -1, 1, 10, 32", (-3), 34);
        item3.sellIn = '#';
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 0, 0", (int) (short) 0, (int) (byte) 1);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        int int6 = item3.quality;
        item3.name = "hi!, -2, 50, 0, 50";
        item3.name = "hi!, 99, 0, 100, 52";
        int int11 = item3.sellIn;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 0, 0" + "'", str4, "hi!, 0, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 0, 0, 0, 1" + "'", str5, "hi!, 0, 0, 0, 1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
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
        java.lang.String str26 = item15.toString();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!, 100, -1, 10, 100, -2, 0" + "'", str26, "hi!, 100, -1, 10, 100, -2, 0");
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
        com.gildedrose.ItemUpdater itemUpdater20 = itemUpdaterFactory0.getInstance("hi!, 52, 1, 31, 49");
        com.gildedrose.ItemUpdater itemUpdater22 = itemUpdaterFactory0.getInstance("hi!, 98, 0");
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
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        com.gildedrose.Item item3 = new com.gildedrose.Item("", 1, (int) ' ');
        int int4 = item3.quality;
        int int5 = item3.sellIn;
        item3.sellIn = 8;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 1, 0", 98, 99);
        java.lang.String str4 = item3.name;
        java.lang.String str5 = item3.toString();
        item3.quality = 48;
        int int8 = item3.quality;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!, 1, 0" + "'", str4, "hi!, 1, 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!, 1, 0, 98, 99" + "'", str5, "hi!, 1, 0, 98, 99");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
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
        item42.name = "hi!, 0, 0, 31, 0";
        int int46 = item42.quality;
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        com.gildedrose.Item item3 = new com.gildedrose.Item("hi!, 97, 35", (int) (short) 10, (int) (byte) -1);
    }
}

