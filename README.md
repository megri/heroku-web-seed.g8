# Heroku web seed for Scala

A simple web app template based on HTTP4s and Circe

## Dependencies
* SBT 0.13.15+
* Heroku CLI tools

## Usage
1. Start by creating a new project from te template: `sbt new megri/heroku-web-seed.g8`
2. Edit as desired
3. Initialize a local git repository and commit the project: `git init && git add . && git commit -m "initial commit"`
4. Bootstrap Heroku: `heroku create`
5. Push to Heroku: `git push heroku master`
