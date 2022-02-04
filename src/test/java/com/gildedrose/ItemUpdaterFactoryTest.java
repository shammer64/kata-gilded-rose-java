package com.gildedrose;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ItemUpdaterFactoryTest {

    private ItemUpdaterFactory itemUpdaterFactory;

    @BeforeEach
    void setUp() {
        itemUpdaterFactory = new ItemUpdaterFactory();
    }

    @ParameterizedTest(name = "Factory should return a {1}")
    @MethodSource("itemUpdaterMappings")
    void factoryShouldReturnProperItemUpdater(String itemName, Class clazz) {
        assertThat(itemUpdaterFactory.getInstance(itemName))
                .isExactlyInstanceOf(clazz);
    }

    static Stream<Arguments> itemUpdaterMappings() {
        return Stream.of(
                arguments("Sulfuras, Hand of Ragnaros", SulfurasItemUpdater.class),
                arguments("Aged Brie", AgedBrieItemUpdater.class),
                arguments("Backstage passes to a TAFKAL80ETC concert", BackstagePassItemUpdater.class),
                arguments("Conjured Mana Cake", ConjuredItemUpdater.class),
                arguments("Anything Else", CommonItemUpdater.class)
        );
    }
}

