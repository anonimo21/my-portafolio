FROM eclipse-temurin:21-jdk AS build
WORKDIR /app
COPY . .
ENV LANG=C.UTF-8
ENV LC_ALL=C.UTF-8 
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/target/*.jar my-portfolio-backend.jar
EXPOSE 8080
CMD ["java", "-jar", "my-portfolio-backend.jar"]
