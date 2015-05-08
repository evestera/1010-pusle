set -e

if [ "x$1" = "x" ]; then
	echo "usage: $0 JavaFile.java"
	exit 1
fi

if [ "x$JAVA_HOME" = "x" ]; then
	echo "The variable JAVA_HOME must be set to use this script"
	exit 1
fi

javafile=$1
classname=${javafile%.*}

# Make header file
javac $javafile
javah -jni $classname

# Make jnilib
g++ -I$JAVA_HOME/include -I$JAVA_HOME/include/darwin -c $classname.cpp
g++ -dynamiclib -o lib$classname.jnilib $classname.o
