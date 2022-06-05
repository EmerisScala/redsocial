#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL

    CREATE USER admin PASSWORD 'admin';

    CREATE DATABASE usuarios OWNER admin;
    GRANT ALL PRIVILEGES ON DATABASE usuarios TO admin;

    CREATE DATABASE empresas OWNER admin;
    GRANT ALL PRIVILEGES ON DATABASE empresas TO admin;

    CREATE DATABASE autorizaciones OWNER admin;
    GRANT ALL PRIVILEGES ON DATABASE autorizaciones TO admin;

    CREATE DATABASE amigos OWNER admin;
    GRANT ALL PRIVILEGES ON DATABASE amigos TO admin;

    CREATE DATABASE contratos OWNER admin;
    GRANT ALL PRIVILEGES ON DATABASE contratos TO admin;

EOSQL
