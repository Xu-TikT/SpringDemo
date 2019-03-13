//package com.example.demo;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class DataSourceConfig {
//
//
//    @Bean(name = "primaryDataSource")
//    @Qualifier("primaryDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.primary")
//    public DataSource primaryDataSource(){
//        return DataSourceBuilder.create().build();
//    }
//
//
//
//    @Bean(name = "secondaryDataSource")
//    @Qualifier("secondaryDataSource")
//    @Primary
//    @ConfigurationProperties(prefix = "spring.datasource.secondary")
//    public DataSource secondaryDataSource(){
//        return DataSourceBuilder.create().build();
//    }
//
//
//    /**
//     *在创建JdbcTemplate的时候分别注入名为primartDataSource和secondaryDataSource的数据源来区分
//     * 不同的JdbcTemplate
//     * @param dataSource
//     * @return
//     */
//    @Bean(name = "primaryJdbcTemplate")
//    public JdbcTemplate primaryJdbcTemplate(@Qualifier("primaryDataSource") DataSource dataSource){
//
//        return  new JdbcTemplate(dataSource);
//
//    }
//
//
//    @Bean(name = "secondaryJdbcTemplate")
//    public JdbcTemplate secondaryDataSource(@Qualifier("secondaryDataSource") DataSource dataSource){
//
//        return  new JdbcTemplate(dataSource);
//    }
//
//
//
//}
