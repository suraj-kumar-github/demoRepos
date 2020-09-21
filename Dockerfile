FROM maven:3.5-jdk-8-alpine
WORKDIR /demo
COPY --from=0 /demo /demo
RUN mvn install 

FROM openjdk:8-jre-alpine
WORKDIR /demo
COPY --from=1 /demo/target/demo-0.0.1-SNAPSHOT.war /app 
CMD ["java -war demo-0.0.1-SNAPSHOT.war"] 
