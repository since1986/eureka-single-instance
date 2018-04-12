# eureka-single-instance
---

## 简介
这是我的文章[「Spring Cloud与微服务学习笔记-注册与发现」](https://since1986.github.io/blog/17601ed9.html)对应的工程。这个工程演示了最基本的单实例服务注册和发现，工程跟模块下分为三个子模块：eureka-server、service-a和service-b，分别是eureka服务器和两个客户端。

## 结构
```
.
├── build.gradle
├── eureka-server
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