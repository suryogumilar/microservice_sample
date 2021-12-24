# Microservice JWT Auth config

Konfigurasi dalam bentuk java class untuk enable autentikasi security berdasar Json Web Token. 

Konfigurasi disimpan dalam class:   
`com.sg.springboot.microservice.rest.authentication.security.config.SgWebSecurityConfig`

class akan intercept request dan memeriksa jwt token dalam bearer. Setiap request akan dilihat dan divalidasi bearer token jwtnya dengan memanfaatkan class `JwtRequestFilter` yang didefinisikan di `sg-jwt-lib`

