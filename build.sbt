scalaVersion := "3.9.0"

lazy val root = rootProject
  .settings(
    name := "IntegradoraDisc",
    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "1.3.6" % Test
    )
  )
