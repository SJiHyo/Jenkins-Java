FROM mdsol/java17-jre:latest
COPY target/StoreAPI.jar StoreAPI.jar
EXPOSE 6500
ENTRYPOINT ["java","-jar","StoreAPI.jar","&"]