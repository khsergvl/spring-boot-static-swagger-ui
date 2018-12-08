spring-boot static swagger-ui
============

    This is small web-app represents final steps of article:  
    "Overcoming Swagger Annotation Overload by Switching to JSON
    to build static swagger-ui."  
    "https://dzone.com/articles/overcoming-swagger-annotation-overload-by-switchin"
    
    The main idea of the app is to use static JSON swagger-ui configuration.  
    Thus, it's enough only to add light-weight swagger-ui dependecy  
    and expected JSON configuration to the project.
    
    Also this app can be used as swagger-ui stand alone web container,
    that represents project API.  
    
    To simplify usage, app contains configuration that overrides default swagger-ui URI   
    with configurable prefix.  
    

## How to start ?
Clone repository && execute in bash:  
```
$ ./gradlew bootRun
```

Open in browser http://localhost:8080/docApi/swagger-ui.html  

Pray! :)

## Change static swagger-ui configuration
* Edit the configuration in the file [swagger.json](/src/main/resources/swagger.json)

## Change {docApi} URI redirect prefix configuration
* Edit the configuration in the file [application.properties](/src/main/resources/application.properties)


Requirements
--------------------
- git
- gradle
- java 8

License
=======

GNU General Public License