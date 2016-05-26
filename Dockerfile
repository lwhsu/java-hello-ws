FROM jetty:9.3.9
COPY target/hello-ws.war /var/lib/jetty/webapps
