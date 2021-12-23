# JWT authentication service

modul untuk menyediakan service autentikasi (url : /authenticate)

memakai library sg-jwt-lib. Request untuk mendapatkan token jwt akan diredirect ke sini


## getting token

request untuk mendapatkan token ke jwt auth:

curl -X POST -H 'Content-Type: application/json' -i http://localhost:8080/authenticate --data '{ "username":"javainuse", "password":"password" }'

token yg didapat berisi user pass yg akan dikirm ke service2 jtw security enabled 

## lib sg-jwt-lib

class yang dipakai
com.sg.springboot.jwt.JwtAuthenticationEntryPoint;
com.sg.springboot.jwt.JwtRequestFilter;

## config

diaplikasikan sebagai java class :   `com.sg.springboot.microservice.rest.authentication.authservice.config.AuthenticateWebSecurityConfig`

class akan intercept request dan memeriksa jwt token dalam bearer
(kecuali dgn url authenticate) yg mana adalah service dalam aplikasi ini


set juga placehodler untuk jwt.secret menggunakan argumen
-Djwt.secret=Test