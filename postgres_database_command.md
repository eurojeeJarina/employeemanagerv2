# employeemanagerv2

# Login into postgres with username and password
~psql -U [username]

# Create database
~CREATE DATABASE employeemanagerv2;

~\du

~GRANT ALL PRIVILEGES ON DATABASE "employeemanagerv2" TO postgres;
~\l
~\c employeemanagerv2
