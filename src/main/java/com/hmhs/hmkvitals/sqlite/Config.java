package com.hmhs.hmkvitals.sqlite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

//@Autowired Environment env;

@Configuration
public class Config {

     @Autowired
     Environment env;

     @Bean
     public DataSource dataSource() {

      //    final DriverManagerDataSource dataSource = new DriverManagerDataSource();
      //    dataSource.setDriverClassName(env.getProperty("driverClassName"));
      //    dataSource.setUrl(env.getProperty("url"));
      //    dataSource.setUsername(env.getProperty("user"));
      //    dataSource.setPassword(env.getProperty("password"));
      //    return dataSource;
          DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
          dataSourceBuilder.driverClassName("org.sqlite.JDBC");
          dataSourceBuilder.url("jdbc:sqlite:/usr/queues/database/hmkProto.db");
          return dataSourceBuilder.build();



     }


}
