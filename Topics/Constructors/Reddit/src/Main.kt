class Site(val address: String, val foundationYear: Int)

// Write the makeReddit function here
fun makeReddit(address: String = "reddit.com", foundationYear: Int = 2005): Site {
    return Site(address, foundationYear)
}
