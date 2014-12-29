from toolchainz

ADD pom.xml /springcloud-base/pom.xml
ADD src /springcloud-base/src
RUN cd /springcloud-base && \
    mvn install && \
    mvn spring-boot:run 
