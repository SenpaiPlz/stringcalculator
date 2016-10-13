#!/bin/bash
if [ ! -d classes ];
then
	mkdir classes
fi

javac src/main/java/stringcalculator/*.java -d classes
javac -classpath "classes:lib/junit-4.11.jar" src/test/java/stringcalculator/*.java -d classes
