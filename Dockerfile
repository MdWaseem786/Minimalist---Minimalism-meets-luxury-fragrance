# Use official Java runtime as base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy all project files to the container
COPY . .

# Build the project (if you are using Maven)
RUN ./mvnw clean package -DskipTests

# Run the JAR file (adjust the path if different)
CMD ["java", "-jar", "target/app.jar"]


Added Dockerfile for deployment
