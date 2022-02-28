# blog

一、环境

1.jdk1.8
2.mysql
3.redis
4.spring security
5.七牛云
6.mybatis-plus

二、文件

1.博客前台前端包：blog-app
2.sql

三、开发总结

1.jwt + redis
token令牌的登录方式，访问认证速度快，session共享，安全性
redis做了令牌和用户信息的对应管理
1)进一步增加了安全 
2)登录用户做了缓存 
3)灵活控制用户的过期(续期，踢掉线等)

2.threadLocal使用了保存用户信息，请求的线程之内，可以随时获取登录的用户，做了线程隔离

3.在使用完ThreadLocal之后，做了value的删除，防止了内存泄漏

4.线程安全- update table set value = newValue where id=1 and value=oldValue

5.线程池应用非常广，面试7个核心参数（对当前的主业务流程无影响的操作，放入线程池执行)

6.登录，记录日志

7.权限系统重点内容

8.统一日志记录，统一缓存处理

四、后续优化

1. 文章可以放入es当中，便于后续中文分词搜索。springboot教程有和es的整合
2. 评论数据，可以考虑放入mongodb当中  电商系统当中 评论数据放入mongo中
3. 阅读数和评论数 ，考虑把阅读数和评论数 增加的时候 放入redis incr自增，使用定时任务 定时把数据固话到数据库当中
4. 为了加快访问速度，部署的时候，可以把图片，js，css等放入七牛云存储中，加快网站访问速度

五、bug

1.
