# Troubleshoot

## Log4j2

#### Appender LogToConsole stopped with status true
log4j ga bisa logging di spring boot

##### Resolve
disabling the spring-boot LoggingSystem. I added this system variable to my startup command: `-Dorg.springframework.boot.logging.LoggingSystem=none`

[link](https://stackoverflow.com/questions/51802181/log4j2-shuts-down-all-appenders-with-slf4j)