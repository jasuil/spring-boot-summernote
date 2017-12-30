server:
  port: 8080
spring:
  mvc:
    view:
      prefix: /WEB-INF/views/
      suffix: .jsp
  jpa:
    database-platform: org.hibernate.dialect.Oracle10gDialect
    database: oracle
    openInView: false
    show-sql: true
    generate-ddl: true
    hibernate:
      ddl-auto: update
  datasource:
    url: jdbc:oracle:thin:@localhost:1521:orcl;
    username: system
    password: 1212
    driver-class-name: oracle.jdbc.driver.OracleDriver
  h2:
    console:
      enabled: true
      path: /console/*
  http:
    multipart:
      enabled: true
      max-file-size: 10Mb
      max-request-size: 10Mb
      
