# JSON Web Token Lib

Library yang digunakan untuk oiperasi JWT

## java src

#### JwtUserDetailsService

mengimplementasi Spring Security UserDetailsService interface. Akan koneksi atau mengakses ke database, ldap dll untuk memverifikasi user 

#### JwtTokenUtil

The JwtTokenUtil is responsible for performing JWT operations like creation and validation.   
It makes use of the io.jsonwebtoken.Jwts for achieving this.

The class implements Serializable. 
Berisi fungsi validasi token, generate token, is token expired dst

JWT_TOKEN_VALIDITY yang ada dalam class ini masih hard coded

#### JwtRequestFilter

Untuk tiap request yang masuk, script ini akan dijalankan. Akan memeriksa apakah request sudah ada JWT token yang valid.

If it has a valid JWT Token, then it sets the authentication in context to specify that the current user is authenticated.

akan diinclude oleh class yang memerlukan operasi jwt token.   
Jika suatu class include `SgWebSecurityConfig` pada konfigurasinya maka Class ini akan include.
Pada `SgWebSecurityConfig` Class ini dipakai di dalam methode `SgWebSecurityConfig.configure(HttpSecurity httpSecurity)` pada bagian baris kode `httpSecurity.addFilterBefore()` untuk validasi token pada setiap request

   
Class ini menggunakan class `JwtTokenUtil` untuk operasi yang token related (generate dll) dan `JwtUserDetailsService` 

Class ini mengambil header 'Authorization' dari request. Lalu menggunakan JwtTokenUtil yang sudah diautowired di dalamnya untuk mengambil data username dari token tersebut   
`jwtTokenUtil.getUsernameFromToken(jwtToken)`   

Lalu menggunakan class jwtUserDetailsService yg di autowired untuk mengamnbil userDetail (org.springframework.security.core.userdetails.UserDetails), Llau melakukan validasi username dengan token menggunakan fungsi jwtTokenUtil   
`jwtTokenUtil.validateToken(jwtToken, userDetails)`   

Lalu setting SecurityContextHolder.getContext().setAuthentication menggunakan userDetails tersebut

#### JwtAuthenticationEntryPoint

extend Spring's AuthenticationEntryPoint class and override its method commence. 
It rejects every unauthenticated request and send error code 401 (SC_UNAUTHORIZED)

 