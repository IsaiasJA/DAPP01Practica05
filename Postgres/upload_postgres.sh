#!/bin/bash

# Build docker image
    echo ".::::Building image::::."
    sudo docker build -t postgres11uv:latest .
# Login to docker
    docker login
# Tag image with username 
    echo ".::::Tagging image:::."
    sudo docker tag postgres1luv isaiasja/postgres11uv:latest
# Push image to dockerhub 
    echo ".:::Pushing image::::." 
    sudo docker push isaiasja/postgres11uv:latest
# Download image from dockerhub 
    echo ".::::Pulling image::::." 
    sudo docker pull isaiasja/postgres11uv