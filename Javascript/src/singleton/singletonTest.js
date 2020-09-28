const singleton = require('./singleton')

var instance1 = singleton.getInstance()
var instance2 = singleton.getInstance()

console.log(instance1 === instance2)
