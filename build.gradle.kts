println("Value of myGradleProperty=${project.providers.gradleProperty("myGradleProperty").getOrElse(null)}")
println("Value of mySystemProperty=${project.providers.systemProperty("mySystemProperty").getOrElse(null)}")