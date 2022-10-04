
## version
org.springframework.boot 2.7.2
java 8
io.springfox(swagger3)
mybatis-plus 3.5.1
mybatis-plus-generator 3.5.1
mysql 8.0.27

dependencies
workbook 4.1.1
spring cloud 2021.0.3

## NOTE
mysql :testDB -root -123456
springdoc swagger3 默认访问网址  
`http://localhost:8080/swagger-ui.html`

1. misaki-admin
    - application.properties can't work
    - pom => use `<paking>jar</paking>`
    - problem : druid/datasource.html => `(*) property for user to setup`
        - operation database may save this problem 
    - problem : @Autowired
        -  use `@Autowired(required = false)`
    - problem : CorsConfig.java =>`allowedOrigins`
        - use `allowedOriginPatterns`
    - problem : ibtis binding 
        - use accuracy MapperScan `@MapperScan("com.misaki.admin.dao")`
    - encode-password, can not insert record into mysql database, this cause insert-password is not encode compare worrid
2. miaski-pom
    - pom =>  add `<paking>pom</paking>`

3. misaki-monitor
    - spring boot admin 与spring boot 版本一致
    - 报错： Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
        - save：spring.boot.admin.client.url=http://localhost:8000  
        - save：management.endpoints.web.exposure.include=*

    - 从此采用springdoc 1.4.0来集成swagger3，
        - 路路径使用 spring.mvc.pathmatch.matching-strategy=ANT_PATH_MATCHER
        - 网址使用 /swagger-ui.html 进入v3
        - 网址使用 /swagger-ui/index.html 进入v2
    - monitor实例离线
        · 解决方法：确定instance.service->spring.boot.admin.client.instance.service-url=http://localhost:8002


