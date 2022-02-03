package com.gildedrose;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ItemUpdaterTest {

//    @ParameterizedTest(name = "Factory should return a {1}")
//    @MethodSource("itemUpdaterMappings")
//    void factoryShouldReturnProperItemUpdater(String itemName, Class clazz) {
//        Item item = new Item(itemName, 0, 0);
//
//        ItemUpdater itemUpdater = ItemUpdater.getInstance(itemName);
//
//        assertThat(itemUpdater).isExactlyInstanceOf(clazz);
//    }

    static Stream<Arguments> itemUpdaterMappings() {
        return Stream.of(
                arguments("Sulfuras, Hand of Ragnaros", SulfurasUpdater.class),
                arguments("Aged Brie", AgedBrieUpdater.class),
                arguments("Backstage passes to a TAFKAL80ETC concert", BackstagePassUpdater.class),
                arguments("Conjured Mana Cake", ConjuredItemUpdater.class),
                arguments("Anything Else", CommonItemUpdater.class)
        );
    }
}
