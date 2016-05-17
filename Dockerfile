FROM jetty

COPY target/hello-ws.war /var/lib/jetty/webapps
