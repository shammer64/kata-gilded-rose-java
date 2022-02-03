package com.gildedrose;

import java.util.HashMap;
import java.util.Map;

public class ItemUpdaterFactory {

    private static final Map<String, Class> CLASS_MAP = new HashMap<>();
    private static final Map<String, ItemUpdater> INSTANCE_MAP = new HashMap<>();
    private static final ItemUpdater DEFAULT_INSTANCE = new CommonItemUpdater();

    static {
        CLASS_MAP.put("Aged Brie", AgedBrieUpdater.class);
        CLASS_MAP.put("Backstage passes to a TAFKAL80ETC concert", BackstagePassUpdater.class);
        CLASS_MAP.put("Sulfuras, Hand of Ragnaros", SulfurasUpdater.class);
        CLASS_MAP.put("Conjured Mana Cake", ConjuredItemUpdater.class);
        INSTANCE_MAP.put("Aged Brie", new AgedBrieUpdater());
        INSTANCE_MAP.put("Backstage passes to a TAFKAL80ETC concert", new BackstagePassUpdater());
        INSTANCE_MAP.put("Sulfuras, Hand of Ragnaros", new SulfurasUpdater());
        INSTANCE_MAP.put("Conjured Mana Cake", new ConjuredItemUpdater());
    }

    public static ItemUpdater getInstance(String itemName) {
        return INSTANCE_MAP.getOrDefault(itemName, DEFAULT_INSTANCE);
    }

//    @Deprecated
//    public static ItemUpdater getInstance(Item item) {
//        ItemUpdater itemUpdater = null;
//        try {
//            Class updaterClass = CLASS_MAP.getOrDefault(item.name, CommonItemUpdater.class);
//            itemUpdater = (ItemUpdater) updaterClass.getDeclaredConstructor(Item.class).newInstance(item);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return itemUpdater;
//    }
}
