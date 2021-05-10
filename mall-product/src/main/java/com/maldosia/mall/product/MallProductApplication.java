package com.maldosia.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

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
 * 2. 使用逻辑删除
 *      2.1) 配置全局的逻辑删除规则(忽略)
 *      2.2) 配置逻辑删除的组件Bean(忽略)
 *      2.3) 给Bean加上逻辑删除注解(@TableLogic)
 */
@MapperScan("com.maldosia.mall.product.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
