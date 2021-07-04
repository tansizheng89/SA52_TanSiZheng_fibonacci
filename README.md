# fibonacciproject

This is a project using REST Spring and containerized using docker to provide user with the fibonacci sequence and sort it even numbers first and then by odd numbers in the descending order. 

How to run this docker file?
Go to the Dockerfile location of the file in the project and run the command prompt. 

Building the docker file
Step 1. In the command prompt: docker build -t fibproject .

Run the image file
Step 2.In the command prompt: docker run -p8080:8080 fibproject 
