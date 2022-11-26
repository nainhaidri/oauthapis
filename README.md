# oauthapis
REST API Implementation With OAuth

**Prerequisites:** <br>
JDK Version: **17.0.5** <br>
Maven Version: **3.8.6**
<br><br>
To run this application, you can run src\main\java\oauthapis\oauthapis\OauthapisApplication.java class with your Java compatible IDE.
<br>
Alternatively, you can build the application by executing the following command inside **root** directory:
<br>
**mvn install**
<br>
After that, you can go into **targets** folder and run the application by executing:
<br>
**java -jar oauthapis-0.0.1-SNAPSHOT.jar**
<br><br>
The application will launch at the following address:
<br>
**http://localhost:8080**
<br>
<br>
The default username for application is **user**<br>

Password will be shown on command line like this<br>
![image](https://user-images.githubusercontent.com/61223026/204094393-bd2802cf-8578-4c1e-a982-6ef978353061.png)

<br><br>
Use this password to authenticate at the login screen. After login, you can access 5 APis by accessing the following URLs:<br><br>
**1. GET All Users**: http://localhost:8080/users<br>
**2. GET All Comments**: http://localhost:8080/comments<br>
**3. GET All Posts**: http://localhost:8080/posts<br>
**4. GET Posts By User**: http://localhost:8080/users/{userId}/posts<br>
**5. GET Comments By Post** : http://localhost:8080/posts/{postId}/comments
