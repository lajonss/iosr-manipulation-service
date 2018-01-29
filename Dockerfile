FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/iosr-manipulation-service-0.0.1-SNAPSHOT.jar /app.jar

ENV PORT="1234"
EXPOSE 1234

ENV JAVA_OPTS="-Xmx512M"
ENV EUREKA_URI="http://eureka:8761/eureka/"
CMD exec java $JAVA_OPTS -Dserver.port=$PORT -Djava.security.egd=file:/dev/./urandom -jar /app.jar
