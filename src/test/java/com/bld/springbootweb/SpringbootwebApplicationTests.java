package com.bld.springbootweb;

import com.bld.springbootweb.utils.AESEncryptionUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootwebApplicationTests {

    @Test
    void contextLoads() {


    }

    public static void main(String[] args) {
        System.out.println("---------------个人信息开始加密处理---------------");
        System.out.println("name: "+AESEncryptionUtils.encryptAES("潘民绩"));
        System.out.println("qq: "+AESEncryptionUtils.encryptAES("1227874390"));
        System.out.println("tel: "+AESEncryptionUtils.encryptAES("15285554970"));
        System.out.println("wx: "+ AESEncryptionUtils.encryptAES("Panmj1227874390"));
        System.out.println("email: "+AESEncryptionUtils.encryptAES("1227874390@qq.com"));
        System.out.println("address: "+AESEncryptionUtils.encryptAES("贵州省贵阳市云岩区未来方舟国际大厦A8589-06室"));
    }

}
