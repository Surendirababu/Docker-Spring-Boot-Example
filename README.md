# Docker-Spring-Boot-Example Using Play with Docker Terminal

PLAY WITH DOCKER - https://training.play-with-docker.com/beginner-linux/#Task_0

GITHUB CLONE  - git clone https://github.com/Surendirababu/Docker-Spring-Boot-Example.git
	              
GO TO DIRECTORY - cd Docker-Spring-Boot-Example

GITHUB CHECKOUT - git checkout master

DOCKER BUILD  -  docker build -f DockerFile -t babusuren1/docker-example .

DOCKER RUN     -  docker run -p 8080:8080 -d babusuren1/docker-example

DOCKER HUB LOGIN - docker login -u "babusuren1" -p "dockerhub_pwd" docker.io

DOCKER PUSH    - docker push  babusuren1/docker-example

DOCKER PULL - docker pull babusuren1/docker-example
