FROM openjdk:8 
EXPOSE 8082
ADD /build/libs/interviewpanel-ms-questionandanswer-service.jar interviewpanel-ms-questionandanswer-service.jar
ENTRYPOINT ["java","-jar","interviewpanel-ms-questionandanswer-service.jar"]


