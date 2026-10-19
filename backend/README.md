# PulseThread backend

PulseThread is a Spring Boot 4.1 backend owned by sachidanand. It uses Spring
Data JPA, Spring Security, MySQL, and JWT authentication.

## Local development

Requirements: Java 21, Docker Desktop, and Docker Compose.

Start the database:

```bash
docker compose up -d
```

Start the API:

```bash
./mvnw spring-boot:run
```

On Windows, run `mvnw.cmd spring-boot:run` instead. The API is available at
`http://localhost:8080` and the OpenAPI UI is at
`http://localhost:8080/swagger-ui/index.html`.

### Mailtrap email notifications

The backend can send comment notifications through Mailtrap SMTP.
Export these variables before starting Spring Boot:

<!-- ```powershell
$env:MAILTRAP_USERNAME = "your-mailtrap-username"
$env:MAILTRAP_PASSWORD = "your-mailtrap-password"
$env:MAIL_FROM = "sachidanand071@gmail.com" -->

.\mvnw.cmd spring-boot:run
```

The environment variables must be set in the same PowerShell window used to
start the backend. A `.env` file is not loaded automatically by Spring Boot.

<!-- Do not put SMTP credentials in Angular or commit them to the repository. -->

The default local database credentials are configured through environment
variables in `src/main/resources/application.properties` and match
`compose.yaml`. Set `DATABASE_URL`, `DATABASE_USERNAME`, and
`DATABASE_PASSWORD` to override them.

## Tests

```bash
./mvnw test
```

Repository tests use Testcontainers and require a Docker environment that is
available to the Testcontainers client.
