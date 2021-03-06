import xerial.sbt.Pack._

name := "predictionio-process-itemrec-evaluations-topkitems"

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.1.1",
  "ch.qos.logback" % "logback-core" % "1.1.1",
  "com.github.scala-incubator.io" %% "scala-io-core" % "0.4.2",
  "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.2",
  "com.github.scopt" %% "scopt" % "3.2.0",
  "com.typesafe" % "config" % "1.0.0",
  "org.clapper" %% "grizzled-slf4j" % "1.0.1")

packSettings

packJarNameConvention := "full"

packExpandedClasspath := true

packGenerateWindowsBatFile := false

packMain := Map("topk" -> "io.prediction.evaluations.itemrec.topkitems.TopKItems")

packJvmOpts := Map("topk" -> Common.packCommonJvmOpts)
