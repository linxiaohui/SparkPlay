# SparkPlay
## REIMPLEMENT and simplified version of MOLE(an ABOC internal project)

A Spark Playground built on Play(scala)


## Requirement
	* MongoDB
	
## RUN
```
export SPARKPALY_JAR_PATH=....
export SPARK_MASTER=....
bin/sparkplay   -Dplay.crypto.secret=ae72a0edf114d8355d06b9be87794e4a85b117bb -Dhttp.port=8888
```

## Devp: 
`./sbt`
	compile
	eclipse
	run/run 8888

## `~/.sbt/repositories`
```
[repositories]
local
nexus-aliyun: http://maven.aliyun.com/nexus/content/groups/public/
typesafe: http://repo.typesafe.com/typesafe/ivy-releases/, [organization]/[module]/(scala_[scalaVersion]/)(sbt_[sbtVersion]/)[revision]/[type]s/[artifact](-[classifier]).[ext], bootOnly
sonatype-oss-releases
maven-central
sonatype-oss-snapshots
```	

## Referrence
   1. https://www.playframework.com/documentation/2.5.x/Deploying
   2. [mxgraph](https://github.com/jgraph/mxgraph)
