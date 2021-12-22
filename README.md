# Microservice using docker

Dockerized springbootized and using HAproxy

## HAproxy

### SSL

SSL akanb dihandle oleh HAproxy.   
refer ke link [ini](https://www.haproxy.com/blog/haproxy-ssl-termination/)

#### generate key-pair 

##### self signed
```
openssl req -newkey rsa:2048 -nodes -keyout key.pem -x509 -days 3650 -out certificate.pem
```

Gabungkan kedua file tersebut ke dalam satu file .pem.   
Copy-paste saja text apa yang ada dalam dua file tersebut (contoh isi: *---BEGIN CERTIFICATE---.....*, *-----BEGIN PRIVATE KEY-----....* dst....)

##### signed by CA

###### step pertama: generate csr

`openssl req -new -newkey rsa:2048 -nodes -keyout privet_ssgehirn.key -out csr_ssgehirn.csr`

###### step kedua: send ke CA untuk di ttd

download certificatenya dalam ekstensi .pem.   
csr_ssgehirn.csr sudah tidak diperlukan

Gabungkan file private key dan certificate yang sudah ditandatangani oleh CA tersebut ke dalam satu file .pem.   
Copy-paste saja text apa yang ada dalam dua file tersebut (contoh isi: *---BEGIN CERTIFICATE---.....*, *-----BEGIN PRIVATE KEY-----....* dst....)
