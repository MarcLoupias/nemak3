import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "nemak3"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJpa,
    javaJdbc,
    "mysql" % "mysql-connector-java" % "5.1.25",
    "org.hibernate" % "hibernate-entitymanager" % "4.2.1.Final",
    "com.intellij" % "annotations" % "5.1",
    "org.mockito" % "mockito-all" % "1.9.5"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here
    ebeanEnabled := false
  )

}
