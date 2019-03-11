package cn.wilmar.demo;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


/**
 * @author Yin Guo Wei 2019/3/9
 */
//@Configuration
public class DruidConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.druid")
    public DataSource druidDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setStatLogger(new DruidStatLogger());
        return dataSource;
    }
}

/*---------------------
        作者：一颗贪婪的星
        来源：CSDN
        原文：https://blog.csdn.net/greedystar/article/details/81055485
        版权声明：本文为博主原创文章，转载请附上博文链接！*/