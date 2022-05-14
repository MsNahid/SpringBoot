# Spring Boot

**Spring Boot Solution** <hr />

- Make it easier to get started with Spring development
- Minimize the amount of manual configuration
   - Perform **Auto-Configuration** based on props files and JAR Class Path
- Help to resolve dependency conflicts(Maven or Gradle)
- Provided an embedded HTTP server so you can get started quickly.
   - Tomcat, Jetty, Undertow,...
  
<br />

**Maven Wrapper files** <hr />
- **mvnw** allows you to run a maven project
  - No need to have Maven Installed or present in path
  - If correct version of Maven is NOT found
     - **Automatically downloads** correct version and runs maven

<br />

**Spring Boot Running From The Command Line** <hr />
> - Build Jar File
>    - ./**mvnw** package.
> - Run App
>     1. java -jar [.jar file name]
>     2. ./**mvnw** spring-boot:run

