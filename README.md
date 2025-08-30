# Spring-boot-monitoring-example

This repository provides a minimal yet practical example of how to integrate monitoring into a Spring Boot application. It demonstrates how to expose application metrics, health checks, and tracing information using Spring Boot Actuator and popular monitoring tools.

## Launch prometheus
In your terminal run 
```
docker run -d --name prometheus \
  -p 127.0.0.1:9090:9090 \
  -v $(pwd)/prometheus.yml:/etc/prometheus/prometheus.yml \
  prom/prometheus
```

If you are Linux, you should consider updating the host in `/prometheus.yml`