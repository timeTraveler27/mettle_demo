# Getting Started
## Project Name
Duplicate Finder

### Description
This application finds the first duplicate number in a list and returns the value as a string

## Author
Julius Eke

### Git Repo
* [Git Repo For Project](https://github.com/timeTraveler27/mettle_demo.git)

### Useful Installs
Not necessary but nice to have

To install a JDK got to
* [JDK download](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
* (can be confirmed by entering `java -version` in the terminal)

To install Maven
* [Maven installation instructions](https://maven.apache.org/install.html)
* (can be confirmed by entering `mvn -v` in the terminal) 

### Build And Run
* Clone project from the repo above
* Navigate to the root folder of the project from your terminal 
* Enter `mvn clean istall` to build the application
* Enter `mvn clean test` to just run all tests

### Assumptions 
* I assume I don't need to check for invalid list type (e.g. String list) since there's no user entry component
* Since we are testing from the unit test I'm assuming there is no user input
* The collection type passed in would be of list, not array
