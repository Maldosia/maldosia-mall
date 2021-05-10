package com.maldosia.mall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1.使用nacos作为配置中心
 *   1.引入依赖
 *   2.创建一个bootstrap.properties
 *      spring.application.name=mall-coupon
 *      spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *   3.在nacos添加一个数据集(Data Id) mall-coupon.properties。默认规则，应用名.properties
 *   4.给mall-coupon.properties添加任何配置
 *   5.动态获取配置
 *      @RefreshScope：动态获取并刷新配置
 *      @Value：获取配置
 * 2.细节
 *  1.命名空间
 *      1.可以利用命令空间做应用隔离
 *          需要在bootstrap.properties配置使用具体的命令空间
 *      2.每一个微服务之间互相隔离
 *  2.配置集
 *      所有配置的集合
 *  3.配置集Id
 *      类似于配置文件名
 *  4.配置组
 *      默认所有的配置集都属于:DEFAULT_GROUP
 */

@MapperScan("com.maldosia.mall.coupon.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class MallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCouponApplication.class, args);
    }

}
