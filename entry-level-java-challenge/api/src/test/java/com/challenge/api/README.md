# Testing Help

## Unit and/or Integration tests are NOT REQUIRED

### Standards
If you decide to include tests, then please use **JUnit** as the test framework and adhere to standard conventions.

### Resources
This [Spring Web Test tutorial](https://spring.io/guides/gs/testing-web) and [JUnit 5 guide](https://www.baeldung.com/junit-5) could be useful resources! 

### Building
As described in the original README, format with ./gradlew spotlessApply
                                  and build with ./gradlew build

### Running
Run with ./gradlew bootRun.

After running, if you are on a Windows machine, to see all employees in the list, run the following command:
curl.exe http://localhost:{port number}/api/v1/employee.

To test getEmployeeByUuid, run the following command:

curl.exe http://localhost:8080/api/v1/employee/{uuid}
