#set SPRING_CONFIG_NAME=application,ADR
#set SPRING_CONFIG_LOCATION=classpath:../config
 
java -Dlogging.config=config/log4j2.xml -jar target/dynatraceConnetorApp-1.0.jar
