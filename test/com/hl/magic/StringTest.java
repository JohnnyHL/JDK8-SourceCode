package com.hl.magic;

import org.junit.Test;

/**
 * @author HL
 * @date 2021/2/27 14:33
 */
public class StringTest {
    @Test
    public void case1(){
        String value = "Abcd123456789+1111";
        String[] split = value.split("\\+");
        System.out.println("===>" + split[0]);
    }
}
