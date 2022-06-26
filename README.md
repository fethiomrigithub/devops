# devops
Devops
pipeline {
 agent any
 stages {
 stage('build') {
 steps {
 sh "rm -rf *"
 git credentialsId: '1a7a6fae-d678-4067-8c09-89903da21a5b', url:
'git@github.com:fethiomrigithub/devops.git'
 sh 'mkdir lib'
 sh 'cd lib/ && curl -H "Accept: application/zip"
https://repo1.maven.org/maven2/org/junit/platform/junit-platform-consolestandalone/1.8.2/junit-platform-console-standalone-1.8.2.jar > junit-platformconsole-standalone-1.8.2-all.jar'
 sh 'cd src/ && javac -cp "../lib/junit-platform-consolestandalone-1.8.2-all.jar" CalculatorTest.java Runner.java'
 }
 }
 stage('run') {
 steps {
 mkdir jenkinsTest/ && cd src && java Runner >
../jenkinsTest/ShapeTest.java"
 }
 }
 stage('test') {
 steps {
 sh "cd jenkinsTest/ && echo ShapeTest"
 sh 'cd src && java -jar ../lib/junit-platform-console-standalone1.8.2-all.jar -cp "." --select-class ShapeTest --reports-dir="reports"'
 junit 'src/reports/*-jupiter.xml'
 }
 }
 }
}

