package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.ZipUtils
 *
 * @author Diffblue Cover
 */

class ZipUtilsTest {

    @Test
    void zip() {
        ArrayList<ZipUtils.ZipItem> source = new ArrayList<ZipUtils.ZipItem>();
        source.add(new ZipUtils.ZipItem("10007", "10007"));
        byte[] result = ZipUtils.zip(source);
    }

    @Test
    void zipSourceIsEmpty() {
        assertArrayEquals(new byte[] { 80, 75, 5, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, ZipUtils.zip(new ArrayList<ZipUtils.ZipItem>()));
    }

    @Test
    void unzipSourceIsOne() {

        // arrange
        byte[] source = new byte[] { 1 };

        // act
        ZipUtils.UnZipResult result = ZipUtils.unzip(source);

        // assert
        assertThat(result.getMetaDataItem(), is(nullValue()));
        assertThat(result.getZipItemList(), empty());
    }
}
