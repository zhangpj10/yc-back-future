# yc-future

#### 项目介绍
永创联盟后端项目

#### 软件架构
- gradle + SSM + mysql
- 目录
```
|-- yc-future
    |-- .gitignore      git 忽略文件配置
    |-- build.gradle    项目公共gradle依赖配置
    |-- README.md       文档说明
    |-- settings.gradle 模块依赖配置
    |-- gradlePlugins   插件引用
    |   |-- gretty.plugin
    |   |-- node.plugin
    |-- web-src         前端模块（已独立出来）
    |   |-- build.gradle
    |   |-- src
    |       |-- app
    |           |-- leshuo
    |               |-- index.ftl
    |-- yc-src                              后端模块
        |-- build.gradle                    后端独立模块gradleg配置
    |-- build                               后端编译完成目录
        |-- src     
            |-- buildedWebContent           存放前端编译完成的文件
            |   |-- app
            |       |-- leshuo
            |           |-- index.ftl
            |-- main                        主要存放后端java代码
                |-- java
                |   |-- com
                |       |-- account         模块名
                |       |   |-- controller  控制层
                |       |   |   |-- AccountController.java
                |       |   |-- repository  mapper接口
                |       |   |   |-- AccountMapper.java
                |       |   |-- service     服务层
                |       |       |-- AccountService.java
                |       |-- common          公共模块
                |       |   |-- filter
                |       |   |   |-- FilterSecurity.java
                |       |   |-- mybatis
                |       |   |   |-- pagePlugn
                |       |   |   |   |-- Page.java
                |       |   |   |   |-- PageInterceptor.java
                |       |   |   |-- repository
                |       |   |       |-- MyBatisRepository.java
                |       |   |-- sessionInfo
                |       |       |-- SessionInfo.java
                |       |       |-- Staff.java
                |       |-- leshuo
                |           |-- controller
                |           |   |-- LeshuoController.java
                |           |-- repository
                |           |   |-- LeshuoMapper.java
                |           |-- service
                |               |-- LeshuoService.java
                |-- resources              后端springmvc，mybatis,mysql相关配置信息
                |   |-- applicationContext-resposity.xmls
                |   |-- applicationContext.xml
                |   |-- log4j.properties
                |   |-- mysql-config.properties
                |   |-- spring-mvc.xml
                |   |-- mybatis             存放各模块mybatis文件
                |       |-- configuration.xml
                |       |-- account
                |       |   |-- AccountMapper.xml
                |       |-- leshuo
                |           |-- LeshuoMapper.xml
                |-- webapp
                    |-- index.jsp
                    |-- WEB-INF
                        |-- web.xml
```

#### 安装教程

1. 从git上克隆项目，git地址：https://gitee.com/zhangpj/yc-future.git
2. 用idea打开项目，会自动下载所配置的依赖包
3. 查看jdk版本是否为1.8版本，ctrl+alt+shift+s
4. 可用工具栏gradle->yc-future->Tasks->gretty->appStart启动项目

#### 参与贡献

#### 码云特技

1. 使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2. 码云官方博客 [blog.gitee.com](https://blog.gitee.com)
3. 你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解码云上的优秀开源项目
4. [GVP](https://gitee.com/gvp) 全称是码云最有价值开源项目，是码云综合评定出的优秀开源项目
5. 码云官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6. 码云封面人物是一档用来展示码云会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)