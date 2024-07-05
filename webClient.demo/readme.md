# Webclient Project

The **Webclient Project** is a Spring Boot web application designed for testing APIs by calling them using WebClient. It's meant to be used alongside your other applications, such as the "User-Service."

## Dependencies

- Spring Web
- Lombok
- MySQL Driver
- Spring Data JPA
- Spring Boot DevTools
- Spring WebFlux (for reactive web)

## Configuration Beans

### 1. UserProps

The `UserProps` configuration bean allows you to set the base URL for external APIs. Here's an example of how to create it:

```java
@Configuration
@ConfigurationProperties(prefix = "user-service")
@Data
public class UserProps {
    private String baseurl;
}
```

### 2. WebClientConfig

The `WebClientConfig` configuration bean provides a `WebClient` instance. You can create it like this:

```java
@Configuration
public class WebClientConfig {
    @Bean
    public WebClient getWebClient() {
        return WebClient.builder().build();
    }
}
```

## Using WebClient

In your service class, you can use the `WebClient` to call external APIs. Here's an example:

```java
@Service
public class UserService {
    private final UserProps userProps;
    private final WebClient webClient;

    public UserService(UserProps userProps, WebClient webClient) {
        this.userProps = userProps;
        this.webClient = WebClient.create(userProps.getBaseurl());
    }

    public User getUser(Integer id) {
        log.info("Base URL: {}", userProps.getBaseurl());
        User user = webClient
            .get()
            .uri("/{id}", id)
            .retrieve()
            .bodyToMono(User.class)
            .block();
        return user;
    }
}
```