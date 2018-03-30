# eureka-single-instance
---

这是我的文章[「Spring Cloud与微服务学习笔记-注册与发现」](https://since1986.github.io/blog/17601ed9.html)对应的工程代码。

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