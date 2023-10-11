***Spring Configuration Server***

**Benefits**

1. Can switch environments as needed without needing server restart.
2. Can reduce the no of lines.
3. Can switch to various log levels
4. Maintain multiple profiles for different environments or activities eg: Performance Testing
5. Applicable for any technology as long as we do a rest call.

**Usage**

http://localhost:8888/dev/default
![img_1.png](img_1.png)
use basic authentication or any other form of Oauth2

Clients can configure 
management.endpoints.web.exposure.include=refresh 
and do a **POST** call as to reflect new changes without restarting client server

http://localhost:8080/actuator/refresh

![img.png](img.png)
![img_2.png](img_2.png)