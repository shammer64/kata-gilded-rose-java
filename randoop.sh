export RANDOOP_CLASSPATH=./randoop/*
export RANDOOP_JAR=./randoop/randoop-all-4.2.7.jar:./build/classes/java/main

java -classpath $RANDOOP_JAR randoop.main.Main help gentests
#java -classpath $RANDOOP_JAR randoop.main.Main gentests --test-package com.gildedrose

