package com.little.util;

import org.junit.Test;

import java.util.List;

import static com.little.util.ImageUtils.getImgUrl;

/**
 * @author pengx
 * @date 2016/10/12
 */
public class ImageUtilsTest {

    @Test
    public void testGetImgUrl(){
        String imgStr = "<img class=\"currentImg\" onload=\"alog &amp;&amp; alog('speed.set', 'c_firstPageComplete', +new Date); alog.fire &amp;&amp; alog.fire('mark');\" src=\"http://pic33.nipic.com/20130916/3420027_192919547000_2.jpg\" log-rightclick=\"p=5.102\" style=\"cursor: pointer; width: 510.216px; height: 383px; top: 0px; left: 318.892px;\" title=\"点击查看源网页\" width=\"1024\" height=\"768\">";
        List<String> urlList = getImgUrl(imgStr);
        for (String str: urlList) {
            System.out.println(str);
        }
    }
}
