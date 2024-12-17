# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jdk-slim
# Set the working directory inside the container
WORKDIR /
# Copy the current directory contents into the container at /app
COPY prime.java .
# Compile the Java program
RUN javac prime.java
# Command to run the program
CMD ["java", "prime.java"]
