# addressregistration

Address registration code consults a zipcode and saves the address in a database.

## Index

- [Installation](#installation)
- [How To Use](#how-to-use)
- [Author](#Author)

## Installation

1) Be sure to have the version 17 or higher from java
2) Import on the IDE of preference

Obs.: In case of conflicts, found the proper solution for your case.

## How-To-Use

1) After execute the [pre-requirements](#Pre-requirements) execute the application
2) On postman, execute the curl imported.

## Author
André Luís - Software Engineer

## Pre-requirements

1) Install postgres database with the following setup:

```properties
url: jdbc:postgresql://localhost:5432/postgres
username: postgres
password: postgres
```

Obs.: Or change the setup for the defined environment on src/main/resources/templates

2) Download and install SOAPUI [software](https://dl.eviware.com/soapuios/5.7.2/SoapUI-x64-5.7.2.exe)
2) Import xml file from [src/main/resources/mock/mock.xml](src/main/resources/mock/mock.xml)
3) Run the mock server
4) Import the curl on Postman from file [src/main/resources/mock/curl.txt](src/main/resources/mock/curl.txt)

