println("Value of myGradleProperty=${project.providers.gradleProperty("myGradleProperty").getOrElse(null)}")
println("Value of mySystemProperty=${project.providers.systemProperty("mySystemProperty").getOrElse(null)}")

// This will blow up if no default value is set
val myGradleProperty: String by project.properties
println("Value of myGradleProperty: String by project.properties=${myGradleProperty}")
// This will blow up if no default value is set
println("Value of project.property(\"myGradleProperty\")=${project.property("myGradleProperty").toString()}")
println("Value of properties[\"myGradleProperty\"]=${properties["myGradleProperty"]}")
