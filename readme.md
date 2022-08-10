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
./spring-native
```

## running traditional jar 

<img align=center src=assets/jar1.png>  
<img align=center src=assets/jar2.png>

## running native image

<img align=center src=assets/native1.png>
<img align=center src=assets/native2.png>


## setup GraalVM

https://docs.oracle.com/en/graalvm/enterprise/20/docs/docs/getting-started/linux/



```
tar -xzf <graalvm-archive>.tar.gz
cd graalvm-ce-java17-22.1.0 ~/bin

```

```
export GRAALVM_HOME=${HOME}/bin/graalvm-ce-java17-22.1.0
export JAVA_HOME=${HOME}/bin/graalvm-ce-java17-22.1.0
export PATH=$JAVA_HOME/bin:$PATH
```

add export's to .zshrc .bashrc and source them 

