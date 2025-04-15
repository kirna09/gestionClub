# Usa una imagen base válida de Java 17 con Maven
FROM mcr.microsoft.com/devcontainers/java:1-17
EXPOSE 8080

# Instala paquetes adicionales si necesitas (por ejemplo, git, curl, etc.)
RUN apt update
RUN apt install -y git curl
# Instala Maven
RUN apt install -y maven