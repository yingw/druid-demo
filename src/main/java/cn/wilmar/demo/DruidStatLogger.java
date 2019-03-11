package cn.wilmar.demo;

import com.alibaba.druid.pool.DruidDataSourceStatLogger;
import com.alibaba.druid.pool.DruidDataSourceStatLoggerAdapter;
import com.alibaba.druid.pool.DruidDataSourceStatValue;
import com.alibaba.druid.support.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * @author Yin Guo Wei 2019/3/9
 */
public class DruidStatLogger extends DruidDataSourceStatLoggerAdapter implements DruidDataSourceStatLogger {

    private static Logger logger = LoggerFactory.getLogger(DruidStatLogger.class);

    @Override
    public void log(DruidDataSourceStatValue statValue) {
        logger.debug(statValue.toString());
        super.log(statValue);
    }

    @Override
    public void configFromProperties(Properties properties) {
        super.configFromProperties(properties);
    }

    @Override
    public void setLogger(Log logger) {
        super.setLogger(logger);
    }

    @Override
    public void setLoggerName(String loggerName) {
        super.setLoggerName(loggerName);
    }
}