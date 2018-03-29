# eureka-single-instance
---

这是我的文章[「Spring Cloud与微服务学习笔记-注册与发现」](https://since1986.github.io/blog/2018/03/28/Spring-Cloud%E4%B8%8E%E5%BE%AE%E6%9C%8D%E5%8A%A1%E5%AD%A6%E4%B9%A0%E7%AC%94%E8%AE%B0-%E6%B3%A8%E5%86%8C%E4%B8%8E%E5%8F%91%E7%8E%B0/)对应的工程代码。

这个工程演示了最基本的单实例服务注册和发现，工程跟模块下分为三个子模块：eureka-server、service-a和service-b，分别是eureka服务器和两个客户端。

项目结构：
```
.
├── LICENSE
├── README.md
├── build.gradle
├── eureka-server
│   ├── build
│   │   └── classes
│   │       └── java
│   │           └── main
│   │               ├── application.yml
│   │               └── com
│   │                   └── github
│   │                       └── since1986
│   │                           └── learn
│   │                               └── cloud
│   │                                   └── eureka
│   │                                       └── server
│   │                                           ├── App.class
│   │                                           └── AppConfig.class
│   ├── build.gradle
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── github
│       │   │           └── since1986
│       │   │               └── learn
│       │   │                   └── cloud
│       │   │                       └── eureka
│       │   │                           └── server
│       │   │                               ├── App.java
│       │   │                               └── AppConfig.java
│       │   └── resources
│       │       └── application.yml
│       └── test
│           ├── java
│           └── resources
├── service-a
│   ├── build
│   │   └── classes
│   │       └── java
│   │           └── main
│   │               ├── application.yml
│   │               └── com
│   │                   └── github
│   │                       └── since1986
│   │                           └── learn
│   │                               └── cloud
│   │                                   └── service
│   │                                       └── a
│   │                                           └── App.class
│   ├── build.gradle
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── github
│       │   │           └── since1986
│       │   │               └── learn
│       │   │                   └── cloud
│       │   │                       └── service
│       │   │                           └── a
│       │   │                               └── App.java
│       │   └── resources
│       │       └── application.yml
│       └── test
│           ├── java
│           └── resources
├── service-b
│   ├── build
│   │   └── classes
│   │       └── java
│   │           └── main
│   │               ├── application.yml
│   │               └── com
│   │                   └── github
│   │                       └── since1986
│   │                           └── learn
│   │                               └── cloud
│   │                                   └── service
│   │                                       └── b
│   │                                           └── App.class
│   ├── build.gradle
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── github
│       │   │           └── since1986
│       │   │               └── learn
│       │   │                   └── cloud
│       │   │                       └── service
│       │   │                           └── b
│       │   │                               └── App.java
│       │   └── resources
│       │       └── application.yml
│       └── test
│           ├── java
│           └── resources
└── settings.gradle

```