FROM frolvlad/alpine-oraclejdk8:slim
#使容器中的一个目录具有持久化存储数据的功能，该目录可以被容器本身使用，也可以共享给其他容器。当容器中的应用有持久化数据的需求时可以在Dockerfile中使用该指令。
VOLUME /tmp
ADD service-hi-1.0-SNAPSHOT.jar app.jar
#RUN bash -c 'touch /app.jar'
#指定Docker容器启动时执行的命令，可以多次设置，但是只有最后一个有效。
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
#为Docker容器设置对外的端口号。在启动时，可以使用-p选项或者-P选项。
EXPOSE 8762
