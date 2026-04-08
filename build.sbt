ThisBuild / organization := "io.github.mtavkhelidze"
ThisBuild / publishTo := sonatypePublishToBundle.value
ThisBuild / scalaVersion := "3.8.3"
ThisBuild / sonatypeCredentialHost := Sonatype.sonatypeCentralHost
ThisBuild / version := "0.1.0"
ThisBuild / versionScheme := Some("early-semver")

lazy val fuda = (project in file("."))
  .settings(
    description := "札: Type-safe opaque UUID identity system for Scala 3",
    developers := List(
      Developer(
        id = "mtavkhelidze",
        name = "Misha Tavkhelidze",
        email = "misha.tavkhelidze@gmail.com",
        url = url("https://github.com/mtavkhelidze"),
      ),
    ),
    homepage := Some(url("https://github.com/mtavkhelidze/fuda")),
    licenses := Seq(
      "Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0.txt"),
    ),
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core" % "2.13.0",
      "org.typelevel" %% "cats-effect" % "3.7.0" % Test,
      "org.typelevel" %% "cats-effect-testing-scalatest" % "1.8.0" % Test,
      "org.scalatest" %% "scalatest" % "3.2.20" % Test,
    ),
    name := "fuda",
    scmInfo := Some(
      ScmInfo(
        url("https://github.com/mtavkhelidze/fuda"),
        "scm:git@github.com:mtavkhelidze/fuda.git",
      ),
    ),
  )
