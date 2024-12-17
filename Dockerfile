# Use OpenJDK 11 as the base image
FROM openjdk:11-jdk-slim

# Set the working directory to the current context
WORKDIR .

# Copy the current directory contents into the container
COPY . .

# Compile the Java program
RUN javac prime.java

# Run the Java program
CMD ["java", "prime"]
