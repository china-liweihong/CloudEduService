# 该镜像需要依赖的基础镜像
FROM java:8
VOLUME /tmp
# 将当前目录下的jar包复制到docker容器的/目录下
ADD /target/service-eureka-slave1.jar app.jar
# 指定docker容器启动时运行jar包
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
# 声明服务运行的端口
EXPOSE 7002