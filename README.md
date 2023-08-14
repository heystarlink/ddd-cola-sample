# ddd-cola-sample
DDD-领域驱动设计，Cola分层架构样板代码


包划分
-api 模拟对外暴露该服务的包
-com.cola.sample 微服务下cola分层架构
    - adapter 适配层
        - endpoint
        - mq
    - application 业务编排
        - service 
    - domain 领域聚合
        - order 订单聚合
            - entity
            - event
            - gateway
            - helper
            - model
                - req 
                - resp
            - service
            - strategy
    - infrastructure - 基础服务层
        - config
        - event
        - gatewayimpl
        - mapper
        - model