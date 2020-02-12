package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.ZipUtils
 *
 * @author Diffblue JCover
 */

public class ZipUtilsDiffblueTest {

    @Test(timeout=10000)
    public void unzipSourceIsOne() {
        byte[] source = new byte[] { 1 };
        ZipUtils.UnZipResult result = ZipUtils.unzip(source);
        assertThat(result.getMetaDataItem(), is(nullValue()));
        assertTrue(result.getZipItemList().isEmpty());
    }

    @Test(timeout=10000)
    public void zip() {
        List<ZipUtils.ZipItem> source = new ArrayList<ZipUtils.ZipItem>();
        ((ArrayList<ZipUtils.ZipItem>)source).add(new ZipUtils.ZipItem("", "bar"));
        byte[] result = ZipUtils.zip(source);
    }

    @Test(timeout=10000)
    public void zipSourceIsEmpty() {
        assertArrayEquals(new byte[] { 80, 75, 5, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, ZipUtils.zip(new ArrayList<ZipUtils.ZipItem>()));
    }
}
