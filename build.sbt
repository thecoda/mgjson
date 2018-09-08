
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.thecoda",
      scalaVersion := "2.12.6",
      version      := "0.0.1-SNAPSHOT"
    )),
    name := "mgjson",
    libraryDependencies ++= Seq(
      "org.spire-math" %% "jawn-parser" % "0.13.0", //for circe literals
      "io.circe" %% "circe-core" % "0.10.0-M2",
      "io.circe" %% "circe-generic" % "0.10.0-M2",
      "io.circe" %% "circe-parser" % "0.10.0-M2",
      "io.circe" %% "circe-literal" % "0.10.0-M2",
      "com.beachape" %% "enumeratum" % "1.5.13",
      "com.beachape" %% "enumeratum-circe" % "1.5.13",
      "com.github.julien-truffaut" %%  "monocle-core"  % "1.5.0",
      "com.github.julien-truffaut" %%  "monocle-macro" % "1.5.0",
      "org.scalatest" %% "scalatest" % "3.0.5" % Test
    )
  )
