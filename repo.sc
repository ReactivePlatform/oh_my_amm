interp.repositories.update(List(
  coursier.Cache.ivy2Local,
  coursier.Cache.ivy2Cache,
  coursier.MavenRepository("file://" + scala.sys.env("HOME") + "/.m2/repository/"),
  coursier.MavenRepository("https://mirrors.huaweicloud.com/repository/maven/"),
  coursier.MavenRepository("https://repo1.maven.org/maven2/")
))
