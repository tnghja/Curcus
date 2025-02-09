# Sử dụng OpenJDK 11 thay vì OpenJDK 21
FROM openjdk:11

# Đặt thư mục làm việc
WORKDIR /app

# Sao chép file JAR vào container
COPY target/lms-0.0.1-SNAPSHOT.jar /app/lms.jar

# Mở cổng 8080
EXPOSE 8080

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "/app/lms.jar"]

