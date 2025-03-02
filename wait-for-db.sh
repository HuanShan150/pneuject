#!/bin/sh
echo "Aguardando PostgreSQL..."

while ! nc -z postgres 5432; do
  sleep 2
done

echo "PostgreSQL está pronto. Iniciando a aplicação..."
exec ./gradlew bootRun
