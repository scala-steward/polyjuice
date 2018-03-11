import Dependencies._

lazy val commonSettings = Seq(
	organization := "me.mitochon",
	scalaVersion := "2.12.4",
	version := "0.1.0-SNAPSHOT",
	libraryDependencies += scalaTest % Test
)

lazy val root = project
	.in(file("."))
	.aggregate(potion)
	.settings(
		commonSettings,
	    name := "polyjuice"
	)

lazy val potion = project
	.in(file("potion"))
	.settings(
	    commonSettings,
	    name := "polyjuice-potion",
	    libraryDependencies += htsjdk
	)