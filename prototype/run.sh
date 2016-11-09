if [ -d 'build' ]; then
    rm -rf build
fi
mkdir build
javac -d build -sourcepath src src/App.java
java -cp build App