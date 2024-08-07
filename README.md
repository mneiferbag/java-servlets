# Java Servlets Examples

Licensed under the MIT License. See file LICENSE.

Collection of Java servlets examples. Examples include code written in Java.

[![CodeQL](https://github.com/mneiferbag/java-servlets/actions/workflows/codeql-analysis.yml/badge.svg)](https://github.com/mneiferbag/java-servlets/actions/workflows/codeql-analysis.yml) 
[![Java CI with Maven](https://github.com/mneiferbag/java-servlets/actions/workflows/maven.yml/badge.svg)](https://github.com/mneiferbag/java-servlets/actions/workflows/maven.yml)

## Apache Tomcat Configuration

Add to $TOMCAT_HOME/conf/tomcat-users.xml following roles and user.

    <role rolename="manager-gui"/>
    <role rolename="manager-script"/>
    <user username="admin" password="choosen-password" roles="manager-gui,manager-script"/>

Add Server configuration to Tomcat Maven plugin in project POM.

    <plugin>
      <groupId>org.apache.tomcat.maven</groupId>
      <artifactId>tomcat7-maven-plugin</artifactId>
      <version>2.2</version>
      <configuration>
        <server>TomcatServer</server>
      </configuration>
    </plugin>

Add server authentication to Maven settings.xml.

    <server>
      <id>TomcatServer</id>
      <username>admin</username>
      <password>choosen-password</password>
    </server>

Deploy to Tomcat using Maven plugin with `mvn package tomcat7:[re]deploy`.

List applications using manager web app text interface.

    curl -u admin:choosen-password -i http://localhost:8080/manager/text/list

## Links

- Apache
  - [Apache Tomcat](https://tomcat.apache.org/) servlet container
  - [Eclipse Jetty](https://www.eclipse.org/jetty/) servlet container
- Testing
  - [JUnit](https://junit.org/)
  - [Mockito framework site](https://site.mockito.org/)
  - [REST Assured](https://rest-assured.io/)
- General
  - [Java Development Examples](https://github.com/mneiferbag/java-examples)

## Tasks

- Nil
