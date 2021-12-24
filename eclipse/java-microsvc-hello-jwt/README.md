# Hello with JWT enabled

dengan include dependency

```xml
<dependency>
	<groupId>com.sg.microservice</groupId>
	<artifactId>java-jwt-microsvc-authentication-config</artifactId>
	<version>${project.version}</version>
</dependency>
```
diharapkan sudah JWT enabled

## akses url

tambahkan pada header *Authorization*: Bearer <jwtoken>

contoh akses url service:

`curl -X POST -H 'Content-Type: application/json' -H 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqYXZhaW51c2UiLCJleHAiOjE1NzIwMDg3MjAsImlhdCI6MTU3MTk5MDcyMH0.CEF47f8qwV4FJeGKCJm4bYcxmvKaGfeozoFxQ7244Qxzru_x8I0ZG8nQ07uKu-Llmic4GDZNde4ZNkUcICaImQ' -i http://localhost:8080/sg/microservice/v1/hellojwt/world?msg=123`