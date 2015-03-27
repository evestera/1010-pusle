#!/bin/bash

cd
wget https://services.gradle.org/distributions/gradle-2.3-bin.zip
unzip gradle-2.3-bin.zip
mv gradle-2.3 gradle
rm -f gradle-2.3-bin.zip

echo 'export PATH=~/gradle/bin:$PATH' >>~/.bashrc
source ~/.bashrc

gradle -v
