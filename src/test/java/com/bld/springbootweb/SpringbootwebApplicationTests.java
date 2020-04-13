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

        System.out.println("address: "+AESEncryptionUtils.encryptAES("贵州省贵阳市云岩区未来方舟国际大厦A8589-06室"));
    }

}
