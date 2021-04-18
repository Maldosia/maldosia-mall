package com.maldosia.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. 整合mybatis-plus
 *  1) 导入依赖
 *  	<dependency>
 * 			<groupId>com.baomidou</groupId>
 * 			<artifactId>mybatis-plus-boot-starter</artifactId>
 * 			<version>${mybatisplus.version}</version>
 * 		</dependency>
 *  2) 配置
 *      2.1) 配置数据源
 *          2.1.1) 导入数据库驱动
 *          2.1.2) 在application.yml配置数据源相关信息
 *      2.2) 配置mybatis-plus
 *          2.1) 使用Mapperscan
 *          2.2) 配置SQL映射文件位置
 */
@MapperScan("com.maldosia.mall.product.dao")
@SpringBootApplication
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
