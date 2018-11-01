# 说明

### 模块列表
- eureka-server  8761 注册中心
- service-hi  8762 EurekaClient 提供服务
- service-feign  8765 Feign 消费服务
- service-ribbon  8764 REST+Ribbon 消费服务
+ sevice-zuul  8769 路由网关，属于外围服务
* common-model  多服务共享model

### 个别知识点详细说明
1. Sleuth 服务链路追踪
    1. 在spring Cloud为F版本的时候，已经不需要自己构建Zipkin Server了，只需要下载jar运行即可
    2. spring-cloud-starter-zipkin已经关联了Sleuth
2. Feign 已经关联了Ribbon
3. Config 
    1. Config Server 路径访问规则 “/项目名称/版本（dev、pro、test）/分支名称”
        #### 该测试项目访问示例
        * 主干访问： http://localhost:8888/service-zuul/dev
        * 分支访问： http://localhost:8888/service-zuul/dev/config-test
        * 另一项目： http://localhost:8888/config-client/dev/config-test
    2. sevice-zuul 从 Config Server 获取参数，获取配置配置到 bootstrap.yml 文件，加载更早


### 参考博客地址
https://blog.csdn.net/forezp/article/details/70148833/
