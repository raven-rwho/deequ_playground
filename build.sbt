name := "Simple Project"

version := "1.0"

scalaVersion := "2.11.10"

val sparkVersion = "2.4.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)
libraryDependencies += "com.amazon.deequ" % "deequ" % "1.0.4"