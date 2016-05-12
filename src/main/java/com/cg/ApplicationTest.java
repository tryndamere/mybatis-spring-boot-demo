package com.cg;

import com.cg.domain.Hotel;
import com.cg.mapper.HotelMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by rocky on 2016/5/12.
 */
@SpringBootApplication
@MapperScan(basePackages = "com.cg.mapper")
public class ApplicationTest implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(ApplicationTest.class, args);
    }

    @Autowired
    HotelMapper hotelMapper;

    @Override
    public void run(String... strings) throws Exception {
        Hotel hotel = hotelMapper.selectByCityId(1);
        System.out.println(hotel.getAddress());
    }
}
