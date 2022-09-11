package com.misaki.admin.config;


import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DruidConfig {

//     @ConfigurationProperties(prefix = "spring.datasource")
//     @Bean
//     public DataSource druid(){
//         return  new DruidDataSource();
//     }
    @Autowired
    private DruidDataSourceProperties properties;
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(properties.getDriverClassName());
        druidDataSource.setUrl(properties.getUrl());
        druidDataSource.setUsername(properties.getUsername());
        druidDataSource.setPassword(properties.getPassword());
        druidDataSource.setInitialSize(properties.getInitialSize());
        druidDataSource.setMinIdle(properties.getMinIdle());
        druidDataSource.setMaxActive(properties.getMaxActive());
        druidDataSource.setMaxWait(properties.getMaxWait());
        druidDataSource.setTimeBetweenEvictionRunsMillis(properties.getTimeBetweenEvictionRunsMillis());
        druidDataSource.setMinEvictableIdleTimeMillis(properties.getMinEvictableIdleTimeMillis());
        druidDataSource.setValidationQuery(properties.getValidationQuery());
        druidDataSource.setTestWhileIdle(properties.isTestWhileIdle());
        druidDataSource.setTestOnBorrow(properties.isTestOnBorrow());
        druidDataSource.setTestOnReturn(properties.isTestOnReturn());
        druidDataSource.setPoolPreparedStatements(properties.isPoolPreparedStatements());
        druidDataSource.setMaxPoolPreparedStatementPerConnectionSize(properties.getMaxPoolPreparedStatementPerConnectionSize());

        try {
            druidDataSource.setFilters(properties.getFilters());
            druidDataSource.init();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return druidDataSource;
    }

     //配置 Druid 监控管理后台的Servlet；
 //内置 Servlet 容器时没有web.xml文件，所以使用 Spring Boot 的注册 Servlet 方式
     @Bean
     public ServletRegistrationBean statViewServlet(){
         ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
         // 这些参数可以在 com.alibaba.druid.support.http.StatViewServlet 的父类 com.alibaba.druid.support.http.ResourceServlet 中找到
         Map<String,String> initParams = new HashMap<>();

         initParams.put("loginUsername","admin");
         initParams.put("loginPassword","123456");
         initParams.put("allow",""); //默认就是允许所有访问
         initParams.put("resetEnable", "true");

         //deny：Druid 后台拒绝谁访问，表示禁止此ip访问
         // initParams.put("deny","192.168.10.132");
         bean.setInitParameters(initParams);
         return bean;
     }


     //2、配置一个web监控的filter
     @Bean
     public FilterRegistrationBean webStatFilter(){
         FilterRegistrationBean bean = new FilterRegistrationBean();
         bean.setFilter(new WebStatFilter());

         Map<String,String> initParams = new HashMap<>();
         initParams.put("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");

         bean.setInitParameters(initParams);

         bean.setUrlPatterns(Arrays.asList("/*"));

         return  bean;
     }

//@Autowired
//private DruidDataSourceProperties properties;


///**
// * 注册Servlet信息， 配置监控视图
// *
// * @return
// */
//@Bean
//@ConditionalOnMissingBean
//public ServletRegistrationBean<Servlet> druidServlet() {
//    ServletRegistrationBean<Servlet> servletRegistrationBean = new ServletRegistrationBean<Servlet>(new StatViewServlet(), "/druid/*");
//
//    //白名单：
////        servletRegistrationBean.addInitParameter("allow","127.0.0.1,139.196.87.48");
//    //IP黑名单 (存在共同时，deny优先于allow) : 如果满足deny的话提示:Sorry, you are not permitted to view this page.
//    servletRegistrationBean.addInitParameter("deny","192.168.1.119");
//    //登录查看信息的账号密码, 用于登录Druid监控后台
//    servletRegistrationBean.addInitParameter("loginUsername", "admin");
//    servletRegistrationBean.addInitParameter("loginPassword", "admin");
//    //是否能够重置数据.
//    servletRegistrationBean.addInitParameter("resetEnable", "true");
//    return servletRegistrationBean;
//
//}
//
///**
// * 注册Filter信息, 监控拦截器
// *
// * @return
// */
//@Bean
//@ConditionalOnMissingBean
//public FilterRegistrationBean<Filter> filterRegistrationBean() {
//    FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<Filter>();
//    filterRegistrationBean.setFilter(new WebStatFilter());
//    filterRegistrationBean.addUrlPatterns("/*");
//    filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
//    return filterRegistrationBean;
//}
}



