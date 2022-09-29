
## version
org.springframework.boot 2.7.2
java 8
io.springfox(swagger3)
mybatis-plus 3.5.1
mybatis-plus-generator 3.5.1
mysql 8.0.27

dependencies
workbook 4.1.1
## NOTE
mysql :testDB -root -123456
swagger3 默认访问网址  
`http://localhost:8080/swagger-ui/index.html`
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

