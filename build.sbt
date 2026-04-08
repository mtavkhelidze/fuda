ThisBuild / organization := "io.github.mtavkhelidze"
ThisBuild / version := "0.1.0"
ThisBuild / scalaVersion := "3.8.3"

ThisBuild / sonatypeCredentialHost := Sonatype.sonatypeCentralHost

lazy val fuda = (project in file("."))
  .settings(
    name := "fuda",
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core" % "2.13.0",
      "org.typelevel" %% "cats-effect" % "3.5.7" % Test,
      "org.typelevel" %% "cats-effect-testing-scalatest" % "1.6.0" % Test,
      "org.scalatest" %% "scalatest" % "3.2.19" % Test,
    ),
    licenses := Seq(
      "Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0.txt"),
    ),
    homepage := Some(url("https://github.com/mtavkhelidze/fuda")),
    scmInfo := Some(
      ScmInfo(
        url("https://github.com/mtavkhelidze/fuda"),
        "scm:git@github.com:mtavkhelidze/fuda.git",
      ),
    ),
    developers := List(
      Developer(
        id = "mtavkhelidze",
        name = "Misha Tavkhelidze",
        email = "misha.tavkhelidze@gmail.com",
        url = url("https://github.com/mtavkhelidze"),
      ),
    ),
  )
