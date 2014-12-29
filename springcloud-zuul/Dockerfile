from docker_springcloudbase

ADD pom.xml /zuul/pom.xml
ADD src /zuul/src
RUN cd /zuul && \
    mvn install
