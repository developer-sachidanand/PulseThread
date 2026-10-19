# PulseThread frontend

PulseThread is an Angular 21 frontend for the PulseThread Spring Boot API.

## Local development

From this directory:

```bash
npm install
npm start
```

Open `http://localhost:4200/`. The frontend expects the backend at
`http://localhost:8080`.

## Build and tests

```bash
npm run build
npm test
```

The database is provided by the backend project's Docker Compose configuration.
