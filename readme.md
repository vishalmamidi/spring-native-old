## build normal image

```
./gradlew build
```
`jar generated at build/libs`

## build native image 

```
./gradlew nativeCompile
```
native image will be generated at `/home/vishal/workspace/springnative/build/`

run by 

```
./springnative
```


## setup graalVM

https://docs.oracle.com/en/graalvm/enterprise/20/docs/docs/getting-started/linux/



```
tar -xzf <graalvm-archive>.tar.gz
cd graalvm-ce-java17-22.1.0 ~/bin

```
```
export JAVA_HOME=${HOME}/bin/graalvm-ce-java17-22.1.0
export PATH=$JAVA_HOME/bin:$PATH

```

add export's to .zshrc .bashrc and source them 
